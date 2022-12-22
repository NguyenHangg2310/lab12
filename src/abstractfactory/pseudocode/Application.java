package abstract_factory.pseudocode;

public class Application {
    private Button button;

    private CheckBox checkBox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
