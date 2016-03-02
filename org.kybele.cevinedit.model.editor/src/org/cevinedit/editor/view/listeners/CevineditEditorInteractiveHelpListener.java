package org.cevinedit.editor.view.listeners;

import org.cevinedit.editor.view.constants.CevineditSashConstants;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;

import cevinedit.presentation.CevineditEditor;

public class CevineditEditorInteractiveHelpListener implements SelectionListener {

	protected CevineditEditor _editor = null;
	
	public CevineditEditorInteractiveHelpListener(CevineditEditor editor)
	{
		_editor = editor;
	}
	
	public static CevineditEditorInteractiveHelpListener i(CevineditEditor editor)
	{
		return new CevineditEditorInteractiveHelpListener(editor);
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		if (_editor.isHelpActivate())
		{
			if (e.getSource() instanceof Button)
			{
				Button b = (Button) e.getSource();
				b.setText(_editor.getTextLang("CevineditEditorInteractiveHelpListener", "ActivateHelpBtn"));
			}
			_editor.DeactivateHelp();
			_editor.getMainLayer().setWeights(CevineditSashConstants.TwoEditorsAndTools);
			}
		else
		{
			if (e.getSource() instanceof Button)
			{
				Button b = (Button) e.getSource();
				b.setText(_editor.getTextLang("CevineditEditorInteractiveHelpListener", "DeactivateHelpBtn"));
			}
			_editor.ActivateHelp();
		}
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		
	}
	
}
