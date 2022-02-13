package com.example.algorithm.algo.controller;

import com.example.algorithm.algo.service.Feb07Service;
import com.example.algorithm.algo.service.Feb07ServiceImpl;
import com.example.algorithm.algo.service.Feb08Service;
import com.example.algorithm.algo.service.Feb08ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.algorithm.algo.controller
 * fileName   : AlgoController
 * author     : HYUCK7
 * date       : 2022/02/13
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/13         HYUCK7         최초 생성
 */
public class AlgoController {
    Feb07Service feb07Service = new Feb07ServiceImpl();
    Feb08Service feb08Service = new Feb08ServiceImpl();
        public void execute (Scanner scanner){
            while (true) {
                System.out.println("MENU : 0. EXIT 1. Feb06Service 2.Feb07Service 3.Feb08Service 4. Feb10Sevice");
                switch (scanner.next()) {
                    case "0":
                        System.out.println("EXIT");
                        return;
                    case "1":
                        break;
                    case "2":
                        System.out.println("\n0.EXIT \n1.주사위 \n2. 가위바위보 \n3. 소수 구하기 \n4.윤년과 평년 \n 5.임의의 숫자 맞추기");
                        switch (scanner.next()) {
                            case "1":
                                feb07Service.dice(scanner);
                                break;
                        }
                    case"3":
                        System.out.println("\n0.EXIT \n1. 로또 번호 \n2. 야구 게임 \n3. Booking \n4. 계좌 \n5. 구구단");
                    switch (scanner.next()) {
                        case "1": break;
                        case "5": feb08Service.gugudan(scanner);
                    }
                        }
                }
            }
        }

