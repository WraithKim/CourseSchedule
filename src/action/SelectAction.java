package action;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class SelectAction implements ListSelectionListener{
    private final ActionControllable parent;

    public SelectAction(ActionControllable root) {
        this.parent = root;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel)e.getSource();
        int rowIdx = lsm.getMaxSelectionIndex();
        parent.selectTable(rowIdx);
    }
}
