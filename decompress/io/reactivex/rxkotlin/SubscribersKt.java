// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.rxkotlin;

import io.reactivex.internal.operators.maybe.MaybeCallbackObserver;
import ff2.n;
import io.reactivex.internal.observers.ConsumerSingleObserver;
import ff2.c0;
import ff2.t;
import io.reactivex.internal.observers.CallbackCompletableObserver;
import sg2.e;
import dg2.b;
import dg2.c;
import io.reactivex.internal.functions.Functions;
import kf2.g;
import rg2.a;
import hg2.j;
import rg2.l;

public final class SubscribersKt
{
    public static final l<Object, j> a;
    public static final l<Throwable, j> b;
    public static final a<j> c;
    
    static {
        a = (l)SubscribersKt$onNextStub.SubscribersKt$onNextStub$1.INSTANCE;
        b = (l)SubscribersKt$onErrorStub.SubscribersKt$onErrorStub$1.INSTANCE;
        c = (a)SubscribersKt$onCompleteStub.SubscribersKt$onCompleteStub$1.INSTANCE;
    }
    
    public static final <T> g<T> a(final l<? super T, j> l) {
        Object d;
        if (l == SubscribersKt.a) {
            d = Functions.d;
        }
        else {
            Object o;
            if ((o = l) != null) {
                o = new c(l);
            }
            d = o;
        }
        return (g<T>)d;
    }
    
    public static final kf2.a b(final a<j> a) {
        Object c;
        if (a == SubscribersKt.c) {
            c = Functions.c;
        }
        else {
            Object o;
            if ((o = a) != null) {
                o = new b(a);
            }
            c = o;
        }
        return (kf2.a)c;
    }
    
    public static final g<Throwable> c(final l<? super Throwable, j> l) {
        Object e;
        if (l == SubscribersKt.b) {
            e = Functions.e;
        }
        else {
            Object o;
            if ((o = l) != null) {
                o = new c(l);
            }
            e = o;
        }
        return (g<Throwable>)e;
    }
    
    public static final if2.a d(final ff2.a a, final l<? super Throwable, j> l, final a<j> a2) {
        e.g((Object)a, "$this$subscribeBy");
        e.g((Object)l, "onError");
        e.g((Object)a2, "onComplete");
        final l<Throwable, j> b = SubscribersKt.b;
        Object o;
        if (l == b && a2 == SubscribersKt.c) {
            o = a.u();
        }
        else if (l == b) {
            final CallbackCompletableObserver callbackCompletableObserver = new CallbackCompletableObserver((kf2.a)new b(a2));
            a.b((ff2.c)callbackCompletableObserver);
            o = callbackCompletableObserver;
        }
        else {
            o = a.v((g)new c(l), b(a2));
        }
        return (if2.a)o;
    }
    
    public static final <T> if2.a e(final ff2.g<T> g, final l<? super Throwable, j> l, final a<j> a, final l<? super T, j> i) {
        e.g((Object)l, "onError");
        e.g((Object)a, "onComplete");
        e.g((Object)i, "onNext");
        final if2.a subscribe = g.subscribe(a(i), c(l), b(a));
        e.b((Object)subscribe, "subscribe(onNext.asConsu\u2026ete.asOnCompleteAction())");
        return subscribe;
    }
    
    public static final <T> if2.a f(final t<T> t, final l<? super Throwable, j> l, final a<j> a, final l<? super T, j> i) {
        e.g((Object)l, "onError");
        e.g((Object)a, "onComplete");
        e.g((Object)i, "onNext");
        final if2.a subscribe = t.subscribe((g)a((l<? super Object, j>)i), (g)c(l), b(a));
        e.b((Object)subscribe, "subscribe(onNext.asConsu\u2026ete.asOnCompleteAction())");
        return subscribe;
    }
    
    public static final ConsumerSingleObserver g(final c0 c0, final l l, final l i) {
        e.g((Object)c0, "$this$subscribeBy");
        e.g((Object)l, "onError");
        e.g((Object)i, "onSuccess");
        return (ConsumerSingleObserver)c0.F(a((l<? super T, j>)i), c(l));
    }
    
    public static final MaybeCallbackObserver h(final n n, final l l, final a a, final l i) {
        e.g((Object)l, "onError");
        e.g((Object)a, "onComplete");
        e.g((Object)i, "onSuccess");
        return (MaybeCallbackObserver)n.r((g)a(i), (g)c(l), b(a));
    }
}
