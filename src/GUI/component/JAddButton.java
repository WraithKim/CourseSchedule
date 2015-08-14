package gui.component;

import action.ActionControllable;
import action.AddActionListener;

import javax.swing.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class JAddButton extends JButton{
    private AddActionListener addClicked;
    public JAddButton(ActionControllable root){
        this.setText("Add");
        this.addClicked = new AddActionListener(root);
        this.addActionListener(addClicked);
    }
}
