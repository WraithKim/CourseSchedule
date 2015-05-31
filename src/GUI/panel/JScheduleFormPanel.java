package GUI.panel;

import DB.ScheduleList;
import action.ActionControllable;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Donghwan on 2015-05-29.
 */
public class JScheduleFormPanel extends JPanel{
    private JInputPanel inputPanel;
    private JTablePanel tablePanel;

    public JScheduleFormPanel(ScheduleList db, ActionControllable root) {
        this.setLayout(new BorderLayout());
        inputPanel = new JInputPanel();
        tablePanel = new JTablePanel("My Course", root, db);

        this.add(inputPanel, BorderLayout.NORTH);
        this.add(tablePanel, BorderLayout.CENTER);
    }

    public JInputPanel getInputPanel(){
       return this.inputPanel;
    }

    public JTablePanel getTablePanel() {
        return tablePanel;
    }
}
