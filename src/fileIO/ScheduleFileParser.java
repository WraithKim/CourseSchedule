package fileio;

import db.ScheduleList;

import java.util.ArrayList;

/**
 * Created by Donghwan on 2015-05-31.
 */
public class ScheduleFileParser {
        private ArrayList<String[]> parsedLineList;
        private ScheduleList scheduleList;
        //how to parse
        //1. separate : split(":")
        //2. ignore space : trim()
        //error detecting
        //check elem#
        private void parseLine(String line) throws Exception
        {
            /** 파일의 한 줄에서 스케쥴에 관한 부분을 뽑아낸다. */
            line = line.trim();

            //의미 없는 행은 넘긴다.
            if(line.isEmpty() || line.matches("//+[\\x20-\\x7E]*"))
            {
                return;
            }

            String[] wordList  = line.split(":"); //각 부분을 분리
            if(wordList.length != 5) //들어온 데이터가 부분의 개수와 맞는지 확인
            {
                throw new Exception("Irregular schedule line -- " + line);
            }

            for(int i = 0; i < wordList.length; i++)
            {
                wordList[i] = wordList[i].trim();
                if(wordList[i].isEmpty()){//비어있는 항목이 존재하면 걸러낸다.
                    throw new Exception("Irregular schedule line -- " + line);
                }
            }

            parsedLineList.add(wordList);
        }

        private void parseList(ArrayList<String> stringList) throws Exception
        {
            /** 파일의 행을 저장한 리스트에서 스케쥴을 추출한다. */
            parsedLineList = new ArrayList<>();
            for(String line : stringList)
            {
                parseLine(line);//파싱한 후 개수가 다르면 에러 반환 아니면 리스트에 넣음
            }
        }

        private void makeScheduleList() throws Exception{
            scheduleList = new ScheduleList();
            for(String[] schedule : parsedLineList)
            {
                scheduleList.add(schedule);
            }
        }

        public ScheduleFileParser(ArrayList<String> stringList) throws Exception
        {
            /** 생성자 */
            parseList(stringList);
            makeScheduleList();
        }

        /** getter method */
        @SuppressWarnings("unchecked")
        public ScheduleList getScheduleList() {
            return (ScheduleList)scheduleList.clone();
        }
}
