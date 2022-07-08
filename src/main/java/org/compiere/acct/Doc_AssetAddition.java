package org.compiere.acct;

import java.sql.ResultSet;

import org.compiere.model.MAcctSchema;
import org.compiere.model.MDocType;

/**
 * @author Teo_Sarca, SC ARHIPAC SERVICE SRL
 * 
 * 
 */
public class Doc_AssetAddition extends org.compiere.FA.acct.Doc_AssetAddition {
	public Doc_AssetAddition (MAcctSchema[] as, ResultSet rs, String trxName) {
		super(as, rs, MDocType.DOCBASETYPE_GLDocument);
	}
}
