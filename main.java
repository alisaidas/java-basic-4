import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        method_grade_value();
    }

	static void method_grade_value(){
		Scanner scan = new Scanner(System.in);
        int nilai;
		System.out.println("===========================================");
		System.out.println("Cek Your Number for value");
		System.out.println("by Ali Mubarak");
		System.out.println("===========================================");
        System.out.print("Input your number : "); nilai = scan.nextInt();
        
		// cek your value range A to E
        if (nilai >= 0 && nilai <= 20) {
            System.out.println(" Your value to grade is : E");
        } else if (nilai > 20 && nilai <= 40) {
            System.out.println("Your value to grade is : D");
        } else if (nilai > 40 && nilai <= 60) {
            System.out.println("Your value to grade is : C");
        } else if (nilai > 60 && nilai <= 80) {
            System.out.println("Your value to grade is : B");
        } else if (nilai > 80 && nilai <= 100) {
            System.out.println("Your value to grade is : A");
        } else if (nilai >= 100) {
            System.out.println("Invalid Value");
        }

		// Finish
	} 
}