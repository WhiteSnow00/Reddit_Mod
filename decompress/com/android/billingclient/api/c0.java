// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.ArrayList;
import com.google.android.gms.internal.play_billing.a;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public final class c0 extends BroadcastReceiver
{
    public final q a = a;
    public boolean b;
    
    public final void onReceive(final Context context, final Intent intent) {
        final k c = com.google.android.gms.internal.play_billing.a.c(intent, "BillingBroadcastManager");
        final Bundle extras = intent.getExtras();
        ArrayList list2 = null;
        Label_0178: {
            if (extras != null) {
                final ArrayList stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                final ArrayList stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                final ArrayList list = new ArrayList();
                if (stringArrayList != null && stringArrayList2 != null) {
                    int n = 0;
                    while (true) {
                        list2 = list;
                        if (n >= stringArrayList.size()) {
                            break Label_0178;
                        }
                        list2 = list;
                        if (n >= stringArrayList2.size()) {
                            break Label_0178;
                        }
                        final Purchase g = com.google.android.gms.internal.play_billing.a.g((String)stringArrayList.get(n), (String)stringArrayList2.get(n));
                        if (g != null) {
                            list.add(g);
                        }
                        ++n;
                    }
                }
                else {
                    com.google.android.gms.internal.play_billing.a.f("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
                    final Purchase g2 = com.google.android.gms.internal.play_billing.a.g(((BaseBundle)extras).getString("INAPP_PURCHASE_DATA"), ((BaseBundle)extras).getString("INAPP_DATA_SIGNATURE"));
                    if (g2 != null) {
                        list.add(g2);
                        list2 = list;
                        break Label_0178;
                    }
                    com.google.android.gms.internal.play_billing.a.f("BillingHelper", "Couldn't find single purchase data as well.");
                }
            }
            list2 = null;
        }
        this.a.b(c, list2);
    }
}
