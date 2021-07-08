package ua.com.alevel;

import java.io.*;

public class ReadWriteFile {

    public void write1() {
        try(
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FileType.FILE_PATH.getPath(), true));
                BufferedReader bufferedReader = new BufferedReader(new FileReader(FileType.FILE_PATH.getPath()))
        ) {
            bufferedWriter.write("\n");
            bufferedWriter.write("test7");
            bufferedWriter.flush();
            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write() {

        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(FileType.FILE_PATH.getPath(), true));
            bufferedWriter.write("\n");
            bufferedWriter.write("test5");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(FileType.FILE_PATH.getPath()));
//            String s = bufferedReader.readLine();
//            System.out.println("s = " + s);
//            s = bufferedReader.readLine();
//            System.out.println("s = " + s);
            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }


//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            String s = bufferedReader.readLine();
//            System.out.println("s = " + s);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



//        Reader reader;
//        Writer writer;
//
//        InputStreamReader inputStreamReader;
//
//        FileReader fileReader;
//        FileWriter fileWriter;
//
//        BufferedReader bufferedReader;
//        BufferedWriter bufferedWriter;
//
//        InputStream inputStream;
//        OutputStream outputStream;
    }
}
