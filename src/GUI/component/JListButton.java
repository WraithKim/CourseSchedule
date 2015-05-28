package GUI.component;

import action.ActionControllable;
import action.ListAction;
import main.CourseSchedule;

import javax.swing.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class JListButton extends JButton{
    private ListAction listClicked;
    public JListButton(ActionControllable root) {
        this.listClicked = new ListAction(root);
        this.addActionListener(listClicked);
    }
}
