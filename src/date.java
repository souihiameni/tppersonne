public class date {
    public int jour;
    public int mois;
    public int annee;

    public date(int jour, int mois, int annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public void afficherDate() {
        System.out.println(jour + "/" + mois + "/" + annee);
    }
}