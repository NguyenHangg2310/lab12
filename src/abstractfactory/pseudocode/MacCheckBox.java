package abstract_factory.pseudocode;

public class MacCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
