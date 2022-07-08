package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

/**	Asset Class
 *	@author Teo Sarca, SC Arhipac SRL
 *	@version $Id$
 */
public class MAssetClass extends org.compiere.FA.model.MAssetClass {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *
	 */
	public MAssetClass(Properties ctx, int A_Asset_Class_ID, String trxName)
	{
		super (ctx, A_Asset_Class_ID, trxName);
	}	//	MAssetClass

	/**
	 *  Load Constructor
	 *  @param ctx context
	 *  @param rs result set record
	 */
	public MAssetClass (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MAssetClass
}
