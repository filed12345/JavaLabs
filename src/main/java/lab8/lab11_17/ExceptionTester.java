package lab8.lab11_17;

import java.io.IOException;

public class ExceptionTester {
    public static void main(String[] args) {
        try {
            getExceptionA();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            getExceptionB();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            getExcp1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            getExcp2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getExceptionA() throws ExceptionA {
        throw new ExceptionA("Exception A");
    }

    public static void getExceptionB() throws ExceptionB {
        throw new ExceptionB("Exception B");
    }

    public static void getExcp1() throws NullPointerException {
        throw new NullPointerException("NullPointer Exception");
    }

    public static void getExcp2() throws IOException {
        throw new IOException("IOException");
    }
}
