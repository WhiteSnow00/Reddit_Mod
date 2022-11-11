// 
// Decompiled by Procyon v0.6.0
// 

package hc2;

import android.support.v4.media.c;

public final class i
{
    public final /* synthetic */ Class a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ c c;
    
    public i(final Class a, final Class b, final f$s c) {
        this.a = a;
        this.b = b;
        this.c = (c)c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Factory[type=");
        b.m(this.a, r, "+");
        b.m(this.b, r, ",adapter=");
        r.append(this.c);
        r.append("]");
        return r.toString();
    }
}
