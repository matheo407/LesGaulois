package personnages;

public class Gaulois {
    private String nom;
    private int force;
    private int effetPotion = 1;

    public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "« " + texte + "»");
    }

    private String prendreParole() {
        return "Le gaulois " + nom + " : ";
    }

    public void frapper(Romain romain) {
        int forceDuCoup = (force / 3) * effetPotion;
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        romain.recevoirCoup(force / 3);
    }

    public void boirePotion(int forcePotion) {
        this.effetPotion = forcePotion;
        System.out.println("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée.");
    }

    @Override
    public String toString() {
        return "Gaulois [nom=" + nom + ", force=" + force + "]";
    }

    public static void main(String[] args) {
        Gaulois asterix = new Gaulois("Astérix", 8);
        Druide panoramix = new Druide("Panoramix", 5, 10);
        panoramix.preparerPotion();
        asterix.boirePotion(panoramix.getForcePotion());
    }
}
