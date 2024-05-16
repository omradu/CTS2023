public class Main {
    public static void main(String[] args) {
        EditorText editor = new EditorText();
        Document fisierText = new Document("docText.txt");

        fisierText.adaugareText("Buna!");
        fisierText.adaugareText("Acesta este un document de test");
        editor.adaugaMemento(fisierText.salvare());

        fisierText.adaugareText("Continuam testul");
        System.out.println(fisierText.getContinut());

        fisierText.restaurare(editor.getMemento());
        System.out.println("------------------------");
        System.out.println(fisierText.getContinut());
    }
}
