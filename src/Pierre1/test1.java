package Pierre1;

public class test1 {
	

	
	public static int division (int a,int b) {
		
		int result = a/b ;
		//System.out.println(result);
		return result;
		
	}
	
	

	public static int divisionx2 (int a) {
		
		int result= a/2;
		return result;
		
		
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 2048;
		int b= 5;
		int result1 = division (a,b);
		System.out.println(result1);
		
		
		
		int result2 = divisionx2 (a);
		System.out.println(result2);

	}

}
