// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import ng2.e;
import java.util.ArrayList;
import zi2.t;

public final class h implements s
{
    public final zi2.s a;
    
    public h(final t a) {
        this.a = (zi2.s)a;
    }
    
    public final void a(final k k, final ArrayList list) {
        e.e((Object)k, "billingResult");
        this.a.l((Object)new com.android.billingclient.api.t(k, list));
    }
}
