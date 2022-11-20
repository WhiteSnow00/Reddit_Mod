// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed;

import kotlin.Metadata;
import hg2.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@c(c = "com.reddit.vault.feature.vault.feed.VaultFeedPresenter", f = "VaultFeedPresenter.kt", l = { 316 }, m = "queryForMemberships")
@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
final class VaultFeedPresenter$queryForMemberships$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public Object result;
    public final VaultFeedPresenter this$0;
    
    public VaultFeedPresenter$queryForMemberships$1(final VaultFeedPresenter this$0, final gg2.c<? super VaultFeedPresenter$queryForMemberships$1> c) {
        this.this$0 = this$0;
        super((gg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return VaultFeedPresenter.vb(this.this$0, (gg2.c)this);
    }
}
