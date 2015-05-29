package GUI.frame;

import GUI.component.JScheduleTable;
import GUI.component.JScheduleTextField;
import action.ActionControllable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class CourseList extends JOperatorFrame{
    private JScheduleTextField clickMsg;
    private JScheduleTable listTable;

    public CourseList(String title, ActionControllable root, JScheduleTable listTable) throws HeadlessException {
        super(title, root);
        this.listTable = listTable;
        this.setSize(500, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
