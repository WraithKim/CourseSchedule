package GUI.panel;

import DB.ScheduleList;
import GUI.component.JScheduleTable;
import GUI.component.JScheduleTextField;
import action.ActionControllable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Donghwan on 2015-05-29.
 */
public class JTablePanel extends JPanel{
    private JScheduleTextField msg;
    private JScheduleTable scheduleTable;
    private ScheduleList scheduleList;
    private JScrollPane scrollPane;


    public JTablePanel(String msg, ActionControllable root, ScheduleList db) {
        this.setLayout(new BorderLayout());

        this.msg = new JScheduleTextField();
        this.msg.setText(msg);
        this.msg.setEnabled(false);

        scheduleList = db;
        scheduleTable = new JScheduleTable(scheduleList, root);

        scrollPane = new JScrollPane(scheduleTable);
        scheduleTable.setFillsViewportHeight(true);

        this.add(this.msg, BorderLayout.NORTH);
        this.add(scrollPane, BorderLayout.CENTER);
    }
    public void updateTable(ScheduleList data){
        scheduleTable.updateTable(data);
    }
}
