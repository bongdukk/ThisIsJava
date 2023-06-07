package ch04.sec01;
import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //scanner 생성
        boolean run = true; // while 문의 조건식을 위한 변수 선언, 처음 run 변수의 값은 true 이므로 while 문은 무한반복한다.
        int speed = 0;

        while(run) {
            System.out.println("-----------------------");
            System.out.println("1. 종속 | 2. 강속 | 3. 중지");
            System.out.println("-----------------------");
            System.out.println("선택 :");

            String strNum = scanner.nextLine(); //키보드에서 입력한 내용을 읽음

            if (strNum.equals("1")) {
                speed ++;
                System.out.println("현재 속도=" + speed);
            } else if(strNum.equals("2")) {
                speed --;
                System.out.println("현재 속도= " + speed);
            } else if(strNum.equals(3)) { // 3을 입력하면 run 변수의 값이 flase가 되어 while 문의 조건식이 false가 된다. 이때 무한 반복을 중지하고
                //while 문을 빠져나간다.
                run = false;   //while 문의 조건식을 false로 만듦
            }
        }

        System.out.println("프로그램 종료");

    }
}
