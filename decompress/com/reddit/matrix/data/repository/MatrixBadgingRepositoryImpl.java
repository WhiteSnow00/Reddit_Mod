// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.matrix.data.repository;

import mg2.q;
import cj2.e;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import java.io.Serializable;
import kotlin.Result;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import cg2.j;
import gg2.c;
import javax.inject.Inject;
import kotlinx.coroutines.flow.StateFlowImpl;
import ay0.b;
import fy0.a;

public final class MatrixBadgingRepositoryImpl implements a
{
    public final b a;
    public final fy0.b b;
    public final StateFlowImpl c;
    
    @Inject
    public MatrixBadgingRepositoryImpl(final b a, final fy0.b b) {
        this.a = a;
        this.b = b;
        this.c = xd.a.h((Object)0);
    }
    
    public final Object a(final c<? super j> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof MatrixBadgingRepositoryImpl$fetchUnreadMessageCount$1) {
                final MatrixBadgingRepositoryImpl$fetchUnreadMessageCount$1 matrixBadgingRepositoryImpl$fetchUnreadMessageCount$1 = (MatrixBadgingRepositoryImpl$fetchUnreadMessageCount$1)c;
                final int label = matrixBadgingRepositoryImpl$fetchUnreadMessageCount$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    matrixBadgingRepositoryImpl$fetchUnreadMessageCount$1.label = label + Integer.MIN_VALUE;
                    o = matrixBadgingRepositoryImpl$fetchUnreadMessageCount$1;
                    break Label_0047;
                }
            }
            o = new MatrixBadgingRepositoryImpl$fetchUnreadMessageCount$1(this, (c)c);
        }
        Object o2 = ((MatrixBadgingRepositoryImpl$fetchUnreadMessageCount$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((MatrixBadgingRepositoryImpl$fetchUnreadMessageCount$1)o).label;
        MatrixBadgingRepositoryImpl matrixBadgingRepositoryImpl = null;
        Object constructor-impl = null;
        Label_0217: {
            Label_0163: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        matrixBadgingRepositoryImpl = (MatrixBadgingRepositoryImpl)((MatrixBadgingRepositoryImpl$fetchUnreadMessageCount$1)o).L$0;
                        try {
                            d.b4(o2);
                            break Label_0163;
                        }
                        finally {
                            break Label_0163;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b4(o2);
                if (this.b.a().getValue() != null) {
                    return j.a;
                }
                try {
                    final b a = this.a;
                    ((MatrixBadgingRepositoryImpl$fetchUnreadMessageCount$1)o).L$0 = this;
                    ((MatrixBadgingRepositoryImpl$fetchUnreadMessageCount$1)o).label = 1;
                    o2 = a.a((c)o);
                    if (o2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    constructor-impl = this;
                    Result.constructor-impl((Object)new Integer(((Number)o2).intValue()));
                    break Label_0217;
                }
                finally {
                    matrixBadgingRepositoryImpl = this;
                }
            }
            constructor-impl = Result.constructor-impl((Object)d.B1((Throwable)constructor-impl));
        }
        final Integer n = new Integer(0);
        Serializable s = (Serializable)constructor-impl;
        if (Result.isFailure-impl(constructor-impl)) {
            s = n;
        }
        matrixBadgingRepositoryImpl.c.setValue((Object)new Integer(((Number)s).intValue()));
        return j.a;
    }
    
    public final ChannelFlowTransformLatest b() {
        return p2.b.S((e)this.b.a(), (q)new MatrixBadgingRepositoryImpl$unreadMessageCountFlow$$inlined$flatMapLatest$1(null, this));
    }
}
