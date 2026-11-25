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

}