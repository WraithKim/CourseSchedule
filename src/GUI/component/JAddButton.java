package GUI.component;

import action.ActionControllable;
import action.AddAction;

import javax.swing.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class JAddButton extends JButton{
    private AddAction addClicked;
    public JAddButton(ActionControllable root){
        this.setText("Add");
        this.addClicked = new AddAction(root);
        this.addActionListener(addClicked);
    }
}
