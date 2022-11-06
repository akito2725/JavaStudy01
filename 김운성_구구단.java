public class 구구단 {
	public static void main(String[] args) {

//for(반복문)을 활용하여 1~9 까지의 변수를 지정하였음.
		for (int a = 1; a < 10; a++) {
//시스템상에 해당 문구를 출력.
			System.out.println(a + "단을 시작.");

//다시 반복문(for)를 활용하여 곱의 변수를 계산 (x1 ~ x9 까지)
			for (int b = 1; b < 10; b++) {
//결과 값 출력.
				System.out.println(a + "x" + b + "=" + a * b);
			}
			System.out.println();
		}
	}
}
