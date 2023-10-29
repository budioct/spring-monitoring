package com.tutorial.scheduledconfig;

import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

@Slf4j
@Component
public class MyScheduledTask {

    AtomicLong atomicLong = new AtomicLong(0);

    // membuat micrometer costum
    @Autowired
    private MeterRegistry meterRegistry; // bean dari micrometer.. sudah ada di @configuration CompositeMeterRegistryConfiguration dengan type= AutoConfiguredCompositeMeterRegistry, bean= compositeMeterRegistry

    @Scheduled(timeUnit = TimeUnit.SECONDS, fixedRate = 10L)
    public void helloScheduled(){

        meterRegistry.counter("my.scheduled.task").increment(); // hanya bisa increment atau decrement.. jika ingin decrement param -1 pada method increment(-1)
        log.info("counter-{} ,Hello World", atomicLong.incrementAndGet());
    }

}
