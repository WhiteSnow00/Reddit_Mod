// 
// Decompiled by Procyon v0.6.0
// 

package io.reactivex.plugins;

import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.internal.schedulers.b;
import wf2.d;
import java.util.concurrent.ThreadFactory;
import io.reactivex.internal.util.ExceptionHelper;
import ff2.e0;
import ff2.c0;
import ff2.a0;
import ff2.t;
import ff2.p;
import ff2.n;
import java.util.concurrent.Callable;
import ff2.b0;
import kf2.c;
import ff2.a;
import kf2.o;
import kf2.e;
import kf2.g;

public final class RxJavaPlugins
{
    public static volatile g<? super Throwable> errorHandler;
    public static volatile boolean failNonBlockingScheduler;
    public static volatile boolean lockdown;
    public static volatile e onBeforeBlocking;
    public static volatile o<? super a, ? extends a> onCompletableAssembly;
    public static volatile c<? super a, ? super ff2.c, ? extends ff2.c> onCompletableSubscribe;
    public static volatile o<? super b0, ? extends b0> onComputationHandler;
    public static volatile o<? super jf2.a, ? extends jf2.a> onConnectableFlowableAssembly;
    public static volatile o<? super zf2.a, ? extends zf2.a> onConnectableObservableAssembly;
    public static volatile o<? super ff2.g, ? extends ff2.g> onFlowableAssembly;
    public static volatile c<? super ff2.g, ? super qt2.c, ? extends qt2.c> onFlowableSubscribe;
    public static volatile o<? super Callable<b0>, ? extends b0> onInitComputationHandler;
    public static volatile o<? super Callable<b0>, ? extends b0> onInitIoHandler;
    public static volatile o<? super Callable<b0>, ? extends b0> onInitNewThreadHandler;
    public static volatile o<? super Callable<b0>, ? extends b0> onInitSingleHandler;
    public static volatile o<? super b0, ? extends b0> onIoHandler;
    public static volatile o<? super n, ? extends n> onMaybeAssembly;
    public static volatile c<? super n, ? super p, ? extends p> onMaybeSubscribe;
    public static volatile o<? super b0, ? extends b0> onNewThreadHandler;
    public static volatile o<? super t, ? extends t> onObservableAssembly;
    public static volatile c<? super t, ? super a0, ? extends a0> onObservableSubscribe;
    public static volatile o<? super bg2.a, ? extends bg2.a> onParallelAssembly;
    public static volatile o<? super Runnable, ? extends Runnable> onScheduleHandler;
    public static volatile o<? super c0, ? extends c0> onSingleAssembly;
    public static volatile o<? super b0, ? extends b0> onSingleHandler;
    public static volatile c<? super c0, ? super e0, ? extends e0> onSingleSubscribe;
    
    private RxJavaPlugins() {
        throw new IllegalStateException("No instances!");
    }
    
    public static <T, U, R> R apply(final c<T, U, R> c, final T t, final U u) {
        try {
            return (R)c.apply((Object)t, (Object)u);
        }
        finally {
            final Throwable t2;
            throw ExceptionHelper.d(t2);
        }
    }
    
    public static <T, R> R apply(final o<T, R> o, final T t) {
        try {
            return (R)o.apply((Object)t);
        }
        finally {
            final Throwable t2;
            throw ExceptionHelper.d(t2);
        }
    }
    
    public static b0 applyRequireNonNull(final o<? super Callable<b0>, ? extends b0> o, final Callable<b0> callable) {
        final b0 apply = apply(o, callable);
        mf2.a.b((Object)apply, "Scheduler Callable result can't be null");
        return apply;
    }
    
    public static b0 callRequireNonNull(final Callable<b0> callable) {
        try {
            final b0 call = callable.call();
            mf2.a.b((Object)call, "Scheduler Callable result can't be null");
            return call;
        }
        finally {
            final Throwable t;
            throw ExceptionHelper.d(t);
        }
    }
    
    public static b0 createComputationScheduler(final ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new io.reactivex.internal.schedulers.a(threadFactory);
        }
        throw new NullPointerException("threadFactory is null");
    }
    
    public static b0 createIoScheduler(final ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new d(threadFactory);
        }
        throw new NullPointerException("threadFactory is null");
    }
    
    public static b0 createNewThreadScheduler(final ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new wf2.e(threadFactory);
        }
        throw new NullPointerException("threadFactory is null");
    }
    
    public static b0 createSingleScheduler(final ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new b(threadFactory);
        }
        throw new NullPointerException("threadFactory is null");
    }
    
    public static o<? super b0, ? extends b0> getComputationSchedulerHandler() {
        return RxJavaPlugins.onComputationHandler;
    }
    
    public static g<? super Throwable> getErrorHandler() {
        return RxJavaPlugins.errorHandler;
    }
    
    public static o<? super Callable<b0>, ? extends b0> getInitComputationSchedulerHandler() {
        return RxJavaPlugins.onInitComputationHandler;
    }
    
    public static o<? super Callable<b0>, ? extends b0> getInitIoSchedulerHandler() {
        return RxJavaPlugins.onInitIoHandler;
    }
    
    public static o<? super Callable<b0>, ? extends b0> getInitNewThreadSchedulerHandler() {
        return RxJavaPlugins.onInitNewThreadHandler;
    }
    
    public static o<? super Callable<b0>, ? extends b0> getInitSingleSchedulerHandler() {
        return RxJavaPlugins.onInitSingleHandler;
    }
    
    public static o<? super b0, ? extends b0> getIoSchedulerHandler() {
        return RxJavaPlugins.onIoHandler;
    }
    
    public static o<? super b0, ? extends b0> getNewThreadSchedulerHandler() {
        return RxJavaPlugins.onNewThreadHandler;
    }
    
    public static e getOnBeforeBlocking() {
        return RxJavaPlugins.onBeforeBlocking;
    }
    
    public static o<? super a, ? extends a> getOnCompletableAssembly() {
        return RxJavaPlugins.onCompletableAssembly;
    }
    
    public static c<? super a, ? super ff2.c, ? extends ff2.c> getOnCompletableSubscribe() {
        return RxJavaPlugins.onCompletableSubscribe;
    }
    
    public static o<? super jf2.a, ? extends jf2.a> getOnConnectableFlowableAssembly() {
        return RxJavaPlugins.onConnectableFlowableAssembly;
    }
    
    public static o<? super zf2.a, ? extends zf2.a> getOnConnectableObservableAssembly() {
        return RxJavaPlugins.onConnectableObservableAssembly;
    }
    
    public static o<? super ff2.g, ? extends ff2.g> getOnFlowableAssembly() {
        return RxJavaPlugins.onFlowableAssembly;
    }
    
    public static c<? super ff2.g, ? super qt2.c, ? extends qt2.c> getOnFlowableSubscribe() {
        return RxJavaPlugins.onFlowableSubscribe;
    }
    
    public static o<? super n, ? extends n> getOnMaybeAssembly() {
        return RxJavaPlugins.onMaybeAssembly;
    }
    
    public static c<? super n, ? super p, ? extends p> getOnMaybeSubscribe() {
        return RxJavaPlugins.onMaybeSubscribe;
    }
    
    public static o<? super t, ? extends t> getOnObservableAssembly() {
        return RxJavaPlugins.onObservableAssembly;
    }
    
    public static c<? super t, ? super a0, ? extends a0> getOnObservableSubscribe() {
        return RxJavaPlugins.onObservableSubscribe;
    }
    
    public static o<? super bg2.a, ? extends bg2.a> getOnParallelAssembly() {
        return RxJavaPlugins.onParallelAssembly;
    }
    
    public static o<? super c0, ? extends c0> getOnSingleAssembly() {
        return RxJavaPlugins.onSingleAssembly;
    }
    
    public static c<? super c0, ? super e0, ? extends e0> getOnSingleSubscribe() {
        return RxJavaPlugins.onSingleSubscribe;
    }
    
    public static o<? super Runnable, ? extends Runnable> getScheduleHandler() {
        return RxJavaPlugins.onScheduleHandler;
    }
    
    public static o<? super b0, ? extends b0> getSingleSchedulerHandler() {
        return RxJavaPlugins.onSingleHandler;
    }
    
    public static b0 initComputationScheduler(final Callable<b0> callable) {
        if (callable == null) {
            throw new NullPointerException("Scheduler Callable can't be null");
        }
        final o<? super Callable<b0>, ? extends b0> onInitComputationHandler = RxJavaPlugins.onInitComputationHandler;
        if (onInitComputationHandler == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(onInitComputationHandler, callable);
    }
    
    public static b0 initIoScheduler(final Callable<b0> callable) {
        if (callable == null) {
            throw new NullPointerException("Scheduler Callable can't be null");
        }
        final o<? super Callable<b0>, ? extends b0> onInitIoHandler = RxJavaPlugins.onInitIoHandler;
        if (onInitIoHandler == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(onInitIoHandler, callable);
    }
    
    public static b0 initNewThreadScheduler(final Callable<b0> callable) {
        if (callable == null) {
            throw new NullPointerException("Scheduler Callable can't be null");
        }
        final o<? super Callable<b0>, ? extends b0> onInitNewThreadHandler = RxJavaPlugins.onInitNewThreadHandler;
        if (onInitNewThreadHandler == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(onInitNewThreadHandler, callable);
    }
    
    public static b0 initSingleScheduler(final Callable<b0> callable) {
        if (callable == null) {
            throw new NullPointerException("Scheduler Callable can't be null");
        }
        final o<? super Callable<b0>, ? extends b0> onInitSingleHandler = RxJavaPlugins.onInitSingleHandler;
        if (onInitSingleHandler == null) {
            return callRequireNonNull(callable);
        }
        return applyRequireNonNull(onInitSingleHandler, callable);
    }
    
    public static boolean isBug(final Throwable t) {
        return t instanceof OnErrorNotImplementedException || t instanceof MissingBackpressureException || t instanceof IllegalStateException || t instanceof NullPointerException || t instanceof IllegalArgumentException || t instanceof CompositeException;
    }
    
    public static boolean isFailOnNonBlockingScheduler() {
        return RxJavaPlugins.failNonBlockingScheduler;
    }
    
    public static boolean isLockdown() {
        return RxJavaPlugins.lockdown;
    }
    
    public static void lockdown() {
        RxJavaPlugins.lockdown = true;
    }
    
    public static <T> bg2.a<T> onAssembly(final bg2.a<T> a) {
        final o<? super bg2.a, ? extends bg2.a> onParallelAssembly = RxJavaPlugins.onParallelAssembly;
        bg2.a a2 = a;
        if (onParallelAssembly != null) {
            a2 = apply((kf2.o<bg2.a<T>, bg2.a>)onParallelAssembly, a);
        }
        return (bg2.a<T>)a2;
    }
    
    public static a onAssembly(final a a) {
        final o<? super a, ? extends a> onCompletableAssembly = RxJavaPlugins.onCompletableAssembly;
        a a2 = a;
        if (onCompletableAssembly != null) {
            a2 = apply(onCompletableAssembly, a);
        }
        return a2;
    }
    
    public static <T> c0<T> onAssembly(final c0<T> c0) {
        final o<? super c0, ? extends c0> onSingleAssembly = RxJavaPlugins.onSingleAssembly;
        c0<T> c2 = c0;
        if (onSingleAssembly != null) {
            c2 = apply(onSingleAssembly, c0);
        }
        return c2;
    }
    
    public static <T> ff2.g<T> onAssembly(final ff2.g<T> g) {
        final o<? super ff2.g, ? extends ff2.g> onFlowableAssembly = RxJavaPlugins.onFlowableAssembly;
        ff2.g<T> g2 = g;
        if (onFlowableAssembly != null) {
            g2 = apply(onFlowableAssembly, g);
        }
        return g2;
    }
    
    public static <T> n<T> onAssembly(final n<T> n) {
        final o<? super n, ? extends n> onMaybeAssembly = RxJavaPlugins.onMaybeAssembly;
        n n2 = n;
        if (onMaybeAssembly != null) {
            n2 = apply((kf2.o<n<T>, n>)onMaybeAssembly, n);
        }
        return (n<T>)n2;
    }
    
    public static <T> t<T> onAssembly(final t<T> t) {
        final o<? super t, ? extends t> onObservableAssembly = RxJavaPlugins.onObservableAssembly;
        t t2 = t;
        if (onObservableAssembly != null) {
            t2 = apply((kf2.o<t<T>, t>)onObservableAssembly, t);
        }
        return (t<T>)t2;
    }
    
    public static <T> jf2.a<T> onAssembly(final jf2.a<T> a) {
        final o<? super jf2.a, ? extends jf2.a> onConnectableFlowableAssembly = RxJavaPlugins.onConnectableFlowableAssembly;
        jf2.a a2 = a;
        if (onConnectableFlowableAssembly != null) {
            a2 = apply((kf2.o<jf2.a<T>, jf2.a>)onConnectableFlowableAssembly, a);
        }
        return (jf2.a<T>)a2;
    }
    
    public static <T> zf2.a<T> onAssembly(final zf2.a<T> a) {
        final o<? super zf2.a, ? extends zf2.a> onConnectableObservableAssembly = RxJavaPlugins.onConnectableObservableAssembly;
        zf2.a a2 = a;
        if (onConnectableObservableAssembly != null) {
            a2 = apply((kf2.o<zf2.a<T>, zf2.a>)onConnectableObservableAssembly, a);
        }
        return (zf2.a<T>)a2;
    }
    
    public static boolean onBeforeBlocking() {
        final e onBeforeBlocking = RxJavaPlugins.onBeforeBlocking;
        if (onBeforeBlocking != null) {
            try {
                return onBeforeBlocking.getAsBoolean();
            }
            finally {
                final Throwable t;
                throw ExceptionHelper.d(t);
            }
        }
        return false;
    }
    
    public static b0 onComputationScheduler(final b0 b0) {
        final o<? super b0, ? extends b0> onComputationHandler = RxJavaPlugins.onComputationHandler;
        if (onComputationHandler == null) {
            return b0;
        }
        return apply(onComputationHandler, b0);
    }
    
    public static void onError(final Throwable t) {
        final g<? super Throwable> errorHandler = RxJavaPlugins.errorHandler;
        Throwable t2;
        if (t == null) {
            t2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        else {
            t2 = t;
            if (!isBug(t)) {
                t2 = new UndeliverableException(t);
            }
        }
        if (errorHandler != null) {
            try {
                errorHandler.accept((Object)t2);
                return;
            }
            finally {
                t.printStackTrace();
                uncaught(t);
            }
        }
        t2.printStackTrace();
        uncaught(t2);
    }
    
    public static b0 onIoScheduler(final b0 b0) {
        final o<? super b0, ? extends b0> onIoHandler = RxJavaPlugins.onIoHandler;
        if (onIoHandler == null) {
            return b0;
        }
        return apply(onIoHandler, b0);
    }
    
    public static b0 onNewThreadScheduler(final b0 b0) {
        final o<? super b0, ? extends b0> onNewThreadHandler = RxJavaPlugins.onNewThreadHandler;
        if (onNewThreadHandler == null) {
            return b0;
        }
        return apply(onNewThreadHandler, b0);
    }
    
    public static Runnable onSchedule(final Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("run is null");
        }
        final o<? super Runnable, ? extends Runnable> onScheduleHandler = RxJavaPlugins.onScheduleHandler;
        if (onScheduleHandler == null) {
            return runnable;
        }
        return apply(onScheduleHandler, runnable);
    }
    
    public static b0 onSingleScheduler(final b0 b0) {
        final o<? super b0, ? extends b0> onSingleHandler = RxJavaPlugins.onSingleHandler;
        if (onSingleHandler == null) {
            return b0;
        }
        return apply(onSingleHandler, b0);
    }
    
    public static <T> a0<? super T> onSubscribe(final t<T> t, final a0<? super T> a0) {
        final c<? super t, ? super a0, ? extends a0> onObservableSubscribe = RxJavaPlugins.onObservableSubscribe;
        if (onObservableSubscribe != null) {
            return (a0<? super T>)apply((kf2.c<t<T>, a0<? super T>, a0>)onObservableSubscribe, t, a0);
        }
        return a0;
    }
    
    public static ff2.c onSubscribe(final a a, final ff2.c c) {
        final c<? super a, ? super ff2.c, ? extends ff2.c> onCompletableSubscribe = RxJavaPlugins.onCompletableSubscribe;
        if (onCompletableSubscribe != null) {
            return apply(onCompletableSubscribe, a, c);
        }
        return c;
    }
    
    public static <T> e0<? super T> onSubscribe(final c0<T> c0, final e0<? super T> e0) {
        final c<? super c0, ? super e0, ? extends e0> onSingleSubscribe = RxJavaPlugins.onSingleSubscribe;
        if (onSingleSubscribe != null) {
            return (e0<? super T>)apply((kf2.c<c0<T>, e0<? super T>, e0>)onSingleSubscribe, c0, e0);
        }
        return e0;
    }
    
    public static <T> p<? super T> onSubscribe(final n<T> n, final p<? super T> p2) {
        final c<? super n, ? super p, ? extends p> onMaybeSubscribe = RxJavaPlugins.onMaybeSubscribe;
        if (onMaybeSubscribe != null) {
            return (p<? super T>)apply((kf2.c<n<T>, p<? super T>, p>)onMaybeSubscribe, n, p2);
        }
        return p2;
    }
    
    public static <T> qt2.c<? super T> onSubscribe(final ff2.g<T> g, final qt2.c<? super T> c) {
        final c<? super ff2.g, ? super qt2.c, ? extends qt2.c> onFlowableSubscribe = RxJavaPlugins.onFlowableSubscribe;
        if (onFlowableSubscribe != null) {
            return (qt2.c<? super T>)apply((kf2.c<ff2.g<T>, qt2.c<? super T>, qt2.c>)onFlowableSubscribe, g, c);
        }
        return c;
    }
    
    public static void reset() {
        setErrorHandler(null);
        setScheduleHandler(null);
        setComputationSchedulerHandler(null);
        setInitComputationSchedulerHandler(null);
        setIoSchedulerHandler(null);
        setInitIoSchedulerHandler(null);
        setSingleSchedulerHandler(null);
        setInitSingleSchedulerHandler(null);
        setNewThreadSchedulerHandler(null);
        setInitNewThreadSchedulerHandler(null);
        setOnFlowableAssembly(null);
        setOnFlowableSubscribe(null);
        setOnObservableAssembly(null);
        setOnObservableSubscribe(null);
        setOnSingleAssembly(null);
        setOnSingleSubscribe(null);
        setOnCompletableAssembly(null);
        setOnCompletableSubscribe(null);
        setOnConnectableFlowableAssembly(null);
        setOnConnectableObservableAssembly(null);
        setOnMaybeAssembly(null);
        setOnMaybeSubscribe(null);
        setOnParallelAssembly(null);
        setFailOnNonBlockingScheduler(false);
        setOnBeforeBlocking(null);
    }
    
    public static void setComputationSchedulerHandler(final o<? super b0, ? extends b0> onComputationHandler) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onComputationHandler = onComputationHandler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setErrorHandler(final g<? super Throwable> errorHandler) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.errorHandler = errorHandler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setFailOnNonBlockingScheduler(final boolean failNonBlockingScheduler) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.failNonBlockingScheduler = failNonBlockingScheduler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setInitComputationSchedulerHandler(final o<? super Callable<b0>, ? extends b0> onInitComputationHandler) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onInitComputationHandler = onInitComputationHandler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setInitIoSchedulerHandler(final o<? super Callable<b0>, ? extends b0> onInitIoHandler) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onInitIoHandler = onInitIoHandler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setInitNewThreadSchedulerHandler(final o<? super Callable<b0>, ? extends b0> onInitNewThreadHandler) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onInitNewThreadHandler = onInitNewThreadHandler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setInitSingleSchedulerHandler(final o<? super Callable<b0>, ? extends b0> onInitSingleHandler) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onInitSingleHandler = onInitSingleHandler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setIoSchedulerHandler(final o<? super b0, ? extends b0> onIoHandler) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onIoHandler = onIoHandler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setNewThreadSchedulerHandler(final o<? super b0, ? extends b0> onNewThreadHandler) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onNewThreadHandler = onNewThreadHandler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnBeforeBlocking(final e onBeforeBlocking) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onBeforeBlocking = onBeforeBlocking;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnCompletableAssembly(final o<? super a, ? extends a> onCompletableAssembly) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onCompletableAssembly = onCompletableAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnCompletableSubscribe(final c<? super a, ? super ff2.c, ? extends ff2.c> onCompletableSubscribe) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onCompletableSubscribe = onCompletableSubscribe;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnConnectableFlowableAssembly(final o<? super jf2.a, ? extends jf2.a> onConnectableFlowableAssembly) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onConnectableFlowableAssembly = onConnectableFlowableAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnConnectableObservableAssembly(final o<? super zf2.a, ? extends zf2.a> onConnectableObservableAssembly) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onConnectableObservableAssembly = onConnectableObservableAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnFlowableAssembly(final o<? super ff2.g, ? extends ff2.g> onFlowableAssembly) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onFlowableAssembly = onFlowableAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnFlowableSubscribe(final c<? super ff2.g, ? super qt2.c, ? extends qt2.c> onFlowableSubscribe) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onFlowableSubscribe = onFlowableSubscribe;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnMaybeAssembly(final o<? super n, ? extends n> onMaybeAssembly) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onMaybeAssembly = onMaybeAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnMaybeSubscribe(final c<? super n, p, ? extends p> onMaybeSubscribe) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onMaybeSubscribe = onMaybeSubscribe;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnObservableAssembly(final o<? super t, ? extends t> onObservableAssembly) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onObservableAssembly = onObservableAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnObservableSubscribe(final c<? super t, ? super a0, ? extends a0> onObservableSubscribe) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onObservableSubscribe = onObservableSubscribe;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnParallelAssembly(final o<? super bg2.a, ? extends bg2.a> onParallelAssembly) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onParallelAssembly = onParallelAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnSingleAssembly(final o<? super c0, ? extends c0> onSingleAssembly) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onSingleAssembly = onSingleAssembly;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setOnSingleSubscribe(final c<? super c0, ? super e0, ? extends e0> onSingleSubscribe) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onSingleSubscribe = onSingleSubscribe;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setScheduleHandler(final o<? super Runnable, ? extends Runnable> onScheduleHandler) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onScheduleHandler = onScheduleHandler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void setSingleSchedulerHandler(final o<? super b0, ? extends b0> onSingleHandler) {
        if (!RxJavaPlugins.lockdown) {
            RxJavaPlugins.onSingleHandler = onSingleHandler;
            return;
        }
        throw new IllegalStateException("Plugins can't be changed anymore");
    }
    
    public static void uncaught(final Throwable t) {
        final Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t);
    }
    
    public static void unlock() {
        RxJavaPlugins.lockdown = false;
    }
}
