public class CompteCourant extends CompteBancaire {
    private double decouvert;
    public CompteCourant (String nomCompte, int numeroCompte, double decouvert){
        super(nomCompte, numeroCompte);
        this.decouvert = decouvert;
    }
    @Override
    public void retirer(double montantRetrait) {
        double soldeApres = getSolde() - montantRetrait;
        if (montantRetrait <= 0){
            System.out.println("Veuillez saisir un montant supérieur à 0");
        } else if (soldeApres > decouvert) {
            System.out.println("Retrait refusé, montant de découvert autorisé atteint");
        } else {
            solde -= montantRetrait;
        }
    }
    @Override
    public void afficher() {
        System.out.println("Bonjour " + nomCompte + " au numéro de compte : " + numeroCompte + " votre solde est de " + solde + " euros" + " et votre découvert autorisé est de " + decouvert);
    }
}