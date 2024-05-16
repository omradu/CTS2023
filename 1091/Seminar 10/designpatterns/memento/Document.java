//Originator
public class Document {
    private String nume;
    private StringBuilder continut;

    public Document(String nume) {
        this.nume = nume;
        this.continut = new StringBuilder();
    }

    public DocumentMemento salvare() {
        return new DocumentMemento(this.continut.toString());
    }

    public void restaurare(DocumentMemento backup) {
        this.continut = new StringBuilder();
        this.continut.append(backup.getBackup());
    }

    public void adaugareText(String text) {
        continut.append(text);
    }

    public String getContinut() {
        return this.continut.toString();
    }
}
