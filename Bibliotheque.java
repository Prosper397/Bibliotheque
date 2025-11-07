public class Bibliotheque {
    public static void main(String[] args) {
        Livre LivrePoche = new Livre(); // Création de l'objet
        
        // Affichage complet
        LivrePoche.afficherUnLivre();

        // Affichage du titre et code
        System.out.println("\nLe titre du livre LivrePoche est : " + LivrePoche.getTitre());

       // LivrePoche.calculerLeCode(); (j'ai commenté cette car calculerLeCode() est remplacée par setCode()
        System.out.println("Le code d'enregistrement du livre LivrePoche est : " + LivrePoche.getCode());

    
   // Objet unPolar
    Livre unPolar = new Livre("Le mystère de la chambre jaune", "Leroux", "Gaston", "Policier","2253005495");
    // Affichons le contenu de unPolar
    unPolar.afficherUnLivre();
    }
}
    

