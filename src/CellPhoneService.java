import java.util.Scanner;

public class CellPhoneService {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Introduce minute:");
		int minutes = input.nextInt();
		System.out.println("Introduce numar mesaje:");
		int numberMessage = input.nextInt();
		System.out.println("Introduce date:");
		int date = input.nextInt();


		if(date > 0){
			if(date<=2){
				System.out.println("Cel mai potrivit plan E, pret 79$");
			} else {
				System.out.println("Cel mai potrivit plan F, pret 87$");
			}
		} else {
			if (minutes < 500 && numberMessage == 0){
				System.out.println("Cel mai potrivit plan A, pret 49$");
			}
		}


	}



//plan A
//	pret 49$
//	<500min si fara mesaje

//plan B
//	pret 55$
//  <500 min si <100 mesaje

//plan C
//   >500 min si <100 mesaje
// pret 61$

//plan D
// >500 min si >100 mesaje
// pret 70$

//plan E
//  date <2GB
// pret 79$

//plan F
//date  date >2GB
//pret 87 $





}