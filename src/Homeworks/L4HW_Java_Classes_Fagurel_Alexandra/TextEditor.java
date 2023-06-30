package Homeworks.L4HW_Java_Classes_Fagurel_Alexandra;

public class TextEditor {
    private String text;

    public TextEditor() {
        text = "";
    }

    public void addText(String additionalText) {
        text += additionalText;
    }

    public void printCurrentText() {
        System.out.println(text);
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addText("Привет, ");
        editor.addText("мир!");
        editor.addText(" Это мой текстовый редактор.");

        editor.printCurrentText();
    }
}
