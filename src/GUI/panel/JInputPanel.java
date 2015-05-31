package GUI.panel;

import GUI.component.JScheduleComboBox;
import GUI.component.JScheduleTextField;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Donghwan on 2015-05-29.
 */
public class JInputPanel extends JPanel{
    private final int row = 2;
    private final int col = 5;

    /*if you revise these component, you need to revise Schedule, ScheduleList in DB package*/
    private final JLabel subjectLabel = new JLabel("subject");
    private JScheduleTextField subjectField;
    private final JLabel creditLabel = new JLabel("credit");
    private JScheduleTextField creditField;
    private final JLabel dayLabel = new JLabel("day");
    private JScheduleComboBox dayComboBox;
    private final JLabel startTimeLabel = new JLabel("start time");
    private JScheduleTextField startTimeField;
    private final JLabel hoursLabel = new JLabel("hours");
    private JScheduleTextField hoursField;

    public JInputPanel() {
        super();
        this.setLayout(new GridLayout(row, col));
        subjectField = new JScheduleTextField();
        creditField = new JScheduleTextField();
        dayComboBox = new JScheduleComboBox(new String[]{"mon", "tue", "wed", "thu", "fri"});
        startTimeField = new JScheduleTextField();
        hoursField = new JScheduleTextField();

        this.add(subjectLabel);
        this.add(creditLabel);
        this.add(dayLabel);
        this.add(startTimeLabel);
        this.add(hoursLabel);

        this.add(subjectField);
        this.add(creditField);
        this.add(dayComboBox);
        this.add(startTimeField);
        this.add(hoursField);
    }

    public String[] getInputForm()
    {
        String[] returnSchedule = new String[col];

        returnSchedule[0] = subjectField.getText().trim();
        returnSchedule[1] = creditField.getText().trim();
        returnSchedule[2] = (String)dayComboBox.getSelectedItem();
        returnSchedule[3] = startTimeField.getText().trim();
        returnSchedule[4] = hoursField.getText().trim();

        return returnSchedule;
    }

    public void setInputForm(String[] scheduleForm){
        subjectField.setText(scheduleForm[0]);
        creditField.setText(scheduleForm[1]);
        dayComboBox.setSelectedItem(scheduleForm[2]);
        startTimeField.setText(scheduleForm[3]);
        hoursField.setText(scheduleForm[4]);
    }
}
