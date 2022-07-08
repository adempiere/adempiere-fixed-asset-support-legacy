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
 *  Asset Addition Model
 *	@author Teo Sarca, SC ARHIPAC SERVICE SRL
 *
 *
 */
public class MAssetChange extends org.compiere.FA.model.MAssetChange {
	/**
	 *
	 */
	private static final long serialVersionUID = 5906751299228645904L;
	
	/**
	 * 	Default Constructor
	 *	@param ctx context
	 *	@param assetChangeId line
	 *  @param trxName
	 */
	public MAssetChange (Properties ctx, int assetChangeId, String trxName)
	{
		super (ctx, assetChangeId, trxName);
	}	//	MAssetChange
	
	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 */
	public MAssetChange (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MInventoryLine
}	//	MAssetChange