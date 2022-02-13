package com.example.algorithm.algo.service;

import java.util.Scanner;

/**
 * packageName: com.example.algorithm.algo.service
 * fileName   : Feb07ServiceImpl
 * author     : HYUCK7
 * date       : 2022/02/13
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/13         HYUCK7         최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service {
        @Override
        public void dice (Scanner scanner){
            /**
             * author : 유재혁
             * date: 2022/02/07
             * desc: 컴퓨터와 사용자간의 주사위의 나온 수를 비교하는 게임입니다.
             *      Math.Random 메소드를 통해 0 이상 1 미만의 실수 중 아무런 수나 뽑아줍니다.
             *      0과 1 사이 수는 double 타입이므로, (int)를 통한 타입 변환이 필요합니다. 주사위의 수는 2.0 처럼 소수점을 나타내지 않기
             *      때문입니다. 0과 1 사이의 정수인 랜덤값에 6을 곱해, 0과 6의 값을 뽑으며, 1까지 더 해주어 1 이상 7 미만의 주사위의 값만
             *      나타내도록 만들어줍니다.
             *      이후, game의 스타트 버튼을 구상하기 위해서, if문의 조건을 입력값이 0 일 경우, 실행되도록 합니다.
             *      사용자에게 사용자의 주사위 수와 컴퓨터의 주사위를 보여주고, 다음 if문을 통해서, 컴퓨터의 주사위 수와 사용자의 주사위를 비교하여
             *      결과를 보여주도록 만들었습니다. (switch문의 case를 활용한 주사위 게임도 가능합니다.)
             */
            int userDice = (int) (Math.random() * 6) + 1;
            int comDice = (int) (Math.random() * 6) + 1;

            System.out.println("숫자 0 입력 시 주사위를 돌립니다.");
            if (0 == scanner.nextInt()) {
                System.out.println("사용자의 주사위: " + userDice);
                System.out.println("Computer의 주사위: " + comDice);
            }

            if (userDice > comDice) {
                System.out.println("사용자가 이겼습니다 !");
            } else if (userDice == comDice) {
                System.out.println("비겼습니다 !");
            } else if (userDice < comDice) {
                System.out.println("컴퓨터가 이겼습니다!");
            }
        }
    }
