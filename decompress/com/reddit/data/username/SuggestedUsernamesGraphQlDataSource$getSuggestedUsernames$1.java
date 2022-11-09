// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.username;

import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.username.SuggestedUsernamesGraphQlDataSource", f = "SuggestedUsernamesGraphQlDataSource.kt", l = { 13 }, m = "getSuggestedUsernames")
final class SuggestedUsernamesGraphQlDataSource$getSuggestedUsernames$1 extends ContinuationImpl
{
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ a this$0;
    
    public SuggestedUsernamesGraphQlDataSource$getSuggestedUsernames$1(final a this$0, final tg2.c<? super SuggestedUsernamesGraphQlDataSource$getSuggestedUsernames$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(0, (tg2.c)this);
    }
}
