// 
// Decompiled by Procyon v0.6.0
// 

package hc2;

import android.support.v4.media.c;

public final class h
{
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ c c;
    
    public h(final Class a, final Class b, final c c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Factory[type=");
        b.m(this.b, r, "+");
        b.m(this.a, r, ",adapter=");
        r.append(this.c);
        r.append("]");
        return r.toString();
    }
}
