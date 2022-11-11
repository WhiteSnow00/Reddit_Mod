// 
// Decompiled by Procyon v0.6.0
// 

package wc;

import ad.c0;
import va.f0;

public final class o
{
    public final int a;
    public final f0[] b;
    public final f[] c;
    public final com.google.android.exoplayer2.f0 d;
    public final Object e;
    
    public o(final f0[] b, final f[] array, final com.google.android.exoplayer2.f0 d, final h.a e) {
        this.b = b;
        this.c = array.clone();
        this.d = d;
        this.e = e;
        this.a = b.length;
    }
    
    public final boolean a(final o o, final int n) {
        final boolean b = false;
        if (o == null) {
            return false;
        }
        boolean b2 = b;
        if (c0.a(this.b[n], o.b[n])) {
            b2 = b;
            if (c0.a(this.c[n], o.c[n])) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean b(final int n) {
        return this.b[n] != null;
    }
}
