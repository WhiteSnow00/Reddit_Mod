// 
// Decompiled by Procyon v0.6.0
// 

package af2;

import lf2.t1;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFrom;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany;
import lf2.r1;
import io.reactivex.internal.operators.flowable.FlowableWindowBoundary;
import io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier;
import lf2.s1;
import io.reactivex.internal.operators.flowable.FlowableWindow;
import io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn;
import io.reactivex.internal.functions.Functions$x;
import io.reactivex.internal.functions.Functions$i0;
import io.reactivex.internal.functions.Functions$h0;
import io.reactivex.internal.functions.Functions$g0;
import io.reactivex.internal.util.HashMapSupplier;
import lf2.q1;
import io.reactivex.internal.functions.Functions$f0;
import lf2.p1;
import io.reactivex.internal.operators.flowable.FlowableThrottleLatest;
import io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed;
import io.reactivex.subscribers.TestSubscriber;
import lf2.o1;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil;
import lf2.n1;
import io.reactivex.internal.operators.flowable.FlowableTakeLastTimed;
import io.reactivex.internal.operators.flowable.FlowableTakeLast;
import io.reactivex.internal.operators.flowable.FlowableTakeLastOne;
import lf2.f0;
import io.reactivex.internal.operators.flowable.FlowableTake;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable;
import io.reactivex.internal.operators.flowable.FlowableSwitchMap;
import lf2.m1;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import java.util.Comparator;
import lf2.l1;
import io.reactivex.internal.operators.flowable.FlowableSkipUntil;
import io.reactivex.internal.operators.flowable.FlowableSkipLastTimed;
import io.reactivex.internal.operators.flowable.FlowableSkipLast;
import lf2.k1;
import lf2.i1;
import lf2.j1;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.internal.operators.flowable.FlowablePublishAlt;
import lf2.b1;
import lf2.h1;
import io.reactivex.internal.operators.flowable.FlowableScanSeed;
import lf2.g1;
import io.reactivex.internal.operators.flowable.FlowableSamplePublisher;
import io.reactivex.internal.operators.flowable.FlowableSampleTimed;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.internal.functions.Functions$k;
import io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate;
import io.reactivex.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.internal.operators.flowable.FlowableReplay$a;
import io.reactivex.internal.operators.flowable.FlowableReplay$g;
import io.reactivex.internal.operators.flowable.FlowableReplay$e;
import io.reactivex.internal.operators.flowable.FlowableReplay;
import lf2.u0;
import lf2.o0;
import lf2.i0;
import lf2.h0;
import io.reactivex.internal.operators.flowable.FlowableReplay$c;
import lf2.n0;
import io.reactivex.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.internal.operators.flowable.FlowableRepeatUntil;
import io.reactivex.internal.operators.flowable.FlowableRepeat;
import lf2.e1;
import lf2.c1;
import lf2.d1;
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
import lf2.z0;
import lf2.x0;
import lf2.y0;
import io.reactivex.internal.operators.flowable.FlowableJoin;
import lf2.e0;
import io.reactivex.internal.operators.flowable.FlowableGroupJoin;
import java.util.Map;
import io.reactivex.internal.operators.flowable.FlowableGroupBy;
import io.reactivex.internal.subscribers.ForEachWhileSubscriber;
import io.reactivex.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import lf2.j0;
import io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableMapNotification;
import lf2.l0;
import lf2.z;
import lf2.v;
import lf2.w;
import io.reactivex.internal.functions.Functions$a;
import lf2.u;
import io.reactivex.internal.functions.Functions$o;
import lf2.r0;
import lf2.s0;
import lf2.t0;
import io.reactivex.internal.functions.Functions$a0;
import io.reactivex.internal.functions.Functions$b0;
import io.reactivex.internal.functions.Functions$c0;
import ff2.p;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.internal.functions.Functions$p;
import io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther;
import lf2.m0;
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
import lf2.f1;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.functions.Functions$m;
import io.reactivex.internal.operators.flowable.FlowableCache;
import io.reactivex.internal.functions.Functions$j;
import io.reactivex.internal.operators.flowable.FlowableBufferBoundary;
import io.reactivex.internal.operators.flowable.FlowableBuffer;
import java.util.Collection;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.operators.flowable.BlockingFlowableIterable;
import java.util.Iterator;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import lf2.e;
import ff2.q;
import java.util.List;
import lf2.v0;
import io.reactivex.internal.operators.flowable.FlowableZip;
import io.reactivex.internal.operators.flowable.FlowableUsing;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.operators.flowable.FlowableTimeout;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle;
import io.reactivex.internal.operators.flowable.FlowableRangeLong;
import io.reactivex.internal.operators.flowable.FlowableRange;
import lf2.a1;
import lf2.w0;
import io.reactivex.internal.operators.flowable.FlowableIntervalRange;
import io.reactivex.internal.operators.flowable.FlowableInterval;
import io.reactivex.internal.operators.flowable.FlowableGenerate;
import lf2.p0;
import lf2.q0;
import lf2.d0;
import java.util.concurrent.TimeUnit;
import lf2.b0;
import java.util.concurrent.Future;
import lf2.a0;
import lf2.y;
import io.reactivex.internal.functions.Functions$w;
import lf2.x;
import lf2.t;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import io.reactivex.internal.operators.flowable.FlowableConcatArray;
import ff2.n;
import ff2.m;
import ff2.l;
import ff2.k;
import ff2.j;
import ff2.i;
import ff2.h;
import io.reactivex.internal.functions.Functions;
import ff2.c;
import io.reactivex.internal.operators.flowable.FlowableCombineLatest;
import hf2.a;
import ff2.o;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.flowable.FlowableAmb;
import nt2.b;

public abstract class g<T> implements b<T>
{
    public static final int BUFFER_SIZE;
    
    static {
        BUFFER_SIZE = Math.max(1, Integer.getInteger("rx2.buffer-size", 128));
    }
    
    public static <T> g<T> amb(final Iterable<? extends b<? extends T>> iterable) {
        if (iterable != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableAmb(null, iterable));
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
        return RxJavaPlugins.onAssembly((g)new FlowableAmb(array, null));
    }
    
    public static int bufferSize() {
        return g.BUFFER_SIZE;
    }
    
    public static <T, R> g<R> combineLatest(final o<? super Object[], ? extends R> o, final b<? extends T>... array) {
        return combineLatest((nt2.b<?>[])array, o, bufferSize());
    }
    
    public static <T, R> g<R> combineLatest(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        return combineLatest((Iterable<? extends nt2.b<?>>)iterable, o, bufferSize());
    }
    
    public static <T, R> g<R> combineLatest(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o, final int n) {
        if (iterable == null) {
            throw new NullPointerException("sources is null");
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g)new FlowableCombineLatest(iterable, o, false, n));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public static <T1, T2, R> g<R> combineLatest(final b<? extends T1> b, final b<? extends T2> b2, final c<? super T1, ? super T2, ? extends R> c) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.c((c)c), (nt2.b<?>[])new b[] { b, b2 });
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
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.d((h)h), (nt2.b<?>[])new b[] { b, b2, b3 });
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
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.e((i)i), (nt2.b<?>[])new b[] { b, b2, b3, b4 });
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
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.f((j)j), (nt2.b<?>[])new b[] { b, b2, b3, b4, b5 });
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
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.g((k)k), (nt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6 });
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
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.h((l)l), (nt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6, b7 });
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
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.i((m)m), (nt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6, b7, b8 });
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
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.j((n)n), (nt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6, b7, b8, b9 });
        }
        throw new NullPointerException("source9 is null");
    }
    
    public static <T, R> g<R> combineLatest(final b<? extends T>[] array, final o<? super Object[], ? extends R> o) {
        return combineLatest((nt2.b<?>[])array, o, bufferSize());
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
            return RxJavaPlugins.onAssembly((g)new FlowableCombineLatest(o, false, n, array));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public static <T, R> g<R> combineLatestDelayError(final o<? super Object[], ? extends R> o, final int n, final b<? extends T>... array) {
        return combineLatestDelayError((nt2.b<?>[])array, o, n);
    }
    
    public static <T, R> g<R> combineLatestDelayError(final o<? super Object[], ? extends R> o, final b<? extends T>... array) {
        return combineLatestDelayError((nt2.b<?>[])array, o, bufferSize());
    }
    
    public static <T, R> g<R> combineLatestDelayError(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        return combineLatestDelayError((Iterable<? extends nt2.b<?>>)iterable, o, bufferSize());
    }
    
    public static <T, R> g<R> combineLatestDelayError(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o, final int n) {
        if (iterable == null) {
            throw new NullPointerException("sources is null");
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g)new FlowableCombineLatest(iterable, o, true, n));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public static <T, R> g<R> combineLatestDelayError(final b<? extends T>[] array, final o<? super Object[], ? extends R> o) {
        return combineLatestDelayError((nt2.b<?>[])array, o, bufferSize());
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
        return RxJavaPlugins.onAssembly((g)new FlowableCombineLatest(o, true, n, array));
    }
    
    public static <T> g<T> concat(final Iterable<? extends b<? extends T>> iterable) {
        if (iterable != null) {
            return fromIterable((Iterable<?>)iterable).concatMapDelayError((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a, 2, false);
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> g<T> concat(final b<? extends b<? extends T>> b) {
        return concat(b, bufferSize());
    }
    
    public static <T> g<T> concat(final b<? extends b<? extends T>> b, final int n) {
        return fromPublisher((nt2.b<?>)b).concatMap((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a, n);
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
        return RxJavaPlugins.onAssembly((g)new FlowableConcatArray(array, false));
    }
    
    public static <T> g<T> concatArrayDelayError(final b<? extends T>... array) {
        if (array.length == 0) {
            return empty();
        }
        if (array.length == 1) {
            return fromPublisher(array[0]);
        }
        return RxJavaPlugins.onAssembly((g)new FlowableConcatArray(array, true));
    }
    
    public static <T> g<T> concatArrayEager(final int n, final int n2, final b<? extends T>... array) {
        if (array != null) {
            a.c(n, "maxConcurrency");
            a.c(n2, "prefetch");
            return RxJavaPlugins.onAssembly((g)new FlowableConcatMapEager(new FlowableFromArray(array), (o)Functions.a, n, n2, ErrorMode.IMMEDIATE));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> g<T> concatArrayEager(final b<? extends T>... array) {
        return concatArrayEager(bufferSize(), bufferSize(), array);
    }
    
    public static <T> g<T> concatArrayEagerDelayError(final int n, final int n2, final b<? extends T>... array) {
        return fromArray(array).concatMapEagerDelayError((ff2.o<? super b<? extends T>, ? extends nt2.b<? extends T>>)Functions.a, n, n2, true);
    }
    
    public static <T> g<T> concatArrayEagerDelayError(final b<? extends T>... array) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), array);
    }
    
    public static <T> g<T> concatDelayError(final Iterable<? extends b<? extends T>> iterable) {
        if (iterable != null) {
            return fromIterable((Iterable<?>)iterable).concatMapDelayError((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a);
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> g<T> concatDelayError(final b<? extends b<? extends T>> b) {
        return concatDelayError(b, bufferSize(), true);
    }
    
    public static <T> g<T> concatDelayError(final b<? extends b<? extends T>> b, final int n, final boolean b2) {
        return fromPublisher((nt2.b<?>)b).concatMapDelayError((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a, n, b2);
    }
    
    public static <T> g<T> concatEager(final Iterable<? extends b<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }
    
    public static <T> g<T> concatEager(final Iterable<? extends b<? extends T>> iterable, final int n, final int n2) {
        if (iterable != null) {
            a.c(n, "maxConcurrency");
            a.c(n2, "prefetch");
            return RxJavaPlugins.onAssembly((g)new FlowableConcatMapEager(new FlowableFromIterable(iterable), (o)Functions.a, n, n2, ErrorMode.IMMEDIATE));
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
            return RxJavaPlugins.onAssembly((g)new io.reactivex.internal.operators.flowable.a((b)b, n, n2, ErrorMode.IMMEDIATE));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> g<T> create(final af2.j<T> j, final BackpressureStrategy backpressureStrategy) {
        if (j == null) {
            throw new NullPointerException("source is null");
        }
        if (backpressureStrategy != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableCreate(j, backpressureStrategy));
        }
        throw new NullPointerException("mode is null");
    }
    
    public static <T> g<T> defer(final Callable<? extends b<? extends T>> callable) {
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g)new lf2.m(callable));
        }
        throw new NullPointerException("supplier is null");
    }
    
    private g<T> doOnEach(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2, final ff2.a a, final ff2.a a2) {
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
            return RxJavaPlugins.onAssembly((g)new t(this, (ff2.g)g, (ff2.g)g2, a, a2));
        }
        throw new NullPointerException("onAfterTerminate is null");
    }
    
    public static <T> g<T> empty() {
        return RxJavaPlugins.onAssembly((g)x.f);
    }
    
    public static <T> g<T> error(final Throwable t) {
        if (t != null) {
            return error((Callable<? extends Throwable>)new Functions$w((Object)t));
        }
        throw new NullPointerException("throwable is null");
    }
    
    public static <T> g<T> error(final Callable<? extends Throwable> callable) {
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g)new y(callable));
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
        return RxJavaPlugins.onAssembly((g)new FlowableFromArray(array));
    }
    
    public static <T> g<T> fromCallable(final Callable<? extends T> callable) {
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g)new a0(callable));
        }
        throw new NullPointerException("supplier is null");
    }
    
    public static <T> g<T> fromFuture(final Future<? extends T> future) {
        if (future != null) {
            return RxJavaPlugins.onAssembly((g)new b0(future, 0L, null));
        }
        throw new NullPointerException("future is null");
    }
    
    public static <T> g<T> fromFuture(final Future<? extends T> future, final long n, final TimeUnit timeUnit) {
        if (future == null) {
            throw new NullPointerException("future is null");
        }
        if (timeUnit != null) {
            return RxJavaPlugins.onAssembly((g)new b0(future, n, timeUnit));
        }
        throw new NullPointerException("unit is null");
    }
    
    public static <T> g<T> fromFuture(final Future<? extends T> future, final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        if (b0 != null) {
            return fromFuture(future, n, timeUnit).subscribeOn(b0);
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static <T> g<T> fromFuture(final Future<? extends T> future, final af2.b0 b0) {
        if (b0 != null) {
            return fromFuture(future).subscribeOn(b0);
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static <T> g<T> fromIterable(final Iterable<? extends T> iterable) {
        if (iterable != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableFromIterable(iterable));
        }
        throw new NullPointerException("source is null");
    }
    
    public static <T> g<T> fromPublisher(final b<? extends T> b) {
        if (b instanceof g) {
            return RxJavaPlugins.onAssembly((g)b);
        }
        if (b != null) {
            return RxJavaPlugins.onAssembly((g)new d0(b));
        }
        throw new NullPointerException("source is null");
    }
    
    public static <T> g<T> generate(final ff2.g<f<T>> g) {
        if (g != null) {
            return generate((Callable<Object>)Functions.i, (ff2.c<Object, af2.f<T>, Object>)new q0((ff2.g<af2.f<Object>>)g), (ff2.g<? super Object>)Functions.d);
        }
        throw new NullPointerException("generator is null");
    }
    
    public static <T, S> g<T> generate(final Callable<S> callable, final ff2.b<S, f<T>> b) {
        if (b != null) {
            return generate(callable, (ff2.c<S, af2.f<T>, S>)new p0((ff2.b<Object, af2.f<Object>>)b), (ff2.g<? super S>)Functions.d);
        }
        throw new NullPointerException("generator is null");
    }
    
    public static <T, S> g<T> generate(final Callable<S> callable, final ff2.b<S, f<T>> b, final ff2.g<? super S> g) {
        if (b != null) {
            return generate(callable, (ff2.c<S, af2.f<T>, S>)new p0((ff2.b<Object, af2.f<Object>>)b), g);
        }
        throw new NullPointerException("generator is null");
    }
    
    public static <T, S> g<T> generate(final Callable<S> callable, final c<S, f<T>, S> c) {
        return generate(callable, c, (ff2.g<? super S>)Functions.d);
    }
    
    public static <T, S> g<T> generate(final Callable<S> callable, final c<S, f<T>, S> c, final ff2.g<? super S> g) {
        if (callable == null) {
            throw new NullPointerException("initialState is null");
        }
        if (c == null) {
            throw new NullPointerException("generator is null");
        }
        if (g != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableGenerate(callable, c, g));
        }
        throw new NullPointerException("disposeState is null");
    }
    
    public static g<Long> interval(final long n, final long n2, final TimeUnit timeUnit) {
        return interval(n, n2, timeUnit, zf2.a.a());
    }
    
    public static g<Long> interval(final long n, final long n2, final TimeUnit timeUnit, final af2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableInterval(Math.max(0L, n), Math.max(0L, n2), timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static g<Long> interval(final long n, final TimeUnit timeUnit) {
        return interval(n, n, timeUnit, zf2.a.a());
    }
    
    public static g<Long> interval(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return interval(n, n, timeUnit, b0);
    }
    
    public static g<Long> intervalRange(final long n, final long n2, final long n3, final long n4, final TimeUnit timeUnit) {
        return intervalRange(n, n2, n3, n4, timeUnit, zf2.a.a());
    }
    
    public static g<Long> intervalRange(final long n, long n2, final long n3, final long n4, final TimeUnit timeUnit, final af2.b0 b0) {
        final long n5 = lcmp(n2, 0L);
        if (n5 < 0) {
            throw new IllegalArgumentException(m5.a.e("count >= 0 required but it was ", n2));
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
            return RxJavaPlugins.onAssembly((g)new FlowableIntervalRange(n, n2, Math.max(0L, n3), Math.max(0L, n4), timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static <T> g<T> just(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((g)new w0(t));
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
        return fromIterable((Iterable<?>)iterable).flatMap((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a);
    }
    
    public static <T> g<T> merge(final Iterable<? extends b<? extends T>> iterable, final int n) {
        return fromIterable((Iterable<?>)iterable).flatMap((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a, n);
    }
    
    public static <T> g<T> merge(final Iterable<? extends b<? extends T>> iterable, final int n, final int n2) {
        return fromIterable((Iterable<?>)iterable).flatMap((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a, false, n, n2);
    }
    
    public static <T> g<T> merge(final b<? extends b<? extends T>> b) {
        return merge(b, bufferSize());
    }
    
    public static <T> g<T> merge(final b<? extends b<? extends T>> b, final int n) {
        return fromPublisher((nt2.b<?>)b).flatMap((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a, n);
    }
    
    public static <T> g<T> merge(final b<? extends T> b, final b<? extends T> b2) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return fromArray(b, b2).flatMap((ff2.o<? super b, ? extends nt2.b<? extends T>>)Functions.a, false, 2);
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
            return fromArray(b, b2, b3).flatMap((ff2.o<? super b, ? extends nt2.b<? extends T>>)Functions.a, false, 3);
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
            return fromArray(b, b2, b3, b4).flatMap((ff2.o<? super b, ? extends nt2.b<? extends T>>)Functions.a, false, 4);
        }
        throw new NullPointerException("source4 is null");
    }
    
    public static <T> g<T> mergeArray(final int n, final int n2, final b<? extends T>... array) {
        return fromArray(array).flatMap((ff2.o<? super b<? extends T>, ? extends nt2.b<? extends T>>)Functions.a, false, n, n2);
    }
    
    public static <T> g<T> mergeArray(final b<? extends T>... array) {
        return fromArray(array).flatMap((ff2.o<? super b<? extends T>, ? extends nt2.b<? extends T>>)Functions.a, array.length);
    }
    
    public static <T> g<T> mergeArrayDelayError(final int n, final int n2, final b<? extends T>... array) {
        return fromArray(array).flatMap((ff2.o<? super b<? extends T>, ? extends nt2.b<? extends T>>)Functions.a, true, n, n2);
    }
    
    public static <T> g<T> mergeArrayDelayError(final b<? extends T>... array) {
        return fromArray(array).flatMap((ff2.o<? super b<? extends T>, ? extends nt2.b<? extends T>>)Functions.a, true, array.length);
    }
    
    public static <T> g<T> mergeDelayError(final Iterable<? extends b<? extends T>> iterable) {
        return fromIterable((Iterable<?>)iterable).flatMap((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a, true);
    }
    
    public static <T> g<T> mergeDelayError(final Iterable<? extends b<? extends T>> iterable, final int n) {
        return fromIterable((Iterable<?>)iterable).flatMap((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a, true, n);
    }
    
    public static <T> g<T> mergeDelayError(final Iterable<? extends b<? extends T>> iterable, final int n, final int n2) {
        return fromIterable((Iterable<?>)iterable).flatMap((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a, true, n, n2);
    }
    
    public static <T> g<T> mergeDelayError(final b<? extends b<? extends T>> b) {
        return mergeDelayError(b, bufferSize());
    }
    
    public static <T> g<T> mergeDelayError(final b<? extends b<? extends T>> b, final int n) {
        return fromPublisher((nt2.b<?>)b).flatMap((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a, true, n);
    }
    
    public static <T> g<T> mergeDelayError(final b<? extends T> b, final b<? extends T> b2) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return fromArray(b, b2).flatMap((ff2.o<? super b, ? extends nt2.b<? extends T>>)Functions.a, true, 2);
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
            return fromArray(b, b2, b3).flatMap((ff2.o<? super b, ? extends nt2.b<? extends T>>)Functions.a, true, 3);
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
            return fromArray(b, b2, b3, b4).flatMap((ff2.o<? super b, ? extends nt2.b<? extends T>>)Functions.a, true, 4);
        }
        throw new NullPointerException("source4 is null");
    }
    
    public static <T> g<T> never() {
        return RxJavaPlugins.onAssembly((g)a1.f);
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
            return RxJavaPlugins.onAssembly((g)new FlowableRange(n, n2));
        }
        throw new IllegalArgumentException("Integer overflow");
    }
    
    public static g<Long> rangeLong(final long n, final long n2) {
        final long n3 = lcmp(n2, 0L);
        if (n3 < 0) {
            throw new IllegalArgumentException(m5.a.e("count >= 0 required but it was ", n2));
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
        return RxJavaPlugins.onAssembly((g)new FlowableRangeLong(n, n2));
    }
    
    public static <T> c0<Boolean> sequenceEqual(final b<? extends T> b, final b<? extends T> b2) {
        return sequenceEqual((nt2.b<?>)b, (nt2.b<?>)b2, (ff2.d<? super Object, ? super Object>)a.a, bufferSize());
    }
    
    public static <T> c0<Boolean> sequenceEqual(final b<? extends T> b, final b<? extends T> b2, final int n) {
        return sequenceEqual((nt2.b<?>)b, (nt2.b<?>)b2, (ff2.d<? super Object, ? super Object>)a.a, n);
    }
    
    public static <T> c0<Boolean> sequenceEqual(final b<? extends T> b, final b<? extends T> b2, final ff2.d<? super T, ? super T> d) {
        return sequenceEqual((nt2.b<?>)b, (nt2.b<?>)b2, (ff2.d<? super Object, ? super Object>)d, bufferSize());
    }
    
    public static <T> c0<Boolean> sequenceEqual(final b<? extends T> b, final b<? extends T> b2, final ff2.d<? super T, ? super T> d, final int n) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (d != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((c0)new FlowableSequenceEqualSingle((b)b, (b)b2, (ff2.d)d, n));
        }
        throw new NullPointerException("isEqual is null");
    }
    
    public static <T> g<T> switchOnNext(final b<? extends b<? extends T>> b) {
        return fromPublisher((nt2.b<?>)b).switchMap((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a);
    }
    
    public static <T> g<T> switchOnNext(final b<? extends b<? extends T>> b, final int n) {
        return fromPublisher((nt2.b<?>)b).switchMap((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a, n);
    }
    
    public static <T> g<T> switchOnNextDelayError(final b<? extends b<? extends T>> b) {
        return switchOnNextDelayError(b, bufferSize());
    }
    
    public static <T> g<T> switchOnNextDelayError(final b<? extends b<? extends T>> b, final int n) {
        return fromPublisher((nt2.b<?>)b).switchMapDelayError((ff2.o<? super Object, ? extends nt2.b<? extends T>>)Functions.a, n);
    }
    
    private g<T> timeout0(final long n, final TimeUnit timeUnit, final b<? extends T> b, final af2.b0 b2) {
        if (timeUnit == null) {
            throw new NullPointerException("timeUnit is null");
        }
        if (b2 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableTimeoutTimed(this, n, timeUnit, b2, (b)b));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    private <U, V> g<T> timeout0(final b<U> b, final o<? super T, ? extends b<V>> o, final b<? extends T> b2) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableTimeout(this, (b)b, (o)o, (b)b2));
        }
        throw new NullPointerException("itemTimeoutIndicator is null");
    }
    
    public static g<Long> timer(final long n, final TimeUnit timeUnit) {
        return timer(n, timeUnit, zf2.a.a());
    }
    
    public static g<Long> timer(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableTimer(Math.max(0L, n), timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static <T> g<T> unsafeCreate(final b<T> b) {
        if (b == null) {
            throw new NullPointerException("onSubscribe is null");
        }
        if (!(b instanceof g)) {
            return RxJavaPlugins.onAssembly((g)new d0(b));
        }
        throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
    }
    
    public static <T, D> g<T> using(final Callable<? extends D> callable, final o<? super D, ? extends b<? extends T>> o, final ff2.g<? super D> g) {
        return using((Callable<?>)callable, (ff2.o<? super Object, ? extends nt2.b<? extends T>>)o, (ff2.g<? super Object>)g, true);
    }
    
    public static <T, D> g<T> using(final Callable<? extends D> callable, final o<? super D, ? extends b<? extends T>> o, final ff2.g<? super D> g, final boolean b) {
        if (callable == null) {
            throw new NullPointerException("resourceSupplier is null");
        }
        if (o == null) {
            throw new NullPointerException("sourceSupplier is null");
        }
        if (g != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableUsing((Callable)callable, (o)o, (ff2.g)g, b));
        }
        throw new NullPointerException("resourceDisposer is null");
    }
    
    public static <T, R> g<R> zip(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        if (o == null) {
            throw new NullPointerException("zipper is null");
        }
        if (iterable != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableZip((b[])null, (Iterable)iterable, (o)o, bufferSize(), false));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T, R> g<R> zip(final b<? extends b<? extends T>> b, final o<? super Object[], ? extends R> o) {
        if (o != null) {
            return fromPublisher((nt2.b<?>)b).toList().t((ff2.o<? super List<Object>, ? extends nt2.b<? extends R>>)new v0(o));
        }
        throw new NullPointerException("zipper is null");
    }
    
    public static <T1, T2, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final c<? super T1, ? super T2, ? extends R> c) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.c((c)c), false, bufferSize(), (nt2.b<?>[])new b[] { b, b2 });
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T1, T2, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final c<? super T1, ? super T2, ? extends R> c, final boolean b3) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.c((c)c), b3, bufferSize(), (nt2.b<?>[])new b[] { b, b2 });
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T1, T2, R> g<R> zip(final b<? extends T1> b, final b<? extends T2> b2, final c<? super T1, ? super T2, ? extends R> c, final boolean b3, final int n) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.c((c)c), b3, n, (nt2.b<?>[])new b[] { b, b2 });
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
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.d((h)h), false, bufferSize(), (nt2.b<?>[])new b[] { b, b2, b3 });
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
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.e((i)i), false, bufferSize(), (nt2.b<?>[])new b[] { b, b2, b3, b4 });
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
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.f((j)j), false, bufferSize(), (nt2.b<?>[])new b[] { b, b2, b3, b4, b5 });
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
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.g((k)k), false, bufferSize(), (nt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6 });
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
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.h((l)l), false, bufferSize(), (nt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6, b7 });
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
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.i((m)m), false, bufferSize(), (nt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6, b7, b8 });
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
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.j((n)n), false, bufferSize(), (nt2.b<?>[])new b[] { b, b2, b3, b4, b5, b6, b7, b8, b9 });
        }
        throw new NullPointerException("source9 is null");
    }
    
    public static <T, R> g<R> zipArray(final o<? super Object[], ? extends R> o, final boolean b, final int n, final b<? extends T>... array) {
        if (array.length == 0) {
            return empty();
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g)new FlowableZip((b[])array, (Iterable)null, (o)o, n, b));
        }
        throw new NullPointerException("zipper is null");
    }
    
    public static <T, R> g<R> zipIterable(final Iterable<? extends b<? extends T>> iterable, final o<? super Object[], ? extends R> o, final boolean b, final int n) {
        if (o == null) {
            throw new NullPointerException("zipper is null");
        }
        if (iterable != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g)new FlowableZip((b[])null, (Iterable)iterable, (o)o, n, b));
        }
        throw new NullPointerException("sources is null");
    }
    
    public final c0<Boolean> all(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((c0)new e(this, q));
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
            return RxJavaPlugins.onAssembly((c0)new lf2.f(this, q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final <R> R as(final af2.h<T, ? extends R> h) {
        if (h != null) {
            return (R)h.apply();
        }
        throw new NullPointerException("converter is null");
    }
    
    public final T blockingFirst() {
        final sf2.d d = new sf2.d();
        this.subscribe((af2.l<? super T>)d);
        final T a = ((sf2.c<T>)d).a();
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }
    
    public final T blockingFirst(T t) {
        final sf2.d d = new sf2.d();
        this.subscribe((af2.l<? super T>)d);
        final T a = ((sf2.c<T>)d).a();
        if (a != null) {
            t = a;
        }
        return t;
    }
    
    public final void blockingForEach(final ff2.g<? super T> g) {
        final Iterator<T> iterator = this.blockingIterable().iterator();
        while (iterator.hasNext()) {
            try {
                g.accept((Object)iterator.next());
                continue;
            }
            finally {
                xd.a.t1((Throwable)g);
                ((df2.a)iterator).dispose();
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
        return (Iterable<T>)new BlockingFlowableIterable(this, n);
    }
    
    public final T blockingLast() {
        final sf2.e e = new sf2.e();
        this.subscribe((af2.l<? super T>)e);
        final T a = ((sf2.c<T>)e).a();
        if (a != null) {
            return a;
        }
        throw new NoSuchElementException();
    }
    
    public final T blockingLast(T t) {
        final sf2.e e = new sf2.e();
        this.subscribe((af2.l<? super T>)e);
        final T a = ((sf2.c<T>)e).a();
        if (a != null) {
            t = a;
        }
        return t;
    }
    
    public final Iterable<T> blockingLatest() {
        return new lf2.b<T>((nt2.b<? extends T>)this);
    }
    
    public final Iterable<T> blockingMostRecent(final T t) {
        return new lf2.c<T>(this, t);
    }
    
    public final Iterable<T> blockingNext() {
        return new lf2.d<T>((nt2.b<? extends T>)this);
    }
    
    public final T blockingSingle() {
        return this.singleOrError().e();
    }
    
    public final T blockingSingle(final T t) {
        return this.single(t).e();
    }
    
    public final void blockingSubscribe() {
        final tf2.b b = new tf2.b();
        final LambdaSubscriber lambdaSubscriber = new LambdaSubscriber((ff2.g<? super Object>)Functions.d, (ff2.g<? super Throwable>)b, (ff2.a)b, (ff2.g<? super nt2.d>)Functions.k);
        ((b)this).subscribe((nt2.c)lambdaSubscriber);
        zd.b.j(b, (df2.a)lambdaSubscriber);
        final Throwable f = b.f;
        if (f == null) {
            return;
        }
        throw ExceptionHelper.d(f);
    }
    
    public final void blockingSubscribe(final ff2.g<? super T> g) {
        cg.d.W3((b)this, (ff2.g)g, (ff2.g)Functions.e, (ff2.a)Functions.c);
    }
    
    public final void blockingSubscribe(final ff2.g<? super T> g, final int n) {
        cg.d.X3((b)this, (ff2.g)g, (ff2.g)Functions.e, (ff2.a)Functions.c, n);
    }
    
    public final void blockingSubscribe(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2) {
        cg.d.W3((b)this, (ff2.g)g, (ff2.g)g2, (ff2.a)Functions.c);
    }
    
    public final void blockingSubscribe(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2, final int n) {
        cg.d.X3((b)this, (ff2.g)g, (ff2.g)g2, (ff2.a)Functions.c, n);
    }
    
    public final void blockingSubscribe(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2, final ff2.a a) {
        cg.d.W3((b)this, (ff2.g)g, (ff2.g)g2, a);
    }
    
    public final void blockingSubscribe(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2, final ff2.a a, final int n) {
        cg.d.X3((b)this, (ff2.g)g, (ff2.g)g2, a, n);
    }
    
    public final void blockingSubscribe(final nt2.c<? super T> c) {
        cg.d.Y3((nt2.c)c, (b)this);
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
            return RxJavaPlugins.onAssembly((g)new FlowableBuffer(this, n, n2, callable));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final <U extends Collection<? super T>> g<U> buffer(final int n, final Callable<U> callable) {
        return this.buffer(n, n, callable);
    }
    
    public final g<List<T>> buffer(final long n, final long n2, final TimeUnit timeUnit) {
        return this.buffer(n, n2, timeUnit, zf2.a.a(), ArrayListSupplier.asCallable());
    }
    
    public final g<List<T>> buffer(final long n, final long n2, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.buffer(n, n2, timeUnit, b0, ArrayListSupplier.asCallable());
    }
    
    public final <U extends Collection<? super T>> g<U> buffer(final long n, final long n2, final TimeUnit timeUnit, final af2.b0 b0, final Callable<U> callable) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g)new lf2.i(this, n, n2, timeUnit, b0, (Callable)callable, Integer.MAX_VALUE, false));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final g<List<T>> buffer(final long n, final TimeUnit timeUnit) {
        return this.buffer(n, timeUnit, zf2.a.a(), Integer.MAX_VALUE);
    }
    
    public final g<List<T>> buffer(final long n, final TimeUnit timeUnit, final int n2) {
        return this.buffer(n, timeUnit, zf2.a.a(), n2);
    }
    
    public final g<List<T>> buffer(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.buffer(n, timeUnit, b0, Integer.MAX_VALUE, ArrayListSupplier.asCallable(), false);
    }
    
    public final g<List<T>> buffer(final long n, final TimeUnit timeUnit, final af2.b0 b0, final int n2) {
        return this.buffer(n, timeUnit, b0, n2, ArrayListSupplier.asCallable(), false);
    }
    
    public final <U extends Collection<? super T>> g<U> buffer(final long n, final TimeUnit timeUnit, final af2.b0 b0, final int n2, final Callable<U> callable, final boolean b2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        if (callable != null) {
            a.c(n2, "count");
            return RxJavaPlugins.onAssembly((g)new lf2.i(this, n, n, timeUnit, b0, (Callable)callable, n2, b2));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final <TOpening, TClosing> g<List<T>> buffer(final g<? extends TOpening> g, final o<? super TOpening, ? extends b<? extends TClosing>> o) {
        return this.buffer((g<?>)g, (ff2.o<? super Object, ? extends nt2.b<?>>)o, ArrayListSupplier.asCallable());
    }
    
    public final <TOpening, TClosing, U extends Collection<? super T>> g<U> buffer(final g<? extends TOpening> g, final o<? super TOpening, ? extends b<? extends TClosing>> o, final Callable<U> callable) {
        if (g == null) {
            throw new NullPointerException("openingIndicator is null");
        }
        if (o == null) {
            throw new NullPointerException("closingIndicator is null");
        }
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableBufferBoundary(this, (b)g, o, callable));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final <B> g<List<T>> buffer(final Callable<? extends b<B>> callable) {
        return this.buffer((Callable<? extends nt2.b<Object>>)callable, ArrayListSupplier.asCallable());
    }
    
    public final <B, U extends Collection<? super T>> g<U> buffer(final Callable<? extends b<B>> callable, final Callable<U> callable2) {
        if (callable == null) {
            throw new NullPointerException("boundaryIndicatorSupplier is null");
        }
        if (callable2 != null) {
            return RxJavaPlugins.onAssembly((g)new lf2.g(this, (Callable)callable, (Callable)callable2));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final <B> g<List<T>> buffer(final b<B> b) {
        return this.buffer((nt2.b<Object>)b, ArrayListSupplier.asCallable());
    }
    
    public final <B> g<List<T>> buffer(final b<B> b, final int n) {
        a.c(n, "initialCapacity");
        return this.buffer((nt2.b<Object>)b, (Callable<List<T>>)new Functions$j(n));
    }
    
    public final <B, U extends Collection<? super T>> g<U> buffer(final b<B> b, final Callable<U> callable) {
        if (b == null) {
            throw new NullPointerException("boundaryIndicator is null");
        }
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g)new lf2.h(this, (b)b, (Callable)callable));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final g<T> cache() {
        return this.cacheWithInitialCapacity(16);
    }
    
    public final g<T> cacheWithInitialCapacity(final int n) {
        a.c(n, "initialCapacity");
        return RxJavaPlugins.onAssembly((g)new FlowableCache(this, n));
    }
    
    public final <U> g<U> cast(final Class<U> clazz) {
        if (clazz != null) {
            return this.map((ff2.o<? super T, ? extends U>)new Functions$m((Class)clazz));
        }
        throw new NullPointerException("clazz is null");
    }
    
    public final <U> c0<U> collect(final Callable<? extends U> callable, final ff2.b<? super U, ? super T> b) {
        if (callable == null) {
            throw new NullPointerException("initialItemSupplier is null");
        }
        if (b != null) {
            return RxJavaPlugins.onAssembly((c0)new lf2.j(this, callable, b));
        }
        throw new NullPointerException("collector is null");
    }
    
    public final <U> c0<U> collectInto(final U u, final ff2.b<? super U, ? super T> b) {
        if (u != null) {
            return this.collect((Callable<? extends U>)new Functions$w((Object)u), b);
        }
        throw new NullPointerException("initialItem is null");
    }
    
    public final <R> g<R> compose(final af2.m<? super T, ? extends R> m) {
        if (m != null) {
            return fromPublisher((nt2.b<? extends R>)m.d(this));
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
        if (!(this instanceof if2.h)) {
            return RxJavaPlugins.onAssembly((g)new FlowableConcatMap(n, this, o, ErrorMode.IMMEDIATE));
        }
        final Object call = ((if2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((g)new f1.a(o, call));
    }
    
    public final af2.a concatMapCompletable(final o<? super T, ? extends af2.e> o) {
        return this.concatMapCompletable(o, 2);
    }
    
    public final af2.a concatMapCompletable(final o<? super T, ? extends af2.e> o, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly((af2.a)new FlowableConcatMapCompletable(n, this, (o)o, ErrorMode.IMMEDIATE));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final af2.a concatMapCompletableDelayError(final o<? super T, ? extends af2.e> o) {
        return this.concatMapCompletableDelayError(o, true, 2);
    }
    
    public final af2.a concatMapCompletableDelayError(final o<? super T, ? extends af2.e> o, final boolean b) {
        return this.concatMapCompletableDelayError(o, b, 2);
    }
    
    public final af2.a concatMapCompletableDelayError(final o<? super T, ? extends af2.e> o, final boolean b, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            ErrorMode errorMode;
            if (b) {
                errorMode = ErrorMode.END;
            }
            else {
                errorMode = ErrorMode.BOUNDARY;
            }
            return RxJavaPlugins.onAssembly((af2.a)new FlowableConcatMapCompletable(n, this, (o)o, errorMode));
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
        if (!(this instanceof if2.h)) {
            ErrorMode errorMode;
            if (b) {
                errorMode = ErrorMode.END;
            }
            else {
                errorMode = ErrorMode.BOUNDARY;
            }
            return RxJavaPlugins.onAssembly((g)new FlowableConcatMap(n, this, o, errorMode));
        }
        final Object call = ((if2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((g)new f1.a(o, call));
    }
    
    public final <R> g<R> concatMapEager(final o<? super T, ? extends b<? extends R>> o) {
        return this.concatMapEager(o, bufferSize(), bufferSize());
    }
    
    public final <R> g<R> concatMapEager(final o<? super T, ? extends b<? extends R>> o, final int n, final int n2) {
        if (o != null) {
            a.c(n, "maxConcurrency");
            a.c(n2, "prefetch");
            return RxJavaPlugins.onAssembly((g)new FlowableConcatMapEager(this, o, n, n2, ErrorMode.IMMEDIATE));
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
            return RxJavaPlugins.onAssembly((g)new FlowableConcatMapEager((g<Object>)this, (ff2.o<? super Object, ? extends nt2.b<?>>)o, n, n2, errorMode));
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
            return RxJavaPlugins.onAssembly((g)new FlowableFlattenIterable(this, o, n));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> concatMapMaybe(final o<? super T, ? extends r<? extends R>> o) {
        return this.concatMapMaybe(o, 2);
    }
    
    public final <R> g<R> concatMapMaybe(final o<? super T, ? extends r<? extends R>> o, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly((g)new FlowableConcatMapMaybe(n, this, (o)o, ErrorMode.IMMEDIATE));
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
            return RxJavaPlugins.onAssembly((g)new FlowableConcatMapMaybe(n, this, (o)o, errorMode));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> concatMapSingle(final o<? super T, ? extends g0<? extends R>> o) {
        return this.concatMapSingle(o, 2);
    }
    
    public final <R> g<R> concatMapSingle(final o<? super T, ? extends g0<? extends R>> o, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly((g)new FlowableConcatMapSingle(n, this, (o)o, ErrorMode.IMMEDIATE));
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
            return RxJavaPlugins.onAssembly((g)new FlowableConcatMapSingle(n, this, (o)o, errorMode));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final g<T> concatWith(final af2.e e) {
        if (e != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableConcatWithCompletable(this, e));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> concatWith(final g0<? extends T> g0) {
        if (g0 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableConcatWithSingle(this, g0));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> concatWith(final r<? extends T> r) {
        if (r != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableConcatWithMaybe(this, r));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> concatWith(final b<? extends T> b) {
        if (b != null) {
            return concat((nt2.b<? extends T>)this, b);
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
        return RxJavaPlugins.onAssembly((c0)new lf2.l(this));
    }
    
    public final g<T> debounce(final long n, final TimeUnit timeUnit) {
        return this.debounce(n, timeUnit, zf2.a.a());
    }
    
    public final g<T> debounce(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableDebounceTimed(this, n, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <U> g<T> debounce(final o<? super T, ? extends b<U>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableDebounce(this, o));
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
        return this.delay(n, timeUnit, zf2.a.a(), false);
    }
    
    public final g<T> delay(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.delay(n, timeUnit, b0, false);
    }
    
    public final g<T> delay(final long n, final TimeUnit timeUnit, final af2.b0 b0, final boolean b2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g)new lf2.n(this, Math.max(0L, n), timeUnit, b0, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> delay(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.delay(n, timeUnit, zf2.a.a(), b);
    }
    
    public final <U> g<T> delay(final o<? super T, ? extends b<U>> o) {
        if (o != null) {
            return this.flatMap((ff2.o<? super T, ? extends nt2.b<? extends T>>)new m0((ff2.o<? super Object, ? extends nt2.b<Object>>)o));
        }
        throw new NullPointerException("itemDelayIndicator is null");
    }
    
    public final <U, V> g<T> delay(final b<U> b, final o<? super T, ? extends b<V>> o) {
        return this.delaySubscription((nt2.b<Object>)b).delay((ff2.o<? super T, ? extends nt2.b<Object>>)o);
    }
    
    public final g<T> delaySubscription(final long n, final TimeUnit timeUnit) {
        return this.delaySubscription(n, timeUnit, zf2.a.a());
    }
    
    public final g<T> delaySubscription(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.delaySubscription((nt2.b<Object>)timer(n, timeUnit, b0));
    }
    
    public final <U> g<T> delaySubscription(final b<U> b) {
        if (b != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableDelaySubscriptionOther((b)this, b));
        }
        throw new NullPointerException("subscriptionIndicator is null");
    }
    
    @Deprecated
    public final <T2> g<T2> dematerialize() {
        return RxJavaPlugins.onAssembly((g)new lf2.o(this, (o)Functions.a));
    }
    
    public final <R> g<R> dematerialize(final o<? super T, s<R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new lf2.o(this, (o)o));
        }
        throw new NullPointerException("selector is null");
    }
    
    public final g<T> distinct() {
        return this.distinct((ff2.o<? super T, Object>)Functions.a, Functions.a());
    }
    
    public final <K> g<T> distinct(final o<? super T, K> o) {
        return this.distinct((ff2.o<? super T, Object>)o, Functions.a());
    }
    
    public final <K> g<T> distinct(final o<? super T, K> o, final Callable<? extends Collection<? super K>> callable) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (callable != null) {
            return RxJavaPlugins.onAssembly((g)new lf2.q(this, (o)o, (Callable)callable));
        }
        throw new NullPointerException("collectionSupplier is null");
    }
    
    public final g<T> distinctUntilChanged() {
        return this.distinctUntilChanged((ff2.o<? super T, Object>)Functions.a);
    }
    
    public final g<T> distinctUntilChanged(final ff2.d<? super T, ? super T> d) {
        if (d != null) {
            return RxJavaPlugins.onAssembly((g)new lf2.r(this, (o)Functions.a, (ff2.d)d));
        }
        throw new NullPointerException("comparer is null");
    }
    
    public final <K> g<T> distinctUntilChanged(final o<? super T, K> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new lf2.r(this, (o)o, (ff2.d)a.a));
        }
        throw new NullPointerException("keySelector is null");
    }
    
    public final g<T> doAfterNext(final ff2.g<? super T> g) {
        if (g != null) {
            return RxJavaPlugins.onAssembly((g)new lf2.s(this, (ff2.g)g));
        }
        throw new NullPointerException("onAfterNext is null");
    }
    
    public final g<T> doAfterTerminate(final ff2.a a) {
        final Functions$p d = Functions.d;
        return this.doOnEach((ff2.g<? super T>)d, (ff2.g<? super Throwable>)d, (ff2.a)Functions.c, a);
    }
    
    public final g<T> doFinally(final ff2.a a) {
        if (a != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableDoFinally(this, a));
        }
        throw new NullPointerException("onFinally is null");
    }
    
    public final g<T> doOnCancel(final ff2.a a) {
        return this.doOnLifecycle((ff2.g<? super nt2.d>)Functions.d, (p)Functions.f, a);
    }
    
    public final g<T> doOnComplete(final ff2.a a) {
        final Functions$p d = Functions.d;
        return this.doOnEach((ff2.g<? super T>)d, (ff2.g<? super Throwable>)d, a, (ff2.a)Functions.c);
    }
    
    public final g<T> doOnEach(final ff2.g<? super s<T>> g) {
        if (g != null) {
            return this.doOnEach((ff2.g<? super T>)new Functions$c0((ff2.g)g), (ff2.g<? super Throwable>)new Functions$b0((ff2.g)g), (ff2.a)new Functions$a0((ff2.g)g), (ff2.a)Functions.c);
        }
        throw new NullPointerException("onNotification is null");
    }
    
    public final g<T> doOnEach(final nt2.c<? super T> c) {
        if (c != null) {
            return this.doOnEach((ff2.g<? super T>)new t0((nt2.c<Object>)c), (ff2.g<? super Throwable>)new s0((nt2.c<Object>)c), (ff2.a)new r0((nt2.c<Object>)c), (ff2.a)Functions.c);
        }
        throw new NullPointerException("subscriber is null");
    }
    
    public final g<T> doOnError(final ff2.g<? super Throwable> g) {
        final Functions$p d = Functions.d;
        final Functions$o c = Functions.c;
        return this.doOnEach((ff2.g<? super T>)d, g, (ff2.a)c, (ff2.a)c);
    }
    
    public final g<T> doOnLifecycle(final ff2.g<? super nt2.d> g, final p p3, final ff2.a a) {
        if (g == null) {
            throw new NullPointerException("onSubscribe is null");
        }
        if (p3 == null) {
            throw new NullPointerException("onRequest is null");
        }
        if (a != null) {
            return RxJavaPlugins.onAssembly((g)new u(this, (ff2.g)g, p3, a));
        }
        throw new NullPointerException("onCancel is null");
    }
    
    public final g<T> doOnNext(final ff2.g<? super T> g) {
        final Functions$p d = Functions.d;
        final Functions$o c = Functions.c;
        return this.doOnEach(g, (ff2.g<? super Throwable>)d, (ff2.a)c, (ff2.a)c);
    }
    
    public final g<T> doOnRequest(final p p) {
        return this.doOnLifecycle((ff2.g<? super nt2.d>)Functions.d, p, (ff2.a)Functions.c);
    }
    
    public final g<T> doOnSubscribe(final ff2.g<? super nt2.d> g) {
        return this.doOnLifecycle(g, (p)Functions.f, (ff2.a)Functions.c);
    }
    
    public final g<T> doOnTerminate(final ff2.a a) {
        return this.doOnEach((ff2.g<? super T>)Functions.d, (ff2.g<? super Throwable>)new Functions$a(a), a, (ff2.a)Functions.c);
    }
    
    public final c0<T> elementAt(final long n, final T t) {
        if (n < 0L) {
            throw new IndexOutOfBoundsException(m5.a.e("index >= 0 required but it was ", n));
        }
        if (t != null) {
            return RxJavaPlugins.onAssembly((c0)new w(this, n, t));
        }
        throw new NullPointerException("defaultItem is null");
    }
    
    public final af2.n<T> elementAt(final long n) {
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((af2.n)new v(n, this));
        }
        throw new IndexOutOfBoundsException(m5.a.e("index >= 0 required but it was ", n));
    }
    
    public final c0<T> elementAtOrError(final long n) {
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((c0)new w(this, n, null));
        }
        throw new IndexOutOfBoundsException(m5.a.e("index >= 0 required but it was ", n));
    }
    
    public final g<T> filter(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((g)new z(this, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final c0<T> first(final T t) {
        return this.elementAt(0L, t);
    }
    
    public final af2.n<T> firstElement() {
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
        return this.flatMap((ff2.o<? super T, ? extends nt2.b<?>>)o, (ff2.c<? super T, ? super Object, ? extends R>)c, false, bufferSize(), bufferSize());
    }
    
    public final <U, R> g<R> flatMap(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final int n) {
        return this.flatMap((ff2.o<? super T, ? extends nt2.b<?>>)o, (ff2.c<? super T, ? super Object, ? extends R>)c, false, n, bufferSize());
    }
    
    public final <U, R> g<R> flatMap(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b) {
        return this.flatMap((ff2.o<? super T, ? extends nt2.b<?>>)o, (ff2.c<? super T, ? super Object, ? extends R>)c, b, bufferSize(), bufferSize());
    }
    
    public final <U, R> g<R> flatMap(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b, final int n) {
        return this.flatMap((ff2.o<? super T, ? extends nt2.b<?>>)o, (ff2.c<? super T, ? super Object, ? extends R>)c, b, n, bufferSize());
    }
    
    public final <U, R> g<R> flatMap(final o<? super T, ? extends b<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b, final int n, final int n2) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        if (c != null) {
            a.c(n, "maxConcurrency");
            a.c(n2, "bufferSize");
            return this.flatMap((ff2.o<? super T, ? extends nt2.b<? extends R>>)new l0(o, c), b, n, n2);
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
            return merge((nt2.b<? extends nt2.b<? extends R>>)new FlowableMapNotification((g<Object>)this, (ff2.o<? super Object, ?>)o, o2, callable));
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
            return merge((nt2.b<? extends nt2.b<? extends R>>)new FlowableMapNotification((g<Object>)this, (ff2.o<? super Object, ?>)o, o2, callable), n);
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
        if (!(this instanceof if2.h)) {
            return RxJavaPlugins.onAssembly((g)new FlowableFlatMap(this, o, b, n, n2));
        }
        final Object call = ((if2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((g)new f1.a(o, call));
    }
    
    public final af2.a flatMapCompletable(final o<? super T, ? extends af2.e> o) {
        return this.flatMapCompletable(o, false, Integer.MAX_VALUE);
    }
    
    public final af2.a flatMapCompletable(final o<? super T, ? extends af2.e> o, final boolean b, final int n) {
        if (o != null) {
            a.c(n, "maxConcurrency");
            return RxJavaPlugins.onAssembly((af2.a)new FlowableFlatMapCompletableCompletable<Object>(n, this, o, b));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <U> g<U> flatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o) {
        return this.flatMapIterable(o, bufferSize());
    }
    
    public final <U> g<U> flatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o, final int n) {
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g)new FlowableFlattenIterable(this, o, n));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <U, V> g<V> flatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o, final c<? super T, ? super U, ? extends V> c) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        if (c != null) {
            return this.flatMap((ff2.o<? super T, ? extends nt2.b<?>>)new j0((ff2.o<? super Object, ? extends Iterable<?>>)o), (ff2.c<? super T, ? super Object, ? extends V>)c, false, bufferSize(), bufferSize());
        }
        throw new NullPointerException("resultSelector is null");
    }
    
    public final <U, V> g<V> flatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o, final c<? super T, ? super U, ? extends V> c, final int n) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        if (c != null) {
            return this.flatMap((ff2.o<? super T, ? extends nt2.b<?>>)new j0((ff2.o<? super Object, ? extends Iterable<?>>)o), (ff2.c<? super T, ? super Object, ? extends V>)c, false, bufferSize(), n);
        }
        throw new NullPointerException("resultSelector is null");
    }
    
    public final <R> g<R> flatMapMaybe(final o<? super T, ? extends r<? extends R>> o) {
        return this.flatMapMaybe(o, false, Integer.MAX_VALUE);
    }
    
    public final <R> g<R> flatMapMaybe(final o<? super T, ? extends r<? extends R>> o, final boolean b, final int n) {
        if (o != null) {
            a.c(n, "maxConcurrency");
            return RxJavaPlugins.onAssembly((g)new FlowableFlatMapMaybe(n, this, o, b));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> flatMapSingle(final o<? super T, ? extends g0<? extends R>> o) {
        return this.flatMapSingle(o, false, Integer.MAX_VALUE);
    }
    
    public final <R> g<R> flatMapSingle(final o<? super T, ? extends g0<? extends R>> o, final boolean b, final int n) {
        if (o != null) {
            a.c(n, "maxConcurrency");
            return RxJavaPlugins.onAssembly((g)new FlowableFlatMapSingle(n, this, o, b));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final df2.a forEach(final ff2.g<? super T> g) {
        return this.subscribe(g);
    }
    
    public final df2.a forEachWhile(final q<? super T> q) {
        return this.forEachWhile(q, (ff2.g<? super Throwable>)Functions.e, (ff2.a)Functions.c);
    }
    
    public final df2.a forEachWhile(final q<? super T> q, final ff2.g<? super Throwable> g) {
        return this.forEachWhile(q, g, (ff2.a)Functions.c);
    }
    
    public final df2.a forEachWhile(final q<? super T> q, final ff2.g<? super Throwable> g, final ff2.a a) {
        if (q == null) {
            throw new NullPointerException("onNext is null");
        }
        if (g == null) {
            throw new NullPointerException("onError is null");
        }
        if (a != null) {
            final ForEachWhileSubscriber<Object> forEachWhileSubscriber = new ForEachWhileSubscriber<Object>((ff2.q<? super Object>)q, g, a);
            this.subscribe(forEachWhileSubscriber);
            return (df2.a)forEachWhileSubscriber;
        }
        throw new NullPointerException("onComplete is null");
    }
    
    public final <K> g<ef2.b<K, T>> groupBy(final o<? super T, ? extends K> o) {
        return this.groupBy(o, (ff2.o<? super T, ? extends T>)Functions.a, false, bufferSize());
    }
    
    public final <K, V> g<ef2.b<K, V>> groupBy(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        return this.groupBy(o, o2, false, bufferSize());
    }
    
    public final <K, V> g<ef2.b<K, V>> groupBy(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b) {
        return this.groupBy(o, o2, b, bufferSize());
    }
    
    public final <K, V> g<ef2.b<K, V>> groupBy(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b, final int n) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (o2 != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g)new FlowableGroupBy(this, o, o2, n, b, null));
        }
        throw new NullPointerException("valueSelector is null");
    }
    
    public final <K, V> g<ef2.b<K, V>> groupBy(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b, final int n, final o<? super ff2.g<Object>, ? extends Map<K, Object>> o3) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (o2 == null) {
            throw new NullPointerException("valueSelector is null");
        }
        a.c(n, "bufferSize");
        if (o3 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableGroupBy(this, o, o2, n, b, o3));
        }
        throw new NullPointerException("evictingMapFactory is null");
    }
    
    public final <K> g<ef2.b<K, T>> groupBy(final o<? super T, ? extends K> o, final boolean b) {
        return this.groupBy(o, (ff2.o<? super T, ? extends T>)Functions.a, b, bufferSize());
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
            return RxJavaPlugins.onAssembly((g)new FlowableGroupJoin(this, b, o, o2, c));
        }
        throw new NullPointerException("resultSelector is null");
    }
    
    public final g<T> hide() {
        return RxJavaPlugins.onAssembly((g)new e0(this));
    }
    
    public final af2.a ignoreElements() {
        return RxJavaPlugins.onAssembly((af2.a)new lf2.g0<Object>(this));
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
            return RxJavaPlugins.onAssembly((g)new FlowableJoin(this, b, o, o2, c));
        }
        throw new NullPointerException("resultSelector is null");
    }
    
    public final c0<T> last(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((c0)new y0((b)this, t));
        }
        throw new NullPointerException("defaultItem");
    }
    
    public final af2.n<T> lastElement() {
        return RxJavaPlugins.onAssembly((af2.n)new x0((b)this));
    }
    
    public final c0<T> lastOrError() {
        return RxJavaPlugins.onAssembly((c0)new y0((b)this, null));
    }
    
    public final <R> g<R> lift(final af2.k<? extends R, ? super T> k) {
        if (k != null) {
            return RxJavaPlugins.onAssembly((g)new z0(this, (af2.k)k));
        }
        throw new NullPointerException("lifter is null");
    }
    
    public final g<T> limit(final long n) {
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((g)new FlowableLimit(n, this));
        }
        throw new IllegalArgumentException(m5.a.e("count >= 0 required but it was ", n));
    }
    
    public final <R> g<R> map(final o<? super T, ? extends R> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new io.reactivex.internal.operators.flowable.c(this, (o)o));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final g<s<T>> materialize() {
        return RxJavaPlugins.onAssembly((g)new FlowableMaterialize(this));
    }
    
    public final g<T> mergeWith(final af2.e e) {
        if (e != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableMergeWithCompletable(this, e));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> mergeWith(final g0<? extends T> g0) {
        if (g0 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableMergeWithSingle(this, g0));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> mergeWith(final r<? extends T> r) {
        if (r != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableMergeWithMaybe(this, r));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> mergeWith(final b<? extends T> b) {
        if (b != null) {
            return merge((nt2.b<? extends T>)this, b);
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> observeOn(final af2.b0 b0) {
        return this.observeOn(b0, false, bufferSize());
    }
    
    public final g<T> observeOn(final af2.b0 b0, final boolean b2) {
        return this.observeOn(b0, b2, bufferSize());
    }
    
    public final g<T> observeOn(final af2.b0 b0, final boolean b2, final int n) {
        if (b0 != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g)new FlowableObserveOn(this, b0, b2, n));
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
    
    public final g<T> onBackpressureBuffer(final int n, final ff2.a a) {
        return this.onBackpressureBuffer(n, false, false, a);
    }
    
    public final g<T> onBackpressureBuffer(final int n, final boolean b) {
        return this.onBackpressureBuffer(n, b, false);
    }
    
    public final g<T> onBackpressureBuffer(final int n, final boolean b, final boolean b2) {
        a.c(n, "capacity");
        return RxJavaPlugins.onAssembly((g)new FlowableOnBackpressureBuffer(this, n, b2, b, (ff2.a)Functions.c));
    }
    
    public final g<T> onBackpressureBuffer(final int n, final boolean b, final boolean b2, final ff2.a a) {
        if (a != null) {
            a.c(n, "capacity");
            return RxJavaPlugins.onAssembly((g)new FlowableOnBackpressureBuffer(this, n, b2, b, a));
        }
        throw new NullPointerException("onOverflow is null");
    }
    
    public final g<T> onBackpressureBuffer(final long n, final ff2.a a, final BackpressureOverflowStrategy backpressureOverflowStrategy) {
        if (backpressureOverflowStrategy != null) {
            a.d(n, "capacity");
            return RxJavaPlugins.onAssembly((g)new FlowableOnBackpressureBufferStrategy(this, n, a, backpressureOverflowStrategy));
        }
        throw new NullPointerException("overflowStrategy is null");
    }
    
    public final g<T> onBackpressureBuffer(final boolean b) {
        return this.onBackpressureBuffer(bufferSize(), b, true);
    }
    
    public final g<T> onBackpressureDrop() {
        return RxJavaPlugins.onAssembly((g)new FlowableOnBackpressureDrop(this));
    }
    
    public final g<T> onBackpressureDrop(final ff2.g<? super T> g) {
        if (g != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableOnBackpressureDrop(this, g));
        }
        throw new NullPointerException("onDrop is null");
    }
    
    public final g<T> onBackpressureLatest() {
        return RxJavaPlugins.onAssembly((g)new FlowableOnBackpressureLatest(this));
    }
    
    public final g<T> onErrorResumeNext(final o<? super Throwable, ? extends b<? extends T>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableOnErrorNext(this, o, false));
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
            return RxJavaPlugins.onAssembly((g)new FlowableOnErrorReturn(this, (o)o));
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
            return RxJavaPlugins.onAssembly((g)new FlowableOnErrorNext(this, (o)new Functions$w((Object)b), true));
        }
        throw new NullPointerException("next is null");
    }
    
    public final g<T> onTerminateDetach() {
        return RxJavaPlugins.onAssembly((g)new lf2.p(this));
    }
    
    public final wf2.a<T> parallel() {
        return wf2.a.a((nt2.b<? extends T>)this, Runtime.getRuntime().availableProcessors(), bufferSize());
    }
    
    public final wf2.a<T> parallel(final int n) {
        a.c(n, "parallelism");
        return wf2.a.a((nt2.b<? extends T>)this, n, bufferSize());
    }
    
    public final wf2.a<T> parallel(final int n, final int n2) {
        a.c(n, "parallelism");
        a.c(n2, "prefetch");
        return wf2.a.a((nt2.b<? extends T>)this, n, n2);
    }
    
    public final <R> g<R> publish(final o<? super g<T>, ? extends b<R>> o) {
        return this.publish((ff2.o<? super g<T>, ? extends nt2.b<? extends R>>)o, bufferSize());
    }
    
    public final <R> g<R> publish(final o<? super g<T>, ? extends b<? extends R>> o, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly((g)new FlowablePublishMulticast(n, this, (o)o));
        }
        throw new NullPointerException("selector is null");
    }
    
    public final ef2.a<T> publish() {
        return this.publish(bufferSize());
    }
    
    public final ef2.a<T> publish(final int n) {
        a.c(n, "bufferSize");
        final AtomicReference atomicReference = new AtomicReference();
        return (ef2.a<T>)RxJavaPlugins.onAssembly((ef2.a)new FlowablePublish(new FlowablePublish$a(atomicReference, n), this, atomicReference, n));
    }
    
    public final g<T> rebatchRequests(final int n) {
        return this.observeOn((af2.b0)rf2.b.b, true, n);
    }
    
    public final <R> c0<R> reduce(final R r, final c<R, ? super T, R> c) {
        if (r == null) {
            throw new NullPointerException("seed is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((c0)new d1((b)this, r, c));
        }
        throw new NullPointerException("reducer is null");
    }
    
    public final af2.n<T> reduce(final c<T, T, T> c) {
        if (c != null) {
            return RxJavaPlugins.onAssembly((af2.n)new c1(this, c));
        }
        throw new NullPointerException("reducer is null");
    }
    
    public final <R> c0<R> reduceWith(final Callable<R> callable, final c<R, ? super T, R> c) {
        if (callable == null) {
            throw new NullPointerException("seedSupplier is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((c0)new e1((b)this, callable, c));
        }
        throw new NullPointerException("reducer is null");
    }
    
    public final g<T> repeat() {
        return this.repeat(Long.MAX_VALUE);
    }
    
    public final g<T> repeat(final long n) {
        final long n2 = lcmp(n, 0L);
        if (n2 < 0) {
            throw new IllegalArgumentException(m5.a.e("times >= 0 required but it was ", n));
        }
        if (n2 == 0) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((g)new FlowableRepeat(n, this));
    }
    
    public final g<T> repeatUntil(final ff2.e e) {
        if (e != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableRepeatUntil(this, e));
        }
        throw new NullPointerException("stop is null");
    }
    
    public final g<T> repeatWhen(final o<? super g<Object>, ? extends b<?>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableRepeatWhen(this, (o)o));
        }
        throw new NullPointerException("handler is null");
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o) {
        if (o != null) {
            return (g<R>)new FlowableReplay$c((o)o, (Callable)new n0(this));
        }
        throw new NullPointerException("selector is null");
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final int n) {
        if (o != null) {
            a.c(n, "bufferSize");
            return (g<R>)new FlowableReplay$c((o)o, (Callable)new h0(this, n));
        }
        throw new NullPointerException("selector is null");
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final int n, final long n2, final TimeUnit timeUnit) {
        return this.replay(o, n, n2, timeUnit, zf2.a.a());
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final int n, final long n2, final TimeUnit timeUnit, final af2.b0 b0) {
        if (o == null) {
            throw new NullPointerException("selector is null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        a.c(n, "bufferSize");
        if (b0 != null) {
            return (g<R>)new FlowableReplay$c((o)o, (Callable)new i0(n, n2, this, b0, timeUnit));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final int n, final af2.b0 b0) {
        if (o == null) {
            throw new NullPointerException("selector is null");
        }
        if (b0 != null) {
            a.c(n, "bufferSize");
            return (g<R>)new FlowableReplay$c((o)new o0((ff2.o<? super g<Object>, ? extends nt2.b<Object>>)o, b0), (Callable)new h0(this, n));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final long n, final TimeUnit timeUnit) {
        return this.replay(o, n, timeUnit, zf2.a.a());
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        if (o == null) {
            throw new NullPointerException("selector is null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return (g<R>)new FlowableReplay$c((o)o, (Callable)new u0(this, n, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <R> g<R> replay(final o<? super g<T>, ? extends b<R>> o, final af2.b0 b0) {
        if (o == null) {
            throw new NullPointerException("selector is null");
        }
        if (b0 != null) {
            return (g<R>)new FlowableReplay$c((o)new o0((ff2.o<? super g<Object>, ? extends nt2.b<Object>>)o, b0), (Callable)new n0(this));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final ef2.a<T> replay() {
        return (ef2.a<T>)FlowableReplay.f(this, (Callable)FlowableReplay.j);
    }
    
    public final ef2.a<T> replay(final int n) {
        a.c(n, "bufferSize");
        ef2.a a;
        if (n == Integer.MAX_VALUE) {
            a = FlowableReplay.f(this, (Callable)FlowableReplay.j);
        }
        else {
            a = FlowableReplay.f(this, (Callable)new FlowableReplay$e(n));
        }
        return (ef2.a<T>)a;
    }
    
    public final ef2.a<T> replay(final int n, final long n2, final TimeUnit timeUnit) {
        return this.replay(n, n2, timeUnit, zf2.a.a());
    }
    
    public final ef2.a<T> replay(final int n, final long n2, final TimeUnit timeUnit, final af2.b0 b0) {
        a.c(n, "bufferSize");
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            a.c(n, "bufferSize");
            return (ef2.a<T>)FlowableReplay.f(this, (Callable)new FlowableReplay$g(n, n2, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final ef2.a<T> replay(final int n, final af2.b0 b0) {
        if (b0 != null) {
            final ef2.a<T> replay = this.replay(n);
            return (ef2.a<T>)RxJavaPlugins.onAssembly((ef2.a)new FlowableReplay$a((ef2.a)replay, (g)((g)replay).observeOn(b0)));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final ef2.a<T> replay(final long n, final TimeUnit timeUnit) {
        return this.replay(n, timeUnit, zf2.a.a());
    }
    
    public final ef2.a<T> replay(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return (ef2.a<T>)FlowableReplay.f(this, (Callable)new FlowableReplay$g(Integer.MAX_VALUE, n, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final ef2.a<T> replay(final af2.b0 b0) {
        if (b0 != null) {
            final ef2.a<T> replay = this.replay();
            return (ef2.a<T>)RxJavaPlugins.onAssembly((ef2.a)new FlowableReplay$a((ef2.a)replay, (g)((g)replay).observeOn(b0)));
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
            throw new IllegalArgumentException(m5.a.e("times >= 0 required but it was ", n));
        }
        if (q != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableRetryPredicate(this, n, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final g<T> retry(final ff2.d<? super Integer, ? super Throwable> d) {
        if (d != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableRetryBiPredicate(this, (ff2.d)d));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final g<T> retry(final q<? super Throwable> q) {
        return this.retry(Long.MAX_VALUE, q);
    }
    
    public final g<T> retryUntil(final ff2.e e) {
        if (e != null) {
            return this.retry(Long.MAX_VALUE, (q<? super Throwable>)new Functions$k(e));
        }
        throw new NullPointerException("stop is null");
    }
    
    public final g<T> retryWhen(final o<? super g<Throwable>, ? extends b<?>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableRetryWhen(this, (o)o));
        }
        throw new NullPointerException("handler is null");
    }
    
    public final void safeSubscribe(final nt2.c<? super T> c) {
        if (c != null) {
            if (c instanceof bg2.c) {
                this.subscribe((af2.l<? super T>)c);
            }
            else {
                this.subscribe((af2.l<? super T>)new bg2.c((nt2.c)c));
            }
            return;
        }
        throw new NullPointerException("s is null");
    }
    
    public final g<T> sample(final long n, final TimeUnit timeUnit) {
        return this.sample(n, timeUnit, zf2.a.a());
    }
    
    public final g<T> sample(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableSampleTimed(this, n, timeUnit, b0, false));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> sample(final long n, final TimeUnit timeUnit, final af2.b0 b0, final boolean b2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableSampleTimed(this, n, timeUnit, b0, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> sample(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.sample(n, timeUnit, zf2.a.a(), b);
    }
    
    public final <U> g<T> sample(final b<U> b) {
        if (b != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableSamplePublisher((b)this, (b)b, false));
        }
        throw new NullPointerException("sampler is null");
    }
    
    public final <U> g<T> sample(final b<U> b, final boolean b2) {
        if (b != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableSamplePublisher((b)this, (b)b, b2));
        }
        throw new NullPointerException("sampler is null");
    }
    
    public final g<T> scan(final c<T, T, T> c) {
        if (c != null) {
            return RxJavaPlugins.onAssembly((g)new g1(this, (c)c));
        }
        throw new NullPointerException("accumulator is null");
    }
    
    public final <R> g<R> scan(final R r, final c<R, ? super T, R> c) {
        if (r != null) {
            return this.scanWith((Callable<R>)new Functions$w((Object)r), c);
        }
        throw new NullPointerException("initialValue is null");
    }
    
    public final <R> g<R> scanWith(final Callable<R> callable, final c<R, ? super T, R> c) {
        if (callable == null) {
            throw new NullPointerException("seedSupplier is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableScanSeed(this, (Callable)callable, (c)c));
        }
        throw new NullPointerException("accumulator is null");
    }
    
    public final g<T> serialize() {
        return RxJavaPlugins.onAssembly((g)new h1(this));
    }
    
    public final g<T> share() {
        final ef2.a<T> publish = this.publish();
        publish.getClass();
        ef2.a onAssembly = publish;
        if (publish instanceof b1) {
            final b1 b1 = (b1)publish;
            onAssembly = RxJavaPlugins.onAssembly((ef2.a)new FlowablePublishAlt((b)b1.a(), b1.b()));
        }
        return RxJavaPlugins.onAssembly((g)new FlowableRefCount(onAssembly));
    }
    
    public final c0<T> single(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((c0)new j1(this, t));
        }
        throw new NullPointerException("defaultItem is null");
    }
    
    public final af2.n<T> singleElement() {
        return RxJavaPlugins.onAssembly((af2.n)new i1(this));
    }
    
    public final c0<T> singleOrError() {
        return RxJavaPlugins.onAssembly((c0)new j1(this, null));
    }
    
    public final g<T> skip(final long n) {
        if (n <= 0L) {
            return RxJavaPlugins.onAssembly(this);
        }
        return RxJavaPlugins.onAssembly((g)new k1(n, this));
    }
    
    public final g<T> skip(final long n, final TimeUnit timeUnit) {
        return this.skipUntil((nt2.b<Object>)timer(n, timeUnit));
    }
    
    public final g<T> skip(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.skipUntil((nt2.b<Object>)timer(n, timeUnit, b0));
    }
    
    public final g<T> skipLast(final int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException(d.h("count >= 0 required but it was ", n));
        }
        if (n == 0) {
            return RxJavaPlugins.onAssembly(this);
        }
        return RxJavaPlugins.onAssembly((g)new FlowableSkipLast(this, n));
    }
    
    public final g<T> skipLast(final long n, final TimeUnit timeUnit) {
        return this.skipLast(n, timeUnit, zf2.a.a(), false, bufferSize());
    }
    
    public final g<T> skipLast(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.skipLast(n, timeUnit, b0, false, bufferSize());
    }
    
    public final g<T> skipLast(final long n, final TimeUnit timeUnit, final af2.b0 b0, final boolean b2) {
        return this.skipLast(n, timeUnit, b0, b2, bufferSize());
    }
    
    public final g<T> skipLast(final long n, final TimeUnit timeUnit, final af2.b0 b0, final boolean b2, final int n2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            a.c(n2, "bufferSize");
            return RxJavaPlugins.onAssembly((g)new FlowableSkipLastTimed(this, n, timeUnit, b0, n2 << 1, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> skipLast(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.skipLast(n, timeUnit, zf2.a.a(), b, bufferSize());
    }
    
    public final <U> g<T> skipUntil(final b<U> b) {
        if (b != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableSkipUntil(this, (b)b));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> skipWhile(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((g)new l1(this, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final g<T> sorted() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   af2/g.toList:()Laf2/c0;
        //     4: invokevirtual   af2/c0.L:()Laf2/g;
        //     7: new             Lio/reactivex/internal/functions/Functions$x;
        //    10: dup            
        //    11: invokestatic    io/reactivex/internal/functions/Functions.b:()Ljava/util/Comparator;
        //    14: invokespecial   io/reactivex/internal/functions/Functions$x.<init>:(Ljava/util/Comparator;)V
        //    17: invokevirtual   af2/g.map:(Lff2/o;)Laf2/g;
        //    20: getstatic       io/reactivex/internal/functions/Functions.a:Lio/reactivex/internal/functions/Functions$v;
        //    23: invokevirtual   af2/g.flatMapIterable:(Lff2/o;)Laf2/g;
        //    26: areturn        
        //    Signature:
        //  ()Laf2/g<TT;>;
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
        //     5: invokevirtual   af2/g.toList:()Laf2/c0;
        //     8: invokevirtual   af2/c0.L:()Laf2/g;
        //    11: new             Lio/reactivex/internal/functions/Functions$x;
        //    14: dup            
        //    15: aload_1        
        //    16: invokespecial   io/reactivex/internal/functions/Functions$x.<init>:(Ljava/util/Comparator;)V
        //    19: invokevirtual   af2/g.map:(Lff2/o;)Laf2/g;
        //    22: getstatic       io/reactivex/internal/functions/Functions.a:Lio/reactivex/internal/functions/Functions$v;
        //    25: invokevirtual   af2/g.flatMapIterable:(Lff2/o;)Laf2/g;
        //    28: areturn        
        //    29: new             Ljava/lang/NullPointerException;
        //    32: dup            
        //    33: ldc_w           "sortFunction"
        //    36: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    39: athrow         
        //    Signature:
        //  (Ljava/util/Comparator<-TT;>;)Laf2/g<TT;>;
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
    
    public final df2.a subscribe() {
        return this.subscribe((ff2.g<? super T>)Functions.d, (ff2.g<? super Throwable>)Functions.e, (ff2.a)Functions.c, (ff2.g<? super nt2.d>)FlowableInternalHelper$RequestMax.INSTANCE);
    }
    
    public final df2.a subscribe(final ff2.g<? super T> g) {
        return this.subscribe(g, (ff2.g<? super Throwable>)Functions.e, (ff2.a)Functions.c, (ff2.g<? super nt2.d>)FlowableInternalHelper$RequestMax.INSTANCE);
    }
    
    public final df2.a subscribe(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2) {
        return this.subscribe(g, g2, (ff2.a)Functions.c, (ff2.g<? super nt2.d>)FlowableInternalHelper$RequestMax.INSTANCE);
    }
    
    public final df2.a subscribe(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2, final ff2.a a) {
        return this.subscribe(g, g2, a, (ff2.g<? super nt2.d>)FlowableInternalHelper$RequestMax.INSTANCE);
    }
    
    public final df2.a subscribe(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2, final ff2.a a, final ff2.g<? super nt2.d> g3) {
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
            final LambdaSubscriber<Object> lambdaSubscriber = new LambdaSubscriber<Object>((ff2.g<? super Object>)g, g2, a, g3);
            this.subscribe(lambdaSubscriber);
            return (df2.a)lambdaSubscriber;
        }
        throw new NullPointerException("onSubscribe is null");
    }
    
    public final void subscribe(final af2.l<? super T> l) {
        if (l != null) {
            try {
                final nt2.c onSubscribe = RxJavaPlugins.onSubscribe(this, (nt2.c)l);
                a.b((Object)onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
                this.subscribeActual((nt2.c<? super T>)onSubscribe);
                return;
            }
            catch (final NullPointerException ex) {
                throw ex;
            }
            finally {
                final Throwable t;
                xd.a.t1(t);
                RxJavaPlugins.onError(t);
                final NullPointerException ex2 = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
                ex2.initCause(t);
                throw ex2;
            }
        }
        throw new NullPointerException("s is null");
    }
    
    public final void subscribe(final nt2.c<? super T> c) {
        if (c instanceof af2.l) {
            this.subscribe((af2.l<? super T>)c);
        }
        else {
            if (c == null) {
                throw new NullPointerException("s is null");
            }
            this.subscribe(new StrictSubscriber<Object>(c));
        }
    }
    
    public abstract void subscribeActual(final nt2.c<? super T> p0);
    
    public final g<T> subscribeOn(final af2.b0 b0) {
        if (b0 != null) {
            return this.subscribeOn(b0, this instanceof FlowableCreate ^ true);
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> subscribeOn(final af2.b0 b0, final boolean b2) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableSubscribeOn(this, b0, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <E extends nt2.c<? super T>> E subscribeWith(final E e) {
        this.subscribe(e);
        return e;
    }
    
    public final g<T> switchIfEmpty(final b<? extends T> b) {
        if (b != null) {
            return RxJavaPlugins.onAssembly((g)new m1(this, (b)b));
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
        if (!(this instanceof if2.h)) {
            return RxJavaPlugins.onAssembly((g)new FlowableSwitchMap(n, this, (o)o, b));
        }
        final Object call = ((if2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((g)new f1.a(o, call));
    }
    
    public final af2.a switchMapCompletable(final o<? super T, ? extends af2.e> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((af2.a)new FlowableSwitchMapCompletable(this, (o)o, false));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final af2.a switchMapCompletableDelayError(final o<? super T, ? extends af2.e> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((af2.a)new FlowableSwitchMapCompletable(this, (o)o, true));
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
            return RxJavaPlugins.onAssembly((g)new FlowableSwitchMapMaybe(this, (o)o, false));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> switchMapMaybeDelayError(final o<? super T, ? extends r<? extends R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableSwitchMapMaybe(this, (o)o, true));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> switchMapSingle(final o<? super T, ? extends g0<? extends R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableSwitchMapSingle(this, (o)o, false));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> g<R> switchMapSingleDelayError(final o<? super T, ? extends g0<? extends R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableSwitchMapSingle(this, (o)o, true));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final g<T> take(final long n) {
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((g)new FlowableTake(n, this));
        }
        throw new IllegalArgumentException(m5.a.e("count >= 0 required but it was ", n));
    }
    
    public final g<T> take(final long n, final TimeUnit timeUnit) {
        return this.takeUntil((nt2.b<Object>)timer(n, timeUnit));
    }
    
    public final g<T> take(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.takeUntil((nt2.b<Object>)timer(n, timeUnit, b0));
    }
    
    public final g<T> takeLast(final int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException(d.h("count >= 0 required but it was ", n));
        }
        if (n == 0) {
            return RxJavaPlugins.onAssembly((g)new f0(this));
        }
        if (n == 1) {
            return RxJavaPlugins.onAssembly((g)new FlowableTakeLastOne(this));
        }
        return RxJavaPlugins.onAssembly((g)new FlowableTakeLast(this, n));
    }
    
    public final g<T> takeLast(final long n, final long n2, final TimeUnit timeUnit) {
        return this.takeLast(n, n2, timeUnit, zf2.a.a(), false, bufferSize());
    }
    
    public final g<T> takeLast(final long n, final long n2, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.takeLast(n, n2, timeUnit, b0, false, bufferSize());
    }
    
    public final g<T> takeLast(final long n, final long n2, final TimeUnit timeUnit, final af2.b0 b0, final boolean b2, final int n3) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        a.c(n3, "bufferSize");
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((g)new FlowableTakeLastTimed(this, n, n2, timeUnit, b0, n3, b2));
        }
        throw new IndexOutOfBoundsException(m5.a.e("count >= 0 required but it was ", n));
    }
    
    public final g<T> takeLast(final long n, final TimeUnit timeUnit) {
        return this.takeLast(n, timeUnit, zf2.a.a(), false, bufferSize());
    }
    
    public final g<T> takeLast(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.takeLast(n, timeUnit, b0, false, bufferSize());
    }
    
    public final g<T> takeLast(final long n, final TimeUnit timeUnit, final af2.b0 b0, final boolean b2) {
        return this.takeLast(n, timeUnit, b0, b2, bufferSize());
    }
    
    public final g<T> takeLast(final long n, final TimeUnit timeUnit, final af2.b0 b0, final boolean b2, final int n2) {
        return this.takeLast(Long.MAX_VALUE, n, timeUnit, b0, b2, n2);
    }
    
    public final g<T> takeLast(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.takeLast(n, timeUnit, zf2.a.a(), b, bufferSize());
    }
    
    public final g<T> takeUntil(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((g)new n1(this, (q)q));
        }
        throw new NullPointerException("stopPredicate is null");
    }
    
    public final <U> g<T> takeUntil(final b<U> b) {
        if (b != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableTakeUntil(this, (b)b));
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> takeWhile(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((g)new o1(this, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final TestSubscriber<T> test() {
        final TestSubscriber testSubscriber = new TestSubscriber();
        this.subscribe(testSubscriber);
        return testSubscriber;
    }
    
    public final TestSubscriber<T> test(final long n) {
        final TestSubscriber testSubscriber = new TestSubscriber(n);
        this.subscribe(testSubscriber);
        return testSubscriber;
    }
    
    public final TestSubscriber<T> test(final long n, final boolean b) {
        final TestSubscriber testSubscriber = new TestSubscriber(n);
        if (b) {
            testSubscriber.cancel();
        }
        this.subscribe(testSubscriber);
        return testSubscriber;
    }
    
    public final g<T> throttleFirst(final long n, final TimeUnit timeUnit) {
        return this.throttleFirst(n, timeUnit, zf2.a.a());
    }
    
    public final g<T> throttleFirst(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableThrottleFirstTimed(this, n, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> throttleLast(final long n, final TimeUnit timeUnit) {
        return this.sample(n, timeUnit);
    }
    
    public final g<T> throttleLast(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.sample(n, timeUnit, b0);
    }
    
    public final g<T> throttleLatest(final long n, final TimeUnit timeUnit) {
        return this.throttleLatest(n, timeUnit, zf2.a.a(), false);
    }
    
    public final g<T> throttleLatest(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.throttleLatest(n, timeUnit, b0, false);
    }
    
    public final g<T> throttleLatest(final long n, final TimeUnit timeUnit, final af2.b0 b0, final boolean b2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableThrottleLatest(this, n, timeUnit, b0, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> throttleLatest(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.throttleLatest(n, timeUnit, zf2.a.a(), b);
    }
    
    public final g<T> throttleWithTimeout(final long n, final TimeUnit timeUnit) {
        return this.debounce(n, timeUnit);
    }
    
    public final g<T> throttleWithTimeout(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.debounce(n, timeUnit, b0);
    }
    
    public final g<zf2.b<T>> timeInterval() {
        return this.timeInterval(TimeUnit.MILLISECONDS, zf2.a.a());
    }
    
    public final g<zf2.b<T>> timeInterval(final af2.b0 b0) {
        return this.timeInterval(TimeUnit.MILLISECONDS, b0);
    }
    
    public final g<zf2.b<T>> timeInterval(final TimeUnit timeUnit) {
        return this.timeInterval(timeUnit, zf2.a.a());
    }
    
    public final g<zf2.b<T>> timeInterval(final TimeUnit timeUnit, final af2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g)new p1(this, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final g<T> timeout(final long n, final TimeUnit timeUnit) {
        return this.timeout0(n, timeUnit, null, zf2.a.a());
    }
    
    public final g<T> timeout(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.timeout0(n, timeUnit, null, b0);
    }
    
    public final g<T> timeout(final long n, final TimeUnit timeUnit, final af2.b0 b0, final b<? extends T> b2) {
        if (b2 != null) {
            return this.timeout0(n, timeUnit, b2, b0);
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<T> timeout(final long n, final TimeUnit timeUnit, final b<? extends T> b) {
        if (b != null) {
            return this.timeout0(n, timeUnit, b, zf2.a.a());
        }
        throw new NullPointerException("other is null");
    }
    
    public final <V> g<T> timeout(final o<? super T, ? extends b<V>> o) {
        return this.timeout0((nt2.b<Object>)null, (ff2.o<? super T, ? extends nt2.b<Object>>)o, (b<? extends T>)null);
    }
    
    public final <V> g<T> timeout(final o<? super T, ? extends b<V>> o, final g<? extends T> g) {
        if (g != null) {
            return this.timeout0((nt2.b<Object>)null, (ff2.o<? super T, ? extends nt2.b<Object>>)o, (b<? extends T>)g);
        }
        throw new NullPointerException("other is null");
    }
    
    public final <U, V> g<T> timeout(final b<U> b, final o<? super T, ? extends b<V>> o) {
        if (b != null) {
            return this.timeout0((nt2.b<Object>)b, (ff2.o<? super T, ? extends nt2.b<Object>>)o, (b<? extends T>)null);
        }
        throw new NullPointerException("firstTimeoutIndicator is null");
    }
    
    public final <U, V> g<T> timeout(final b<U> b, final o<? super T, ? extends b<V>> o, final b<? extends T> b2) {
        if (b == null) {
            throw new NullPointerException("firstTimeoutSelector is null");
        }
        if (b2 != null) {
            return this.timeout0((nt2.b<Object>)b, (ff2.o<? super T, ? extends nt2.b<Object>>)o, b2);
        }
        throw new NullPointerException("other is null");
    }
    
    public final g<zf2.b<T>> timestamp() {
        return this.timestamp(TimeUnit.MILLISECONDS, zf2.a.a());
    }
    
    public final g<zf2.b<T>> timestamp(final af2.b0 b0) {
        return this.timestamp(TimeUnit.MILLISECONDS, b0);
    }
    
    public final g<zf2.b<T>> timestamp(final TimeUnit timeUnit) {
        return this.timestamp(timeUnit, zf2.a.a());
    }
    
    public final g<zf2.b<T>> timestamp(final TimeUnit timeUnit, final af2.b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return this.map((ff2.o<? super T, ? extends zf2.b<T>>)new Functions$f0(timeUnit, b0));
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
                xd.a.t1(t);
                throw ExceptionHelper.d(t);
            }
        }
    }
    
    public final Future<T> toFuture() {
        return this.subscribeWith(new sf2.f());
    }
    
    public final c0<List<T>> toList() {
        return RxJavaPlugins.onAssembly((c0)new q1(this, ArrayListSupplier.asCallable()));
    }
    
    public final c0<List<T>> toList(final int n) {
        a.c(n, "capacityHint");
        return RxJavaPlugins.onAssembly((c0)new q1(this, (Callable)new Functions$j(n)));
    }
    
    public final <U extends Collection<? super T>> c0<U> toList(final Callable<U> callable) {
        if (callable != null) {
            return RxJavaPlugins.onAssembly((c0)new q1(this, callable));
        }
        throw new NullPointerException("collectionSupplier is null");
    }
    
    public final <K> c0<Map<K, T>> toMap(final o<? super T, ? extends K> o) {
        if (o != null) {
            return this.collect((Callable<? extends Map<K, T>>)HashMapSupplier.asCallable(), (ff2.b<? super Map<K, T>, ? super T>)new Functions$g0((o)o));
        }
        throw new NullPointerException("keySelector is null");
    }
    
    public final <K, V> c0<Map<K, V>> toMap(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (o2 != null) {
            return this.collect((Callable<? extends Map<K, V>>)HashMapSupplier.asCallable(), (ff2.b<? super Map<K, V>, ? super T>)new Functions$h0((o)o2, (o)o));
        }
        throw new NullPointerException("valueSelector is null");
    }
    
    public final <K, V> c0<Map<K, V>> toMap(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final Callable<? extends Map<K, V>> callable) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (o2 != null) {
            return this.collect(callable, (ff2.b<? super Map<K, V>, ? super T>)new Functions$h0((o)o2, (o)o));
        }
        throw new NullPointerException("valueSelector is null");
    }
    
    public final <K> c0<Map<K, Collection<T>>> toMultimap(final o<? super T, ? extends K> o) {
        return this.toMultimap(o, (ff2.o<? super T, ? extends T>)Functions.a, (Callable<? extends Map<K, Collection<T>>>)HashMapSupplier.asCallable(), (ff2.o<? super K, ? extends Collection<? super T>>)ArrayListSupplier.asFunction());
    }
    
    public final <K, V> c0<Map<K, Collection<V>>> toMultimap(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        return this.toMultimap(o, o2, (Callable<? extends Map<K, Collection<V>>>)HashMapSupplier.asCallable(), (ff2.o<? super K, ? extends Collection<? super V>>)ArrayListSupplier.asFunction());
    }
    
    public final <K, V> c0<Map<K, Collection<V>>> toMultimap(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final Callable<Map<K, Collection<V>>> callable) {
        return this.toMultimap(o, o2, (Callable<? extends Map<K, Collection<V>>>)callable, (ff2.o<? super K, ? extends Collection<? super V>>)ArrayListSupplier.asFunction());
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
            return this.collect(callable, (ff2.b<? super Map<K, Collection<V>>, ? super T>)new Functions$i0((o)o3, (o)o2, (o)o));
        }
        throw new NullPointerException("collectionFactory is null");
    }
    
    public final af2.t<T> toObservable() {
        return RxJavaPlugins.onAssembly((af2.t)new nf2.m0((b)this));
    }
    
    public final c0<List<T>> toSortedList() {
        return this.toSortedList(Functions.b());
    }
    
    public final c0<List<T>> toSortedList(final int n) {
        return this.toSortedList(Functions.b(), n);
    }
    
    public final c0<List<T>> toSortedList(final Comparator<? super T> comparator) {
        if (comparator != null) {
            return this.toList().w((ff2.o<? super List<T>, ? extends List<T>>)new Functions$x((Comparator)comparator));
        }
        throw new NullPointerException("comparator is null");
    }
    
    public final c0<List<T>> toSortedList(final Comparator<? super T> comparator, final int n) {
        if (comparator != null) {
            return this.toList(n).w((ff2.o<? super List<T>, ? extends List<T>>)new Functions$x((Comparator)comparator));
        }
        throw new NullPointerException("comparator is null");
    }
    
    public final g<T> unsubscribeOn(final af2.b0 b0) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableUnsubscribeOn(this, b0));
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
        return RxJavaPlugins.onAssembly((g)new FlowableWindow(this, n, n2, n3));
    }
    
    public final g<g<T>> window(final long n, final long n2, final TimeUnit timeUnit) {
        return this.window(n, n2, timeUnit, zf2.a.a(), bufferSize());
    }
    
    public final g<g<T>> window(final long n, final long n2, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.window(n, n2, timeUnit, b0, bufferSize());
    }
    
    public final g<g<T>> window(final long n, final long n2, final TimeUnit timeUnit, final af2.b0 b0, final int n3) {
        a.c(n3, "bufferSize");
        a.d(n, "timespan");
        a.d(n2, "timeskip");
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        if (timeUnit != null) {
            return RxJavaPlugins.onAssembly((g)new s1(this, n, n2, timeUnit, b0, Long.MAX_VALUE, n3, false));
        }
        throw new NullPointerException("unit is null");
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit) {
        return this.window(n, timeUnit, zf2.a.a(), Long.MAX_VALUE, false);
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit, final long n2) {
        return this.window(n, timeUnit, zf2.a.a(), n2, false);
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit, final long n2, final boolean b) {
        return this.window(n, timeUnit, zf2.a.a(), n2, b);
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit, final af2.b0 b0) {
        return this.window(n, timeUnit, b0, Long.MAX_VALUE, false);
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit, final af2.b0 b0, final long n2) {
        return this.window(n, timeUnit, b0, n2, false);
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit, final af2.b0 b0, final long n2, final boolean b2) {
        return this.window(n, timeUnit, b0, n2, b2, bufferSize());
    }
    
    public final g<g<T>> window(final long n, final TimeUnit timeUnit, final af2.b0 b0, final long n2, final boolean b2, final int n3) {
        a.c(n3, "bufferSize");
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        if (timeUnit != null) {
            a.d(n2, "count");
            return RxJavaPlugins.onAssembly((g)new s1(this, n, n, timeUnit, b0, n2, n3, b2));
        }
        throw new NullPointerException("unit is null");
    }
    
    public final <B> g<g<T>> window(final Callable<? extends b<B>> callable) {
        return this.window((Callable<? extends nt2.b<Object>>)callable, bufferSize());
    }
    
    public final <B> g<g<T>> window(final Callable<? extends b<B>> callable, final int n) {
        if (callable != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g)new FlowableWindowBoundarySupplier(this, (Callable)callable, n));
        }
        throw new NullPointerException("boundaryIndicatorSupplier is null");
    }
    
    public final <B> g<g<T>> window(final b<B> b) {
        return this.window((nt2.b<Object>)b, bufferSize());
    }
    
    public final <B> g<g<T>> window(final b<B> b, final int n) {
        if (b != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g)new FlowableWindowBoundary(this, (b)b, n));
        }
        throw new NullPointerException("boundaryIndicator is null");
    }
    
    public final <U, V> g<g<T>> window(final b<U> b, final o<? super U, ? extends b<V>> o) {
        return this.window((nt2.b<Object>)b, (ff2.o<? super Object, ? extends nt2.b<Object>>)o, bufferSize());
    }
    
    public final <U, V> g<g<T>> window(final b<U> b, final o<? super U, ? extends b<V>> o, final int n) {
        if (b == null) {
            throw new NullPointerException("openingIndicator is null");
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((g)new r1(this, (b)b, (o)o, n));
        }
        throw new NullPointerException("closingIndicator is null");
    }
    
    public final <R> g<R> withLatestFrom(final Iterable<? extends b<?>> iterable, final o<? super Object[], R> o) {
        if (iterable == null) {
            throw new NullPointerException("others is null");
        }
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableWithLatestFromMany(this, (Iterable)iterable, (o)o));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <U, R> g<R> withLatestFrom(final b<? extends U> b, final c<? super T, ? super U, ? extends R> c) {
        if (b == null) {
            throw new NullPointerException("other is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableWithLatestFrom(this, (c)c, (b)b));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <T1, T2, R> g<R> withLatestFrom(final b<T1> b, final b<T2> b2, final h<? super T, ? super T1, ? super T2, R> h) {
        if (b == null) {
            throw new NullPointerException("source1 is null");
        }
        if (b2 != null) {
            return this.withLatestFrom((b<?>[])new b[] { b, b2 }, (ff2.o<? super Object[], R>)Functions.d((h)h));
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
            return this.withLatestFrom((b<?>[])new b[] { b, b2, b3 }, (ff2.o<? super Object[], R>)Functions.e((i)i));
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
            return this.withLatestFrom((b<?>[])new b[] { b, b2, b3, b4 }, (ff2.o<? super Object[], R>)Functions.f((j)j));
        }
        throw new NullPointerException("source4 is null");
    }
    
    public final <R> g<R> withLatestFrom(final b<?>[] array, final o<? super Object[], R> o) {
        if (array == null) {
            throw new NullPointerException("others is null");
        }
        if (o != null) {
            return RxJavaPlugins.onAssembly((g)new FlowableWithLatestFromMany(this, (b[])array, (o)o));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <U, R> g<R> zipWith(final Iterable<U> iterable, final c<? super T, ? super U, ? extends R> c) {
        if (iterable == null) {
            throw new NullPointerException("other is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((g)new t1(this, (Iterable)iterable, (c)c));
        }
        throw new NullPointerException("zipper is null");
    }
    
    public final <U, R> g<R> zipWith(final b<? extends U> b, final c<? super T, ? super U, ? extends R> c) {
        if (b != null) {
            return zip((nt2.b<?>)this, (nt2.b<?>)b, (ff2.c<? super Object, ? super Object, ? extends R>)c);
        }
        throw new NullPointerException("other is null");
    }
    
    public final <U, R> g<R> zipWith(final b<? extends U> b, final c<? super T, ? super U, ? extends R> c, final boolean b2) {
        return zip((nt2.b<?>)this, (nt2.b<?>)b, (ff2.c<? super Object, ? super Object, ? extends R>)c, b2);
    }
    
    public final <U, R> g<R> zipWith(final b<? extends U> b, final c<? super T, ? super U, ? extends R> c, final boolean b2, final int n) {
        return zip((nt2.b<?>)this, (nt2.b<?>)b, (ff2.c<? super Object, ? super Object, ? extends R>)c, b2, n);
    }
}
