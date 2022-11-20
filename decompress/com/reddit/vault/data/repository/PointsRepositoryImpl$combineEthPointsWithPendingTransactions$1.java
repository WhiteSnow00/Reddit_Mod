// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.repository;

import java.util.List;
import kotlin.Metadata;
import hg2.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@c(c = "com.reddit.vault.data.repository.PointsRepositoryImpl", f = "PointsRepositoryImpl.kt", l = { 434, 438 }, m = "combineEthPointsWithPendingTransactions")
@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object result;
    public final PointsRepositoryImpl this$0;
    
    public PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1(final PointsRepositoryImpl this$0, final gg2.c<? super PointsRepositoryImpl$combineEthPointsWithPendingTransactions$1> c) {
        this.this$0 = this$0;
        super((gg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return PointsRepositoryImpl.m(this.this$0, (List)null, (List)null, (gg2.c)this);
    }
}
