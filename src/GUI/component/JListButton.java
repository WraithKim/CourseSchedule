package gui.component;

import action.ActionControllable;
import action.ListActionListener;

import javax.swing.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class JListButton extends JButton{
    private final ListActionListener listClicked;
    public JListButton(ActionControllable root) {
        this.setText("List");
        this.listClicked = new ListActionListener(root);
        this.addActionListener(listClicked);
    }
}
