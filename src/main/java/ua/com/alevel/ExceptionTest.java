package ua.com.alevel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionTest {

    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public void exceptionHelp7() {

        Pattern pattern = Pattern.compile("[^0-9]");
        String s = "1234u";
        Matcher matcher = pattern.matcher(s);
        System.out.println("matcher = " + matcher.matches());
        System.out.println("s = " + s.matches("\\d+"));

        matcher = VALID_EMAIL_ADDRESS_REGEX.matcher("te/st@gmail.com");
        System.out.println("matcher = " + matcher.find());


        try {
            new User().getBirthDay().getTime();
            int a = 10 / 0;
        } catch (ArithmeticException exception) {
            System.out.println("ArithmeticException = " + exception.getMessage());
        } catch (NullPointerException exception) {
            System.out.println("NullPointerException = " + exception.getMessage());
        }
    }

    public void exceptionHelp6() {
        try {
            int a = 10 / 0;
            new User().getBirthDay().getTime();
        } catch (ArithmeticException | NullPointerException exception) {
            if (exception instanceof ArithmeticException) {
                System.out.println("ArithmeticException = " + exception.getMessage());
            }
            if (exception instanceof NullPointerException) {
                System.out.println("NullPointerException = " + exception.getMessage());
            }
        }
    }

    public void exceptionHelp5() {
        try {
            int a = 10 / 0;
            new User().getBirthDay().getTime();
        } catch (RuntimeException exception) {
            System.out.println("exception = " + exception.getMessage());
        }
    }

    public void exceptionHelp4() {
        try {
//            System.exit(1000);
            new User().getBirthDay().getTime();
        } catch (NullPointerException exception) {
            System.out.println("exception = " + exception.getMessage());
            throw new NullPointerException("idiot");
        } finally {
            System.out.println("ExceptionTest.exceptionHelp4");
        }
    }

    public void exceptionHelp1() throws ArithmeticException {
        try {
            exceptionHelp2();
        } catch (ArithmeticException exception) {
            System.out.println("exception = " + exception.getMessage());
        }
        System.out.println("ExceptionTest.exceptionHelp1");
    }

    public void exceptionHelp2() throws ArithmeticException {
        exceptionHelp3();
    }

    public void exceptionHelp3() throws ArithmeticException {
        int a = 10 / 0;
    }
}
