// 
// Decompiled by Procyon v0.6.0
// 

package ic;

import com.google.android.exoplayer2.source.hls.playlist.c$d;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import bd.u;
import zb.k;
import com.google.android.exoplayer2.source.hls.playlist.d;
import zb.h;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.b;
import bd.b0;
import java.util.ArrayList;
import java.util.HashSet;
import com.google.android.exoplayer2.source.hls.playlist.c$c;
import com.google.android.exoplayer2.upstream.i$a;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistParser;
import java.util.concurrent.Executor;
import com.google.android.exoplayer2.upstream.cache.a$b;
import com.google.android.exoplayer2.q;
import jc.c;
import zb.l;

public final class a extends l<jc.c>
{
    public a() {
        throw null;
    }
    
    public a(final q q, final a$b a$b, final Executor executor) {
        super(q, (i$a)new HlsPlaylistParser(), a$b, executor);
    }
    
    public static void g(final com.google.android.exoplayer2.source.hls.playlist.c c, final c$c c$c, final HashSet set, final ArrayList list) {
        final String a = ((jc.c)c).a;
        final long n = c.h + ((c$d)c$c).j;
        final String l = ((c$d)c$c).l;
        if (l != null) {
            final Uri d = b0.d(a, l);
            if (set.add(d)) {
                list.add(new b(n, zb.l.c(d)));
            }
        }
        list.add(new b(n, new com.google.android.exoplayer2.upstream.b(b0.d(a, ((c$d)c$c).f), ((c$d)c$c).n, ((c$d)c$c).o)));
    }
    
    @Override
    public final ArrayList d(final com.google.android.exoplayer2.upstream.cache.a a, final h h, final boolean b) throws IOException, InterruptedException {
        final jc.c c = (jc.c)h;
        final ArrayList list = new ArrayList();
        if (c instanceof d) {
            final List d = ((d)c).d;
            for (int i = 0; i < d.size(); ++i) {
                list.add(l.c((Uri)d.get(i)));
            }
        }
        else {
            list.add(l.c(Uri.parse(c.a)));
        }
        final ArrayList<b> list2 = new ArrayList<b>();
        final HashSet set = new HashSet();
        for (final com.google.android.exoplayer2.upstream.b b2 : list) {
            list2.add(new b(0L, b2));
            try {
                final com.google.android.exoplayer2.source.hls.playlist.c c2 = (com.google.android.exoplayer2.source.hls.playlist.c)this.b((u<h, ?>)new k(this, a, b2), b);
                c$c c$c = null;
                final ImmutableList r = c2.r;
                c$c c$c3;
                for (int j = 0; j < ((List)r).size(); ++j, c$c = c$c3) {
                    final c$c c$c2 = (c$c)((List)r).get(j);
                    final c$c g = ((c$d)c$c2).g;
                    c$c3 = c$c;
                    if (g != null && g != (c$c3 = c$c)) {
                        g(c2, g, set, list2);
                        c$c3 = g;
                    }
                    g(c2, c$c2, set, list2);
                }
                continue;
            }
            catch (final IOException ex) {
                if (b) {
                    continue;
                }
                throw ex;
            }
            break;
        }
        return list2;
    }
}
