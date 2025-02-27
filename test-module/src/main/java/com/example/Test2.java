package com.example;

import com.ontic.perf.aspect.Track;

/**
 * @author rajesh
 * @since 24/02/25 09:57
 */
public class Test2 {
    @Track
    public void m() {
        System.out.println("Test2 m");
    }
}
