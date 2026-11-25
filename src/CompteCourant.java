public class CompteCourant extends CompteBancaire {
    private double decouvert;
    public CompteCourant (String nomCompte, int numeroCompte, double decouvert){
        super(nomCompte, numeroCompte);
        this.decouvert = decouvert;
    }
}