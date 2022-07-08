package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;


public class MDepreciationExp extends org.compiere.FA.model.MDepreciationExp {
	private static final long serialVersionUID = 1L;
	
	/** Standard Constructor */
	public MDepreciationExp(Properties ctx, int depreciationExpId, String trxName)
	{
		super (ctx, depreciationExpId, trxName);
		/** 
		if (A_Depreciation_Exp_ID == 0)
		{
			setA_Account_Number (0);
			setA_Asset_ID (0);
			setA_Depreciation_Exp_ID (0);
			setA_Entry_Type (null);
			setA_Period (0);
			setDescription (null);
			setExpense (Env.ZERO);
			setIsDepreciated (false);
			setProcessed (false);
		}
		*/
	}
	
	/** Load Constructor */
	public MDepreciationExp (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}
}
