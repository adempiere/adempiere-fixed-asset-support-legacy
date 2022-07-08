package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 *  Asset Addition Model
 *	@author Teo Sarca, SC ARHIPAC SERVICE SRL
 *
 * TODO: BUG: REG in depexp creates a zero if they have more sites Addition during 0?!
 */
public class MAssetAddition extends org.compiere.FA.model.MAssetAddition {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5977180589101094202L;
	
	public MAssetAddition(Properties ctx, int A_Asset_Addition_ID, String trxName) {
		super (ctx, A_Asset_Addition_ID, trxName);
		if (A_Asset_Addition_ID == 0) {
			setDocStatus(DOCSTATUS_Drafted);
			setDocAction(DOCACTION_Complete);
			setProcessed(false);
		}
	}	//	MAssetAddition

	public MAssetAddition(Properties ctx, ResultSet rs, String trxName) {
		super (ctx, rs, trxName);
	}	//	MAAssetAddition
}	//	MAssetAddition
