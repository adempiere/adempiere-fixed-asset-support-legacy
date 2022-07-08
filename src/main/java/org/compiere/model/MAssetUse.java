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
 * Copyright (C) 2005 Robert KLEIN. robeklein@gmail.com *
 * Contributor(s): ______________________________________.
 *****************************************************************************/

package org.compiere.model;
import java.sql.ResultSet;
import java.util.Properties;

/** Generated Model for A_Asset_Use
 ** @version $Id: X_A_Asset.java,v 1.88 2004/08/27 21:26:37 jjanke Exp $ */
public class MAssetUse extends org.compiere.FA.model.MAssetUse {
	/**
	 *
	 */
	private static final long serialVersionUID = -1247516669047870893L;

	public MAssetUse (Properties ctx, int A_Asset_Use_ID, String trxName)
	{
		super (ctx, A_Asset_Use_ID, trxName);
		if (A_Asset_Use_ID == 0)
		{
			// empty block
		}
	}	//	MAssetUse

	/**
	 *  Load Constructor
	 *  @param ctx context
	 *  @param rs result set record
	 */
	public MAssetUse (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MAssetUse
}
