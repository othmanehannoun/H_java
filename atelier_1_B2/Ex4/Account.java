package ex4;

public class Account {
     public String nom;
     public String adresse;
     public double solde;
     
     public Account(String nom,String adresse,double solde) {
    	 this.nom=nom;
    	 this.adresse=adresse;
    	 this.solde=solde;
    	 
     };
     public void afficherInfosSolde() {
    	 System.out.printf("bonjour "+this.nom+"\n"+"solde "+this.solde);
     };
     public double calculerInterer() {
    	 return this.solde*0.07;
     }
     public static void main(String[] args) {
    	 Account Account=new Account("Othmane","safi",50000);
    	 Account.afficherInfosSolde();
    	 System.out.printf("tauxInteret :"+Account.calculerInterer());

     }
}
