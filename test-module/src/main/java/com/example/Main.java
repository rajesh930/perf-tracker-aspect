package com.example;

import com.ontic.perf.aspect.Track;
import com.ontic.perf.tracker.PerfStats;

/**
 * @author rajesh
 * @since 21/02/25 15:24
 */
public class Main {
    public static void main(String[] args) {
        measure();
    }

    private static void measure() {
        System.out.println("Hello world 4!");
        PerfStats perfStats = PerfStats.startNew(Thread.currentThread().getName());
        try {
            m2();
            m3();
            m4();
            m5();
            m6();
            m7();
            m8();
            m9();
            m10();
            m11();
            m12();
            m13();
            new Test1().m();
            new Test2().m();
        } finally {
            perfStats.stop();
        }
        System.out.println(perfStats);
    }

    @Track
    private static void m2() {
        System.out.println("Hello world m2!");
    }

    @Track
    private static void m3() {
        System.out.println("Hello world m3!");
    }

    @Track
    private static void m4() {
        System.out.println("Hello world m2!");
    }

    @Track
    private static void m5() {
        System.out.println("Hello world m3!");
    }

    @Track
    private static void m6() {
        System.out.println("Hello world m2!");
    }

    @Track
    private static void m7() {
        System.out.println("Hello world m3!");
    }

    @Track
    private static void m8() {
        System.out.println("Hello world m2!");
    }

    @Track
    private static void m9() {
        System.out.println("Hello world m3!");
    }

    @Track
    private static void m10() {
        System.out.println("Hello world m2!");
    }

    @Track
    private static void m11() {
        System.out.println("Hello world m3!");
    }

    @Track
    private static void m12() {
        System.out.println("Hello world m2!");
    }

    @Track
    private static void m13() {
        System.out.println("Hello world m3!");
    }
}