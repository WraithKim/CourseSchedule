package GUI.frame;

import DB.ScheduleList;
import GUI.panel.JTablePanel;
import action.ActionControllable;

import java.awt.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class CourseList extends JOperatorFrame{
    private JTablePanel mainPanel;
    public CourseList(String title, ActionControllable root, ScheduleList db) throws HeadlessException {
        super(title, root);
        this.setSize(500, 500);
        this.setResizable(false);
        this.setInterior(db);
        this.setVisible(true);
    }

    private void setInterior(ScheduleList db){
        mainPanel = new JTablePanel("Click the Table", root, db);
        this.add(mainPanel);
    }
}
