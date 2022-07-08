package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;


/**
 * Depreciation Entry
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 */
public class MDepreciationEntry extends org.compiere.FA.model.MDepreciationEntry {
	private static final long serialVersionUID = 1L;

	/** Standard Constructor */
	public MDepreciationEntry(Properties ctx, int A_Depreciation_Entry_ID, String trxName)
	{
		super (ctx, A_Depreciation_Entry_ID, trxName);
		if (A_Depreciation_Entry_ID == 0)
		{
			MAcctSchema acctSchema = MClient.get(getCtx()).getAcctSchema();
			setC_AcctSchema_ID(acctSchema.get_ID());
			setC_Currency_ID(acctSchema.getC_Currency_ID());
			setA_Entry_Type (A_ENTRY_TYPE_Depreciation); // TODO: workaround
			setPostingType (POSTINGTYPE_Actual);	// A
			setProcessed (false);
			setProcessing (false);
			setPosted(false);
		}
	}
	
	/** Load Constructor */
	public MDepreciationEntry (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}
}
