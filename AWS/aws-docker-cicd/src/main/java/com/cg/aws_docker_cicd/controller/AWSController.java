package com.cg.aws_docker_cicd.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/aws")
public class AWSController {



    @GetMapping("/welcome")
    public ResponseEntity<String> welcomeAWS() {
        String aws = "Welcome to AWS ECR";

        return new ResponseEntity<>(aws, HttpStatus.OK);
    }
}
