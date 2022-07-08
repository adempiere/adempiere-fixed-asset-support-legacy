package org.compiere.acct;

import java.sql.ResultSet;

import org.compiere.model.MAcctSchema;
import org.compiere.model.MDocType;


/**
 * @author Anca Bradau www.arhipac.ro
 *
 */
public class Doc_AssetReval extends org.compiere.FA.acct.Doc_AssetReval   {

	public Doc_AssetReval (MAcctSchema[] as, ResultSet rs, String trxName) {
		super(as, rs, MDocType.DOCBASETYPE_GLJournal);
	}
}
