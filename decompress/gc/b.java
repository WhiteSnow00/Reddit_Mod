// 
// Decompiled by Procyon v0.6.0
// 

package gc;

import fc.i;
import java.util.List;
import fc.g;
import java.io.IOException;
import com.google.android.exoplayer2.offline.DownloadException;
import bd.u;
import bd.c0;
import java.util.ArrayList;
import zb.j;
import com.google.android.exoplayer2.upstream.i$a;
import fc.d;
import java.util.concurrent.Executor;
import com.google.android.exoplayer2.upstream.cache.a$b;
import com.google.android.exoplayer2.q;
import ec.a;
import fc.c;
import zb.n;

public final class b extends n<fc.c>
{
    public final ec.a j;
    
    public b() {
        throw null;
    }
    
    public b(final q q, final a$b a$b, final Executor executor) {
        super(q, (i$a)new d(), a$b, executor);
        this.j = new ec.a();
    }
    
    @Override
    public final ArrayList d(final com.google.android.exoplayer2.upstream.cache.a a, j f, final boolean b) throws IOException, InterruptedException {
        final fc.c c = (fc.c)f;
        final ArrayList list = new ArrayList();
        for (int i = 0; i < c.c(); ++i) {
            final g b2 = c.b(i);
            final long j = c0.J(b2.b);
            final long e = c.e(i);
            final List c2 = b2.c;
            for (int k = 0; k < c2.size(); ++k) {
                final fc.a a2 = c2.get(k);
                for (int l = 0; l < a2.c.size(); ++l) {
                    final fc.j m = a2.c.get(l);
                    try {
                        final int b3 = a2.b;
                        f = m.f();
                        Label_0194: {
                            if (f != null) {
                                break Label_0194;
                            }
                            f = new(gc.a.class)();
                            try {
                                new gc.a(a, b3, m);
                                f = this.b((u<db.c, ?>)f, b);
                                if (f == null) {
                                    f = null;
                                    break Label_0194;
                                }
                                try {
                                    f = new ec.d(f, m.h);
                                    if (f != null) {
                                        final long m2 = ((ec.b)f).m(e);
                                        if (m2 != -1L) {
                                            final fc.b d = this.j.d(m.g);
                                            final int a3 = c0.a;
                                            final String a4 = d.a;
                                            final i l2 = m.l;
                                            if (l2 != null) {
                                                list.add(new n.b(j, ec.c.a(m, a4, l2, 0)));
                                            }
                                            final i g = m.g();
                                            if (g != null) {
                                                list.add(new n.b(j, ec.c.a(m, a4, g, 0)));
                                            }
                                            for (long n = ((ec.b)f).n(); n <= n + m2 - 1L; ++n) {
                                                list.add(new n.b(((ec.b)f).b(n) + j, ec.c.a(m, a4, ((ec.b)f).o(n), 0)));
                                            }
                                            continue;
                                        }
                                        throw new DownloadException("Unbounded segment index");
                                    }
                                    else {
                                        try {
                                            throw new DownloadException("Missing segment index");
                                        }
                                        catch (final IOException f) {}
                                    }
                                }
                                catch (final IOException f) {}
                            }
                            catch (final IOException ex) {}
                        }
                    }
                    catch (final IOException f) {}
                    if (!b) {
                        throw f;
                    }
                }
            }
        }
        return list;
    }
}
