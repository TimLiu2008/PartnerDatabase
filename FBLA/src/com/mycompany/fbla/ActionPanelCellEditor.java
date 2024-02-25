/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fbla;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JTable;
/**
 *
 * @author Tim
 */
public class ActionPanelCellEditor extends DefaultCellEditor{
    
    private ActionPanelEvent event;
    public ActionPanelCellEditor(ActionPanelEvent event){
        //Creates the event that will happen when remove button is pressed
        super(new JCheckBox());
        this.event = event;
}
    @Override
    public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int i, int i1){
        //Sets the background to the selection bacgkround
        ActionPanel action = new ActionPanel();
        action.btnPressEvent(event, i);
        action.setBackground(jtable.getSelectionBackground());
        return action;
    }
}
