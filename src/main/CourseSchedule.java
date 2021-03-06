package main;

import db.Schedule;
import db.ScheduleList;
import gui.frame.CourseList;
import gui.frame.MakeCourseSchedule;
import action.ActionControllable;
import fileio.ScheduleFileParser;
import fileio.ScheduleFileReader;
import fileio.ScheduleFileWriter;

import javax.swing.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class CourseSchedule implements ActionControllable{

    //gui
    private MakeCourseSchedule mcs;
    private CourseList cl;

    //db
    private ScheduleList clList;
    private ScheduleList mcsList;

    //fileio
    private final String fileName = "courselist.data";

    public CourseSchedule() {
        mcsList = new ScheduleList();

        mcs = new MakeCourseSchedule("MakeCourseSchedule", this, mcsList);
    }
    public void addSchedule(){
        String[] input = mcs.getInputForm();
        try{
            mcsList.add(input);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(mcs, e.getMessage());
            return;
        }
        mcs.updateTable(mcsList);
        String[] empty = new String[]{"", "", "", "", ""};
        mcs.setInputForm(empty);
    }
    public void showList(){
        try{
            clList = new ScheduleFileParser(new ScheduleFileReader(fileName).getStringList()).getScheduleList();
        }catch(Exception e){
            JOptionPane.showMessageDialog(mcs, e.getMessage());
            return;
        }
        cl = new CourseList("CourseList", this, clList);
    }
    public void loadScheduleList(){
        try{
             mcsList = new ScheduleFileParser(new ScheduleFileReader(fileName).getStringList()).getScheduleList();
        }catch(Exception e){
            JOptionPane.showMessageDialog(mcs, e.getMessage());
            return;
        }
        mcs.updateTable(mcsList);
        JOptionPane.showMessageDialog(mcs, "Load Complete");
    }
    public void saveScheduleList(){
        try{
            new ScheduleFileWriter(fileName, mcsList);
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(mcs, e.getMessage());
            return;
        }
        JOptionPane.showMessageDialog(mcs, "Save Complete");
    }
    public void selectTable(int rowIdx){
        System.out.println(rowIdx);
        String[] selectionForm = new String[5];
        Schedule selectedSchedule = clList.get(rowIdx);
        selectionForm[0] = selectedSchedule.getSubject();
        selectionForm[1] = selectedSchedule.getCredit();
        selectionForm[2] = selectedSchedule.getDay();
        selectionForm[3] = selectedSchedule.getStartTime();
        selectionForm[4] = selectedSchedule.getHours();
        mcs.setInputForm(selectionForm);
    }
}
