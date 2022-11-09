// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.a;
import java.io.IOException;
import bd.u;

public final class m extends u<j<Object>, IOException>
{
    public final /* synthetic */ a m;
    public final /* synthetic */ b n;
    public final /* synthetic */ n o;
    
    public m(final n o, final com.google.android.exoplayer2.upstream.cache.a m, final b n) {
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
