// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import com.google.android.exoplayer2.q$f;
import ia.c;
import java.util.concurrent.ExecutionException;
import bd.c0;
import com.google.android.exoplayer2.util.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import bd.u;
import com.google.android.exoplayer2.q$g;
import ad.e$a;
import ra.l;
import com.google.android.exoplayer2.upstream.b$a;
import com.google.android.exoplayer2.upstream.cache.a$b;
import com.google.android.exoplayer2.q;
import ad.e;
import com.google.android.exoplayer2.upstream.cache.a;
import com.google.android.exoplayer2.upstream.b;
import java.util.concurrent.Executor;

public final class j implements f
{
    public final Executor a;
    public final b b;
    public final com.google.android.exoplayer2.upstream.cache.a c;
    public final e d;
    public a e;
    public volatile j$a f;
    public volatile boolean g;
    
    public j(final q q, final a$b a$b, final Executor a) {
        a.getClass();
        this.a = a;
        q.g.getClass();
        final b$a b$a = new b$a();
        final q$g g = q.g;
        b$a.a = ((q$f)g).a;
        b$a.h = ((q$f)g).e;
        b$a.i = 4;
        final b a2 = b$a.a();
        this.b = a2;
        final com.google.android.exoplayer2.upstream.cache.a c = a$b.c();
        this.c = c;
        this.d = new e(c, a2, (byte[])null, (e$a)new l(this, 5));
    }
    
    @Override
    public final void a(final a e) throws IOException, InterruptedException {
        this.e = e;
        this.f = new u<Void, IOException>(this) {
            public final j m;
            
            @Override
            public final void c() {
                this.m.d.j = true;
            }
            
            @Override
            public final Object d() throws Exception {
                this.m.d.a();
                return null;
            }
        };
        int i = 0;
        while (i == 0) {
            try {
                if (!this.g) {
                    this.a.execute(this.f);
                    try {
                        this.f.get();
                        i = 1;
                    }
                    catch (final ExecutionException ex) {
                        final Throwable cause = ex.getCause();
                        cause.getClass();
                        if (cause instanceof PriorityTaskManager$PriorityTooLowException) {
                            continue;
                        }
                        if (cause instanceof IOException) {
                            throw (IOException)cause;
                        }
                        i = c0.a;
                        throw cause;
                    }
                }
            }
            finally {
                this.f.b();
            }
            break;
        }
        this.f.b();
    }
    
    @Override
    public final void cancel() {
        this.g = true;
        final u<Void, IOException> f = this.f;
        if (f != null) {
            f.cancel(true);
        }
    }
    
    @Override
    public final void remove() {
        final com.google.android.exoplayer2.upstream.cache.a c = this.c;
        c.a.f(((c)c.e).b(this.b));
    }
}
