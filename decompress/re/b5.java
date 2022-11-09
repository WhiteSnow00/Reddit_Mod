// 
// Decompiled by Procyon v0.6.0
// 

package re;

import android.os.Bundle;

public final class b5 implements Runnable
{
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Bundle i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ String m;
    public final /* synthetic */ n5 n;
    
    public b5(final n5 n, final String f, final String g, final long h, final Bundle i, final boolean j, final boolean k, final boolean l) {
        this.n = n;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = null;
    }
    
    @Override
    public final void run() {
        this.n.H(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }
}
