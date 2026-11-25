public class CompteBancaire {
    private String nomCompte;
    private int numeroCompte;
    private double solde;

    public CompteBancaire(String nomCompte, int numeroCompte) {
        this.solde = 0;
        this.nomCompte = nomCompte;
        this.numeroCompte = numeroCompte;
    }

    public String getNomCompte(){
        return this.nomCompte;
    }

    public int getNumeroCompte(){
        return this.numeroCompte;
    }

    public double getSolde(){
        return this.solde;
    }

    public void setNomCompte (String nomCompte){
        if (!nomCompte.isEmpty()){
            this.nomCompte = nomCompte;
            System.out.println("Votre nouveau nom de compte est : " + nomCompte);
        }else {
            System.out.println("Veuillez saisir un nom");
        }
    }

    public void deposer(double montantAjout) {
        if (montantAjout <= 0){
            System.out.println("Veuillez saisir un montant supérieur à 0");
        } else {
            solde += montantAjout;
        }
    }

    public void retirer(double montantRetrait) {
        if (montantRetrait <= 0){
            System.out.println("Veuillez saisir un montant supérieur à 0");
        } else if (montantRetrait > solde) {
            System.out.println("Retrait refusé, solde insuffisant");
        } else {
            solde -= montantRetrait;
        }
    }

    public void afficher() {
        System.out.println("Bonjour " + nomCompte + " au numéro de compte : " + numeroCompte + " votre solde est de " + solde + " euros");
    }
}