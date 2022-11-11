// 
// Decompiled by Procyon v0.6.0
// 

package ff2;

import qf2.t1;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFrom;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany;
import qf2.r1;
import io.reactivex.internal.operators.flowable.FlowableWindowBoundary;
import io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier;
import qf2.s1;
import io.reactivex.internal.operators.flowable.FlowableWindow;
import io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn;
import io.reactivex.internal.functions.Functions$x;
import io.reactivex.internal.functions.Functions$i0;
import io.reactivex.internal.functions.Functions$h0;
import io.reactivex.internal.functions.Functions$g0;
import io.reactivex.internal.util.HashMapSupplier;
import qf2.q1;
import io.reactivex.internal.functions.Functions$f0;
import qf2.p1;
import io.reactivex.internal.operators.flowable.FlowableThrottleLatest;
import io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed;
import io.reactivex.subscribers.TestSubscriber;
import qf2.o1;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil;
import qf2.n1;
import io.reactivex.internal.operators.flowable.FlowableTakeLastTimed;
import io.reactivex.internal.operators.flowable.FlowableTakeLast;
import io.reactivex.internal.operators.flowable.FlowableTakeLastOne;
import qf2.f0;
import io.reactivex.internal.operators.flowable.FlowableTake;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable;
import io.reactivex.internal.operators.flowable.FlowableSwitchMap;
import qf2.m1;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import java.util.Comparator;
import qf2.l1;
import io.reactivex.internal.operators.flowable.FlowableSkipUntil;
import io.reactivex.internal.operators.flowable.FlowableSkipLastTimed;
import io.reactivex.internal.operators.flowable.FlowableSkipLast;
import qf2.k1;
import qf2.i1;
import qf2.j1;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.internal.operators.flowable.FlowablePublishAlt;
import qf2.b1;
import qf2.h1;
import io.reactivex.internal.operators.flowable.FlowableScanSeed;
import qf2.g1;
import io.reactivex.internal.operators.flowable.FlowableSamplePublisher;
import io.reactivex.internal.operators.flowable.FlowableSampleTimed;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.internal.functions.Functions$k;
import io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate;
import io.reactivex.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.internal.operators.flowable.FlowableReplay$a;
import qf2.u0;
import qf2.o0;
import qf2.i0;
import qf2.h0;
import io.reactivex.internal.operators.flowable.FlowableReplay;
import qf2.n0;
import io.reactivex.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.internal.operators.flowable.FlowableRepeatUntil;
import io.reactivex.internal.operators.flowable.FlowableRepeat;
import qf2.e1;
import qf2.c1;
import qf2.d1;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.operators.flowable.FlowablePublish$a;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.flowable.FlowablePublishMulticast;
import io.reactivex.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.internal.operators.flowable.FlowableOnErrorNext;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy;
import io.reactivex.BackpressureOverflowStrategy;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.functions.Functions$n;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe;
import io.reactivex.internal.operators.flowable.FlowableMergeWithSingle;
import io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable;
import io.reactivex.internal.operators.flowable.FlowableMaterialize;
import io.reactivex.internal.operators.flowable.FlowableLimit;
import qf2.z0;
import qf2.x0;
import qf2.y0;
import io.reactivex.internal.operators.flowable.FlowableJoin;
import qf2.e0;
import io.reactivex.internal.operators.flowable.FlowableGroupJoin;
import java.util.Map;
import io.reactivex.internal.operators.flowable.FlowableGroupBy;
import io.reactivex.internal.subscribers.ForEachWhileSubscriber;
import io.reactivex.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import qf2.j0;
import io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableMapNotification;
import qf2.l0;
import qf2.z;
import qf2.v;
import qf2.w;
import io.reactivex.internal.functions.Functions$a;
import qf2.u;
import qf2.r0;
import qf2.s0;
import qf2.t0;
import io.reactivex.internal.functions.Functions$a0;
import io.reactivex.internal.functions.Functions$b0;
import io.reactivex.internal.functions.Functions$c0;
import kf2.p;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther;
import qf2.m0;
import io.reactivex.internal.operators.flowable.FlowableDebounce;
import io.reactivex.internal.operators.flowable.FlowableDebounceTimed;
import io.reactivex.internal.functions.Functions$s;
import io.reactivex.internal.operators.flowable.FlowableConcatWithMaybe;
import io.reactivex.internal.operators.flowable.FlowableConcatWithSingle;
import io.reactivex.internal.operators.flowable.FlowableConcatWithCompletable;
import io.reactivex.internal.operators.mixed.FlowableConcatMapSingle;
import io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe;
import io.reactivex.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable;
import qf2.f1$a;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.functions.Functions$m;
import io.reactivex.internal.operators.flowable.FlowableCache;
import io.reactivex.internal.operators.flowable.FlowableBufferBoundary;
import io.reactivex.internal.operators.flowable.FlowableBuffer;
import java.util.Collection;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.operators.flowable.BlockingFlowableIterable;
import java.util.Iterator;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import qf2.e;
import kf2.q;
import java.util.List;
import qf2.v0;
import io.reactivex.internal.operators.flowable.FlowableZip;
import io.reactivex.internal.operators.flowable.FlowableUsing;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.operators.flowable.FlowableTimeout;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle;
import io.reactivex.internal.operators.flowable.FlowableRangeLong;
import io.reactivex.internal.operators.flowable.FlowableRange;
import qf2.a1;
import qf2.w0;
import io.reactivex.internal.operators.flowable.FlowableIntervalRange;
import al0.g7;
import io.reactivex.internal.operators.flowable.FlowableInterval;
import qf2.q0;
import io.reactivex.internal.operators.flowable.FlowableGenerate;
import qf2.p0;
import qf2.d0;
import java.util.concurrent.TimeUnit;
import qf2.b0;
import java.util.concurrent.Future;
import qf2.a0;
import qf2.y;
import io.reactivex.internal.functions.Functions$w;
import qf2.x;
import qf2.t;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import io.reactivex.internal.operators.flowable.FlowableConcatArray;
import kf2.n;
import kf2.m;
import kf2.l;
import kf2.k;
import kf2.j;
import kf2.i;
import kf2.h;
import io.reactivex.internal.functions.Functions;
import kf2.c;
import io.reactivex.internal.operators.flowable.FlowableCombineLatest;
import mf2.a;
import kf2.o;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.flowable.FlowableAmb;
import qt2.b;

public abstract class g<T> implements b<T>
{
    public static final int BUFFER_SIZE;
    
    static {
        BUFFER_SIZE = Math.max(1, Integer.getInteger("rx2.buffer-size", 128));
    }
    
    public static <T> g<T> amb(final Iterable<? extends b<? extends T>> iterable) {
        if (iterable != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableAmb((b[])null, (Iterable)iterable));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> g<T> ambArray(final b<? extends T>... array) {
        if (array == null) {
            throw new NullPointerException("sources is null");
        }
        final int length = array.length;
        if (length == 0) {
            return empty();
        }
        if (length == 1) {
            return fromPublisher(array[0]);
        }
        return RxJavaPlugins.onAssembly((g<T>)new FlowableAmb((b[])array, (Iterable)null));
    }
    
    public static int bufferSize() {
        return g.BUFFER_SIZE;
    }
    
    public static <T, R> g<R> combineLatest(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        return combineLatest((Iterable<? extends qt2.b<?>>)iterable, o, bufferSize());
    }
    
    public static <T, R> g<R> combineLatest(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o, final int n) {
        if (iterable == null) {
            throw new NullPointerException("sources is null");
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g<R>)new FlowableCombineLatest((Iterable)iterable, (o)o, false, n));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public static <T, R> g<R> combineLatest(final o<? super Object[], ? extends R> o, final b<? extends T>... array) {
        return combineLatest((qt2.b<?>[])array, o, bufferSize());
    }
    
    public static <T1, T2, R> g<R> combineLatest(final b<? extends T1> b, final b<? extends T2> b2, final c<? super T1, ? super T2, ? extends R> c) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return combineLatest((kf2.o<? super Object[], ? extends R>)Functions.c(c), (qt2.b<?>[])new b[] { b, b2 });
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T1, T2, T3, R> g<R> combineLatest(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final h<? super T1, ? super T2, ? super T3, ? extends R> h) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 != null) {
            return combineLatest((kf2.o<? super Object[], ? extends R>)Functions.d(h), (qt2.b<?>[])new b[] { b, b2, b3 });
        }
        throw new NullPointerException("source3 is null");
    }
    
    public static <T1, T2, T3, T4, R> g<R> combineLatest(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 != null) {
            return combineLatest((kf2.o<? super Object[], ? extends R>)Functions.e(i), (qt2.b<?>[])new b[] { b, b2, b3, b4 });
        }
        throw new NullPointerException("source4 is null");
    }
    
    public static <T1, T2, T3, T4, T5, R> g<R> combineLatest(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> j) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (b5 != null) {
            return combineLatest((kf2.o<? super Object[], ? extends R>)Functions.f(j), (qt2.b<?>[])new b[] { b, b2, b3, b4, b5 });
        }
        throw new NullPointerException("source5 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, R> g<R> combineLatest(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> k) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (b5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (b6 != null) {
            return combineLatest((kf2.o<? super Object[], ? extends R>)Functions.g(k), (qt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6 });
        }
        throw new NullPointerException("source6 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, R> g<R> combineLatest(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final b<? extends T7> b7, final l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> l) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (b5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (b6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (b7 != null) {
            return combineLatest((kf2.o<? super Object[], ? extends R>)Functions.h(l), (qt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6, b7 });
        }
        throw new NullPointerException("source7 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> g<R> combineLatest(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final b<? extends T7> b7, final b<? extends T8> b8, final m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> m) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (b5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (b6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (b7 == null) {
            throw new NullPointerException("source7 is null");
        }
        if (b8 != null) {
            return combineLatest((kf2.o<? super Object[], ? extends R>)Functions.i(m), (qt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6, b7, b8 });
        }
        throw new NullPointerException("source8 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> g<R> combineLatest(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final b<? extends T7> b7, final b<? extends T8> b8, final b<? extends T9> b9, final n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> n) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (b5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (b6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (b7 == null) {
            throw new NullPointerException("source7 is null");
        }
        if (b8 == null) {
            throw new NullPointerException("source8 is null");
        }
        if (b9 != null) {
            return combineLatest((kf2.o<? super Object[], ? extends R>)Functions.j(n), (qt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6, b7, b8, b9 });
        }
        throw new NullPointerException("source9 is null");
    }
    
    public static <T, R> g<R> combineLatest(final b<? extends T>[] array, final o<? super Object[], ? extends R> o) {
        return combineLatest((qt2.b<?>[])array, o, bufferSize());
    }
    
    public static <T, R> g<R> combineLatest(final b<? extends T>[] array, final o<? super Object[], ? extends R> o, final int n) {
        if (array == null) {
            throw new NullPointerException("sources is null");
        }
        if (array.length == 0) {
            return empty();
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g<R>)new FlowableCombineLatest((o)o, false, n, (b[])array));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public static <T, R> g<R> combineLatestDelayError(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        return combineLatestDelayError((Iterable<? extends qt2.b<?>>)iterable, o, bufferSize());
    }
    
    public static <T, R> g<R> combineLatestDelayError(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o, final int n) {
        if (iterable == null) {
            throw new NullPointerException("sources is null");
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g<R>)new FlowableCombineLatest((Iterable)iterable, (o)o, true, n));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public static <T, R> g<R> combineLatestDelayError(final o<? super Object[], ? extends R> o, final int n, final b<? extends T>... array) {
        return combineLatestDelayError((qt2.b<?>[])array, o, n);
    }
    
    public static <T, R> g<R> combineLatestDelayError(final o<? super Object[], ? extends R> o, final b<? extends T>... array) {
        return combineLatestDelayError((qt2.b<?>[])array, o, bufferSize());
    }
    
    public static <T, R> g<R> combineLatestDelayError(final b<? extends T>[] array, final o<? super Object[], ? extends R> o) {
        return combineLatestDelayError((qt2.b<?>[])array, o, bufferSize());
    }
    
    public static <T, R> g<R> combineLatestDelayError(final b<? extends T>[] array, final o<? super Object[], ? extends R> o, final int n) {
        if (array == null) {
            throw new NullPointerException("sources is null");
        }
        if (o == null) {
            throw new NullPointerException("combiner is null");
        }
        a.c(n, "bufferSize");
        if (array.length == 0) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((g<R>)new FlowableCombineLatest((o)o, true, n, (b[])array));
    }
    
    public static <T> g<T> concat(final Iterable<? extends b<? extends T>> iterable) {
        if (iterable != null) {
            return fromIterable((Iterable<?>)iterable).concatMapDelayError((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a, 2, false);
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> g<T> concat(final b<? extends b<? extends T>> b) {
        return concat(b, bufferSize());
    }
    
    public static <T> g<T> concat(final b<? extends b<? extends T>> b, final int n) {
        return fromPublisher((qt2.b<?>)b).concatMap((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a, n);
    }
    
    public static <T> g<T> concat(final b<? extends T> b, final b<? extends T> b2) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return concatArray(b, b2);
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T> g<T> concat(final b<? extends T> b, final b<? extends T> b2, final b<? extends T> b3) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 != null) {
            return concatArray(b, b2, b3);
        }
        throw new NullPointerException("source3 is null");
    }
    
    public static <T> g<T> concat(final b<? extends T> b, final b<? extends T> b2, final b<? extends T> b3, final b<? extends T> b4) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 != null) {
            return concatArray(b, b2, b3, b4);
        }
        throw new NullPointerException("source4 is null");
    }
    
    public static <T> g<T> concatArray(final b<? extends T>... array) {
        if (array.length == 0) {
            return empty();
        }
        if (array.length == 1) {
            return fromPublisher(array[0]);
        }
        return RxJavaPlugins.onAssembly((g<T>)new FlowableConcatArray((b[])array, false));
    }
    
    public static <T> g<T> concatArrayDelayError(final b<? extends T>... array) {
        if (array.length == 0) {
            return empty();
        }
        if (array.length == 1) {
            return fromPublisher(array[0]);
        }
        return RxJavaPlugins.onAssembly((g<T>)new FlowableConcatArray((b[])array, true));
    }
    
    public static <T> g<T> concatArrayEager(final int n, final int n2, final b<? extends T>... array) {
        if (array != null) {
            a.c(n, "maxConcurrency");
            a.c(n2, "prefetch");
            return RxJavaPlugins.onAssembly((g<T>)new FlowableConcatMapEager((g)new FlowableFromArray((Object[])array), (o)Functions.a, n, n2, ErrorMode.IMMEDIATE));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> g<T> concatArrayEager(final b<? extends T>... array) {
        return concatArrayEager(bufferSize(), bufferSize(), array);
    }
    
    public static <T> g<T> concatArrayEagerDelayError(final int n, final int n2, final b<? extends T>... array) {
        return fromArray(array).concatMapEagerDelayError((kf2.o<? super b<? extends T>, ? extends qt2.b<? extends T>>)Functions.a, n, n2, true);
    }
    
    public static <T> g<T> concatArrayEagerDelayError(final b<? extends T>... array) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), array);
    }
    
    public static <T> g<T> concatDelayError(final Iterable<? extends b<? extends T>> iterable) {
        if (iterable != null) {
            return fromIterable((Iterable<?>)iterable).concatMapDelayError((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a);
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> g<T> concatDelayError(final b<? extends b<? extends T>> b) {
        return concatDelayError(b, bufferSize(), true);
    }
    
    public static <T> g<T> concatDelayError(final b<? extends b<? extends T>> b, final int n, final boolean b2) {
        return fromPublisher((qt2.b<?>)b).concatMapDelayError((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a, n, b2);
    }
    
    public static <T> g<T> concatEager(final Iterable<? extends b<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }
    
    public static <T> g<T> concatEager(final Iterable<? extends b<? extends T>> iterable, final int n, final int n2) {
        if (iterable != null) {
            a.c(n, "maxConcurrency");
            a.c(n2, "prefetch");
            return RxJavaPlugins.onAssembly((g<T>)new FlowableConcatMapEager((g)new FlowableFromIterable((Iterable)iterable), (o)Functions.a, n, n2, ErrorMode.IMMEDIATE));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> g<T> concatEager(final b<? extends b<? extends T>> b) {
        return concatEager(b, bufferSize(), bufferSize());
    }
    
    public static <T> g<T> concatEager(final b<? extends b<? extends T>> b, final int n, final int n2) {
        if (b != null) {
            a.c(n, "maxConcurrency");
            a.c(n2, "prefetch");
            return RxJavaPlugins.onAssembly((g<T>)new io.reactivex.internal.operators.flowable.a(b, n, n2, ErrorMode.IMMEDIATE));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> g<T> create(final ff2.j<T> j, final BackpressureStrategy backpressureStrategy) {
        if (j == null) {
            throw new NullPointerException("source is null");
        }
        if (backpressureStrategy != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableCreate((ff2.j)j, backpressureStrategy));
        }
        throw new NullPointerException("mode is null");
    }
    
    public static <T> g<T> defer(final Callable<? extends b<? extends T>> callable) {
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g<T>)new qf2.m((Callable)callable));
        }
        throw new NullPointerException("supplier is null");
    }
    
    private g<T> doOnEach(final kf2.g<? super T> g, final kf2.g<? super Throwable> g2, final kf2.a a, final kf2.a a2) {
        if (g == null) {
            throw new NullPointerException("onNext is null");
        }
        if (g2 == null) {
            throw new NullPointerException("onError is null");
        }
        if (a == null) {
            throw new NullPointerException("onComplete is null");
        }
        if (a2 != null) {
            return RxJavaPlugins.onAssembly((g<T>)new t(this, (kf2.g)g, (kf2.g)g2, a, a2));
        }
        throw new NullPointerException("onAfterTerminate is null");
    }
    
    public static <T> g<T> empty() {
        return RxJavaPlugins.onAssembly((g<T>)x.f);
    }
    
    public static <T> g<T> error(final Throwable t) {
        if (t != null) {
            return error((Callable<? extends Throwable>)new Functions$w((Object)t));
        }
        throw new NullPointerException("throwable is null");
    }
    
    public static <T> g<T> error(final Callable<? extends Throwable> callable) {
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g<T>)new y((Callable)callable));
        }
        throw new NullPointerException("supplier is null");
    }
    
    public static <T> g<T> fromArray(final T... array) {
        if (array == null) {
            throw new NullPointerException("items is null");
        }
        if (array.length == 0) {
            return empty();
        }
        if (array.length == 1) {
            return just(array[0]);
        }
        return RxJavaPlugins.onAssembly((g<T>)new FlowableFromArray((Object[])array));
    }
    
    public static <T> g<T> fromCallable(final Callable<? extends T> callable) {
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g<T>)new a0((Callable)callable));
        }
        throw new NullPointerException("supplier is null");
    }
    
    public static <T> g<T> fromFuture(final Future<? extends T> future) {
        if (future != null) {
            return RxJavaPlugins.onAssembly((g<T>)new b0((Future)future, 0L, (TimeUnit)null));
        }
        throw new NullPointerException("future is null");
    }
    
    public static <T> g<T> fromFuture(final Future<? extends T> future, final long n, final TimeUnit timeUnit) {
        if (future == null) {
            throw new NullPointerException("future is null");
        }
        if (timeUnit != null) {
            return RxJavaPlugins.onAssembly((g<T>)new b0((Future)future, n, timeUnit));
        }
        throw new NullPointerException("unit is null");
    }
    
    public static <T> g<T> fromFuture(final Future<? extends T> future, final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        if (b0 != null) {
            return fromFuture(future, n, timeUnit).subscribeOn(b0);
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static <T> g<T> fromFuture(final Future<? extends T> future, final ff2.b0 b0) {
        if (b0 != null) {
            return fromFuture(future).subscribeOn(b0);
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static <T> g<T> fromIterable(final Iterable<? extends T> iterable) {
        if (iterable != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableFromIterable((Iterable)iterable));
        }
        throw new NullPointerException("source is null");
    }
    
    public static <T> g<T> fromPublisher(final b<? extends T> b) {
        if (b instanceof g) {
            return RxJavaPlugins.onAssembly((g<T>)b);
        }
        if (b != null) {
            return RxJavaPlugins.onAssembly((g<T>)new d0((b)b));
        }
        throw new NullPointerException("source is null");
    }
    
    public static <T, S> g<T> generate(final Callable<S> callable, final kf2.b<S, f<T>> b) {
        if (b != null) {
            return generate(callable, (kf2.c<S, ff2.f<T>, S>)new p0((kf2.b<Object, ff2.f<Object>>)b), (kf2.g<? super S>)Functions.d);
        }
        throw new NullPointerException("generator is null");
    }
    
    public static <T, S> g<T> generate(final Callable<S> callable, final kf2.b<S, f<T>> b, final kf2.g<? super S> g) {
        if (b != null) {
            return generate(callable, (kf2.c<S, ff2.f<T>, S>)new p0((kf2.b<Object, ff2.f<Object>>)b), g);
        }
        throw new NullPointerException("generator is null");
    }
    
    public static <T, S> g<T> generate(final Callable<S> callable, final c<S, f<T>, S> c) {
        return generate(callable, c, (kf2.g<? super S>)Functions.d);
    }
    
    public static <T, S> g<T> generate(final Callable<S> callable, final c<S, f<T>, S> c, final kf2.g<? super S> g) {
        if (callable == null) {
            throw new NullPointerException("initialState is null");
        }
        if (c == null) {
            throw new NullPointerException("generator is null");
        }
        if (g != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableGenerate((Callable)callable, (c)c, (kf2.g)g));
        }
        throw new NullPointerException("disposeState is null");
    }
    
    public static <T> g<T> generate(final kf2.g<f<T>> g) {
        if (g != null) {
            return generate(Functions.i, (kf2.c<Object, ff2.f<T>, Object>)new q0((kf2.g<ff2.f<Object>>)g), (kf2.g<? super Object>)Functions.d);
        }
        throw new NullPointerException("generator is null");
    }
    
    public static g<Long> interval(final long n, final long n2, final TimeUnit timeUnit) {
        return interval(n, n2, timeUnit, eg2.a.a());
    }
    
    public static g<Long> interval(final long n, final long n2, final TimeUnit timeUnit, final ff2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g<Long>)new FlowableInterval(Math.max(0L, n), Math.max(0L, n2), timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static g<Long> interval(final long n, final TimeUnit timeUnit) {
        return interval(n, n, timeUnit, eg2.a.a());
    }
    
    public static g<Long> interval(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return interval(n, n, timeUnit, b0);
    }
    
    public static g<Long> intervalRange(final long n, final long n2, final long n3, final long n4, final TimeUnit timeUnit) {
        return intervalRange(n, n2, n3, n4, timeUnit, eg2.a.a());
    }
    
    public static g<Long> intervalRange(final long n, long n2, final long n3, final long n4, final TimeUnit timeUnit, final ff2.b0 b0) {
        final long n5 = lcmp(n2, 0L);
        if (n5 < 0) {
            throw new IllegalArgumentException(g7.g("count >= 0 required but it was ", n2));
        }
        if (n5 == 0) {
            return empty().delay(n3, timeUnit, b0);
        }
        n2 = n2 - 1L + n;
        if (n > 0L && n2 < 0L) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g<Long>)new FlowableIntervalRange(n, n2, Math.max(0L, n3), Math.max(0L, n4), timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static <T> g<T> just(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((g<T>)new w0((Object)t));
        }
        throw new NullPointerException("item is null");
    }
    
    public static <T> g<T> just(final T t, final T t2) {
        if (t == null) {
            throw new NullPointerException("item1 is null");
        }
        if (t2 != null) {
            return fromArray(t, t2);
        }
        throw new NullPointerException("item2 is null");
    }
    
    public static <T> g<T> just(final T t, final T t2, final T t3) {
        if (t == null) {
            throw new NullPointerException("item1 is null");
        }
        if (t2 == null) {
            throw new NullPointerException("item2 is null");
        }
        if (t3 != null) {
            return fromArray(t, t2, t3);
        }
        throw new NullPointerException("item3 is null");
    }
    
    public static <T> g<T> just(final T t, final T t2, final T t3, final T t4) {
        if (t == null) {
            throw new NullPointerException("item1 is null");
        }
        if (t2 == null) {
            throw new NullPointerException("item2 is null");
        }
        if (t3 == null) {
            throw new NullPointerException("item3 is null");
        }
        if (t4 != null) {
            return fromArray(t, t2, t3, t4);
        }
        throw new NullPointerException("item4 is null");
    }
    
    public static <T> g<T> just(final T t, final T t2, final T t3, final T t4, final T t5) {
        if (t == null) {
            throw new NullPointerException("item1 is null");
        }
        if (t2 == null) {
            throw new NullPointerException("item2 is null");
        }
        if (t3 == null) {
            throw new NullPointerException("item3 is null");
        }
        if (t4 == null) {
            throw new NullPointerException("item4 is null");
        }
        if (t5 != null) {
            return fromArray(t, t2, t3, t4, t5);
        }
        throw new NullPointerException("item5 is null");
    }
    
    public static <T> g<T> just(final T t, final T t2, final T t3, final T t4, final T t5, final T t6) {
        if (t == null) {
            throw new NullPointerException("item1 is null");
        }
        if (t2 == null) {
            throw new NullPointerException("item2 is null");
        }
        if (t3 == null) {
            throw new NullPointerException("item3 is null");
        }
        if (t4 == null) {
            throw new NullPointerException("item4 is null");
        }
        if (t5 == null) {
            throw new NullPointerException("item5 is null");
        }
        if (t6 != null) {
            return fromArray(t, t2, t3, t4, t5, t6);
        }
        throw new NullPointerException("item6 is null");
    }
    
    public static <T> g<T> just(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7) {
        if (t == null) {
            throw new NullPointerException("item1 is null");
        }
        if (t2 == null) {
            throw new NullPointerException("item2 is null");
        }
        if (t3 == null) {
            throw new NullPointerException("item3 is null");
        }
        if (t4 == null) {
            throw new NullPointerException("item4 is null");
        }
        if (t5 == null) {
            throw new NullPointerException("item5 is null");
        }
        if (t6 == null) {
            throw new NullPointerException("item6 is null");
        }
        if (t7 != null) {
            return fromArray(t, t2, t3, t4, t5, t6, t7);
        }
        throw new NullPointerException("item7 is null");
    }
    
    public static <T> g<T> just(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8) {
        if (t == null) {
            throw new NullPointerException("item1 is null");
        }
        if (t2 == null) {
            throw new NullPointerException("item2 is null");
        }
        if (t3 == null) {
            throw new NullPointerException("item3 is null");
        }
        if (t4 == null) {
            throw new NullPointerException("item4 is null");
        }
        if (t5 == null) {
            throw new NullPointerException("item5 is null");
        }
        if (t6 == null) {
            throw new NullPointerException("item6 is null");
        }
        if (t7 == null) {
            throw new NullPointerException("item7 is null");
        }
        if (t8 != null) {
            return fromArray(t, t2, t3, t4, t5, t6, t7, t8);
        }
        throw new NullPointerException("item8 is null");
    }
    
    public static <T> g<T> just(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8, final T t9) {
        if (t == null) {
            throw new NullPointerException("item1 is null");
        }
        if (t2 == null) {
            throw new NullPointerException("item2 is null");
        }
        if (t3 == null) {
            throw new NullPointerException("item3 is null");
        }
        if (t4 == null) {
            throw new NullPointerException("item4 is null");
        }
        if (t5 == null) {
            throw new NullPointerException("item5 is null");
        }
        if (t6 == null) {
            throw new NullPointerException("item6 is null");
        }
        if (t7 == null) {
            throw new NullPointerException("item7 is null");
        }
        if (t8 == null) {
            throw new NullPointerException("item8 is null");
        }
        if (t9 != null) {
            return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9);
        }
        throw new NullPointerException("item9 is null");
    }
    
    public static <T> g<T> just(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8, final T t9, final T t10) {
        if (t == null) {
            throw new NullPointerException("item1 is null");
        }
        if (t2 == null) {
            throw new NullPointerException("item2 is null");
        }
        if (t3 == null) {
            throw new NullPointerException("item3 is null");
        }
        if (t4 == null) {
            throw new NullPointerException("item4 is null");
        }
        if (t5 == null) {
            throw new NullPointerException("item5 is null");
        }
        if (t6 == null) {
            throw new NullPointerException("item6 is null");
        }
        if (t7 == null) {
            throw new NullPointerException("item7 is null");
        }
        if (t8 == null) {
            throw new NullPointerException("item8 is null");
        }
        if (t9 == null) {
            throw new NullPointerException("item9 is null");
        }
        if (t10 != null) {
            return fromArray(t, t2, t3, t4, t5, t6, t7, t8, t9, t10);
        }
        throw new NullPointerException("item10 is null");
    }
    
    public static <T> g<T> merge(final Iterable<? extends b<? extends T>> iterable) {
        return fromIterable((Iterable<?>)iterable).flatMap((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a);
    }
    
    public static <T> g<T> merge(final Iterable<? extends b<? extends T>> iterable, final int n) {
        return fromIterable((Iterable<?>)iterable).flatMap((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a, n);
    }
    
    public static <T> g<T> merge(final Iterable<? extends b<? extends T>> iterable, final int n, final int n2) {
        return fromIterable((Iterable<?>)iterable).flatMap((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a, false, n, n2);
    }
    
    public static <T> g<T> merge(final b<? extends b<? extends T>> b) {
        return merge(b, bufferSize());
    }
    
    public static <T> g<T> merge(final b<? extends b<? extends T>> b, final int n) {
        return fromPublisher((qt2.b<?>)b).flatMap((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a, n);
    }
    
    public static <T> g<T> merge(final b<? extends T> b, final b<? extends T> b2) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return fromArray(b, b2).flatMap((kf2.o<? super b, ? extends qt2.b<? extends T>>)Functions.a, false, 2);
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T> g<T> merge(final b<? extends T> b, final b<? extends T> b2, final b<? extends T> b3) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 != null) {
            return fromArray(b, b2, b3).flatMap((kf2.o<? super b, ? extends qt2.b<? extends T>>)Functions.a, false, 3);
        }
        throw new NullPointerException("source3 is null");
    }
    
    public static <T> g<T> merge(final b<? extends T> b, final b<? extends T> b2, final b<? extends T> b3, final b<? extends T> b4) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 != null) {
            return fromArray(b, b2, b3, b4).flatMap((kf2.o<? super b, ? extends qt2.b<? extends T>>)Functions.a, false, 4);
        }
        throw new NullPointerException("source4 is null");
    }
    
    public static <T> g<T> mergeArray(final int n, final int n2, final b<? extends T>... array) {
        return fromArray(array).flatMap((kf2.o<? super b<? extends T>, ? extends qt2.b<? extends T>>)Functions.a, false, n, n2);
    }
    
    public static <T> g<T> mergeArray(final b<? extends T>... array) {
        return fromArray(array).flatMap((kf2.o<? super b<? extends T>, ? extends qt2.b<? extends T>>)Functions.a, array.length);
    }
    
    public static <T> g<T> mergeArrayDelayError(final int n, final int n2, final b<? extends T>... array) {
        return fromArray(array).flatMap((kf2.o<? super b<? extends T>, ? extends qt2.b<? extends T>>)Functions.a, true, n, n2);
    }
    
    public static <T> g<T> mergeArrayDelayError(final b<? extends T>... array) {
        return fromArray(array).flatMap((kf2.o<? super b<? extends T>, ? extends qt2.b<? extends T>>)Functions.a, true, array.length);
    }
    
    public static <T> g<T> mergeDelayError(final Iterable<? extends b<? extends T>> iterable) {
        return fromIterable((Iterable<?>)iterable).flatMap((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a, true);
    }
    
    public static <T> g<T> mergeDelayError(final Iterable<? extends b<? extends T>> iterable, final int n) {
        return fromIterable((Iterable<?>)iterable).flatMap((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a, true, n);
    }
    
    public static <T> g<T> mergeDelayError(final Iterable<? extends b<? extends T>> iterable, final int n, final int n2) {
        return fromIterable((Iterable<?>)iterable).flatMap((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a, true, n, n2);
    }
    
    public static <T> g<T> mergeDelayError(final b<? extends b<? extends T>> b) {
        return mergeDelayError(b, bufferSize());
    }
    
    public static <T> g<T> mergeDelayError(final b<? extends b<? extends T>> b, final int n) {
        return fromPublisher((qt2.b<?>)b).flatMap((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a, true, n);
    }
    
    public static <T> g<T> mergeDelayError(final b<? extends T> b, final b<? extends T> b2) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return fromArray(b, b2).flatMap((kf2.o<? super b, ? extends qt2.b<? extends T>>)Functions.a, true, 2);
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T> g<T> mergeDelayError(final b<? extends T> b, final b<? extends T> b2, final b<? extends T> b3) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 != null) {
            return fromArray(b, b2, b3).flatMap((kf2.o<? super b, ? extends qt2.b<? extends T>>)Functions.a, true, 3);
        }
        throw new NullPointerException("source3 is null");
    }
    
    public static <T> g<T> mergeDelayError(final b<? extends T> b, final b<? extends T> b2, final b<? extends T> b3, final b<? extends T> b4) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 != null) {
            return fromArray(b, b2, b3, b4).flatMap((kf2.o<? super b, ? extends qt2.b<? extends T>>)Functions.a, true, 4);
        }
        throw new NullPointerException("source4 is null");
    }
    
    public static <T> g<T> never() {
        return RxJavaPlugins.onAssembly((g<T>)a1.f);
    }
    
    public static g<Integer> range(final int n, final int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException(d.h("count >= 0 required but it was ", n2));
        }
        if (n2 == 0) {
            return empty();
        }
        if (n2 == 1) {
            return just(n);
        }
        if (n + (long)(n2 - 1) <= 2147483647L) {
            return RxJavaPlugins.onAssembly((g<Integer>)new FlowableRange(n, n2));
        }
        throw new IllegalArgumentException("Integer overflow");
    }
    
    public static g<Long> rangeLong(final long n, final long n2) {
        final long n3 = lcmp(n2, 0L);
        if (n3 < 0) {
            throw new IllegalArgumentException(g7.g("count >= 0 required but it was ", n2));
        }
        if (n3 == 0) {
            return empty();
        }
        if (n2 == 1L) {
            return just(n);
        }
        if (n > 0L && n2 - 1L + n < 0L) {
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        return RxJavaPlugins.onAssembly((g<Long>)new FlowableRangeLong(n, n2));
    }
    
    public static <T> c0<Boolean> sequenceEqual(final b<? extends T> b, final b<? extends T> b2) {
        return sequenceEqual((qt2.b<?>)b, (qt2.b<?>)b2, (kf2.d<? super Object, ? super Object>)a.a, bufferSize());
    }
    
    public static <T> c0<Boolean> sequenceEqual(final b<? extends T> b, final b<? extends T> b2, final int n) {
        return sequenceEqual((qt2.b<?>)b, (qt2.b<?>)b2, (kf2.d<? super Object, ? super Object>)a.a, n);
    }
    
    public static <T> c0<Boolean> sequenceEqual(final b<? extends T> b, final b<? extends T> b2, final kf2.d<? super T, ? super T> d) {
        return sequenceEqual((qt2.b<?>)b, (qt2.b<?>)b2, (kf2.d<? super Object, ? super Object>)d, bufferSize());
    }
    
    public static <T> c0<Boolean> sequenceEqual(final b<? extends T> b, final b<? extends T> b2, final kf2.d<? super T, ? super T> d, final int n) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (d != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((c0<Boolean>)new FlowableSequenceEqualSingle<Object>(b, b2, d, n));
        }
        throw new NullPointerException("isEqual is null");
    }
    
    public static <T> g<T> switchOnNext(final b<? extends b<? extends T>> b) {
        return fromPublisher((qt2.b<?>)b).switchMap((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a);
    }
    
    public static <T> g<T> switchOnNext(final b<? extends b<? extends T>> b, final int n) {
        return fromPublisher((qt2.b<?>)b).switchMap((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a, n);
    }
    
    public static <T> g<T> switchOnNextDelayError(final b<? extends b<? extends T>> b) {
        return switchOnNextDelayError(b, bufferSize());
    }
    
    public static <T> g<T> switchOnNextDelayError(final b<? extends b<? extends T>> b, final int n) {
        return fromPublisher((qt2.b<?>)b).switchMapDelayError((kf2.o<? super Object, ? extends qt2.b<? extends T>>)Functions.a, n);
    }
    
    private g<T> timeout0(final long n, final TimeUnit timeUnit, final b<? extends T> b, final ff2.b0 b2) {
        if (timeUnit == null) {
            throw new NullPointerException("timeUnit is null");
        }
        if (b2 != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableTimeoutTimed(this, n, timeUnit, b2, (b)b));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    private <U, V> g<T> timeout0(final b<U> b, final o<? super T, ? extends b<V>> o, final b<? extends T> b2) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableTimeout(this, (b)b, (o)o, (b)b2));
        }
        throw new NullPointerException("itemTimeoutIndicator is null");
    }
    
    public static g<Long> timer(final long n, final TimeUnit timeUnit) {
        return timer(n, timeUnit, eg2.a.a());
    }
    
    public static g<Long> timer(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g<Long>)new FlowableTimer(Math.max(0L, n), timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static <T> g<T> unsafeCreate(final b<T> b) {
        if (b == null) {
            throw new NullPointerException("onSubscribe is null");
        }
        if (!(b instanceof g)) {
            return RxJavaPlugins.onAssembly((g<T>)new d0((b)b));
        }
        throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
    }
    
    public static <T, D> g<T> using(final Callable<? extends D> callable, final o<? super D, ? extends b<? extends T>> o, final kf2.g<? super D> g) {
        return using((Callable<?>)callable, (kf2.o<? super Object, ? extends qt2.b<? extends T>>)o, (kf2.g<? super Object>)g, true);
    }
    
    public static <T, D> g<T> using(final Callable<? extends D> callable, final o<? super D, ? extends b<? extends T>> o, final kf2.g<? super D> g, final boolean b) {
        if (callable == null) {
            throw new NullPointerException("resourceSupplier is null");
        }
        if (o == null) {
            throw new NullPointerException("sourceSupplier is null");
        }
        if (g != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableUsing(callable, (kf2.o<? super Object, ? extends qt2.b<?>>)o, (kf2.g<? super Object>)g, b));
        }
        throw new NullPointerException("resourceDisposer is null");
    }
    
    public static <T, R> g<R> zip(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        if (o == null) {
            throw new NullPointerException("zipper is null");
        }
        if (iterable != null) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableZip(null, iterable, o, bufferSize(), false));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T, R> g<R> zip(final b<? extends b<? extends T>> b, final o<? super Object[], ? extends R> o) {
        if (o != null) {
            return fromPublisher((qt2.b<?>)b).toList().t((kf2.o<? super List<Object>, ? extends qt2.b<? extends R>>)new v0(o));
        }
        throw new NullPointerException("zipper is null");
    }
    
    public static <T1, T2, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final c<? super T1, ? super T2, ? extends R> c) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return zipArray((kf2.o<? super Object[], ? extends R>)Functions.c(c), false, bufferSize(), (qt2.b<?>[])new b[] { b, b2 });
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T1, T2, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final c<? super T1, ? super T2, ? extends R> c, final boolean b3) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return zipArray((kf2.o<? super Object[], ? extends R>)Functions.c(c), b3, bufferSize(), (qt2.b<?>[])new b[] { b, b2 });
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T1, T2, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final c<? super T1, ? super T2, ? extends R> c, final boolean b3, final int n) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return zipArray((kf2.o<? super Object[], ? extends R>)Functions.c(c), b3, n, (qt2.b<?>[])new b[] { b, b2 });
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T1, T2, T3, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final h<? super T1, ? super T2, ? super T3, ? extends R> h) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 != null) {
            return zipArray((kf2.o<? super Object[], ? extends R>)Functions.d(h), false, bufferSize(), (qt2.b<?>[])new b[] { b, b2, b3 });
        }
        throw new NullPointerException("source3 is null");
    }
    
    public static <T1, T2, T3, T4, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 != null) {
            return zipArray((kf2.o<? super Object[], ? extends R>)Functions.e(i), false, bufferSize(), (qt2.b<?>[])new b[] { b, b2, b3, b4 });
        }
        throw new NullPointerException("source4 is null");
    }
    
    public static <T1, T2, T3, T4, T5, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> j) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (b5 != null) {
            return zipArray((kf2.o<? super Object[], ? extends R>)Functions.f(j), false, bufferSize(), (qt2.b<?>[])new b[] { b, b2, b3, b4, b5 });
        }
        throw new NullPointerException("source5 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> k) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (b5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (b6 != null) {
            return zipArray((kf2.o<? super Object[], ? extends R>)Functions.g(k), false, bufferSize(), (qt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6 });
        }
        throw new NullPointerException("source6 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final b<? extends T7> b7, final l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> l) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (b5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (b6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (b7 != null) {
            return zipArray((kf2.o<? super Object[], ? extends R>)Functions.h(l), false, bufferSize(), (qt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6, b7 });
        }
        throw new NullPointerException("source7 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final b<? extends T7> b7, final b<? extends T8> b8, final m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> m) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (b5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (b6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (b7 == null) {
            throw new NullPointerException("source7 is null");
        }
        if (b8 != null) {
            return zipArray((kf2.o<? super Object[], ? extends R>)Functions.i(m), false, bufferSize(), (qt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6, b7, b8 });
        }
        throw new NullPointerException("source8 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final b<? extends T3> b3, final b<? extends T4> b4, final b<? extends T5> b5, final b<? extends T6> b6, final b<? extends T7> b7, final b<? extends T8> b8, final b<? extends T9> b9, final n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> n) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (b5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (b6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (b7 == null) {
            throw new NullPointerException("source7 is null");
        }
        if (b8 == null) {
            throw new NullPointerException("source8 is null");
        }
        if (b9 != null) {
            return zipArray((kf2.o<? super Object[], ? extends R>)Functions.j(n), false, bufferSize(), (qt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6, b7, b8, b9 });
        }
        throw new NullPointerException("source9 is null");
    }
    
    public static <T, R> g<R> zipArray(final o<? super Object[], ? extends R> o, final boolean b, final int n, final b<? extends T>... array) {
        if (array.length == 0) {
            return empty();
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g<R>)new FlowableZip(array, null, o, n, b));
        }
        throw new NullPointerException("zipper is null");
    }
    
    public static <T, R> g<R> zipIterable(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o, final boolean b, final int n) {
        if (o == null) {
            throw new NullPointerException("zipper is null");
        }
        if (iterable != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g<R>)new FlowableZip(null, iterable, o, n, b));
        }
        throw new NullPointerException("sources is null");
    }
    
    public final c0<Boolean> all(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((c0<Boolean>)new e(this, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final g<T> ambWith(final b<? extends T> b) {
        if (b != null) {
            return ambArray((b)this, b);
        }
        throw new NullPointerException("other is null");
    }
    
    public final c0<Boolean> any(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((c0<Boolean>)new qf2.f(this, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final <R> R as(final ff2.h<T, ? extends R> h) {
        if (h != null) {
            return (R)h.apply();
        }
        throw new NullPointerException("converter is null");
    }
    
    public final T blockingFirst() {
        final xf2.d<Object> d = new xf2.d<Object>();
        this.subscribe((ff2.l<? super T>)d);
        final Object a = d.a();
        if (a != null) {
            return (T)a;
        }
        throw new NoSuchElementException();
    }
    
    public final T blockingFirst(T t) {
        final xf2.d<Object> d = new xf2.d<Object>();
        this.subscribe((ff2.l<? super T>)d);
        final Object a = d.a();
        if (a != null) {
            t = (T)a;
        }
        return t;
    }
    
    public final void blockingForEach(final kf2.g<? super T> g) {
        final Iterator<T> iterator = this.blockingIterable().iterator();
        while (iterator.hasNext()) {
            try {
                g.accept((Object)iterator.next());
                continue;
            }
            finally {
                ej2.c0.i4((Throwable)g);
                ((if2.a)iterator).dispose();
                throw ExceptionHelper.d((Throwable)g);
            }
            break;
        }
    }
    
    public final Iterable<T> blockingIterable() {
        return this.blockingIterable(bufferSize());
    }
    
    public final Iterable<T> blockingIterable(final int n) {
        a.c(n, "bufferSize");
        return new BlockingFlowableIterable<T>(this, n);
    }
    
    public final T blockingLast() {
        final xf2.e<Object> e = new xf2.e<Object>();
        this.subscribe((ff2.l<? super T>)e);
        final Object a = e.a();
        if (a != null) {
            return (T)a;
        }
        throw new NoSuchElementException();
    }
    
    public final T blockingLast(T t) {
        final xf2.e<Object> e = new xf2.e<Object>();
        this.subscribe((ff2.l<? super T>)e);
        final Object a = e.a();
        if (a != null) {
            t = (T)a;
        }
        return t;
    }
    
    public final Iterable<T> blockingLatest() {
        return (Iterable<T>)new qf2.b((b)this);
    }
    
    public final Iterable<T> blockingMostRecent(final T t) {
        return (Iterable<T>)new qf2.c(this, (Object)t);
    }
    
    public final Iterable<T> blockingNext() {
        return (Iterable<T>)new qf2.d((b)this);
    }
    
    public final T blockingSingle() {
        return this.singleOrError().e();
    }
    
    public final T blockingSingle(final T t) {
        return this.single(t).e();
    }
    
    public final void blockingSubscribe() {
        final yf2.b b = new yf2.b();
        final LambdaSubscriber lambdaSubscriber = new LambdaSubscriber((kf2.g)Functions.d, (kf2.g)b, (kf2.a)b, (kf2.g)Functions.k);
        ((b)this).subscribe((qt2.c)lambdaSubscriber);
        ui.b.j(b, (if2.a)lambdaSubscriber);
        final Throwable f = b.f;
        if (f == null) {
            return;
        }
        throw ExceptionHelper.d(f);
    }
    
    public final void blockingSubscribe(final kf2.g<? super T> g) {
        a4.a0.F0((b)this, g, (kf2.g)Functions.e, (kf2.a)Functions.c);
    }
    
    public final void blockingSubscribe(final kf2.g<? super T> g, final int n) {
        a4.a0.G0((b)this, g, (kf2.g)Functions.e, (kf2.a)Functions.c, n);
    }
    
    public final void blockingSubscribe(final kf2.g<? super T> g, final kf2.g<? super Throwable> g2) {
        a4.a0.F0((b)this, g, g2, (kf2.a)Functions.c);
    }
    
    public final void blockingSubscribe(final kf2.g<? super T> g, final kf2.g<? super Throwable> g2, final int n) {
        a4.a0.G0((b)this, g, g2, (kf2.a)Functions.c, n);
    }
    
    public final void blockingSubscribe(final kf2.g<? super T> g, final kf2.g<? super Throwable> g2, final kf2.a a) {
        a4.a0.F0((b)this, g, g2, a);
    }
    
    public final void blockingSubscribe(final kf2.g<? super T> g, final kf2.g<? super Throwable> g2, final kf2.a a, final int n) {
        a4.a0.G0((b)this, g, g2, a, n);
    }
    
    public final void blockingSubscribe(final qt2.c<? super T> c) {
        a4.a0.H0(c, (b)this);
    }
    
    public final g<List<T>> buffer(final int n) {
        return this.buffer(n, n);
    }
    
    public final g<List<T>> buffer(final int n, final int n2) {
        return this.buffer(n, n2, ArrayListSupplier.asCallable());
    }
    
    public final <U extends Collection<? super T>> g<U> buffer(final int n, final int n2, final Callable<U> callable) {
        a.c(n, "count");
        a.c(n2, "skip");
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g<U>)new FlowableBuffer(this, n, n2, (Callable)callable));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final <U extends Collection<? super T>> g<U> buffer(final int n, final Callable<U> callable) {
        return this.buffer(n, n, callable);
    }
    
    public final g<List<T>> buffer(final long n, final long n2, final TimeUnit timeUnit) {
        return this.buffer(n, n2, timeUnit, eg2.a.a(), ArrayListSupplier.asCallable());
    }
    
    public final g<List<T>> buffer(final long n, final long n2, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.buffer(n, n2, timeUnit, b0, ArrayListSupplier.asCallable());
    }
    
    public final <U extends Collection<? super T>> g<U> buffer(final long n, final long n2, final TimeUnit timeUnit, final ff2.b0 b0, final Callable<U> callable) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g<U>)new qf2.i(this, n, n2, timeUnit, b0, (Callable)callable, Integer.MAX_VALUE, false));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final g<List<T>> buffer(final long n, final TimeUnit timeUnit) {
        return this.buffer(n, timeUnit, eg2.a.a(), Integer.MAX_VALUE);
    }
    
    public final g<List<T>> buffer(final long n, final TimeUnit timeUnit, final int n2) {
        return this.buffer(n, timeUnit, eg2.a.a(), n2);
    }
    
    public final g<List<T>> buffer(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.buffer(n, timeUnit, b0, Integer.MAX_VALUE, ArrayListSupplier.asCallable(), false);
    }
    
    public final g<List<T>> buffer(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final int n2) {
        return this.buffer(n, timeUnit, b0, n2, ArrayListSupplier.asCallable(), false);
    }
    
    public final <U extends Collection<? super T>> g<U> buffer(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final int n2, final Callable<U> callable, final boolean b2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        if (callable != null) {
            a.c(n2, "count");
            return RxJavaPlugins.onAssembly((g<U>)new qf2.i(this, n, n, timeUnit, b0, (Callable)callable, n2, b2));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final <TOpening, TClosing> g<List<T>> buffer(final g<? extends TOpening> g, final o<? super TOpening, ? extends b<? extends TClosing>> o) {
        return this.buffer((g<?>)g, (kf2.o<? super Object, ? extends qt2.b<?>>)o, ArrayListSupplier.asCallable());
    }
    
    public final <TOpening, TClosing, U extends Collection<? super T>> g<U> buffer(final g<? extends TOpening> g, final o<? super TOpening, ? extends b<? extends TClosing>> o, final Callable<U> callable) {
        if (g == null) {
            throw new NullPointerException("openingIndicator is null");
        }
        if (o == null) {
            throw new NullPointerException("closingIndicator is null");
        }
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g<U>)new FlowableBufferBoundary(this, (b)g, (o)o, (Callable)callable));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final <B> g<List<T>> buffer(final Callable<? extends b<B>> callable) {
        return this.buffer((Callable<? extends qt2.b<Object>>)callable, ArrayListSupplier.asCallable());
    }
    
    public final <B, U extends Collection<? super T>> g<U> buffer(final Callable<? extends b<B>> callable, final Callable<U> callable2) {
        if (callable == null) {
            throw new NullPointerException("boundaryIndicatorSupplier is null");
        }
        if (callable2 != null) {
            return RxJavaPlugins.onAssembly((g<U>)new qf2.g(this, (Callable)callable, (Callable)callable2));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final <B> g<List<T>> buffer(final b<B> b) {
        return this.buffer((qt2.b<Object>)b, ArrayListSupplier.asCallable());
    }
    
    public final <B> g<List<T>> buffer(final b<B> b, final int n) {
        a.c(n, "initialCapacity");
        return this.buffer((qt2.b<Object>)b, new Functions.j<T>(n));
    }
    
    public final <B, U extends Collection<? super T>> g<U> buffer(final b<B> b, final Callable<U> callable) {
        if (b == null) {
            throw new NullPointerException("boundaryIndicator is null");
        }
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g<U>)new qf2.h(this, (b)b, (Callable)callable));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final g<T> cache() {
        return this.cacheWithInitialCapacity(16);
    }
    
    public final g<T> cacheWithInitialCapacity(final int n) {
        a.c(n, "initialCapacity");
        return RxJavaPlugins.onAssembly((g<T>)new FlowableCache(this, n));
    }
    
    public final <U> g<U> cast(final Class<U> clazz) {
        if (clazz != null) {
            return this.map((kf2.o<? super T, ? extends U>)new Functions$m((Class)clazz));
        }
        throw new NullPointerException("clazz is null");
    }
    
    public final <U> c0<U> collect(final Callable<? extends U> callable, final kf2.b<? super U, ? super T> b) {
        if (callable == null) {
            throw new NullPointerException("initialItemSupplier is null");
        }
        if (b != null) {
            return RxJavaPlugins.onAssembly((c0<U>)new qf2.j(this, (Callable)callable, (kf2.b)b));
        }
        throw new NullPointerException("collector is null");
    }
    
    public final <U> c0<U> collectInto(final U u, final kf2.b<? super U, ? super T> b) {
        if (u != null) {
            return this.collect((Callable<? extends U>)new Functions$w((Object)u), b);
        }
        throw new NullPointerException("initialItem is null");
    }
    
    public final <R> g<R> compose(final ff2.m<? super T, ? extends R> m) {
        if (m != null) {
            return fromPublisher((qt2.b<? extends R>)m.c(this));
        }
        throw new NullPointerException("composer is null");
    }
    
    public final <R> g<R> concatMap(final o<? super T, ? extends b<? extends R>> o) {
        return this.concatMap(o, 2);
    }
    
    public final <R> g<R> concatMap(final o<? super T, ? extends b<? extends R>> o, final int n) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        a.c(n, "prefetch");
        if (!(this instanceof nf2.h)) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableConcatMap(n, this, (o)o, ErrorMode.IMMEDIATE));
        }
        final Object call = ((nf2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((g<R>)new f1$a((o)o, call));
    }
    
    public final ff2.a concatMapCompletable(final o<? super T, ? extends ff2.e> o) {
        return this.concatMapCompletable(o, 2);
    }
    
    public final ff2.a concatMapCompletable(final o<? super T, ? extends ff2.e> o, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly(new FlowableConcatMapCompletable<Object>(n, this, o, ErrorMode.IMMEDIATE));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final ff2.a concatMapCompletableDelayError(final o<? super T, ? extends ff2.e> o) {
        return this.concatMapCompletableDelayError(o, true, 2);
    }
    
    public final ff2.a concatMapCompletableDelayError(final o<? super T, ? extends ff2.e> o, final boolean b) {
        return this.concatMapCompletableDelayError(o, b, 2);
    }
    
    public final ff2.a concatMapCompletableDelayError(final o<? super T, ? extends ff2.e> o, final boolean b, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            ErrorMode errorMode;
            if (b) {
                errorMode = ErrorMode.END;
            }
            else {
                errorMode = ErrorMode.BOUNDARY;
            }
            return RxJavaPlugins.onAssembly(new FlowableConcatMapCompletable<Object>(n, this, o, errorMode));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> concatMapDelayError(final o<? super T, ? extends b<? extends R>> o) {
        return this.concatMapDelayError(o, 2, true);
    }
    
    public final <R> g<R> concatMapDelayError(final o<? super T, ? extends b<? extends R>> o, final int n, final boolean b) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        a.c(n, "prefetch");
        if (!(this instanceof nf2.h)) {
            ErrorMode errorMode;
            if (b) {
                errorMode = ErrorMode.END;
            }
            else {
                errorMode = ErrorMode.BOUNDARY;
            }
            return RxJavaPlugins.onAssembly((g<R>)new FlowableConcatMap(n, this, (o)o, errorMode));
        }
        final Object call = ((nf2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((g<R>)new f1$a((o)o, call));
    }
    
    public final <R> g<R> concatMapEager(final o<? super T, ? extends b<? extends R>> o) {
        return this.concatMapEager(o, bufferSize(), bufferSize());
    }
    
    public final <R> g<R> concatMapEager(final o<? super T, ? extends b<? extends R>> o, final int n, final int n2) {
        if (o != null) {
            a.c(n, "maxConcurrency");
            a.c(n2, "prefetch");
            return RxJavaPlugins.onAssembly((g<R>)new FlowableConcatMapEager(this, (o)o, n, n2, ErrorMode.IMMEDIATE));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> concatMapEagerDelayError(final o<? super T, ? extends b<? extends R>> o, final int n, final int n2, final boolean b) {
        if (o != null) {
            a.c(n, "maxConcurrency");
            a.c(n2, "prefetch");
            ErrorMode errorMode;
            if (b) {
                errorMode = ErrorMode.END;
            }
            else {
                errorMode = ErrorMode.BOUNDARY;
            }
            return RxJavaPlugins.onAssembly((g<R>)new FlowableConcatMapEager(this, (o)o, n, n2, errorMode));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> concatMapEagerDelayError(final o<? super T, ? extends b<? extends R>> o, final boolean b) {
        return this.concatMapEagerDelayError(o, bufferSize(), bufferSize(), b);
    }
    
    public final <U> g<U> concatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o) {
        return this.concatMapIterable(o, 2);
    }
    
    public final <U> g<U> concatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly((g<U>)new FlowableFlattenIterable(this, (o)o, n));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> concatMapMaybe(final o<? super T, ? extends r<? extends R>> o) {
        return this.concatMapMaybe(o, 2);
    }
    
    public final <R> g<R> concatMapMaybe(final o<? super T, ? extends r<? extends R>> o, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly((g<R>)new FlowableConcatMapMaybe(n, this, o, ErrorMode.IMMEDIATE));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> concatMapMaybeDelayError(final o<? super T, ? extends r<? extends R>> o) {
        return this.concatMapMaybeDelayError(o, true, 2);
    }
    
    public final <R> g<R> concatMapMaybeDelayError(final o<? super T, ? extends r<? extends R>> o, final boolean b) {
        return this.concatMapMaybeDelayError(o, b, 2);
    }
    
    public final <R> g<R> concatMapMaybeDelayError(final o<? super T, ? extends r<? extends R>> o, final boolean b, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            ErrorMode errorMode;
            if (b) {
                errorMode = ErrorMode.END;
            }
            else {
                errorMode = ErrorMode.BOUNDARY;
            }
            return RxJavaPlugins.onAssembly((g<R>)new FlowableConcatMapMaybe(n, this, o, errorMode));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> concatMapSingle(final o<? super T, ? extends g0<? extends R>> o) {
        return this.concatMapSingle(o, 2);
    }
    
    public final <R> g<R> concatMapSingle(final o<? super T, ? extends g0<? extends R>> o, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly((g<R>)new FlowableConcatMapSingle(n, this, o, ErrorMode.IMMEDIATE));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> concatMapSingleDelayError(final o<? super T, ? extends g0<? extends R>> o) {
        return this.concatMapSingleDelayError(o, true, 2);
    }
    
    public final <R> g<R> concatMapSingleDelayError(final o<? super T, ? extends g0<? extends R>> o, final boolean b) {
        return this.concatMapSingleDelayError(o, b, 2);
    }
    
    public final <R> g<R> concatMapSingleDelayError(final o<? super T, ? extends g0<? extends R>> o, final boolean b, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            ErrorMode errorMode;
            if (b) {
                errorMode = ErrorMode.END;
            }
            else {
                errorMode = ErrorMode.BOUNDARY;
            }
            return RxJavaPlugins.onAssembly((g<R>)new FlowableConcatMapSingle(n, this, o, errorMode));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final g<T> concatWith(final ff2.e e) {
        if (e != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableConcatWithCompletable(this, e));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> concatWith(final g0<? extends T> g0) {
        if (g0 != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableConcatWithSingle(this, (g0)g0));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> concatWith(final r<? extends T> r) {
        if (r != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableConcatWithMaybe(this, (r)r));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> concatWith(final b<? extends T> b) {
        if (b != null) {
            return concat((qt2.b<? extends T>)this, b);
        }
        throw new NullPointerException("other is null");
    }
    
    public final c0<Boolean> contains(final Object o) {
        if (o != null) {
            return this.any((q<? super T>)new Functions$s(o));
        }
        throw new NullPointerException("item is null");
    }
    
    public final c0<Long> count() {
        return RxJavaPlugins.onAssembly((c0<Long>)new qf2.l(this));
    }
    
    public final g<T> debounce(final long n, final TimeUnit timeUnit) {
        return this.debounce(n, timeUnit, eg2.a.a());
    }
    
    public final g<T> debounce(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableDebounceTimed(this, n, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <U> g<T> debounce(final o<? super T, ? extends b<U>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableDebounce(this, (o)o));
        }
        throw new NullPointerException("debounceIndicator is null");
    }
    
    public final g<T> defaultIfEmpty(final T t) {
        if (t != null) {
            return this.switchIfEmpty((b<? extends T>)just(t));
        }
        throw new NullPointerException("defaultItem is null");
    }
    
    public final g<T> delay(final long n, final TimeUnit timeUnit) {
        return this.delay(n, timeUnit, eg2.a.a(), false);
    }
    
    public final g<T> delay(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.delay(n, timeUnit, b0, false);
    }
    
    public final g<T> delay(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final boolean b2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g<T>)new qf2.n(this, Math.max(0L, n), timeUnit, b0, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> delay(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.delay(n, timeUnit, eg2.a.a(), b);
    }
    
    public final <U> g<T> delay(final o<? super T, ? extends b<U>> o) {
        if (o != null) {
            return this.flatMap((kf2.o<? super T, ? extends qt2.b<? extends T>>)new m0((kf2.o<? super Object, ? extends qt2.b<Object>>)o));
        }
        throw new NullPointerException("itemDelayIndicator is null");
    }
    
    public final <U, V> g<T> delay(final b<U> b, final o<? super T, ? extends b<V>> o) {
        return this.delaySubscription((qt2.b<Object>)b).delay((kf2.o<? super T, ? extends qt2.b<Object>>)o);
    }
    
    public final g<T> delaySubscription(final long n, final TimeUnit timeUnit) {
        return this.delaySubscription(n, timeUnit, eg2.a.a());
    }
    
    public final g<T> delaySubscription(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.delaySubscription((qt2.b<Object>)timer(n, timeUnit, b0));
    }
    
    public final <U> g<T> delaySubscription(final b<U> b) {
        if (b != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableDelaySubscriptionOther((b)this, (b)b));
        }
        throw new NullPointerException("subscriptionIndicator is null");
    }
    
    @Deprecated
    public final <T2> g<T2> dematerialize() {
        return RxJavaPlugins.onAssembly((g<T2>)new qf2.o(this, (o)Functions.a));
    }
    
    public final <R> g<R> dematerialize(final o<? super T, s<R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<R>)new qf2.o(this, (o)o));
        }
        throw new NullPointerException("selector is null");
    }
    
    public final g<T> distinct() {
        return this.distinct((kf2.o<? super T, Object>)Functions.a, Functions.a());
    }
    
    public final <K> g<T> distinct(final o<? super T, K> o) {
        return this.distinct((kf2.o<? super T, Object>)o, Functions.a());
    }
    
    public final <K> g<T> distinct(final o<? super T, K> o, final Callable<? extends Collection<? super K>> callable) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g<T>)new qf2.q(this, (o)o, (Callable)callable));
        }
        throw new NullPointerException("collectionSupplier is null");
    }
    
    public final g<T> distinctUntilChanged() {
        return this.distinctUntilChanged((kf2.o<? super T, Object>)Functions.a);
    }
    
    public final g<T> distinctUntilChanged(final kf2.d<? super T, ? super T> d) {
        if (d != null) {
            return RxJavaPlugins.onAssembly((g<T>)new qf2.r(this, (o)Functions.a, (kf2.d)d));
        }
        throw new NullPointerException("comparer is null");
    }
    
    public final <K> g<T> distinctUntilChanged(final o<? super T, K> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<T>)new qf2.r(this, (o)o, (kf2.d)a.a));
        }
        throw new NullPointerException("keySelector is null");
    }
    
    public final g<T> doAfterNext(final kf2.g<? super T> g) {
        if (g != null) {
            return RxJavaPlugins.onAssembly((g<T>)new qf2.s(this, (kf2.g)g));
        }
        throw new NullPointerException("onAfterNext is null");
    }
    
    public final g<T> doAfterTerminate(final kf2.a a) {
        final Functions.Functions$p d = Functions.d;
        return this.doOnEach((kf2.g<? super T>)d, (kf2.g<? super Throwable>)d, (kf2.a)Functions.c, a);
    }
    
    public final g<T> doFinally(final kf2.a a) {
        if (a != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableDoFinally(this, a));
        }
        throw new NullPointerException("onFinally is null");
    }
    
    public final g<T> doOnCancel(final kf2.a a) {
        return this.doOnLifecycle((kf2.g<? super qt2.d>)Functions.d, (p)Functions.f, a);
    }
    
    public final g<T> doOnComplete(final kf2.a a) {
        final Functions.Functions$p d = Functions.d;
        return this.doOnEach((kf2.g<? super T>)d, (kf2.g<? super Throwable>)d, a, (kf2.a)Functions.c);
    }
    
    public final g<T> doOnEach(final kf2.g<? super s<T>> g) {
        if (g != null) {
            return this.doOnEach((kf2.g<? super T>)new Functions$c0((kf2.g)g), (kf2.g<? super Throwable>)new Functions$b0((kf2.g)g), (kf2.a)new Functions$a0((kf2.g)g), (kf2.a)Functions.c);
        }
        throw new NullPointerException("onNotification is null");
    }
    
    public final g<T> doOnEach(final qt2.c<? super T> c) {
        if (c != null) {
            return this.doOnEach((kf2.g<? super T>)new t0((qt2.c<Object>)c), (kf2.g<? super Throwable>)new s0((qt2.c<Object>)c), (kf2.a)new r0((qt2.c<Object>)c), (kf2.a)Functions.c);
        }
        throw new NullPointerException("subscriber is null");
    }
    
    public final g<T> doOnError(final kf2.g<? super Throwable> g) {
        final Functions.Functions$p d = Functions.d;
        final Functions.Functions$o c = Functions.c;
        return this.doOnEach((kf2.g<? super T>)d, g, (kf2.a)c, (kf2.a)c);
    }
    
    public final g<T> doOnLifecycle(final kf2.g<? super qt2.d> g, final p p3, final kf2.a a) {
        if (g == null) {
            throw new NullPointerException("onSubscribe is null");
        }
        if (p3 == null) {
            throw new NullPointerException("onRequest is null");
        }
        if (a != null) {
            return RxJavaPlugins.onAssembly((g<T>)new u(this, (kf2.g)g, p3, a));
        }
        throw new NullPointerException("onCancel is null");
    }
    
    public final g<T> doOnNext(final kf2.g<? super T> g) {
        final Functions.Functions$p d = Functions.d;
        final Functions.Functions$o c = Functions.c;
        return this.doOnEach(g, (kf2.g<? super Throwable>)d, (kf2.a)c, (kf2.a)c);
    }
    
    public final g<T> doOnRequest(final p p) {
        return this.doOnLifecycle((kf2.g<? super qt2.d>)Functions.d, p, (kf2.a)Functions.c);
    }
    
    public final g<T> doOnSubscribe(final kf2.g<? super qt2.d> g) {
        return this.doOnLifecycle(g, (p)Functions.f, (kf2.a)Functions.c);
    }
    
    public final g<T> doOnTerminate(final kf2.a a) {
        return this.doOnEach((kf2.g<? super T>)Functions.d, (kf2.g<? super Throwable>)new Functions$a(a), a, (kf2.a)Functions.c);
    }
    
    public final c0<T> elementAt(final long n, final T t) {
        if (n < 0L) {
            throw new IndexOutOfBoundsException(g7.g("index >= 0 required but it was ", n));
        }
        if (t != null) {
            return RxJavaPlugins.onAssembly((c0<T>)new w(this, n, (Object)t));
        }
        throw new NullPointerException("defaultItem is null");
    }
    
    public final ff2.n<T> elementAt(final long n) {
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((ff2.n<T>)new v(n, this));
        }
        throw new IndexOutOfBoundsException(g7.g("index >= 0 required but it was ", n));
    }
    
    public final c0<T> elementAtOrError(final long n) {
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((c0<T>)new w(this, n, (Object)null));
        }
        throw new IndexOutOfBoundsException(g7.g("index >= 0 required but it was ", n));
    }
    
    public final g<T> filter(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((g<T>)new z(this, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final c0<T> first(final T t) {
        return this.elementAt(0L, t);
    }
    
    public final ff2.n<T> firstElement() {
        return this.elementAt(0L);
    }
    
    public final c0<T> firstOrError() {
        return this.elementAtOrError(0L);
    }
    
    public final <R> g<R> flatMap(final o<? super T, ? extends b<? extends R>> o) {
        return this.flatMap(o, false, bufferSize(), bufferSize());
    }
    
    public final <R> g<R> flatMap(final o<? super T, ? extends b<? extends R>> o, final int n) {
        return this.flatMap(o, false, n, bufferSize());
    }
    
    public final <U, R> g<R> flatMap(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c) {
        return this.flatMap((kf2.o<? super T, ? extends qt2.b<?>>)o, (kf2.c<? super T, ? super Object, ? extends R>)c, false, bufferSize(), bufferSize());
    }
    
    public final <U, R> g<R> flatMap(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final int n) {
        return this.flatMap((kf2.o<? super T, ? extends qt2.b<?>>)o, (kf2.c<? super T, ? super Object, ? extends R>)c, false, n, bufferSize());
    }
    
    public final <U, R> g<R> flatMap(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b) {
        return this.flatMap((kf2.o<? super T, ? extends qt2.b<?>>)o, (kf2.c<? super T, ? super Object, ? extends R>)c, b, bufferSize(), bufferSize());
    }
    
    public final <U, R> g<R> flatMap(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b, final int n) {
        return this.flatMap((kf2.o<? super T, ? extends qt2.b<?>>)o, (kf2.c<? super T, ? super Object, ? extends R>)c, b, n, bufferSize());
    }
    
    public final <U, R> g<R> flatMap(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b, final int n, final int n2) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        if (c != null) {
            a.c(n, "maxConcurrency");
            a.c(n2, "bufferSize");
            return this.flatMap((kf2.o<? super T, ? extends qt2.b<? extends R>>)new l0((o)o, (c)c), b, n, n2);
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <R> g<R> flatMap(final o<? super T, ? extends b<? extends R>> o, final o<? super Throwable, ? extends b<? extends R>> o2, final Callable<? extends b<? extends R>> callable) {
        if (o == null) {
            throw new NullPointerException("onNextMapper is null");
        }
        if (o2 == null) {
            throw new NullPointerException("onErrorMapper is null");
        }
        if (callable != null) {
            return merge((qt2.b<? extends qt2.b<? extends R>>)new FlowableMapNotification(this, (o)o, (o)o2, (Callable)callable));
        }
        throw new NullPointerException("onCompleteSupplier is null");
    }
    
    public final <R> g<R> flatMap(final o<? super T, ? extends b<? extends R>> o, final o<Throwable, ? extends b<? extends R>> o2, final Callable<? extends b<? extends R>> callable, final int n) {
        if (o == null) {
            throw new NullPointerException("onNextMapper is null");
        }
        if (o2 == null) {
            throw new NullPointerException("onErrorMapper is null");
        }
        if (callable != null) {
            return merge((qt2.b<? extends qt2.b<? extends R>>)new FlowableMapNotification(this, (o)o, (o)o2, (Callable)callable), n);
        }
        throw new NullPointerException("onCompleteSupplier is null");
    }
    
    public final <R> g<R> flatMap(final o<? super T, ? extends b<? extends R>> o, final boolean b) {
        return this.flatMap(o, b, bufferSize(), bufferSize());
    }
    
    public final <R> g<R> flatMap(final o<? super T, ? extends b<? extends R>> o, final boolean b, final int n) {
        return this.flatMap(o, b, n, bufferSize());
    }
    
    public final <R> g<R> flatMap(final o<? super T, ? extends b<? extends R>> o, final boolean b, final int n, final int n2) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        a.c(n, "maxConcurrency");
        a.c(n2, "bufferSize");
        if (!(this instanceof nf2.h)) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableFlatMap(this, (o)o, b, n, n2));
        }
        final Object call = ((nf2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((g<R>)new f1$a((o)o, call));
    }
    
    public final ff2.a flatMapCompletable(final o<? super T, ? extends ff2.e> o) {
        return this.flatMapCompletable(o, false, Integer.MAX_VALUE);
    }
    
    public final ff2.a flatMapCompletable(final o<? super T, ? extends ff2.e> o, final boolean b, final int n) {
        if (o != null) {
            a.c(n, "maxConcurrency");
            return RxJavaPlugins.onAssembly((ff2.a)new FlowableFlatMapCompletableCompletable(n, this, (o)o, b));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <U> g<U> flatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o) {
        return this.flatMapIterable(o, bufferSize());
    }
    
    public final <U> g<U> flatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o, final int n) {
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g<U>)new FlowableFlattenIterable(this, (o)o, n));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <U, V> g<V> flatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o, final c<? super T, ? super U, ? extends V> c) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        if (c != null) {
            return this.flatMap((kf2.o<? super T, ? extends qt2.b<?>>)new j0((o)o), (kf2.c<? super T, ? super Object, ? extends V>)c, false, bufferSize(), bufferSize());
        }
        throw new NullPointerException("resultSelector is null");
    }
    
    public final <U, V> g<V> flatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o, final c<? super T, ? super U, ? extends V> c, final int n) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        if (c != null) {
            return this.flatMap((kf2.o<? super T, ? extends qt2.b<?>>)new j0((o)o), (kf2.c<? super T, ? super Object, ? extends V>)c, false, bufferSize(), n);
        }
        throw new NullPointerException("resultSelector is null");
    }
    
    public final <R> g<R> flatMapMaybe(final o<? super T, ? extends r<? extends R>> o) {
        return this.flatMapMaybe(o, false, Integer.MAX_VALUE);
    }
    
    public final <R> g<R> flatMapMaybe(final o<? super T, ? extends r<? extends R>> o, final boolean b, final int n) {
        if (o != null) {
            a.c(n, "maxConcurrency");
            return RxJavaPlugins.onAssembly((g<R>)new FlowableFlatMapMaybe(n, this, (o)o, b));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> flatMapSingle(final o<? super T, ? extends g0<? extends R>> o) {
        return this.flatMapSingle(o, false, Integer.MAX_VALUE);
    }
    
    public final <R> g<R> flatMapSingle(final o<? super T, ? extends g0<? extends R>> o, final boolean b, final int n) {
        if (o != null) {
            a.c(n, "maxConcurrency");
            return RxJavaPlugins.onAssembly((g<R>)new FlowableFlatMapSingle(n, this, (o)o, b));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final if2.a forEach(final kf2.g<? super T> g) {
        return this.subscribe(g);
    }
    
    public final if2.a forEachWhile(final q<? super T> q) {
        return this.forEachWhile(q, (kf2.g<? super Throwable>)Functions.e, (kf2.a)Functions.c);
    }
    
    public final if2.a forEachWhile(final q<? super T> q, final kf2.g<? super Throwable> g) {
        return this.forEachWhile(q, g, (kf2.a)Functions.c);
    }
    
    public final if2.a forEachWhile(final q<? super T> q, final kf2.g<? super Throwable> g, final kf2.a a) {
        if (q == null) {
            throw new NullPointerException("onNext is null");
        }
        if (g == null) {
            throw new NullPointerException("onError is null");
        }
        if (a != null) {
            final ForEachWhileSubscriber forEachWhileSubscriber = new ForEachWhileSubscriber((q)q, (kf2.g)g, a);
            this.subscribe((ff2.l<? super T>)forEachWhileSubscriber);
            return (if2.a)forEachWhileSubscriber;
        }
        throw new NullPointerException("onComplete is null");
    }
    
    public final <K> g<jf2.b<K, T>> groupBy(final o<? super T, ? extends K> o) {
        return this.groupBy(o, (kf2.o<? super T, ? extends T>)Functions.a, false, bufferSize());
    }
    
    public final <K, V> g<jf2.b<K, V>> groupBy(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        return this.groupBy(o, o2, false, bufferSize());
    }
    
    public final <K, V> g<jf2.b<K, V>> groupBy(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b) {
        return this.groupBy(o, o2, b, bufferSize());
    }
    
    public final <K, V> g<jf2.b<K, V>> groupBy(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b, final int n) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (o2 != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g<jf2.b<K, V>>)new FlowableGroupBy(this, (o)o, (o)o2, n, b, (o)null));
        }
        throw new NullPointerException("valueSelector is null");
    }
    
    public final <K, V> g<jf2.b<K, V>> groupBy(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b, final int n, final o<? super kf2.g<Object>, ? extends Map<K, Object>> o3) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (o2 == null) {
            throw new NullPointerException("valueSelector is null");
        }
        a.c(n, "bufferSize");
        if (o3 != null) {
            return RxJavaPlugins.onAssembly((g<jf2.b<K, V>>)new FlowableGroupBy(this, (o)o, (o)o2, n, b, (o)o3));
        }
        throw new NullPointerException("evictingMapFactory is null");
    }
    
    public final <K> g<jf2.b<K, T>> groupBy(final o<? super T, ? extends K> o, final boolean b) {
        return this.groupBy(o, (kf2.o<? super T, ? extends T>)Functions.a, b, bufferSize());
    }
    
    public final <TRight, TLeftEnd, TRightEnd, R> g<R> groupJoin(final b<? extends TRight> b, final o<? super T, ? extends b<TLeftEnd>> o, final o<? super TRight, ? extends b<TRightEnd>> o2, final c<? super T, ? super g<TRight>, ? extends R> c) {
        if (b == null) {
            throw new NullPointerException("other is null");
        }
        if (o == null) {
            throw new NullPointerException("leftEnd is null");
        }
        if (o2 == null) {
            throw new NullPointerException("rightEnd is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableGroupJoin(this, (b)b, (o)o, (o)o2, (c)c));
        }
        throw new NullPointerException("resultSelector is null");
    }
    
    public final g<T> hide() {
        return RxJavaPlugins.onAssembly((g<T>)new e0(this));
    }
    
    public final ff2.a ignoreElements() {
        return RxJavaPlugins.onAssembly((ff2.a)new qf2.g0(this));
    }
    
    public final c0<Boolean> isEmpty() {
        return this.all((q<? super T>)Functions.h);
    }
    
    public final <TRight, TLeftEnd, TRightEnd, R> g<R> join(final b<? extends TRight> b, final o<? super T, ? extends b<TLeftEnd>> o, final o<? super TRight, ? extends b<TRightEnd>> o2, final c<? super T, ? super TRight, ? extends R> c) {
        if (b == null) {
            throw new NullPointerException("other is null");
        }
        if (o == null) {
            throw new NullPointerException("leftEnd is null");
        }
        if (o2 == null) {
            throw new NullPointerException("rightEnd is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableJoin(this, (b)b, (o)o, (o)o2, (c)c));
        }
        throw new NullPointerException("resultSelector is null");
    }
    
    public final c0<T> last(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((c0<T>)new y0((b)this, (Object)t));
        }
        throw new NullPointerException("defaultItem");
    }
    
    public final ff2.n<T> lastElement() {
        return RxJavaPlugins.onAssembly((ff2.n<T>)new x0((b)this));
    }
    
    public final c0<T> lastOrError() {
        return RxJavaPlugins.onAssembly((c0<T>)new y0((b)this, (Object)null));
    }
    
    public final <R> g<R> lift(final ff2.k<? extends R, ? super T> k) {
        if (k != null) {
            return RxJavaPlugins.onAssembly((g<R>)new z0(this, (ff2.k)k));
        }
        throw new NullPointerException("lifter is null");
    }
    
    public final g<T> limit(final long n) {
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableLimit(n, this));
        }
        throw new IllegalArgumentException(g7.g("count >= 0 required but it was ", n));
    }
    
    public final <R> g<R> map(final o<? super T, ? extends R> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<R>)new io.reactivex.internal.operators.flowable.c(this, (o)o));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final g<s<T>> materialize() {
        return RxJavaPlugins.onAssembly((g<s<T>>)new FlowableMaterialize(this));
    }
    
    public final g<T> mergeWith(final ff2.e e) {
        if (e != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableMergeWithCompletable(this, e));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> mergeWith(final g0<? extends T> g0) {
        if (g0 != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableMergeWithSingle(this, (g0)g0));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> mergeWith(final r<? extends T> r) {
        if (r != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableMergeWithMaybe(this, (r)r));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> mergeWith(final b<? extends T> b) {
        if (b != null) {
            return merge((qt2.b<? extends T>)this, b);
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> observeOn(final ff2.b0 b0) {
        return this.observeOn(b0, false, bufferSize());
    }
    
    public final g<T> observeOn(final ff2.b0 b0, final boolean b2) {
        return this.observeOn(b0, b2, bufferSize());
    }
    
    public final g<T> observeOn(final ff2.b0 b0, final boolean b2, final int n) {
        if (b0 != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g<T>)new FlowableObserveOn(this, b0, b2, n));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <U> g<U> ofType(final Class<U> clazz) {
        if (clazz != null) {
            return (g<U>)this.filter((q<? super T>)new Functions$n((Class)clazz)).cast((Class<Object>)clazz);
        }
        throw new NullPointerException("clazz is null");
    }
    
    public final g<T> onBackpressureBuffer() {
        return this.onBackpressureBuffer(bufferSize(), false, true);
    }
    
    public final g<T> onBackpressureBuffer(final int n) {
        return this.onBackpressureBuffer(n, false, false);
    }
    
    public final g<T> onBackpressureBuffer(final int n, final kf2.a a) {
        return this.onBackpressureBuffer(n, false, false, a);
    }
    
    public final g<T> onBackpressureBuffer(final int n, final boolean b) {
        return this.onBackpressureBuffer(n, b, false);
    }
    
    public final g<T> onBackpressureBuffer(final int n, final boolean b, final boolean b2) {
        a.c(n, "capacity");
        return RxJavaPlugins.onAssembly((g<T>)new FlowableOnBackpressureBuffer(this, n, b2, b, (kf2.a)Functions.c));
    }
    
    public final g<T> onBackpressureBuffer(final int n, final boolean b, final boolean b2, final kf2.a a) {
        if (a != null) {
            a.c(n, "capacity");
            return RxJavaPlugins.onAssembly((g<T>)new FlowableOnBackpressureBuffer(this, n, b2, b, a));
        }
        throw new NullPointerException("onOverflow is null");
    }
    
    public final g<T> onBackpressureBuffer(final long n, final kf2.a a, final BackpressureOverflowStrategy backpressureOverflowStrategy) {
        if (backpressureOverflowStrategy != null) {
            a.d(n, "capacity");
            return RxJavaPlugins.onAssembly((g<T>)new FlowableOnBackpressureBufferStrategy(this, n, a, backpressureOverflowStrategy));
        }
        throw new NullPointerException("overflowStrategy is null");
    }
    
    public final g<T> onBackpressureBuffer(final boolean b) {
        return this.onBackpressureBuffer(bufferSize(), b, true);
    }
    
    public final g<T> onBackpressureDrop() {
        return RxJavaPlugins.onAssembly((g<T>)new FlowableOnBackpressureDrop(this));
    }
    
    public final g<T> onBackpressureDrop(final kf2.g<? super T> g) {
        if (g != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableOnBackpressureDrop(this, (kf2.g)g));
        }
        throw new NullPointerException("onDrop is null");
    }
    
    public final g<T> onBackpressureLatest() {
        return RxJavaPlugins.onAssembly((g<T>)new FlowableOnBackpressureLatest(this));
    }
    
    public final g<T> onErrorResumeNext(final o<? super Throwable, ? extends b<? extends T>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableOnErrorNext(this, (o)o, false));
        }
        throw new NullPointerException("resumeFunction is null");
    }
    
    public final g<T> onErrorResumeNext(final b<? extends T> b) {
        if (b != null) {
            return this.onErrorResumeNext((o<? super Throwable, ? extends b<? extends T>>)new Functions$w((Object)b));
        }
        throw new NullPointerException("next is null");
    }
    
    public final g<T> onErrorReturn(final o<? super Throwable, ? extends T> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableOnErrorReturn(this, (o)o));
        }
        throw new NullPointerException("valueSupplier is null");
    }
    
    public final g<T> onErrorReturnItem(final T t) {
        if (t != null) {
            return this.onErrorReturn((o<? super Throwable, ? extends T>)new Functions$w((Object)t));
        }
        throw new NullPointerException("item is null");
    }
    
    public final g<T> onExceptionResumeNext(final b<? extends T> b) {
        if (b != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableOnErrorNext(this, (o)new Functions$w((Object)b), true));
        }
        throw new NullPointerException("next is null");
    }
    
    public final g<T> onTerminateDetach() {
        return RxJavaPlugins.onAssembly((g<T>)new qf2.p(this));
    }
    
    public final bg2.a<T> parallel() {
        return (bg2.a<T>)bg2.a.a((b)this, Runtime.getRuntime().availableProcessors(), bufferSize());
    }
    
    public final bg2.a<T> parallel(final int n) {
        a.c(n, "parallelism");
        return (bg2.a<T>)bg2.a.a((b)this, n, bufferSize());
    }
    
    public final bg2.a<T> parallel(final int n, final int n2) {
        a.c(n, "parallelism");
        a.c(n2, "prefetch");
        return (bg2.a<T>)bg2.a.a((b)this, n, n2);
    }
    
    public final <R> g<R> publish(final o<? super g<T>, ? extends b<R>> o) {
        return this.publish((kf2.o<? super g<T>, ? extends qt2.b<? extends R>>)o, bufferSize());
    }
    
    public final <R> g<R> publish(final o<? super g<T>, ? extends b<? extends R>> o, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly((g<R>)new FlowablePublishMulticast(n, this, (o)o));
        }
        throw new NullPointerException("selector is null");
    }
    
    public final jf2.a<T> publish() {
        return this.publish(bufferSize());
    }
    
    public final jf2.a<T> publish(final int n) {
        a.c(n, "bufferSize");
        final AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((jf2.a<T>)new FlowablePublish(new FlowablePublish$a(atomicReference, n), this, atomicReference, n));
    }
    
    public final g<T> rebatchRequests(final int n) {
        return this.observeOn(wf2.b.b, true, n);
    }
    
    public final <R> c0<R> reduce(final R r, final c<R, ? super T, R> c) {
        if (r == null) {
            throw new NullPointerException("seed is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((c0<R>)new d1((b)this, (Object)r, (c)c));
        }
        throw new NullPointerException("reducer is null");
    }
    
    public final ff2.n<T> reduce(final c<T, T, T> c) {
        if (c != null) {
            return RxJavaPlugins.onAssembly((ff2.n<T>)new c1(this, (c)c));
        }
        throw new NullPointerException("reducer is null");
    }
    
    public final <R> c0<R> reduceWith(final Callable<R> callable, final c<R, ? super T, R> c) {
        if (callable == null) {
            throw new NullPointerException("seedSupplier is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((c0<R>)new e1((b)this, (Callable)callable, (c)c));
        }
        throw new NullPointerException("reducer is null");
    }
    
    public final g<T> repeat() {
        return this.repeat(Long.MAX_VALUE);
    }
    
    public final g<T> repeat(final long n) {
        final long n2 = lcmp(n, 0L);
        if (n2 < 0) {
            throw new IllegalArgumentException(g7.g("times >= 0 required but it was ", n));
        }
        if (n2 == 0) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((g<T>)new FlowableRepeat(n, this));
    }
    
    public final g<T> repeatUntil(final kf2.e e) {
        if (e != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableRepeatUntil(this, e));
        }
        throw new NullPointerException("stop is null");
    }
    
    public final g<T> repeatWhen(final o<? super g<Object>, ? extends b<?>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableRepeatWhen(this, (o)o));
        }
        throw new NullPointerException("handler is null");
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o) {
        if (o != null) {
            return (g<R>)new FlowableReplay.c(o, new n0(this));
        }
        throw new NullPointerException("selector is null");
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final int n) {
        if (o != null) {
            a.c(n, "bufferSize");
            return (g<R>)new FlowableReplay.c(o, (Callable)new h0(this, n));
        }
        throw new NullPointerException("selector is null");
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final int n, final long n2, final TimeUnit timeUnit) {
        return this.replay(o, n, n2, timeUnit, eg2.a.a());
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final int n, final long n2, final TimeUnit timeUnit, final ff2.b0 b0) {
        if (o == null) {
            throw new NullPointerException("selector is null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        a.c(n, "bufferSize");
        if (b0 != null) {
            return (g<R>)new FlowableReplay.c(o, (Callable)new i0(n, n2, this, b0, timeUnit));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final int n, final ff2.b0 b0) {
        if (o == null) {
            throw new NullPointerException("selector is null");
        }
        if (b0 != null) {
            a.c(n, "bufferSize");
            return (g<R>)new FlowableReplay.c((o)new o0((kf2.o<? super g<Object>, ? extends qt2.b<Object>>)o, b0), (Callable)new h0(this, n));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final long n, final TimeUnit timeUnit) {
        return this.replay(o, n, timeUnit, eg2.a.a());
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        if (o == null) {
            throw new NullPointerException("selector is null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return (g<R>)new FlowableReplay.c(o, new u0(this, n, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final ff2.b0 b0) {
        if (o == null) {
            throw new NullPointerException("selector is null");
        }
        if (b0 != null) {
            return (g<R>)new FlowableReplay.c((o)new o0((kf2.o<? super g<Object>, ? extends qt2.b<Object>>)o, b0), new n0(this));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final jf2.a<T> replay() {
        return (jf2.a<T>)FlowableReplay.f(this, (Callable)FlowableReplay.j);
    }
    
    public final jf2.a<T> replay(final int n) {
        a.c(n, "bufferSize");
        jf2.a a;
        if (n == Integer.MAX_VALUE) {
            a = FlowableReplay.f(this, (Callable)FlowableReplay.j);
        }
        else {
            a = FlowableReplay.f(this, (Callable)new FlowableReplay.e(n));
        }
        return (jf2.a<T>)a;
    }
    
    public final jf2.a<T> replay(final int n, final long n2, final TimeUnit timeUnit) {
        return this.replay(n, n2, timeUnit, eg2.a.a());
    }
    
    public final jf2.a<T> replay(final int n, final long n2, final TimeUnit timeUnit, final ff2.b0 b0) {
        a.c(n, "bufferSize");
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            a.c(n, "bufferSize");
            return (jf2.a<T>)FlowableReplay.f(this, (Callable)new FlowableReplay.g(n, n2, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final jf2.a<T> replay(final int n, final ff2.b0 b0) {
        if (b0 != null) {
            final jf2.a<T> replay = this.replay(n);
            return RxJavaPlugins.onAssembly((jf2.a<T>)new FlowableReplay$a((jf2.a)replay, (g)((g)replay).observeOn(b0)));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final jf2.a<T> replay(final long n, final TimeUnit timeUnit) {
        return this.replay(n, timeUnit, eg2.a.a());
    }
    
    public final jf2.a<T> replay(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return (jf2.a<T>)FlowableReplay.f(this, (Callable)new FlowableReplay.g(Integer.MAX_VALUE, n, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final jf2.a<T> replay(final ff2.b0 b0) {
        if (b0 != null) {
            final jf2.a<T> replay = this.replay();
            return RxJavaPlugins.onAssembly((jf2.a<T>)new FlowableReplay$a((jf2.a)replay, (g)((g)replay).observeOn(b0)));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> retry() {
        return this.retry(Long.MAX_VALUE, (q<? super Throwable>)Functions.g);
    }
    
    public final g<T> retry(final long n) {
        return this.retry(n, (q<? super Throwable>)Functions.g);
    }
    
    public final g<T> retry(final long n, final q<? super Throwable> q) {
        if (n < 0L) {
            throw new IllegalArgumentException(g7.g("times >= 0 required but it was ", n));
        }
        if (q != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableRetryPredicate(this, n, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final g<T> retry(final kf2.d<? super Integer, ? super Throwable> d) {
        if (d != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableRetryBiPredicate(this, (kf2.d)d));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final g<T> retry(final q<? super Throwable> q) {
        return this.retry(Long.MAX_VALUE, q);
    }
    
    public final g<T> retryUntil(final kf2.e e) {
        if (e != null) {
            return this.retry(Long.MAX_VALUE, (q<? super Throwable>)new Functions$k(e));
        }
        throw new NullPointerException("stop is null");
    }
    
    public final g<T> retryWhen(final o<? super g<Throwable>, ? extends b<?>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableRetryWhen(this, (o)o));
        }
        throw new NullPointerException("handler is null");
    }
    
    public final void safeSubscribe(final qt2.c<? super T> c) {
        if (c != null) {
            if (c instanceof gg2.c) {
                this.subscribe((ff2.l<? super T>)c);
            }
            else {
                this.subscribe((ff2.l<? super T>)new gg2.c((qt2.c)c));
            }
            return;
        }
        throw new NullPointerException("s is null");
    }
    
    public final g<T> sample(final long n, final TimeUnit timeUnit) {
        return this.sample(n, timeUnit, eg2.a.a());
    }
    
    public final g<T> sample(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableSampleTimed(this, n, timeUnit, b0, false));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> sample(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final boolean b2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableSampleTimed(this, n, timeUnit, b0, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> sample(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.sample(n, timeUnit, eg2.a.a(), b);
    }
    
    public final <U> g<T> sample(final b<U> b) {
        if (b != null) {
            return RxJavaPlugins.onAssembly(new FlowableSamplePublisher<T>((qt2.b<T>)this, b, false));
        }
        throw new NullPointerException("sampler is null");
    }
    
    public final <U> g<T> sample(final b<U> b, final boolean b2) {
        if (b != null) {
            return RxJavaPlugins.onAssembly(new FlowableSamplePublisher<T>((qt2.b<T>)this, b, b2));
        }
        throw new NullPointerException("sampler is null");
    }
    
    public final <R> g<R> scan(final R r, final c<R, ? super T, R> c) {
        if (r != null) {
            return this.scanWith((Callable<R>)new Functions$w((Object)r), c);
        }
        throw new NullPointerException("initialValue is null");
    }
    
    public final g<T> scan(final c<T, T, T> c) {
        if (c != null) {
            return RxJavaPlugins.onAssembly((g<T>)new g1(this, (c)c));
        }
        throw new NullPointerException("accumulator is null");
    }
    
    public final <R> g<R> scanWith(final Callable<R> callable, final c<R, ? super T, R> c) {
        if (callable == null) {
            throw new NullPointerException("seedSupplier is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableScanSeed(this, (Callable)callable, (c)c));
        }
        throw new NullPointerException("accumulator is null");
    }
    
    public final g<T> serialize() {
        return RxJavaPlugins.onAssembly((g<T>)new h1(this));
    }
    
    public final g<T> share() {
        final jf2.a<T> publish = this.publish();
        ((jf2.a<T>)publish).getClass();
        Object onAssembly = publish;
        if (publish instanceof b1) {
            final b1 b1 = (b1)publish;
            onAssembly = RxJavaPlugins.onAssembly((jf2.a<T>)new FlowablePublishAlt((b)b1.a(), b1.d()));
        }
        return RxJavaPlugins.onAssembly(new FlowableRefCount<T>((jf2.a<T>)onAssembly));
    }
    
    public final c0<T> single(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((c0<T>)new j1(this, (Object)t));
        }
        throw new NullPointerException("defaultItem is null");
    }
    
    public final ff2.n<T> singleElement() {
        return RxJavaPlugins.onAssembly((ff2.n<T>)new i1(this));
    }
    
    public final c0<T> singleOrError() {
        return RxJavaPlugins.onAssembly((c0<T>)new j1(this, (Object)null));
    }
    
    public final g<T> skip(final long n) {
        if (n <= 0L) {
            return RxJavaPlugins.onAssembly(this);
        }
        return RxJavaPlugins.onAssembly((g<T>)new k1(n, this));
    }
    
    public final g<T> skip(final long n, final TimeUnit timeUnit) {
        return this.skipUntil((qt2.b<Object>)timer(n, timeUnit));
    }
    
    public final g<T> skip(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.skipUntil((qt2.b<Object>)timer(n, timeUnit, b0));
    }
    
    public final g<T> skipLast(final int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException(d.h("count >= 0 required but it was ", n));
        }
        if (n == 0) {
            return RxJavaPlugins.onAssembly(this);
        }
        return RxJavaPlugins.onAssembly((g<T>)new FlowableSkipLast(this, n));
    }
    
    public final g<T> skipLast(final long n, final TimeUnit timeUnit) {
        return this.skipLast(n, timeUnit, eg2.a.a(), false, bufferSize());
    }
    
    public final g<T> skipLast(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.skipLast(n, timeUnit, b0, false, bufferSize());
    }
    
    public final g<T> skipLast(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final boolean b2) {
        return this.skipLast(n, timeUnit, b0, b2, bufferSize());
    }
    
    public final g<T> skipLast(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final boolean b2, final int n2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            a.c(n2, "bufferSize");
            return RxJavaPlugins.onAssembly((g<T>)new FlowableSkipLastTimed(this, n, timeUnit, b0, n2 << 1, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> skipLast(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.skipLast(n, timeUnit, eg2.a.a(), b, bufferSize());
    }
    
    public final <U> g<T> skipUntil(final b<U> b) {
        if (b != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableSkipUntil(this, (b)b));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> skipWhile(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((g<T>)new l1(this, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final g<T> sorted() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   ff2/g.toList:()Lff2/c0;
        //     4: invokevirtual   ff2/c0.L:()Lff2/g;
        //     7: new             Lio/reactivex/internal/functions/Functions$x;
        //    10: dup            
        //    11: invokestatic    io/reactivex/internal/functions/Functions.b:()Ljava/util/Comparator;
        //    14: invokespecial   io/reactivex/internal/functions/Functions$x.<init>:(Ljava/util/Comparator;)V
        //    17: invokevirtual   ff2/g.map:(Lkf2/o;)Lff2/g;
        //    20: getstatic       io/reactivex/internal/functions/Functions.a:Lio/reactivex/internal/functions/Functions$v;
        //    23: invokevirtual   ff2/g.flatMapIterable:(Lkf2/o;)Lff2/g;
        //    26: areturn        
        //    Signature:
        //  ()Lff2/g<TT;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:284)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:279)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:154)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:225)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:40)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:211)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:40)
        //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1205)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2696)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2689)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1670)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypesForVariables(TypeAnalysis.java:593)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:405)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final g<T> sorted(final Comparator<? super T> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnull          29
        //     4: aload_0        
        //     5: invokevirtual   ff2/g.toList:()Lff2/c0;
        //     8: invokevirtual   ff2/c0.L:()Lff2/g;
        //    11: new             Lio/reactivex/internal/functions/Functions$x;
        //    14: dup            
        //    15: aload_1        
        //    16: invokespecial   io/reactivex/internal/functions/Functions$x.<init>:(Ljava/util/Comparator;)V
        //    19: invokevirtual   ff2/g.map:(Lkf2/o;)Lff2/g;
        //    22: getstatic       io/reactivex/internal/functions/Functions.a:Lio/reactivex/internal/functions/Functions$v;
        //    25: invokevirtual   ff2/g.flatMapIterable:(Lkf2/o;)Lff2/g;
        //    28: areturn        
        //    29: new             Ljava/lang/NullPointerException;
        //    32: dup            
        //    33: ldc_w           "sortFunction"
        //    36: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    39: athrow         
        //    Signature:
        //  (Ljava/util/Comparator<-TT;>;)Lff2/g<TT;>;
        // 
        // The error that occurred was:
        // 
        // java.lang.UnsupportedOperationException: The requested operation is not supported.
        //     at com.strobel.util.ContractUtils.unsupported(ContractUtils.java:27)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:284)
        //     at com.strobel.assembler.metadata.TypeReference.getRawType(TypeReference.java:279)
        //     at com.strobel.assembler.metadata.TypeReference.makeGenericType(TypeReference.java:154)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:225)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:40)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:211)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visitParameterizedType(TypeSubstitutionVisitor.java:25)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.TypeSubstitutionVisitor.visit(TypeSubstitutionVisitor.java:40)
        //     at com.strobel.assembler.metadata.MetadataHelper.substituteGenericArguments(MetadataHelper.java:1205)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2696)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferCall(TypeAnalysis.java:2689)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1040)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:790)
        //     at com.strobel.decompiler.ast.TypeAnalysis.doInferTypeForExpression(TypeAnalysis.java:1670)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypeForExpression(TypeAnalysis.java:815)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:684)
        //     at com.strobel.decompiler.ast.TypeAnalysis.inferTypesForVariables(TypeAnalysis.java:593)
        //     at com.strobel.decompiler.ast.TypeAnalysis.runInference(TypeAnalysis.java:405)
        //     at com.strobel.decompiler.ast.TypeAnalysis.run(TypeAnalysis.java:95)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:109)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final g<T> startWith(final Iterable<? extends T> iterable) {
        return concatArray((b)fromIterable((Iterable<?>)iterable), (b)this);
    }
    
    public final g<T> startWith(final T t) {
        if (t != null) {
            return concatArray((b)just(t), (b)this);
        }
        throw new NullPointerException("value is null");
    }
    
    public final g<T> startWith(final b<? extends T> b) {
        if (b != null) {
            return concatArray(b, (b)this);
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> startWithArray(final T... array) {
        final g<T> fromArray = fromArray(array);
        if (fromArray == empty()) {
            return RxJavaPlugins.onAssembly(this);
        }
        return (g<T>)concatArray((b)fromArray, (b)this);
    }
    
    public final if2.a subscribe() {
        return this.subscribe((kf2.g<? super T>)Functions.d, (kf2.g<? super Throwable>)Functions.e, (kf2.a)Functions.c, (kf2.g<? super qt2.d>)FlowableInternalHelper$RequestMax.INSTANCE);
    }
    
    public final if2.a subscribe(final kf2.g<? super T> g) {
        return this.subscribe(g, (kf2.g<? super Throwable>)Functions.e, (kf2.a)Functions.c, (kf2.g<? super qt2.d>)FlowableInternalHelper$RequestMax.INSTANCE);
    }
    
    public final if2.a subscribe(final kf2.g<? super T> g, final kf2.g<? super Throwable> g2) {
        return this.subscribe(g, g2, (kf2.a)Functions.c, (kf2.g<? super qt2.d>)FlowableInternalHelper$RequestMax.INSTANCE);
    }
    
    public final if2.a subscribe(final kf2.g<? super T> g, final kf2.g<? super Throwable> g2, final kf2.a a) {
        return this.subscribe(g, g2, a, (kf2.g<? super qt2.d>)FlowableInternalHelper$RequestMax.INSTANCE);
    }
    
    public final if2.a subscribe(final kf2.g<? super T> g, final kf2.g<? super Throwable> g2, final kf2.a a, final kf2.g<? super qt2.d> g3) {
        if (g == null) {
            throw new NullPointerException("onNext is null");
        }
        if (g2 == null) {
            throw new NullPointerException("onError is null");
        }
        if (a == null) {
            throw new NullPointerException("onComplete is null");
        }
        if (g3 != null) {
            final LambdaSubscriber lambdaSubscriber = new LambdaSubscriber((kf2.g)g, (kf2.g)g2, a, (kf2.g)g3);
            this.subscribe((ff2.l<? super T>)lambdaSubscriber);
            return (if2.a)lambdaSubscriber;
        }
        throw new NullPointerException("onSubscribe is null");
    }
    
    public final void subscribe(final ff2.l<? super T> l) {
        if (l != null) {
            try {
                final qt2.c<? super Object> onSubscribe = RxJavaPlugins.onSubscribe((g<Object>)this, (qt2.c<? super Object>)l);
                a.b((Object)onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
                this.subscribeActual(onSubscribe);
                return;
            }
            catch (final NullPointerException ex) {
                throw ex;
            }
            finally {
                final Throwable t;
                ej2.c0.i4(t);
                RxJavaPlugins.onError(t);
                final NullPointerException ex2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                ex2.initCause(t);
                throw ex2;
            }
        }
        throw new NullPointerException("s is null");
    }
    
    public final void subscribe(final qt2.c<? super T> c) {
        if (c instanceof ff2.l) {
            this.subscribe((ff2.l<? super T>)c);
        }
        else {
            if (c == null) {
                throw new NullPointerException("s is null");
            }
            this.subscribe((ff2.l<? super T>)new StrictSubscriber((qt2.c)c));
        }
    }
    
    public abstract void subscribeActual(final qt2.c<? super T> p0);
    
    public final g<T> subscribeOn(final ff2.b0 b0) {
        if (b0 != null) {
            return this.subscribeOn(b0, this instanceof FlowableCreate ^ true);
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> subscribeOn(final ff2.b0 b0, final boolean b2) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableSubscribeOn(this, b0, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <E extends qt2.c<? super T>> E subscribeWith(final E e) {
        this.subscribe(e);
        return e;
    }
    
    public final g<T> switchIfEmpty(final b<? extends T> b) {
        if (b != null) {
            return RxJavaPlugins.onAssembly((g<T>)new m1(this, (b)b));
        }
        throw new NullPointerException("other is null");
    }
    
    public final <R> g<R> switchMap(final o<? super T, ? extends b<? extends R>> o) {
        return this.switchMap(o, bufferSize());
    }
    
    public final <R> g<R> switchMap(final o<? super T, ? extends b<? extends R>> o, final int n) {
        return this.switchMap0(o, n, false);
    }
    
    public <R> g<R> switchMap0(final o<? super T, ? extends b<? extends R>> o, final int n, final boolean b) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        a.c(n, "bufferSize");
        if (!(this instanceof nf2.h)) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableSwitchMap(n, this, (o)o, b));
        }
        final Object call = ((nf2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((g<R>)new f1$a((o)o, call));
    }
    
    public final ff2.a switchMapCompletable(final o<? super T, ? extends ff2.e> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly(new FlowableSwitchMapCompletable<Object>(this, o, false));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final ff2.a switchMapCompletableDelayError(final o<? super T, ? extends ff2.e> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly(new FlowableSwitchMapCompletable<Object>(this, o, true));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> switchMapDelayError(final o<? super T, ? extends b<? extends R>> o) {
        return this.switchMapDelayError(o, bufferSize());
    }
    
    public final <R> g<R> switchMapDelayError(final o<? super T, ? extends b<? extends R>> o, final int n) {
        return this.switchMap0(o, n, true);
    }
    
    public final <R> g<R> switchMapMaybe(final o<? super T, ? extends r<? extends R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableSwitchMapMaybe((g<Object>)this, (kf2.o<? super Object, ? extends ff2.r<?>>)o, false));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> switchMapMaybeDelayError(final o<? super T, ? extends r<? extends R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableSwitchMapMaybe((g<Object>)this, (kf2.o<? super Object, ? extends ff2.r<?>>)o, true));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> switchMapSingle(final o<? super T, ? extends g0<? extends R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableSwitchMapSingle((g<Object>)this, (kf2.o<? super Object, ? extends ff2.g0<?>>)o, false));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> switchMapSingleDelayError(final o<? super T, ? extends g0<? extends R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableSwitchMapSingle((g<Object>)this, (kf2.o<? super Object, ? extends ff2.g0<?>>)o, true));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final g<T> take(final long n) {
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableTake(n, this));
        }
        throw new IllegalArgumentException(g7.g("count >= 0 required but it was ", n));
    }
    
    public final g<T> take(final long n, final TimeUnit timeUnit) {
        return this.takeUntil((qt2.b<Object>)timer(n, timeUnit));
    }
    
    public final g<T> take(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.takeUntil((qt2.b<Object>)timer(n, timeUnit, b0));
    }
    
    public final g<T> takeLast(final int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException(d.h("count >= 0 required but it was ", n));
        }
        if (n == 0) {
            return RxJavaPlugins.onAssembly((g<T>)new f0(this));
        }
        if (n == 1) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableTakeLastOne(this));
        }
        return RxJavaPlugins.onAssembly((g<T>)new FlowableTakeLast(this, n));
    }
    
    public final g<T> takeLast(final long n, final long n2, final TimeUnit timeUnit) {
        return this.takeLast(n, n2, timeUnit, eg2.a.a(), false, bufferSize());
    }
    
    public final g<T> takeLast(final long n, final long n2, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.takeLast(n, n2, timeUnit, b0, false, bufferSize());
    }
    
    public final g<T> takeLast(final long n, final long n2, final TimeUnit timeUnit, final ff2.b0 b0, final boolean b2, final int n3) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        a.c(n3, "bufferSize");
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableTakeLastTimed(this, n, n2, timeUnit, b0, n3, b2));
        }
        throw new IndexOutOfBoundsException(g7.g("count >= 0 required but it was ", n));
    }
    
    public final g<T> takeLast(final long n, final TimeUnit timeUnit) {
        return this.takeLast(n, timeUnit, eg2.a.a(), false, bufferSize());
    }
    
    public final g<T> takeLast(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.takeLast(n, timeUnit, b0, false, bufferSize());
    }
    
    public final g<T> takeLast(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final boolean b2) {
        return this.takeLast(n, timeUnit, b0, b2, bufferSize());
    }
    
    public final g<T> takeLast(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final boolean b2, final int n2) {
        return this.takeLast(Long.MAX_VALUE, n, timeUnit, b0, b2, n2);
    }
    
    public final g<T> takeLast(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.takeLast(n, timeUnit, eg2.a.a(), b, bufferSize());
    }
    
    public final g<T> takeUntil(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((g<T>)new n1(this, (q)q));
        }
        throw new NullPointerException("stopPredicate is null");
    }
    
    public final <U> g<T> takeUntil(final b<U> b) {
        if (b != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableTakeUntil(this, (b)b));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> takeWhile(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((g<T>)new o1(this, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final TestSubscriber<T> test() {
        final TestSubscriber testSubscriber = new TestSubscriber();
        this.subscribe((ff2.l<? super T>)testSubscriber);
        return (TestSubscriber<T>)testSubscriber;
    }
    
    public final TestSubscriber<T> test(final long n) {
        final TestSubscriber testSubscriber = new TestSubscriber(n);
        this.subscribe((ff2.l<? super T>)testSubscriber);
        return (TestSubscriber<T>)testSubscriber;
    }
    
    public final TestSubscriber<T> test(final long n, final boolean b) {
        final TestSubscriber testSubscriber = new TestSubscriber(n);
        if (b) {
            testSubscriber.cancel();
        }
        this.subscribe((ff2.l<? super T>)testSubscriber);
        return (TestSubscriber<T>)testSubscriber;
    }
    
    public final g<T> throttleFirst(final long n, final TimeUnit timeUnit) {
        return this.throttleFirst(n, timeUnit, eg2.a.a());
    }
    
    public final g<T> throttleFirst(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableThrottleFirstTimed(this, n, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> throttleLast(final long n, final TimeUnit timeUnit) {
        return this.sample(n, timeUnit);
    }
    
    public final g<T> throttleLast(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.sample(n, timeUnit, b0);
    }
    
    public final g<T> throttleLatest(final long n, final TimeUnit timeUnit) {
        return this.throttleLatest(n, timeUnit, eg2.a.a(), false);
    }
    
    public final g<T> throttleLatest(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.throttleLatest(n, timeUnit, b0, false);
    }
    
    public final g<T> throttleLatest(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final boolean b2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableThrottleLatest(this, n, timeUnit, b0, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> throttleLatest(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.throttleLatest(n, timeUnit, eg2.a.a(), b);
    }
    
    public final g<T> throttleWithTimeout(final long n, final TimeUnit timeUnit) {
        return this.debounce(n, timeUnit);
    }
    
    public final g<T> throttleWithTimeout(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.debounce(n, timeUnit, b0);
    }
    
    public final g<eg2.b<T>> timeInterval() {
        return this.timeInterval(TimeUnit.MILLISECONDS, eg2.a.a());
    }
    
    public final g<eg2.b<T>> timeInterval(final ff2.b0 b0) {
        return this.timeInterval(TimeUnit.MILLISECONDS, b0);
    }
    
    public final g<eg2.b<T>> timeInterval(final TimeUnit timeUnit) {
        return this.timeInterval(timeUnit, eg2.a.a());
    }
    
    public final g<eg2.b<T>> timeInterval(final TimeUnit timeUnit, final ff2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g<eg2.b<T>>)new p1(this, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> timeout(final long n, final TimeUnit timeUnit) {
        return this.timeout0(n, timeUnit, null, eg2.a.a());
    }
    
    public final g<T> timeout(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.timeout0(n, timeUnit, null, b0);
    }
    
    public final g<T> timeout(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final b<? extends T> b2) {
        if (b2 != null) {
            return this.timeout0(n, timeUnit, b2, b0);
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> timeout(final long n, final TimeUnit timeUnit, final b<? extends T> b) {
        if (b != null) {
            return this.timeout0(n, timeUnit, b, eg2.a.a());
        }
        throw new NullPointerException("other is null");
    }
    
    public final <V> g<T> timeout(final o<? super T, ? extends b<V>> o) {
        return this.timeout0((qt2.b<Object>)null, (kf2.o<? super T, ? extends qt2.b<Object>>)o, (b<? extends T>)null);
    }
    
    public final <V> g<T> timeout(final o<? super T, ? extends b<V>> o, final g<? extends T> g) {
        if (g != null) {
            return this.timeout0((qt2.b<Object>)null, (kf2.o<? super T, ? extends qt2.b<Object>>)o, (b<? extends T>)g);
        }
        throw new NullPointerException("other is null");
    }
    
    public final <U, V> g<T> timeout(final b<U> b, final o<? super T, ? extends b<V>> o) {
        if (b != null) {
            return this.timeout0((qt2.b<Object>)b, (kf2.o<? super T, ? extends qt2.b<Object>>)o, (b<? extends T>)null);
        }
        throw new NullPointerException("firstTimeoutIndicator is null");
    }
    
    public final <U, V> g<T> timeout(final b<U> b, final o<? super T, ? extends b<V>> o, final b<? extends T> b2) {
        if (b == null) {
            throw new NullPointerException("firstTimeoutSelector is null");
        }
        if (b2 != null) {
            return this.timeout0((qt2.b<Object>)b, (kf2.o<? super T, ? extends qt2.b<Object>>)o, b2);
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<eg2.b<T>> timestamp() {
        return this.timestamp(TimeUnit.MILLISECONDS, eg2.a.a());
    }
    
    public final g<eg2.b<T>> timestamp(final ff2.b0 b0) {
        return this.timestamp(TimeUnit.MILLISECONDS, b0);
    }
    
    public final g<eg2.b<T>> timestamp(final TimeUnit timeUnit) {
        return this.timestamp(timeUnit, eg2.a.a());
    }
    
    public final g<eg2.b<T>> timestamp(final TimeUnit timeUnit, final ff2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return this.map((kf2.o<? super T, ? extends eg2.b<T>>)new Functions$f0(timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <R> R to(final o<? super g<T>, R> o) {
        Label_0012: {
            if (o == null) {
                break Label_0012;
            }
            try {
                return (R)o.apply((Object)this);
                throw new NullPointerException("converter is null");
            }
            finally {
                final Throwable t;
                ej2.c0.i4(t);
                throw ExceptionHelper.d(t);
            }
        }
    }
    
    public final Future<T> toFuture() {
        return this.subscribeWith((Future<T>)new xf2.f());
    }
    
    public final c0<List<T>> toList() {
        return RxJavaPlugins.onAssembly((c0<List<T>>)new q1(this, (Callable)ArrayListSupplier.asCallable()));
    }
    
    public final c0<List<T>> toList(final int n) {
        a.c(n, "capacityHint");
        return RxJavaPlugins.onAssembly((c0<List<T>>)new q1(this, (Callable)new Functions.j(n)));
    }
    
    public final <U extends Collection<? super T>> c0<U> toList(final Callable<U> callable) {
        if (callable != null) {
            return RxJavaPlugins.onAssembly((c0<U>)new q1(this, (Callable)callable));
        }
        throw new NullPointerException("collectionSupplier is null");
    }
    
    public final <K> c0<Map<K, T>> toMap(final o<? super T, ? extends K> o) {
        if (o != null) {
            return this.collect((Callable<? extends Map<K, T>>)HashMapSupplier.asCallable(), (kf2.b<? super Map<K, T>, ? super T>)new Functions$g0((o)o));
        }
        throw new NullPointerException("keySelector is null");
    }
    
    public final <K, V> c0<Map<K, V>> toMap(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (o2 != null) {
            return this.collect((Callable<? extends Map<K, V>>)HashMapSupplier.asCallable(), (kf2.b<? super Map<K, V>, ? super T>)new Functions$h0((o)o2, (o)o));
        }
        throw new NullPointerException("valueSelector is null");
    }
    
    public final <K, V> c0<Map<K, V>> toMap(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final Callable<? extends Map<K, V>> callable) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (o2 != null) {
            return this.collect(callable, (kf2.b<? super Map<K, V>, ? super T>)new Functions$h0((o)o2, (o)o));
        }
        throw new NullPointerException("valueSelector is null");
    }
    
    public final <K> c0<Map<K, Collection<T>>> toMultimap(final o<? super T, ? extends K> o) {
        return this.toMultimap(o, (kf2.o<? super T, ? extends T>)Functions.a, (Callable<? extends Map<K, Collection<T>>>)HashMapSupplier.asCallable(), (kf2.o<? super K, ? extends Collection<? super T>>)ArrayListSupplier.asFunction());
    }
    
    public final <K, V> c0<Map<K, Collection<V>>> toMultimap(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        return this.toMultimap(o, o2, (Callable<? extends Map<K, Collection<V>>>)HashMapSupplier.asCallable(), (kf2.o<? super K, ? extends Collection<? super V>>)ArrayListSupplier.asFunction());
    }
    
    public final <K, V> c0<Map<K, Collection<V>>> toMultimap(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final Callable<Map<K, Collection<V>>> callable) {
        return this.toMultimap(o, o2, (Callable<? extends Map<K, Collection<V>>>)callable, (kf2.o<? super K, ? extends Collection<? super V>>)ArrayListSupplier.asFunction());
    }
    
    public final <K, V> c0<Map<K, Collection<V>>> toMultimap(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final Callable<? extends Map<K, Collection<V>>> callable, final o<? super K, ? extends Collection<? super V>> o3) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (o2 == null) {
            throw new NullPointerException("valueSelector is null");
        }
        if (callable == null) {
            throw new NullPointerException("mapSupplier is null");
        }
        if (o3 != null) {
            return this.collect(callable, (kf2.b<? super Map<K, Collection<V>>, ? super T>)new Functions$i0((o)o3, (o)o2, (o)o));
        }
        throw new NullPointerException("collectionFactory is null");
    }
    
    public final ff2.t<T> toObservable() {
        return RxJavaPlugins.onAssembly((ff2.t<T>)new sf2.m0((b)this));
    }
    
    public final c0<List<T>> toSortedList() {
        return this.toSortedList(Functions.b());
    }
    
    public final c0<List<T>> toSortedList(final int n) {
        return this.toSortedList(Functions.b(), n);
    }
    
    public final c0<List<T>> toSortedList(final Comparator<? super T> comparator) {
        if (comparator != null) {
            return this.toList().w((kf2.o<? super List<T>, ? extends List<T>>)new Functions$x((Comparator)comparator));
        }
        throw new NullPointerException("comparator is null");
    }
    
    public final c0<List<T>> toSortedList(final Comparator<? super T> comparator, final int n) {
        if (comparator != null) {
            return this.toList(n).w((kf2.o<? super List<T>, ? extends List<T>>)new Functions$x((Comparator)comparator));
        }
        throw new NullPointerException("comparator is null");
    }
    
    public final g<T> unsubscribeOn(final ff2.b0 b0) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g<T>)new FlowableUnsubscribeOn(this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<g<T>> window(final long n) {
        return this.window(n, n, bufferSize());
    }
    
    public final g<g<T>> window(final long n, final long n2) {
        return this.window(n, n2, bufferSize());
    }
    
    public final g<g<T>> window(final long n, final long n2, final int n3) {
        a.d(n2, "skip");
        a.d(n, "count");
        a.c(n3, "bufferSize");
        return RxJavaPlugins.onAssembly((g<g<T>>)new FlowableWindow(this, n, n2, n3));
    }
    
    public final g<g<T>> window(final long n, final long n2, final TimeUnit timeUnit) {
        return this.window(n, n2, timeUnit, eg2.a.a(), bufferSize());
    }
    
    public final g<g<T>> window(final long n, final long n2, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.window(n, n2, timeUnit, b0, bufferSize());
    }
    
    public final g<g<T>> window(final long n, final long n2, final TimeUnit timeUnit, final ff2.b0 b0, final int n3) {
        a.c(n3, "bufferSize");
        a.d(n, "timespan");
        a.d(n2, "timeskip");
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        if (timeUnit != null) {
            return RxJavaPlugins.onAssembly((g<g<T>>)new s1(this, n, n2, timeUnit, b0, Long.MAX_VALUE, n3, false));
        }
        throw new NullPointerException("unit is null");
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit) {
        return this.window(n, timeUnit, eg2.a.a(), Long.MAX_VALUE, false);
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit, final long n2) {
        return this.window(n, timeUnit, eg2.a.a(), n2, false);
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit, final long n2, final boolean b) {
        return this.window(n, timeUnit, eg2.a.a(), n2, b);
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit, final ff2.b0 b0) {
        return this.window(n, timeUnit, b0, Long.MAX_VALUE, false);
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final long n2) {
        return this.window(n, timeUnit, b0, n2, false);
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final long n2, final boolean b2) {
        return this.window(n, timeUnit, b0, n2, b2, bufferSize());
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit, final ff2.b0 b0, final long n2, final boolean b2, final int n3) {
        a.c(n3, "bufferSize");
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        if (timeUnit != null) {
            a.d(n2, "count");
            return RxJavaPlugins.onAssembly((g<g<T>>)new s1(this, n, n, timeUnit, b0, n2, n3, b2));
        }
        throw new NullPointerException("unit is null");
    }
    
    public final <B> g<g<T>> window(final Callable<? extends b<B>> callable) {
        return this.window((Callable<? extends qt2.b<Object>>)callable, bufferSize());
    }
    
    public final <B> g<g<T>> window(final Callable<? extends b<B>> callable, final int n) {
        if (callable != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g<g<T>>)new FlowableWindowBoundarySupplier(this, (Callable)callable, n));
        }
        throw new NullPointerException("boundaryIndicatorSupplier is null");
    }
    
    public final <B> g<g<T>> window(final b<B> b) {
        return this.window((qt2.b<Object>)b, bufferSize());
    }
    
    public final <B> g<g<T>> window(final b<B> b, final int n) {
        if (b != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g<g<T>>)new FlowableWindowBoundary(this, (b)b, n));
        }
        throw new NullPointerException("boundaryIndicator is null");
    }
    
    public final <U, V> g<g<T>> window(final b<U> b, final o<? super U, ? extends b<V>> o) {
        return this.window((qt2.b<Object>)b, (kf2.o<? super Object, ? extends qt2.b<Object>>)o, bufferSize());
    }
    
    public final <U, V> g<g<T>> window(final b<U> b, final o<? super U, ? extends b<V>> o, final int n) {
        if (b == null) {
            throw new NullPointerException("openingIndicator is null");
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g<g<T>>)new r1(this, (b)b, (o)o, n));
        }
        throw new NullPointerException("closingIndicator is null");
    }
    
    public final <R> g<R> withLatestFrom(final Iterable<? extends b<?>> iterable, final o<? super Object[], R> o) {
        if (iterable == null) {
            throw new NullPointerException("others is null");
        }
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableWithLatestFromMany(this, (Iterable)iterable, (o)o));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <U, R> g<R> withLatestFrom(final b<? extends U> b, final c<? super T, ? super U, ? extends R> c) {
        if (b == null) {
            throw new NullPointerException("other is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableWithLatestFrom(this, (c)c, (b)b));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <T1, T2, R> g<R> withLatestFrom(final b<T1> b, final b<T2> b2, final h<? super T, ? super T1, ? super T2, R> h) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return this.withLatestFrom((b<?>[])new b[] { b, b2 }, (kf2.o<? super Object[], R>)Functions.d(h));
        }
        throw new NullPointerException("source2 is null");
    }
    
    public final <T1, T2, T3, R> g<R> withLatestFrom(final b<T1> b, final b<T2> b2, final b<T3> b3, final i<? super T, ? super T1, ? super T2, ? super T3, R> i) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 != null) {
            return this.withLatestFrom((b<?>[])new b[] { b, b2, b3 }, (kf2.o<? super Object[], R>)Functions.e(i));
        }
        throw new NullPointerException("source3 is null");
    }
    
    public final <T1, T2, T3, T4, R> g<R> withLatestFrom(final b<T1> b, final b<T2> b2, final b<T3> b3, final b<T4> b4, final j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> j) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (b3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (b4 != null) {
            return this.withLatestFrom((b<?>[])new b[] { b, b2, b3, b4 }, (kf2.o<? super Object[], R>)Functions.f(j));
        }
        throw new NullPointerException("source4 is null");
    }
    
    public final <R> g<R> withLatestFrom(final b<?>[] array, final o<? super Object[], R> o) {
        if (array == null) {
            throw new NullPointerException("others is null");
        }
        if (o != null) {
            return RxJavaPlugins.onAssembly((g<R>)new FlowableWithLatestFromMany(this, (b[])array, (o)o));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <U, R> g<R> zipWith(final Iterable<U> iterable, final c<? super T, ? super U, ? extends R> c) {
        if (iterable == null) {
            throw new NullPointerException("other is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((g<R>)new t1(this, (Iterable)iterable, (c)c));
        }
        throw new NullPointerException("zipper is null");
    }
    
    public final <U, R> g<R> zipWith(final b<? extends U> b, final c<? super T, ? super U, ? extends R> c) {
        if (b != null) {
            return zip((qt2.b<?>)this, (qt2.b<?>)b, (kf2.c<? super Object, ? super Object, ? extends R>)c);
        }
        throw new NullPointerException("other is null");
    }
    
    public final <U, R> g<R> zipWith(final b<? extends U> b, final c<? super T, ? super U, ? extends R> c, final boolean b2) {
        return zip((qt2.b<?>)this, (qt2.b<?>)b, (kf2.c<? super Object, ? super Object, ? extends R>)c, b2);
    }
    
    public final <U, R> g<R> zipWith(final b<? extends U> b, final c<? super T, ? super U, ? extends R> c, final boolean b2, final int n) {
        return zip((qt2.b<?>)this, (qt2.b<?>)b, (kf2.c<? super Object, ? super Object, ? extends R>)c, b2, n);
    }
}
