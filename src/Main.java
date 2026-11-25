public class Main {
   public static void main(String[] args) {
      CompteBancaire compteJean = new CompteBancaire("Jean", 46);
      CompteBancaire compteMichel = new CompteBancaire("Michel", 30);
      compteMichel.deposer(-40);
      compteMichel.retirer(20);
      compteJean.deposer(20);
      compteJean.retirer(20);
      compteJean.afficher();
      compteMichel.afficher();
      compteMichel.setNomCompte("Paul");
      compteMichel.setNomCompte("");
      System.out.println("Votre nouveau solde est de " + compteJean.getSolde());
      CompteCourant compteCourantJean = new CompteCourant("Jean", 46, -200);
      CompteEpargne compteEpargneJean = new CompteEpargne("Jean", 46, 0.03);
      compteCourantJean.deposer(400);
      compteEpargneJean.deposer(100);
      compteCourantJean.retirer(500);
      compteCourantJean.afficher();
      compteEpargneJean.appliquerInterets();
      compteEpargneJean.afficher();
   }
}