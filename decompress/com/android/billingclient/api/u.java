// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import android.os.BaseBundle;
import org.json.JSONObject;
import java.util.List;
import com.google.android.gms.internal.play_billing.zzp;
import org.json.JSONException;
import android.text.TextUtils;
import android.os.Bundle;
import java.util.ArrayList;
import com.google.android.gms.internal.play_billing.a;
import java.util.concurrent.Callable;

public final class u implements Callable<Void>
{
    public final /* synthetic */ String f;
    public final /* synthetic */ o g;
    public final /* synthetic */ d h;
    
    public u(final d h, final String f, final g g) {
        this.h = h;
        this.f = f;
        this.g = (o)g;
    }
    
    @Override
    public final Object call() throws Exception {
        final d h = this.h;
        final String f = this.f;
        final String value = String.valueOf(f);
        String concat;
        if (value.length() != 0) {
            concat = "Querying owned items, item type: ".concat(value);
        }
        else {
            concat = new String("Querying owned items, item type: ");
        }
        a.e("BillingClient", concat);
        final ArrayList<Purchase> list = new ArrayList<Purchase>();
        final boolean k = h.k;
        final boolean p = h.p;
        final String b = h.b;
        final Bundle bundle = new Bundle();
        ((BaseBundle)bundle).putString("playBillingLibraryVersion", b);
        int n = 1;
        if (k && p) {
            ((BaseBundle)bundle).putBoolean("enablePendingPurchases", true);
        }
        String s = null;
        Purchase.a a4 = null;
        Label_0861: {
            try {
                while (true) {
                    Bundle bundle2;
                    if (h.k) {
                        bundle2 = h.f.q0(h.e.getPackageName(), f, s, bundle);
                    }
                    else {
                        bundle2 = h.f.j0(h.e.getPackageName(), f, s);
                    }
                    k i = z.j;
                    int j = 0;
                    if (bundle2 == null) {
                        final Object[] array = new Object[n];
                        array[0] = "getPurchase()";
                        a.f("BillingClient", String.format("%s got null owned items list", array));
                    }
                    else {
                        final int a = com.google.android.gms.internal.play_billing.a.a(bundle2, "BillingClient");
                        final String d = com.google.android.gms.internal.play_billing.a.d(bundle2, "BillingClient");
                        final k.a a2 = new k.a();
                        a2.a = a;
                        a2.b = d;
                        final k a3 = a2.a();
                        if (a != 0) {
                            com.google.android.gms.internal.play_billing.a.f("BillingClient", String.format("%s failed. Response code: %s", "getPurchase()", a));
                            i = a3;
                            n = 1;
                        }
                        else if (((BaseBundle)bundle2).containsKey("INAPP_PURCHASE_ITEM_LIST") && ((BaseBundle)bundle2).containsKey("INAPP_PURCHASE_DATA_LIST") && ((BaseBundle)bundle2).containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                            final ArrayList stringArrayList = bundle2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                            final ArrayList stringArrayList2 = bundle2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                            final ArrayList stringArrayList3 = bundle2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                            if (stringArrayList == null) {
                                n = 1;
                                com.google.android.gms.internal.play_billing.a.f("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", "getPurchase()"));
                            }
                            else {
                                n = 1;
                                if (stringArrayList2 == null) {
                                    com.google.android.gms.internal.play_billing.a.f("BillingClient", String.format("Bundle returned from %s contains null purchases list.", "getPurchase()"));
                                }
                                else if (stringArrayList3 == null) {
                                    com.google.android.gms.internal.play_billing.a.f("BillingClient", String.format("Bundle returned from %s contains null signatures list.", "getPurchase()"));
                                }
                                else {
                                    i = z.k;
                                }
                            }
                        }
                        else {
                            n = 1;
                            com.google.android.gms.internal.play_billing.a.f("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", "getPurchase()"));
                        }
                    }
                    if (i != z.k) {
                        a4 = new Purchase.a(i, null);
                        break;
                    }
                    final ArrayList stringArrayList4 = bundle2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    final ArrayList stringArrayList5 = bundle2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    final ArrayList stringArrayList6 = bundle2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    while (j < stringArrayList5.size()) {
                        final String s2 = stringArrayList5.get(j);
                        final String s3 = stringArrayList6.get(j);
                        final String value2 = String.valueOf(stringArrayList4.get(j));
                        String concat2;
                        if (value2.length() != 0) {
                            concat2 = "Sku is owned: ".concat(value2);
                        }
                        else {
                            concat2 = new String("Sku is owned: ");
                        }
                        a.e("BillingClient", concat2);
                        try {
                            final Purchase purchase = new Purchase(s2, s3);
                            final JSONObject c = purchase.c;
                            if (TextUtils.isEmpty((CharSequence)c.optString("token", c.optString("purchaseToken")))) {
                                a.f("BillingClient", "BUG: empty/null token!");
                            }
                            list.add(purchase);
                            ++j;
                            continue;
                        }
                        catch (final JSONException ex) {
                            final String value3 = String.valueOf(ex);
                            final StringBuilder sb = new StringBuilder(value3.length() + 48);
                            sb.append("Got an exception trying to decode the purchase: ");
                            sb.append(value3);
                            a.f("BillingClient", sb.toString());
                            a4 = new Purchase.a(z.j, null);
                            break Label_0861;
                        }
                        break;
                    }
                    final String string = ((BaseBundle)bundle2).getString("INAPP_CONTINUATION_TOKEN");
                    final String value4 = String.valueOf(string);
                    String concat3;
                    if (value4.length() != 0) {
                        concat3 = "Continuation token: ".concat(value4);
                    }
                    else {
                        concat3 = new String("Continuation token: ");
                    }
                    a.e("BillingClient", concat3);
                    if (TextUtils.isEmpty((CharSequence)string)) {
                        a4 = new Purchase.a(z.k, list);
                        break;
                    }
                    s = string;
                }
            }
            catch (final Exception ex2) {
                final String value5 = String.valueOf(ex2);
                final StringBuilder sb2 = new StringBuilder(value5.length() + 57);
                sb2.append("Got exception trying to get purchases: ");
                sb2.append(value5);
                sb2.append("; try to reconnect");
                a.f("BillingClient", sb2.toString());
                a4 = new Purchase.a(z.l, null);
            }
        }
        final List<Purchase> a5 = a4.a;
        if (a5 != null) {
            this.g.c(a4.b, a5);
        }
        else {
            this.g.c(a4.b, (List<Purchase>)zzp.zzg());
        }
        return null;
    }
}
