package com.nahwu.exploration.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl {
    private static final Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);

    public void doSomething() {
        logger.info("__doSomething()");
    }
}
