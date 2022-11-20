// 
// Decompiled by Procyon v0.6.0
// 

package gc;

import fc.i;
import java.util.List;
import fc.g;
import java.io.IOException;
import com.google.android.exoplayer2.offline.DownloadException;
import ec.e;
import bd.u;
import fc.j;
import bd.c0;
import java.util.ArrayList;
import zb.h;
import com.google.android.exoplayer2.upstream.cache.a;
import com.google.android.exoplayer2.upstream.i$a;
import fc.d;
import java.util.concurrent.Executor;
import com.google.android.exoplayer2.upstream.cache.a$b;
import com.google.android.exoplayer2.q;
import fc.c;
import zb.l;

public final class b extends l<fc.c>
{
    public final ec.b j;
    
    public b() {
        throw null;
    }
    
    public b(final q q, final a$b a$b, final Executor executor) {
        super(q, (i$a)new d(), a$b, executor);
        this.j = new ec.b();
    }
    
    @Override
    public final ArrayList d(final com.google.android.exoplayer2.upstream.cache.a a, h h, final boolean b) throws IOException, InterruptedException {
        fc.c c = (fc.c)h;
        final ArrayList list = new ArrayList();
        for (int i = 0; i < c.c(); ++i) {
            final g b2 = c.b(i);
            final long j = c0.J(b2.b);
            final long e = c.e(i);
            final List c2 = b2.c;
            fc.c c3;
            for (int k = 0; k < c2.size(); ++k, c = c3) {
                final fc.a a2 = c2.get(k);
                int l = 0;
                c3 = c;
                while (l < a2.c.size()) {
                    final j m = a2.c.get(l);
                    Label_0431: {
                        try {
                            final int b3 = a2.b;
                            h = m.h();
                            Label_0192: {
                                if (h != null) {
                                    break Label_0192;
                                }
                                h = new(gc.a.class)();
                                try {
                                    new gc.a(a, b3, m);
                                    h = this.b((u<db.c, ?>)h, b);
                                    if (h == null) {
                                        h = null;
                                        break Label_0192;
                                    }
                                    try {
                                        h = new e(h, m.h);
                                        if (h != null) {
                                            final long g = ((ec.c)h).g(e);
                                            if (g != -1L) {
                                                final fc.b d = this.j.d(m.g);
                                                final int a3 = c0.a;
                                                final String a4 = d.a;
                                                final i l2 = m.l;
                                                if (l2 != null) {
                                                    list.add(new l.b(j, ec.d.a(m, a4, l2, 0)));
                                                }
                                                final i m2 = m.m();
                                                if (m2 != null) {
                                                    list.add(new l.b(j, ec.d.a(m, a4, m2, 0)));
                                                }
                                                for (long i2 = ((ec.c)h).i(); i2 <= i2 + g - 1L; ++i2) {
                                                    list.add(new l.b(((ec.c)h).b(i2) + j, ec.d.a(m, a4, ((ec.c)h).j(i2), 0)));
                                                }
                                                break Label_0431;
                                            }
                                            throw new DownloadException("Unbounded segment index");
                                        }
                                        else {
                                            try {
                                                throw new DownloadException("Missing segment index");
                                            }
                                            catch (final IOException h) {}
                                        }
                                    }
                                    catch (final IOException h) {}
                                }
                                catch (final IOException ex) {}
                            }
                        }
                        catch (final IOException h) {}
                        if (!b) {
                            throw h;
                        }
                    }
                    ++l;
                }
            }
        }
        return list;
    }
}
