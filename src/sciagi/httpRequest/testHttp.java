package sciagi.httpRequest;

import java.net.HttpURLConnection;

public class testHttp {

    public static void main(String[] args){

        //Simple crash usage

        try {
            String url = "someUrl";
            // Sending a POST request to the server with parameter "key" and value "val"
            HttpRequest request = new HttpRequest(url);
            request.addParameter("key", "val");
            int httpCode = request.post();
            System.out.println(httpCode);
            // Checking if the request was successful. If it was, it prints the response. If it wasn't, it prints the error
            // code.
            if (HttpURLConnection.HTTP_OK == httpCode){
                System.out.println(request.getStringResponse());
            } else {
                System.out.println(httpCode);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
