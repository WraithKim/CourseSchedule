package db;

import java.util.ArrayList;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class ScheduleList extends ArrayList<Schedule>{
    public void add(String[] input) throws Exception{
        Schedule newSchedule = new Schedule();
        newSchedule.setSubject(input[0]);
        newSchedule.parseCredit(input[1]);
        newSchedule.parseDay(input[2]);
        newSchedule.parseStartTime(input[3]);
        newSchedule.parseHours(input[4]);
        checkCollision(newSchedule);
        add(newSchedule);
    }

    private void checkCollision(Schedule current) throws Exception
    {
        /** 시간표에서 충돌이 일어나는지 검사한다. */
        for(Schedule existed : this)
        {
            if(current.getDay().equals(existed.getDay()))
            {
                int currentStartTime = Integer.parseInt(current.getStartTime());
                int currentHours = Integer.parseInt(current.getHours());
                int existedStartTime = Integer.parseInt(existed.getStartTime());
                int existedHours = Integer.parseInt(existed.getHours());
                if(currentStartTime >= existedStartTime + existedHours  ||
                        currentStartTime + currentHours <= existedStartTime)
                {//같은 요일에 시간이 겹치면 에러 반환
                    continue;
                }
                else
                {
                    throw new Exception("Conflict schedule -- "+current.getSubject()+" : "+existed.getSubject());
                }
            }
        }

    }

    @Override
    public Schedule get(int index) {
        return super.get(index);
    }
}
