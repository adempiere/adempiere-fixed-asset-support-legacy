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
 ******************************************************************************/
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.util.Env;

/**
 *  Asset Acct Model
 *	@author	Teo Sarca, SC ARHIPAC SERVICE SRL
 */
public class MAssetAcct extends org.compiere.FA.model.MAssetAcct {
	/**
	 *
	 */
	private static final long serialVersionUID = 4779953750434068382L;

	/**
	 * DO NOT USE DIRECTLY
	 */
	public MAssetAcct (Properties ctx, int X_A_Asset_Acct_ID, String trxName) {
		super (ctx,X_A_Asset_Acct_ID, trxName);
		if (X_A_Asset_Acct_ID == 0) {
			setA_Salvage_Value(Env.ZERO);
		}
	}
	
	public MAssetAcct (Properties ctx, ResultSet rs, String trxName) {
		super (ctx, rs, trxName);
	}	
}	//	class MAssetAcct
