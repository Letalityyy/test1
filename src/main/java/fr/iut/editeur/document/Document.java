package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void effecer(String texte){
        this.texte.replace(this.texte,texte);
    }

    public void clear(){
        this.texte = "";

    }

    public void inserer(int debut, String remplacement){
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(debut);
        texte= partieGauche + remplacement + partieDroite;

    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        //TO-DO!
    }
    public void minuscules(int debut, int fin){
        String partie = texte.substring(debut, fin+1);
        partie =partie.toLowerCase();
        remplacer(debut, fin, partie);
    }
    @Override
    public String toString() {
        return this.texte;
    }
}
