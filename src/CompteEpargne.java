public class CompteEpargne extends CompteBancaire {
    private double taux;
    public CompteEpargne (String nomCompte, int numeroCompte,double taux){
        super(nomCompte, numeroCompte);
        this.taux = taux;
    }
    public void appliquerInterets(){
       double interets = getSolde() * taux;
       deposer(interets);
    }
    @Override
    public void afficher() {
        System.out.println("Bonjour " + nomCompte + " au numéro de compte : " + numeroCompte + " votre solde est de " + solde + " euros" + " et votre taux d'épargne est de " + taux);
    }

}