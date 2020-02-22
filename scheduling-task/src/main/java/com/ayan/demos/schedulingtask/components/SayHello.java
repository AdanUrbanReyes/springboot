package com.ayan.demos.schedulingtask.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class SayHello {

    private static final Logger LOG = LoggerFactory.getLogger(SayHello.class);
    private static final SimpleDateFormat TIMEFORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        LOG.info("The time is now {}", TIMEFORMAT.format(new Date()));
    }

}
