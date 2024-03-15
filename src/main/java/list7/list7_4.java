package list7;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

class Grep {
    public static void main(String[] args){
        if ((args.length == 0) || (args.length > 2)){
            System.out.println("Usage: java Grep <образец> <имя файла>");
            System.exit(0);
        } // if
        try{
            FileInputStream fis = new FileInputStream(args[1]);
            GrepInputStream gis = new GrepInputStream((InputStream) fis, args[0]);
            String line;
            for (;;) {
                line = gis.readLine();
                if (line == null) break;
                System.out.println(line);
            } // for
            gis.close();
        } // try
        catch (IOException ioe){
            System.err.println(ioe.getMessage());
        } // catch
    } // main
} // class Grep
