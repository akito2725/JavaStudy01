package test;

public class 구구단 {
	public static void main(String[] args) {

//for(반복문)을 활용하여 1~9 까지의 변수를 지정하였음.
		for (int a = 1; a < 10; a++) {

//다시 반복문(for)를 활용하여 곱의 변수를 계산 (1 ~ 9 까지)
			for (int b = 1; b < 10; b++) {
//결과 값 출력.
				System.out.println(a + "x" + b + "=" + String.format("%2s", (b*a)));
			}
			//표시될때 구분시키기 위한 라인 추가
			System.out.println();
		}
	}
}
