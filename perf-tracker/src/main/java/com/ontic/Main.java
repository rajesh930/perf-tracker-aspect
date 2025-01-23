package com.ontic;

import com.ontic.perf.aspect.Track;
import com.ontic.perf.tracker.Perf;
import com.ontic.perf.tracker.PerfStats;

/**
 * @author rajesh
 * @since 21/01/25 19:41
 */
public class Main {
    public static void main(String[] args) throws Exception {
        PerfStats perfStats = PerfStats.startNew("Testing");
        try {
            method1("aefsd");
            method2("aefsd", "knfkl", "jfbjkfb");
            method2("aefsd", "knfkl", "jfbjkfb");
            method2("aefsd", "knfkl", "jfbjkfb");
            method2("aefsd", "knfkl", "jfbjkfb");
            try (Perf ignored = Perf.inDB("mongo_db_collection")) {
                Thread.sleep(100);
            }
            try (Perf ignored = Perf.inDB("es_index")) {
                Thread.sleep(120);
            }
            try (Perf ignored = Perf.inDB("mongo_db_collection")) {
                Thread.sleep(100);
            }
            try (Perf ignored = Perf.inDB("es_index")) {
                Thread.sleep(120);
            }
            try (Perf ignored = Perf.inDB("mongo_db_collection")) {
                Thread.sleep(100);
            }
            try (Perf ignored = Perf.inDB("es_index")) {
                Thread.sleep(120);
            }
//            nested(1);
        } finally {
            perfStats.stop();
        }
        System.out.print(perfStats);
        System.out.println("done");
    }

    @Track("m1")
    private static void method1(String asd) throws Exception {
        System.out.println(asd);
        method3("m3", "afljf", "sldjkd");
    }

    @Track
    private static void method2(String a, String b, String c) throws Exception {
        System.out.println("method2 " + a + " " + b + " " + c);
        method3("m3", "afljf", "sldjkd");
        Thread.sleep(100);
    }

    @Track("m3")
    private static void method3(String a, String b, String c) throws Exception {
        System.out.println("method2 " + a + " " + b + " " + c);
        Thread.sleep(100);
    }

    @Track()
    private static void nested(int i) throws Exception {
        if (i > 993) {
            return;
        } else {
            nested(i + 1);
        }
    }
}
