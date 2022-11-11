// 
// Decompiled by Procyon v0.6.0
// 

package fc;

import java.util.List;
import ec.i;
import ec.b;
import com.google.android.exoplayer2.n;
import cb.h;
import jb.e;
import hb.d;
import ec.j;
import java.io.IOException;
import cb.c;
import ad.u;

public final class a extends u<c, IOException>
{
    public final /* synthetic */ com.google.android.exoplayer2.upstream.a m;
    public final /* synthetic */ int n;
    public final /* synthetic */ j o;
    
    public a(final com.google.android.exoplayer2.upstream.cache.a m, final int n, final j o) {
        this.m = (com.google.android.exoplayer2.upstream.a)m;
        this.n = n;
        this.o = o;
    }
    
    public final Object d() throws Exception {
        final com.google.android.exoplayer2.upstream.a m = this.m;
        final int n = this.n;
        final j o = this.o;
        final i l = o.l;
        final Object o2 = null;
        Object o3 = null;
        if (l == null) {
            o3 = o2;
        }
        else {
            Object o4 = o.f;
            final String p = ((n)o4).p;
            Object o5;
            if (p != null && (p.startsWith("video/webm") || p.startsWith("audio/webm"))) {
                o5 = new d(0);
            }
            else {
                o5 = new e(0);
            }
            final cc.d d = new cc.d((h)o5, n, (n)o4);
            Label_0247: {
                Label_0211: {
                    Label_0202: {
                        i a;
                        try {
                            final i i = o.l;
                            i.getClass();
                            o4 = o.m();
                            if (o4 == null) {
                                break Label_0211;
                            }
                            a = i.a((i)o4, ((List<b>)o.g).get(0).a);
                            if (a == null) {
                                dc.c.b(m, o, d, i);
                                break Label_0202;
                            }
                        }
                        finally {
                            break Label_0247;
                        }
                        o4 = a;
                    }
                    dc.c.b(m, o, d, (i)o4);
                }
                final h h;
                h.release();
                final cb.u j = d.m;
                o3 = o2;
                if (j instanceof c) {
                    o3 = j;
                    return o3;
                }
                return o3;
            }
            d.f.release();
        }
        return o3;
    }
}
