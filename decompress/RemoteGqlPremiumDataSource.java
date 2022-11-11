// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.premium.datasource.remote;

import java.util.UUID;
import pg2.j;
import com.squareup.moshi.JsonAdapter;
import java.util.List;
import com.reddit.queries.e6$h;
import com.reddit.queries.e6$j;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.queries.e6$i;
import com.reddit.queries.e6$e;
import com.reddit.queries.e6;
import com.reddit.queries.k8$b;
import com.reddit.queries.k8;
import com.reddit.queries.k8$d;
import com.reddit.mutations.o0$c;
import com.reddit.mutations.o0;
import o22.w;
import com.reddit.type.PaymentProvider;
import com.reddit.mutations.o0$b;
import com.reddit.mutations.m0$b;
import h7.h;
import com.reddit.mutations.m0$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.mutations.m0;
import o22.v;
import com.reddit.type.Currency;
import h7.h$a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.mutations.m0$e;
import ce0.c;
import javax.inject.Inject;
import ah2.f;
import be0.a;
import com.squareup.moshi.y;
import ur0.g;

public final class RemoteGqlPremiumDataSource
{
    public final g a;
    public final y b;
    public final a c;
    
    @Inject
    public RemoteGqlPremiumDataSource(final g a, final y b, final a c) {
        f.f((Object)a, "graphQlClient");
        f.f((Object)b, "moshi");
        f.f((Object)c, "premiumFeatures");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final Object a(final c c, String e, final tg2.c<? super m0$e> c2) {
        Object o = null;
        Label_0054: {
            if (c2 instanceof RemoteGqlPremiumDataSource$createOrder.RemoteGqlPremiumDataSource$createOrder$1) {
                final RemoteGqlPremiumDataSource$createOrder.RemoteGqlPremiumDataSource$createOrder$1 remoteGqlPremiumDataSource$createOrder$1 = (RemoteGqlPremiumDataSource$createOrder.RemoteGqlPremiumDataSource$createOrder$1)c2;
                final int label = remoteGqlPremiumDataSource$createOrder$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPremiumDataSource$createOrder$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPremiumDataSource$createOrder$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlPremiumDataSource$createOrder.RemoteGqlPremiumDataSource$createOrder$1(this, (tg2.c)c2);
        }
        final Object result = ((RemoteGqlPremiumDataSource$createOrder.RemoteGqlPremiumDataSource$createOrder$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPremiumDataSource$createOrder.RemoteGqlPremiumDataSource$createOrder$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final h c3 = h$a.c((Object)e);
            final String a2 = c.a;
            e = c.e;
            final m0 m0 = new m0(new v(c3, a2, c.d, e, Currency.COINS, "0", "1"));
            ((RemoteGqlPremiumDataSource$createOrder.RemoteGqlPremiumDataSource$createOrder$1)o).label = 1;
            if ((b = e$a.b(14, (k)m0, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final m0$b a3 = ((m0$c)b).a;
        f.c((Object)a3);
        if (a3.b) {
            final m0$e d = a3.d;
            f.c((Object)d);
            return d;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    public final Object b(final m0$e m0$e, final String s, final tg2.c<? super o0$b> c) {
        Object o = null;
        Label_0054: {
            if (c instanceof RemoteGqlPremiumDataSource$createPayment.RemoteGqlPremiumDataSource$createPayment$1) {
                final RemoteGqlPremiumDataSource$createPayment.RemoteGqlPremiumDataSource$createPayment$1 remoteGqlPremiumDataSource$createPayment$1 = (RemoteGqlPremiumDataSource$createPayment.RemoteGqlPremiumDataSource$createPayment$1)c;
                final int label = remoteGqlPremiumDataSource$createPayment$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPremiumDataSource$createPayment$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPremiumDataSource$createPayment$1;
                    break Label_0054;
                }
            }
            o = new RemoteGqlPremiumDataSource$createPayment.RemoteGqlPremiumDataSource$createPayment$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlPremiumDataSource$createPayment.RemoteGqlPremiumDataSource$createPayment$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPremiumDataSource$createPayment.RemoteGqlPremiumDataSource$createPayment$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final o0 o2 = new o0(new w(h$a.c((Object)s), m0$e.b, PaymentProvider.REDDIT_COINS));
            ((RemoteGqlPremiumDataSource$createPayment.RemoteGqlPremiumDataSource$createPayment$1)o).label = 1;
            if ((b = e$a.b(14, (k)o2, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return ((o0$c)b).a;
    }
    
    public final Object c(final tg2.c<? super k8$d> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions.RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions$1) {
                final RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions.RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions$1 remoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions$1 = (RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions.RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions$1)c;
                final int label = remoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions$1;
                    break Label_0047;
                }
            }
            o = new RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions.RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions.RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions.RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final k8 k8 = new k8();
            ((RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions.RemoteGqlPremiumDataSource$getCoinsAndPremiumSubscriptions$1)o).label = 1;
            if ((b = e$a.b(14, (k)k8, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return ((k8$b)b).a;
    }
    
    public final Object d(final tg2.c<? super c> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteGqlPremiumDataSource$getPremiumCancelOffer.RemoteGqlPremiumDataSource$getPremiumCancelOffer$1) {
                final RemoteGqlPremiumDataSource$getPremiumCancelOffer.RemoteGqlPremiumDataSource$getPremiumCancelOffer$1 remoteGqlPremiumDataSource$getPremiumCancelOffer$1 = (RemoteGqlPremiumDataSource$getPremiumCancelOffer.RemoteGqlPremiumDataSource$getPremiumCancelOffer$1)c;
                final int label = remoteGqlPremiumDataSource$getPremiumCancelOffer$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPremiumDataSource$getPremiumCancelOffer$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPremiumDataSource$getPremiumCancelOffer$1;
                    break Label_0047;
                }
            }
            o = new RemoteGqlPremiumDataSource$getPremiumCancelOffer.RemoteGqlPremiumDataSource$getPremiumCancelOffer$1(this, (tg2.c)c);
        }
        Object o2 = ((RemoteGqlPremiumDataSource$getPremiumCancelOffer.RemoteGqlPremiumDataSource$getPremiumCancelOffer$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPremiumDataSource$getPremiumCancelOffer.RemoteGqlPremiumDataSource$getPremiumCancelOffer$1)o).label;
        RemoteGqlPremiumDataSource remoteGqlPremiumDataSource;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            remoteGqlPremiumDataSource = (RemoteGqlPremiumDataSource)((RemoteGqlPremiumDataSource$getPremiumCancelOffer.RemoteGqlPremiumDataSource$getPremiumCancelOffer$1)o).L$0;
            aj2.c.Q0(o2);
        }
        else {
            aj2.c.Q0(o2);
            final g a = this.a;
            final e6 e6 = new e6(h$a.c((Object)ah2.c.X((Object)"cancellation_offer")));
            ((RemoteGqlPremiumDataSource$getPremiumCancelOffer.RemoteGqlPremiumDataSource$getPremiumCancelOffer$1)o).L$0 = this;
            ((RemoteGqlPremiumDataSource$getPremiumCancelOffer.RemoteGqlPremiumDataSource$getPremiumCancelOffer$1)o).label = 1;
            o2 = e$a.b(14, (k)e6, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null);
            if (o2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            remoteGqlPremiumDataSource = this;
        }
        final e6$h a2 = ((e6$e)o2).a;
        final Object o3 = null;
        List b;
        if (a2 != null) {
            b = a2.b;
        }
        else {
            b = null;
        }
        Object o4 = o3;
        if (b != null) {
            final e6$i e6$i = (e6$i)CollectionsKt___CollectionsKt.s1(b);
            if (e6$i == null) {
                o4 = o3;
            }
            else {
                final List h = e6$i.h;
                o4 = o3;
                if (h != null) {
                    final e6$j e6$j = (e6$j)CollectionsKt___CollectionsKt.s1(h);
                    if (e6$j == null) {
                        o4 = o3;
                    }
                    else {
                        final JsonAdapter a3 = remoteGqlPremiumDataSource.b.a((Class)CancellationOfferDescription.class);
                        final String e7 = e6$i.e;
                        o4 = o3;
                        if (e7 != null) {
                            final CancellationOfferDescription cancellationOfferDescription = (CancellationOfferDescription)a3.fromJson(e7);
                            if (cancellationOfferDescription == null) {
                                o4 = o3;
                            }
                            else {
                                o4 = new c(cancellationOfferDescription.a, e6$i.f, e6$i.b, cancellationOfferDescription.b, e6$j.c);
                            }
                        }
                    }
                }
            }
        }
        return o4;
    }
    
    public final Object e(final tg2.c<? super List<e6$i>> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers.RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers$1) {
                final RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers.RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers$1 remoteGqlPremiumDataSource$getPremiumSubscriptionOffers$1 = (RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers.RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers$1)c;
                final int label = remoteGqlPremiumDataSource$getPremiumSubscriptionOffers$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPremiumDataSource$getPremiumSubscriptionOffers$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPremiumDataSource$getPremiumSubscriptionOffers$1;
                    break Label_0047;
                }
            }
            o = new RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers.RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers$1(this, (tg2.c)c);
        }
        final Object result = ((RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers.RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers.RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final g a = this.a;
            final e6 e6 = new e6(h$a.c((Object)ah2.c.X((Object)"premium")));
            ((RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers.RemoteGqlPremiumDataSource$getPremiumSubscriptionOffers$1)o).label = 1;
            if ((b = e$a.b(14, (k)e6, (e)a, (RetryAlgo)null, (Map)null, (tg2.c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final e6$h a2 = ((e6$e)b).a;
        List b2;
        if (a2 != null) {
            b2 = a2.b;
        }
        else {
            b2 = null;
        }
        return b2;
    }
    
    public final Object f(final c c, final tg2.c<? super j> c2) {
        RemoteGqlPremiumDataSource$verifyPremiumCancelOffer.RemoteGqlPremiumDataSource$verifyPremiumCancelOffer$1 remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2 = null;
        Label_0050: {
            if (c2 instanceof RemoteGqlPremiumDataSource$verifyPremiumCancelOffer.RemoteGqlPremiumDataSource$verifyPremiumCancelOffer$1) {
                final RemoteGqlPremiumDataSource$verifyPremiumCancelOffer.RemoteGqlPremiumDataSource$verifyPremiumCancelOffer$1 remoteGqlPremiumDataSource$verifyPremiumCancelOffer$1 = (RemoteGqlPremiumDataSource$verifyPremiumCancelOffer.RemoteGqlPremiumDataSource$verifyPremiumCancelOffer$1)c2;
                final int label = remoteGqlPremiumDataSource$verifyPremiumCancelOffer$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPremiumDataSource$verifyPremiumCancelOffer$1.label = label + Integer.MIN_VALUE;
                    remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2 = remoteGqlPremiumDataSource$verifyPremiumCancelOffer$1;
                    break Label_0050;
                }
            }
            remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2 = new RemoteGqlPremiumDataSource$verifyPremiumCancelOffer.RemoteGqlPremiumDataSource$verifyPremiumCancelOffer$1(this, (tg2.c)c2);
        }
        Object o = remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2.label;
        Label_0224: {
            String string;
            RemoteGqlPremiumDataSource remoteGqlPremiumDataSource;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        aj2.c.Q0(o);
                        break Label_0224;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    string = (String)remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2.L$1;
                    remoteGqlPremiumDataSource = (RemoteGqlPremiumDataSource)remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2.L$0;
                    aj2.c.Q0(o);
                }
            }
            else {
                aj2.c.Q0(o);
                string = UUID.randomUUID().toString();
                f.e((Object)string, "randomUUID().toString()");
                remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2.L$0 = this;
                remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2.L$1 = string;
                remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2.label = 1;
                o = this.a(c, string, (tg2.c<? super m0$e>)remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                remoteGqlPremiumDataSource = this;
            }
            final m0$e m0$e = (m0$e)o;
            remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2.L$0 = null;
            remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2.L$1 = null;
            remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2.label = 2;
            if ((o = remoteGqlPremiumDataSource.b(m0$e, string, (tg2.c<? super o0$b>)remoteGqlPremiumDataSource$verifyPremiumCancelOffer$2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final o0$b o0$b = (o0$b)o;
        f.c((Object)o0$b);
        if (o0$b.b) {
            return j.a;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
