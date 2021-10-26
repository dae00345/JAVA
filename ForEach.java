public class ForEach{
	public static void main(String[] args){

		int[] nilai = {1,2,3,4,5,6};
		String[] nama = {
			"Erick","Dae","Anak","Ganteng"
		};

		for(int i : nilai){
			System.out.println(i);
		}

		for(String i : nama){
			System.out.println(i);
		}
	}
}