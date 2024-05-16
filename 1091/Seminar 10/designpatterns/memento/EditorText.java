//Care Taker
public class EditorText {
    private List<DocumentMemento> istoric = new ArrayList<>();

    public void adaugaMemento(DocumentMemento memento) {
        this.istoric.add(memento);
    }

    public DocumentMemento getMemento() {
        if(istoric.size()!=0) {
            DocumentMemento memento = istoric.get(istoric.size()-1);
            istoric.remove(istoric.size()-1);
            return memento;
        } else {
            return new DocumentMemento("");
        }
    }
}
