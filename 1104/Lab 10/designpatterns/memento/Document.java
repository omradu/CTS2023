//Originator
public class Document {
    private String name;
    private StringBuilder content;

    public Document(String name) {
        this.name = name;
        this.content = new StringBuilder();
    }

    public void writeText(String text) {
        content.append(text);
    }

    public String getContent() {
        return this.content.toString();
    }

    public DocumentMemento save() {
        return new DocumentMemento(this.content.toString());
    }

    public void restore(DocumentMemento documentMemento) {
        this.content = new StringBuilder();
        this.content.append(documentMemento.getSavedContent());
    }
}
