// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import android.text.TextUtils;

public final class PurchaseHistoryRecord
{
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PurchaseHistoryRecord)) {
            return false;
        }
        o.getClass();
        return TextUtils.equals((CharSequence)null, (CharSequence)null) && TextUtils.equals((CharSequence)null, (CharSequence)null);
    }
    
    @Override
    public final int hashCode() {
        throw null;
    }
    
    @Override
    public final String toString() {
        String concat;
        if ("null".length() != 0) {
            concat = "PurchaseHistoryRecord. Json: ".concat("null");
        }
        else {
            concat = new String("PurchaseHistoryRecord. Json: ");
        }
        return concat;
    }
}
