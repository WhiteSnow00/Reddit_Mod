// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.coins.usecase;

import ej2.e0;
import ej2.f0;
import java.util.Iterator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.reddit.gold.model.GlobalProductPurchasePackage;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.CoroutineDispatcher;
import ej2.g;
import ig2.o;
import kotlin.collections.EmptyList;
import kr0.e;
import java.util.ArrayList;
import java.util.Collection;
import yd.b;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import kotlin.Metadata;
import sa0.a$b;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lsa0/a$b;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.domain.coins.usecase.FetchCoinsDataUseCase$fetchData$2", f = "FetchCoinsDataUseCase.kt", l = { 147, 161, 165, 173, 174, 175 }, m = "invokeSuspend")
final class FetchCoinsDataUseCase$fetchData$2 extends SuspendLambda implements p<b0, c<? super a$b>, Object>
{
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public final /* synthetic */ FetchCoinsDataUseCase this$0;
    
    public FetchCoinsDataUseCase$fetchData$2(final FetchCoinsDataUseCase this$0, final c<? super FetchCoinsDataUseCase$fetchData$2> c) {
        this.this$0 = this$0;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final FetchCoinsDataUseCase$fetchData$2 fetchCoinsDataUseCase$fetchData$2 = new FetchCoinsDataUseCase$fetchData$2(this.this$0, (c<? super FetchCoinsDataUseCase$fetchData$2>)c);
        fetchCoinsDataUseCase$fetchData$2.L$0 = l$0;
        return (c<j>)fetchCoinsDataUseCase$fetchData$2;
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super a$b> c) {
        return ((FetchCoinsDataUseCase$fetchData$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object instance) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        boolean b = false;
        List l$4 = null;
        String l$5 = null;
        String l$6 = null;
        Object l$7 = null;
        Object o3 = null;
        Object s6 = null;
        Label_1505: {
            List l$8 = null;
            String l$9 = null;
            Object l$10 = null;
            Object l$11 = null;
            Object l$12 = null;
            Object o5 = null;
            Object s8 = null;
            String l$13 = null;
            Label_1400: {
                Collection collection = null;
                Object l$14 = null;
                Object l$15 = null;
                Object o6 = null;
                Object o7 = null;
                Object o8 = null;
                Label_1244: {
                    Object l$16 = null;
                    Object c = null;
                    Object l$17 = null;
                    Object o9 = null;
                    Object a = null;
                    Label_1074: {
                        Object d = null;
                        b0 l$18 = null;
                        Label_0515: {
                            final boolean z$1;
                            final Object o;
                            final List list3;
                            final String s3;
                            final String s4;
                            final Object o2;
                            final Object s5;
                            switch (this.label) {
                                default: {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                case 6: {
                                    z$1 = this.Z$1;
                                    b = this.Z$0;
                                    final List list = (List)this.L$4;
                                    final String s = (String)this.L$3;
                                    final String s2 = (String)this.L$2;
                                    final List list2 = (List)this.L$1;
                                    o = this.L$0;
                                    yd.b.k0(instance);
                                    list3 = list;
                                    s3 = s;
                                    s4 = s2;
                                    o2 = list2;
                                    s5 = instance;
                                    break;
                                }
                                case 5: {
                                    b = this.Z$0;
                                    l$4 = (List)this.L$5;
                                    l$5 = (String)this.L$4;
                                    l$6 = (String)this.L$3;
                                    final List list4 = (List)this.L$2;
                                    l$7 = this.L$1;
                                    o3 = this.L$0;
                                    yd.b.k0(instance);
                                    final Object o4 = instance;
                                    instance = list4;
                                    s6 = o4;
                                    break Label_1505;
                                }
                                case 4: {
                                    l$8 = (List)this.L$6;
                                    final String s7 = (String)this.L$5;
                                    l$9 = (String)this.L$4;
                                    l$10 = this.L$3;
                                    l$11 = this.L$2;
                                    l$12 = this.L$1;
                                    o5 = this.L$0;
                                    yd.b.k0(instance);
                                    s8 = instance;
                                    l$13 = s7;
                                    break Label_1400;
                                }
                                case 3: {
                                    collection = (Collection)this.L$6;
                                    l$14 = this.L$5;
                                    l$15 = this.L$4;
                                    o6 = this.L$3;
                                    final List list5 = (List)this.L$2;
                                    o7 = this.L$1;
                                    l$11 = this.L$0;
                                    yd.b.k0(instance);
                                    o8 = instance;
                                    instance = list5;
                                    break Label_1244;
                                }
                                case 2: {
                                    l$16 = this.L$5;
                                    c = this.L$4;
                                    l$17 = this.L$3;
                                    o9 = this.L$2;
                                    final List list6 = (List)this.L$1;
                                    l$11 = this.L$0;
                                    yd.b.k0(instance);
                                    a = instance;
                                    instance = list6;
                                    break Label_1074;
                                }
                                case 1: {
                                    final b0 b2 = (b0)this.L$0;
                                    yd.b.k0(instance);
                                    d = instance;
                                    l$18 = b2;
                                    break Label_0515;
                                }
                                case 0: {
                                    yd.b.k0(instance);
                                    l$18 = (b0)this.L$0;
                                    final ir0.b a2 = this.this$0.a;
                                    this.L$0 = l$18;
                                    this.label = 1;
                                    if ((d = a2.d((c)this)) == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                    break Label_0515;
                                }
                            }
                            return new a$b((List)o, (List)o2, s4, s3, list3, b, z$1, (List)s5, FetchCoinsDataUseCase.g(this.this$0));
                        }
                        final List list7 = (List)d;
                        final ArrayList<e> l$19 = new ArrayList<e>();
                        for (final Object next : list7) {
                            if (cj2.j.F0(((e)next).f, "coinpack", true)) {
                                l$19.add((e)next);
                            }
                        }
                        final boolean empty = l$19.isEmpty();
                        final int n = 0;
                        int n2 = 0;
                        Label_0679: {
                            if (!empty) {
                                final Iterator<e> iterator2 = l$19.iterator();
                                while (iterator2.hasNext()) {
                                    final List m = iterator2.next().m;
                                    if (m != null && !m.isEmpty()) {
                                        n2 = n;
                                        break Label_0679;
                                    }
                                }
                            }
                            n2 = 1;
                        }
                        if (n2 != 0) {
                            throw new IllegalStateException("Packages are empty");
                        }
                        final ArrayList<e> l$20 = new ArrayList<e>();
                        for (final Object next2 : list7) {
                            if (cj2.j.F0(((e)next2).f, "premium_econ_be", true)) {
                                l$20.add((e)next2);
                            }
                        }
                        o9 = new ArrayList();
                        final Iterator<e> iterator4 = l$20.iterator();
                        while (iterator4.hasNext()) {
                            Object o10;
                            if ((o10 = iterator4.next().m) == null) {
                                o10 = EmptyList.INSTANCE;
                            }
                            o.j3((Iterable)o10, (Collection)o9);
                        }
                        final f0 c2 = g.c(l$18, (CoroutineDispatcher)null, (CoroutineStart)null, (p)new FetchCoinsDataUseCase$fetchData$2$deferredIsFreeAwardAvailable.FetchCoinsDataUseCase$fetchData$2$deferredIsFreeAwardAvailable$1(this.this$0, (c)null), 3);
                        c = g.c(l$18, (CoroutineDispatcher)null, (CoroutineStart)null, (p)new FetchCoinsDataUseCase$fetchData$2$deferredShowPointsPopup.FetchCoinsDataUseCase$fetchData$2$deferredShowPointsPopup$1(this.this$0, (c)null), 3);
                        final f0 c3 = g.c(l$18, (CoroutineDispatcher)null, (CoroutineStart)null, (p)new FetchCoinsDataUseCase$fetchData$2$deferredPointsBalances.FetchCoinsDataUseCase$fetchData$2$deferredPointsBalances$1(this.this$0, (c)null), 3);
                        final FetchCoinsDataUseCase this$0 = this.this$0;
                        final ArrayList list8 = new ArrayList();
                        final Iterator<e> iterator5 = l$19.iterator();
                        while (iterator5.hasNext()) {
                            final List i = iterator5.next().m;
                            if (i != null) {
                                final ArrayList<String> list9 = new ArrayList<String>();
                                final Iterator iterator6 = i.iterator();
                                while (true) {
                                    instance = list9;
                                    if (!iterator6.hasNext()) {
                                        break;
                                    }
                                    final String k = ((GlobalProductPurchasePackage)iterator6.next()).k;
                                    if (k == null) {
                                        continue;
                                    }
                                    list9.add(k);
                                }
                            }
                            else {
                                instance = EmptyList.INSTANCE;
                            }
                            o.j3((Iterable)instance, (Collection)list8);
                        }
                        this.L$0 = l$19;
                        this.L$1 = l$20;
                        this.L$2 = o9;
                        this.L$3 = c2;
                        this.L$4 = c;
                        this.L$5 = c3;
                        this.label = 2;
                        a = FetchCoinsDataUseCase.a(this$0, list8, (c)this);
                        if (a == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        instance = l$20;
                        l$11 = l$19;
                        l$17 = c2;
                        l$16 = c3;
                    }
                    final Collection l$21 = (Collection)a;
                    final FetchCoinsDataUseCase this$2 = this.this$0;
                    final ArrayList<String> list10 = new ArrayList<String>();
                    final Iterator iterator7 = ((Iterable)o9).iterator();
                    while (iterator7.hasNext()) {
                        final String j = ((GlobalProductPurchasePackage)iterator7.next()).k;
                        if (j != null) {
                            list10.add(j);
                        }
                    }
                    this.L$0 = l$11;
                    this.L$1 = instance;
                    this.L$2 = o9;
                    this.L$3 = l$17;
                    this.L$4 = c;
                    this.L$5 = l$16;
                    this.L$6 = l$21;
                    this.label = 3;
                    final Object d2 = FetchCoinsDataUseCase.d(this$2, (List)list10, (c)this);
                    if (d2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    final e0 e0 = (e0)l$16;
                    collection = l$21;
                    final Object o11 = o9;
                    l$15 = c;
                    o7 = instance;
                    o6 = l$17;
                    instance = o11;
                    l$14 = e0;
                    o8 = d2;
                }
                final ArrayList w3 = CollectionsKt___CollectionsKt.W3((Iterable)o8, collection);
                final e e2 = (e)CollectionsKt___CollectionsKt.C3((List)o7);
                String l;
                if (e2 != null) {
                    l = e2.i;
                }
                else {
                    l = null;
                }
                String l$22 = l;
                if (l == null) {
                    l$22 = "";
                }
                final String l2 = ((e)CollectionsKt___CollectionsKt.A3((List)l$11)).l;
                this.L$0 = l$15;
                this.L$1 = l$14;
                this.L$2 = l$11;
                this.L$3 = instance;
                this.L$4 = l$22;
                this.L$5 = l2;
                this.L$6 = w3;
                this.label = 4;
                s8 = ((e0)o6).s((c)this);
                if (s8 == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                final String s9 = l$22;
                o5 = l$15;
                l$12 = l$14;
                l$10 = instance;
                l$9 = s9;
                l$13 = l2;
                l$8 = w3;
            }
            b = (boolean)s8;
            this.L$0 = l$12;
            this.L$1 = l$11;
            this.L$2 = l$10;
            this.L$3 = l$9;
            this.L$4 = l$13;
            this.L$5 = l$8;
            this.L$6 = null;
            this.Z$0 = b;
            this.label = 5;
            s6 = ((e0)o5).s((c)this);
            if (s6 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            final Object o12 = l$10;
            l$5 = l$13;
            o3 = l$12;
            l$7 = l$11;
            instance = o12;
            l$6 = l$9;
            l$4 = l$8;
        }
        boolean z$1 = (boolean)s6;
        this.L$0 = l$7;
        this.L$1 = instance;
        this.L$2 = l$6;
        this.L$3 = l$5;
        this.L$4 = l$4;
        this.L$5 = null;
        this.Z$0 = b;
        this.Z$1 = z$1;
        this.label = 6;
        Object s5 = ((e0)o3).s((c)this);
        if (s5 == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        String s4 = l$6;
        Object o2 = instance;
        String s3 = l$5;
        List list3 = l$4;
        Object o = l$7;
        return new a$b((List)o, (List)o2, s4, s3, list3, b, z$1, (List)s5, FetchCoinsDataUseCase.g(this.this$0));
    }
}
