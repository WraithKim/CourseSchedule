package gui.component;

import db.ScheduleList;
import action.ActionControllable;
import action.SelectActionListener;

import javax.swing.*;
import javax.swing.table.*;

/**
 * Created by Donghwan on 2015-05-26.
 */
public class JScheduleTable extends JTable{
    private SelectActionListener rowClicked;
    private ScheduleTableModel tableModel;

    public JScheduleTable(ScheduleList scheduleList, ActionControllable root) {
        tableModel = new ScheduleTableModel(scheduleList);
        this.setModel(tableModel);

        //action setting
        ListSelectionModel selectionModel = super.getSelectionModel();
        if(root != null) {
            rowClicked = new SelectActionListener(root);
            selectionModel.addListSelectionListener(rowClicked);
        }
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        super.setSelectionModel(selectionModel);

        super.setRowSelectionAllowed(true);
        super.setColumnSelectionAllowed(false);
        super.setCellSelectionEnabled(false);

    }

    public void updateTable(ScheduleList data){
        tableModel.setData(data);
        tableModel.fireTableDataChanged();
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }
}

class ScheduleTableModel extends AbstractTableModel {
    private ScheduleList data;
    private final String[] columnNames =  {"subject", "credit", "day", "start time", "hours"};

    public ScheduleTableModel(ScheduleList data) {
        this.data = data;
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String val = null;
        switch(columnIndex)
        {
            case 0:
                val =  data.get(rowIndex).getSubject();
                break;
            case 1:
                val = data.get(rowIndex).getCredit();
                break;
            case 2:
                val = data.get(rowIndex).getDay();
                break;
            case 3:
                val = data.get(rowIndex).getStartTime();
                break;
            case 4:
                val = data.get(rowIndex).getHours();
                break;
        }
        return val;
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    void setData(ScheduleList data){
        this.data = data;
    }
}