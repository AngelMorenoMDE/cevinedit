package org.cevinedit.editor.view.listeners;

import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

import cevinedit.presentation.CevineditEditor;

public class CevineditEditorToolsNodeFigureListener implements ModifyListener {

	protected CevineditEditor _editor = null;
	protected String _property = null;
	public CevineditEditorToolsNodeFigureListener(CevineditEditor editor, String property)
	{
		_editor = editor;
		_property = property;
	}
	
	@Override
	public void modifyText(ModifyEvent e) {
		if(e.getSource() instanceof Combo)
		{
			Combo c = (Combo)e.getSource();
			if (c.getItem(c.getSelectionIndex()).equals("SVG"))
			{
				for(Control ctrl :c.getParent().getChildren())
				{
					if (ctrl instanceof Composite && (!(ctrl instanceof Combo)) )
					{
						Composite ccc = (Composite) ctrl;
						for(Control ctr : ccc.getChildren())
						{
							if (ctr instanceof Button)
							{
								Button btn = (Button) ctr;
								btn.setText("Search SVG");
								
							}
						}
						

					}							
					ctrl.setVisible(true);
				}
			}
			else if (c.getItem(c.getSelectionIndex()).equals("Image"))
			{
				for(Control ctrl :c.getParent().getChildren())
				{
					if (ctrl instanceof Composite && (!(ctrl instanceof Combo)) )
					{
						Composite ccc = (Composite) ctrl;
						for(Control ctr : ccc.getChildren())
						{
							if (ctr instanceof Button)
							{
								Button btn = (Button) ctr;
								btn.setText("Search Image");
								
							}
						}
						

					}							
					ctrl.setVisible(true);
				}					
			}
			else if (c.getItem(c.getSelectionIndex()).equals("Polygon"))
			{
				for(Control ctrl :c.getParent().getChildren())
				{
					if (ctrl instanceof Composite && (!(ctrl instanceof Combo)) )
					{
						Composite ccc = (Composite) ctrl;
						for(Control ctr : ccc.getChildren())
						{
							if (ctr instanceof Button)
							{
								Button btn = (Button) ctr;
								btn.setText("Set Points");
								
							}
						}
						

					}							
					ctrl.setVisible(true);
				}						
			}
			else
			{
				for(Control ctrl :c.getParent().getChildren())
				{
					if (ctrl instanceof Composite && (!(ctrl instanceof Combo)) )
					{
						Composite ccc = (Composite) ctrl;
						ccc.setVisible(false);
						

					}							
				}
			}
			_editor.getActualPersonalization().remove(_property);
			_editor.getActualPersonalization().put(_property, ((Combo)e.getSource()).getText());
		}

	}

}
