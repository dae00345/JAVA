public class MethodOverload{
	public static void main(String[] args){

		showData("Hallo Bro");
		showData("Ariel Dae");
		showData("Erick Dae","3A");

	}

	static void showData(){
		System.out.println("Hallo");
	}

	static void showData(String nama, String kelas){
		System.out.println("Nama : "+nama+"\nKelas : "+kelas);
	}
	static void showData(String nama){
		System.out.println("Nama : "+nama);
	}
}