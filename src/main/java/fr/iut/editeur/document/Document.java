package fr.iut.editeur.document;

public class Document {

    private String contentDocument;

    public Document() {
        this.contentDocument = "";
    }
	
    public String getTexte() {
        return contentDocument;
    }

    public void setTexte(String texte) {
        this.contentDocument = texte;
    }

    public void ajouter(String texte) {
        this.contentDocument += texte;
    }

    public void effecer(String texte){
        this.contentDocument.replace(this.contentDocument,texte);
    }

    public void clear(){
        this.contentDocument = "";

    }

    public void inserer(int debut, String remplacement){
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(debut);
        contentDocument= partieGauche + remplacement + partieDroite;

    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = contentDocument.substring(0, debut);
        String partieDroite = contentDocument.substring(fin + 1);
        contentDocument = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        //TO-DO!
    }
    public void minuscules(int debut, int fin){
        String partie = contentDocument.substring(debut, fin+1);
        partie =partie.toLowerCase();
        remplacer(debut, fin, partie);
    }
    @Override
    public String toString() {
        return this.contentDocument;
    }
}
