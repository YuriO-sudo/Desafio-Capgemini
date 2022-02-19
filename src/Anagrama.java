import java.util.Scanner;

public class Anagrama {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, insira a palavra: "); // palavras validadas ifailuhkqq e ovo
		
        String palavra = sc.nextLine();           
        String letra = "";
        String SubPalavra = "";
        int MPalavra = 0;
        int iTam;
        	
        
        //mostra as letras repetidas 
        for(int i=0;i<palavra.length();i++)
        {
        	//Uma letra
           letra = palavra.substring(i,i+1); 
           for(int j=i+1 ;j<palavra.length();j++) 
              {
        	     if (letra.equals(palavra.substring(j,j+1))) 
        	     {
        		   System.out.println(letra + letra);
        		           		           		   
        		 }
              }
        }
        
            MPalavra=(palavra.length()/2)+2;
           
            for( iTam=2;iTam<MPalavra;iTam++)
            {
		        for(int i=0;i<palavra.length();i++)
		        {	
			        //Duas SubPalavras
		        	if(i+iTam>palavra.length()){break;}
		        	
			        SubPalavra = palavra.substring(i,i+iTam);
			        
			        
			        for(int j=i+1 ;j<palavra.length();j++) 
			           {
			        	
			        	if(j+iTam>palavra.length()){break;}
			        	
			        	if (b_anagrama(SubPalavra,palavra.substring(j,j+iTam))) 
			     	     {
			     		   System.out.println(SubPalavra + "," + palavra.substring(j,j+iTam));
			     		 }
			           }           
		        }
		        
            }
        
       
	}
	//Compara as palavras
	 static boolean  b_anagrama (String palavra1 , String palavra2){
		
		 if(palavra1.length() != palavra2.length()) {
			 return false;
		 }
		 else {
			 for(int i=0 ;i<palavra1.length();i++) {
								 
				 if (palavra2.indexOf(palavra1.substring(i,i+1))<0) {
										 
					 return false;
				 }
				 
				 if (palavra1.indexOf(palavra2.substring(i,i+1))<0) {
					 
					 return false;
				 }
			 }
		 }
		 
     	return true;
     	}
	
	
}
