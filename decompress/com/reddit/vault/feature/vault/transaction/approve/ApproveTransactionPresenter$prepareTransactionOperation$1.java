// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.transaction.approve;

import kotlin.Metadata;
import hg2.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@c(c = "com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionPresenter", f = "ApproveTransactionPresenter.kt", l = { 255 }, m = "prepareTransactionOperation")
@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class ApproveTransactionPresenter$prepareTransactionOperation$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public Object result;
    public final ApproveTransactionPresenter this$0;
    
    public ApproveTransactionPresenter$prepareTransactionOperation$1(final ApproveTransactionPresenter this$0, final gg2.c<? super ApproveTransactionPresenter$prepareTransactionOperation$1> c) {
        this.this$0 = this$0;
        super((gg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return ApproveTransactionPresenter.Jb(this.this$0, (gg2.c)this);
    }
}
