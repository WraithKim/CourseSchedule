package fileio;

import db.Schedule;
import db.ScheduleList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class ScheduleFileWriter {

    private File scheduleFile;
    private ArrayList<String[]> stringsList;

    public ScheduleFileWriter(String fileName, ScheduleList list)throws Exception{
        scheduleFile = new File(fileName);
        makeStringList(list);
        writeStringList();
    }

    private void makeStringList(ScheduleList list){
        stringsList = new ArrayList<>();
        for(Schedule schedule : list){
            String[] str = new String[5];
            str[0] = schedule.getSubject();
            str[1] = schedule.getCredit();
            str[2] = schedule.getDay();
            str[3] = schedule.getStartTime();
            str[4] = schedule.getHours();
            stringsList.add(str);
        }
    }

    private void writeStringList()throws Exception{
        PrintWriter pw;
        try{
            pw = new PrintWriter(scheduleFile, "UTF-8");
        }catch(FileNotFoundException e){
            throw new Exception("File not found");
        }
        for(String[] strings : stringsList){
            StringJoiner sj = new StringJoiner(":");
            for(String string : strings)
            {
                sj.add(string);
            }
            pw.println(sj.toString());
        }
        pw.close();
    }
}
