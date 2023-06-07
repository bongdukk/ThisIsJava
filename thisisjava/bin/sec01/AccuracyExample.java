package ch03.sec01;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		double result = apple - number*pieceUnit;
		//이때 result 변수의 값은 정확히 0.3이 되지 않는다. 따라서 정수연산으로 변경해서 계산해야
		System.out.println("사과 1개에서 남은 양:" + result);
		

	}

}
