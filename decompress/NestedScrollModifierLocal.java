// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.nestedscroll;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import d2.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import u2.l;
import d2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import mj2.b0;
import ah2.f;
import z0.l0;
import y1.a;
import d2.c;
import d2.b;

public final class NestedScrollModifierLocal implements b, c<NestedScrollModifierLocal>, a
{
    public static final /* synthetic */ int i = 0;
    public final NestedScrollDispatcher f;
    public final a g;
    public final l0 h;
    
    public NestedScrollModifierLocal(final NestedScrollDispatcher f, final a g) {
        ah2.f.f((Object)g, "connection");
        this.f = f;
        this.g = g;
        f.a = (zg2.a)new zg2.a<b0>() {
            public final /* synthetic */ NestedScrollModifierLocal this$0;
            
            public final b0 invoke() {
                final NestedScrollModifierLocal this$0 = this.this$0;
                final int i = NestedScrollModifierLocal.i;
                return this$0.i();
            }
        };
        this.h = a80.a.n0(null);
    }
    
    @Override
    public final void C0(final d2.d d) {
        ah2.f.f((Object)d, "scope");
        ((SnapshotMutableStateImpl<NestedScrollModifierLocal>)this.h).setValue((NestedScrollModifierLocal)d.a(NestedScrollModifierLocalKt.a));
        this.f.c = (a)this.j();
    }
    
    public final Object a(long n, long j$0, final tg2.c<? super l> c) {
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
            nestedScrollModifierLocal$onPostFling$2 = new NestedScrollModifierLocal$onPostFling.NestedScrollModifierLocal$onPostFling$1(this, (tg2.c)c);
        }
        Object o = nestedScrollModifierLocal$onPostFling$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = nestedScrollModifierLocal$onPostFling$2.label;
        Label_0299: {
            long j$2;
            NestedScrollModifierLocal nestedScrollModifierLocal;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        n = nestedScrollModifierLocal$onPostFling$2.J$0;
                        aj2.c.Q0(o);
                        break Label_0299;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    n = nestedScrollModifierLocal$onPostFling$2.J$1;
                    j$2 = nestedScrollModifierLocal$onPostFling$2.J$0;
                    nestedScrollModifierLocal = (NestedScrollModifierLocal)nestedScrollModifierLocal$onPostFling$2.L$0;
                    aj2.c.Q0(o);
                }
            }
            else {
                aj2.c.Q0(o);
                final a g = this.g;
                nestedScrollModifierLocal$onPostFling$2.L$0 = this;
                j$2 = n;
                nestedScrollModifierLocal$onPostFling$2.J$0 = j$2;
                final long j$3 = j$0;
                nestedScrollModifierLocal$onPostFling$2.J$1 = j$3;
                nestedScrollModifierLocal$onPostFling$2.label = 1;
                o = g.a(n, j$0, (tg2.c)nestedScrollModifierLocal$onPostFling$2);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                nestedScrollModifierLocal = this;
                n = j$3;
            }
            j$0 = ((l)o).a;
            final NestedScrollModifierLocal j = nestedScrollModifierLocal.j();
            if (j == null) {
                n = j$0;
                final int c2 = l.c;
                j$0 = l.b;
                return new l(l.e(n, j$0));
            }
            final long e = l.e(j$2, j$0);
            n = l.d(n, j$0);
            nestedScrollModifierLocal$onPostFling$2.L$0 = null;
            nestedScrollModifierLocal$onPostFling$2.J$0 = j$0;
            nestedScrollModifierLocal$onPostFling$2.label = 2;
            o = j.a(e, n, (tg2.c<? super l>)nestedScrollModifierLocal$onPostFling$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            n = j$0;
        }
        j$0 = ((l)o).a;
        return new l(l.e(n, j$0));
    }
    
    public final long b(final int n, final long n2) {
        final NestedScrollModifierLocal j = this.j();
        long n3;
        if (j != null) {
            n3 = j.b(n, n2);
        }
        else {
            final int e = n1.c.e;
            n3 = n1.c.b;
        }
        return n1.c.f(n3, this.g.b(n, n1.c.e(n2, n3)));
    }
    
    public final long d(int e, long n, final long n2) {
        final long d = this.g.d(e, n, n2);
        final NestedScrollModifierLocal j = this.j();
        if (j != null) {
            n = j.d(e, n1.c.f(n, d), n1.c.e(n2, d));
        }
        else {
            e = n1.c.e;
            n = n1.c.b;
        }
        return n1.c.f(d, n);
    }
    
    public final Object f(long n, final tg2.c<? super l> c) {
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
            nestedScrollModifierLocal$onPreFling$1 = new NestedScrollModifierLocal$onPreFling.NestedScrollModifierLocal$onPreFling$1(this, (tg2.c)c);
        }
        Object o = nestedScrollModifierLocal$onPreFling$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = nestedScrollModifierLocal$onPreFling$1.label;
        long j$0 = 0L;
        NestedScrollModifierLocal nestedScrollModifierLocal = null;
        Label_0222: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        n = nestedScrollModifierLocal$onPreFling$1.J$0;
                        aj2.c.Q0(o);
                        return new l(l.e(n, ((l)o).a));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    j$0 = nestedScrollModifierLocal$onPreFling$1.J$0;
                    nestedScrollModifierLocal = (NestedScrollModifierLocal)nestedScrollModifierLocal$onPreFling$1.L$0;
                    aj2.c.Q0(o);
                }
            }
            else {
                aj2.c.Q0(o);
                final NestedScrollModifierLocal j = this.j();
                if (j == null) {
                    final int c2 = l.c;
                    final long b = l.b;
                    nestedScrollModifierLocal = this;
                    j$0 = n;
                    n = b;
                    break Label_0222;
                }
                nestedScrollModifierLocal$onPreFling$1.L$0 = this;
                nestedScrollModifierLocal$onPreFling$1.J$0 = n;
                nestedScrollModifierLocal$onPreFling$1.label = 1;
                o = j.f(n, (tg2.c<? super l>)nestedScrollModifierLocal$onPreFling$1);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                nestedScrollModifierLocal = this;
                j$0 = n;
            }
            n = ((l)o).a;
        }
        final a g = nestedScrollModifierLocal.g;
        final long d = l.d(j$0, n);
        nestedScrollModifierLocal$onPreFling$1.L$0 = null;
        nestedScrollModifierLocal$onPreFling$1.J$0 = n;
        nestedScrollModifierLocal$onPreFling$1.label = 2;
        if ((o = g.f(d, (tg2.c)nestedScrollModifierLocal$onPreFling$1)) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return new l(l.e(n, ((l)o).a));
    }
    
    @Override
    public final e<NestedScrollModifierLocal> getKey() {
        return NestedScrollModifierLocalKt.a;
    }
    
    @Override
    public final Object getValue() {
        return this;
    }
    
    public final b0 i() {
        final NestedScrollModifierLocal j = this.j();
        b0 b0;
        if (j == null || (b0 = j.i()) == null) {
            b0 = this.f.b;
            if (b0 == null) {
                throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
            }
        }
        return b0;
    }
    
    public final NestedScrollModifierLocal j() {
        return ((SnapshotMutableStateImpl<NestedScrollModifierLocal>)this.h).getValue();
    }
}
