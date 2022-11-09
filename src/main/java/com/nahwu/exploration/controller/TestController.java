package com.nahwu.exploration.controller;

import com.nahwu.exploration.entity.TestObject;
import com.nahwu.exploration.service.TestService2Impl;
import com.nahwu.exploration.service.TestServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestServiceImpl testService;

    @Autowired
    private TestService2Impl testService2;

    @PostMapping("/v1/test/api/echo")
    @Operation(summary = "Test API and reply with the same request payload")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "API working",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = TestObject.class))})})
    public ResponseEntity<?> testApiEcho(
            @RequestBody TestObject testObject) {
        return new ResponseEntity<>(testObject, HttpStatus.OK);
    }

    @PostMapping("/v1/test/api/length")
    @Operation(summary = "Test API and reply with the request length")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "API working",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Integer.class))})})
    public ResponseEntity<?> testApiLength(
            @RequestBody TestObject testObject) {
        return new ResponseEntity<>(testObject.getPayload().length(), HttpStatus.OK);
    }
}
