package GUI.component;

import action.ActionControllable;
import action.AddAction;
import main.CourseSchedule;

import javax.swing.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class JAddButton extends JButton{
    private AddAction addClicked;
    public JAddButton(ActionControllable root){
        this.addClicked = new AddAction(root);
        this.addActionListener(addClicked);
    }
}
