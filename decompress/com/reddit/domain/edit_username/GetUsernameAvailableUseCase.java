// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.edit_username;

import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import d20.a;
import xd0.l0;

public final class GetUsernameAvailableUseCase
{
    public final l0 a;
    public final a b;
    
    @Inject
    public GetUsernameAvailableUseCase(final l0 a, final a b) {
        e.f((Object)a, "usernameAvailableRepository");
        e.f((Object)b, "dispatcherProvider");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final String s, final c<? super Boolean> c) {
        GetUsernameAvailableUseCase$isUsernameAvailable$1 getUsernameAvailableUseCase$isUsernameAvailable$2 = null;
        Label_0051: {
            if (c instanceof GetUsernameAvailableUseCase$isUsernameAvailable$1) {
                final GetUsernameAvailableUseCase$isUsernameAvailable$1 getUsernameAvailableUseCase$isUsernameAvailable$1 = (GetUsernameAvailableUseCase$isUsernameAvailable$1)c;
                final int label = getUsernameAvailableUseCase$isUsernameAvailable$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    getUsernameAvailableUseCase$isUsernameAvailable$1.label = label + Integer.MIN_VALUE;
                    getUsernameAvailableUseCase$isUsernameAvailable$2 = getUsernameAvailableUseCase$isUsernameAvailable$1;
                    break Label_0051;
                }
            }
            getUsernameAvailableUseCase$isUsernameAvailable$2 = new GetUsernameAvailableUseCase$isUsernameAvailable$1(this, (c)c);
        }
        final Object result = getUsernameAvailableUseCase$isUsernameAvailable$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = getUsernameAvailableUseCase$isUsernameAvailable$2.label;
        Object j;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            j = result;
        }
        else {
            d.b4(result);
            final ij2.a c2 = this.b.c();
            final GetUsernameAvailableUseCase$isUsernameAvailable$2 getUsernameAvailableUseCase$isUsernameAvailable$3 = new GetUsernameAvailableUseCase$isUsernameAvailable$2(this, s, (c)null);
            getUsernameAvailableUseCase$isUsernameAvailable$2.label = 1;
            if ((j = g.j((CoroutineContext)c2, (p)getUsernameAvailableUseCase$isUsernameAvailable$3, (c)getUsernameAvailableUseCase$isUsernameAvailable$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        e.e(j, "suspend fun isUsernameAv\u2026ble(username).await()\n  }");
        return j;
    }
}
