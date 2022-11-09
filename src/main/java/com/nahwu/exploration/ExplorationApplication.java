package com.nahwu.exploration;

import com.nahwu.exploration.service.TestServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExplorationApplication {
	private static final Logger logger = LoggerFactory.getLogger(ExplorationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ExplorationApplication.class, args);

		logger.info("__Started up");
	}
}
