// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.List;
import com.android.billingclient.api.Purchase$PurchasesResult;
import com.appsflyer.AFLogger;
import X.0M5;
import com.bytedance.covode.number.Covode;
import X.0Ly;

public final class aw implements 0Ly
{
    public /* synthetic */ av values;
    
    static {
        Covode.recordClassIndex(2627);
    }
    
    public aw(final av values) {
        this.values = values;
    }
    
    @Override
    public final void onBillingServiceDisconnected() {
    }
    
    @Override
    public final void onBillingSetupFinished(final 0M5 0m5) {
        final av values = this.values;
        values.values.submit(new Runnable() {
            static {
                Covode.recordClassIndex(2626);
            }
            
            @Override
            public final void run() {
                try {
                    if (0m5.LIZ != 0) {
                        return;
                    }
                    if (values.valueOf.AFInAppEventType("ars_history_sent")) {
                        return;
                    }
                    final Purchase$PurchasesResult queryPurchases = values.AFInAppEventType.queryPurchases("subs");
                    final List purchasesList = queryPurchases.getPurchasesList();
                    if (queryPurchases.getResponseCode() != 0 || purchasesList == null || purchasesList.isEmpty()) {
                        AFLogger.AFLogger$LogLevel("Failed to query purchases history");
                        return;
                    }
                    av.AFKeystoreWrapper(values, true, purchasesList);
                }
                finally {
                    final Throwable t;
                    if (t instanceof NoSuchMethodError || t instanceof NoClassDefFoundError) {
                        AFLogger.AFLogger$LogLevel("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                    }
                    AFLogger.values("Failed to log purchases history", t);
                }
            }
        });
    }
}
