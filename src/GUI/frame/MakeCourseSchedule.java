package GUI.frame;

import GUI.component.*;
import GUI.panel.JButtonPanel;
import GUI.panel.JInputPanel;
import GUI.panel.JScheduleFormPanel;
import GUI.panel.JTablePanel;
import action.ActionControllable;
import main.CourseSchedule;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class MakeCourseSchedule extends JOperatorFrame{
    private JButtonPanel buttonPanel;
    private JScheduleFormPanel scheduleFormPanel;

    public MakeCourseSchedule(String title, ActionControllable root) throws HeadlessException {
        super(title, root);
        this.setSize(700, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void setInterior(){
        generatePanel();

    }

    private void generatePanel() {
        this.buttonPanel = new JButtonPanel(new GridLayout(4, 1), root);
        this.scheduleFormPanel = new JScheduleFormPanel();
    }

}
