package list7;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

class Listing7_2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\file.bin");
        InputStream is = new FileInputStream(file);
        long length = file.length();
        if (length > Integer.MAX_VALUE) {
            throw new IOException("Файл " + file.getName() + " слишком длинный!");
        }
        byte[] bytes = new byte[(int) length];
        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
            offset += numRead;
        }
        if (offset < bytes.length) {
            throw new IOException("Не удалось прочитать файл " + file.getName() + " целиком.");
        }
        is.close();
    } // main
} // class