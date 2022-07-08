/**
 * 
 */
package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;


/**
 * @author Anca Bradau www.arhipac.ro
 *
 */
public class MAssetReval extends org.compiere.FA.model.MAssetReval {
	private static final long serialVersionUID = 1L;

	public MAssetReval(Properties ctx, int X_A_Asset_Reval_ID, String trxName)
	{
		super(ctx, X_A_Asset_Reval_ID, trxName);
		if (X_A_Asset_Reval_ID == 0)
		{
		    setDocStatus(DOCSTATUS_Drafted);
			setDocAction(DOCACTION_Complete);
			setProcessed(false);
		}
	}
	public MAssetReval(Properties ctx, ResultSet rs, String trxName)
	{
       super (ctx, rs, trxName);
    } 
}
