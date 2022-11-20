// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.transaction.approve;

import java.math.BigInteger;
import kotlin.Metadata;
import hg2.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@c(c = "com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionPresenter", f = "ApproveTransactionPresenter.kt", l = { 359 }, m = "getProvisionalMembership")
@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class ApproveTransactionPresenter$getProvisionalMembership$1 extends ContinuationImpl
{
    public int label;
    public Object result;
    public final ApproveTransactionPresenter this$0;
    
    public ApproveTransactionPresenter$getProvisionalMembership$1(final ApproveTransactionPresenter this$0, final gg2.c<? super ApproveTransactionPresenter$getProvisionalMembership$1> c) {
        this.this$0 = this$0;
        super((gg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return ApproveTransactionPresenter.xb(this.this$0, (BigInteger)null, (gg2.c)this);
    }
}
