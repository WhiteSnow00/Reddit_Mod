// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import ng2.e;
import java.util.List;
import zi2.t;
import zi2.s;

public final class g implements o
{
    public final s a;
    
    public g(final t a) {
        this.a = (s)a;
    }
    
    public final void b(final k k, final List<Purchase> list) {
        e.e((Object)k, "billingResult");
        e.e((Object)list, "purchases");
        this.a.l((Object)new p(k, (List)list));
    }
}
