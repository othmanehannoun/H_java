package ex5;

public class Account {
	private String nom;
	private String adress;
	private double solde ;
	
	
    public void getNom(String nom) {
    	this.nom=nom;
    }
    public void getSolde(double solde) {
    	this.solde=solde;
    }
    public void getAdress(String adress) {
    	this.adress=adress;
    }
    public String setName() {
    	return this.nom;
    }
    public double setSolde() {
    	return this.solde;
    }
    public String setAdress() {
    	return this.adress;
    }
    public void Retirer(double arg) {
    	if(arg<=this.solde) {
    		System.out.printf("votre Retirer et valid ");
    	}
    }
    public static void main(String[] args) {
    	Account Account=new Account();
    	Account.getNom("Othmane");
    	Account.getSolde(5000.00);
    	Account.getAdress("Safi");
   	    System.out.printf(Account.setName()+" habite à ("+Account.setAdress()+") - infos solde "+Account.setSolde()+" DH\r\n" + "");
   	    Account.Retirer(100.0000);
    	
    }

    
    

}
