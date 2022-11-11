// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.feed;

import mg2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.vault.feature.vault.feed.VaultFeedPresenter", f = "VaultFeedPresenter.kt", l = { 316 }, m = "queryForMemberships")
final class VaultFeedPresenter$queryForMemberships$1 extends ContinuationImpl
{
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ VaultFeedPresenter this$0;
    
    public VaultFeedPresenter$queryForMemberships$1(final VaultFeedPresenter this$0, final lg2.c<? super VaultFeedPresenter$queryForMemberships$1> c) {
        this.this$0 = this$0;
        super((lg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return VaultFeedPresenter.Ac(this.this$0, (lg2.c)this);
    }
}
