package GUI.panel;

import GUI.component.JAddButton;
import GUI.component.JListButton;
import GUI.component.JLoadButton;
import GUI.component.JSaveButton;
import action.ActionControllable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Donghwan on 2015-05-29.
 */
public class JButtonPanel extends JPanel{
    private JAddButton addBt;
    private JListButton listBt;
    private JLoadButton loadBt;
    private JSaveButton saveBt;
    private ActionControllable root;

    public JButtonPanel(LayoutManager layout, ActionControllable root) {
        super(layout);
        this.root = root;
        addBt = new JAddButton(root);
        listBt = new JListButton(root);
        loadBt = new JLoadButton(root);
        saveBt = new JSaveButton(root);
    }
}
