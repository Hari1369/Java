import java.util.Scanner;

class A{
	public static void main(String []args){
		int size;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Elements: ");
		size = sc.nextInt();

		int []a = new int[size];

			System.out.println("here is all print elements: ");

		for(int i=0; i<size; i++){
			a[i] = sc.nextInt();
		}
			System.out.println();
			System.out.println("here is all printed elements which you typed: ");

		for(int i=0; i<size; i++){
			System.out.println(a[i] + "  ");
		}

	}
}
