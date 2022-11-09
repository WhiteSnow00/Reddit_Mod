// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.premium.repository;

import com.reddit.type.SkuCoinsReceiver;
import kl0.w6;
import com.reddit.queries.e6$c;
import com.reddit.queries.e6$b;
import com.reddit.queries.e6$a;
import com.reddit.type.Currency;
import com.reddit.domain.image.model.Images;
import sr0.i$c;
import sr0.i$b;
import com.reddit.gold.model.CoinsReceiver;
import sr0.i$a;
import com.reddit.queries.e6$k;
import com.reddit.gold.model.GlobalProductPurchasePackage$Currency;
import kotlin.NoWhenBranchMatchedException;
import a60.a$a;
import com.reddit.queries.e6$j;
import com.reddit.gold.model.GlobalProductPurchasePackage;
import sr0.e;
import com.reddit.queries.e6$i;
import java.io.Serializable;
import com.reddit.type.DurationUnit;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import com.reddit.queries.k8$c;
import ce0.b;
import java.util.ArrayList;
import qg2.m;
import com.reddit.queries.k8$d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import com.reddit.domain.model.MyAccount;
import r20.d;
import com.reddit.session.p;
import javax.inject.Inject;
import ah2.f;
import com.reddit.session.q;
import kd0.j;
import ge0.u;
import com.reddit.data.premium.datasource.remote.RemoteGqlPremiumDataSource;
import de0.a;

public final class RedditPremiumRepository implements a
{
    public final RemoteGqlPremiumDataSource a;
    public final u b;
    public final j c;
    public final q d;
    public final r20.a e;
    
    @Inject
    public RedditPremiumRepository(final RemoteGqlPremiumDataSource a, final u b, final j c, final q d, final r20.a e) {
        f.f((Object)a, "gqlRemote");
        f.f((Object)b, "myAccountRepository");
        f.f((Object)c, "powerupsRepository");
        f.f((Object)d, "sessionManager");
        f.f((Object)e, "backgroundThread");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final nf2.a a(final long n, final boolean b, final boolean b2) {
        this.c.g(b && b2);
        final MyAccount b3 = this.d.B();
        nf2.a a;
        if (b3 != null) {
            a = this.b.d(((p)b3).getUsername(), b, b2, n).l((sf2.a)new b60.a((p)b3, b, b2, n));
        }
        else {
            a = nf2.a.h();
        }
        f.e((Object)a, "if (account != null) {\n \u2026pletable.complete()\n    }");
        return o72.f.t(a, (d)this.e);
    }
    
    public final Object b(final c<? super ce0.c> c) {
        return this.a.d(c);
    }
    
    public final void c() {
    }
    
    public final Object d(final ce0.c c, final c<? super Boolean> c2) {
        RedditPremiumRepository$validateCancelOffer.RedditPremiumRepository$validateCancelOffer$1 redditPremiumRepository$validateCancelOffer$2 = null;
        Label_0050: {
            if (c2 instanceof RedditPremiumRepository$validateCancelOffer.RedditPremiumRepository$validateCancelOffer$1) {
                final RedditPremiumRepository$validateCancelOffer.RedditPremiumRepository$validateCancelOffer$1 redditPremiumRepository$validateCancelOffer$1 = (RedditPremiumRepository$validateCancelOffer.RedditPremiumRepository$validateCancelOffer$1)c2;
                final int label = redditPremiumRepository$validateCancelOffer$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPremiumRepository$validateCancelOffer$1.label = label + Integer.MIN_VALUE;
                    redditPremiumRepository$validateCancelOffer$2 = redditPremiumRepository$validateCancelOffer$1;
                    break Label_0050;
                }
            }
            redditPremiumRepository$validateCancelOffer$2 = new RedditPremiumRepository$validateCancelOffer.RedditPremiumRepository$validateCancelOffer$1(this, (c)c2);
        }
        final Object result = redditPremiumRepository$validateCancelOffer$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditPremiumRepository$validateCancelOffer$2.label;
        boolean b = false;
        Label_0098: {
            if (label2 == 0) {
                break Label_0098;
            }
            Label_0088: {
                if (label2 != 1) {
                    break Label_0088;
                }
                try {
                    aj2.c.Q0(result);
                    return b;
                    aj2.c.Q0(result);
                    final RemoteGqlPremiumDataSource a = this.a;
                    redditPremiumRepository$validateCancelOffer$2.label = 1;
                    iftrue(Label_0133:)(a.f(c, (c<? super pg2.j>)redditPremiumRepository$validateCancelOffer$2) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                finally {
                    b = false;
                }
            }
        }
        Label_0133: {
            return b;
        }
    }
    
    public final Object e(final c<? super ce0.a> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions.RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1) {
                final RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions.RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1 redditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1 = (RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions.RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1)c;
                final int label = redditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1.label = label + Integer.MIN_VALUE;
                    o = redditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1;
                    break Label_0047;
                }
            }
            o = new RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions.RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1(this, (c)c);
        }
        final Object result = ((RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions.RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions.RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1)o).label;
        Object c2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            c2 = result;
        }
        else {
            aj2.c.Q0(result);
            final RemoteGqlPremiumDataSource a = this.a;
            ((RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions.RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1)o).label = 1;
            if ((c2 = a.c((c<? super k8$d>)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final k8$d k8$d = (k8$d)c2;
        Object o2;
        if (k8$d != null) {
            final Integer b = k8$d.b;
            final List c3 = k8$d.c;
            List<b> list2;
            if (c3 != null) {
                final ArrayList list = new ArrayList<b>(m.P0((Iterable)c3, 10));
                for (final k8$c k8$c : c3) {
                    final String b2 = k8$c.b;
                    final Long a2 = ur0.c.a(k8$c.c.toString());
                    if (a2 != null) {
                        final Long a3 = a60.a.a(a2);
                        if (a3 != null) {
                            final long longValue = a3;
                            final Long a4 = ur0.c.a(k8$c.d.toString());
                            if (a4 != null) {
                                final Long a5 = a60.a.a(a4);
                                if (a5 != null) {
                                    final long longValue2 = a5;
                                    final Long a6 = ur0.c.a(k8$c.e.toString());
                                    if (a6 != null) {
                                        final Long a7 = a60.a.a(a6);
                                        if (a7 != null) {
                                            final long longValue3 = a7;
                                            final DurationUnit f = k8$c.f;
                                            com.reddit.gold.model.DurationUnit b3;
                                            if (f != null) {
                                                b3 = a60.a.b(f);
                                            }
                                            else {
                                                b3 = null;
                                            }
                                            list.add(new b(b2, longValue, longValue2, longValue3, b3, k8$c.g, k8$c.h));
                                            continue;
                                        }
                                    }
                                    throw new IllegalStateException("Can't convert ifCanceledExpiresAt".toString());
                                }
                            }
                            throw new IllegalStateException("Can't convert expiresAt".toString());
                        }
                    }
                    throw new IllegalStateException("Can't convert startedAt".toString());
                }
                list2 = (List<b>)list;
            }
            else {
                list2 = null;
            }
            Object instance = list2;
            if (list2 == null) {
                instance = EmptyList.INSTANCE;
            }
            o2 = new ce0.a(b, (List<b>)instance);
        }
        else {
            o2 = null;
        }
        return o2;
    }
    
    public final Serializable f(final c c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RedditPremiumRepository$getPremiumSubscriptionOffers$1) {
                final RedditPremiumRepository$getPremiumSubscriptionOffers$1 redditPremiumRepository$getPremiumSubscriptionOffers$1 = (RedditPremiumRepository$getPremiumSubscriptionOffers$1)c;
                final int label = redditPremiumRepository$getPremiumSubscriptionOffers$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPremiumRepository$getPremiumSubscriptionOffers$1.label = label + Integer.MIN_VALUE;
                    o = redditPremiumRepository$getPremiumSubscriptionOffers$1;
                    break Label_0047;
                }
            }
            o = new RedditPremiumRepository$getPremiumSubscriptionOffers$1(this, (c<? super RedditPremiumRepository$getPremiumSubscriptionOffers$1>)c);
        }
        final Object result = ((RedditPremiumRepository$getPremiumSubscriptionOffers$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPremiumRepository$getPremiumSubscriptionOffers$1)o).label;
        Object e;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            e = result;
        }
        else {
            aj2.c.Q0(result);
            final RemoteGqlPremiumDataSource a = this.a;
            ((RedditPremiumRepository$getPremiumSubscriptionOffers$1)o).label = 1;
            if ((e = a.e((c<? super List<e6$i>>)o)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
        }
        final List list = (List)e;
        Serializable s13;
        if (list != null) {
            ArrayList<e> list2 = new ArrayList<e>(m.P0((Iterable)list, 10));
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final e6$i e6$i = (e6$i)iterator.next();
                f.f((Object)e6$i, "<this>");
                String b = e6$i.b;
                String string = e6$i.c.toString();
                final String d = e6$i.d;
                String e2 = e6$i.e;
                final Object g = e6$i.g;
                String string2;
                if (g != null) {
                    string2 = g.toString();
                }
                else {
                    string2 = null;
                }
                final int f = e6$i.f;
                final List h = e6$i.h;
                String s11;
                String s12;
                ArrayList<GlobalProductPurchasePackage> list7;
                ArrayList<e> list8;
                if (h != null) {
                    final ArrayList list3 = new ArrayList<GlobalProductPurchasePackage>(m.P0((Iterable)h, 10));
                    final Iterator iterator2 = h.iterator();
                    final Iterator iterator3 = iterator;
                    while (iterator2.hasNext()) {
                        final e6$j e6$j = (e6$j)iterator2.next();
                        ah2.f.f((Object)e6$j, "<this>");
                        final String c2 = e6$j.c;
                        final String d2 = e6$j.d;
                        final String e3 = e6$j.e;
                        final Currency f2 = e6$j.f;
                        ah2.f.f((Object)f2, "<this>");
                        final int n = a$a.c[((Enum)f2).ordinal()];
                        GlobalProductPurchasePackage$Currency globalProductPurchasePackage$Currency;
                        if (n != 1) {
                            if (n != 2) {
                                if (n != 3) {
                                    if (n != 4) {
                                        if (n != 5) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        globalProductPurchasePackage$Currency = GlobalProductPurchasePackage$Currency.UNKNOWN;
                                    }
                                    else {
                                        globalProductPurchasePackage$Currency = GlobalProductPurchasePackage$Currency.SUBREDDIT_POINTS;
                                    }
                                }
                                else {
                                    globalProductPurchasePackage$Currency = GlobalProductPurchasePackage$Currency.COINS;
                                }
                            }
                            else {
                                globalProductPurchasePackage$Currency = GlobalProductPurchasePackage$Currency.ETHEREUM;
                            }
                        }
                        else {
                            globalProductPurchasePackage$Currency = GlobalProductPurchasePackage$Currency.USD;
                        }
                        final List g2 = e6$j.g;
                        final String b2 = e6$j.b;
                        final List h2 = e6$j.h;
                        String s2;
                        String s4;
                        List<Object> list5;
                        String s5;
                        String s6;
                        if (h2 != null) {
                            final ArrayList<Object> list4 = new ArrayList<Object>();
                            final Iterator iterator4 = h2.iterator();
                            final String s = string2;
                            while (iterator4.hasNext()) {
                                final e6$k e6$k = (e6$k)iterator4.next();
                                ah2.f.f((Object)e6$k, "<this>");
                                final e6$a e4 = e6$k.e;
                                final e6$b f3 = e6$k.f;
                                final e6$c g3 = e6$k.g;
                                Object o2;
                                if (e4 != null) {
                                    final String b3 = e4.b;
                                    final String c3 = e4.c;
                                    final String d3 = e4.d;
                                    final int e5 = e4.e;
                                    final w6 a2 = e4.f.b.a;
                                    ah2.f.f((Object)a2, "<this>");
                                    o2 = new i$a(b3, c3, d3, e5, new sr0.j(a2.b, a60.a.b(a2.c)));
                                }
                                else if (f3 != null) {
                                    final String b4 = f3.b;
                                    final String c4 = f3.c;
                                    final String d4 = f3.d;
                                    final int e6 = f3.e;
                                    final SkuCoinsReceiver f4 = f3.f;
                                    ah2.f.f((Object)f4, "<this>");
                                    final int n2 = a$a.b[((Enum)f4).ordinal()];
                                    CoinsReceiver coinsReceiver;
                                    if (n2 != 1) {
                                        if (n2 != 2) {
                                            if (n2 != 3) {
                                                if (n2 != 4) {
                                                    if (n2 != 5) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    coinsReceiver = CoinsReceiver.UNKNOWN;
                                                }
                                                else {
                                                    coinsReceiver = CoinsReceiver.RECEIVER;
                                                }
                                            }
                                            else {
                                                coinsReceiver = CoinsReceiver.USER_IN_SUBREDDIT;
                                            }
                                        }
                                        else {
                                            coinsReceiver = CoinsReceiver.SUBREDDIT;
                                        }
                                    }
                                    else {
                                        coinsReceiver = CoinsReceiver.BUYER;
                                    }
                                    o2 = new i$b(b4, c4, d4, e6, coinsReceiver, (String)null, (Integer)null);
                                }
                                else if (g3 != null) {
                                    final String b5 = g3.b;
                                    final String c5 = g3.c;
                                    final String d5 = g3.d;
                                    final w6 a3 = g3.f.b.a;
                                    ah2.f.f((Object)a3, "<this>");
                                    o2 = new i$c(b5, c5, d5, new sr0.j(a3.b, a60.a.b(a3.c)), g3.e);
                                }
                                else {
                                    o2 = null;
                                }
                                if (o2 != null) {
                                    list4.add(o2);
                                }
                            }
                            s2 = b;
                            final String s3 = string;
                            s4 = s;
                            list5 = list4;
                            s5 = e2;
                            s6 = s3;
                        }
                        else {
                            final String s7 = e2;
                            final String s8 = string2;
                            final List list6 = null;
                            s2 = b;
                            s6 = string;
                            s5 = s7;
                            s4 = s8;
                            list5 = list6;
                        }
                        Object instance = list5;
                        if (list5 == null) {
                            instance = EmptyList.INSTANCE;
                        }
                        list3.add(new GlobalProductPurchasePackage(c2, d2, e3, globalProductPurchasePackage$Currency, g2, b2, (List)instance, (String)null, (List)EmptyList.INSTANCE, (Images)null, (String)null, (String)null, (ArrayList)null));
                        final String s9 = s4;
                        final String s10 = s5;
                        b = s2;
                        string = s6;
                        e2 = s10;
                        string2 = s9;
                    }
                    iterator = iterator3;
                    s11 = e2;
                    s12 = string2;
                    list7 = (ArrayList<GlobalProductPurchasePackage>)list3;
                    list8 = list2;
                }
                else {
                    final ArrayList list9 = null;
                    s11 = e2;
                    s12 = string2;
                    list8 = list2;
                    list7 = list9;
                }
                list8.add(new e(f, b, string, d, s11, s12, (String)null, (ArrayList)list7));
                list2 = list8;
            }
            s13 = list2;
        }
        else {
            s13 = null;
        }
        return s13;
    }
}
