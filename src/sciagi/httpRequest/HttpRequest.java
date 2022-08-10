package sciagi.httpRequest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class HttpRequest {

    public static enum Method {
        POST, PUT, DELETE, GET;
    }

    private URL url;
    private HttpURLConnection connection;
    private OutputStream outputStream;
    private HashMap<String, String> params = new HashMap<String, String>();

    // The constructor of the class. It takes a string as a parameter and creates a new URL object. Then it creates a new
    // HttpURLConnection object and sets the request property.
    public HttpRequest(String url) throws IOException {
        this.url = new URL(url);
        connection = (HttpURLConnection) this.url.openConnection();
        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2228.0 Safari/537.36");
    }

    /**
     * This function returns the value of the send() function.
     *
     * @return The return value is the number of bytes sent.
     */
    public int get() throws IOException {
        return this.send();
    }

    /**
     * This function sends a POST request to the server with the given data.
     *
     * @param data The data to be sent to the server.
     * @return The status code of the response.
     */
    public int post(String data) throws IOException {
        connection.setDoInput(true);
        connection.setRequestMethod(Method.POST.toString());
        connection.setDoOutput(true);
        outputStream = connection.getOutputStream();
        this.sendData(data);
        return this.send();
    }

    /**
     * This function sets the connection to do input, sets the request method to POST, sets the connection to do output,
     * and then calls the send() function.
     *
     * @return The status code of the response.
     */
    public int post() throws IOException {
        connection.setDoInput(true);
        connection.setRequestMethod(Method.POST.toString());
        connection.setDoOutput(true);
        outputStream = connection.getOutputStream();
        return this.send();
    }

    /**
     * This function sends a PUT request to the server with the data provided.
     *
     * @param data The data to be sent to the server.
     * @return The status code of the response.
     */
    public int put(String data) throws IOException {
        connection.setDoInput(true);
        connection.setRequestMethod(Method.PUT.toString());
        connection.setDoOutput(true);
        outputStream = connection.getOutputStream();
        this.sendData(data);
        return this.send();
    }

    /**
     * This function sets the connection to do input, sets the request method to PUT, sets the connection to do output, and
     * then sends the request.
     *
     * @return The status code of the response.
     */
    public int put() throws IOException {
        connection.setDoInput(true);
        connection.setRequestMethod(Method.PUT.toString());
        connection.setDoOutput(true);
        outputStream = connection.getOutputStream();
        return this.send();
    }

    /**
     * Adds a header to the request.
     *
     * @param key The name of the header.
     * @param value The value of the header.
     * @return The HttpRequest object itself.
     */
    public HttpRequest addHeader(String key, String value) {
        connection.setRequestProperty(key, value);
        return this;
    }

    /**
     * This function adds a key-value pair to the params map and returns the HttpRequest object.
     *
     * @param key The name of the parameter
     * @param value The value of the parameter.
     * @return The HttpRequest object itself.
     */
    public HttpRequest addParameter(String key, String value) {
        this.params.put(key, value);
        return this;
    }

    /**
     * Read the response from the server and return it as a string.
     *
     * @return A string of the response from the server.
     */
    public String getStringResponse() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        for (String line; (line = br.readLine()) != null; ) response.append(line + "\n");
        return response.toString();
    }

    /**
     * Read the response from the server and return it as a byte array.
     *
     * @return The response from the server.
     */
    public byte[] getBytesResponse() throws IOException {
        byte[] buffer = new byte[8192];
        InputStream is = connection.getInputStream();
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        for (int bytesRead; (bytesRead = is.read(buffer)) >= 0; )
            output.write(buffer, 0, bytesRead);
        return output.toByteArray();
    }

    /**
     * If the connection is not null, disconnect it.
     */
    public void close() {
        if (null != connection)
            connection.disconnect();
    }

    /**
     * If there are any parameters, send them, then get the response code.
     *
     * @return The HTTP status code.
     */
    private int send() throws IOException {
        int httpStatusCode = HttpURLConnection.HTTP_BAD_REQUEST;

        if (!this.params.isEmpty()) {
            this.sendData();
        }
        httpStatusCode = connection.getResponseCode();

        return httpStatusCode;
    }

    /**
     * It takes the params HashMap and converts it to a string of the form key=value&key=value&key=value..
     */
    private void sendData() throws IOException {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            result.append((result.length() > 0 ? "&" : "") + entry.getKey() + "=" + entry.getValue());//appends: key=value (for first param) OR &key=value(second and more)
        }
        sendData(result.toString());
    }

    /**
     * It writes the query to the output stream of the socket
     *
     * @param query The query to send to the server.
     * @return The HttpRequest object.
     */
    private HttpRequest sendData(String query) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        writer.write(query);
        writer.close();
        return this;
    }

}