package org.cevinedit.editor.view.listeners;

import org.cevinedit.editor.view.constants.CevineditToolsLabels;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.widgets.Text;

import cevinedit.presentation.CevineditEditor;

public class CevineditEditorFocusLostListener implements FocusListener {

	protected CevineditEditor _editor = null;
	protected String _property = null;
	public CevineditEditorFocusLostListener(CevineditEditor editor, String property)
	{
		_editor = editor;
		_property = property;
	}
	
	public static CevineditEditorFocusLostListener i(CevineditEditor editor, String property)
	{
		return new CevineditEditorFocusLostListener(editor, property);
	}
	
	@Override
	public void focusGained(FocusEvent e) {
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (e.getSource() instanceof Text)
		{
				if (_property.equals("sizeX"))
				{				
					String size = _editor.getActualPersonalization().get(CevineditToolsLabels.SIZE);
					if (size.equals("null"))
					{
						size = "0,0";
					}
					String parts[] = size.split(",");
					String x_introduzed = ((Text)e.getSource()).getText();
					try
					{
						x_introduzed = String.valueOf(Integer.valueOf(x_introduzed));
						((Text)e.getSource()).setText(x_introduzed);
					}
					catch (NumberFormatException ex)
					{
						x_introduzed = "0";
						((Text)e.getSource()).setText("0");
						MessageDialog.openError(_editor.getSite().getShell(), "Error de formato", "El valor introducido es incorrecto. Debe introducir un valor mayor o igual que 0");
					}
	
					String toSave = x_introduzed + "," + parts[1];
					_editor.getActualPersonalization().remove(CevineditToolsLabels.SIZE);
					_editor.getActualPersonalization().put(CevineditToolsLabels.SIZE, toSave);				
				}
				else if (_property.equals("sizeY"))
				{
					String size = _editor.getActualPersonalization().get(CevineditToolsLabels.SIZE);
					if (size.equals("null"))
					{
						size = "0,0";
					}
					String y_introduzed = ((Text)e.getSource()).getText();
					try
					{
						y_introduzed = String.valueOf(Integer.valueOf(y_introduzed));
						((Text)e.getSource()).setText(y_introduzed);
						
					}
					catch (NumberFormatException ex)
					{
						y_introduzed = "0";
						((Text)e.getSource()).setText("0");
						MessageDialog.openError(_editor.getSite().getShell(), "Error de formato", "El valor introducido es incorrecto. Debe introducir un valor mayor o igual que 0");
					}				
	
					String parts[] = size.split(",");
					String toSave = parts[0] + "," + y_introduzed;
					_editor.getActualPersonalization().remove(CevineditToolsLabels.SIZE);
					_editor.getActualPersonalization().put(CevineditToolsLabels.SIZE, toSave);
				}
				else
				{
					_editor.getActualPersonalization().remove(_property);
					_editor.getActualPersonalization().put(_property, ((Text)e.getSource()).getText());
				}
			

		}
		
	}

}
