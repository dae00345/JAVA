public class Continue{
	public static void main(String[] args){

		for(var i=0; i<=100; i++){
			if(i%2==0){
				System.out.println("Perulangan Ke : "+i);
			}else{
				continue;
			}
		}
	}
}