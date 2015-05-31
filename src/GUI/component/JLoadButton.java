package GUI.component;

import action.ActionControllable;
import action.LoadAction;

import javax.swing.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class JLoadButton extends JButton{
    private final LoadAction loadClicked;
    public JLoadButton(ActionControllable root) {
        this.setText("Load");
        this.loadClicked = new LoadAction(root);
        this.addActionListener(loadClicked);
    }
}
