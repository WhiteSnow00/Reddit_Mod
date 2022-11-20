// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.matrix.data.repository;

import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import kotlin.Metadata;
import gg2.c;
import mg2.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@hg2.c(c = "com.reddit.matrix.data.repository.MatrixBadgingRepositoryImpl$unreadMessageCountFlow$1$1", f = "MatrixBadgingRepositoryImpl.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@" }, d2 = { "", "matrixUnread", "gqlUnread", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class MatrixBadgingRepositoryImpl$unreadMessageCountFlow$1$1 extends SuspendLambda implements q<Integer, Integer, c<? super Integer>, Object>
{
    public int I$0;
    public Object L$0;
    public int label;
    public final MatrixBadgingRepositoryImpl this$0;
    
    public MatrixBadgingRepositoryImpl$unreadMessageCountFlow$1$1(final MatrixBadgingRepositoryImpl this$0, final c<? super MatrixBadgingRepositoryImpl$unreadMessageCountFlow$1$1> c) {
        this.this$0 = this$0;
        super(3, (c)c);
    }
    
    public final Object invoke(final Integer l$0, final int i$0, final c<? super Integer> c) {
        final MatrixBadgingRepositoryImpl$unreadMessageCountFlow$1$1 matrixBadgingRepositoryImpl$unreadMessageCountFlow$1$1 = new MatrixBadgingRepositoryImpl$unreadMessageCountFlow$1$1(this.this$0, (c<? super MatrixBadgingRepositoryImpl$unreadMessageCountFlow$1$1>)c);
        matrixBadgingRepositoryImpl$unreadMessageCountFlow$1$1.L$0 = l$0;
        matrixBadgingRepositoryImpl$unreadMessageCountFlow$1$1.I$0 = i$0;
        return matrixBadgingRepositoryImpl$unreadMessageCountFlow$1$1.invokeSuspend(j.a);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2, final Object o3) {
        return this.invoke((Integer)o, ((Number)o2).intValue(), (c<? super Integer>)o3);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            d.b4(o);
            final Integer n = (Integer)this.L$0;
            int n2 = this.I$0;
            if (n != null) {
                final MatrixBadgingRepositoryImpl this$0 = this.this$0;
                n2 = n.intValue();
                this$0.c.setValue((Object)new Integer(n2));
            }
            return new Integer(n2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
