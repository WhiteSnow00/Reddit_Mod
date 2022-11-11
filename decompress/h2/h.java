// 
// Decompiled by Procyon v0.6.0
// 

package h2;

import al0.g7;
import sg2.e;
import rg2.a;

public final class h
{
    public final a<Float> a;
    public final a<Float> b;
    public final boolean c;
    
    public h(final boolean c, final a a, final a b) {
        e.f((Object)b, "maxValue");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ScrollAxisRange(value=");
        r.append(this.a.invoke().floatValue());
        r.append(", maxValue=");
        r.append(this.b.invoke().floatValue());
        r.append(", reverseScrolling=");
        return g7.m(r, this.c, ')');
    }
}
