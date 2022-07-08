package org.compiere.model;

import java.util.Properties;


/**
 * Asset Disposal Model
 * @author Teo Sarca, SC ARHIPAC SERVICE SRL
 * 
 * 
 */
public class MAssetDisposed extends org.compiere.FA.model.MAssetDisposed {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1763997880662445638L;

	public MAssetDisposed (Properties ctx, int A_Asset_Disposed_ID, String trxName)
	{
		super (ctx, A_Asset_Disposed_ID, trxName);
		if (A_Asset_Disposed_ID == 0)
		{
			setProcessed (false);
			setProcessing (false);
		}
		
	}
}
