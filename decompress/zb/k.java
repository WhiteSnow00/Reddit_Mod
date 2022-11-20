// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.a;
import java.io.IOException;
import bd.u;

public final class k extends u<h<Object>, IOException>
{
    public final a m;
    public final b n;
    public final l o;
    
    public k(final l o, final com.google.android.exoplayer2.upstream.cache.a m, final b n) {
        this.o = o;
        this.m = (a)m;
        this.n = n;
    }
    
    @Override
    public final Object d() throws Exception {
        final i i = new i(4, this.m, this.n, (i.i$a)this.o.b);
        i.load();
        final T f = i.f;
        f.getClass();
        return f;
    }
}
