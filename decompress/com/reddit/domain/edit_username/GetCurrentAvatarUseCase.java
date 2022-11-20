// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.edit_username;

import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import com.reddit.session.Session;
import ff0.a;

public final class GetCurrentAvatarUseCase
{
    public final a a;
    public final Session b;
    public final d20.a c;
    
    @Inject
    public GetCurrentAvatarUseCase(final a a, final Session b, final d20.a c) {
        e.f((Object)a, "accountUseCase");
        e.f((Object)b, "activeSession");
        e.f((Object)c, "dispatcherProvider");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final c<? super mb0.a> c) {
        return g.j((CoroutineContext)this.c.c(), (p)new GetCurrentAvatarUseCase$getAvatar$2(this, (c)null), c);
    }
}
