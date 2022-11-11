// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

public enum QosTier
{
    DEFAULT(0), 
    FAST_IF_RADIO_AWAKE(3), 
    NEVER(4), 
    UNMETERED_ONLY(1), 
    UNMETERED_OR_DAILY(2), 
    UNRECOGNIZED(-1);
    
    private static final SparseArray<QosTier> valueMap;
    private final int value;
    
    static {
        final SparseArray valueMap2 = new SparseArray();
        final QosTier qosTier;
        (valueMap = valueMap2).put(0, (Object)qosTier);
        final QosTier qosTier2;
        valueMap2.put(1, (Object)qosTier2);
        final QosTier qosTier3;
        valueMap2.put(2, (Object)qosTier3);
        final QosTier qosTier4;
        valueMap2.put(3, (Object)qosTier4);
        final QosTier qosTier5;
        valueMap2.put(4, (Object)qosTier5);
        final QosTier qosTier6;
        valueMap2.put(-1, (Object)qosTier6);
    }
    
    private QosTier(final int value) {
        this.value = value;
    }
    
    public static QosTier forNumber(final int n) {
        if (n == 0) {
            return QosTier.DEFAULT;
        }
        if (n == 1) {
            return QosTier.UNMETERED_ONLY;
        }
        if (n == 2) {
            return QosTier.UNMETERED_OR_DAILY;
        }
        if (n == 3) {
            return QosTier.FAST_IF_RADIO_AWAKE;
        }
        if (n != 4) {
            return null;
        }
        return QosTier.NEVER;
    }
    
    public final int getNumber() {
        return this.value;
    }
}
