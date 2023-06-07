package ch04.sec01;

public class BreakOutterExample {
    public static void main(String[] args) throws Exception{
        Outter: for(char upper='A'; upper<='Z'; upper++) {
        for(char lower='a'; lower<='z'; lower++) {
            System.out.println(upper + "-" + lower);
            if(lower=='9') {
                break Outter;
            }
        }
        }
        System.out.println("프로그램 실행 종료");
    }
}
