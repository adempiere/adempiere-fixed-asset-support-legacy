package org.compiere.model;
import java.sql.ResultSet;
import java.util.Properties;


/**
 * Depreciation Engine (eg. SL, ARH_VAR ...)
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 */
public class MDepreciation extends org.compiere.FA.model.MDepreciation {
	private static final long serialVersionUID = 1L;

	/** Standard Constructor */
	public MDepreciation (Properties ctx, int A_Depreciation_ID, String trxName)
	{
		super (ctx, A_Depreciation_ID, trxName);
	}	//	MDepreciation

	/**
	 *  Load Constructor
	 *  @param ctx context
	 *  @param rs result set record
	 */
	public MDepreciation (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MDepreciation
}
