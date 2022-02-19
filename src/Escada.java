

public class Escada {

	public static void main(String[] args) {
		int n = 5;
		int count = 1;
		while(count < n+1) {
			System.out.println(padLeft(padasc("*", count ), n));
			count ++;
		}
		 
		
	}
	
	public static String padasc(String s, int n) {
		String aux = "";
		int count = 0 ;
		
		do {
			aux = s + aux;
			count ++;
		}while (count < n );
			
		
	    return aux;  
	}
	
	public static String padLeft(String s, int n) {
	    return String.format("%" + n + "s", s);  
	}
}
