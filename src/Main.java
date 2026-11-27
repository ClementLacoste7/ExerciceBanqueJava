import java.awt.*;

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
      compteCourantJean.retirer(700);
      compteCourantJean.afficher();
      compteEpargneJean.appliquerInterets();
      compteEpargneJean.afficher();
      CompteBancaire[] comptes = new CompteBancaire[4];
      comptes[0] = new CompteCourant("Paul", 11, -200);
      comptes[1] = new CompteEpargne("Paul", 12, 0.02);
      comptes[2] = new CompteCourant("Jacques", 13, -100);
      comptes[3] = new CompteEpargne("Jacques", 14, 0.04);
      comptes[0].deposer(200);
      comptes[1].deposer(200);
      comptes[2].deposer(200);
      comptes[3].deposer(200);
      for (int i = 0; i < 4; i++){
         comptes[i].afficher();
      }
      double sommeSolde = 0;
      for (int i = 0; i < 4; i ++){
         sommeSolde += comptes[i].getSolde();
      }
      System.out.println("La somme totale de la banque est de " + sommeSolde);


   }
}