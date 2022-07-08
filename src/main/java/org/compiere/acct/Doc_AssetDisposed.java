package org.compiere.acct;

import java.sql.ResultSet;

import org.compiere.model.MAcctSchema;
import org.compiere.model.MDocType;


/**
 * @author Teo_Sarca, SC ARHIPAC SERVICE SRL
 */
public class Doc_AssetDisposed extends org.compiere.FA.acct.Doc_AssetDisposed {
	/**
	 * @param ass
	 * @param clazz
	 * @param rs
	 * @param defaultDocumentType
	 * @param trxName
	 */
	public Doc_AssetDisposed (MAcctSchema[] as, ResultSet rs, String trxName) {
		super(as, rs, MDocType.DOCBASETYPE_GLDocument);
	}
}
