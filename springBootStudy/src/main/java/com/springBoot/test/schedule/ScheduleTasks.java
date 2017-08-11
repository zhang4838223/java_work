package com.springBoot.test.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTasks {

    private Logger logger = LoggerFactory.getLogger(ScheduleTasks.class);

    @Scheduled(fixedDelay = 5000L)
    public void fixDelayTest(){
        logger.info("fixDelay test running!");
    }

    @Scheduled(fixedRate = 5000L)
    public void fixRateTest() {
        logger.info("fixRate test running!");
    }

    public void initDelayTest() {
        logger.info("initDelay Test running!");
    }

    @Scheduled(cron = " */2 * * * * *")
    public void cornTest() {
        logger.info("cornTest Test running!");
    }
}
