package org.compiere.acct;

import java.sql.ResultSet;

import org.compiere.model.MAcctSchema;


/**
 *  @author Teo Sarca, SC ARHIPAC SERVICE SRL
 *  @version  $Id$
 *
 */
public class Doc_DepreciationEntry extends org.compiere.FA.acct.Doc_DepreciationEntry {
	
	/**
	 *  Constructor
	 * 	@param accountSchemas accounting schemata
	 * 	@param rs record
	 * 	@parem trxName trx
	 */
	public Doc_DepreciationEntry (MAcctSchema[] accountSchemas, ResultSet rs, String trxName)
	{
		super(accountSchemas, rs, null);
	}	//	Doc_A_Depreciation_Entry
}

