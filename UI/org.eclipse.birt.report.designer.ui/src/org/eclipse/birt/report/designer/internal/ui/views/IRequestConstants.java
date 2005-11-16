/*******************************************************************************
 * Copyright (c) 2004 Actuate Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Actuate Corporation  - initial API and implementation
 *******************************************************************************/

package org.eclipse.birt.report.designer.internal.ui.views;

/**
 * The costants used by request
 */

public interface IRequestConstants
{

	String REQUEST_KEY_RESULT = "result"; //$NON-NLS-1$

	String REQUEST_TYPE_INSERT = "insert"; //$NON-NLS-1$

	String REQUEST_TYPE_EDIT = "edit"; //$NON-NLS-1$
	
	String REQUEST_CREATE_PLACEHOLDER = "create-placeholder"; //$NON-NLS-1$
	
	String REQUEST_TRANSFER_PLACEHOLDER = "transfer-placeholder"; //$NON-NLS-1$

	/**
	 * @deprecated
	 */
	String REQUEST_TYPE_RENAME = "rename"; //$NON-NLS-1$

	String REQUEST_TYPE_DELETE = "delete"; //$NON-NLS-1$

	String REQUEST_KEY_INSERT_SLOT = "insert-slot"; //$NON-NLS-1$

	String REQUEST_KEY_INSERT_TYPE = "insert-type"; //$NON-NLS-1$

	String REQUEST_KEY_INSERT_POSITION = "insert-position"; //$NON-NLS-1$

	/**
	 * @deprecated
	 */
	String REQUEST_KEY_RENAME_NEWNAME = "rename-newname"; //$NON-NLS-1$
}