/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2006 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software; you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY; without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program; if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;


/**
 *  Asset Transfer Model
 * @author www.arhipac.ro
 *
 */
public class MAssetTransfer extends org.compiere.FA.model.MAssetTransfer {
	/**
	 *
	 */
	private static final long serialVersionUID = 6542200284709386238L;
    
	public MAssetTransfer (Properties ctx, int X_A_Asset_Transfer_ID, String trxName)
    {
		super (ctx,X_A_Asset_Transfer_ID, trxName);
		if (X_A_Asset_Transfer_ID == 0)
		{
		    setDocStatus(DOCSTATUS_Drafted);
			setDocAction(DOCACTION_Complete);
			setProcessed(false);
		}
		
	}
	
	public MAssetTransfer (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}
}	//	MAssetTransfer
