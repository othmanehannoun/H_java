import java.util.Scanner;

public class Contexte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String prénom;
		
		Scanner  reader = new Scanner(System.in);
		
		System.out.println("Quel est votre prénom");
		prénom = reader.next();
		
		System.out.println("Bonjour," + prénom);
		
	
	}

}


