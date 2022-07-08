package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Asset Product
 * @author Teo Sarca, SC ARHIPAC SERIVCE SRL
 */
public class MAssetProduct extends org.compiere.FA.model.MAssetProduct {
	private static final long serialVersionUID = 1L;
	
	/** Standard Constructor */
	public MAssetProduct (Properties ctx, int A_Asset_Product_ID, String trxName)
	{
		super (ctx, A_Asset_Product_ID, trxName);
	}
	
	/** Load Constructor */
	public MAssetProduct (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}
}
