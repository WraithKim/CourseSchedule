package fileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class ScheduleFileReader {
    //스케쥴 파일을 읽어와서 한 줄씩 분리하는 클래스
    //파일명을 받으면 스캐너를 만들어서 한 줄씩 읽어서 ArrayList<String>을 저장하자

    private File scheduleFile;
    private ArrayList<String> stringList;

    public ScheduleFileReader(String scheduleFileName) throws Exception
    {
        scheduleFile = new File(scheduleFileName);
        makeStringList();
    }

    private void makeStringList() throws Exception
    {
        /** 파일에서 한 행씩 추출한다. */

        stringList = new ArrayList<>();
        Scanner fileReader;

        //파일이 있으면 스캐너 클래스를 만든다.
        try
        {
            fileReader = new Scanner(scheduleFile);
        }
        catch(FileNotFoundException e)
        {
            throw new Exception("File not Found");
        }

        while(fileReader.hasNext()) //파일에서 한 행을 읽어온다.
        {
            String fileLine = fileReader.nextLine();
            stringList.add(fileLine);
        }

        fileReader.close();
    }//makeStringList end

    public ArrayList<String> getStringList()
    {
        return (ArrayList<String>)stringList.clone();
    }
}
