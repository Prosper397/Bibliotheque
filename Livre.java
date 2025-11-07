import java.util.Scanner;
public class Livre {
    // 🔹 Attributs de la classe
    private String titre;
    private String nom;
    private String prenom;
    private String categorie;
    private String ISBN;
    private String code;

    // Constructeur par défaut 
    public Livre(){
    Scanner clavier = new Scanner(System.in);

        System.out.println("Veuillez saisir le titre du livre :");
        //LivrePoche.setTitre(clavier.nextLine());
        setTitre(clavier.nextLine());   // Utilisation du setter

        System.out.println("Veuillez saisir le nom de l'auteur :");
        setNom(clavier.nextLine());
        
        System.out.println("Veuillez saisir le prénom de l'auteur :");
        setPrenom(clavier.nextLine());
        
        System.out.println("Veuillez saisir la catégorie du livre:");
        setCategorie(clavier.nextLine());
        
        System.out.println("Veuillez saisir le numéro ISBN du livre :");
        setISBN(clavier.nextLine());
}
    
    // Surchargeons le constructeur
    public Livre(String t, String n, String p, String c, String numero){
    setTitre(t);
    setNom(n);
    setPrenom(p);
    setCategorie(c);
    setISBN(numero);
    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String title) {
        this.titre = title;
    }

    public String getNomAuteur() { 
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenomAuteur() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getCode() {
        return code;
    }

   
    public void afficherUnLivre() {
        // Appelons directement la méthode setCode ici
        setCode();
        System.out.println("\n=== Caractéristiques du livre ===");
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + prenom + " " + nom);
        System.out.println("Catégorie : " + categorie);
        System.out.println("ISBN : " + ISBN);
        System.out.println("Code d'enregistrement : " + code);
    }

    // Méthode pour calculer le code d’enregistrement du livre
    /*Exercice 6
Renommer la méthode calculerLeCode() par setCode() et faire en sorte que cette méthode ne
soit pas accessible par aucune autre classe que la classe Livre.*/
    
    // IL ft qu'on rende privée la méthode "setCode" 
    private void setCode() // Ça veut dire que c'est seulement la classe Livre qui peut l'utiliser
    {
        if (nom != null && prenom != null && categorie != null && ISBN != null
                && nom.length() >= 2 && prenom.length() >= 2 && categorie.length() >= 2 &&
                ISBN.length() >= 2) /*nom != null vérifie que nom a été initialisé
            (que l'utilisateur a saisi qlq chose) nom.length() > 2 vérifie que la chaine nom contient au moins 2 caractères*/
        {
            this.code = nom.substring(0, 2).toUpperCase()
                      + prenom.substring(0, 2).toUpperCase()
                      + categorie.substring(0, 2).toUpperCase()
                      + ISBN.substring(ISBN.length() - 2);
        } else {
            this.code = "CODE_INVALIDE";
        }
    }
}
