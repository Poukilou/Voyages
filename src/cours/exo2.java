package cours;

public class exo2 {
	
	/*2. Write a Java program to print the sum of six numbers. Go to the editor
Test Data: 
74 + 36 +5 +10+15+10
Expected Output :
150
*/
	
	public static int somme (int a, int b, int c, int d, int e , int f) {
		int total = a+b+c+d+e+f;
		System.out.println(total);
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 74;
		int b = 36;
		int c = 5;
		int d = 10;
		int e = 15;
		int f = 10;
		
		int resultat= somme (a,b,c,d,e,f);
		
		
	}

}
