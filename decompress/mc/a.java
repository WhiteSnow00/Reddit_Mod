// 
// Decompiled by Procyon v0.6.0
// 

package mc;

import com.google.android.exoplayer2.q$f;
import java.io.IOException;
import com.google.android.exoplayer2.upstream.b;
import java.util.ArrayList;
import zb.j;
import com.google.android.exoplayer2.q$g;
import com.google.android.exoplayer2.q$a;
import com.google.android.exoplayer2.upstream.i$a;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import bd.c0;
import java.util.concurrent.Executor;
import com.google.android.exoplayer2.upstream.cache.a$b;
import com.google.android.exoplayer2.q;
import zb.n;

public final class a extends n<com.google.android.exoplayer2.source.smoothstreaming.manifest.a>
{
    public a() {
        throw null;
    }
    
    public a(final q q, final a$b a$b, final Executor executor) {
        final q$a a = q.a();
        final q$g g = q.g;
        g.getClass();
        a.b = c0.m(((q$f)g).a);
        super(a.a(), (i$a)new SsManifestParser(), a$b, executor);
    }
    
    @Override
    public final ArrayList d(final com.google.android.exoplayer2.upstream.cache.a a, final j j, final boolean b) throws IOException, InterruptedException {
        final com.google.android.exoplayer2.source.smoothstreaming.manifest.a a2 = (com.google.android.exoplayer2.source.smoothstreaming.manifest.a)j;
        final ArrayList list = new ArrayList();
        for (final com.google.android.exoplayer2.source.smoothstreaming.manifest.a$b a$b : a2.f) {
            for (int k = 0; k < a$b.j.length; ++k) {
                for (int l = 0; l < a$b.k; ++l) {
                    list.add(new b(a$b.o[l], new com.google.android.exoplayer2.upstream.b(a$b.a(k, l))));
                }
            }
        }
        return list;
    }
}
