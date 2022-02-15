package com.example.algorithm.algo.service;

import java.util.Scanner;

/**
 * packageName: com.example.algorithm.algo.service
 * fileName   : Feb08ServiceImpl
 * author     : HYUCK7
 * date       : 2022/02/13
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022/02/13         HYUCK7         최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {
        int[] lotto = new int[6];
        for(int i=0; i<lotto.length; i++){
            lotto[i] = (int)(Math.random()*45)+1;
            for(int j=0; j < i; j++){
                if(lotto[i] == lotto[j])
                    i--;
            } System.out.println("로또 랜덤 숫자" + lotto[i]);
        }
    }

    @Override
    public void gugudan(Scanner scanner) {
        /** author : 유재혁
         *  date : 2022-02-08
         *  desc : 세 개의 for문을 사용합니다. 첫 번째 for문은 구구단표의 틀을 만들어 줄 '단'의 형식을 만들어줍니다.
         *         두 번째 for문은 뒤에 곱하는 값을 나타냅니다. 1부터 9까지 증감하도록 만들어줍니다. 1을 가지고 내려가, 곱하는 수가 됩니다.
         *         세 번째 for문은 int k = i 를 통해서, k는 2로 시작합니다. 곱해지는 수가 됩니다.
         *         3개의 loop을 사용한 이유는 loop이 해당 범위에 도달할 때까지 계속 loop한다는 특징을 이용해, 구구단표를 만들기 위함입니다.
         *
         *         구구단표의 특성상 2단부터 5단까지는 위에 아래는 나머지 단을 나타내기 위해서, 마지막 for문에서 i=2를 이용해
         *         k에 2를 주고, k<i+4 = (k<6)으로 고정하여, 5단까지만 먼저 출력하도록 만들었습니다.
         *         for문은 초기화값으로 실행하여, 조건식을 확인하고, { }의 값을 넣고 증감식을 받은 뒤, 다시 조건식을 확인합니다.
         *         k*j이므로, k의 값이 1 증가했습니다. 2x1 다음 3x1이 되었습니다. 이후, 4x1, 5x1이 될 것이고, k<6이므로,
         *         두 번째 loop으로 돌아갑니다. j가 증감되었고, 곱하는 수는 2가 됩니다. 다시 세 번째 반복문이 실행되는 것이므로,
         *         k=i -> k= 2가 됩니다. j=2이므로 2x2,.. 5x2까지 진행한 후, 다시 올라가 곱하는 수를 계속 증감합니다.
         *         세 번째 반복문이 6이 되어, 조건식을 만족하지 못하고, j가 10이 되어 조건식을 만족하지 못하게 되면, 첫 번째 반복문으로 돌아갑니다.
         *         첫 번째 반복문의 증감식인 i+=4 'i는 4를 더한 값과 같다'라고 증감해주고, 다시 i=6인 상태부터 루프를 시작합니다.
         *         두 번째, 세 번째 반복문을 위 동일한 형식으로 진행시킨 뒤, 다시 첫 번째 반복문으로 돌아오게 된다면 i의 조건인 i<10을 넘지 못하게
         *         되므로 세 반복문은 모두 종료하고, 구구단표를 완성합니다. (두 개의 루프를 두 개 만듬을 통해서도 구구단표를 만들 수 있으나,
         *         세 개의 반복문이 더 알고리즘이 간략하므로 사용했습니다.)
         *
         */
        for(int i=2; i<10; i+=4){
            for(int j=1; j<10; j++){
                for(int k=i; k<i+4; k++){
                    System.out.print(k + "X" + j + "="+(k*j)+"\t");
                }
                System.out.print("\n");
            }
            System.out.println("\n");



        }




    }
}
