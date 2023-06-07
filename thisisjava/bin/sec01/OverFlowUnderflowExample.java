package ch03.sec01;

public class OverFlowUnderflowExample {

	public static void main(String[] args) {
		 byte var1 = 125;
		 for(int i=0; i<5; i++) { //{ } 를 5번 반복 실행
			 var1++; //++연산은 var1의 값을 1증가시킨다.
			 System.out.println("var1:" + var1);
			 
		 }
		 
		 System.out.println("-----------------");
		 
		 byte var2 = -125;
		 for(int i=0; i<5; i++) { //{} 를 5번 반복 실행
			 var2--; // --연산은 var2의 값을 1감소시킨다.
			 System.out.println("var2:" + var2);
		 }
	}

}


//int 타입에서 오버 혹은 언더플로우가 발생할 가능성이 있다면 long타입으로 연산해야함