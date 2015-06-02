package action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class AddActionListener implements ActionListener {
    private final ActionControllable parent;

    public AddActionListener(ActionControllable root) {
        this.parent = root;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        parent.addSchedule();
    }
}
