// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.premium.repository;

import com.reddit.type.SkuCoinsReceiver;
import al0.l6;
import com.reddit.queries.g6$c;
import com.reddit.queries.g6$b;
import com.reddit.queries.g6$a;
import com.reddit.type.Currency;
import com.reddit.domain.image.model.Images;
import kr0.i$c;
import kr0.i$b;
import com.reddit.gold.model.CoinsReceiver;
import kr0.i$a;
import kr0.j;
import com.reddit.queries.g6$k;
import com.reddit.gold.model.GlobalProductPurchasePackage$Currency;
import kotlin.NoWhenBranchMatchedException;
import t50.a$a;
import com.reddit.queries.g6$j;
import com.reddit.gold.model.GlobalProductPurchasePackage;
import com.reddit.queries.g6$i;
import java.io.Serializable;
import com.reddit.type.DurationUnit;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import com.reddit.queries.n8$c;
import java.util.ArrayList;
import com.reddit.queries.n8$d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lg2.c;
import com.reddit.domain.model.MyAccount;
import n20.d;
import yd.b;
import com.reddit.session.n;
import javax.inject.Inject;
import sg2.e;
import com.reddit.session.o;
import bd0.k;
import xd0.m;
import com.reddit.data.premium.datasource.remote.RemoteGqlPremiumDataSource;
import ud0.a;

public final class RedditPremiumRepository implements a
{
    public final RemoteGqlPremiumDataSource a;
    public final m b;
    public final k c;
    public final o d;
    public final n20.a e;
    
    @Inject
    public RedditPremiumRepository(final RemoteGqlPremiumDataSource a, final m b, final k c, final o d, final n20.a e) {
        sg2.e.f((Object)a, "gqlRemote");
        sg2.e.f((Object)b, "myAccountRepository");
        sg2.e.f((Object)c, "powerupsRepository");
        sg2.e.f((Object)d, "sessionManager");
        sg2.e.f((Object)e, "backgroundThread");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final ff2.a a(final long n, final boolean b, final boolean b2) {
        this.c.g(b && b2);
        final MyAccount c = this.d.C();
        ff2.a a;
        if (c != null) {
            a = this.b.d(((n)c).getUsername(), b, b2, n).k((kf2.a)new u50.a((n)c, b, b2, n));
        }
        else {
            a = ff2.a.h();
        }
        sg2.e.e((Object)a, "if (account != null) {\n \u2026pletable.complete()\n    }");
        return b.i0(a, (d)this.e);
    }
    
    public final void b() {
    }
    
    public final Object c(final c<? super td0.c> c) {
        return this.a.d((c)c);
    }
    
    public final Object d(final td0.c c, final c<? super Boolean> c2) {
        RedditPremiumRepository$validateCancelOffer$1 redditPremiumRepository$validateCancelOffer$2 = null;
        Label_0050: {
            if (c2 instanceof RedditPremiumRepository$validateCancelOffer$1) {
                final RedditPremiumRepository$validateCancelOffer$1 redditPremiumRepository$validateCancelOffer$1 = (RedditPremiumRepository$validateCancelOffer$1)c2;
                final int label = redditPremiumRepository$validateCancelOffer$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPremiumRepository$validateCancelOffer$1.label = label + Integer.MIN_VALUE;
                    redditPremiumRepository$validateCancelOffer$2 = redditPremiumRepository$validateCancelOffer$1;
                    break Label_0050;
                }
            }
            redditPremiumRepository$validateCancelOffer$2 = new RedditPremiumRepository$validateCancelOffer$1(this, (c)c2);
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
                    yd.b.k0(result);
                    return b;
                    yd.b.k0(result);
                    final RemoteGqlPremiumDataSource a = this.a;
                    redditPremiumRepository$validateCancelOffer$2.label = 1;
                    iftrue(Label_0133:)(a.f(c, (c)redditPremiumRepository$validateCancelOffer$2) != coroutine_SUSPENDED);
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
    
    public final Object e(final c<? super td0.a> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1) {
                final RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1 redditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1 = (RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1)c;
                final int label = redditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1.label = label + Integer.MIN_VALUE;
                    o = redditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1;
                    break Label_0047;
                }
            }
            o = new RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1(this, (c)c);
        }
        final Object result = ((RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1)o).label;
        Object c2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            c2 = result;
        }
        else {
            yd.b.k0(result);
            final RemoteGqlPremiumDataSource a = this.a;
            ((RedditPremiumRepository$fetchCoinsAndPremiumSubscriptions$1)o).label = 1;
            if ((c2 = a.c((c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final n8$d n8$d = (n8$d)c2;
        Object o2;
        if (n8$d != null) {
            final Integer b = n8$d.b;
            final List c3 = n8$d.c;
            List<td0.b> list2;
            if (c3 != null) {
                final ArrayList list = new ArrayList<td0.b>(ig2.m.c3((Iterable)c3, 10));
                for (final n8$c n8$c : c3) {
                    final String b2 = n8$c.b;
                    final Long a2 = mr0.c.a(n8$c.c.toString());
                    if (a2 != null) {
                        final Long a3 = t50.a.a(a2);
                        if (a3 != null) {
                            final long longValue = a3;
                            final Long a4 = mr0.c.a(n8$c.d.toString());
                            if (a4 != null) {
                                final Long a5 = t50.a.a(a4);
                                if (a5 != null) {
                                    final long longValue2 = a5;
                                    final Long a6 = mr0.c.a(n8$c.e.toString());
                                    if (a6 != null) {
                                        final Long a7 = t50.a.a(a6);
                                        if (a7 != null) {
                                            final long longValue3 = a7;
                                            final DurationUnit f = n8$c.f;
                                            com.reddit.gold.model.DurationUnit b3;
                                            if (f != null) {
                                                b3 = t50.a.b(f);
                                            }
                                            else {
                                                b3 = null;
                                            }
                                            list.add(new td0.b(b2, longValue, longValue2, longValue3, b3, n8$c.g, n8$c.h));
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
                list2 = (List<td0.b>)list;
            }
            else {
                list2 = null;
            }
            Object instance = list2;
            if (list2 == null) {
                instance = EmptyList.INSTANCE;
            }
            o2 = new td0.a(b, (List)instance);
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
            o = new RedditPremiumRepository$getPremiumSubscriptionOffers$1(this, c);
        }
        final Object result = ((RedditPremiumRepository$getPremiumSubscriptionOffers$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RedditPremiumRepository$getPremiumSubscriptionOffers$1)o).label;
        Object e;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            e = result;
        }
        else {
            yd.b.k0(result);
            final RemoteGqlPremiumDataSource a = this.a;
            ((RedditPremiumRepository$getPremiumSubscriptionOffers$1)o).label = 1;
            if ((e = a.e((c)o)) == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
        }
        final List list = (List)e;
        ArrayList<kr0.e> list2;
        if (list != null) {
            list2 = new ArrayList<kr0.e>(ig2.m.c3((Iterable)list, 10));
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                final g6$i g6$i = (g6$i)iterator.next();
                sg2.e.f((Object)g6$i, "<this>");
                String b = g6$i.b;
                String string = g6$i.c.toString();
                final String d = g6$i.d;
                String e2 = g6$i.e;
                final Object g = g6$i.g;
                String string2;
                if (g != null) {
                    string2 = g.toString();
                }
                else {
                    string2 = null;
                }
                final int f = g6$i.f;
                final List h = g6$i.h;
                String s11;
                ArrayList<GlobalProductPurchasePackage> list7;
                ArrayList<kr0.e> list8;
                if (h != null) {
                    final ArrayList list3 = new ArrayList<GlobalProductPurchasePackage>(ig2.m.c3((Iterable)h, 10));
                    final Iterator iterator2 = h.iterator();
                    final Iterator iterator3 = iterator;
                    while (iterator2.hasNext()) {
                        final g6$j g6$j = (g6$j)iterator2.next();
                        sg2.e.f((Object)g6$j, "<this>");
                        final String c2 = g6$j.c;
                        final String d2 = g6$j.d;
                        final String e3 = g6$j.e;
                        final Currency f2 = g6$j.f;
                        sg2.e.f((Object)f2, "<this>");
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
                        final List g2 = g6$j.g;
                        final String b2 = g6$j.b;
                        final List h2 = g6$j.h;
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
                                final g6$k g6$k = (g6$k)iterator4.next();
                                sg2.e.f((Object)g6$k, "<this>");
                                final g6$a e4 = g6$k.e;
                                final g6$b f3 = g6$k.f;
                                final g6$c g3 = g6$k.g;
                                Object o2;
                                if (e4 != null) {
                                    final String b3 = e4.b;
                                    final String c3 = e4.c;
                                    final String d3 = e4.d;
                                    final int e5 = e4.e;
                                    final l6 a2 = e4.f.b.a;
                                    sg2.e.f((Object)a2, "<this>");
                                    o2 = new i$a(b3, c3, d3, e5, new j(a2.b, t50.a.b(a2.c)));
                                }
                                else if (f3 != null) {
                                    final String b4 = f3.b;
                                    final String c4 = f3.c;
                                    final String d4 = f3.d;
                                    final int e6 = f3.e;
                                    final SkuCoinsReceiver f4 = f3.f;
                                    sg2.e.f((Object)f4, "<this>");
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
                                    final l6 a3 = g3.f.b.a;
                                    sg2.e.f((Object)a3, "<this>");
                                    o2 = new i$c(b5, c5, d5, new j(a3.b, t50.a.b(a3.c)), g3.e);
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
                            final String s7 = string;
                            s5 = e2;
                            final String s8 = string2;
                            final List list6 = null;
                            s2 = b;
                            s6 = s7;
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
                    s11 = string2;
                    list7 = (ArrayList<GlobalProductPurchasePackage>)list3;
                    list8 = list2;
                }
                else {
                    list7 = null;
                    s11 = string2;
                    list8 = list2;
                }
                list8.add(new kr0.e(f, b, string, d, e2, s11, (String)null, (ArrayList)list7));
                list2 = list8;
            }
        }
        else {
            list2 = null;
        }
        return list2;
    }
}
