package DB;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class Schedule {
    private String subject = null;
    private int credit = 0;
    enum dayEnum{ mon, tue, wed, thu, fri, sat }
    private dayEnum day = null;
    private int time2Begin = 0;
    private int hour = 0;

    /** setter method */
    void setSubject(String subject) {
        this.subject = subject;
    }
    void parseCredit(String str) throws Exception
    {
        /** 문자열에서 학점을 추출해서 설정한다 */
        int temp = Integer.parseInt(str);
        if (temp <= 0 || temp > 20)
        {
            throw new Exception("Out of bound of credit -- "+str);
        }
        else
        {
            this.credit = temp;
        }
    }//parseCredit end
    void parseDay(String str) throws Exception
    {
        /** 문자열에서 요일을 추출해서 설정한다 */
        String temp = str.toLowerCase();//equals로 바꾸는 게 나을듯...
        switch(temp)
        {
            case "mon":
                this.day = dayEnum.mon;
                break;
            case "tue":
                this.day = dayEnum.tue;
                break;
            case "wed":
                this.day = dayEnum.wed;
                break;
            case "thu":
                this.day = dayEnum.thu;
                break;
            case "fri":
                this.day = dayEnum.fri;
                break;
            case "sat":
                this.day = dayEnum.sat;
                break;
            default:
                throw new Exception("Unknown date -- "+str);
        }
    }//parseDay end
    void parseTime(String str) throws Exception
    {
        /** 문자열에서 시작 시간 추출해서 설정한다 */
        int temp;
        try
        {
            temp = Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
            throw new Exception("Unresolved time -- "+str);
        }

        if(temp < 0 || temp > 9)
        {
            throw new Exception("Out of bound of time -- "+str);
        }
        else
        {
            this.time2Begin = temp;
        }
    }//parseTime end
    void parseHour(String str) throws Exception
    {
        /** 문자열에서 연강수를 추출해서 설정한다 */
        int temp;
        try
        {
            temp = Integer.parseInt(str);
        }
        catch(NumberFormatException e)
        {
            throw new Exception("Unresolved hour -- "+str);
        }

        if(temp <= 0 || temp + this.time2Begin > 9)
        {
            throw new Exception("Out of bound of hour -- "+str);
        }
        else
        {
            this.hour = temp;
        }
    }//parseHour end



    /** getter method */
    String getSubject() {
        return subject;
    }

    int getCredit() {
        return credit;
    }

    dayEnum getDay() {
        return day;
    }

    int getTime2Begin() {
        return time2Begin;
    }

    int getHour() {
        return hour;
    }
}
