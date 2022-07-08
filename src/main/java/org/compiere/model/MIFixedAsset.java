package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

/** 
 *	@author Teo Sarca, SC ARHIPAC SRL
 *	@version $Id
 */
public class MIFixedAsset extends org.compiere.FA.model.MIFixedAsset {
	private static final long serialVersionUID = 1L;
	/** Standard Constructor */
	public MIFixedAsset (Properties ctx, int I_FixedAsset_ID, String trxName)
	{
		super (ctx, I_FixedAsset_ID, trxName);
	}	//	MIFixedAsset

	/**
	 *  Load Constructor
	 *  @param ctx context
	 *  @param rs result set record
	 */
	public MIFixedAsset (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}	//	MIFixedAsset
}
