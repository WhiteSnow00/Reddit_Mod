// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.repository;

import java.util.Iterator;
import java.util.Map;
import com.reddit.vault.model.CryptoContractData;
import java.util.List;
import nu2.w;
import com.reddit.vault.model.CryptoContractsResponse;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import com.reddit.vault.data.remote.RemoteVaultDataSource$a;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import x82.n;
import kotlin.Result;
import lg2.c;
import javax.inject.Inject;
import sg2.e;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import r82.a;

public final class RedditCryptoContractRepository implements a
{
    public final RemoteVaultDataSource a;
    
    @Inject
    public RedditCryptoContractRepository(final RemoteVaultDataSource a) {
        e.f((Object)a, "remoteVaultDataSource");
        this.a = a;
    }
    
    @Override
    public final Object a(String b, final c<? super Result<n>> c) {
        RedditCryptoContractRepository$getContractByUserId$1 redditCryptoContractRepository$getContractByUserId$2 = null;
        Label_0050: {
            if (c instanceof RedditCryptoContractRepository$getContractByUserId$1) {
                final RedditCryptoContractRepository$getContractByUserId$1 redditCryptoContractRepository$getContractByUserId$1 = (RedditCryptoContractRepository$getContractByUserId$1)c;
                final int label = redditCryptoContractRepository$getContractByUserId$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditCryptoContractRepository$getContractByUserId$1.label = label + Integer.MIN_VALUE;
                    redditCryptoContractRepository$getContractByUserId$2 = redditCryptoContractRepository$getContractByUserId$1;
                    break Label_0050;
                }
            }
            redditCryptoContractRepository$getContractByUserId$2 = new RedditCryptoContractRepository$getContractByUserId$1(this, (c)c);
        }
        Object o = redditCryptoContractRepository$getContractByUserId$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditCryptoContractRepository$getContractByUserId$2.label;
        RedditCryptoContractRepository redditCryptoContractRepository;
        RedditCryptoContractRepository redditCryptoContractRepository2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redditCryptoContractRepository = (RedditCryptoContractRepository)redditCryptoContractRepository$getContractByUserId$2.L$2;
            b = (String)redditCryptoContractRepository$getContractByUserId$2.L$1;
            redditCryptoContractRepository2 = (RedditCryptoContractRepository)redditCryptoContractRepository$getContractByUserId$2.L$0;
            b.k0(o);
        }
        else {
            b.k0(o);
            final RemoteVaultDataSource a = this.a;
            redditCryptoContractRepository$getContractByUserId$2.L$0 = this;
            redditCryptoContractRepository$getContractByUserId$2.L$1 = b;
            redditCryptoContractRepository$getContractByUserId$2.L$2 = this;
            redditCryptoContractRepository$getContractByUserId$2.label = 1;
            o = RemoteVaultDataSource$a.a(a, b, (ContinuationImpl)redditCryptoContractRepository$getContractByUserId$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditCryptoContractRepository2 = (redditCryptoContractRepository = this);
        }
        final CryptoContractsResponse cryptoContractsResponse = (CryptoContractsResponse)((w)o).b;
        final CryptoContractData cryptoContractData = null;
        final CryptoContractData cryptoContractData2 = null;
        CryptoContractData cryptoContractData3 = cryptoContractData;
        if (cryptoContractsResponse != null) {
            final Map a2 = cryptoContractsResponse.a;
            cryptoContractData3 = cryptoContractData;
            if (a2 != null) {
                final List list = a2.get(b);
                cryptoContractData3 = cryptoContractData;
                if (list != null) {
                    final Iterator iterator = list.iterator();
                    CryptoContractData cryptoContractData4;
                    Object next;
                    do {
                        next = cryptoContractData2;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        next = iterator.next();
                        cryptoContractData4 = (CryptoContractData)next;
                        redditCryptoContractRepository2.getClass();
                    } while (!cryptoContractData4.c || cryptoContractData4.d == null);
                    cryptoContractData3 = (CryptoContractData)next;
                }
            }
        }
        redditCryptoContractRepository.getClass();
        Object o2;
        if (cryptoContractData3 != null) {
            final String a3 = cryptoContractData3.a;
            b = cryptoContractData3.b;
            final x82.a d = cryptoContractData3.d;
            if (d == null) {
                o2 = Result.constructor-impl((Object)b.o((Throwable)new InvalidAddressException()));
            }
            else {
                o2 = Result.constructor-impl((Object)new n(a3, b, cryptoContractData3.c, d));
            }
        }
        else {
            o2 = Result.constructor-impl((Object)b.o((Throwable)new ContractNotFoundException()));
        }
        return o2;
    }
}
