package ch04.sec01;

public class ContinueExample {
    public static void main(String[] args) throws Exception{
        for(int i=1; i<=10; i++) {
            if(i%2 != 0) { //2로 나눈 나머지가 0이 아닐 경우, 즉 홀수일 경우
                continue;
            }
            System.out.print(i + " "); //홀수는 실행되지 않는다.
        }

    }
}
