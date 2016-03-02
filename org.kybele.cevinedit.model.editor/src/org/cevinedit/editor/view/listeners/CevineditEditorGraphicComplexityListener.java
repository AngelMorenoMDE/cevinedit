package org.cevinedit.editor.view.listeners;

import org.cevinedit.core.analytics.CevineditAnalytics;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;

import cevinedit.presentation.CevineditEditor;

public class CevineditEditorGraphicComplexityListener implements SelectionListener 
{
	protected CevineditEditor _editor = null;
	public CevineditEditorGraphicComplexityListener(CevineditEditor editor)
	{
		_editor = editor;
	}
	
	public static CevineditEditorGraphicComplexityListener i(CevineditEditor editor)
	{
		return new CevineditEditorGraphicComplexityListener(editor);
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		String message = "";
		
		CevineditAnalytics.i(_editor).generateGraphicComplexityInform();
		
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
		
	}
}