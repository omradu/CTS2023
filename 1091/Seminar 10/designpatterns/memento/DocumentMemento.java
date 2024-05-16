//Memento
public class DocumentMemento {
    private final String continutText;
    private Date dataBackup;

    public DocumentMemento(String continutText) {
        this.continutText = continutText;
        this.dataBackup = new Date();
    }

    public String getBackup() {
        return continutText;
    }
}
