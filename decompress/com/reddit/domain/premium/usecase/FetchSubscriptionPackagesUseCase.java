// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.premium.usecase;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kr0.i$a;
import kr0.i$b;
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Collection;
import mg2.p;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import kotlin.collections.builders.ListBuilder;
import com.reddit.gold.model.GlobalProductPurchasePackage;
import cg.d;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import javax.inject.Inject;
import ng2.e;
import sz.c;
import wa0.j;
import com.reddit.session.n;
import ud0.a;

public final class FetchSubscriptionPackagesUseCase
{
    public final ud0.a a;
    public final n b;
    public final j c;
    public final sz.c d;
    public final dw0.a e;
    public final d20.a f;
    public final rd0.a g;
    
    @Inject
    public FetchSubscriptionPackagesUseCase(final ud0.a a, final n b, final j c, final sz.c d, final dw0.a e, final d20.a f, final rd0.a g) {
        ng2.e.f((Object)a, "premiumRepository");
        ng2.e.f((Object)b, "sessionManager");
        ng2.e.f((Object)c, "internalFeatures");
        ng2.e.f((Object)d, "billingManager");
        ng2.e.f((Object)e, "redditLogger");
        ng2.e.f((Object)f, "dispatcherProvider");
        ng2.e.f((Object)g, "currencyFormatter");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static final Object a(FetchSubscriptionPackagesUseCase fetchSubscriptionPackagesUseCase, final boolean b, final boolean z$1, final gg2.c c) {
        fetchSubscriptionPackagesUseCase.getClass();
        FetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1 fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1 = null;
        Label_0057: {
            if (c instanceof FetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1) {
                fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1 = (FetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1)c;
                final int label = fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.label = label + Integer.MIN_VALUE;
                    break Label_0057;
                }
            }
            fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1 = new FetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1(fetchSubscriptionPackagesUseCase, c);
        }
        Object o = fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.label;
        final String s = "com.reddit.premium_2";
        final String s2 = "com.reddit.premium_1";
        boolean z$2 = false;
        kr0.e e = null;
        FetchSubscriptionPackagesUseCase fetchSubscriptionPackagesUseCase2 = null;
        Object j = null;
        List list2 = null;
        Label_0639: {
            boolean z$3;
            boolean z$4;
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        z$2 = fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.Z$0;
                        final List list = (List)fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$2;
                        e = (kr0.e)fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$1;
                        fetchSubscriptionPackagesUseCase2 = (FetchSubscriptionPackagesUseCase)fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$0;
                        d.b4(o);
                        j = o;
                        list2 = list;
                        break Label_0639;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    z$3 = fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.Z$1;
                    z$4 = fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.Z$0;
                    fetchSubscriptionPackagesUseCase = (FetchSubscriptionPackagesUseCase)fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$0;
                    d.b4(o);
                }
            }
            else {
                d.b4(o);
                final ud0.a a = fetchSubscriptionPackagesUseCase.a;
                fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$0 = fetchSubscriptionPackagesUseCase;
                z$4 = b;
                fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.Z$0 = z$4;
                fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.Z$1 = z$1;
                fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.label = 1;
                o = a.e((gg2.c)fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                z$3 = z$1;
            }
            final List list3 = (List)o;
            kr0.e l$1 = null;
            Label_0312: {
                if (list3 != null) {
                    while (true) {
                        for (final Object next : list3) {
                            if (ng2.e.a((Object)((kr0.e)next).f, (Object)"premium_econ_be")) {
                                l$1 = (kr0.e)next;
                                break Label_0312;
                            }
                        }
                        Object next = null;
                        continue;
                    }
                }
                l$1 = null;
            }
            if (l$1 != null) {
                final List m = l$1.m;
                if (m != null) {
                    fetchSubscriptionPackagesUseCase.getClass();
                    Label_0482: {
                        if (z$3 && !z$4) {
                            boolean b2 = false;
                            Label_0403: {
                                if (!m.isEmpty()) {
                                    final Iterator iterator2 = m.iterator();
                                    while (iterator2.hasNext()) {
                                        if (ng2.e.a((Object)((GlobalProductPurchasePackage)iterator2.next()).k, (Object)"com.reddit.premium_1_ft")) {
                                            b2 = true;
                                            break Label_0403;
                                        }
                                    }
                                }
                                b2 = false;
                            }
                            if (b2) {
                                boolean b3 = false;
                                Label_0470: {
                                    if (!m.isEmpty()) {
                                        final Iterator iterator3 = m.iterator();
                                        while (iterator3.hasNext()) {
                                            if (ng2.e.a((Object)((GlobalProductPurchasePackage)iterator3.next()).k, (Object)"com.reddit.premium_2_ft")) {
                                                b3 = true;
                                                break Label_0470;
                                            }
                                        }
                                    }
                                    b3 = false;
                                }
                                if (b3) {
                                    z$2 = true;
                                    break Label_0482;
                                }
                            }
                        }
                        z$2 = false;
                    }
                    final ListBuilder listBuilder = new ListBuilder();
                    ((List<String>)listBuilder).add("com.reddit.premium_2");
                    ((List<String>)listBuilder).add("com.reddit.premium_1");
                    if (z$2) {
                        ((List<String>)listBuilder).add("com.reddit.premium_2_ft");
                        ((List<String>)listBuilder).add("com.reddit.premium_1_ft");
                    }
                    final List build = listBuilder.build();
                    fetchSubscriptionPackagesUseCase.c.h();
                    fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$0 = fetchSubscriptionPackagesUseCase;
                    fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$1 = l$1;
                    fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$2 = m;
                    fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.Z$0 = z$2;
                    fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.label = 2;
                    j = g.j((CoroutineContext)fetchSubscriptionPackagesUseCase.f.b(), (p)new FetchSubscriptionPackagesUseCase$queryBillingManager$2(true, fetchSubscriptionPackagesUseCase, build, (gg2.c)null), (gg2.c)fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1);
                    if (j == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    final List list4 = m;
                    final FetchSubscriptionPackagesUseCase fetchSubscriptionPackagesUseCase3 = fetchSubscriptionPackagesUseCase;
                    e = l$1;
                    list2 = list4;
                    fetchSubscriptionPackagesUseCase2 = fetchSubscriptionPackagesUseCase3;
                    break Label_0639;
                }
            }
            throw new IllegalStateException("No offer packages available.".toString());
        }
        final List list5 = (List)j;
        fetchSubscriptionPackagesUseCase2.getClass();
        String s3 = null;
        String s4 = null;
        boolean b7 = false;
        Label_0831: {
            if (z$2) {
                final boolean b4 = list5 instanceof Collection;
                boolean b5 = false;
                Label_0730: {
                    if (!b4 || !list5.isEmpty()) {
                        final Iterator iterator4 = list5.iterator();
                        while (iterator4.hasNext()) {
                            if (ng2.e.a((Object)((vz.e)iterator4.next()).b(), (Object)"com.reddit.premium_2_ft")) {
                                b5 = true;
                                break Label_0730;
                            }
                        }
                    }
                    b5 = false;
                }
                if (b5) {
                    boolean b6 = false;
                    Label_0803: {
                        if (!b4 || !list5.isEmpty()) {
                            final Iterator iterator5 = list5.iterator();
                            while (iterator5.hasNext()) {
                                if (ng2.e.a((Object)((vz.e)iterator5.next()).b(), (Object)"com.reddit.premium_1_ft")) {
                                    b6 = true;
                                    break Label_0803;
                                }
                            }
                        }
                        b6 = false;
                    }
                    if (b6) {
                        s3 = "com.reddit.premium_2_ft";
                        s4 = "com.reddit.premium_1_ft";
                        b7 = true;
                        break Label_0831;
                    }
                }
            }
            b7 = false;
            s4 = s2;
            s3 = s;
        }
        final a a2 = new a(s4, s3, b7);
        for (final GlobalProductPurchasePackage globalProductPurchasePackage : list2) {
            if (ng2.e.a((Object)globalProductPurchasePackage.k, (Object)a2.a)) {
                for (final GlobalProductPurchasePackage globalProductPurchasePackage2 : list2) {
                    if (ng2.e.a((Object)globalProductPurchasePackage2.k, (Object)a2.b)) {
                        while (true) {
                            for (final Object next2 : list5) {
                                if (ng2.e.a((Object)((vz.e)next2).b(), (Object)a2.a)) {
                                    final vz.e e2 = (vz.e)next2;
                                    while (true) {
                                        for (final Object next3 : list5) {
                                            if (ng2.e.a((Object)((vz.e)next3).b(), (Object)a2.b)) {
                                                final vz.e e3 = (vz.e)next3;
                                                String s5;
                                                if (e2 == null || (s5 = e2.d()) == null) {
                                                    s5 = fetchSubscriptionPackagesUseCase2.g.a(Integer.parseInt(globalProductPurchasePackage.g));
                                                }
                                                String s6;
                                                if (e3 == null || (s6 = e3.d()) == null) {
                                                    s6 = fetchSubscriptionPackagesUseCase2.g.a(Integer.parseInt(globalProductPurchasePackage2.g));
                                                }
                                                Integer value2 = null;
                                                Label_1243: {
                                                    if (e2 != null) {
                                                        final long e4 = e2.e();
                                                        if (e3 != null) {
                                                            final long e5 = e3.e();
                                                            if (e4 >= 0L) {
                                                                final long n = 12 * e4;
                                                                Long value = (n - e5) * 100 / n;
                                                                if (value.longValue() <= 0L) {
                                                                    value = null;
                                                                }
                                                                if (value != null) {
                                                                    value2 = (int)(long)value;
                                                                    break Label_1243;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    value2 = null;
                                                }
                                                String format;
                                                if (value2 != null) {
                                                    format = NumberFormat.getPercentInstance().format(new Float(value2.intValue() / (float)100));
                                                }
                                                else {
                                                    format = null;
                                                }
                                                final List l = globalProductPurchasePackage.l;
                                                final ArrayList<i$b> list6 = new ArrayList<i$b>();
                                                for (final Object next4 : l) {
                                                    if (next4 instanceof i$b) {
                                                        list6.add((i$b)next4);
                                                    }
                                                }
                                                while (true) {
                                                    for (final i$b next5 : list6) {
                                                        if (ng2.e.a((Object)next5.f, (Object)"FirstTimeCoinsBonus")) {
                                                            final i$b i$b = next5;
                                                            final List i = globalProductPurchasePackage.l;
                                                            final ArrayList<i$a> list7 = new ArrayList<i$a>();
                                                            for (final Object next6 : i) {
                                                                if (next6 instanceof i$a) {
                                                                    list7.add((i$a)next6);
                                                                }
                                                            }
                                                            while (true) {
                                                                for (final i$a next7 : list7) {
                                                                    if (ng2.e.a((Object)next7.f, (Object)"Coins Drip")) {
                                                                        final i$a i$a = next7;
                                                                        final List k = globalProductPurchasePackage.l;
                                                                        final ArrayList<i$b> list8 = new ArrayList<i$b>();
                                                                        for (final Object next8 : k) {
                                                                            if (next8 instanceof i$b) {
                                                                                list8.add((i$b)next8);
                                                                            }
                                                                        }
                                                                        while (true) {
                                                                            for (final i$b next9 : list8) {
                                                                                if (ng2.e.a((Object)next9.f, (Object)"FirstTimeCoinsBonus")) {
                                                                                    final i$b i$b2 = next9;
                                                                                    final List l2 = globalProductPurchasePackage.l;
                                                                                    final ArrayList<i$a> list9 = new ArrayList<i$a>();
                                                                                    for (final Object next10 : l2) {
                                                                                        if (next10 instanceof i$a) {
                                                                                            list9.add((i$a)next10);
                                                                                        }
                                                                                    }
                                                                                    while (true) {
                                                                                        for (final i$a next11 : list9) {
                                                                                            if (ng2.e.a((Object)next11.f, (Object)"Coins Drip")) {
                                                                                                final i$a i$a2 = next11;
                                                                                                final boolean c2 = a2.c;
                                                                                                final String f = globalProductPurchasePackage.f;
                                                                                                final String a3 = a2.a;
                                                                                                int i2;
                                                                                                if (i$b != null) {
                                                                                                    i2 = i$b.i;
                                                                                                }
                                                                                                else {
                                                                                                    i2 = 0;
                                                                                                }
                                                                                                int i3;
                                                                                                if (i$a != null) {
                                                                                                    i3 = i$a.i;
                                                                                                }
                                                                                                else {
                                                                                                    i3 = 0;
                                                                                                }
                                                                                                final b b8 = new b(f, a3, s5, globalProductPurchasePackage, e, e2, i2, i3);
                                                                                                final String f2 = globalProductPurchasePackage2.f;
                                                                                                final String b9 = a2.b;
                                                                                                int i4;
                                                                                                if (i$b2 != null) {
                                                                                                    i4 = i$b2.i;
                                                                                                }
                                                                                                else {
                                                                                                    i4 = 0;
                                                                                                }
                                                                                                int i5;
                                                                                                if (i$a2 != null) {
                                                                                                    i5 = i$a2.i;
                                                                                                }
                                                                                                else {
                                                                                                    i5 = 0;
                                                                                                }
                                                                                                return new c.FetchSubscriptionPackagesUseCase$c$b(c2, b8, new b(f2, b9, s6, globalProductPurchasePackage2, e, e3, i4, i5), format, value2, e);
                                                                                            }
                                                                                        }
                                                                                        i$a next11 = null;
                                                                                        continue;
                                                                                    }
                                                                                }
                                                                            }
                                                                            i$b next9 = null;
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                                i$a next7 = null;
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    i$b next5 = null;
                                                    continue;
                                                }
                                            }
                                        }
                                        Object next3 = null;
                                        continue;
                                    }
                                }
                            }
                            Object next2 = null;
                            continue;
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
    
    public final Object b(final boolean b, final gg2.c<? super c> c) {
        return zi2.g.j((CoroutineContext)this.f.c(), (p)new FetchSubscriptionPackagesUseCase$execute$2(this, b, (gg2.c)null), c);
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        public final boolean c;
        
        public a(final String a, final String b, final boolean c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return ng2.e.a((Object)this.a, (Object)a.a) && ng2.e.a((Object)this.b, (Object)a.b) && this.c == a.c;
        }
        
        @Override
        public final int hashCode() {
            final int e = aq2.a.e(this.b, this.a.hashCode() * 31, 31);
            int c;
            if ((c = (this.c ? 1 : 0)) != 0) {
                c = 1;
            }
            return e + c;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("PackageIdInfo(monthlyPackageId=");
            t.append(this.a);
            t.append(", annualPackageId=");
            t.append(this.b);
            t.append(", isEligibleForFreeTrial=");
            return d.n(t, this.c, ')');
        }
    }
    
    public static final class b
    {
        public final String a;
        public final String b;
        public final String c;
        public final GlobalProductPurchasePackage d;
        public final kr0.e e;
        public final vz.e f;
        public final int g;
        public final int h;
        
        public b(final String a, final String b, final String c, final GlobalProductPurchasePackage d, final kr0.e e, final vz.e f, final int g, final int h) {
            e.f((Object)a, "id");
            e.f((Object)b, "sku");
            e.f((Object)c, "formattedPrice");
            e.f((Object)e, "globalProductOffer");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return ng2.e.a((Object)this.a, (Object)b.a) && ng2.e.a((Object)this.b, (Object)b.b) && ng2.e.a((Object)this.c, (Object)b.c) && ng2.e.a((Object)this.d, (Object)b.d) && ng2.e.a((Object)this.e, (Object)b.e) && ng2.e.a((Object)this.f, (Object)b.f) && this.g == b.g && this.h == b.h;
        }
        
        @Override
        public final int hashCode() {
            final int e = aq2.a.e(this.c, aq2.a.e(this.b, this.a.hashCode() * 31, 31), 31);
            final int hashCode = this.d.hashCode();
            final int hashCode2 = this.e.hashCode();
            final vz.e f = this.f;
            int hashCode3;
            if (f == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = f.hashCode();
            }
            return Integer.hashCode(this.h) + aq2.a.c(this.g, ((hashCode2 + (hashCode + e) * 31) * 31 + hashCode3) * 31, 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("PremiumSubscriptionPackage(id=");
            t.append(this.a);
            t.append(", sku=");
            t.append(this.b);
            t.append(", formattedPrice=");
            t.append(this.c);
            t.append(", globalProduct=");
            t.append(this.d);
            t.append(", globalProductOffer=");
            t.append(this.e);
            t.append(", skuDetails=");
            t.append(this.f);
            t.append(", signupCoins=");
            t.append(this.g);
            t.append(", periodicCoins=");
            return d.j(t, this.h, ')');
        }
    }
    
    public abstract static class c
    {
    }
}
