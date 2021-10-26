public class SwitchCase{
	public static void main(String[] args){

		var operasi = "*";
		var num1 = 31;
		var num2 = 55;
		int hasil;

		switch(operasi){
			case "-":
				hasil = num1 - num2;
				break;
			case "+":
				hasil = num1 + num2;
				break;
			case "/":
				hasil = num1 + num2;
				break;
			case "*":
				hasil = num1 * num2;
				break;
			default:
				hasil = 0;
				break;
		}
		System.out.println("Hasil Dari "+num1+operasi+num2+"="+hasil);
	}
}