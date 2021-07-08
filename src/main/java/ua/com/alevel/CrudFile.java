package ua.com.alevel;

import java.io.File;
import java.io.IOException;

public class CrudFile {

    public void createFile(String path) {
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        System.out.println("absolutePath = " + absolutePath);
        boolean exists = file.exists();
        System.out.println("exists = " + exists);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        exists = file.exists();
        System.out.println("exists = " + exists);
    }

    public void createDir(String path) {
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        System.out.println("absolutePath = " + absolutePath);
        boolean exists = file.exists();
        System.out.println("exists = " + exists);
        file.mkdir();
        exists = file.exists();
        System.out.println("exists = " + exists);
    }

    public void createDirs(String path) {
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        System.out.println("absolutePath = " + absolutePath);
        boolean exists = file.exists();
        System.out.println("exists = " + exists);
        file.mkdirs();
        exists = file.exists();
        System.out.println("exists = " + exists);
    }
}
