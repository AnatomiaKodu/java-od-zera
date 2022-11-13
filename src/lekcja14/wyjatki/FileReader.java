package lekcja14.wyjatki;

import java.io.IOException;

class FileReader {

    void readFile() throws IOException {
        checkIfExist();
    }

    void checkIfExist() throws IOException {
        throw new IOException("File read error");
    }
}
