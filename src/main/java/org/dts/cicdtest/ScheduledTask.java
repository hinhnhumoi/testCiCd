package org.dts.cicdtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ScheduledTask {

    @Scheduled(fixedRate = 1000)
    public void logMessage() {
        log.info("Logging .......");
    }
}
