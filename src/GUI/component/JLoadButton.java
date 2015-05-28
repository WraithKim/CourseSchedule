package GUI.component;

import action.ActionControllable;
import action.LoadAction;
import main.CourseSchedule;

import javax.swing.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class JLoadButton extends JButton{
    private LoadAction loadClicked;
    public JLoadButton(ActionControllable root) {
        this.loadClicked = new LoadAction(root);
        this.addActionListener(loadClicked);
    }
}
