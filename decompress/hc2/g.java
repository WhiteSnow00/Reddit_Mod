// 
// Decompiled by Procyon v0.6.0
// 

package hc2;

import android.support.v4.media.c;

public final class g
{
    public final /* synthetic */ Class a;
    public final /* synthetic */ c b;
    
    public g(final Class a, final c b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Factory[type=");
        b.m(this.a, r, ",adapter=");
        r.append(this.b);
        r.append("]");
        return r.toString();
    }
}
