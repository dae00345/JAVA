public class Array{
	public static void main(String[] args){
		//Array 2d angka

		int[][] arrayAngka = {
			{1,2,3,4,5,6},
			{7,8,9,10,11,12},
			{13,14,15,16,17,18}
		};

		//menampilkan array secara manual
		System.out.println(arrayAngka[0][0]);
		System.out.println(arrayAngka[0][1]);
		System.out.println(arrayAngka[0][2]);
		System.out.println(arrayAngka[0][3]);
		System.out.println(arrayAngka[0][4]);
		System.out.println(arrayAngka[0][5]);

		System.out.println(arrayAngka[1][0]);
		System.out.println(arrayAngka[1][1]);
		System.out.println(arrayAngka[1][2]);
		System.out.println(arrayAngka[1][3]);
		System.out.println(arrayAngka[1][4]);
		System.out.println(arrayAngka[1][5]);

		System.out.println(arrayAngka[2][0]);
		System.out.println(arrayAngka[2][1]);
		System.out.println(arrayAngka[2][2]);
		System.out.println(arrayAngka[2][3]);
		System.out.println(arrayAngka[2][4]);
		System.out.println(arrayAngka[2][5]);

		//menampilkan array menggunakan for each

		for(int i: arrayAngka[0]){
			System.out.println(i);
		}

		for(int i: arrayAngka[1]){
			System.out.println(i);
		}

		for(int i: arrayAngka[2]){
			System.out.println(i);
		}

		//Menampilkan array menggunakan for loop
		for (int i = 0; i<arrayAngka[0].length;i++){
			System.out.println(arrayAngka[0][i]);
			
		}

		for (int i = 0; i<arrayAngka[1].length;i++){
			System.out.println(arrayAngka[1][i]);
		}

		for (int i=0; i<arrayAngka[2].length;i++){
			System.out.println(arrayAngka[2][i]);
		}


	}
}