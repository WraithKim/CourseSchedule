package GUI;

import GUI.component.*;
import main.CourseSchedule;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class MakeCourseSchedule extends JFrame{
    private JScheduleTextField subjectField;
    private JScheduleTextField creditField;
    private JScheduleComboBox dayComboBox;
    private JScheduleTextField startTimeField;
    private JScheduleTextField hoursField;

    private JAddButton addBt;
    private JListButton listBt;
    private JLoadButton loadBt;
    private JSaveButton saveBt;

    private JScheduleTextField MyCourse;
    private JScheduleTable tempTable;

    private JPanel buttonPanel;
    private JPanel inputPanel;
    private JPanel tablePanel;
    private JPanel scheduleFormPanel;

    public MakeCourseSchedule(String title, CourseSchedule root) throws HeadlessException {
        super(title);
        this.setInterior();

        this.setSize(700, 500);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private JScheduleTextField getSubjectField() {
        return subjectField;
    }

    private JScheduleTextField getCreditField() {
        return creditField;
    }

    private JScheduleComboBox getDayComboBox() {
        return dayComboBox;
    }

    private JScheduleTextField getStartTimeField() {
        return startTimeField;
    }

    private JScheduleTextField getHoursField() {
        return hoursField;
    }

    private JAddButton getAddBt() {
        return addBt;
    }

    private JListButton getListBt() {
        return listBt;
    }

    private JLoadButton getLoadBt() {
        return loadBt;
    }

    private JSaveButton getSaveBt() {
        return saveBt;
    }

    private JScheduleTextField getMyCourse() {
        return MyCourse;
    }

    private JScheduleTable getTempTable() {
        return tempTable;
    }

    private JPanel getButtonPanel() {
        return buttonPanel;
    }

    private JPanel getInputPanel() {
        return inputPanel;
    }

    private JPanel getTablePanel() {
        return tablePanel;
    }

    private JPanel getScheduleFormPanel() {
        return scheduleFormPanel;
    }

    private void setInterior(){
        generateComponent();

    }

    private void generateComponent(){
        this.subjectField = new JScheduleTextField();
        this.creditField = new JScheduleTextField();
        this.dayComboBox = new JScheduleComboBox();
        this.startTimeField = new JScheduleTextField();
        this.hoursField = new JScheduleTextField();

        this.addBt = new JAddButton();
        this.listBt = new JListButton();
        this.loadBt = new JLoadButton();
        this.saveBt = new JSaveButton();

        this.buttonPanel = new JPanel();
        this.inputPanel = new JPanel();
        this.tablePanel = new JPanel();
        this.scheduleFormPanel  = new JPanel();
    }
}
