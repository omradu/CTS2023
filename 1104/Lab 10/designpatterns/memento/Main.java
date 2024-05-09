public class Main {
    public static void main(String[] args) {
        TextEditor notepad = new TextEditor();
        Document textFile = new Document("documentTest.txt");

        textFile.writeText("Hello! ");
        textFile.writeText(" This is a test file");
        notepad.addMemento(textFile.save());

        textFile.writeText(" This is going great");
        System.out.println(textFile.getContent());
        System.out.println("----------------------");

        textFile.restore(notepad.getMemento());
        System.out.println(textFile.getContent());
    }
}
