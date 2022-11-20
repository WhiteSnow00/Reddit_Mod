// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.edit_username;

import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import gg2.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import javax.inject.Inject;
import ng2.e;
import lb0.b;

public final class a
{
    public final b a;
    public final lb0.a b;
    public final d20.a c;
    
    @Inject
    public a(final com.reddit.data.username.a a, final lb0.a b, final d20.a c) {
        e.f((Object)b, "suggestedUsernamesCache");
        this.a = (b)a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final ContinuationImpl continuationImpl) {
        return g.j((CoroutineContext)this.c.c(), (p)new GetSuggestedUsernamesUseCase$getSuggestedUsernames$2(this, (c)null), (c)continuationImpl);
    }
}
