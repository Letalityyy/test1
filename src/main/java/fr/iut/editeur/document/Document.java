package fr.iut.editeur.document;

public class Document {

    private String texteDocument;

    public Document() {
        this.texteDocument = "";
    }
	
    public String getTexteDocument() {
        return texteDocument;
    }

    public void setTexteDocument(String texteDocument) {
        this.texteDocument = texteDocument;
    }

    public void ajouter(String texte) {
        this.texteDocument += texte;
    }

    public void effecer(String texte){
        this.texteDocument.replace(this.texteDocument,texte);
    }

    public void clear(){
        this.texteDocument = "";

    }

    public void inserer(int debut, String remplacement){
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(debut);
        texteDocument = partieGauche + remplacement + partieDroite;

    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texteDocument.substring(0, debut);
        String partieDroite = texteDocument.substring(fin + 1);
        texteDocument = partieGauche + remplacement + partieDroite;
    }

    public void majuscules(int debut, int fin) {
        //TO-DO!
    }
    public void minuscules(int debut, int fin){
        String partie = texteDocument.substring(debut, fin+1);
        partie =partie.toLowerCase();
        remplacer(debut, fin, partie);
    }
    @Override
    public String toString() {
        return this.texteDocument;
    }
}
