package ua.com.alevel;

import java.io.IOException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ArithmeticException {
//        new CrudFile().createFile(FileType.DIRS_PATH.getPath() + "/" + FileType.FILE_PATH.getPath());
//        new CrudFile().createDir(FileType.DIR_PATH.getPath());
//        new CrudFile().createDirs(FileType.DIRS_PATH.getPath());


//        ExceptionTest exceptionTest = new ExceptionTest();
//        exceptionTest.exceptionHelp7();

        ReadWriteFile readWriteFile = new ReadWriteFile();
        readWriteFile.write1();

        System.out.println("Main.main");

        Throwable throwable;

        Exception exception;
        RuntimeException runtimeException;
        IOException ioException;
        SQLException sqlException;

        Error error;
        StackOverflowError stackOverflowError;
        OutOfMemoryError outOfMemoryError;

//      NullPointerException;
//        new User().getBirthDay().getTime();

//        ArithmeticException
//        int a = 10 / 0;
    }
}
