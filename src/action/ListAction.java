package action;

import main.CourseSchedule;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class ListAction implements ActionListener {
    private ActionControllable parent;
    public ListAction(ActionControllable root) {
        this.parent = root;
    }

    @Override

    public void actionPerformed(ActionEvent e) {
        parent.showList();
    }
}
