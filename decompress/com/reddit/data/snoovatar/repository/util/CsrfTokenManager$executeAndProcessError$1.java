// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository.util;

import zg2.p;
import ug2.c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
@c(c = "com.reddit.data.snoovatar.repository.util.CsrfTokenManager", f = "CsrfTokenManager.kt", l = { 53 }, m = "executeAndProcessError")
final class CsrfTokenManager$executeAndProcessError$1<T> extends ContinuationImpl
{
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CsrfTokenManager this$0;
    
    public CsrfTokenManager$executeAndProcessError$1(final CsrfTokenManager this$0, final tg2.c<? super CsrfTokenManager$executeAndProcessError$1> c) {
        this.this$0 = this$0;
        super((tg2.c)c);
    }
    
    public final Object invokeSuspend(final Object result) {
        this.result = result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, (tg2.c)this);
    }
}
