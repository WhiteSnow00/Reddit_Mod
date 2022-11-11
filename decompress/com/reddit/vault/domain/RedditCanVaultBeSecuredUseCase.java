// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.domain;

import com.reddit.vault.manager.VaultBackupState;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import javax.inject.Inject;
import sg2.e;
import hw0.b;
import w82.a;

public final class RedditCanVaultBeSecuredUseCase implements a
{
    public final wa2.a a;
    public final b b;
    
    @Inject
    public RedditCanVaultBeSecuredUseCase(final wa2.a a, final b b) {
        e.f((Object)a, "cryptoVaultManager");
        e.f((Object)b, "marketplaceFeatures");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final c<? super Boolean> c) {
        RedditCanVaultBeSecuredUseCase$invoke$1 redditCanVaultBeSecuredUseCase$invoke$2 = null;
        Label_0047: {
            if (c instanceof RedditCanVaultBeSecuredUseCase$invoke$1) {
                final RedditCanVaultBeSecuredUseCase$invoke$1 redditCanVaultBeSecuredUseCase$invoke$1 = (RedditCanVaultBeSecuredUseCase$invoke$1)c;
                final int label = redditCanVaultBeSecuredUseCase$invoke$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditCanVaultBeSecuredUseCase$invoke$1.label = label + Integer.MIN_VALUE;
                    redditCanVaultBeSecuredUseCase$invoke$2 = redditCanVaultBeSecuredUseCase$invoke$1;
                    break Label_0047;
                }
            }
            redditCanVaultBeSecuredUseCase$invoke$2 = new RedditCanVaultBeSecuredUseCase$invoke$1(this, (c)c);
        }
        Object o = redditCanVaultBeSecuredUseCase$invoke$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditCanVaultBeSecuredUseCase$invoke$2.label;
        boolean b = true;
        Label_0216: {
            Label_0206: {
                RedditCanVaultBeSecuredUseCase redditCanVaultBeSecuredUseCase;
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            yd.b.k0(o);
                            break Label_0206;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        redditCanVaultBeSecuredUseCase = (RedditCanVaultBeSecuredUseCase)redditCanVaultBeSecuredUseCase$invoke$2.L$0;
                        yd.b.k0(o);
                    }
                }
                else {
                    yd.b.k0(o);
                    if (!this.b.m()) {
                        break Label_0216;
                    }
                    final wa2.a a = this.a;
                    redditCanVaultBeSecuredUseCase$invoke$2.L$0 = this;
                    redditCanVaultBeSecuredUseCase$invoke$2.label = 1;
                    o = a.e();
                    if (o == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    redditCanVaultBeSecuredUseCase = this;
                }
                if (!(boolean)o) {
                    break Label_0216;
                }
                final wa2.a a2 = redditCanVaultBeSecuredUseCase.a;
                redditCanVaultBeSecuredUseCase$invoke$2.L$0 = null;
                redditCanVaultBeSecuredUseCase$invoke$2.label = 2;
                if ((o = a2.g()) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            if (o != VaultBackupState.BACKED_UP) {
                return b;
            }
        }
        b = false;
        return b;
    }
}
