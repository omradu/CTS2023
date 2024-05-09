//Memento
public class DocumentMemento {
    private final String text;
    private Date timeStamp;

    public DocumentMemento(String text) {
        this.text = text;
        timeStamp = new Date();
    }

    public String getSavedContent() {
        return text;
    }
}
