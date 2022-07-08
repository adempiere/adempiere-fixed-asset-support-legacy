package org.compiere.model;

import java.sql.ResultSet;
import java.util.Properties;

/**
 * Asset Type
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 */
public class MAssetType extends org.compiere.FA.model.MAssetType {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Standard Constructor */
	public MAssetType (Properties ctx, int A_Asset_Type_ID, String trxName)
	{
		super (ctx, A_Asset_Type_ID, trxName);
	}
	
	/** Load Constructor */
	public MAssetType (Properties ctx, ResultSet rs, String trxName)
	{
		super (ctx, rs, trxName);
	}
}	// class MAssetType
