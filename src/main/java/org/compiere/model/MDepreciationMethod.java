package org.compiere.model;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * Method of adjusting the difference between depreciation (Calculated) and registered as (booked).
 * ex. MDI, LDI, YDI ...
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 */
public class MDepreciationMethod extends org.compiere.FA.model.MDepreciationMethod {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Standard Constructor */
	public MDepreciationMethod (Properties ctx, int A_Depreciation_Method_ID, String trxName)
	{
		super (ctx, A_Depreciation_Method_ID, trxName);
	}	//	MDepreciationMethod

	/**
	 *  Load Constructor
	 *  @param ctx context
	 *  @param rs result set record
	 */
	public MDepreciationMethod (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MDepreciationMethod
}
