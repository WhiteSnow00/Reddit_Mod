// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.vault.coins;

import ig2.w;
import ba2.d;
import java.util.Iterator;
import java.util.List;
import y82.f;
import ab2.g;
import java.util.ArrayList;
import ig2.m;
import lg.e0;
import yg2.i;
import x82.y;
import x82.k0;
import ab2.a$a;
import com.reddit.vault.feature.errors.ErrorScreen$a;
import ab2.g$a;
import com.reddit.vault.navigation.NavStyle;
import com.reddit.vault.data.analytics.Noun;
import e92.c$a;
import x82.h;
import hj2.e;
import java.math.BigInteger;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.vault.coins.PurchaseCoinsPresenter$loadData$1", f = "PurchaseCoinsPresenter.kt", l = { 80, 84, 95, 99, 109 }, m = "invokeSuspend")
final class PurchaseCoinsPresenter$loadData$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ a this$0;
    
    public PurchaseCoinsPresenter$loadData$1(final a this$0, final c<? super PurchaseCoinsPresenter$loadData$1> c) {
        this.this$0 = this$0;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final PurchaseCoinsPresenter$loadData$1 purchaseCoinsPresenter$loadData$1 = new PurchaseCoinsPresenter$loadData$1(this.this$0, (c<? super PurchaseCoinsPresenter$loadData$1>)c);
        purchaseCoinsPresenter$loadData$1.L$0 = l$0;
        return (c<j>)purchaseCoinsPresenter$loadData$1;
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((PurchaseCoinsPresenter$loadData$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object v) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        a a = null;
        BigInteger bigInteger = null;
        Object w1 = null;
        Label_0568: {
            b0 l$3 = null;
            Label_0479: {
                b0 l$2 = null;
                Label_0422: {
                    a this$0 = null;
                    b0 l$0 = null;
                    Label_0276: {
                        b0 b4;
                        if (label != 0) {
                            if (label != 1) {
                                if (label == 2) {
                                    this$0 = (a)this.L$1;
                                    l$0 = (b0)this.L$0;
                                    b.k0(v);
                                    break Label_0276;
                                }
                                if (label == 3) {
                                    final b0 b0 = (b0)this.L$0;
                                    b.k0(v);
                                    l$2 = b0;
                                    break Label_0422;
                                }
                                if (label == 4) {
                                    l$3 = (b0)this.L$0;
                                    b.k0(v);
                                    break Label_0479;
                                }
                                if (label == 5) {
                                    a = (a)this.L$2;
                                    bigInteger = (BigInteger)this.L$1;
                                    final b0 b2 = (b0)this.L$0;
                                    b.k0(v);
                                    w1 = v;
                                    break Label_0568;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                final b0 b3 = (b0)this.L$0;
                                b.k0(v);
                                b4 = b3;
                            }
                        }
                        else {
                            b.k0(v);
                            b4 = (b0)this.L$0;
                            final y82.c l = this.this$0.l;
                            this.L$0 = b4;
                            this.label = 1;
                            if (l.d((c<? super Boolean>)this) == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                        }
                        this$0 = this.this$0;
                        final PurchaseCoinsPresenter$loadData$1$invokeSuspend$$inlined$map.PurchaseCoinsPresenter$loadData$1$invokeSuspend$$inlined$map$1 purchaseCoinsPresenter$loadData$1$invokeSuspend$$inlined$map$1 = new PurchaseCoinsPresenter$loadData$1$invokeSuspend$$inlined$map.PurchaseCoinsPresenter$loadData$1$invokeSuspend$$inlined$map$1((e)this$0.l.c(), this.this$0);
                        this.L$0 = b4;
                        this.L$1 = this$0;
                        this.label = 2;
                        final Object x = kotlinx.coroutines.flow.a.x((e)purchaseCoinsPresenter$loadData$1$invokeSuspend$$inlined$map$1, (c)this);
                        if (x == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        l$0 = b4;
                        v = x;
                    }
                    final h u = (h)v;
                    if (u == null) {
                        final g r = this.this$0.r;
                        final e92.c.b j = e92.c.j;
                        g$a.a(r, c$a.b((Exception)new CommunityNotFoundException(), (Noun)null, 6), (ErrorScreen$a)null, NavStyle.REPLACE_TOP, (a$a)null, 10);
                        return hg2.j.a;
                    }
                    this$0.u = u;
                    final a this$2 = this.this$0;
                    final fb2.m n = this$2.n;
                    final h u2 = this$2.u;
                    if (u2 == null) {
                        sg2.e.n("community");
                        throw null;
                    }
                    this$2.s = n.b(2131953590, new Object[] { u2.l });
                    final f m = this.this$0.m;
                    this.L$0 = l$0;
                    this.L$1 = null;
                    this.label = 3;
                    if (m.i(false, (c<? super Boolean>)this) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    l$2 = l$0;
                }
                final PurchaseCoinsPresenter$loadData$1$invokeSuspend$$inlined$map.PurchaseCoinsPresenter$loadData$1$invokeSuspend$$inlined$map$2 purchaseCoinsPresenter$loadData$1$invokeSuspend$$inlined$map$2 = new PurchaseCoinsPresenter$loadData$1$invokeSuspend$$inlined$map.PurchaseCoinsPresenter$loadData$1$invokeSuspend$$inlined$map$2((e)this.this$0.m.b(), this.this$0);
                this.L$0 = l$2;
                this.label = 4;
                final Object x2 = kotlinx.coroutines.flow.a.x((e)purchaseCoinsPresenter$loadData$1$invokeSuspend$$inlined$map$2, (c)this);
                l$3 = l$2;
                v = x2;
                if (x2 == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final k0 k0 = (k0)v;
            if (k0 != null) {
                final BigInteger h = k0.h;
                if (h != null) {
                    final a this$3 = this.this$0;
                    final com.reddit.vault.e o = this$3.o;
                    final String b5 = this$3.j.b;
                    this.L$0 = l$3;
                    this.L$1 = h;
                    this.L$2 = this$3;
                    this.label = 5;
                    w1 = o.w1(b5, (c)this);
                    if (w1 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    bigInteger = h;
                    a = this$3;
                    break Label_0568;
                }
            }
            g$a.a(this.this$0.r, (e92.c)e92.c.m, (ErrorScreen$a)null, NavStyle.REPLACE_TOP, (a$a)null, 10);
            return j.a;
        }
        final y w2 = (y)w1;
        if (w2 == null) {
            g$a.a(this.this$0.r, (e92.c)e92.c.n, (ErrorScreen$a)null, NavStyle.REPLACE_TOP, (a$a)null, 10);
            return j.a;
        }
        a.w = w2;
        final y w3 = this.this$0.w;
        if (w3 == null) {
            sg2.e.n("coinsPackage");
            throw null;
        }
        final BigInteger divide = bigInteger.divide(w3.c);
        sg2.e.e((Object)divide, "this.divide(other)");
        final int intValue = divide.intValue();
        final a this$4 = this.this$0;
        final yg2.g l2 = e0.l0(new i(0, Math.min(intValue, 5000)), 50);
        v = new ArrayList(m.c3((Iterable)l2, 10));
        final yg2.h e = l2.e();
        while (e.h) {
            ((ArrayList<Integer>)v).add(new Integer(Math.max(1, ((w)e).nextInt())));
        }
        this$4.v = (List)v;
        final a this$5 = this.this$0;
        final List v2 = this$5.v;
        if (v2 != null) {
            final Iterator iterator = v2.iterator();
            int n2 = 0;
            while (true) {
                while (iterator.hasNext()) {
                    if (((Number)iterator.next()).intValue() >= 100) {
                        int y = n2;
                        if (n2 < 0) {
                            y = 0;
                        }
                        this$5.y = y;
                        final List v3 = this.this$0.v;
                        if (v3 == null) {
                            sg2.e.n("coinSteps");
                            throw null;
                        }
                        final BigInteger value = BigInteger.valueOf(v3.get(0).intValue());
                        sg2.e.e((Object)value, "valueOf(this.toLong())");
                        final y w4 = this.this$0.w;
                        if (w4 == null) {
                            sg2.e.n("coinsPackage");
                            throw null;
                        }
                        final BigInteger multiply = value.multiply(w4.c);
                        sg2.e.e((Object)multiply, "this.multiply(other)");
                        if (bigInteger.compareTo(multiply) < 0) {
                            g$a.a(this.this$0.r, (e92.c)e92.c.m, (ErrorScreen$a)null, NavStyle.REPLACE_TOP, (a$a)null, 10);
                            return j.a;
                        }
                        final a this$6 = this.this$0;
                        final List v4 = this$6.v;
                        if (v4 == null) {
                            sg2.e.n("coinSteps");
                            throw null;
                        }
                        final BigInteger value2 = BigInteger.valueOf(v4.get(this$6.y).intValue());
                        sg2.e.e((Object)value2, "valueOf(this.toLong())");
                        final y w5 = this.this$0.w;
                        if (w5 == null) {
                            sg2.e.n("coinsPackage");
                            throw null;
                        }
                        final BigInteger multiply2 = value2.multiply(w5.c);
                        sg2.e.e((Object)multiply2, "this.multiply(other)");
                        if (bigInteger.compareTo(multiply2) < 0) {
                            this.this$0.y = 0;
                        }
                        final a this$7 = this.this$0;
                        final ba2.d i = this$7.k;
                        final String s = this$7.s;
                        final h u3 = this$7.u;
                        if (u3 != null) {
                            String s2;
                            if ((s2 = u3.n) == null) {
                                s2 = u3.m;
                            }
                            i.Fm(s, s2);
                            this.this$0.Dc();
                            this.this$0.x = true;
                            return j.a;
                        }
                        sg2.e.n("community");
                        throw null;
                    }
                    else {
                        ++n2;
                    }
                }
                n2 = -1;
                continue;
            }
        }
        sg2.e.n("coinSteps");
        throw null;
    }
}
