import java.util.Scanner;
public class factorielle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A,F;
		Scanner factorielle = new Scanner(System.in);
		
		System.out.println("Donner Un nombre");
		A = factorielle.nextInt();
		F = 1;
		
		if(A == 0) {
			F = 1;
		}
		
		else {
			for(int i=1; i<=A; i++) {
	        	F = F*i;
	        }
	     
		} System.out.println("factorielle est: " + F);
        
	}

}
