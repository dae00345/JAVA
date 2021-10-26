public class MethodVarArg{
	public static void main(String[] args){

		sayCongrats("Sinklaus Patrezki Dae",80,90,80,90);


	}
	static void sayCongrats(String nama, int... tempNilai){
		var total = 0;
		for(var nilai : tempNilai){
			total+=nilai;
		}
		var nilaiAkhir = total/tempNilai.length;

		if (nilaiAkhir>=75){
			System.out.println("Selamat "+nama+" Anda Lulus");
		}else{
			System.out.println("Maaf "+nama+" Anda Tidak Lulus");
		}
	}
}