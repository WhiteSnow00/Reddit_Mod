// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.remote.RemoteGqlLinkDataSource", f = "RemoteGqlLinkDataSource.kt", l = { 1219 }, m = "getCommentPageAdsListing")
final class RemoteGqlLinkDataSource$getCommentPageAdsListing$1 extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RemoteGqlLinkDataSource this$0;
    
    public RemoteGqlLinkDataSource$getCommentPageAdsListing$1(final RemoteGqlLinkDataSource this$0, final tg2.c<? super RemoteGqlLinkDataSource$getCommentPageAdsListing$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(0, null, null, (tg2.c)this);
    }
}
