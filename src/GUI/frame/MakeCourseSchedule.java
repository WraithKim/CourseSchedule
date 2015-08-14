package gui.frame;

import db.ScheduleList;
import gui.panel.JButtonPanel;
import gui.panel.JScheduleFormPanel;
import action.ActionControllable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class MakeCourseSchedule extends JOperatorFrame{
    private JButtonPanel buttonPanel;
    private JScheduleFormPanel scheduleFormPanel;

    public MakeCourseSchedule(String title, ActionControllable root, ScheduleList db) throws HeadlessException {
        super(title, root);
        this.setSize(700, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setInterior(db, root);
        this.setVisible(true);
    }

    private void setInterior(ScheduleList db, ActionControllable root){
        this.setLayout(new BorderLayout());

        this.buttonPanel = new JButtonPanel(root);
        this.scheduleFormPanel = new JScheduleFormPanel(db, null);

        this.add(buttonPanel, BorderLayout.EAST);
        this.add(scheduleFormPanel, BorderLayout.CENTER);
    }

    //about GUO I/O form value
    public String[] getInputForm()
    {
        return this.scheduleFormPanel.getInputForm();
    }
    public void setInputForm(String[] selectionForm){
        this.scheduleFormPanel.setInputForm(selectionForm);
    }
    public void updateTable(ScheduleList data){
        this.scheduleFormPanel.updateTable(data);
    }

}
