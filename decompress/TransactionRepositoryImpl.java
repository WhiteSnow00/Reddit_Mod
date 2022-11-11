// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.data.repository;

import com.reddit.vault.model.MetaTransactions;
import com.reddit.vault.model.VaultContract;
import com.reddit.vault.model.VaultProviderExtra;
import com.reddit.vault.model.VaultProvider;
import com.reddit.vault.model.AllowedContractMethod;
import com.reddit.vault.model.VaultInfoResponse;
import java.util.concurrent.ConcurrentMap;
import k82.y;
import java.math.BigDecimal;
import x82.m0;
import kotlin.Triple;
import x82.i;
import com.reddit.vault.data.exception.NoTransactionContractsException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.vault.model.OnRampResponse;
import java.util.List;
import nu2.w;
import x82.x;
import pd.r;
import p82.f;
import o82.a$a;
import o82.a$b;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import x82.m;
import x82.c0;
import x82.l0;
import com.reddit.vault.domain.model.PendingTransactionSubtype;
import com.reddit.vault.domain.model.TransactionType;
import java.text.DecimalFormat;
import y82.g$b;
import y82.g$d;
import com.reddit.vault.util.PointsFormat;
import y82.g$e;
import java.math.BigInteger;
import ig2.j;
import a4.a0;
import a92.b;
import kotlin.NoWhenBranchMatchedException;
import y82.b$b;
import y82.b$a;
import com.reddit.vault.data.exception.InvalidTransactionException;
import y82.g$a;
import y82.g$c;
import javax.inject.Inject;
import sg2.e;
import z82.a;
import java.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashMap;
import w82.d;
import p82.g;
import y82.c;
import com.reddit.vault.data.local.LocalVaultDataSource;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import y82.h;

public final class TransactionRepositoryImpl implements h
{
    public final RemoteVaultDataSource a;
    public final LocalVaultDataSource b;
    public final c c;
    public final g d;
    public final d e;
    public LinkedHashMap f;
    public final ConcurrentHashMap<String, a> g;
    
    @Inject
    public TransactionRepositoryImpl(final RemoteVaultDataSource a, final LocalVaultDataSource b, final c c, final g d, final d e) {
        sg2.e.f((Object)a, "remoteVaultDataSource");
        sg2.e.f((Object)b, "localVaultDataSource");
        sg2.e.f((Object)c, "communitiesRepository");
        sg2.e.f((Object)d, "transactionServiceRegistry");
        sg2.e.f((Object)e, "transactionProviderUseCase");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = new LinkedHashMap();
        this.g = new ConcurrentHashMap<String, a>();
    }
    
    public static x82.c j(final a a, final y82.g g) {
        if (!(g instanceof g$c)) {
            x82.c c2;
            if (g instanceof g$a) {
                final a92.c d = a.d;
                if (d == null) {
                    throw new InvalidTransactionException();
                }
                final g$a g$a = (g$a)g;
                final y82.b d2 = g$a.d;
                String s;
                if (d2 instanceof b$a) {
                    final StringBuilder r = a.r("reddit:coins:");
                    r.append(((b$a)g$a.d).a);
                    s = r.toString();
                }
                else {
                    if (!(d2 instanceof b$b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s = ((b$b)d2).a;
                }
                final BigInteger c = g$a.c;
                final byte[] bytes = s.getBytes(cj2.a.b);
                e.e((Object)bytes, "this as java.lang.String).getBytes(charset)");
                e.f((Object)c, "amount");
                c2 = x82.c.a(d.b, (x82.a)null, (BigInteger)null, (BigInteger)null, (BigInteger)null, (BigInteger)null, j.P0(b.g, a0.I(a0.N0(c, new en2.a(256)), (dn2.a)a0.P0(bytes))), (BigInteger)null, (BigInteger)null, (BigInteger)null, 959);
            }
            else if (g instanceof g$e) {
                final a92.c d3 = a.d;
                if (d3 == null) {
                    throw new InvalidTransactionException();
                }
                final g$e g$e = (g$e)g;
                final x82.a e = g$e.e;
                final DecimalFormat a2 = PointsFormat.a;
                final BigInteger value = BigInteger.valueOf(g$e.f);
                sg2.e.e((Object)value, "valueOf(this)");
                final BigInteger a3 = PointsFormat.a(value);
                sg2.e.f((Object)e, "recipient");
                c2 = x82.c.a(d3.b, (x82.a)null, (BigInteger)null, (BigInteger)null, (BigInteger)null, (BigInteger)null, j.P0(b.f, a0.I((dn2.a)a0.O0(e), a0.N0(a3, new en2.a(256)))), (BigInteger)null, (BigInteger)null, (BigInteger)null, 959);
            }
            else if (g instanceof g$d) {
                final a92.d c3 = a.c;
                if (c3 == null) {
                    throw new InvalidTransactionException();
                }
                final x82.a d4 = ((g$d)g).d;
                e.f((Object)d4, "recipient");
                final x82.c b = c3.b;
                final byte[] h = bg.d.h;
                final fn2.a o0 = a0.O0(d4);
                final byte[] array = new byte[32];
                for (int i = 0; i < 32; ++i) {
                    int n;
                    if (i == 31) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    array[i] = (byte)n;
                }
                c2 = x82.c.a(b, (x82.a)null, (BigInteger)null, (BigInteger)null, (BigInteger)null, (BigInteger)null, j.P0(h, a0.I((dn2.a)o0, (dn2.a)new fn2.b(array))), (BigInteger)null, (BigInteger)null, (BigInteger)null, 959);
            }
            else {
                if (!(g instanceof g$b)) {
                    throw new NoWhenBranchMatchedException();
                }
                final a92.d c4 = a.c;
                if (c4 == null) {
                    throw new InvalidTransactionException();
                }
                final x82.a d5 = ((g$b)g).d;
                e.f((Object)d5, "recipient");
                c2 = x82.c.a(c4.b, (x82.a)null, (BigInteger)null, (BigInteger)null, (BigInteger)null, (BigInteger)null, j.P0(bg.d.g, a0.I((dn2.a)a0.O0(d5))), (BigInteger)null, (BigInteger)null, (BigInteger)null, 959);
            }
            return c2;
        }
        if (a.b == null) {
            throw new InvalidTransactionException();
        }
        final g$c g$c = (g$c)g;
        throw null;
    }
    
    public static /* synthetic */ Object l(final TransactionRepositoryImpl transactionRepositoryImpl, final BigInteger bigInteger, String s, x82.a a, x82.a a2, final BigInteger bigInteger2, String s2, final TransactionType transactionType, PendingTransactionSubtype pendingTransactionSubtype, String s3, String s4, Integer n, String s5, final lg2.c c, final int n2) {
        if ((n2 & 0x2) != 0x0) {
            s = null;
        }
        if ((n2 & 0x4) != 0x0) {
            a = null;
        }
        if ((n2 & 0x8) != 0x0) {
            a2 = null;
        }
        if ((n2 & 0x20) != 0x0) {
            s2 = null;
        }
        if ((n2 & 0x80) != 0x0) {
            pendingTransactionSubtype = null;
        }
        if ((n2 & 0x100) != 0x0) {
            s3 = null;
        }
        if ((n2 & 0x200) != 0x0) {
            s4 = null;
        }
        if ((n2 & 0x400) != 0x0) {
            n = null;
        }
        if ((n2 & 0x800) != 0x0) {
            s5 = null;
        }
        return transactionRepositoryImpl.k(bigInteger, s, a, a2, bigInteger2, s2, transactionType, pendingTransactionSubtype, s3, s4, n, s5, null, null, (lg2.c<? super l0>)c);
    }
    
    public static /* synthetic */ Object o(final TransactionRepositoryImpl transactionRepositoryImpl, final x82.h h, final c0 c0, final x82.c c2, final m m, final a a, final ContinuationImpl continuationImpl) {
        return transactionRepositoryImpl.n(h, c0, c2, m, a, 0, null, (lg2.c<? super p82.e>)continuationImpl);
    }
    
    @Override
    public final Object a(x82.a l$1, final lg2.c<? super o82.a<p82.b>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof TransactionRepositoryImpl$gasBalance$1) {
                final TransactionRepositoryImpl$gasBalance$1 transactionRepositoryImpl$gasBalance$1 = (TransactionRepositoryImpl$gasBalance$1)c;
                final int label = transactionRepositoryImpl$gasBalance$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    transactionRepositoryImpl$gasBalance$1.label = label + Integer.MIN_VALUE;
                    o = transactionRepositoryImpl$gasBalance$1;
                    break Label_0050;
                }
            }
            o = new TransactionRepositoryImpl$gasBalance$1(this, (lg2.c)c);
        }
        Object o2 = ((TransactionRepositoryImpl$gasBalance$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((TransactionRepositoryImpl$gasBalance$1)o).label;
        TransactionRepositoryImpl transactionRepositoryImpl;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$1 = (x82.a)((TransactionRepositoryImpl$gasBalance$1)o).L$1;
            transactionRepositoryImpl = (TransactionRepositoryImpl)((TransactionRepositoryImpl$gasBalance$1)o).L$0;
            yd.b.k0(o2);
        }
        else {
            yd.b.k0(o2);
            if (this.f.containsKey(l$1) && ((r82.b)kotlin.collections.c.W0((Map)this.f, (Object)l$1)).b >= System.currentTimeMillis()) {
                return new a$b((Object)((r82.b)kotlin.collections.c.W0((Map)this.f, (Object)l$1)).a);
            }
            final f a = this.d.a((c0)c0.c.c);
            ((TransactionRepositoryImpl$gasBalance$1)o).L$0 = this;
            ((TransactionRepositoryImpl$gasBalance$1)o).L$1 = l$1;
            ((TransactionRepositoryImpl$gasBalance$1)o).label = 1;
            o2 = a.a(l$1, (lg2.c)o);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            transactionRepositoryImpl = this;
        }
        final p82.b b = (p82.b)o2;
        Object o3;
        if (b != null) {
            transactionRepositoryImpl.f.put(l$1, new r82.b(b, System.currentTimeMillis() + 300000));
            o3 = new a$b((Object)b);
        }
        else {
            o3 = new a$a((Exception)null);
        }
        return o3;
    }
    
    @Override
    public final Object b(final String s, final lg2.c<? super l0> c) {
        final LocalVaultDataSource b = this.b;
        sg2.e.g((Object)s, "string");
        return b.g(r.L(s), (lg2.c)c);
    }
    
    @Override
    public final Object c(final String s, final lg2.c<? super x> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof TransactionRepositoryImpl$getOnRampProvider$1) {
                final TransactionRepositoryImpl$getOnRampProvider$1 transactionRepositoryImpl$getOnRampProvider$1 = (TransactionRepositoryImpl$getOnRampProvider$1)c;
                final int label = transactionRepositoryImpl$getOnRampProvider$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    transactionRepositoryImpl$getOnRampProvider$1.label = label + Integer.MIN_VALUE;
                    o = transactionRepositoryImpl$getOnRampProvider$1;
                    break Label_0050;
                }
            }
            o = new TransactionRepositoryImpl$getOnRampProvider$1(this, (lg2.c)c);
        }
        final Object result = ((TransactionRepositoryImpl$getOnRampProvider$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((TransactionRepositoryImpl$getOnRampProvider$1)o).label;
        final Object o2 = null;
        Object b = null;
        Label_0163: {
            Object onRampProviders = null;
            Label_0146: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        Label_0157: {
                            try {
                                yd.b.k0(result);
                                onRampProviders = result;
                                break Label_0146;
                            }
                            catch (final Exception ex) {
                                break Label_0157;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        final Exception ex;
                        ex.printStackTrace();
                        b = null;
                        break Label_0163;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yd.b.k0(result);
                final RemoteVaultDataSource a = this.a;
                ((TransactionRepositoryImpl$getOnRampProvider$1)o).label = 1;
                if ((onRampProviders = a.getOnRampProviders(s, "android", (lg2.c)o)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            b = ((w)onRampProviders).b;
        }
        final List list = (List)b;
        if (list == null) {
            return null;
        }
        final OnRampResponse onRampResponse = (OnRampResponse)CollectionsKt___CollectionsKt.C3(list);
        Object o3 = o2;
        if (onRampResponse != null) {
            o3 = new x(onRampResponse.a, onRampResponse.b, onRampResponse.c);
        }
        return o3;
    }
    
    @Override
    public final Object d(final String s, final lg2.c<? super l0> c) {
        sg2.e.g((Object)s, "string");
        final BigInteger l = r.L(s);
        final BigInteger zero = BigInteger.ZERO;
        sg2.e.e((Object)zero, "ZERO");
        return l(this, l, null, null, null, zero, "Ethereum Purchase", TransactionType.ETH_PURCHASE, null, null, null, null, null, c, 16270);
    }
    
    @Override
    public final Object e(final y82.g g, m l$2, final lg2.c<? super o82.a<y82.e>> c) {
        y82.g l$3 = g;
        TransactionRepositoryImpl$executeOperation$1 transactionRepositoryImpl$executeOperation$2 = null;
        Label_0053: {
            if (c instanceof TransactionRepositoryImpl$executeOperation$1) {
                final TransactionRepositoryImpl$executeOperation$1 transactionRepositoryImpl$executeOperation$1 = (TransactionRepositoryImpl$executeOperation$1)c;
                final int label = transactionRepositoryImpl$executeOperation$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    transactionRepositoryImpl$executeOperation$1.label = label + Integer.MIN_VALUE;
                    transactionRepositoryImpl$executeOperation$2 = transactionRepositoryImpl$executeOperation$1;
                    break Label_0053;
                }
            }
            transactionRepositoryImpl$executeOperation$2 = new TransactionRepositoryImpl$executeOperation$1(this, (lg2.c)c);
        }
        Object o = transactionRepositoryImpl$executeOperation$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object m = null;
        TransactionRepositoryImpl transactionRepositoryImpl2 = null;
        switch (transactionRepositoryImpl$executeOperation$2.label) {
            default: {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            case 6: {
                yd.b.k0(o);
                return o;
            }
            case 5: {
                yd.b.k0(o);
                return o;
            }
            case 4: {
                yd.b.k0(o);
                return o;
            }
            case 3: {
                yd.b.k0(o);
                return o;
            }
            case 2: {
                yd.b.k0(o);
                return o;
            }
            case 1: {
                l$2 = (m)transactionRepositoryImpl$executeOperation$2.L$2;
                l$3 = (y82.g)transactionRepositoryImpl$executeOperation$2.L$1;
                final TransactionRepositoryImpl transactionRepositoryImpl = (TransactionRepositoryImpl)transactionRepositoryImpl$executeOperation$2.L$0;
                yd.b.k0(o);
                m = o;
                transactionRepositoryImpl2 = transactionRepositoryImpl;
                break;
            }
            case 0: {
                yd.b.k0(o);
                final String f = l$3.a.f;
                transactionRepositoryImpl$executeOperation$2.L$0 = this;
                transactionRepositoryImpl$executeOperation$2.L$1 = l$3;
                transactionRepositoryImpl$executeOperation$2.L$2 = l$2;
                transactionRepositoryImpl$executeOperation$2.label = 1;
                m = this.m(f, (lg2.c<? super a>)transactionRepositoryImpl$executeOperation$2);
                if (m == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                transactionRepositoryImpl2 = this;
                break;
            }
        }
        final a a = (a)m;
        if (a == null) {
            return new a$a((Exception)new NoTransactionContractsException());
        }
        final o82.a b = transactionRepositoryImpl2.e.b(a, l$3);
        if (b instanceof a$a) {
            return new a$a(((a$a)b).a);
        }
        final c0 c2 = (c0)((a$b)b).a;
        try {
            final x82.c j = j(a, l$3);
            if (l$3 instanceof g$c) {
                final x82.h a2 = l$3.a;
                final g$c g$c = (g$c)l$3;
                transactionRepositoryImpl$executeOperation$2.L$0 = null;
                transactionRepositoryImpl$executeOperation$2.L$1 = null;
                transactionRepositoryImpl$executeOperation$2.L$2 = null;
                transactionRepositoryImpl$executeOperation$2.label = 2;
                if ((o = transactionRepositoryImpl2.i(a2, a, j, l$2, c2, (lg2.c)transactionRepositoryImpl$executeOperation$2)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                return o;
            }
            else if (l$3 instanceof g$a) {
                final x82.h a3 = l$3.a;
                final g$a g$a = (g$a)l$3;
                transactionRepositoryImpl$executeOperation$2.L$0 = null;
                transactionRepositoryImpl$executeOperation$2.L$1 = null;
                transactionRepositoryImpl$executeOperation$2.L$2 = null;
                transactionRepositoryImpl$executeOperation$2.label = 3;
                if ((o = transactionRepositoryImpl2.g(a3, a, g$a, j, l$2, c2, (lg2.c<? super o82.a<y82.e>>)transactionRepositoryImpl$executeOperation$2)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                return o;
            }
            else if (l$3 instanceof g$e) {
                final x82.h a4 = l$3.a;
                final g$e g$e = (g$e)l$3;
                final String c3 = g$e.c;
                final String d = g$e.d;
                final x82.a e = g$e.e;
                final long f2 = g$e.f;
                transactionRepositoryImpl$executeOperation$2.L$0 = null;
                transactionRepositoryImpl$executeOperation$2.L$1 = null;
                transactionRepositoryImpl$executeOperation$2.L$2 = null;
                transactionRepositoryImpl$executeOperation$2.label = 4;
                if ((o = transactionRepositoryImpl2.q(a4, a, c3, d, e, f2, j, l$2, c2, (lg2.c<? super o82.a<y82.e>>)transactionRepositoryImpl$executeOperation$2)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                return o;
            }
            else if (l$3 instanceof g$d) {
                final x82.h a5 = l$3.a;
                final i c4 = ((g$d)l$3).c;
                transactionRepositoryImpl$executeOperation$2.L$0 = null;
                transactionRepositoryImpl$executeOperation$2.L$1 = null;
                transactionRepositoryImpl$executeOperation$2.L$2 = null;
                transactionRepositoryImpl$executeOperation$2.label = 5;
                if ((o = transactionRepositoryImpl2.p(a5, a, c4, j, l$2, c2, (lg2.c<? super o82.a<y82.e>>)transactionRepositoryImpl$executeOperation$2)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                return o;
            }
            else {
                if (!(l$3 instanceof g$b)) {
                    throw new NoWhenBranchMatchedException();
                }
                final x82.h a6 = l$3.a;
                final i c5 = ((g$b)l$3).c;
                transactionRepositoryImpl$executeOperation$2.L$0 = null;
                transactionRepositoryImpl$executeOperation$2.L$1 = null;
                transactionRepositoryImpl$executeOperation$2.L$2 = null;
                transactionRepositoryImpl$executeOperation$2.label = 6;
                if ((o = transactionRepositoryImpl2.h(a6, a, c5, j, l$2, c2, (lg2.c<? super o82.a<y82.e>>)transactionRepositoryImpl$executeOperation$2)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                return o;
            }
        }
        catch (final Exception ex) {
            return new a$a(ex);
        }
    }
    
    @Override
    public final Object f(y82.g l$1, x82.a l$2, final lg2.c<? super o82.a<p82.b>> c) {
        TransactionRepositoryImpl$estimateGasCost$1 transactionRepositoryImpl$estimateGasCost$2 = null;
        Label_0054: {
            if (c instanceof TransactionRepositoryImpl$estimateGasCost$1) {
                final TransactionRepositoryImpl$estimateGasCost$1 transactionRepositoryImpl$estimateGasCost$1 = (TransactionRepositoryImpl$estimateGasCost$1)c;
                final int label = transactionRepositoryImpl$estimateGasCost$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    transactionRepositoryImpl$estimateGasCost$1.label = label + Integer.MIN_VALUE;
                    transactionRepositoryImpl$estimateGasCost$2 = transactionRepositoryImpl$estimateGasCost$1;
                    break Label_0054;
                }
            }
            transactionRepositoryImpl$estimateGasCost$2 = new TransactionRepositoryImpl$estimateGasCost$1(this, (lg2.c)c);
        }
        Object o = transactionRepositoryImpl$estimateGasCost$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = transactionRepositoryImpl$estimateGasCost$2.label;
        Object o2 = null;
        Label_0140: {
            if (label2 == 0) {
                break Label_0140;
            }
            Label_0107: {
                if (label2 == 1) {
                    break Label_0107;
                }
                Label_0096: {
                    if (label2 != 2) {
                        break Label_0096;
                    }
                    try {
                        yd.b.k0(o);
                        Label_0335: {
                            o2 = new a$b(o);
                        }
                        return o2;
                        yd.b.k0(o);
                        final String f = l$1.a.f;
                        transactionRepositoryImpl$estimateGasCost$2.L$0 = this;
                        transactionRepositoryImpl$estimateGasCost$2.L$1 = l$1;
                        transactionRepositoryImpl$estimateGasCost$2.L$2 = l$2;
                        transactionRepositoryImpl$estimateGasCost$2.label = 1;
                        o = this.m(f, (lg2.c<? super a>)transactionRepositoryImpl$estimateGasCost$2);
                        iftrue(Label_0193:)(o != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                        l$2 = (x82.a)transactionRepositoryImpl$estimateGasCost$2.L$2;
                        l$1 = (y82.g)transactionRepositoryImpl$estimateGasCost$2.L$1;
                        TransactionRepositoryImpl transactionRepositoryImpl = (TransactionRepositoryImpl)transactionRepositoryImpl$estimateGasCost$2.L$0;
                        yd.b.k0(o);
                        Label_0196: {
                            break Label_0196;
                            Label_0193:
                            transactionRepositoryImpl = this;
                            break Label_0196;
                            final a a;
                            Label_0223:
                            final o82.a b = transactionRepositoryImpl.e.b(a, l$1);
                            iftrue(Label_0260:)(!(b instanceof a$a));
                            return new a$a(((a$a)b).a);
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        final a a = (a)o;
                        iftrue(Label_0223:)(a != null);
                        return new a$a((Exception)new NoTransactionContractsException());
                        final o82.a b;
                        Label_0260:
                        final f a2 = transactionRepositoryImpl.d.a((c0)((a$b)b).a);
                        final x82.c j = j(a, l$1);
                        transactionRepositoryImpl$estimateGasCost$2.L$0 = null;
                        transactionRepositoryImpl$estimateGasCost$2.L$1 = null;
                        transactionRepositoryImpl$estimateGasCost$2.L$2 = null;
                        transactionRepositoryImpl$estimateGasCost$2.label = 2;
                        iftrue(Label_0335:)((o = a2.c(j, l$2, (lg2.c)transactionRepositoryImpl$estimateGasCost$2)) != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                    }
                    catch (final Exception ex) {
                        o2 = new a$a(ex);
                    }
                }
            }
        }
        return o2;
    }
    
    public final Object g(final x82.h l$1, final a l$2, final g$a g$a, final x82.c l$3, final m l$4, final c0 c0, final lg2.c<? super o82.a<y82.e>> c2) {
        g$a l$5 = g$a;
        TransactionRepositoryImpl$burnPoints$1 transactionRepositoryImpl$burnPoints$1 = null;
        Label_0054: {
            if (c2 instanceof TransactionRepositoryImpl$burnPoints$1) {
                transactionRepositoryImpl$burnPoints$1 = (TransactionRepositoryImpl$burnPoints$1)c2;
                final int label = transactionRepositoryImpl$burnPoints$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    transactionRepositoryImpl$burnPoints$1.label = label + Integer.MIN_VALUE;
                    break Label_0054;
                }
            }
            transactionRepositoryImpl$burnPoints$1 = new TransactionRepositoryImpl$burnPoints$1(this, (lg2.c)c2);
        }
        Object o = transactionRepositoryImpl$burnPoints$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = transactionRepositoryImpl$burnPoints$1.label;
        Object o2 = null;
        Label_0210: {
            if (label2 == 0) {
                break Label_0210;
            }
            Label_0115: {
                if (label2 == 1) {
                    break Label_0115;
                }
                Label_0104: {
                    if (label2 != 2) {
                        break Label_0104;
                    }
                    p82.e e = (p82.e)transactionRepositoryImpl$burnPoints$1.L$0;
                    try {
                        yd.b.k0(o);
                        o2 = new a$b((Object)new y82.e(e.a, e, (l0)o));
                        return o2;
                    Label_0422_Outer:
                        while (true) {
                        Label_0422:
                            while (true) {
                                while (true) {
                                    Triple triple = null;
                                    final PendingTransactionSubtype l$6 = (PendingTransactionSubtype)triple.component1();
                                    final String l$7 = (String)triple.component2();
                                    final String l$8 = (String)triple.component3();
                                    transactionRepositoryImpl$burnPoints$1.L$0 = this;
                                    transactionRepositoryImpl$burnPoints$1.L$1 = l$1;
                                    transactionRepositoryImpl$burnPoints$1.L$2 = l$2;
                                    transactionRepositoryImpl$burnPoints$1.L$3 = l$5;
                                    transactionRepositoryImpl$burnPoints$1.L$4 = l$3;
                                    transactionRepositoryImpl$burnPoints$1.L$5 = l$4;
                                    transactionRepositoryImpl$burnPoints$1.L$6 = l$6;
                                    transactionRepositoryImpl$burnPoints$1.L$7 = l$7;
                                    transactionRepositoryImpl$burnPoints$1.L$8 = l$8;
                                    transactionRepositoryImpl$burnPoints$1.label = 1;
                                    final Object o3 = o(this, l$1, c0, l$3, l$4, l$2, (ContinuationImpl)transactionRepositoryImpl$burnPoints$1);
                                    iftrue(Label_0391:)(o3 != coroutine_SUSPENDED);
                                    return coroutine_SUSPENDED;
                                    final y82.b d;
                                    triple = new Triple((Object)PendingTransactionSubtype.BURN_WITH_MEMO, (Object)"Burn Points", (Object)((b$b)d).b);
                                    continue Label_0422_Outer;
                                    Label_0579: {
                                        final p82.e l$9;
                                        e = l$9;
                                    }
                                    return new a$b((Object)new y82.e(e.a, e, (l0)o));
                                    final Object o4;
                                    final p82.e l$9 = (p82.e)o4;
                                    final BigInteger a = l$9.a;
                                    final x82.h h;
                                    final String f = h.f;
                                    final m m;
                                    final x82.a i = m.i;
                                    final x82.c c3;
                                    final x82.a a2 = c3.a;
                                    final BigInteger negate = l$5.c.negate();
                                    sg2.e.e((Object)negate, "this.negate()");
                                    final TransactionType burn = TransactionType.BURN;
                                    final a a3;
                                    final Integer g = a3.g;
                                    transactionRepositoryImpl$burnPoints$1.L$0 = l$9;
                                    transactionRepositoryImpl$burnPoints$1.L$1 = null;
                                    transactionRepositoryImpl$burnPoints$1.L$2 = null;
                                    transactionRepositoryImpl$burnPoints$1.L$3 = null;
                                    transactionRepositoryImpl$burnPoints$1.L$4 = null;
                                    transactionRepositoryImpl$burnPoints$1.L$5 = null;
                                    transactionRepositoryImpl$burnPoints$1.L$6 = null;
                                    transactionRepositoryImpl$burnPoints$1.L$7 = null;
                                    transactionRepositoryImpl$burnPoints$1.L$8 = null;
                                    transactionRepositoryImpl$burnPoints$1.label = 2;
                                    final TransactionRepositoryImpl transactionRepositoryImpl;
                                    final String s;
                                    final PendingTransactionSubtype pendingTransactionSubtype;
                                    final String s2;
                                    o = l(transactionRepositoryImpl, a, f, i, a2, negate, s, burn, pendingTransactionSubtype, null, null, g, s2, (lg2.c)transactionRepositoryImpl$burnPoints$1, 12288);
                                    iftrue(Label_0579:)(o != coroutine_SUSPENDED);
                                    return coroutine_SUSPENDED;
                                    Label_0391:
                                    a3 = l$2;
                                    c3 = l$3;
                                    m = l$4;
                                    pendingTransactionSubtype = l$6;
                                    s2 = l$8;
                                    transactionRepositoryImpl = this;
                                    h = l$1;
                                    s = l$7;
                                    o4 = o3;
                                    continue Label_0422;
                                    yd.b.k0(o);
                                    d = l$5.d;
                                    iftrue(Label_0249:)(!(d instanceof b$a));
                                    triple = new Triple((Object)PendingTransactionSubtype.COINS_PURCHASE, (Object)"Coins Purchase", (Object)null);
                                    continue Label_0422_Outer;
                                }
                                String s2 = (String)transactionRepositoryImpl$burnPoints$1.L$8;
                                String s = (String)transactionRepositoryImpl$burnPoints$1.L$7;
                                PendingTransactionSubtype pendingTransactionSubtype = (PendingTransactionSubtype)transactionRepositoryImpl$burnPoints$1.L$6;
                                m m = (m)transactionRepositoryImpl$burnPoints$1.L$5;
                                final x82.c c4 = (x82.c)transactionRepositoryImpl$burnPoints$1.L$4;
                                l$5 = (g$a)transactionRepositoryImpl$burnPoints$1.L$3;
                                a a3 = (a)transactionRepositoryImpl$burnPoints$1.L$2;
                                x82.h h = (x82.h)transactionRepositoryImpl$burnPoints$1.L$1;
                                TransactionRepositoryImpl transactionRepositoryImpl = (TransactionRepositoryImpl)transactionRepositoryImpl$burnPoints$1.L$0;
                                yd.b.k0(o);
                                Object o4 = o;
                                x82.c c3 = c4;
                                continue Label_0422;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            Label_0249: {
                                final y82.b d;
                                iftrue(Label_0631:)(!(d instanceof b$b));
                            }
                            continue Label_0422_Outer;
                        }
                    }
                    catch (final Exception ex) {
                        o2 = new a$a(ex);
                    }
                }
            }
        }
        return o2;
        Label_0631: {
            throw new NoWhenBranchMatchedException();
        }
    }
    
    public final Object h(final x82.h h, a a, i l$3, final x82.c l$4, final m l$5, final c0 c0, final lg2.c<? super o82.a<y82.e>> c2) {
        Object o = null;
        Label_0059: {
            if (c2 instanceof TransactionRepositoryImpl$cancelSubscription$1) {
                final TransactionRepositoryImpl$cancelSubscription$1 transactionRepositoryImpl$cancelSubscription$1 = (TransactionRepositoryImpl$cancelSubscription$1)c2;
                final int label = transactionRepositoryImpl$cancelSubscription$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    transactionRepositoryImpl$cancelSubscription$1.label = label + Integer.MIN_VALUE;
                    o = transactionRepositoryImpl$cancelSubscription$1;
                    break Label_0059;
                }
            }
            o = new TransactionRepositoryImpl$cancelSubscription$1(this, (lg2.c)c2);
        }
        final Object result = ((TransactionRepositoryImpl$cancelSubscription$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((TransactionRepositoryImpl$cancelSubscription$1)o).label;
        Object o2 = null;
        Label_0199: {
            if (label2 == 0) {
                break Label_0199;
            }
            Label_0126: {
                if (label2 == 1) {
                    break Label_0126;
                }
                Label_0115: {
                    if (label2 != 2) {
                        break Label_0115;
                    }
                    p82.e e = (p82.e)((TransactionRepositoryImpl$cancelSubscription$1)o).L$0;
                    try {
                        yd.b.k0(result);
                        Object l = result;
                        o2 = new a$b((Object)new y82.e(e.a, e, (l0)l));
                        return o2;
                        TransactionRepositoryImpl transactionRepositoryImpl = null;
                        Label_0290: {
                            transactionRepositoryImpl = this;
                        }
                        m m = l$5;
                        x82.c c3 = l$4;
                        final a l$6;
                        a = l$6;
                        while (true) {
                            final Object o3;
                            final p82.e l$7 = (p82.e)o3;
                            final BigInteger a2 = l$7.a;
                            final x82.h l$8;
                            final String f = l$8.f;
                            final x82.a i = m.i;
                            final x82.a a3 = c3.a;
                            final BigInteger zero = BigInteger.ZERO;
                            sg2.e.e((Object)zero, "ZERO");
                            final StringBuilder sb = new StringBuilder();
                            sb.append(l$3.h);
                            sb.append(" cancellation");
                            final String string = sb.toString();
                            final TransactionType membership_CANCELLATION = TransactionType.MEMBERSHIP_CANCELLATION;
                            final PendingTransactionSubtype membership_CANCELLATION2 = PendingTransactionSubtype.MEMBERSHIP_CANCELLATION;
                            final Integer g = a.g;
                            ((TransactionRepositoryImpl$cancelSubscription$1)o).L$0 = l$7;
                            ((TransactionRepositoryImpl$cancelSubscription$1)o).L$1 = null;
                            ((TransactionRepositoryImpl$cancelSubscription$1)o).L$2 = null;
                            ((TransactionRepositoryImpl$cancelSubscription$1)o).L$3 = null;
                            ((TransactionRepositoryImpl$cancelSubscription$1)o).L$4 = null;
                            ((TransactionRepositoryImpl$cancelSubscription$1)o).L$5 = null;
                            ((TransactionRepositoryImpl$cancelSubscription$1)o).label = 2;
                            l = l(transactionRepositoryImpl, a2, f, i, a3, zero, string, membership_CANCELLATION, membership_CANCELLATION2, null, null, g, null, (lg2.c)o, 12288);
                            iftrue(Label_0482:)(l != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            m = (m)((TransactionRepositoryImpl$cancelSubscription$1)o).L$5;
                            c3 = (x82.c)((TransactionRepositoryImpl$cancelSubscription$1)o).L$4;
                            l$3 = (i)((TransactionRepositoryImpl$cancelSubscription$1)o).L$3;
                            a = (a)((TransactionRepositoryImpl$cancelSubscription$1)o).L$2;
                            final x82.h h2 = (x82.h)((TransactionRepositoryImpl$cancelSubscription$1)o).L$1;
                            transactionRepositoryImpl = (TransactionRepositoryImpl)((TransactionRepositoryImpl$cancelSubscription$1)o).L$0;
                            yd.b.k0(result);
                            o3 = result;
                            l$8 = h2;
                            continue;
                        }
                        yd.b.k0(result);
                        ((TransactionRepositoryImpl$cancelSubscription$1)o).L$0 = this;
                        x82.h l$8 = h;
                        ((TransactionRepositoryImpl$cancelSubscription$1)o).L$1 = l$8;
                        l$6 = a;
                        ((TransactionRepositoryImpl$cancelSubscription$1)o).L$2 = l$6;
                        ((TransactionRepositoryImpl$cancelSubscription$1)o).L$3 = l$3;
                        ((TransactionRepositoryImpl$cancelSubscription$1)o).L$4 = l$4;
                        ((TransactionRepositoryImpl$cancelSubscription$1)o).L$5 = l$5;
                        ((TransactionRepositoryImpl$cancelSubscription$1)o).label = 1;
                        Object o3 = o(this, h, c0, l$4, l$5, a, (ContinuationImpl)o);
                        iftrue(Label_0290:)(o3 != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                        p82.e l$7 = null;
                        Label_0482:
                        e = l$7;
                        return new a$b((Object)new y82.e(e.a, e, (l0)l));
                    }
                    catch (final Exception ex) {
                        o2 = new a$a(ex);
                    }
                }
            }
        }
        return o2;
    }
    
    public final Object i(final x82.h l$1, final a l$2, final x82.c c, final m l$3, final c0 c2, final lg2.c c3) {
        Object o = null;
        Label_0062: {
            if (c3 instanceof TransactionRepositoryImpl$claimPoints$1) {
                final TransactionRepositoryImpl$claimPoints$1 transactionRepositoryImpl$claimPoints$1 = (TransactionRepositoryImpl$claimPoints$1)c3;
                final int label = transactionRepositoryImpl$claimPoints$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    transactionRepositoryImpl$claimPoints$1.label = label + Integer.MIN_VALUE;
                    o = transactionRepositoryImpl$claimPoints$1;
                    break Label_0062;
                }
            }
            o = new TransactionRepositoryImpl$claimPoints$1(this, c3);
        }
        Object o2 = ((TransactionRepositoryImpl$claimPoints$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((TransactionRepositoryImpl$claimPoints$1)o).label;
        Object o3 = null;
        Label_0259: {
            if (label2 == 0) {
                break Label_0259;
            }
            Label_0186: {
                if (label2 == 1) {
                    break Label_0186;
                }
                Label_0141: {
                    if (label2 == 2) {
                        break Label_0141;
                    }
                    Label_0130: {
                        if (label2 != 3) {
                            break Label_0130;
                        }
                        l0 l0 = (l0)((TransactionRepositoryImpl$claimPoints$1)o).L$1;
                        p82.e l$4 = (p82.e)((TransactionRepositoryImpl$claimPoints$1)o).L$0;
                        try {
                            yd.b.k0(o2);
                            o3 = new a$b((Object)new y82.e(l$4.a, l$4, l0));
                            return o3;
                            final p82.e e;
                            Label_0550: {
                                final p82.e l$5;
                                e = l$5;
                            }
                            TransactionRepositoryImpl l$6 = null;
                            TransactionRepositoryImpl transactionRepositoryImpl = l$6;
                            x82.e l$7 = null;
                            x82.e e2 = l$7;
                            l$4 = e;
                            a92.a a = null;
                            x82.h l$8 = null;
                            m m = null;
                            a a2 = null;
                            Object o4 = null;
                        Label_0368:
                            while (true) {
                                break Label_0562;
                                Label_0346:
                                l$6 = this;
                                final x82.e e3 = null;
                                final a92.a b;
                                a = b;
                                l$8 = l$1;
                                l$7 = e3;
                                m = l$3;
                                a2 = l$2;
                                break Label_0368;
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                final l0 l$9;
                                Label_0634:
                                l0 = l$9;
                                return new a$b((Object)new y82.e(l$4.a, l$4, l0));
                                yd.b.k0(o2);
                                b = l$2.b;
                                iftrue(Label_0680:)(b == null);
                                Block_9: {
                                    break Block_9;
                                    l$9 = (l0)o2;
                                    final LocalVaultDataSource b2 = transactionRepositoryImpl.b;
                                    final String f = l$8.f;
                                    final BigInteger h = e2.h;
                                    ((TransactionRepositoryImpl$claimPoints$1)o).L$0 = l$4;
                                    ((TransactionRepositoryImpl$claimPoints$1)o).L$1 = l$9;
                                    ((TransactionRepositoryImpl$claimPoints$1)o).L$2 = null;
                                    ((TransactionRepositoryImpl$claimPoints$1)o).L$3 = null;
                                    ((TransactionRepositoryImpl$claimPoints$1)o).label = 3;
                                    iftrue(Label_0634:)(b2.b(f, h, (lg2.c)o) != coroutine_SUSPENDED);
                                    return coroutine_SUSPENDED;
                                }
                                ((TransactionRepositoryImpl$claimPoints$1)o).L$0 = this;
                                ((TransactionRepositoryImpl$claimPoints$1)o).L$1 = l$1;
                                ((TransactionRepositoryImpl$claimPoints$1)o).L$2 = l$2;
                                ((TransactionRepositoryImpl$claimPoints$1)o).L$3 = null;
                                ((TransactionRepositoryImpl$claimPoints$1)o).L$4 = l$3;
                                ((TransactionRepositoryImpl$claimPoints$1)o).L$5 = b;
                                ((TransactionRepositoryImpl$claimPoints$1)o).label = 1;
                                o4 = o(this, l$1, c2, c, l$3, l$2, (ContinuationImpl)o);
                                iftrue(Label_0346:)(o4 != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                                a = (a92.a)((TransactionRepositoryImpl$claimPoints$1)o).L$5;
                                final m i = (m)((TransactionRepositoryImpl$claimPoints$1)o).L$4;
                                l$7 = (x82.e)((TransactionRepositoryImpl$claimPoints$1)o).L$3;
                                a2 = (a)((TransactionRepositoryImpl$claimPoints$1)o).L$2;
                                l$8 = (x82.h)((TransactionRepositoryImpl$claimPoints$1)o).L$1;
                                l$6 = (TransactionRepositoryImpl)((TransactionRepositoryImpl$claimPoints$1)o).L$0;
                                yd.b.k0(o2);
                                o4 = o2;
                                m = i;
                                break Label_0368;
                                l$4 = (p82.e)((TransactionRepositoryImpl$claimPoints$1)o).L$3;
                                e2 = (x82.e)((TransactionRepositoryImpl$claimPoints$1)o).L$2;
                                l$8 = (x82.h)((TransactionRepositoryImpl$claimPoints$1)o).L$1;
                                transactionRepositoryImpl = (TransactionRepositoryImpl)((TransactionRepositoryImpl$claimPoints$1)o).L$0;
                                yd.b.k0(o2);
                                continue;
                            }
                            final p82.e l$5 = (p82.e)o4;
                            final BigInteger a3 = l$5.a;
                            final String f2 = l$8.f;
                            final x82.a j = m.i;
                            final x82.a a4 = a.a;
                            final BigInteger g = l$7.g;
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Claiming your ");
                            sb.append(l$8.l);
                            final String string = sb.toString();
                            final TransactionType distribution = TransactionType.DISTRIBUTION;
                            final PendingTransactionSubtype distribution2 = PendingTransactionSubtype.DISTRIBUTION;
                            final Integer g2 = a2.g;
                            ((TransactionRepositoryImpl$claimPoints$1)o).L$0 = l$6;
                            ((TransactionRepositoryImpl$claimPoints$1)o).L$1 = l$8;
                            ((TransactionRepositoryImpl$claimPoints$1)o).L$2 = l$7;
                            ((TransactionRepositoryImpl$claimPoints$1)o).L$3 = l$5;
                            ((TransactionRepositoryImpl$claimPoints$1)o).L$4 = null;
                            ((TransactionRepositoryImpl$claimPoints$1)o).L$5 = null;
                            ((TransactionRepositoryImpl$claimPoints$1)o).label = 2;
                            final CoroutineSingletons coroutineSingletons = coroutine_SUSPENDED;
                            o2 = l(l$6, a3, f2, j, a4, g, string, distribution, distribution2, null, null, g2, null, (lg2.c)o, 12288);
                            iftrue(Label_0550:)(o2 != coroutineSingletons);
                            return coroutineSingletons;
                        }
                        catch (final Exception ex) {
                            o3 = new a$a(ex);
                        }
                    }
                }
            }
        }
        return o3;
        Label_0680: {
            throw new InvalidTransactionException();
        }
    }
    
    public final Object k(final BigInteger bigInteger, String s, final x82.a a, final x82.a a2, final BigInteger bigInteger2, String i, final TransactionType transactionType, final PendingTransactionSubtype pendingTransactionSubtype, String j, final String s2, final Integer n, String s3, BigInteger g, final BigInteger bigInteger3, final lg2.c<? super l0> c) {
        TransactionRepositoryImpl$createPendingTransaction$1 transactionRepositoryImpl$createPendingTransaction$2 = null;
        Label_0059: {
            if (c instanceof TransactionRepositoryImpl$createPendingTransaction$1) {
                final TransactionRepositoryImpl$createPendingTransaction$1 transactionRepositoryImpl$createPendingTransaction$1 = (TransactionRepositoryImpl$createPendingTransaction$1)c;
                final int label = transactionRepositoryImpl$createPendingTransaction$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    transactionRepositoryImpl$createPendingTransaction$1.label = label + Integer.MIN_VALUE;
                    transactionRepositoryImpl$createPendingTransaction$2 = transactionRepositoryImpl$createPendingTransaction$1;
                    break Label_0059;
                }
            }
            transactionRepositoryImpl$createPendingTransaction$2 = new TransactionRepositoryImpl$createPendingTransaction$1(this, (lg2.c)c);
        }
        final Object result = transactionRepositoryImpl$createPendingTransaction$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = transactionRepositoryImpl$createPendingTransaction$2.label;
        Object o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o = transactionRepositoryImpl$createPendingTransaction$2.L$0;
            yd.b.k0(result);
        }
        else {
            yd.b.k0(result);
            final Long n2 = new Long(System.currentTimeMillis());
            final String g2 = r.G0(bigInteger, 64, true);
            long longValue = 0L;
            final BigInteger value = BigInteger.valueOf(0L);
            sg2.e.e((Object)value, "valueOf(this.toLong())");
            final l0 l$0 = new l0(bigInteger2, g, bigInteger3, i, s, n2, new m0(g2, value, 0, (BigDecimal)null, (BigDecimal)null, (BigDecimal)null, (BigDecimal)null, (BigDecimal)null), a, a2, new Long(System.currentTimeMillis()), transactionType, pendingTransactionSubtype, j, s2, n, s3);
            final LocalVaultDataSource b = this.b;
            final Long k = l$0.k;
            sg2.e.c((Object)k);
            final Long n3 = new Long(k / 1000L);
            final BigInteger f = l$0.f;
            final BigInteger g3 = l$0.g;
            final BigInteger h = l$0.h;
            j = l$0.i;
            final String l = l$0.j;
            final m0 m = l$0.l;
            final x82.a m2 = l$0.m;
            final x82.a n4 = l$0.n;
            final Long o2 = l$0.o;
            final TransactionType p15 = l$0.p;
            final PendingTransactionSubtype q = l$0.q;
            s = l$0.r;
            s3 = l$0.s;
            final Integer t = l$0.t;
            final String u = l$0.u;
            sg2.e.f((Object)f, "amount");
            sg2.e.f((Object)m, "details");
            sg2.e.f((Object)p15, "type");
            final l0 l2 = new l0(f, g3, h, j, l, n3, m, m2, n4, o2, p15, q, s, s3, t, u);
            transactionRepositoryImpl$createPendingTransaction$2.L$0 = l$0;
            transactionRepositoryImpl$createPendingTransaction$2.label = 1;
            final y x = b.c.x();
            final String f2 = b.a.f;
            sg2.e.f((Object)f2, "userId");
            final BigInteger f3 = l2.f;
            final BigInteger g4 = l2.g;
            final BigInteger h2 = l2.h;
            i = l2.i;
            final String j2 = l2.j;
            final Long k2 = l2.k;
            Long value2;
            if (k2 != null) {
                value2 = k2.longValue() * 1000L;
            }
            else {
                value2 = null;
            }
            final m0 l3 = l2.l;
            s3 = l3.f;
            g = l3.g;
            final int h3 = l3.h;
            final String title = l2.p.getTitle();
            final x82.a m3 = l2.m;
            final x82.a n5 = l2.n;
            final Long o3 = l2.o;
            if (o3 != null) {
                longValue = o3;
            }
            final PendingTransactionSubtype q2 = l2.q;
            if (q2 != null) {
                s = q2.getTitle();
            }
            else {
                s = null;
            }
            Object o4 = ((k82.a)x).o((Object)new l82.g(s3, f2, f3, g4, h2, i, j2, value2, g, h3, title, m3, n5, longValue, s, l2.r, l2.s, l2.t, l2.u, (BigDecimal)null, (BigDecimal)null, (BigDecimal)null, (BigDecimal)null, (BigDecimal)null), (lg2.c)transactionRepositoryImpl$createPendingTransaction$2);
            if (o4 != coroutine_SUSPENDED) {
                o4 = hg2.j.a;
            }
            if (o4 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o = l$0;
        }
        return o;
    }
    
    public final Object m(final String l$0, final lg2.c<? super a> c) {
        Object o = null;
        Label_0052: {
            if (c instanceof TransactionRepositoryImpl$getTransactionContracts$1) {
                final TransactionRepositoryImpl$getTransactionContracts$1 transactionRepositoryImpl$getTransactionContracts$1 = (TransactionRepositoryImpl$getTransactionContracts$1)c;
                final int label = transactionRepositoryImpl$getTransactionContracts$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    transactionRepositoryImpl$getTransactionContracts$1.label = label + Integer.MIN_VALUE;
                    o = transactionRepositoryImpl$getTransactionContracts$1;
                    break Label_0052;
                }
            }
            o = new TransactionRepositoryImpl$getTransactionContracts$1(this, (lg2.c)c);
        }
        Object result = ((TransactionRepositoryImpl$getTransactionContracts$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((TransactionRepositoryImpl$getTransactionContracts$1)o).label;
        ConcurrentMap concurrentMap;
        String s;
        Object value = null;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            concurrentMap = (ConcurrentMap)((TransactionRepositoryImpl$getTransactionContracts$1)o).L$1;
            s = (String)((TransactionRepositoryImpl$getTransactionContracts$1)o).L$0;
            yd.b.k0(result);
        }
        else {
            yd.b.k0(result);
            final ConcurrentHashMap<String, a> g = this.g;
            if ((value = g.get(l$0)) != null) {
                return value;
            }
            final c c2 = this.c;
            ((TransactionRepositoryImpl$getTransactionContracts$1)o).L$0 = l$0;
            ((TransactionRepositoryImpl$getTransactionContracts$1)o).L$1 = g;
            ((TransactionRepositoryImpl$getTransactionContracts$1)o).label = 1;
            final Object communityVaultInfo = c2.getCommunityVaultInfo(l$0, (lg2.c<? super VaultInfoResponse>)o);
            s = l$0;
            concurrentMap = g;
            if ((result = communityVaultInfo) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final VaultInfoResponse vaultInfoResponse = (VaultInfoResponse)result;
        if (vaultInfoResponse == null) {
            return null;
        }
        final VaultProvider a = vaultInfoResponse.a.a;
        final VaultProviderExtra b = a.b;
        Label_0459: {
            if (b != null) {
                final String a2 = a.a;
                if (a2 != null) {
                    final VaultContract a3 = b.a.a;
                    a92.a a4;
                    if (a3 != null) {
                        a4 = new a92.a(a3.a);
                    }
                    else {
                        a4 = null;
                    }
                    final VaultContract b2 = b.a.b;
                    a92.d d;
                    if (b2 != null) {
                        d = new a92.d(b2.a);
                    }
                    else {
                        d = null;
                    }
                    final VaultContract c3 = b.a.c;
                    a92.c c4;
                    if (c3 != null) {
                        c4 = new a92.c(c3.a);
                    }
                    else {
                        c4 = null;
                    }
                    final VaultContract d2 = b.a.d;
                    a92.e e;
                    if (d2 != null) {
                        e = new a92.e(d2.a);
                    }
                    else {
                        e = null;
                    }
                    final Integer b3 = b.b;
                    final MetaTransactions c5 = vaultInfoResponse.a.a.b.c;
                    Map b4;
                    if (c5 != null) {
                        b4 = c5.b;
                    }
                    else {
                        b4 = null;
                    }
                    BigInteger a5;
                    if (c5 != null) {
                        a5 = c5.a;
                    }
                    else {
                        a5 = null;
                    }
                    value = new a(a2, a4, d, c4, e, b4, b3, a5);
                    break Label_0459;
                }
            }
            value = null;
        }
        if (value == null) {
            return null;
        }
        final a putIfAbsent = concurrentMap.putIfAbsent(s, value);
        if (putIfAbsent != null) {
            value = putIfAbsent;
        }
        return value;
    }
    
    public final Object n(final x82.h h, final c0 c0, final x82.c c2, final m m, final a a, final int n, final p82.a a2, final lg2.c<? super p82.e> c3) {
        Object o = null;
        Label_0059: {
            if (c3 instanceof TransactionRepositoryImpl$sendTransaction$1) {
                final TransactionRepositoryImpl$sendTransaction$1 transactionRepositoryImpl$sendTransaction$1 = (TransactionRepositoryImpl$sendTransaction$1)c3;
                final int label = transactionRepositoryImpl$sendTransaction$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    transactionRepositoryImpl$sendTransaction$1.label = label + Integer.MIN_VALUE;
                    o = transactionRepositoryImpl$sendTransaction$1;
                    break Label_0059;
                }
            }
            o = new TransactionRepositoryImpl$sendTransaction$1(this, (lg2.c)c3);
        }
        final Object result = ((TransactionRepositoryImpl$sendTransaction$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((TransactionRepositoryImpl$sendTransaction$1)o).label;
        f f;
        m l$1;
        TransactionRepositoryImpl transactionRepositoryImpl;
        Object e;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f = (f)((TransactionRepositoryImpl$sendTransaction$1)o).L$2;
            l$1 = (m)((TransactionRepositoryImpl$sendTransaction$1)o).L$1;
            transactionRepositoryImpl = (TransactionRepositoryImpl)((TransactionRepositoryImpl$sendTransaction$1)o).L$0;
            yd.b.k0(result);
            e = result;
        }
        else {
            yd.b.k0(result);
            final f a3 = this.d.a(c0);
            ((TransactionRepositoryImpl$sendTransaction$1)o).L$0 = this;
            l$1 = m;
            ((TransactionRepositoryImpl$sendTransaction$1)o).L$1 = l$1;
            ((TransactionRepositoryImpl$sendTransaction$1)o).L$2 = a3;
            ((TransactionRepositoryImpl$sendTransaction$1)o).label = 1;
            e = a3.e(h, c2, m, n, a2, a, (lg2.c)o);
            if (e == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            transactionRepositoryImpl = this;
            f = a3;
        }
        final p82.e e2 = (p82.e)e;
        if (sg2.e.a((Object)f.b(), (Object)x82.c0.c.c)) {
            transactionRepositoryImpl.f.remove(l$1.i);
        }
        return e2;
    }
    
    public final Object p(final x82.h h, a a, i l$3, x82.c c, m m, final c0 c2, final lg2.c<? super o82.a<y82.e>> c3) {
        Object o = null;
        Label_0059: {
            if (c3 instanceof TransactionRepositoryImpl$subscribe$1) {
                final TransactionRepositoryImpl$subscribe$1 transactionRepositoryImpl$subscribe$1 = (TransactionRepositoryImpl$subscribe$1)c3;
                final int label = transactionRepositoryImpl$subscribe$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    transactionRepositoryImpl$subscribe$1.label = label + Integer.MIN_VALUE;
                    o = transactionRepositoryImpl$subscribe$1;
                    break Label_0059;
                }
            }
            o = new TransactionRepositoryImpl$subscribe$1(this, (lg2.c)c3);
        }
        final Object result = ((TransactionRepositoryImpl$subscribe$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((TransactionRepositoryImpl$subscribe$1)o).label;
        Object o2 = null;
        Label_0199: {
            if (label2 == 0) {
                break Label_0199;
            }
            Label_0126: {
                if (label2 == 1) {
                    break Label_0126;
                }
                Label_0115: {
                    if (label2 != 2) {
                        break Label_0115;
                    }
                    p82.e e = (p82.e)((TransactionRepositoryImpl$subscribe$1)o).L$0;
                    try {
                        yd.b.k0(result);
                        Object l = result;
                        o2 = new a$b((Object)new y82.e(e.a, e, (l0)l));
                        return o2;
                        m = (m)((TransactionRepositoryImpl$subscribe$1)o).L$5;
                        c = (x82.c)((TransactionRepositoryImpl$subscribe$1)o).L$4;
                        l$3 = (i)((TransactionRepositoryImpl$subscribe$1)o).L$3;
                        a = (a)((TransactionRepositoryImpl$subscribe$1)o).L$2;
                        final x82.h h2 = (x82.h)((TransactionRepositoryImpl$subscribe$1)o).L$1;
                        TransactionRepositoryImpl transactionRepositoryImpl = (TransactionRepositoryImpl)((TransactionRepositoryImpl$subscribe$1)o).L$0;
                        yd.b.k0(result);
                        Object o3 = result;
                        x82.h l$4 = h2;
                        Label_0303: {
                            break Label_0303;
                            Label_0456: {
                                final p82.e l$5;
                                e = l$5;
                            }
                            return new a$b((Object)new y82.e(e.a, e, (l0)l));
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            Label_0290:
                            transactionRepositoryImpl = this;
                            final m l$6;
                            m = l$6;
                            final x82.c l$7;
                            c = l$7;
                            final a l$8;
                            a = l$8;
                            break Label_0303;
                            yd.b.k0(result);
                            ((TransactionRepositoryImpl$subscribe$1)o).L$0 = this;
                            l$4 = h;
                            ((TransactionRepositoryImpl$subscribe$1)o).L$1 = l$4;
                            l$8 = a;
                            ((TransactionRepositoryImpl$subscribe$1)o).L$2 = l$8;
                            ((TransactionRepositoryImpl$subscribe$1)o).L$3 = l$3;
                            l$7 = c;
                            ((TransactionRepositoryImpl$subscribe$1)o).L$4 = l$7;
                            l$6 = m;
                            ((TransactionRepositoryImpl$subscribe$1)o).L$5 = l$6;
                            ((TransactionRepositoryImpl$subscribe$1)o).label = 1;
                            o3 = o(this, h, c2, c, m, a, (ContinuationImpl)o);
                            iftrue(Label_0290:)(o3 != coroutine_SUSPENDED);
                            return coroutine_SUSPENDED;
                        }
                        final p82.e l$5 = (p82.e)o3;
                        final BigInteger a2 = l$5.a;
                        final String f = l$4.f;
                        final x82.a i = m.i;
                        final x82.a a3 = c.a;
                        final BigInteger negate = l$3.f.negate();
                        sg2.e.e((Object)negate, "this.negate()");
                        final String h3 = l$3.h;
                        final TransactionType burn = TransactionType.BURN;
                        final PendingTransactionSubtype membership_PURCHASE = PendingTransactionSubtype.MEMBERSHIP_PURCHASE;
                        final Integer g = a.g;
                        ((TransactionRepositoryImpl$subscribe$1)o).L$0 = l$5;
                        ((TransactionRepositoryImpl$subscribe$1)o).L$1 = null;
                        ((TransactionRepositoryImpl$subscribe$1)o).L$2 = null;
                        ((TransactionRepositoryImpl$subscribe$1)o).L$3 = null;
                        ((TransactionRepositoryImpl$subscribe$1)o).L$4 = null;
                        ((TransactionRepositoryImpl$subscribe$1)o).L$5 = null;
                        ((TransactionRepositoryImpl$subscribe$1)o).label = 2;
                        l = l(transactionRepositoryImpl, a2, f, i, a3, negate, h3, burn, membership_PURCHASE, null, null, g, null, (lg2.c)o, 12288);
                        iftrue(Label_0456:)(l != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                    }
                    catch (final Exception ex) {
                        o2 = new a$a(ex);
                    }
                }
            }
        }
        return o2;
    }
    
    public final Object q(final x82.h l$1, final a l$2, String l$3, final String l$4, final x82.a l$5, long j$0, final x82.c c, final m l$6, final c0 c2, final lg2.c<? super o82.a<y82.e>> c3) {
        TransactionRepositoryImpl$transferPoints$1 transactionRepositoryImpl$transferPoints$2 = null;
        Label_0059: {
            if (c3 instanceof TransactionRepositoryImpl$transferPoints$1) {
                final TransactionRepositoryImpl$transferPoints$1 transactionRepositoryImpl$transferPoints$1 = (TransactionRepositoryImpl$transferPoints$1)c3;
                final int label = transactionRepositoryImpl$transferPoints$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    transactionRepositoryImpl$transferPoints$1.label = label + Integer.MIN_VALUE;
                    transactionRepositoryImpl$transferPoints$2 = transactionRepositoryImpl$transferPoints$1;
                    break Label_0059;
                }
            }
            transactionRepositoryImpl$transferPoints$2 = new TransactionRepositoryImpl$transferPoints$1(this, (lg2.c)c3);
        }
        Object o = transactionRepositoryImpl$transferPoints$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = transactionRepositoryImpl$transferPoints$2.label;
        Object o2 = null;
        Label_0205: {
            if (label2 == 0) {
                break Label_0205;
            }
            Label_0123: {
                if (label2 == 1) {
                    break Label_0123;
                }
                Label_0112: {
                    if (label2 != 2) {
                        break Label_0112;
                    }
                    p82.e e = (p82.e)transactionRepositoryImpl$transferPoints$2.L$0;
                    try {
                        yd.b.k0(o);
                        o2 = new a$b((Object)new y82.e(e.a, e, (l0)o));
                        return o2;
                        x82.a a = null;
                        String s = null;
                        Label_0374: {
                            s = a.c();
                        }
                        while (true) {
                            Object o3;
                            while (true) {
                                final p82.e l$7;
                                Label_0381: {
                                    break Label_0381;
                                    yd.b.k0(o);
                                    transactionRepositoryImpl$transferPoints$2.L$0 = this;
                                    transactionRepositoryImpl$transferPoints$2.L$1 = l$1;
                                    transactionRepositoryImpl$transferPoints$2.L$2 = l$2;
                                    transactionRepositoryImpl$transferPoints$2.L$3 = l$3;
                                    transactionRepositoryImpl$transferPoints$2.L$4 = l$4;
                                    transactionRepositoryImpl$transferPoints$2.L$5 = l$5;
                                    transactionRepositoryImpl$transferPoints$2.L$6 = l$6;
                                    transactionRepositoryImpl$transferPoints$2.J$0 = j$0;
                                    transactionRepositoryImpl$transferPoints$2.label = 1;
                                    o3 = o(this, l$1, c2, c, l$6, l$2, (ContinuationImpl)transactionRepositoryImpl$transferPoints$2);
                                    iftrue(Label_0302:)(o3 != coroutine_SUSPENDED);
                                    return coroutine_SUSPENDED;
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("u/");
                                    sb.append(l$3);
                                    s = sb.toString();
                                    break Label_0381;
                                    Label_0571:
                                    e = l$7;
                                    return new a$b((Object)new y82.e(e.a, e, (l0)o));
                                }
                                final BigInteger a2 = l$7.a;
                                final x82.h h;
                                final String f = h.f;
                                final m m;
                                final x82.a i = m.i;
                                final DecimalFormat a3 = PointsFormat.a;
                                final BigInteger value = BigInteger.valueOf(-j$0);
                                sg2.e.e((Object)value, "valueOf(this)");
                                final BigInteger a4 = PointsFormat.a(value);
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Gift to ");
                                sb2.append(s);
                                final String string = sb2.toString();
                                final TransactionType transfer = TransactionType.TRANSFER;
                                final PendingTransactionSubtype transfer2 = PendingTransactionSubtype.TRANSFER;
                                final a a5;
                                final Integer g = a5.g;
                                transactionRepositoryImpl$transferPoints$2.L$0 = l$7;
                                transactionRepositoryImpl$transferPoints$2.L$1 = null;
                                transactionRepositoryImpl$transferPoints$2.L$2 = null;
                                transactionRepositoryImpl$transferPoints$2.L$3 = null;
                                transactionRepositoryImpl$transferPoints$2.L$4 = null;
                                transactionRepositoryImpl$transferPoints$2.L$5 = null;
                                transactionRepositoryImpl$transferPoints$2.L$6 = null;
                                transactionRepositoryImpl$transferPoints$2.label = 2;
                                final TransactionRepositoryImpl transactionRepositoryImpl;
                                final String s2;
                                o = l(transactionRepositoryImpl, a2, f, i, a, a4, string, transfer, transfer2, l$3, s2, g, null, (lg2.c)transactionRepositoryImpl$transferPoints$2, 12288);
                                iftrue(Label_0571:)(o != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                                l$7 = (p82.e)o;
                                iftrue(Label_0374:)(l$3 == null);
                                continue;
                            }
                            Label_0302:
                            m m = l$6;
                            String s2 = l$4;
                            a = l$5;
                            TransactionRepositoryImpl transactionRepositoryImpl = this;
                            a a5 = l$2;
                            x82.h h = l$1;
                            o = o3;
                            continue;
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            j$0 = transactionRepositoryImpl$transferPoints$2.J$0;
                            m = (m)transactionRepositoryImpl$transferPoints$2.L$6;
                            a = (x82.a)transactionRepositoryImpl$transferPoints$2.L$5;
                            s2 = (String)transactionRepositoryImpl$transferPoints$2.L$4;
                            l$3 = (String)transactionRepositoryImpl$transferPoints$2.L$3;
                            a5 = (a)transactionRepositoryImpl$transferPoints$2.L$2;
                            h = (x82.h)transactionRepositoryImpl$transferPoints$2.L$1;
                            transactionRepositoryImpl = (TransactionRepositoryImpl)transactionRepositoryImpl$transferPoints$2.L$0;
                            yd.b.k0(o);
                            continue;
                        }
                    }
                    catch (final Exception ex) {
                        o2 = new a$a(ex);
                    }
                }
            }
        }
        return o2;
    }
}
