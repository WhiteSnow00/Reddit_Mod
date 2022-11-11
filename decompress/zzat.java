// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import java.util.Collections;
import java.util.List;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.0M5;
import com.bytedance.covode.number.Covode;
import X.0ME;
import X.0MB;
import X.0MA;
import X.0M8;
import X.0Ly;
import X.0Lv;

public final class zzat implements 0Lv, 0Ly, 0M8, 0MA, 0MB, 0ME
{
    public final long LIZ;
    
    static {
        Covode.recordClassIndex(2526);
    }
    
    public static native void nativeOnAcknowledgePurchaseResponse(final int p0, final String p1, final long p2);
    
    public static native void nativeOnBillingServiceDisconnected();
    
    public static native void nativeOnBillingSetupFinished(final int p0, final String p1, final long p2);
    
    public static native void nativeOnConsumePurchaseResponse(final int p0, final String p1, final String p2, final long p3);
    
    public static native void nativeOnPriceChangeConfirmationResult(final int p0, final String p1, final long p2);
    
    public static native void nativeOnPurchaseHistoryResponse(final int p0, final String p1, final PurchaseHistoryRecord[] p2, final long p3);
    
    public static native void nativeOnPurchasesUpdated(final int p0, final String p1, final Purchase[] p2);
    
    public static native void nativeOnQueryPurchasesResponse(final int p0, final String p1, final Purchase[] p2, final long p3);
    
    public static native void nativeOnSkuDetailsResponse(final int p0, final String p1, final SkuDetails[] p2, final long p3);
    
    @Override
    public final void LIZ(final 0M5 0m5) {
        MethodCollector.i(17709);
        nativeOnAcknowledgePurchaseResponse(0m5.LIZ, 0m5.LIZIZ, this.LIZ);
        MethodCollector.o(17709);
    }
    
    @Override
    public final void LIZ(final 0M5 0m5, final String s) {
        MethodCollector.i(17715);
        nativeOnConsumePurchaseResponse(0m5.LIZ, 0m5.LIZIZ, s, this.LIZ);
        MethodCollector.o(17715);
    }
    
    @Override
    public final void LIZ(final 0M5 0m5, final List<Purchase> list) {
        MethodCollector.i(17847);
        nativeOnQueryPurchasesResponse(0m5.LIZ, 0m5.LIZIZ, list.toArray(new Purchase[list.size()]), this.LIZ);
        MethodCollector.o(17847);
    }
    
    @Override
    public final void onBillingServiceDisconnected() {
        MethodCollector.i(17711);
        nativeOnBillingServiceDisconnected();
        MethodCollector.o(17711);
    }
    
    @Override
    public final void onBillingSetupFinished(final 0M5 0m5) {
        MethodCollector.i(17713);
        nativeOnBillingSetupFinished(0m5.LIZ, 0m5.LIZIZ, this.LIZ);
        MethodCollector.o(17713);
    }
    
    @Override
    public final void onPurchasesUpdated(final 0M5 0m5, final List<Purchase> list) {
        MethodCollector.i(17718);
        Object emptyList = list;
        if (list == null) {
            emptyList = Collections.emptyList();
        }
        nativeOnPurchasesUpdated(0m5.LIZ, 0m5.LIZIZ, (Purchase[])((List)emptyList).toArray(new Purchase[((List)emptyList).size()]));
        MethodCollector.o(17718);
    }
    
    @Override
    public final void onSkuDetailsResponse(final 0M5 0m5, final List<SkuDetails> list) {
        MethodCollector.i(17849);
        Object emptyList = list;
        if (list == null) {
            emptyList = Collections.emptyList();
        }
        nativeOnSkuDetailsResponse(0m5.LIZ, 0m5.LIZIZ, (SkuDetails[])((List)emptyList).toArray(new SkuDetails[((List)emptyList).size()]), this.LIZ);
        MethodCollector.o(17849);
    }
}
