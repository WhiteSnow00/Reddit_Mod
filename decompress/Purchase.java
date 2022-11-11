// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import java.util.List;
import android.text.TextUtils;
import org.json.JSONArray;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class Purchase
{
    public final String a;
    public final String b;
    public final JSONObject c;
    
    public Purchase(final String a, final String b) throws JSONException {
        this.a = a;
        this.b = b;
        this.c = new JSONObject(a);
    }
    
    public final String a() {
        return this.c.optString("orderId");
    }
    
    public final int b() {
        if (this.c.optInt("purchaseState", 1) != 4) {
            return 1;
        }
        return 2;
    }
    
    public final ArrayList<String> c() {
        final ArrayList list = new ArrayList();
        if (this.c.has("productIds")) {
            final JSONArray optJSONArray = this.c.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); ++i) {
                    list.add(optJSONArray.optString(i));
                }
            }
        }
        else if (this.c.has("productId")) {
            list.add(this.c.optString("productId"));
        }
        return list;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Purchase)) {
            return false;
        }
        final Purchase purchase = (Purchase)o;
        return TextUtils.equals((CharSequence)this.a, (CharSequence)purchase.a) && TextUtils.equals((CharSequence)this.b, (CharSequence)purchase.b);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        String concat;
        if (value.length() != 0) {
            concat = "Purchase. Json: ".concat(value);
        }
        else {
            concat = new String("Purchase. Json: ");
        }
        return concat;
    }
    
    public static final class a
    {
        public final List<Purchase> a;
        public final k b;
        
        public a(final k b, final ArrayList a) {
            this.a = a;
            this.b = b;
        }
    }
}
