// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.coins.usecase;

import ej2.e0;
import java.util.Iterator;
import ej2.f0;
import java.util.ArrayList;
import ig2.m;
import com.reddit.gold.model.CoinPackage;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.CoroutineDispatcher;
import ej2.g;
import yd.b;
import com.reddit.gold.model.PurchasePackages;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import kotlin.Metadata;
import sa0.a$a;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lsa0/a$a;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.domain.coins.usecase.FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2", f = "FetchCoinsDataUseCase.kt", l = { 66, 68, 69, 77, 78, 79 }, m = "invokeSuspend")
final class FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2 extends SuspendLambda implements p<b0, c<? super a$a>, Object>
{
    public final /* synthetic */ String $correlationId;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public boolean Z$0;
    public boolean Z$1;
    public int label;
    public final /* synthetic */ FetchCoinsDataUseCase this$0;
    
    public FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2(final FetchCoinsDataUseCase this$0, final String $correlationId, final c<? super FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2> c) {
        this.this$0 = this$0;
        this.$correlationId = $correlationId;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2 fetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2 = new FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2(this.this$0, this.$correlationId, (c<? super FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2>)c);
        fetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2.L$0 = l$0;
        return (c<j>)fetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2;
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super a$a> c) {
        return ((FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        boolean b = false;
        PurchasePackages purchasePackages = null;
        String l$2 = null;
        List list2 = null;
        Object o2 = null;
        Label_0911: {
            String p = null;
            Object l$3 = null;
            Object o3 = null;
            Object s2 = null;
            Label_0837: {
                while (true) {
                    Object c = null;
                    Object l$5 = null;
                    PurchasePackages l$7 = null;
                    Object l$8 = null;
                    Object a = null;
                    Label_0624: {
                        Object c2 = null;
                        Object c3 = null;
                        Label_0493: {
                            final boolean z$1;
                            final String s;
                            final List list;
                            switch (this.label) {
                                default: {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                case 6: {
                                    z$1 = this.Z$1;
                                    b = this.Z$0;
                                    s = (String)this.L$2;
                                    list = (List)this.L$1;
                                    purchasePackages = (PurchasePackages)this.L$0;
                                    yd.b.k0(o);
                                    break;
                                }
                                case 5: {
                                    b = this.Z$0;
                                    l$2 = (String)this.L$3;
                                    list2 = (List)this.L$2;
                                    purchasePackages = (PurchasePackages)this.L$1;
                                    o2 = this.L$0;
                                    yd.b.k0(o);
                                    break Label_0911;
                                }
                                case 4: {
                                    p = (String)this.L$4;
                                    list2 = (List)this.L$3;
                                    purchasePackages = (PurchasePackages)this.L$2;
                                    l$3 = this.L$1;
                                    o3 = this.L$0;
                                    yd.b.k0(o);
                                    s2 = o;
                                    break Label_0837;
                                }
                                case 3: {
                                    final List list3 = (List)this.L$4;
                                    final PurchasePackages purchasePackages2 = (PurchasePackages)this.L$3;
                                    final Object l$4 = this.L$2;
                                    c = this.L$1;
                                    l$5 = this.L$0;
                                    yd.b.k0(o);
                                    final Object d = o;
                                    final PurchasePackages l$6 = purchasePackages2;
                                    final List list4 = list3;
                                    break Label_0270;
                                }
                                case 2: {
                                    l$7 = (PurchasePackages)this.L$3;
                                    l$8 = this.L$2;
                                    c = this.L$1;
                                    l$5 = this.L$0;
                                    yd.b.k0(o);
                                    a = o;
                                    break Label_0624;
                                }
                                case 1: {
                                    c2 = this.L$2;
                                    c = this.L$1;
                                    c3 = this.L$0;
                                    yd.b.k0(o);
                                    break Label_0493;
                                }
                                case 0: {
                                    yd.b.k0(o);
                                    final b0 b2 = (b0)this.L$0;
                                    final f0 c4 = g.c(b2, (CoroutineDispatcher)null, (CoroutineStart)null, (p)new FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2$deferredPurchasePackages.FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2$deferredPurchasePackages$1(this.this$0, this.$correlationId, (c)null), 3);
                                    c3 = g.c(b2, (CoroutineDispatcher)null, (CoroutineStart)null, (p)new FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2$deferredIsFreeAwardAvailable.FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2$deferredIsFreeAwardAvailable$1(this.this$0, (c)null), 3);
                                    c = g.c(b2, (CoroutineDispatcher)null, (CoroutineStart)null, (p)new FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2$deferredShowPointsPopup.FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2$deferredShowPointsPopup$1(this.this$0, (c)null), 3);
                                    c2 = g.c(b2, (CoroutineDispatcher)null, (CoroutineStart)null, (p)new FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2$deferredPointsBalances.FetchCoinsDataUseCase$fetchDataUsingGoogleLegacy$2$deferredPointsBalances$1(this.this$0, (c)null), 3);
                                    this.L$0 = c3;
                                    this.L$1 = c;
                                    this.L$2 = c2;
                                    this.label = 1;
                                    o = c4.s((c)this);
                                    if (o == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                    break Label_0493;
                                }
                            }
                            return new a$a(purchasePackages, s, list, b, z$1, (List)o, FetchCoinsDataUseCase.g(this.this$0));
                            final Object d;
                            final List list4;
                            final ArrayList w3 = CollectionsKt___CollectionsKt.W3((Iterable)d, (Collection)list4);
                            final PurchasePackages l$6;
                            final CoinPackage coinPackage = (CoinPackage)CollectionsKt___CollectionsKt.C3(l$6.b);
                            if (coinPackage != null) {
                                p = coinPackage.p;
                            }
                            else {
                                p = null;
                            }
                            this.L$0 = c;
                            final Object l$4;
                            this.L$1 = l$4;
                            this.L$2 = l$6;
                            this.L$3 = w3;
                            this.L$4 = p;
                            this.label = 4;
                            s2 = ((e0)l$5).s((c)this);
                            if (s2 == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            l$3 = l$4;
                            o3 = c;
                            purchasePackages = l$6;
                            list2 = w3;
                            break Label_0837;
                        }
                        final PurchasePackages l$9 = (PurchasePackages)o;
                        final List b3 = l$9.b;
                        final ArrayList list5 = new ArrayList<String>(m.c3((Iterable)b3, 10));
                        final Iterator iterator = b3.iterator();
                        while (iterator.hasNext()) {
                            list5.add(((CoinPackage)iterator.next()).l);
                        }
                        final FetchCoinsDataUseCase this$0 = this.this$0;
                        this.L$0 = c3;
                        this.L$1 = c;
                        this.L$2 = c2;
                        this.L$3 = l$9;
                        this.label = 2;
                        a = FetchCoinsDataUseCase.a(this$0, list5, (c)this);
                        if (a == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        l$8 = c2;
                        l$5 = c3;
                        l$7 = l$9;
                    }
                    final List l$10 = (List)a;
                    final FetchCoinsDataUseCase this$2 = this.this$0;
                    final List s3 = lw0.b.s1((Object[])new String[] { "com.reddit.premium_1", "com.reddit.premium_2" });
                    this.L$0 = l$5;
                    this.L$1 = c;
                    this.L$2 = l$8;
                    this.L$3 = l$7;
                    this.L$4 = l$10;
                    this.label = 3;
                    final Object d = FetchCoinsDataUseCase.d(this$2, s3, (c)this);
                    if (d == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    final e0 e0 = (e0)l$8;
                    final PurchasePackages purchasePackages3 = l$7;
                    final List list4 = l$10;
                    final Object l$4 = e0;
                    final PurchasePackages l$6 = purchasePackages3;
                    continue;
                }
            }
            b = (boolean)s2;
            this.L$0 = l$3;
            this.L$1 = purchasePackages;
            this.L$2 = list2;
            this.L$3 = p;
            this.L$4 = null;
            this.Z$0 = b;
            this.label = 5;
            o = ((e0)o3).s((c)this);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o2 = l$3;
            l$2 = p;
        }
        boolean z$1 = (boolean)o;
        this.L$0 = purchasePackages;
        this.L$1 = list2;
        this.L$2 = l$2;
        this.L$3 = null;
        this.Z$0 = b;
        this.Z$1 = z$1;
        this.label = 6;
        o = ((e0)o2).s((c)this);
        if (o == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        final List list6 = list2;
        String s = l$2;
        List list = list6;
        return new a$a(purchasePackages, s, list, b, z$1, (List)o, FetchCoinsDataUseCase.g(this.this$0));
    }
}
