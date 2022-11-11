// 
// Decompiled by Procyon v0.6.0
// 

package androidx.paging;

import java.util.Iterator;
import java.util.List;
import ig2.t;
import java.util.ArrayList;
import ig2.m;
import hg2.j;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.io.Serializable;
import lg2.c;
import ml0.a;
import kotlinx.coroutines.sync.MutexImpl;
import c5.f;

public final class FlattenedPageController<T>
{
    public final f<T> a;
    public final MutexImpl b;
    public int c;
    
    public FlattenedPageController() {
        this.a = new f<T>();
        this.b = ml0.a.d();
        this.c = -1;
    }
    
    public final Serializable a(c o) {
        FlattenedPageController$getStateAsEvents$1 flattenedPageController$getStateAsEvents$2 = null;
        Label_0047: {
            if (o instanceof FlattenedPageController$getStateAsEvents$1) {
                final FlattenedPageController$getStateAsEvents$1 flattenedPageController$getStateAsEvents$1 = (FlattenedPageController$getStateAsEvents$1)o;
                final int label = flattenedPageController$getStateAsEvents$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flattenedPageController$getStateAsEvents$1.label = label + Integer.MIN_VALUE;
                    flattenedPageController$getStateAsEvents$2 = flattenedPageController$getStateAsEvents$1;
                    break Label_0047;
                }
            }
            flattenedPageController$getStateAsEvents$2 = new FlattenedPageController$getStateAsEvents$1((FlattenedPageController<Object>)this, (c<? super FlattenedPageController$getStateAsEvents$1>)o);
        }
        final Object result = flattenedPageController$getStateAsEvents$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flattenedPageController$getStateAsEvents$2.label;
        FlattenedPageController flattenedPageController;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final oj2.c c = (oj2.c)flattenedPageController$getStateAsEvents$2.L$1;
            flattenedPageController = (FlattenedPageController)flattenedPageController$getStateAsEvents$2.L$0;
            yd.b.k0(result);
            o = c;
        }
        else {
            yd.b.k0(result);
            final MutexImpl b = this.b;
            flattenedPageController$getStateAsEvents$2.L$0 = this;
            flattenedPageController$getStateAsEvents$2.L$1 = b;
            flattenedPageController$getStateAsEvents$2.label = 1;
            if (b.b(null, (c<? super j>)flattenedPageController$getStateAsEvents$2) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            flattenedPageController = this;
            o = b;
        }
        try {
            final List<PageEvent<T>> b2 = flattenedPageController.a.b();
            final int c2 = flattenedPageController.c;
            final int size = b2.size();
            final ArrayList list = new ArrayList<t>(m.c3((Iterable)b2, 10));
            int n = 0;
            for (final Object next : b2) {
                if (n < 0) {
                    lw0.b.I2();
                    throw null;
                }
                list.add(new t(n + (c2 - size + 1), (Object)next));
                ++n;
            }
            return list;
        }
        finally {
            ((oj2.c)o).a((Object)null);
        }
    }
    
    public final Object b(t<? extends PageEvent<T>> l$1, c<? super j> c) {
        FlattenedPageController$record.FlattenedPageController$record$1 flattenedPageController$record$2 = null;
        Label_0050: {
            if (c instanceof FlattenedPageController$record.FlattenedPageController$record$1) {
                final FlattenedPageController$record.FlattenedPageController$record$1 flattenedPageController$record$1 = (FlattenedPageController$record.FlattenedPageController$record$1)c;
                final int label = flattenedPageController$record$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flattenedPageController$record$1.label = label + Integer.MIN_VALUE;
                    flattenedPageController$record$2 = flattenedPageController$record$1;
                    break Label_0050;
                }
            }
            flattenedPageController$record$2 = new FlattenedPageController$record.FlattenedPageController$record$1(this, c);
        }
        final Object result = flattenedPageController$record$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flattenedPageController$record$2.label;
        FlattenedPageController flattenedPageController;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            final oj2.c c2 = (oj2.c)flattenedPageController$record$2.L$2;
            l$1 = (t)flattenedPageController$record$2.L$1;
            flattenedPageController = (FlattenedPageController)flattenedPageController$record$2.L$0;
            yd.b.k0(result);
            c = (c)c2;
        }
        else {
            yd.b.k0(result);
            final MutexImpl b = this.b;
            flattenedPageController$record$2.L$0 = this;
            flattenedPageController$record$2.L$1 = l$1;
            flattenedPageController$record$2.L$2 = b;
            flattenedPageController$record$2.label = 1;
            if (b.b(null, (c<? super j>)flattenedPageController$record$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            flattenedPageController = this;
            c = (c)b;
        }
        try {
            flattenedPageController.c = l$1.a;
            flattenedPageController.a.a((PageEvent<T>)l$1.b);
            final j a = j.a;
            return j.a;
        }
        finally {
            ((oj2.c)c).a((Object)null);
        }
    }
}
