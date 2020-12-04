import java.util.Scanner;


public class brief1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bonjour");
		
		String nom, prenom;
		int nombreH, nbrHplus;
		double tarifH, Tarif_extra, salaire_final;
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Entrer Votre nom");
		nom = reader.next();
		
		System.out.println("Entrer Votre prénom");
		prenom = reader.next();
		
		System.out.println("bienvenue " + nom + " " + prenom);
		
		System.out.println("Entrer le nombre d’heures travaillées");
		nombreH = reader.nextInt();
		
		if(nombreH < 40 ) {
			System.out.println("Entrer le tarif par heure");
			tarifH = reader.nextFloat();
			Tarif_extra = 0;
			salaire_final = nombreH*tarifH;
			System.out.println("le salaire final est: " + salaire_final + "DH");
		}
		
		if(nombreH > 40) {
			System.out.println("Entrer le tarif par heure");
			tarifH = reader.nextFloat();
			
			nbrHplus = nombreH - 40;
			
			Tarif_extra = (0.5*tarifH + tarifH)*nbrHplus;
			
			System.out.println("votre indemnisation est de: " + Tarif_extra + "DH");
			
			salaire_final = 40*tarifH + Tarif_extra;
			
			System.out.println("le salaire final est: " + salaire_final + "DH");
		}
		
		else if(nombreH > 60){
			System.out.println("informations erronés !");
		}
		
		
	}

}
