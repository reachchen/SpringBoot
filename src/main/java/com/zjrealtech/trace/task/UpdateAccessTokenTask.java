package com.zjrealtech.trace.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

/**
 * Created by longtaiye on 2017/12/2.
 */
@Slf4j
@Component
public class UpdateAccessTokenTask {

    private static final int delayTime90 = 1000;

    @Scheduled(fixedDelay=delayTime90)
    public void execute () {
        log.info("execute update token");

        Long currentTime = System.currentTimeMillis();

        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm");
        String nowtime = format.format(currentTime);
        System.out.println("---------定时任务处理-----------");

        log.info("current time is " + nowtime);

    }
}
