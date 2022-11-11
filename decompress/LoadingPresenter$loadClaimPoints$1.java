// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.loading;

import java.util.Iterator;
import java.util.List;
import y82.f;
import x82.o;
import x82.o$f;
import x82.h0;
import hj2.e;
import kotlinx.coroutines.flow.a;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.loading.LoadingPresenter$loadClaimPoints$1", f = "LoadingPresenter.kt", l = { 64, 66 }, m = "invokeSuspend")
final class LoadingPresenter$loadClaimPoints$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ x82.p $entryPoint;
    public final /* synthetic */ String $subredditId;
    public int label;
    public final /* synthetic */ LoadingPresenter this$0;
    
    public LoadingPresenter$loadClaimPoints$1(final LoadingPresenter this$0, final String $subredditId, final x82.p $entryPoint, final c<? super LoadingPresenter$loadClaimPoints$1> c) {
        this.this$0 = this$0;
        this.$subredditId = $subredditId;
        this.$entryPoint = $entryPoint;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new LoadingPresenter$loadClaimPoints$1(this.this$0, this.$subredditId, this.$entryPoint, (c<? super LoadingPresenter$loadClaimPoints$1>)c);
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((LoadingPresenter$loadClaimPoints$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        Label_0114: {
            if (label != 0) {
                if (label != 1) {
                    if (label == 2) {
                        b.k0(o);
                        break Label_0114;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    b.k0(o);
                }
            }
            else {
                b.k0(o);
                final f o2 = this.this$0.o;
                this.label = 1;
                if (o2.i(true, (c<? super Boolean>)this) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final e<List<h0>> j = this.this$0.o.j();
            this.label = 2;
            if ((o = a.x(j, (c)this)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final Iterable iterable = (Iterable)o;
        final String $subredditId = this.$subredditId;
        final Iterator iterator = iterable.iterator();
        while (true) {
            do {
                final boolean hasNext = iterator.hasNext();
                final o o3 = null;
                if (!hasNext) {
                    o = null;
                    final h0 h0 = (h0)o;
                    Object o4 = o3;
                    if (h0 != null) {
                        o4 = new o$f(this.$entryPoint, h0);
                    }
                    final LoadingPresenter this$0 = this.this$0;
                    this$0.k.Gd((o)o4, this$0.q);
                    return j.a;
                }
                o = iterator.next();
            } while (!sg2.e.a((Object)((h0)o).f.f, (Object)$subredditId));
            continue;
        }
    }
}
