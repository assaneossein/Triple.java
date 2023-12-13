public class Livre {
    private String titre, auteur;
    private int nbPages;
    private double prix;
    private boolean prixFixe;

    public Livre() {
        auteur = "";
        titre = "";
        nbPages = 0;
        prix = -1;
        prixFixe = false;
    }
    public Livre(String unAuteur, String unTitre) {
        auteur = unAuteur;
        titre = unTitre;
        nbPages = 0;
        prix = -1;
        prixFixe = false;
    }
    public Livre(String unAuteur, String unTitre, int n) {
        auteur = unAuteur;
        titre = unTitre;
        nbPages = n;
        prix = -1;
        prixFixe = false;
    }

    public String getTitre() {
        return titre;
    }
    public int getNbPages() {
        return nbPages;
    }
    public double getPrix() {
        return prix;
    }

    public void setAuteur(String unAuteur) {
        auteur = unAuteur;
    }
    public void setTitre(String unTitre) {
        titre = unTitre;
    }
    public void setNbPages(int n) {
        if (n > 0) {
            nbPages = n;
        } else {
            System.out.println("Le nombre de pages doit être positif.");
        }
    }
    public void setPrix(double unPrix) {
        if (!prixFixe) {
            prix = unPrix;
            prixFixe = true;
        } else {
            System.out.println("Le prix a déjà été fixé et ne peut être modifié.");
        }
    }
    // toString()
    public String toString() {
        String description = "Auteur : " + auteur + "\nTitre : " + titre + "\nNombre de pages : " + nbPages;
        if (prix == -1) {
            description += "\nPrix pas encore fixé";
        } else {
            description += "\nPrix : " + prix;
        }
        return description;
    }
}

public class TestLivre {
    public static void main(String[] args) {
        Livre livre1 = new Livre();
        Livre livre2 = new Livre("Auteur1", "Titre1");
        Livre livre3 = new Livre("Auteur2", "Titre2", 300);
        System.out.println(livre1.toString());
        System.out.println(livre2.toString());
        System.out.println(livre3.toString());
    }
}