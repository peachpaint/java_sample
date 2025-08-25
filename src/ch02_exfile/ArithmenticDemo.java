package ch02_exfile;//팩키지는 소문자로 작성

public class ArithmenticDemo { //클래스 명은 첫 글자만 대문자, 단어의 조합이면 각 단어의 첫 글자마다 대문자 작성

	public static void main(String[] args) {
		long l = 100L;//long -> 64byte
		int i = 10;//int -> 4byte
		long result = l + i;//저장 공간이 더 큰 것에 맞춰 작성
		System.out.printf("%d 와 %d 의 + 연산 결과는 %d 입니다. \n", l,i,result);//print(f) : 포멧 명시자를 "" 안에 먼저 작성하고 입력 데이터를 작성->포멧을 지정하여 출력
		
		double d = 100.0; //double -> 64byte
		int i1 = 10;
		double result1 = d +i1; 
		System.out.printf("%f 와 %d 의 + 연산 결과는 %f 입니다. \n", d, i1, result1); //실수와 정수의 연산을 출력시 실수로 출력
		
		int a = 1_000;//지정 가능 데이터 값보다 큰 단위를 대입할 때 _(언더바)를 사용하여 지정, 작은 타입에서 큰타입으로는 작성하지 않아도 자동으로 타입아 변환된다
		int b = 2_000; 
		long res = (long)a*b;//a,b의 저장 타입은 지정하기를 int로 했기 때문에 long타입으로 바꾸려면 a,b중 하나의 앞에 (long)을 작성해서 타입을 변화 시켜야 됨
		System.out.println(res);
		
		int apple = 1;
		double piece = 0.1;
		int number = 7;
		double res2 = apple - piece * number;
		System.out.println(res2);//연산자는 우선 순위에 따라 진행되며, 정수와 실수 데이터값의 계산은 정확하게 나오지 않을 수 있음
		System.out.println(3.14f + 1); //float 즉 f는 연산 값이 제대로 나오지 않을 수도 있음
		
		int zero = 0;
		double zero1 = 0.0;
		System.out.println(5 / zero1 + 100);
		System.out.println(5 % zero1 + 100);// %나머지 연산자
	
		int res3 = 4/3;
		double res6=(double)4/3;
		System.out.println(res3);//정수 타입으로 변수를 지정해서 정수만 출력
		System.out.println(res6);//실수 타입으로 지정해서 표련가능한 실수부분까지 출력됨

		int three = 3;
		int res4 = three % 2;
		System.out.println(res4);
		int four = 4;
		int res5 = four % 2;
		System.out.println(res5);
	}

}
