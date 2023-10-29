package com.tutorial.scheduledconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class MyScheduledTask {

    @Scheduled(timeUnit = TimeUnit.SECONDS, fixedRate = 10L)
    public void helloScheduled(){

        log.info("Hello World");
    }

}
