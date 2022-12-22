package factorymethod.pseudocode;

public class WindowsDialog extends Dialog{
    public Button createButton() {
        return new WindowsButton();
    }
}
