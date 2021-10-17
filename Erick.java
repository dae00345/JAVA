import java.util.*;
public class Erick{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String nama = "";
		String ipt;

		for (int i=0; i<5; i++){
			System.out.print("| >> Nama : ");
			ipt = input.nextLine();
			nama = nama+ipt+" ";
		}
		System.out.println("("+nama+")");

	}
}