// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.remote.RemoteGqlGeoDataSource", f = "RemoteGqlGeoDataSource.kt", l = { 19 }, m = "getAutocompleteSuggestions")
final class RemoteGqlGeoDataSource$getAutocompleteSuggestions$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RemoteGqlGeoDataSource this$0;
    
    public RemoteGqlGeoDataSource$getAutocompleteSuggestions$1(final RemoteGqlGeoDataSource this$0, final tg2.c<? super RemoteGqlGeoDataSource$getAutocompleteSuggestions$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, (tg2.c)this);
    }
}
