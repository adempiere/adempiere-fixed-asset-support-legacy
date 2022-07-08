/**
 * Copyright (C) 2003-2017, e-Evolution Consultants S.A. , http://www.e-evolution.com
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * Email: victor.perez@e-evolution.com, http://www.e-evolution.com , http://github.com/e-Evolution
 * Created by victor.perez@e-evolution.com , www.e-evolution.com
 */

package org.compiere.acct;

import java.math.BigDecimal;
import java.sql.ResultSet;

import org.compiere.model.MAcctSchema;
import org.compiere.model.MDocType;
import org.compiere.util.Env;

/**
 * Accounting Asset Split Document
 */
public class Doc_AssetSplit extends org.compiere.FA.acct.Doc_AssetSplit {

    public Doc_AssetSplit(MAcctSchema[] as, ResultSet rs, String trxName) {
        super(as, rs, MDocType.DOCBASETYPE_GLDocument);
    }


    protected String loadDocumentDetails() {
        return null;
    }


    public BigDecimal getBalance() {
        return Env.ZERO;
    }
}
