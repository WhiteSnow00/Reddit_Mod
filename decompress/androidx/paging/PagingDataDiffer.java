// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import rg2.l;
import lg2.c;
import c5.s;
import kotlinx.coroutines.channels.BufferOverflow;
import d5.b;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import c5.t;
import hg2.j;
import rg2.a;
import java.util.concurrent.CopyOnWriteArrayList;
import c5.m;
import c5.a0;
import c5.q;
import kotlinx.coroutines.CoroutineDispatcher;
import c5.e;

public abstract class PagingDataDiffer<T>
{
    public final e a;
    public final CoroutineDispatcher b;
    public q<T> c;
    public a0 d;
    public final m e;
    public final CopyOnWriteArrayList<a<j>> f;
    public final SingleRunner g;
    public volatile boolean h;
    public volatile int i;
    public final t j;
    public final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 k;
    public final f l;
    
    public PagingDataDiffer(final b.b$a a, final CoroutineDispatcher b) {
        sg2.e.f((Object)b, "mainDispatcher");
        this.a = a;
        this.b = b;
        this.c = (q<T>)q.e;
        final m e = new m();
        this.e = e;
        final CopyOnWriteArrayList f = new CopyOnWriteArrayList();
        this.f = f;
        this.g = new SingleRunner(true);
        this.j = new t((PagingDataDiffer<Object>)this);
        this.k = e.i;
        this.l = a92.b.k(0, 64, BufferOverflow.DROP_OLDEST);
        f.add(new PagingDataDiffer$1((PagingDataDiffer<Object>)this));
    }
    
    public final Object a(final s<T> s, final c<? super j> c) {
        final Object a = this.g.a(0, (l)new PagingDataDiffer$collectFrom$2(this, (s)s, (c)null), (c)c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return hg2.j.a;
    }
    
    public final void b(final c5.l f, final c5.l g) {
        sg2.e.f((Object)f, "source");
        if (sg2.e.a((Object)this.e.f, (Object)f) && sg2.e.a((Object)this.e.g, (Object)g)) {
            return;
        }
        final m e = this.e;
        e.getClass();
        e.a = true;
        e.f = f;
        e.g = g;
        e.b();
    }
}
