package gui.component;

import action.ActionControllable;
import action.SaveActionListener;
import javax.swing.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class JSaveButton extends JButton{
    private final SaveActionListener saveClicked;
    public JSaveButton(ActionControllable root) {
        this.setText("Save");
        this.saveClicked = new SaveActionListener(root);
        this.addActionListener(saveClicked);
    }
}
