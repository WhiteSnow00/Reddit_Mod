// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import java.util.ArrayList;

public final class j
{
    public boolean a;
    public String b;
    public String c;
    public String d;
    public int e = 0;
    public ArrayList<SkuDetails> f;
    public boolean g;
    
    public j() {
        this.e = 0;
    }
    
    public static final class a
    {
        public String a;
        public ArrayList<SkuDetails> b;
        
        public final j a() {
            final ArrayList<SkuDetails> b = this.b;
            if (b != null && !b.isEmpty()) {
                final ArrayList<SkuDetails> b2 = this.b;
                for (int size = b2.size(), i = 0; i < size; ++i) {
                    if (b2.get(i) == null) {
                        throw new IllegalArgumentException("SKU cannot be null.");
                    }
                }
                if (this.b.size() > 1) {
                    final SkuDetails skuDetails = this.b.get(0);
                    final String a = skuDetails.a();
                    final ArrayList<SkuDetails> b3 = this.b;
                    for (int size2 = b3.size(), j = 0; j < size2; ++j) {
                        final SkuDetails skuDetails2 = b3.get(j);
                        if (!a.equals("play_pass_subs") && !skuDetails2.a().equals("play_pass_subs") && !a.equals(skuDetails2.a())) {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    final String optString = skuDetails.b.optString("packageName");
                    final ArrayList<SkuDetails> b4 = this.b;
                    for (int size3 = b4.size(), k = 0; k < size3; ++k) {
                        final SkuDetails skuDetails3 = b4.get(k);
                        if (!a.equals("play_pass_subs") && !skuDetails3.a().equals("play_pass_subs") && !optString.equals(skuDetails3.b.optString("packageName"))) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
                final j l = new j(0);
                l.a = (this.b.get(0).b.optString("packageName").isEmpty() ^ true);
                l.b = this.a;
                l.d = null;
                l.c = null;
                l.e = 0;
                l.f = this.b;
                l.g = false;
                return l;
            }
            throw new IllegalArgumentException("SkuDetails must be provided.");
        }
    }
}
