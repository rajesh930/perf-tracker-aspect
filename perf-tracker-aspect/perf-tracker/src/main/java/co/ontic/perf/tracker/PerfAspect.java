package co.ontic.perf.tracker;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author rajesh
 * @since 21/01/25 20:11
 */
@Aspect
public class PerfAspect {
    @Around("execution(* *(..)) && @annotation(perf)")
    public void track(ProceedingJoinPoint joinPoint, Perf perf) throws Throwable {
        long start = System.nanoTime();
        joinPoint.proceed();
        long end = System.nanoTime();
        String name = perf.value().isEmpty() ? joinPoint.getSignature().toShortString() : perf.value();
        System.out.println(name + " took " + (end - start) + " ns");
    }
}
