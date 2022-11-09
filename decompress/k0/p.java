// 
// Decompiled by Procyon v0.6.0
// 

package k0;

import l0.s;
import u2.i;

public final class p implements o
{
    public final boolean a;
    public final zg2.p<i, i, s<i>> b;
    
    public p(final boolean a, final zg2.p<? super i, ? super i, ? extends s<i>> b) {
        this.a = a;
        this.b = (zg2.p<i, i, s<i>>)b;
    }
    
    @Override
    public final s<i> a(final long n, final long n2) {
        return (s)this.b.invoke((Object)new i(n), (Object)new i(n2));
    }
    
    @Override
    public final boolean g() {
        return this.a;
    }
}
