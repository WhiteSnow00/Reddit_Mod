// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.premium.usecase;

import androidx.appcompat.widget.s0;
import java.util.Iterator;
import java.util.NoSuchElementException;
import sr0.i$a;
import sr0.i$b;
import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Collection;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import kotlin.collections.builders.ListBuilder;
import com.reddit.gold.model.GlobalProductPurchasePackage;
import sr0.e;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import javax.inject.Inject;
import ah2.f;
import uz.c;
import db0.l;
import com.reddit.session.q;
import de0.a;

public final class FetchSubscriptionPackagesUseCase
{
    public final de0.a a;
    public final q b;
    public final l c;
    public final uz.c d;
    public final jw0.a e;
    public final e20.a f;
    public final ae0.a g;
    
    @Inject
    public FetchSubscriptionPackagesUseCase(final de0.a a, final q b, final l c, final uz.c d, final jw0.a e, final e20.a f, final ae0.a g) {
        ah2.f.f((Object)a, "premiumRepository");
        ah2.f.f((Object)b, "sessionManager");
        ah2.f.f((Object)c, "internalFeatures");
        ah2.f.f((Object)d, "billingManager");
        ah2.f.f((Object)e, "redditLogger");
        ah2.f.f((Object)f, "dispatcherProvider");
        ah2.f.f((Object)g, "currencyFormatter");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static final Object a(FetchSubscriptionPackagesUseCase fetchSubscriptionPackagesUseCase, boolean z$0, boolean z$2, final tg2.c c) {
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
        boolean z$3 = false;
        e e = null;
        FetchSubscriptionPackagesUseCase fetchSubscriptionPackagesUseCase2 = null;
        Object l = null;
        List list2 = null;
        Label_0631: {
            if (label2 != 0) {
                if (label2 != 1) {
                    if (label2 == 2) {
                        z$3 = fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.Z$0;
                        final List list = (List)fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$2;
                        e = (e)fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$1;
                        fetchSubscriptionPackagesUseCase2 = (FetchSubscriptionPackagesUseCase)fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$0;
                        aj2.c.Q0(o);
                        l = o;
                        list2 = list;
                        break Label_0631;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    z$2 = fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.Z$1;
                    z$0 = fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.Z$0;
                    fetchSubscriptionPackagesUseCase = (FetchSubscriptionPackagesUseCase)fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$0;
                    aj2.c.Q0(o);
                }
            }
            else {
                aj2.c.Q0(o);
                final de0.a a = fetchSubscriptionPackagesUseCase.a;
                fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$0 = fetchSubscriptionPackagesUseCase;
                fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.Z$0 = z$0;
                fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.Z$1 = z$2;
                fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.label = 1;
                o = a.f((tg2.c)fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final List list3 = (List)o;
            e l$1 = null;
            Label_0305: {
                if (list3 != null) {
                    while (true) {
                        for (final Object next : list3) {
                            if (f.a((Object)((e)next).f, (Object)"premium_econ_be")) {
                                l$1 = (e)next;
                                break Label_0305;
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
                    Label_0474: {
                        if (z$2 && !z$0) {
                            boolean b = false;
                            Label_0395: {
                                if (!m.isEmpty()) {
                                    final Iterator iterator2 = m.iterator();
                                    while (iterator2.hasNext()) {
                                        if (f.a((Object)((GlobalProductPurchasePackage)iterator2.next()).k, (Object)"com.reddit.premium_1_ft")) {
                                            b = true;
                                            break Label_0395;
                                        }
                                    }
                                }
                                b = false;
                            }
                            if (b) {
                                boolean b2 = false;
                                Label_0462: {
                                    if (!m.isEmpty()) {
                                        final Iterator iterator3 = m.iterator();
                                        while (iterator3.hasNext()) {
                                            if (f.a((Object)((GlobalProductPurchasePackage)iterator3.next()).k, (Object)"com.reddit.premium_2_ft")) {
                                                b2 = true;
                                                break Label_0462;
                                            }
                                        }
                                    }
                                    b2 = false;
                                }
                                if (b2) {
                                    z$3 = true;
                                    break Label_0474;
                                }
                            }
                        }
                        z$3 = false;
                    }
                    final ListBuilder listBuilder = new ListBuilder();
                    ((List<String>)listBuilder).add("com.reddit.premium_2");
                    ((List<String>)listBuilder).add("com.reddit.premium_1");
                    if (z$3) {
                        ((List<String>)listBuilder).add("com.reddit.premium_2_ft");
                        ((List<String>)listBuilder).add("com.reddit.premium_1_ft");
                    }
                    final List build = listBuilder.build();
                    fetchSubscriptionPackagesUseCase.c.g();
                    fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$0 = fetchSubscriptionPackagesUseCase;
                    fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$1 = l$1;
                    fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.L$2 = m;
                    fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.Z$0 = z$3;
                    fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1.label = 2;
                    l = g.l((CoroutineContext)fetchSubscriptionPackagesUseCase.f.b(), (p)new FetchSubscriptionPackagesUseCase$queryBillingManager$2(true, fetchSubscriptionPackagesUseCase, build, (tg2.c)null), (tg2.c)fetchSubscriptionPackagesUseCase$fetchPremiumPricePackages$1);
                    if (l == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    final List list4 = m;
                    final FetchSubscriptionPackagesUseCase fetchSubscriptionPackagesUseCase3 = fetchSubscriptionPackagesUseCase;
                    e = l$1;
                    list2 = list4;
                    fetchSubscriptionPackagesUseCase2 = fetchSubscriptionPackagesUseCase3;
                    break Label_0631;
                }
            }
            throw new IllegalStateException("No offer packages available.".toString());
        }
        final List list5 = (List)l;
        fetchSubscriptionPackagesUseCase2.getClass();
        String s3 = null;
        String s4 = null;
        boolean b6 = false;
        Label_0823: {
            if (z$3) {
                final boolean b3 = list5 instanceof Collection;
                boolean b4 = false;
                Label_0722: {
                    if (!b3 || !list5.isEmpty()) {
                        final Iterator iterator4 = list5.iterator();
                        while (iterator4.hasNext()) {
                            if (f.a((Object)((xz.e)iterator4.next()).b(), (Object)"com.reddit.premium_2_ft")) {
                                b4 = true;
                                break Label_0722;
                            }
                        }
                    }
                    b4 = false;
                }
                if (b4) {
                    boolean b5 = false;
                    Label_0795: {
                        if (!b3 || !list5.isEmpty()) {
                            final Iterator iterator5 = list5.iterator();
                            while (iterator5.hasNext()) {
                                if (f.a((Object)((xz.e)iterator5.next()).b(), (Object)"com.reddit.premium_1_ft")) {
                                    b5 = true;
                                    break Label_0795;
                                }
                            }
                        }
                        b5 = false;
                    }
                    if (b5) {
                        s3 = "com.reddit.premium_2_ft";
                        s4 = "com.reddit.premium_1_ft";
                        b6 = true;
                        break Label_0823;
                    }
                }
            }
            b6 = false;
            s4 = s2;
            s3 = s;
        }
        final a a2 = new a(s4, s3, b6);
        for (final GlobalProductPurchasePackage globalProductPurchasePackage : list2) {
            if (f.a((Object)globalProductPurchasePackage.k, (Object)a2.a)) {
                for (final GlobalProductPurchasePackage globalProductPurchasePackage2 : list2) {
                    if (f.a((Object)globalProductPurchasePackage2.k, (Object)a2.b)) {
                        while (true) {
                            for (final Object next2 : list5) {
                                if (f.a((Object)((xz.e)next2).b(), (Object)a2.a)) {
                                    final xz.e e2 = (xz.e)next2;
                                    while (true) {
                                        for (final Object next3 : list5) {
                                            if (f.a((Object)((xz.e)next3).b(), (Object)a2.b)) {
                                                final xz.e e3 = (xz.e)next3;
                                                String s5;
                                                if (e2 == null || (s5 = e2.d()) == null) {
                                                    s5 = fetchSubscriptionPackagesUseCase2.g.a(Integer.parseInt(globalProductPurchasePackage.g));
                                                }
                                                String s6;
                                                if (e3 == null || (s6 = e3.d()) == null) {
                                                    s6 = fetchSubscriptionPackagesUseCase2.g.a(Integer.parseInt(globalProductPurchasePackage2.g));
                                                }
                                                Integer value2 = null;
                                                Label_1235: {
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
                                                                    break Label_1235;
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
                                                final List i = globalProductPurchasePackage.l;
                                                final ArrayList<i$b> list6 = new ArrayList<i$b>();
                                                for (final Object next4 : i) {
                                                    if (next4 instanceof i$b) {
                                                        list6.add((i$b)next4);
                                                    }
                                                }
                                                while (true) {
                                                    for (final i$b next5 : list6) {
                                                        if (f.a((Object)next5.f, (Object)"FirstTimeCoinsBonus")) {
                                                            final i$b i$b = next5;
                                                            final List j = globalProductPurchasePackage.l;
                                                            final ArrayList<i$a> list7 = new ArrayList<i$a>();
                                                            for (final Object next6 : j) {
                                                                if (next6 instanceof i$a) {
                                                                    list7.add((i$a)next6);
                                                                }
                                                            }
                                                            while (true) {
                                                                for (final i$a next7 : list7) {
                                                                    if (f.a((Object)next7.f, (Object)"Coins Drip")) {
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
                                                                                if (f.a((Object)next9.f, (Object)"FirstTimeCoinsBonus")) {
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
                                                                                            if (f.a((Object)next11.f, (Object)"Coins Drip")) {
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
                                                                                                final b b7 = new b(f, a3, s5, globalProductPurchasePackage, e, e2, i2, i3);
                                                                                                final String f2 = globalProductPurchasePackage2.f;
                                                                                                final String b8 = a2.b;
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
                                                                                                return new c.FetchSubscriptionPackagesUseCase$c$b(c2, b7, new b(f2, b8, s6, globalProductPurchasePackage2, e, e3, i4, i5), format, value2, e);
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
    
    public final Object b(final boolean b, final tg2.c<? super c> c) {
        return mj2.g.l((CoroutineContext)this.f.c(), (p)new FetchSubscriptionPackagesUseCase$execute$2(this, b, (tg2.c)null), (tg2.c)c);
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
            return ah2.f.a((Object)this.a, (Object)a.a) && ah2.f.a((Object)this.b, (Object)a.b) && this.c == a.c;
        }
        
        @Override
        public final int hashCode() {
            final int f = ag0.a.f(this.b, this.a.hashCode() * 31, 31);
            int c;
            if ((c = (this.c ? 1 : 0)) != 0) {
                c = 1;
            }
            return f + c;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("PackageIdInfo(monthlyPackageId=");
            k.append(this.a);
            k.append(", annualPackageId=");
            k.append(this.b);
            k.append(", isEligibleForFreeTrial=");
            return s0.o(k, this.c, ')');
        }
    }
    
    public static final class b
    {
        public final String a;
        public final String b;
        public final String c;
        public final GlobalProductPurchasePackage d;
        public final e e;
        public final xz.e f;
        public final int g;
        public final int h;
        
        public b(final String a, final String b, final String c, final GlobalProductPurchasePackage d, final e e, final xz.e f, final int g, final int h) {
            f.f((Object)a, "id");
            f.f((Object)b, "sku");
            f.f((Object)c, "formattedPrice");
            f.f((Object)e, "globalProductOffer");
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
            return ah2.f.a((Object)this.a, (Object)b.a) && ah2.f.a((Object)this.b, (Object)b.b) && ah2.f.a((Object)this.c, (Object)b.c) && ah2.f.a((Object)this.d, (Object)b.d) && ah2.f.a((Object)this.e, (Object)b.e) && ah2.f.a((Object)this.f, (Object)b.f) && this.g == b.g && this.h == b.h;
        }
        
        @Override
        public final int hashCode() {
            final int f = ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31);
            final int hashCode = this.d.hashCode();
            final int hashCode2 = this.e.hashCode();
            final xz.e f2 = this.f;
            int hashCode3;
            if (f2 == null) {
                hashCode3 = 0;
            }
            else {
                hashCode3 = f2.hashCode();
            }
            return Integer.hashCode(this.h) + s0.e(this.g, ((hashCode2 + (hashCode + f) * 31) * 31 + hashCode3) * 31, 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("PremiumSubscriptionPackage(id=");
            k.append(this.a);
            k.append(", sku=");
            k.append(this.b);
            k.append(", formattedPrice=");
            k.append(this.c);
            k.append(", globalProduct=");
            k.append(this.d);
            k.append(", globalProductOffer=");
            k.append(this.e);
            k.append(", skuDetails=");
            k.append(this.f);
            k.append(", signupCoins=");
            k.append(this.g);
            k.append(", periodicCoins=");
            return d.k(k, this.h, ')');
        }
    }
    
    public abstract static class c
    {
    }
}
