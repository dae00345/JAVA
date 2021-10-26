public class MethodReturnValue{
	public static void main(String[] args){


		System.out.println(calculator(114,"+",46));

	}
	static float calculator(float num1, String operasi, float num2){
		switch(operasi){
			case "+":
				return num1 + num2;
			case "-":
				return num1 - num2;
			case "*":
				return num1 * num2;
			case "/":
				return num1/num2;
			default:
				return 0;
		}
	}
}