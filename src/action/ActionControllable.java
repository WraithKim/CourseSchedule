package action;

/**
 * Created by Donghwan on 2015-05-27.
 */
public interface ActionControllable {
    void addSchedule();
    void showList();
    void loadScheduleList();
    void saveScheduleList();
    void selectTable(int rowIdx);
}
