package org.dts.cicdtest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CicdtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdtestApplication.class, args);

	}

}
