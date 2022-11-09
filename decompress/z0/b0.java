// 
// Decompiled by Procyon v0.6.0
// 

package z0;

import kotlinx.coroutines.JobSupport;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineStart;
import mj2.g;
import kotlin.coroutines.CoroutineContext;
import mj2.p1;
import rj2.f;
import pg2.j;
import tg2.c;
import zg2.p;

public final class b0 implements u0
{
    public final p<mj2.b0, c<? super j>, Object> f;
    public final f g;
    public p1 h;
    
    public b0(final CoroutineContext coroutineContext, final p<? super mj2.b0, ? super c<? super j>, ?> f) {
        ah2.f.f((Object)coroutineContext, "parentCoroutineContext");
        ah2.f.f((Object)f, "task");
        this.f = (p<mj2.b0, c<? super j>, Object>)f;
        this.g = mj2.g.a(coroutineContext);
    }
    
    @Override
    public final void a() {
        final p1 h = this.h;
        if (h != null) {
            ((JobSupport)h).a(aj2.c.d("Old job was still running!", (Throwable)null));
        }
        this.h = mj2.g.i((mj2.b0)this.g, (CoroutineContext)null, (CoroutineStart)null, (p)this.f, 3);
    }
    
    @Override
    public final void c() {
        final p1 h = this.h;
        if (h != null) {
            ((JobSupport)h).a((CancellationException)null);
        }
        this.h = null;
    }
    
    @Override
    public final void d() {
        final p1 h = this.h;
        if (h != null) {
            ((JobSupport)h).a((CancellationException)null);
        }
        this.h = null;
    }
}
