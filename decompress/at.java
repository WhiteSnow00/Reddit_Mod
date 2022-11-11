// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.Iterator;
import com.android.billingclient.api.SkuDetails;
import X.0ME;
import X.0MD;
import java.util.ArrayList;
import com.appsflyer.AFLogger;
import com.android.billingclient.api.Purchase;
import java.util.List;
import X.0M5;
import com.bytedance.covode.number.Covode;
import X.0MB;

public final class at implements 0MB
{
    public /* synthetic */ av values;
    
    static {
        Covode.recordClassIndex(2621);
    }
    
    public at(final av values) {
        this.values = values;
    }
    
    @Override
    public final void onPurchasesUpdated(final 0M5 0m5, final List<Purchase> list) {
        final av values = this.values;
        try {
            if (0m5.LIZ != 0 || list == null) {
                final StringBuilder sb = new StringBuilder("Failed to setup Ars Play billing service: ");
                sb.append(0m5.LIZ);
                sb.append(" ");
                sb.append(0m5.LIZIZ);
                AFLogger.AFLogger$LogLevel(sb.toString());
                return;
            }
            if (values.AFInAppEventType == null) {
                AFLogger.AFLogger$LogLevel("Got Ars billing callback but billing client is missing!");
                return;
            }
            final ArrayList list2 = new ArrayList();
            final Iterator<Purchase> iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(iterator.next().getSku());
            }
            final 0MD.a liz = 0MD.LIZ();
            liz.LIZ = "subs";
            liz.LIZ(list2);
            values.AFInAppEventType.LIZ(liz.LIZ(), new 0ME() {
                public /* synthetic */ List AFInAppEventType = list;
                
                static {
                    Covode.recordClassIndex(2625);
                }
                
                @Override
                public final void onSkuDetailsResponse(final 0M5 0m5, final List<SkuDetails> list) {
                    try {
                        if (0m5.LIZ == 0 && list != null) {
                            final ArrayList list2 = new ArrayList();
                            final Iterator<SkuDetails> iterator = list.iterator();
                            while (iterator.hasNext()) {
                                list2.add(iterator.next().LIZ());
                            }
                            final ArrayList list3 = new ArrayList();
                            for (final Purchase purchase : this.AFInAppEventType) {
                                if (list2.contains(purchase.getSku())) {
                                    list3.add(purchase);
                                }
                            }
                            if (list3.isEmpty()) {
                                return;
                            }
                            av.AFKeystoreWrapper(values, false, list3);
                        }
                    }
                    finally {
                        final Throwable t;
                        if (t instanceof NoSuchMethodError || t instanceof NoClassDefFoundError) {
                            AFLogger.AFLogger$LogLevel("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                        }
                        AFLogger.values("Failed to log new purchase", t);
                    }
                }
            });
        }
        finally {
            final Throwable t;
            if (t instanceof NoSuchMethodError || t instanceof NoClassDefFoundError) {
                AFLogger.AFLogger$LogLevel("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.values("Failed to query new purchase details", t);
        }
    }
}
