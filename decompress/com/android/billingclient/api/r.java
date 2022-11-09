// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

public final class r
{
    public String a;
    public List<String> b;
    
    public static final class a
    {
        public String a;
        public ArrayList b;
        
        public final r a() {
            if (this.a == null) {
                throw new IllegalArgumentException("SKU type must be set");
            }
            if (this.b != null) {
                final r r = new r();
                r.a = this.a;
                r.b = this.b;
                return r;
            }
            throw new IllegalArgumentException("SKU list or SkuWithOffer list must be set");
        }
    }
}
