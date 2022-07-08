/******************************************************************************
 * The contents of this file are subject to the   Compiere License  Version 1.1
 * ("License"); You may not use this file except in compliance with the License
 * You may obtain a copy of the License at http://www.compiere.org/license.html
 * Software distributed under the License is distributed on an  "AS IS"  basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for
 * the specific language governing rights and limitations under the License.
 * The Original Code is             Compiere  ERP & CRM Smart Business Solution
 * The Initial Developer of the Original Code is Jorg Janke  and ComPiere, Inc.
 * Portions created by Jorg Janke are Copyright (C) 1999-2003 Jorg Janke, parts
 * created by ComPiere are Copyright (C) ComPiere, Inc.;   All Rights Reserved.
 * Contributor(s): ______________________________________.
 *****************************************************************************/
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.util.Env;


/**
 *  Depreciation Workfile Model
 *	@author	Teo Sarca, SC ARHIPAC SERVICE SRL
 */
public class MDepreciationWorkfile extends org.compiere.FA.model.MDepreciationWorkfile {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3814417671427820714L;

	/**
	 * 	Default Constructor
	 *	@param ctx context
	 *	@param M_InventoryLine_ID line
	 */
	public MDepreciationWorkfile (Properties ctx, int A_Depreciation_Workfile_ID, String trxName)
	{
		super (ctx,A_Depreciation_Workfile_ID, trxName);
		if (A_Depreciation_Workfile_ID == 0)
		{
			setPostingType(POSTINGTYPE_Actual);
			setA_QTY_Current(Env.ZERO);
			setA_Asset_Cost(Env.ZERO);
			setA_Accumulated_Depr(Env.ZERO);
			setA_Period_Posted(0);
			setA_Current_Period(0);
		}
	}	//	MDepreciationWorkfile
	
	/**
	 * 	Load Constructor
	 *	@param ctx context
	 *	@param rs result set
	 */
	public MDepreciationWorkfile (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MDepreciationWorkfile
}	//	MDepreciationWorkfile
