// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.matrix.data.repository;

import p2.b;
import cj2.e;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import cg2.j;
import gg2.c;
import vn2.a;
import cj2.f;
import mg2.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@hg2.c(c = "com.reddit.matrix.data.repository.MatrixBadgingRepositoryImpl$unreadMessageCountFlow$$inlined$flatMapLatest$1", f = "MatrixBadgingRepositoryImpl.kt", l = { 216 }, m = "invokeSuspend")
@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@" }, d2 = { "T", "R", "Lcj2/f;", "it", "Lcg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
public final class MatrixBadgingRepositoryImpl$unreadMessageCountFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements q<f<? super Integer>, a, c<? super j>, Object>
{
    private Object L$0;
    public Object L$1;
    public int label;
    public final MatrixBadgingRepositoryImpl this$0;
    
    public MatrixBadgingRepositoryImpl$unreadMessageCountFlow$$inlined$flatMapLatest$1(final c c, final MatrixBadgingRepositoryImpl this$0) {
        this.this$0 = this$0;
        super(3, c);
    }
    
    public final Object invoke(final f<? super Integer> l$0, final a l$2, final c<? super j> c) {
        final MatrixBadgingRepositoryImpl$unreadMessageCountFlow$$inlined$flatMapLatest$1 matrixBadgingRepositoryImpl$unreadMessageCountFlow$$inlined$flatMapLatest$1 = new MatrixBadgingRepositoryImpl$unreadMessageCountFlow$$inlined$flatMapLatest$1(c, this.this$0);
        matrixBadgingRepositoryImpl$unreadMessageCountFlow$$inlined$flatMapLatest$1.L$0 = l$0;
        matrixBadgingRepositoryImpl$unreadMessageCountFlow$$inlined$flatMapLatest$1.L$1 = l$2;
        return matrixBadgingRepositoryImpl$unreadMessageCountFlow$$inlined$flatMapLatest$1.invokeSuspend(j.a);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2, final Object o3) {
        return this.invoke((f)o, o2, (c)o3);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        if (label != 0) {
            if (label != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(o);
        }
        else {
            d.b4(o);
            final f f = (f)this.L$0;
            final a a = (a)this.L$1;
            Object c = null;
            Label_0112: {
                if (a != null) {
                    final e f2 = ((mo2.c)a).f();
                    if (f2 != null) {
                        final MatrixBadgingRepositoryImpl this$0 = this.this$0;
                        c = new kotlinx.coroutines.flow.f(f2, (e)this$0.c, (q)new MatrixBadgingRepositoryImpl$unreadMessageCountFlow$1$1(this$0, null));
                        break Label_0112;
                    }
                }
                c = this.this$0.c;
            }
            this.label = 1;
            if (b.B((c)this, (e)c, f) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
