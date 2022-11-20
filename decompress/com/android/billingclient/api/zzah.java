// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

final class zzah implements b, i, m, o, q, s
{
    public zzah() {
        throw null;
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
    
    public final void a(final k k, final ArrayList list) {
        List<Object> emptyList = list;
        if (list == null) {
            emptyList = Collections.emptyList();
        }
        nativeOnSkuDetailsResponse(k.a, k.b, emptyList.toArray(new SkuDetails[emptyList.size()]), 0L);
    }
    
    public final void b(final k k, final List<Purchase> list) {
        nativeOnQueryPurchasesResponse(k.a, k.b, list.toArray(new Purchase[list.size()]), 0L);
    }
    
    public final void c(final k k, final ArrayList list) {
        List<Object> emptyList = list;
        if (list == null) {
            emptyList = Collections.emptyList();
        }
        nativeOnPurchasesUpdated(k.a, k.b, emptyList.toArray(new Purchase[emptyList.size()]));
    }
    
    public final void d(final k k) {
        nativeOnBillingSetupFinished(k.a, k.b, 0L);
    }
    
    public final void e(final k k) {
        nativeOnAcknowledgePurchaseResponse(k.a, k.b, 0L);
    }
    
    public final void f(final k k, final String s) {
        nativeOnConsumePurchaseResponse(k.a, k.b, s, 0L);
    }
    
    public final void g() {
        nativeOnBillingServiceDisconnected();
    }
}
