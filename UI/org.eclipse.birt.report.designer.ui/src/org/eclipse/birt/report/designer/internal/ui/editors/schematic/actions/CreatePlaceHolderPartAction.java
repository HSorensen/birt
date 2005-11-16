
package org.eclipse.birt.report.designer.internal.ui.editors.schematic.actions;

import org.eclipse.birt.report.designer.core.model.SessionHandleAdapter;
import org.eclipse.birt.report.designer.internal.ui.views.actions.CreatePlaceHolderAction;
import org.eclipse.birt.report.designer.nls.Messages;
import org.eclipse.birt.report.model.api.CommandStack;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

public class CreatePlaceHolderPartAction extends WrapperSelectionAction
{

	private static final String DEFAULT_TEXT = Messages.getString( "CreatePlaceHolderAction.text" ); //$NON-NLS-1$
	
	public static String ID = "org.eclipse.birt.report.designer.ui.actions.CreatePlaceHolderAction";

	public CreatePlaceHolderPartAction( IWorkbenchPart part )
	{
		super( part );
		setId( ID );
		setText( DEFAULT_TEXT );
	}

	/**
	 * Gets the activity stack of the report
	 * 
	 * @return returns the stack
	 */
	protected CommandStack getActiveCommandStack( )
	{
		return SessionHandleAdapter.getInstance( ).getCommandStack( );
	}

	protected IAction createActionHandler( ISelection model )
	{
		return new CreatePlaceHolderAction( model );
	}

}
