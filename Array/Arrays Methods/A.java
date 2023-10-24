import java.util.Arrays;

class A{
	public static void main(String []args){
		String a[] = {"Hari", "Raj", "laxminarayan", " Jhonson", "Olive"};

		System.out.println(Arrays.toString(a) + "toString");

		System.out.println(Arrays.asList(a) + "asList");

		int arr[] [] = {{10,20} , {30,40}};

		System.out.println(Arrays.deepToString(a) + "deepToString");


	}
}