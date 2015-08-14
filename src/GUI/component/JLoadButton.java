package gui.component;

import action.ActionControllable;
import action.LoadActionListener;

import javax.swing.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class JLoadButton extends JButton{
    private final LoadActionListener loadClicked;
    public JLoadButton(ActionControllable root) {
        this.setText("Load");
        this.loadClicked = new LoadActionListener(root);
        this.addActionListener(loadClicked);
    }
}
