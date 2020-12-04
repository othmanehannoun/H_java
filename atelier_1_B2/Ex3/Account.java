package exe2;

public class Account {
	String nom;
	String adress;
	float sold;
	public Account(String nom,String adress ,float sold) {
		this.nom=nom;
		this.adress=adress;
		this.sold=sold;
	}
	public void afficheInfoCompte() {
		 System.out.printf(this.nom+" habite à ("+this.adress+") - infos solde "+ this.sold +" DH");
	}
	 public static void main(String[] args) {
         Account Account =new Account("Othmane Hannoune", "Safi", 1300);
         Account.afficheInfoCompte();
         
		 
		 
	 }

}
