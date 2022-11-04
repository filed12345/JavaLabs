package lab8;

public class lab11_20 {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            StackTraceElement[] traceElements = e.getStackTrace();
            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");
            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }


    }

    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown in method2");
    }

    public static void someMethod() throws Exception {
        someMethod2();
    }
}
