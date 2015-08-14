package db;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class Schedule {
    private String subject = null;
    private int credit = 0;
    private enum dayEnum{ mon, tue, wed, thu, fri}
    private dayEnum day = null;
    private int startTime = 0;
    private int hours = 0;

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
        String temp = str.toLowerCase();
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
            default:
                throw new Exception("Unknown date -- "+str);
        }
    }//parseDay end
    void parseStartTime(String str) throws Exception
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
            this.startTime = temp;
        }
    }//parseTime end
    void parseHours(String str) throws Exception
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

        if(temp <= 0 || temp + this.startTime > 9)
        {
            throw new Exception("Out of bound of hour -- "+str);
        }
        else
        {
            this.hours = temp;
        }
    }//parseHour end

    /** getter method */
    public String getSubject() {
        return subject;
    }

    public String getCredit() {
        return Integer.toString(credit);
    }

    public String getDay() {
        switch(day)
        {
            case mon: return "mon";
            case tue: return "tue";
            case wed: return "wed";
            case thu: return "thu";
            case fri: return "fri";
        }
        return null;
    }

    public String getStartTime() {
        return Integer.toString(startTime);
    }

    public String getHours() {
        return Integer.toString(hours);
    }
}
