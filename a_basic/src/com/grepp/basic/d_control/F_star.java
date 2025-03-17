package com.grepp.basic.d_control;

import java.util.Scanner;

public class F_star {

    public static void main(String[] args) {
//        System.out.println("=== 1번 ===");
//        q1();
//        System.out.println();
//
//        System.out.println("=== 2번 ===");
//        q2();
//        System.out.println();
//
//        System.out.println("=== 3번 ===");
//        q3();
//        System.out.println();
//
//        System.out.println("=== 4번 ===");
//        q4();
//        System.out.println();
//
//        System.out.println("=== 5번 ===");
//        q5();
//        System.out.println();
//
//        System.out.println("=== 6번 ===");
//        q6();
//        System.out.println();

        System.out.println("=== 7번 ===");
        q7();

    }
    //다이아몬드 문제 2번째 방법
    private static void q7() {
        //이등변 삼각형 / 거꾸로 된 삼각형 2개를 나눠서 진행
        //공백은 4-3-2-1-0으로
        /* num-> 입력값
        ---------------top--------------
        x : 1부터 입력값까지 1씩 증가하는 수열
        별 : 2*x-1
        공백 : num - x

        --------------bottom------------
        y : 1부터 입력값-1 까지 1씩 증가하는 수열
        별 : 2*(num-y)-1
        공백 : y
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("입력 : ");
        int num = scan.nextInt();

        //top 삼각형 부분
        for(int x =1;x<=num; x++){
            for(int i=0;i<num-x;i++){
                System.out.print(" ");
            }
            for(int i=0;i<2*x-1;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        //bottom 삼각형 부분
        for(int y=1;y<num;y++){
            for(int i=0;i<y;i++){
                System.out.print(" ");
            }
            for(int i=0;i<2*(num-y)-1;i++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void q6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();

        //왼쪽 5개 오른쪽 5개 따로따로
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            for(int j=0;j<num-1-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        //거꾸로 다시 출력
        for(int i=num-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<num-1-i;j++){
                System.out.print(" ");
            }
            //오른쪽
            for(int j=0;j<num-1-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void q5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print('*');
            }

            System.out.println();
        }
        //거꾸로 추가
        for(int i= num-2;i>=0;i--){
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void q4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();

        //공백
        for(int i=0;i<num;i++){
            //num 6이니까 6번 반복해야함
            for(int j=0;j<num-i-1;j++){
                //1번 5개 / 2번 3개 / 3번
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                // 1 3 5 7 9 11 ~~~~
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void q3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();
        //왼쪽부터 찍기 
        //그 후에 숫자 대입 후 오른쪽 별 찍기
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.printf("%d", i + 1);
            //앞에 * 숫자만큼 더 빼줘야함
            //일단 로직은 숫자가 들어가니 *출력 하나씩 빼주기
            //그 다음에 앞에 별만큼 - 해줘야하는게 i
            for (int j = 0; j < num-1-i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void q2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("num : ");
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private static void q1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("row : ");
        int row = sc.nextInt();
        System.out.print("col : ");
        int col = sc.nextInt();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
