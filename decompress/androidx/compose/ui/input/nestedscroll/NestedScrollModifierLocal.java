// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import u2.l;
import n1.c;
import d2.h;
import d2.g;
import ah0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import zi2.c0;
import ng2.e;
import z0.k0;
import y1.a;
import d2.f;
import d2.d;

public final class NestedScrollModifierLocal implements d, f<NestedScrollModifierLocal>, a
{
    public static final int i = 0;
    public final NestedScrollDispatcher f;
    public final a g;
    public final k0 h;
    
    public NestedScrollModifierLocal(final NestedScrollDispatcher f, final a g) {
        e.f((Object)g, "connection");
        this.f = f;
        this.g = g;
        f.a = (mg2.a<? extends c0>)new mg2.a<c0>(this) {
            public final NestedScrollModifierLocal this$0;
            
            public /* bridge */ Object invoke() {
                return this.invoke();
            }
            
            public final c0 invoke() {
                final NestedScrollModifierLocal this$0 = this.this$0;
                final int i = NestedScrollModifierLocal.i;
                return this$0.k();
            }
        };
        this.h = b.Z0((Object)null);
    }
    
    public final void E0(final g g) {
        e.f((Object)g, "scope");
        ((SnapshotMutableStateImpl)this.h).setValue((Object)g.i((h)NestedScrollModifierLocalKt.a));
        this.f.c = (a)this.l();
    }
    
    public final long a(final int n, final long n2) {
        final NestedScrollModifierLocal l = this.l();
        long n3;
        if (l != null) {
            n3 = l.a(n, n2);
        }
        else {
            final int e = c.e;
            n3 = c.b;
        }
        return c.h(n3, this.g.a(n, c.g(n2, n3)));
    }
    
    public final Object d(long j$0, long n, final gg2.c<? super l> c) {
        NestedScrollModifierLocal$onPostFling.NestedScrollModifierLocal$onPostFling$1 nestedScrollModifierLocal$onPostFling$2 = null;
        Label_0059: {
            if (c instanceof NestedScrollModifierLocal$onPostFling.NestedScrollModifierLocal$onPostFling$1) {
                final NestedScrollModifierLocal$onPostFling.NestedScrollModifierLocal$onPostFling$1 nestedScrollModifierLocal$onPostFling$1 = (NestedScrollModifierLocal$onPostFling.NestedScrollModifierLocal$onPostFling$1)c;
                final int label = nestedScrollModifierLocal$onPostFling$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    nestedScrollModifierLocal$onPostFling$1.label = label + Integer.MIN_VALUE;
                    nestedScrollModifierLocal$onPostFling$2 = nestedScrollModifierLocal$onPostFling$1;
                    break Label_0059;
                }
            }
            nestedScrollModifierLocal$onPostFling$2 = new NestedScrollModifierLocal$onPostFling.NestedScrollModifierLocal$onPostFling$1(this, (gg2.c)c);
        }
        Object o = nestedScrollModifierLocal$onPostFling$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = nestedScrollModifierLocal$onPostFling$2.label;
        Label_0297: {
            long j$2;
            NestedScrollModifierLocal nestedScrollModifierLocal;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        j$0 = nestedScrollModifierLocal$onPostFling$2.J$0;
                        cg.d.b4(o);
                        break Label_0297;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    n = nestedScrollModifierLocal$onPostFling$2.J$1;
                    j$2 = nestedScrollModifierLocal$onPostFling$2.J$0;
                    nestedScrollModifierLocal = (NestedScrollModifierLocal)nestedScrollModifierLocal$onPostFling$2.L$0;
                    cg.d.b4(o);
                }
            }
            else {
                cg.d.b4(o);
                final a g = this.g;
                nestedScrollModifierLocal$onPostFling$2.L$0 = this;
                j$2 = j$0;
                nestedScrollModifierLocal$onPostFling$2.J$0 = j$2;
                final long j$3 = n;
                nestedScrollModifierLocal$onPostFling$2.J$1 = j$3;
                nestedScrollModifierLocal$onPostFling$2.label = 1;
                o = g.d(j$0, n, (gg2.c)nestedScrollModifierLocal$onPostFling$2);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                nestedScrollModifierLocal = this;
                n = j$3;
            }
            j$0 = ((l)o).a;
            final NestedScrollModifierLocal l = nestedScrollModifierLocal.l();
            if (l == null) {
                final int c2 = u2.l.c;
                n = u2.l.b;
                return new l(u2.l.e(j$0, n));
            }
            final long e = u2.l.e(j$2, j$0);
            n = u2.l.d(n, j$0);
            nestedScrollModifierLocal$onPostFling$2.L$0 = null;
            nestedScrollModifierLocal$onPostFling$2.J$0 = j$0;
            nestedScrollModifierLocal$onPostFling$2.label = 2;
            o = l.d(e, n, (gg2.c<? super l>)nestedScrollModifierLocal$onPostFling$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        n = ((l)o).a;
        return new l(l.e(j$0, n));
    }
    
    public final long e(int e, long n, final long n2) {
        final long e2 = this.g.e(e, n, n2);
        final NestedScrollModifierLocal l = this.l();
        if (l != null) {
            n = l.e(e, c.h(n, e2), c.g(n2, e2));
        }
        else {
            e = c.e;
            n = c.b;
        }
        return c.h(e2, n);
    }
    
    public final h<NestedScrollModifierLocal> getKey() {
        return NestedScrollModifierLocalKt.a;
    }
    
    public final Object getValue() {
        return this;
    }
    
    public final Object i(long j$0, final gg2.c<? super l> c) {
        NestedScrollModifierLocal$onPreFling.NestedScrollModifierLocal$onPreFling$1 nestedScrollModifierLocal$onPreFling$1 = null;
        Label_0052: {
            if (c instanceof NestedScrollModifierLocal$onPreFling.NestedScrollModifierLocal$onPreFling$1) {
                nestedScrollModifierLocal$onPreFling$1 = (NestedScrollModifierLocal$onPreFling.NestedScrollModifierLocal$onPreFling$1)c;
                final int label = nestedScrollModifierLocal$onPreFling$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    nestedScrollModifierLocal$onPreFling$1.label = label + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            nestedScrollModifierLocal$onPreFling$1 = new NestedScrollModifierLocal$onPreFling.NestedScrollModifierLocal$onPreFling$1(this, (gg2.c)c);
        }
        Object o = nestedScrollModifierLocal$onPreFling$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = nestedScrollModifierLocal$onPreFling$1.label;
        long j$2 = 0L;
        NestedScrollModifierLocal nestedScrollModifierLocal = null;
        Label_0214: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        j$2 = nestedScrollModifierLocal$onPreFling$1.J$0;
                        cg.d.b4(o);
                        return new l(l.e(j$2, ((l)o).a));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    j$0 = nestedScrollModifierLocal$onPreFling$1.J$0;
                    nestedScrollModifierLocal = (NestedScrollModifierLocal)nestedScrollModifierLocal$onPreFling$1.L$0;
                    cg.d.b4(o);
                }
            }
            else {
                cg.d.b4(o);
                final NestedScrollModifierLocal l = this.l();
                if (l == null) {
                    final int c2 = u2.l.c;
                    j$2 = u2.l.b;
                    nestedScrollModifierLocal = this;
                    break Label_0214;
                }
                nestedScrollModifierLocal$onPreFling$1.L$0 = this;
                nestedScrollModifierLocal$onPreFling$1.J$0 = j$0;
                nestedScrollModifierLocal$onPreFling$1.label = 1;
                o = l.i(j$0, (gg2.c<? super l>)nestedScrollModifierLocal$onPreFling$1);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                nestedScrollModifierLocal = this;
            }
            j$2 = ((l)o).a;
        }
        final a g = nestedScrollModifierLocal.g;
        j$0 = l.d(j$0, j$2);
        nestedScrollModifierLocal$onPreFling$1.L$0 = null;
        nestedScrollModifierLocal$onPreFling$1.J$0 = j$2;
        nestedScrollModifierLocal$onPreFling$1.label = 2;
        if ((o = g.i(j$0, (gg2.c)nestedScrollModifierLocal$onPreFling$1)) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return new l(l.e(j$2, ((l)o).a));
    }
    
    public final c0 k() {
        final NestedScrollModifierLocal l = this.l();
        c0 c0;
        if (l == null || (c0 = l.k()) == null) {
            c0 = this.f.b;
            if (c0 == null) {
                throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
            }
        }
        return c0;
    }
    
    public final NestedScrollModifierLocal l() {
        return (NestedScrollModifierLocal)((SnapshotMutableStateImpl)this.h).getValue();
    }
}
