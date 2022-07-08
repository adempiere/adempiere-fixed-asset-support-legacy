package org.compiere.model;
import java.sql.ResultSet;
import java.util.Properties;

/**	Convention for the first year of depreciation (ex. FMCON, FYCON ...)
 *	@author Teo Sarca, SC Arhipac SRL
 *	@version $Id$
 */
public class MDepreciationConvention extends org.compiere.FA.model.MDepreciationConvention {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 	Default Constructor
	 *	@param ctx context
	 *	@param A_Depreciation_Convention_ID id
	 *	@param trxName transaction name
	 */
	public MDepreciationConvention(Properties ctx, int A_Depreciation_Convention_ID, String trxName)
	{
		super (ctx, A_Depreciation_Convention_ID, trxName);
		//~ if (A_Depreciation_Convention_ID == 0)
		//~ {
		//~ }
	}	//	MDepreciationConvention

	/**
	 *  Load Constructor
	 *  @param ctx context
	 *  @param rs result set record
	 */
	public MDepreciationConvention (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MDepreciationConvention
}
