// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.remote;

import k82.a;
import r82.m;
import kotlin.Metadata;
import hg2.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@c(c = "com.reddit.vault.data.remote.BaseEthTransactionService", f = "BaseEthTransactionService.kt", l = { 78, 80, 85, 88, 101 }, m = "sendTransaction$suspendImpl")
@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class BaseEthTransactionService$sendTransaction$1 extends ContinuationImpl
{
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public int label;
    public Object result;
    public final BaseEthTransactionService this$0;
    
    public BaseEthTransactionService$sendTransaction$1(final BaseEthTransactionService this$0, final gg2.c<? super BaseEthTransactionService$sendTransaction$1> c) {
        this.this$0 = this$0;
        super((gg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return BaseEthTransactionService.k(this.this$0, (r82.c)null, (m)null, 0, (a)null, (gg2.c)this);
    }
}
