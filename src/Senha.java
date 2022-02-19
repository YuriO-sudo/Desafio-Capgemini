//import java.util.Scanner;
import java.util.*;
import java.io.*;


//6 -senha.lenght

class Senha {
    public static void main(String[] args) {
        
    	String senha = "";
    	
        Scanner ler = new Scanner(System.in);

        System.out.println("informe a senha : \n");
		senha = ler.next();
		
		//senha.length() ;
	
		System.out.println("faltam : "  + (6 - senha.length())  + " caracteres" );
		
    }
		
}