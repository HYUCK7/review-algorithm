package com.example.algorithm;

import com.example.algorithm.algo.controller.AlgoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AlgorithmApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlgorithmApplication.class, args);
        AlgoController algoController = new AlgoController();
        Scanner scanner = new Scanner(System.in);
        algoController.execute(scanner);
    }

}
