// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.domain;

import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import w82.e$a;
import javax.inject.Inject;
import va0.e0;
import r82.c;
import w82.a;
import w82.e;

public final class RedditGetVaultDrawerInfoUseCase implements e
{
    public final a a;
    public final c b;
    public final e0 c;
    
    @Inject
    public RedditGetVaultDrawerInfoUseCase(final a a, final c b, final e0 c) {
        sg2.e.f((Object)a, "canVaultBeSecured");
        sg2.e.f((Object)b, "vaultRepository");
        sg2.e.f((Object)c, "vaultFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final lg2.c<? super e$a> c) {
        RedditGetVaultDrawerInfoUseCase$invoke$1 redditGetVaultDrawerInfoUseCase$invoke$1 = null;
        Label_0045: {
            if (c instanceof RedditGetVaultDrawerInfoUseCase$invoke$1) {
                redditGetVaultDrawerInfoUseCase$invoke$1 = (RedditGetVaultDrawerInfoUseCase$invoke$1)c;
                final int label = redditGetVaultDrawerInfoUseCase$invoke$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditGetVaultDrawerInfoUseCase$invoke$1.label = label + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            redditGetVaultDrawerInfoUseCase$invoke$1 = new RedditGetVaultDrawerInfoUseCase$invoke$1(this, (lg2.c)c);
        }
        Object o = redditGetVaultDrawerInfoUseCase$invoke$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditGetVaultDrawerInfoUseCase$invoke$1.label;
        boolean b = true;
        int i$0 = 0;
        Object z = null;
        Label_0236: {
            RedditGetVaultDrawerInfoUseCase redditGetVaultDrawerInfoUseCase = null;
            Label_0189: {
                if (label2 != 0) {
                    if (label2 != 1) {
                        if (label2 == 2) {
                            i$0 = redditGetVaultDrawerInfoUseCase$invoke$1.I$0;
                            yd.b.k0(o);
                            z = o;
                            break Label_0236;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        redditGetVaultDrawerInfoUseCase = (RedditGetVaultDrawerInfoUseCase)redditGetVaultDrawerInfoUseCase$invoke$1.L$0;
                        yd.b.k0(o);
                    }
                }
                else {
                    yd.b.k0(o);
                    if (!this.c.h7()) {
                        redditGetVaultDrawerInfoUseCase = this;
                        i$0 = 0;
                        break Label_0189;
                    }
                    final a a = this.a;
                    redditGetVaultDrawerInfoUseCase$invoke$1.L$0 = this;
                    redditGetVaultDrawerInfoUseCase$invoke$1.label = 1;
                    o = a.a((lg2.c)redditGetVaultDrawerInfoUseCase$invoke$1);
                    if (o == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    redditGetVaultDrawerInfoUseCase = this;
                }
                i$0 = (((boolean)o) ? 1 : 0);
            }
            final RedditGetVaultDrawerInfoUseCase$invoke$$inlined$map.RedditGetVaultDrawerInfoUseCase$invoke$$inlined$map$1 redditGetVaultDrawerInfoUseCase$invoke$$inlined$map$1 = new RedditGetVaultDrawerInfoUseCase$invoke$$inlined$map.RedditGetVaultDrawerInfoUseCase$invoke$$inlined$map$1(redditGetVaultDrawerInfoUseCase.b.e());
            redditGetVaultDrawerInfoUseCase$invoke$1.L$0 = null;
            redditGetVaultDrawerInfoUseCase$invoke$1.I$0 = i$0;
            redditGetVaultDrawerInfoUseCase$invoke$1.label = 2;
            z = kotlinx.coroutines.flow.a.z((hj2.e)redditGetVaultDrawerInfoUseCase$invoke$$inlined$map$1, (lg2.c)redditGetVaultDrawerInfoUseCase$invoke$1);
            if (z == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final Integer n = (Integer)z;
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        if (i$0 == 0) {
            b = false;
        }
        return new e$a(intValue, b);
    }
}
