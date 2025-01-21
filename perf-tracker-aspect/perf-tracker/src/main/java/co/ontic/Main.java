package co.ontic;

import co.ontic.perf.tracker.Perf;

/**
 * @author rajesh
 * @since 21/01/25 19:41
 */
public class Main {
    public static void main(String[] args) throws Exception {
        method1("aefsd");
        method2("aefsd", "knfkl", "jfbjkfb");
    }

    @Perf("m1")
    private static void method1(String asd) {
        System.out.println(asd);
    }

    @Perf
    private static void method2(String a, String b, String c) throws Exception {
        System.out.println("method2 "+a+" "+b+" "+c);
        Thread.sleep(1000);
    }
}
