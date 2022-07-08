package org.compiere.acct;

import java.sql.ResultSet;

import org.compiere.model.MAcctSchema;
import org.compiere.model.MDocType;


/**
 * @author Anca Bradau www.arhipac.ro
 *
 */
public class Doc_AssetTransfer extends org.compiere.FA.acct.Doc_AssetTransfer {

	public Doc_AssetTransfer (MAcctSchema[] as, ResultSet rs, String trxName)
	{
		super(as, rs, MDocType.DOCBASETYPE_GLJournal);
	}

	
	protected String loadDocumentDetails() {
		return null;
	}	
}
