package GUI.component;

import action.ActionControllable;
import action.SaveAction;
import javax.swing.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class JSaveButton extends JButton{
    private final SaveAction saveClicked;
    public JSaveButton(ActionControllable root) {
        this.setText("Save");
        this.saveClicked = new SaveAction(root);
        this.addActionListener(saveClicked);
    }
}
