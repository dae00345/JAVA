public class RecursiveMethod{
	public static void main(String[] args){

		var x = factorialLoop(5);
		var y = factorialRecursive(5);
		System.out.println(x);
		System.out.println(y);

	}
	//factorial loop
	static int factorialLoop(int value){
		var result = 1;

		for(var counter = 1; counter<=value; counter++){
			result *= counter;
		}
		return result;
	}

	//farctorial recursive
	static int factorialRecursive(int value){
		if(value==1){
			return 1;
		}else{
			return value * factorialRecursive(value - 1);
		}
	}
}