// 
// Decompiled by Procyon v0.6.0
// 

package v9;

import ak0.m;

public final class n
{
    public final String a;
    public final long b;
    public final String c;
    
    public n(final long b, final String a, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("SourceInfo{url='");
        ak0.n.w(k, this.a, '\'', ", length=");
        k.append(this.b);
        k.append(", mime='");
        return m.m(k, this.c, '\'', '}');
    }
}
