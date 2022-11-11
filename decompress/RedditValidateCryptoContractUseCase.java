// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.domain;

import ff2.c0;
import kotlinx.coroutines.rx2.d;
import ff0.t0;
import x82.n;
import kotlin.Result;
import yd.b;
import com.reddit.domain.model.AccountInfo;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import w82.h$a;
import x82.a$a;
import cj2.j;
import com.reddit.marketplace.impl.screens.nft.transfer.NftTransferViewModel$special$$inlined$map$1$2$1;
import javax.inject.Inject;
import sg2.e;
import com.reddit.vault.data.repository.RedditCryptoContractRepository;
import r82.a;
import w82.h;

public final class RedditValidateCryptoContractUseCase implements h
{
    public final a a;
    public final ff0.a b;
    
    @Inject
    public RedditValidateCryptoContractUseCase(final RedditCryptoContractRepository a, final ff0.a b) {
        e.f((Object)b, "accountInfoUseCase");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final String s, final NftTransferViewModel$special$$inlined$map$1$2$1 nftTransferViewModel$special$$inlined$map$1$2$1) {
        e.f((Object)s, "text");
        if (j.O0(s, "0x", false)) {
            Object a;
            if (a$a.a(s)) {
                a = new h$a.c(new x82.a(s), null, null);
            }
            else {
                a = h$a.a.a;
            }
            return a;
        }
        return this.b(s, (c<? super h$a>)nftTransferViewModel$special$$inlined$map$1$2$1);
    }
    
    public final Object b(String a, final c<? super h$a> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RedditValidateCryptoContractUseCase$fetchContractByUsername$1) {
                final RedditValidateCryptoContractUseCase$fetchContractByUsername$1 redditValidateCryptoContractUseCase$fetchContractByUsername$1 = (RedditValidateCryptoContractUseCase$fetchContractByUsername$1)c;
                final int label = redditValidateCryptoContractUseCase$fetchContractByUsername$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditValidateCryptoContractUseCase$fetchContractByUsername$1.label = label + Integer.MIN_VALUE;
                    o = redditValidateCryptoContractUseCase$fetchContractByUsername$1;
                    break Label_0050;
                }
            }
            o = new RedditValidateCryptoContractUseCase$fetchContractByUsername$1(this, (c)c);
        }
        Object o2 = ((RedditValidateCryptoContractUseCase$fetchContractByUsername$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditValidateCryptoContractUseCase$fetchContractByUsername$1)o).label;
        Object a2 = null;
        Label_0143: {
            if (label2 == 0) {
                break Label_0143;
            }
            Label_0128: {
                if (label2 == 1) {
                    break Label_0128;
                }
                Label_0118: {
                    if (label2 != 2) {
                        break Label_0118;
                    }
                    final AccountInfo accountInfo = (AccountInfo)((RedditValidateCryptoContractUseCase$fetchContractByUsername$1)o).L$1;
                    RedditValidateCryptoContractUseCase l$0 = (RedditValidateCryptoContractUseCase)((RedditValidateCryptoContractUseCase$fetchContractByUsername$1)o).L$0;
                    try {
                        yd.b.k0(o2);
                        Object o3 = ((Result)o2).unbox-impl();
                        AccountInfo l$2 = accountInfo;
                        final String iconUrl;
                        Label_0254: {
                            iconUrl = l$2.getAccount().getIconUrl();
                        }
                        l$0.getClass();
                        Object o4;
                        if (Result.isSuccess-impl(o3)) {
                            final n n = (n)o3;
                            a = n.a;
                            o4 = Result.constructor-impl((Object)new h$a.c(n.d, a, iconUrl));
                        }
                        else {
                            o4 = Result.constructor-impl(o3);
                        }
                        if (Result.exceptionOrNull-impl(o4) != null) {
                            o4 = h$a.b.a;
                        }
                        a2 = o4;
                        return a2;
                        while (true) {
                            l$2 = (AccountInfo)o2;
                            final a a3 = l$0.a;
                            final String kindWithId = l$2.getAccount().getKindWithId();
                            ((RedditValidateCryptoContractUseCase$fetchContractByUsername$1)o).L$0 = l$0;
                            ((RedditValidateCryptoContractUseCase$fetchContractByUsername$1)o).L$1 = l$2;
                            ((RedditValidateCryptoContractUseCase$fetchContractByUsername$1)o).label = 2;
                            o3 = a3.a(kindWithId, (c<? super Result<n>>)o);
                            iftrue(Label_0254:)(o3 != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            l$0 = (RedditValidateCryptoContractUseCase)((RedditValidateCryptoContractUseCase$fetchContractByUsername$1)o).L$0;
                            yd.b.k0(o2);
                            continue;
                            yd.b.k0(o2);
                            final ff0.a$a a$a = new ff0.a$a(a);
                            final ff0.a b = this.b;
                            b.getClass();
                            final c0 b2 = b.b0((t0)a$a);
                            ((RedditValidateCryptoContractUseCase$fetchContractByUsername$1)o).L$0 = this;
                            ((RedditValidateCryptoContractUseCase$fetchContractByUsername$1)o).label = 1;
                            o2 = d.b(b2, (c)o);
                            iftrue(Label_0197:)(o2 != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
                            Label_0197:
                            l$0 = this;
                            continue;
                        }
                    }
                    catch (final Exception ex) {
                        a2 = h$a.b.a;
                    }
                }
            }
        }
        return a2;
    }
}
