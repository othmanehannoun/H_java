
public class les_boucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
    // 1: 
		for(int i=1; i<=10; i++) {
			if(i!=10) {
				System.out.print(i + ",");
			}
			else {
				System.out.println(i);
			}
		}

   // 2: 
		for (int i=1; i<11; i++) {
			if(i!=10) {
				System.out.print(i + "," +(101-i)+",");
			}
			else {
				System.out.print(i);
			}
		}

	}

}
