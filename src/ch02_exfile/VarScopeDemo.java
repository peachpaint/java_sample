package ch02_exfile;

public class VarScopeDemo {

	public static void main(String[] args) {
		int var1 = 10;
		System.out.println("main ==> " + var1);
		if (true) {
			int var2 = 20;
			System.out.println("if ==> " + var1);
			System.out.println("if ==> var2" + var2);
		}
		for (int i = 0; i < 2; i++) {// for(초기식;조건문;증감식)
			int var3 = 30;
			System.out.println("for ==>" + var1);
			System.out.println("if ==> ");
		}
	}

}
