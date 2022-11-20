// 
// Decompiled by Procyon v0.6.0
// 

package af2;

import nf2.m2;
import io.reactivex.internal.operators.observable.ObservableWithLatestFromMany;
import io.reactivex.internal.operators.observable.ObservableWithLatestFrom;
import io.reactivex.internal.operators.observable.ObservableWindowBoundarySupplier;
import nf2.k2;
import io.reactivex.internal.operators.observable.ObservableWindowBoundary;
import nf2.l2;
import io.reactivex.internal.operators.observable.ObservableWindow;
import io.reactivex.internal.operators.observable.ObservableUnsubscribeOn;
import io.reactivex.internal.functions.Functions$x;
import io.reactivex.internal.functions.Functions$i0;
import io.reactivex.internal.functions.Functions$h0;
import io.reactivex.internal.functions.Functions$g0;
import io.reactivex.internal.util.HashMapSupplier;
import java.util.Map;
import nf2.j2;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureError;
import io.reactivex.BackpressureStrategy;
import io.reactivex.internal.functions.Functions$f0;
import nf2.h2;
import io.reactivex.internal.operators.observable.ObservableThrottleLatest;
import io.reactivex.internal.operators.observable.ObservableThrottleFirstTimed;
import io.reactivex.observers.TestObserver;
import nf2.g2;
import nf2.f2;
import io.reactivex.internal.operators.observable.ObservableTakeUntil;
import io.reactivex.internal.operators.observable.ObservableTakeLastTimed;
import io.reactivex.internal.operators.observable.ObservableTakeLast;
import nf2.e2;
import nf2.q0;
import nf2.d2;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapSingle;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.ObservableSwitchMapCompletable;
import nf2.c2;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import java.util.Comparator;
import nf2.b2;
import nf2.a2;
import io.reactivex.internal.operators.observable.ObservableSkipLastTimed;
import io.reactivex.internal.operators.observable.ObservableSkipLast;
import nf2.z1;
import nf2.x1;
import nf2.y1;
import nf2.w1;
import nf2.v1;
import nf2.u1;
import io.reactivex.internal.operators.observable.ObservableSampleWithObservable;
import io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.internal.operators.observable.ObservableRetryWhen;
import io.reactivex.internal.functions.Functions$k;
import io.reactivex.internal.operators.observable.ObservableRetryBiPredicate;
import io.reactivex.internal.operators.observable.ObservableRetryPredicate;
import io.reactivex.internal.operators.observable.ObservableReplay$d;
import io.reactivex.internal.operators.observable.ObservableReplay$h;
import io.reactivex.internal.operators.observable.ObservableReplay$f;
import io.reactivex.internal.operators.observable.ObservableReplay$a;
import nf2.f1;
import nf2.c1;
import nf2.t0;
import nf2.s0;
import io.reactivex.internal.operators.observable.ObservableReplay;
import nf2.b1;
import io.reactivex.internal.operators.observable.ObservableRepeatWhen;
import io.reactivex.internal.operators.observable.ObservableRepeatUntil;
import io.reactivex.internal.operators.observable.ObservableRepeat;
import nf2.t1;
import nf2.r1;
import nf2.s1;
import io.reactivex.internal.operators.observable.ObservablePublish;
import io.reactivex.internal.operators.observable.ObservablePublish$b;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.operators.observable.ObservablePublishSelector;
import nf2.v;
import nf2.p1;
import nf2.o1;
import io.reactivex.internal.functions.Functions$n;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservableMergeWithMaybe;
import io.reactivex.internal.operators.observable.ObservableMergeWithSingle;
import io.reactivex.internal.operators.observable.ObservableMergeWithCompletable;
import nf2.m1;
import nf2.k1;
import nf2.j1;
import nf2.h1;
import nf2.i1;
import io.reactivex.internal.operators.observable.ObservableJoin;
import nf2.r0;
import nf2.p0;
import io.reactivex.internal.operators.observable.ObservableGroupJoin;
import io.reactivex.internal.operators.observable.ObservableGroupBy;
import io.reactivex.internal.observers.ForEachWhileObserver;
import io.reactivex.internal.operators.observable.ObservableFlatMapSingle;
import io.reactivex.internal.operators.observable.ObservableFlatMapMaybe;
import io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable;
import nf2.l1;
import nf2.w0;
import nf2.d0;
import io.reactivex.internal.functions.Functions$a;
import io.reactivex.internal.functions.Functions$o;
import io.reactivex.internal.functions.Functions$a0;
import io.reactivex.internal.functions.Functions$b0;
import io.reactivex.internal.functions.Functions$c0;
import nf2.y0;
import nf2.z0;
import nf2.a1;
import io.reactivex.internal.operators.observable.ObservableDoFinally;
import nf2.x;
import nf2.x0;
import nf2.s;
import io.reactivex.internal.operators.observable.ObservableDebounceTimed;
import nf2.p;
import io.reactivex.internal.functions.Functions$s;
import io.reactivex.internal.operators.observable.ObservableConcatWithMaybe;
import io.reactivex.internal.operators.observable.ObservableConcatWithSingle;
import io.reactivex.internal.operators.observable.ObservableConcatWithCompletable;
import io.reactivex.internal.operators.mixed.ObservableConcatMapSingle;
import io.reactivex.internal.operators.mixed.ObservableConcatMapMaybe;
import nf2.u0;
import nf2.h0;
import io.reactivex.internal.operators.observable.ObservableConcatMapEager;
import io.reactivex.internal.operators.mixed.ObservableConcatMapCompletable;
import io.reactivex.internal.operators.observable.ObservableScalarXMap;
import io.reactivex.internal.functions.Functions$m;
import io.reactivex.internal.operators.observable.ObservableCache;
import io.reactivex.internal.operators.observable.ObservableBufferBoundary;
import io.reactivex.internal.functions.Functions$j;
import io.reactivex.internal.operators.observable.ObservableBuffer;
import java.util.Collection;
import io.reactivex.internal.util.ArrayListSupplier;
import java.util.List;
import io.reactivex.internal.functions.Functions$p;
import io.reactivex.internal.observers.LambdaObserver;
import jf2.e;
import io.reactivex.internal.operators.observable.BlockingObservableIterable;
import java.util.Iterator;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.NoSuchElementException;
import ff2.q;
import io.reactivex.internal.operators.observable.ObservableZip;
import nf2.g1;
import nf2.i2;
import io.reactivex.internal.operators.observable.ObservableUsing;
import nf2.n0;
import io.reactivex.internal.operators.observable.ObservableTimer;
import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.internal.operators.observable.ObservableTimeoutTimed;
import io.reactivex.internal.operators.observable.ObservableSwitchMap;
import io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle;
import io.reactivex.internal.operators.observable.ObservableRangeLong;
import io.reactivex.internal.operators.observable.ObservableRange;
import nf2.n1;
import io.reactivex.internal.operators.observable.ObservableFlatMap;
import io.reactivex.internal.operators.observable.ObservableIntervalRange;
import io.reactivex.internal.operators.observable.ObservableInterval;
import nf2.o0;
import nf2.d1;
import nf2.e1;
import nf2.m0;
import nt2.b;
import nf2.l0;
import java.util.concurrent.TimeUnit;
import nf2.k0;
import java.util.concurrent.Future;
import nf2.j0;
import nf2.i0;
import nf2.f0;
import io.reactivex.internal.functions.Functions$w;
import nf2.e0;
import nf2.z;
import nf2.r;
import java.util.concurrent.Callable;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.functions.Functions$v;
import io.reactivex.internal.operators.observable.ObservableConcatMap;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.operators.observable.ObservableCombineLatest;
import hf2.a;
import ff2.c;
import ff2.h;
import ff2.i;
import ff2.j;
import ff2.k;
import ff2.l;
import ff2.m;
import ff2.o;
import io.reactivex.internal.functions.Functions;
import ff2.n;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.internal.operators.observable.ObservableAmb;

public abstract class t<T> implements y<T>
{
    public static <T> t<T> amb(final Iterable<? extends y<? extends T>> iterable) {
        if (iterable != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableAmb((y[])null, (Iterable)iterable));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> t<T> ambArray(final y<? extends T>... array) {
        if (array == null) {
            throw new NullPointerException("sources is null");
        }
        final int length = array.length;
        if (length == 0) {
            return empty();
        }
        if (length == 1) {
            return wrap((af2.y<T>)array[0]);
        }
        return RxJavaPlugins.onAssembly((t)new ObservableAmb((y[])array, (Iterable)null));
    }
    
    public static int bufferSize() {
        return g.bufferSize();
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> t<R> combineLatest(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final y<? extends T6> y6, final y<? extends T7> y7, final y<? extends T8> y8, final y<? extends T9> y9, final n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> n) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (y5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (y6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (y7 == null) {
            throw new NullPointerException("source7 is null");
        }
        if (y8 == null) {
            throw new NullPointerException("source8 is null");
        }
        if (y9 != null) {
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.j((n)n), bufferSize(), (af2.y<?>[])new y[] { y, y2, y3, y4, y5, y6, y7, y8, y9 });
        }
        throw new NullPointerException("source9 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> t<R> combineLatest(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final y<? extends T6> y6, final y<? extends T7> y7, final y<? extends T8> y8, final m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> m) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (y5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (y6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (y7 == null) {
            throw new NullPointerException("source7 is null");
        }
        if (y8 != null) {
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.i((m)m), bufferSize(), (af2.y<?>[])new y[] { y, y2, y3, y4, y5, y6, y7, y8 });
        }
        throw new NullPointerException("source8 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, R> t<R> combineLatest(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final y<? extends T6> y6, final y<? extends T7> y7, final l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> l) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (y5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (y6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (y7 != null) {
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.h((l)l), bufferSize(), (af2.y<?>[])new y[] { y, y2, y3, y4, y5, y6, y7 });
        }
        throw new NullPointerException("source7 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, R> t<R> combineLatest(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final y<? extends T6> y6, final k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> k) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (y5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (y6 != null) {
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.g((k)k), bufferSize(), (af2.y<?>[])new y[] { y, y2, y3, y4, y5, y6 });
        }
        throw new NullPointerException("source6 is null");
    }
    
    public static <T1, T2, T3, T4, T5, R> t<R> combineLatest(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> j) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (y5 != null) {
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.f((j)j), bufferSize(), (af2.y<?>[])new y[] { y, y2, y3, y4, y5 });
        }
        throw new NullPointerException("source5 is null");
    }
    
    public static <T1, T2, T3, T4, R> t<R> combineLatest(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 != null) {
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.e((i)i), bufferSize(), (af2.y<?>[])new y[] { y, y2, y3, y4 });
        }
        throw new NullPointerException("source4 is null");
    }
    
    public static <T1, T2, T3, R> t<R> combineLatest(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final h<? super T1, ? super T2, ? super T3, ? extends R> h) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 != null) {
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.d((h)h), bufferSize(), (af2.y<?>[])new y[] { y, y2, y3 });
        }
        throw new NullPointerException("source3 is null");
    }
    
    public static <T1, T2, R> t<R> combineLatest(final y<? extends T1> y, final y<? extends T2> y2, final c<? super T1, ? super T2, ? extends R> c) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 != null) {
            return combineLatest((ff2.o<? super Object[], ? extends R>)Functions.c((c)c), bufferSize(), (af2.y<?>[])new y[] { y, y2 });
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T, R> t<R> combineLatest(final o<? super Object[], ? extends R> o, final int n, final y<? extends T>... array) {
        return combineLatest((af2.y<?>[])array, o, n);
    }
    
    public static <T, R> t<R> combineLatest(final Iterable<? extends y<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        return combineLatest((Iterable<? extends af2.y<?>>)iterable, o, bufferSize());
    }
    
    public static <T, R> t<R> combineLatest(final Iterable<? extends y<? extends T>> iterable, final o<? super Object[], ? extends R> o, final int n) {
        if (iterable == null) {
            throw new NullPointerException("sources is null");
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((t)new ObservableCombineLatest((y[])null, (Iterable)iterable, (o)o, n << 1, false));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public static <T, R> t<R> combineLatest(final y<? extends T>[] array, final o<? super Object[], ? extends R> o) {
        return combineLatest((af2.y<?>[])array, o, bufferSize());
    }
    
    public static <T, R> t<R> combineLatest(final y<? extends T>[] array, final o<? super Object[], ? extends R> o, final int n) {
        if (array == null) {
            throw new NullPointerException("sources is null");
        }
        if (array.length == 0) {
            return empty();
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((t)new ObservableCombineLatest((y[])array, (Iterable)null, (o)o, n << 1, false));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public static <T, R> t<R> combineLatestDelayError(final o<? super Object[], ? extends R> o, final int n, final y<? extends T>... array) {
        return combineLatestDelayError((af2.y<?>[])array, o, n);
    }
    
    public static <T, R> t<R> combineLatestDelayError(final Iterable<? extends y<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        return combineLatestDelayError((Iterable<? extends af2.y<?>>)iterable, o, bufferSize());
    }
    
    public static <T, R> t<R> combineLatestDelayError(final Iterable<? extends y<? extends T>> iterable, final o<? super Object[], ? extends R> o, final int n) {
        if (iterable == null) {
            throw new NullPointerException("sources is null");
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((t)new ObservableCombineLatest((y[])null, (Iterable)iterable, (o)o, n << 1, true));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public static <T, R> t<R> combineLatestDelayError(final y<? extends T>[] array, final o<? super Object[], ? extends R> o) {
        return combineLatestDelayError((af2.y<?>[])array, o, bufferSize());
    }
    
    public static <T, R> t<R> combineLatestDelayError(final y<? extends T>[] array, final o<? super Object[], ? extends R> o, final int n) {
        a.c(n, "bufferSize");
        if (o == null) {
            throw new NullPointerException("combiner is null");
        }
        if (array.length == 0) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((t)new ObservableCombineLatest((y[])array, (Iterable)null, (o)o, n << 1, true));
    }
    
    public static <T> t<T> concat(final y<? extends y<? extends T>> y) {
        return concat(y, bufferSize());
    }
    
    public static <T> t<T> concat(final y<? extends y<? extends T>> y, final int n) {
        if (y != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly((t)new ObservableConcatMap((y)y, (o)Functions.a, n, ErrorMode.IMMEDIATE));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> t<T> concat(final y<? extends T> y, final y<? extends T> y2) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 != null) {
            return concatArray(y, y2);
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T> t<T> concat(final y<? extends T> y, final y<? extends T> y2, final y<? extends T> y3) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 != null) {
            return concatArray(y, y2, y3);
        }
        throw new NullPointerException("source3 is null");
    }
    
    public static <T> t<T> concat(final y<? extends T> y, final y<? extends T> y2, final y<? extends T> y3, final y<? extends T> y4) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 != null) {
            return concatArray(y, y2, y3, y4);
        }
        throw new NullPointerException("source4 is null");
    }
    
    public static <T> t<T> concat(final Iterable<? extends y<? extends T>> iterable) {
        if (iterable != null) {
            return fromIterable((Iterable<?>)iterable).concatMapDelayError((ff2.o<? super Object, ? extends af2.y<? extends T>>)Functions.a, bufferSize(), false);
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> t<T> concatArray(final y<? extends T>... array) {
        if (array.length == 0) {
            return empty();
        }
        if (array.length == 1) {
            return wrap((af2.y<T>)array[0]);
        }
        return RxJavaPlugins.onAssembly((t)new ObservableConcatMap((y)fromArray(array), (o)Functions.a, bufferSize(), ErrorMode.BOUNDARY));
    }
    
    public static <T> t<T> concatArrayDelayError(final y<? extends T>... array) {
        if (array.length == 0) {
            return empty();
        }
        if (array.length == 1) {
            return wrap((af2.y<T>)array[0]);
        }
        return concatDelayError((af2.y<? extends af2.y<? extends T>>)fromArray(array));
    }
    
    public static <T> t<T> concatArrayEager(final int n, final int n2, final y<? extends T>... array) {
        return fromArray(array).concatMapEagerDelayError((ff2.o<? super y<? extends T>, ? extends af2.y<? extends T>>)Functions.a, n, n2, false);
    }
    
    public static <T> t<T> concatArrayEager(final y<? extends T>... array) {
        return concatArrayEager(bufferSize(), bufferSize(), array);
    }
    
    public static <T> t<T> concatArrayEagerDelayError(final int n, final int n2, final y<? extends T>... array) {
        return fromArray(array).concatMapEagerDelayError((ff2.o<? super y<? extends T>, ? extends af2.y<? extends T>>)Functions.a, n, n2, true);
    }
    
    public static <T> t<T> concatArrayEagerDelayError(final y<? extends T>... array) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), array);
    }
    
    public static <T> t<T> concatDelayError(final y<? extends y<? extends T>> y) {
        return concatDelayError(y, bufferSize(), true);
    }
    
    public static <T> t<T> concatDelayError(final y<? extends y<? extends T>> y, final int n, final boolean b) {
        if (y != null) {
            a.c(n, "prefetch is null");
            final Functions$v a = Functions.a;
            ErrorMode errorMode;
            if (b) {
                errorMode = ErrorMode.END;
            }
            else {
                errorMode = ErrorMode.BOUNDARY;
            }
            return RxJavaPlugins.onAssembly((t)new ObservableConcatMap((y)y, (o)a, n, errorMode));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> t<T> concatDelayError(final Iterable<? extends y<? extends T>> iterable) {
        if (iterable != null) {
            return concatDelayError((af2.y<? extends af2.y<? extends T>>)fromIterable((Iterable<?>)iterable));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> t<T> concatEager(final y<? extends y<? extends T>> y) {
        return concatEager(y, bufferSize(), bufferSize());
    }
    
    public static <T> t<T> concatEager(final y<? extends y<? extends T>> y, final int n, final int n2) {
        return wrap((af2.y<Object>)y).concatMapEager((ff2.o<? super Object, ? extends af2.y<? extends T>>)Functions.a, n, n2);
    }
    
    public static <T> t<T> concatEager(final Iterable<? extends y<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }
    
    public static <T> t<T> concatEager(final Iterable<? extends y<? extends T>> iterable, final int n, final int n2) {
        return fromIterable((Iterable<?>)iterable).concatMapEagerDelayError((ff2.o<? super Object, ? extends af2.y<? extends T>>)Functions.a, n, n2, false);
    }
    
    public static <T> t<T> create(final w<T> w) {
        if (w != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableCreate(w));
        }
        throw new NullPointerException("source is null");
    }
    
    public static <T> t<T> defer(final Callable<? extends y<? extends T>> callable) {
        if (callable != null) {
            return RxJavaPlugins.onAssembly((t)new r((Callable)callable));
        }
        throw new NullPointerException("supplier is null");
    }
    
    private t<T> doOnEach(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2, final ff2.a a, final ff2.a a2) {
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
            return RxJavaPlugins.onAssembly((t)new z((y)this, (ff2.g)g, (ff2.g)g2, a, a2));
        }
        throw new NullPointerException("onAfterTerminate is null");
    }
    
    public static <T> t<T> empty() {
        return RxJavaPlugins.onAssembly((t)e0.f);
    }
    
    public static <T> t<T> error(final Throwable t) {
        if (t != null) {
            return error((Callable<? extends Throwable>)new Functions$w((Object)t));
        }
        throw new NullPointerException("exception is null");
    }
    
    public static <T> t<T> error(final Callable<? extends Throwable> callable) {
        if (callable != null) {
            return RxJavaPlugins.onAssembly((t)new f0((Callable)callable));
        }
        throw new NullPointerException("errorSupplier is null");
    }
    
    public static <T> t<T> fromArray(final T... array) {
        if (array == null) {
            throw new NullPointerException("items is null");
        }
        if (array.length == 0) {
            return empty();
        }
        if (array.length == 1) {
            return just(array[0]);
        }
        return RxJavaPlugins.onAssembly((t)new i0((Object[])array));
    }
    
    public static <T> t<T> fromCallable(final Callable<? extends T> callable) {
        if (callable != null) {
            return RxJavaPlugins.onAssembly((t)new j0((Callable)callable));
        }
        throw new NullPointerException("supplier is null");
    }
    
    public static <T> t<T> fromFuture(final Future<? extends T> future) {
        if (future != null) {
            return RxJavaPlugins.onAssembly((t)new k0((Future)future, 0L, (TimeUnit)null));
        }
        throw new NullPointerException("future is null");
    }
    
    public static <T> t<T> fromFuture(final Future<? extends T> future, final long n, final TimeUnit timeUnit) {
        if (future == null) {
            throw new NullPointerException("future is null");
        }
        if (timeUnit != null) {
            return RxJavaPlugins.onAssembly((t)new k0((Future)future, n, timeUnit));
        }
        throw new NullPointerException("unit is null");
    }
    
    public static <T> t<T> fromFuture(final Future<? extends T> future, final long n, final TimeUnit timeUnit, final b0 b0) {
        if (b0 != null) {
            return fromFuture(future, n, timeUnit).subscribeOn(b0);
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static <T> t<T> fromFuture(final Future<? extends T> future, final b0 b0) {
        if (b0 != null) {
            return fromFuture(future).subscribeOn(b0);
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static <T> t<T> fromIterable(final Iterable<? extends T> iterable) {
        if (iterable != null) {
            return RxJavaPlugins.onAssembly((t)new l0((Iterable)iterable));
        }
        throw new NullPointerException("source is null");
    }
    
    public static <T> t<T> fromPublisher(final b<? extends T> b) {
        if (b != null) {
            return RxJavaPlugins.onAssembly((t)new m0((b)b));
        }
        throw new NullPointerException("publisher is null");
    }
    
    public static <T> t<T> generate(final ff2.g<f<T>> g) {
        if (g != null) {
            return generate((Callable<Object>)Functions.i, (ff2.c<Object, af2.f<T>, Object>)new e1((ff2.g)g), (ff2.g<? super Object>)Functions.d);
        }
        throw new NullPointerException("generator is null");
    }
    
    public static <T, S> t<T> generate(final Callable<S> callable, final ff2.b<S, f<T>> b) {
        if (b != null) {
            return generate(callable, (ff2.c<S, af2.f<T>, S>)new d1((ff2.b)b), (ff2.g<? super S>)Functions.d);
        }
        throw new NullPointerException("generator is null");
    }
    
    public static <T, S> t<T> generate(final Callable<S> callable, final ff2.b<S, f<T>> b, final ff2.g<? super S> g) {
        if (b != null) {
            return generate(callable, (ff2.c<S, af2.f<T>, S>)new d1((ff2.b)b), g);
        }
        throw new NullPointerException("generator is null");
    }
    
    public static <T, S> t<T> generate(final Callable<S> callable, final c<S, f<T>, S> c) {
        return generate(callable, c, (ff2.g<? super S>)Functions.d);
    }
    
    public static <T, S> t<T> generate(final Callable<S> callable, final c<S, f<T>, S> c, final ff2.g<? super S> g) {
        if (callable == null) {
            throw new NullPointerException("initialState is null");
        }
        if (c == null) {
            throw new NullPointerException("generator is null");
        }
        if (g != null) {
            return RxJavaPlugins.onAssembly((t)new o0((Callable)callable, (c)c, (ff2.g)g));
        }
        throw new NullPointerException("disposeState is null");
    }
    
    public static t<Long> interval(final long n, final long n2, final TimeUnit timeUnit) {
        return interval(n, n2, timeUnit, zf2.a.a());
    }
    
    public static t<Long> interval(final long n, final long n2, final TimeUnit timeUnit, final b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableInterval(Math.max(0L, n), Math.max(0L, n2), timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static t<Long> interval(final long n, final TimeUnit timeUnit) {
        return interval(n, n, timeUnit, zf2.a.a());
    }
    
    public static t<Long> interval(final long n, final TimeUnit timeUnit, final b0 b0) {
        return interval(n, n, timeUnit, b0);
    }
    
    public static t<Long> intervalRange(final long n, final long n2, final long n3, final long n4, final TimeUnit timeUnit) {
        return intervalRange(n, n2, n3, n4, timeUnit, zf2.a.a());
    }
    
    public static t<Long> intervalRange(final long n, long n2, final long n3, final long n4, final TimeUnit timeUnit, final b0 b0) {
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
            return RxJavaPlugins.onAssembly((t)new ObservableIntervalRange(n, n2, Math.max(0L, n3), Math.max(0L, n4), timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static <T> t<T> just(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((t)new io.reactivex.internal.operators.observable.a(t));
        }
        throw new NullPointerException("item is null");
    }
    
    public static <T> t<T> just(final T t, final T t2) {
        if (t == null) {
            throw new NullPointerException("item1 is null");
        }
        if (t2 != null) {
            return fromArray(t, t2);
        }
        throw new NullPointerException("item2 is null");
    }
    
    public static <T> t<T> just(final T t, final T t2, final T t3) {
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
    
    public static <T> t<T> just(final T t, final T t2, final T t3, final T t4) {
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
    
    public static <T> t<T> just(final T t, final T t2, final T t3, final T t4, final T t5) {
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
    
    public static <T> t<T> just(final T t, final T t2, final T t3, final T t4, final T t5, final T t6) {
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
    
    public static <T> t<T> just(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7) {
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
    
    public static <T> t<T> just(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8) {
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
    
    public static <T> t<T> just(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8, final T t9) {
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
    
    public static <T> t<T> just(final T t, final T t2, final T t3, final T t4, final T t5, final T t6, final T t7, final T t8, final T t9, final T t10) {
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
    
    public static <T> t<T> merge(final y<? extends y<? extends T>> y) {
        if (y != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableFlatMap((y)y, (o)Functions.a, false, Integer.MAX_VALUE, bufferSize()));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> t<T> merge(final y<? extends y<? extends T>> y, final int n) {
        if (y != null) {
            a.c(n, "maxConcurrency");
            return RxJavaPlugins.onAssembly((t)new ObservableFlatMap((y)y, (o)Functions.a, false, n, bufferSize()));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> t<T> merge(final y<? extends T> y, final y<? extends T> y2) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 != null) {
            return fromArray(y, y2).flatMap((ff2.o<? super y, ? extends af2.y<? extends T>>)Functions.a, false, 2);
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T> t<T> merge(final y<? extends T> y, final y<? extends T> y2, final y<? extends T> y3) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 != null) {
            return fromArray(y, y2, y3).flatMap((ff2.o<? super y, ? extends af2.y<? extends T>>)Functions.a, false, 3);
        }
        throw new NullPointerException("source3 is null");
    }
    
    public static <T> t<T> merge(final y<? extends T> y, final y<? extends T> y2, final y<? extends T> y3, final y<? extends T> y4) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 != null) {
            return fromArray(y, y2, y3, y4).flatMap((ff2.o<? super y, ? extends af2.y<? extends T>>)Functions.a, false, 4);
        }
        throw new NullPointerException("source4 is null");
    }
    
    public static <T> t<T> merge(final Iterable<? extends y<? extends T>> iterable) {
        return fromIterable((Iterable<?>)iterable).flatMap((ff2.o<? super Object, ? extends af2.y<? extends T>>)Functions.a);
    }
    
    public static <T> t<T> merge(final Iterable<? extends y<? extends T>> iterable, final int n) {
        return fromIterable((Iterable<?>)iterable).flatMap((ff2.o<? super Object, ? extends af2.y<? extends T>>)Functions.a, n);
    }
    
    public static <T> t<T> merge(final Iterable<? extends y<? extends T>> iterable, final int n, final int n2) {
        return fromIterable((Iterable<?>)iterable).flatMap((ff2.o<? super Object, ? extends af2.y<? extends T>>)Functions.a, false, n, n2);
    }
    
    public static <T> t<T> mergeArray(final int n, final int n2, final y<? extends T>... array) {
        return fromArray(array).flatMap((ff2.o<? super y<? extends T>, ? extends af2.y<? extends T>>)Functions.a, false, n, n2);
    }
    
    public static <T> t<T> mergeArray(final y<? extends T>... array) {
        return fromArray(array).flatMap((ff2.o<? super y<? extends T>, ? extends af2.y<? extends T>>)Functions.a, array.length);
    }
    
    public static <T> t<T> mergeArrayDelayError(final int n, final int n2, final y<? extends T>... array) {
        return fromArray(array).flatMap((ff2.o<? super y<? extends T>, ? extends af2.y<? extends T>>)Functions.a, true, n, n2);
    }
    
    public static <T> t<T> mergeArrayDelayError(final y<? extends T>... array) {
        return fromArray(array).flatMap((ff2.o<? super y<? extends T>, ? extends af2.y<? extends T>>)Functions.a, true, array.length);
    }
    
    public static <T> t<T> mergeDelayError(final y<? extends y<? extends T>> y) {
        if (y != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableFlatMap((y)y, (o)Functions.a, true, Integer.MAX_VALUE, bufferSize()));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> t<T> mergeDelayError(final y<? extends y<? extends T>> y, final int n) {
        if (y != null) {
            a.c(n, "maxConcurrency");
            return RxJavaPlugins.onAssembly((t)new ObservableFlatMap((y)y, (o)Functions.a, true, n, bufferSize()));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> t<T> mergeDelayError(final y<? extends T> y, final y<? extends T> y2) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 != null) {
            return fromArray(y, y2).flatMap((ff2.o<? super y, ? extends af2.y<? extends T>>)Functions.a, true, 2);
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T> t<T> mergeDelayError(final y<? extends T> y, final y<? extends T> y2, final y<? extends T> y3) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 != null) {
            return fromArray(y, y2, y3).flatMap((ff2.o<? super y, ? extends af2.y<? extends T>>)Functions.a, true, 3);
        }
        throw new NullPointerException("source3 is null");
    }
    
    public static <T> t<T> mergeDelayError(final y<? extends T> y, final y<? extends T> y2, final y<? extends T> y3, final y<? extends T> y4) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 != null) {
            return fromArray(y, y2, y3, y4).flatMap((ff2.o<? super y, ? extends af2.y<? extends T>>)Functions.a, true, 4);
        }
        throw new NullPointerException("source4 is null");
    }
    
    public static <T> t<T> mergeDelayError(final Iterable<? extends y<? extends T>> iterable) {
        return fromIterable((Iterable<?>)iterable).flatMap((ff2.o<? super Object, ? extends af2.y<? extends T>>)Functions.a, true);
    }
    
    public static <T> t<T> mergeDelayError(final Iterable<? extends y<? extends T>> iterable, final int n) {
        return fromIterable((Iterable<?>)iterable).flatMap((ff2.o<? super Object, ? extends af2.y<? extends T>>)Functions.a, true, n);
    }
    
    public static <T> t<T> mergeDelayError(final Iterable<? extends y<? extends T>> iterable, final int n, final int n2) {
        return fromIterable((Iterable<?>)iterable).flatMap((ff2.o<? super Object, ? extends af2.y<? extends T>>)Functions.a, true, n, n2);
    }
    
    public static <T> t<T> never() {
        return RxJavaPlugins.onAssembly((t)n1.f);
    }
    
    public static t<Integer> range(final int n, final int n2) {
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
            return RxJavaPlugins.onAssembly((t)new ObservableRange(n, n2));
        }
        throw new IllegalArgumentException("Integer overflow");
    }
    
    public static t<Long> rangeLong(final long n, final long n2) {
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
        return RxJavaPlugins.onAssembly((t)new ObservableRangeLong(n, n2));
    }
    
    public static <T> c0<Boolean> sequenceEqual(final y<? extends T> y, final y<? extends T> y2) {
        return sequenceEqual((af2.y<?>)y, (af2.y<?>)y2, (ff2.d<? super Object, ? super Object>)a.a, bufferSize());
    }
    
    public static <T> c0<Boolean> sequenceEqual(final y<? extends T> y, final y<? extends T> y2, final int n) {
        return sequenceEqual((af2.y<?>)y, (af2.y<?>)y2, (ff2.d<? super Object, ? super Object>)a.a, n);
    }
    
    public static <T> c0<Boolean> sequenceEqual(final y<? extends T> y, final y<? extends T> y2, final ff2.d<? super T, ? super T> d) {
        return sequenceEqual((af2.y<?>)y, (af2.y<?>)y2, (ff2.d<? super Object, ? super Object>)d, bufferSize());
    }
    
    public static <T> c0<Boolean> sequenceEqual(final y<? extends T> y, final y<? extends T> y2, final ff2.d<? super T, ? super T> d, final int n) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (d != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((c0)new ObservableSequenceEqualSingle(y, y2, d, n));
        }
        throw new NullPointerException("isEqual is null");
    }
    
    public static <T> t<T> switchOnNext(final y<? extends y<? extends T>> y) {
        return switchOnNext(y, bufferSize());
    }
    
    public static <T> t<T> switchOnNext(final y<? extends y<? extends T>> y, final int n) {
        if (y != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((t)new ObservableSwitchMap((y)y, (o)Functions.a, n, false));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T> t<T> switchOnNextDelayError(final y<? extends y<? extends T>> y) {
        return switchOnNextDelayError(y, bufferSize());
    }
    
    public static <T> t<T> switchOnNextDelayError(final y<? extends y<? extends T>> y, final int n) {
        if (y != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly((t)new ObservableSwitchMap((y)y, (o)Functions.a, n, true));
        }
        throw new NullPointerException("sources is null");
    }
    
    private t<T> timeout0(final long n, final TimeUnit timeUnit, final y<? extends T> y, final b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("timeUnit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableTimeoutTimed(this, n, timeUnit, b0, (y)y));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    private <U, V> t<T> timeout0(final y<U> y, final o<? super T, ? extends y<V>> o, final y<? extends T> y2) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableTimeout(this, (y)y, (o)o, (y)y2));
        }
        throw new NullPointerException("itemTimeoutIndicator is null");
    }
    
    public static t<Long> timer(final long n, final TimeUnit timeUnit) {
        return timer(n, timeUnit, zf2.a.a());
    }
    
    public static t<Long> timer(final long n, final TimeUnit timeUnit, final b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableTimer(Math.max(n, 0L), timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public static <T> t<T> unsafeCreate(final y<T> y) {
        if (y == null) {
            throw new NullPointerException("onSubscribe is null");
        }
        if (!(y instanceof t)) {
            return RxJavaPlugins.onAssembly((t)new n0((y)y));
        }
        throw new IllegalArgumentException("unsafeCreate(Observable) should be upgraded");
    }
    
    public static <T, D> t<T> using(final Callable<? extends D> callable, final o<? super D, ? extends y<? extends T>> o, final ff2.g<? super D> g) {
        return using((Callable<?>)callable, (ff2.o<? super Object, ? extends af2.y<? extends T>>)o, (ff2.g<? super Object>)g, true);
    }
    
    public static <T, D> t<T> using(final Callable<? extends D> callable, final o<? super D, ? extends y<? extends T>> o, final ff2.g<? super D> g, final boolean b) {
        if (callable == null) {
            throw new NullPointerException("resourceSupplier is null");
        }
        if (o == null) {
            throw new NullPointerException("sourceSupplier is null");
        }
        if (g != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableUsing(callable, o, g, b));
        }
        throw new NullPointerException("disposer is null");
    }
    
    public static <T> t<T> wrap(final y<T> y) {
        if (y == null) {
            throw new NullPointerException("source is null");
        }
        if (y instanceof t) {
            return RxJavaPlugins.onAssembly((t)y);
        }
        return RxJavaPlugins.onAssembly((t)new n0((y)y));
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> t<R> zip(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final y<? extends T6> y6, final y<? extends T7> y7, final y<? extends T8> y8, final y<? extends T9> y9, final n<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> n) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (y5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (y6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (y7 == null) {
            throw new NullPointerException("source7 is null");
        }
        if (y8 == null) {
            throw new NullPointerException("source8 is null");
        }
        if (y9 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.j((n)n), false, bufferSize(), (af2.y<?>[])new y[] { y, y2, y3, y4, y5, y6, y7, y8, y9 });
        }
        throw new NullPointerException("source9 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> t<R> zip(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final y<? extends T6> y6, final y<? extends T7> y7, final y<? extends T8> y8, final m<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> m) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (y5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (y6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (y7 == null) {
            throw new NullPointerException("source7 is null");
        }
        if (y8 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.i((m)m), false, bufferSize(), (af2.y<?>[])new y[] { y, y2, y3, y4, y5, y6, y7, y8 });
        }
        throw new NullPointerException("source8 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, T7, R> t<R> zip(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final y<? extends T6> y6, final y<? extends T7> y7, final l<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> l) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (y5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (y6 == null) {
            throw new NullPointerException("source6 is null");
        }
        if (y7 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.h((l)l), false, bufferSize(), (af2.y<?>[])new y[] { y, y2, y3, y4, y5, y6, y7 });
        }
        throw new NullPointerException("source7 is null");
    }
    
    public static <T1, T2, T3, T4, T5, T6, R> t<R> zip(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final y<? extends T6> y6, final k<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> k) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (y5 == null) {
            throw new NullPointerException("source5 is null");
        }
        if (y6 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.g((k)k), false, bufferSize(), (af2.y<?>[])new y[] { y, y2, y3, y4, y5, y6 });
        }
        throw new NullPointerException("source6 is null");
    }
    
    public static <T1, T2, T3, T4, T5, R> t<R> zip(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final y<? extends T5> y5, final j<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> j) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 == null) {
            throw new NullPointerException("source4 is null");
        }
        if (y5 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.f((j)j), false, bufferSize(), (af2.y<?>[])new y[] { y, y2, y3, y4, y5 });
        }
        throw new NullPointerException("source5 is null");
    }
    
    public static <T1, T2, T3, T4, R> t<R> zip(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final y<? extends T4> y4, final i<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("source3 is null");
        }
        if (y4 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.e((i)i), false, bufferSize(), (af2.y<?>[])new y[] { y, y2, y3, y4 });
        }
        throw new NullPointerException("source4 is null");
    }
    
    public static <T1, T2, T3, R> t<R> zip(final y<? extends T1> y, final y<? extends T2> y2, final y<? extends T3> y3, final h<? super T1, ? super T2, ? super T3, ? extends R> h) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("source2 is null");
        }
        if (y3 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.d((h)h), false, bufferSize(), (af2.y<?>[])new y[] { y, y2, y3 });
        }
        throw new NullPointerException("source3 is null");
    }
    
    public static <T1, T2, R> t<R> zip(final y<? extends T1> y, final y<? extends T2> y2, final c<? super T1, ? super T2, ? extends R> c) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.c((c)c), false, bufferSize(), (af2.y<?>[])new y[] { y, y2 });
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T1, T2, R> t<R> zip(final y<? extends T1> y, final y<? extends T2> y2, final c<? super T1, ? super T2, ? extends R> c, final boolean b) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.c((c)c), b, bufferSize(), (af2.y<?>[])new y[] { y, y2 });
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T1, T2, R> t<R> zip(final y<? extends T1> y, final y<? extends T2> y2, final c<? super T1, ? super T2, ? extends R> c, final boolean b, final int n) {
        if (y == null) {
            throw new NullPointerException("source1 is null");
        }
        if (y2 != null) {
            return zipArray((ff2.o<? super Object[], ? extends R>)Functions.c((c)c), b, n, (af2.y<?>[])new y[] { y, y2 });
        }
        throw new NullPointerException("source2 is null");
    }
    
    public static <T, R> t<R> zip(final y<? extends y<? extends T>> y, final o<? super Object[], ? extends R> o) {
        if (o == null) {
            throw new NullPointerException("zipper is null");
        }
        if (y != null) {
            return RxJavaPlugins.onAssembly((t)((t<Object>)new i2((y)y)).flatMap((ff2.o<? super Object, ? extends af2.y<?>>)new g1((o)o)));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T, R> t<R> zip(final Iterable<? extends y<? extends T>> iterable, final o<? super Object[], ? extends R> o) {
        if (o == null) {
            throw new NullPointerException("zipper is null");
        }
        if (iterable != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableZip(null, iterable, o, bufferSize(), false));
        }
        throw new NullPointerException("sources is null");
    }
    
    public static <T, R> t<R> zipArray(final o<? super Object[], ? extends R> o, final boolean b, final int n, final y<? extends T>... array) {
        if (array.length == 0) {
            return empty();
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((t)new ObservableZip(array, null, o, n, b));
        }
        throw new NullPointerException("zipper is null");
    }
    
    public static <T, R> t<R> zipIterable(final Iterable<? extends y<? extends T>> iterable, final o<? super Object[], ? extends R> o, final boolean b, final int n) {
        if (o == null) {
            throw new NullPointerException("zipper is null");
        }
        if (iterable != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((t)new ObservableZip(null, iterable, o, n, b));
        }
        throw new NullPointerException("sources is null");
    }
    
    public final c0<Boolean> all(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((c0)new nf2.f((y)this, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final t<T> ambWith(final y<? extends T> y) {
        if (y != null) {
            return ambArray((y)this, y);
        }
        throw new NullPointerException("other is null");
    }
    
    public final c0<Boolean> any(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((c0)new nf2.h((y)this, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final <R> R as(final u<T, ? extends R> u) {
        if (u != null) {
            return (R)u.apply();
        }
        throw new NullPointerException("converter is null");
    }
    
    public final T blockingFirst() {
        final jf2.d<T> d = (jf2.d<T>)new jf2.d<Object>();
        this.subscribe((a0<? super T>)d);
        final Object a = d.a();
        if (a != null) {
            return (T)a;
        }
        throw new NoSuchElementException();
    }
    
    public final T blockingFirst(T t) {
        final jf2.d<T> d = (jf2.d<T>)new jf2.d<Object>();
        this.subscribe((a0<? super T>)d);
        final Object a = d.a();
        if (a != null) {
            t = (T)a;
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
        return (Iterable<T>)new BlockingObservableIterable((y)this, n);
    }
    
    public final T blockingLast() {
        final e<T> e = (e<T>)new e<Object>();
        this.subscribe((a0<? super T>)e);
        final Object a = e.a();
        if (a != null) {
            return (T)a;
        }
        throw new NoSuchElementException();
    }
    
    public final T blockingLast(T t) {
        final e<T> e = (e<T>)new e<Object>();
        this.subscribe((a0<? super T>)e);
        final Object a = e.a();
        if (a != null) {
            t = (T)a;
        }
        return t;
    }
    
    public final Iterable<T> blockingLatest() {
        return (Iterable<T>)new nf2.b((y)this);
    }
    
    public final Iterable<T> blockingMostRecent(final T t) {
        return (Iterable<T>)new nf2.c((y)this, (Object)t);
    }
    
    public final Iterable<T> blockingNext() {
        return (Iterable<T>)new nf2.d((y)this);
    }
    
    public final T blockingSingle() {
        final T c = this.singleElement().c();
        if (c != null) {
            return c;
        }
        throw new NoSuchElementException();
    }
    
    public final T blockingSingle(final T t) {
        return this.single(t).e();
    }
    
    public final void blockingSubscribe() {
        final tf2.b b = new tf2.b();
        final Functions$p d = Functions.d;
        final LambdaObserver lambdaObserver = new LambdaObserver((ff2.g)d, (ff2.g)b, (ff2.a)b, (ff2.g)d);
        ((y)this).subscribe((a0)lambdaObserver);
        zd.b.j(b, (df2.a)lambdaObserver);
        final Throwable f = b.f;
        if (f == null) {
            return;
        }
        throw ExceptionHelper.d(f);
    }
    
    public final void blockingSubscribe(final a0<? super T> a0) {
        cg.d.V3((a0)a0, (y)this);
    }
    
    public final void blockingSubscribe(final ff2.g<? super T> g) {
        cg.d.U3((y)this, (ff2.g)g, (ff2.g)Functions.e, (ff2.a)Functions.c);
    }
    
    public final void blockingSubscribe(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2) {
        cg.d.U3((y)this, (ff2.g)g, (ff2.g)g2, (ff2.a)Functions.c);
    }
    
    public final void blockingSubscribe(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2, final ff2.a a) {
        cg.d.U3((y)this, (ff2.g)g, (ff2.g)g2, a);
    }
    
    public final t<List<T>> buffer(final int n) {
        return this.buffer(n, n);
    }
    
    public final t<List<T>> buffer(final int n, final int n2) {
        return this.buffer(n, n2, ArrayListSupplier.asCallable());
    }
    
    public final <U extends Collection<? super T>> t<U> buffer(final int n, final int n2, final Callable<U> callable) {
        a.c(n, "count");
        a.c(n2, "skip");
        if (callable != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableBuffer((y)this, n, n2, (Callable)callable));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final <U extends Collection<? super T>> t<U> buffer(final int n, final Callable<U> callable) {
        return this.buffer(n, n, callable);
    }
    
    public final t<List<T>> buffer(final long n, final long n2, final TimeUnit timeUnit) {
        return this.buffer(n, n2, timeUnit, zf2.a.a(), ArrayListSupplier.asCallable());
    }
    
    public final t<List<T>> buffer(final long n, final long n2, final TimeUnit timeUnit, final b0 b0) {
        return this.buffer(n, n2, timeUnit, b0, ArrayListSupplier.asCallable());
    }
    
    public final <U extends Collection<? super T>> t<U> buffer(final long n, final long n2, final TimeUnit timeUnit, final b0 b0, final Callable<U> callable) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        if (callable != null) {
            return RxJavaPlugins.onAssembly((t)new nf2.l((y)this, n, n2, timeUnit, b0, (Callable)callable, Integer.MAX_VALUE, false));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final t<List<T>> buffer(final long n, final TimeUnit timeUnit) {
        return this.buffer(n, timeUnit, zf2.a.a(), Integer.MAX_VALUE);
    }
    
    public final t<List<T>> buffer(final long n, final TimeUnit timeUnit, final int n2) {
        return this.buffer(n, timeUnit, zf2.a.a(), n2);
    }
    
    public final t<List<T>> buffer(final long n, final TimeUnit timeUnit, final b0 b0) {
        return this.buffer(n, timeUnit, b0, Integer.MAX_VALUE, ArrayListSupplier.asCallable(), false);
    }
    
    public final t<List<T>> buffer(final long n, final TimeUnit timeUnit, final b0 b0, final int n2) {
        return this.buffer(n, timeUnit, b0, n2, ArrayListSupplier.asCallable(), false);
    }
    
    public final <U extends Collection<? super T>> t<U> buffer(final long n, final TimeUnit timeUnit, final b0 b0, final int n2, final Callable<U> callable, final boolean b2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        if (callable != null) {
            a.c(n2, "count");
            return RxJavaPlugins.onAssembly((t)new nf2.l((y)this, n, n, timeUnit, b0, (Callable)callable, n2, b2));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final <B> t<List<T>> buffer(final y<B> y) {
        return this.buffer((af2.y<Object>)y, ArrayListSupplier.asCallable());
    }
    
    public final <B> t<List<T>> buffer(final y<B> y, final int n) {
        a.c(n, "initialCapacity");
        return this.buffer((af2.y<Object>)y, (Callable<List<T>>)new Functions$j(n));
    }
    
    public final <TOpening, TClosing> t<List<T>> buffer(final y<? extends TOpening> y, final o<? super TOpening, ? extends y<? extends TClosing>> o) {
        return this.buffer((af2.y<?>)y, (ff2.o<? super Object, ? extends af2.y<?>>)o, ArrayListSupplier.asCallable());
    }
    
    public final <TOpening, TClosing, U extends Collection<? super T>> t<U> buffer(final y<? extends TOpening> y, final o<? super TOpening, ? extends y<? extends TClosing>> o, final Callable<U> callable) {
        if (y == null) {
            throw new NullPointerException("openingIndicator is null");
        }
        if (o == null) {
            throw new NullPointerException("closingIndicator is null");
        }
        if (callable != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableBufferBoundary((y)this, (y)y, (o)o, (Callable)callable));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final <B, U extends Collection<? super T>> t<U> buffer(final y<B> y, final Callable<U> callable) {
        if (y == null) {
            throw new NullPointerException("boundary is null");
        }
        if (callable != null) {
            return RxJavaPlugins.onAssembly((t)new nf2.k((y)this, (y)y, (Callable)callable));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final <B> t<List<T>> buffer(final Callable<? extends y<B>> callable) {
        return this.buffer((Callable<? extends af2.y<Object>>)callable, ArrayListSupplier.asCallable());
    }
    
    public final <B, U extends Collection<? super T>> t<U> buffer(final Callable<? extends y<B>> callable, final Callable<U> callable2) {
        if (callable == null) {
            throw new NullPointerException("boundarySupplier is null");
        }
        if (callable2 != null) {
            return RxJavaPlugins.onAssembly((t)new nf2.j((y)this, (Callable)callable, (Callable)callable2));
        }
        throw new NullPointerException("bufferSupplier is null");
    }
    
    public final t<T> cache() {
        return this.cacheWithInitialCapacity(16);
    }
    
    public final t<T> cacheWithInitialCapacity(final int n) {
        a.c(n, "initialCapacity");
        return RxJavaPlugins.onAssembly((t)new ObservableCache(this, n));
    }
    
    public final <U> t<U> cast(final Class<U> clazz) {
        if (clazz != null) {
            return this.map((ff2.o<? super T, ? extends U>)new Functions$m((Class)clazz));
        }
        throw new NullPointerException("clazz is null");
    }
    
    public final <U> c0<U> collect(final Callable<? extends U> callable, final ff2.b<? super U, ? super T> b) {
        if (callable == null) {
            throw new NullPointerException("initialValueSupplier is null");
        }
        if (b != null) {
            return RxJavaPlugins.onAssembly((c0)new nf2.n((y)this, (Callable)callable, (ff2.b)b));
        }
        throw new NullPointerException("collector is null");
    }
    
    public final <U> c0<U> collectInto(final U u, final ff2.b<? super U, ? super T> b) {
        if (u != null) {
            return this.collect((Callable<? extends U>)new Functions$w((Object)u), b);
        }
        throw new NullPointerException("initialValue is null");
    }
    
    public final <R> t<R> compose(final af2.z<? super T, ? extends R> z) {
        if (z != null) {
            return wrap((af2.y<R>)z.a(this));
        }
        throw new NullPointerException("composer is null");
    }
    
    public final <R> t<R> concatMap(final o<? super T, ? extends y<? extends R>> o) {
        return this.concatMap(o, 2);
    }
    
    public final <R> t<R> concatMap(final o<? super T, ? extends y<? extends R>> o, final int n) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        a.c(n, "prefetch");
        if (!(this instanceof if2.h)) {
            return RxJavaPlugins.onAssembly((t)new ObservableConcatMap((y)this, (o)o, n, ErrorMode.IMMEDIATE));
        }
        final Object call = ((if2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((t)new ObservableScalarXMap.a(o, call));
    }
    
    public final af2.a concatMapCompletable(final o<? super T, ? extends af2.e> o) {
        return this.concatMapCompletable(o, 2);
    }
    
    public final af2.a concatMapCompletable(final o<? super T, ? extends af2.e> o, final int n) {
        if (o != null) {
            a.c(n, "capacityHint");
            return RxJavaPlugins.onAssembly((af2.a)new ObservableConcatMapCompletable(this, (o)o, ErrorMode.IMMEDIATE, n));
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
            return RxJavaPlugins.onAssembly((af2.a)new ObservableConcatMapCompletable(this, (o)o, errorMode, n));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> t<R> concatMapDelayError(final o<? super T, ? extends y<? extends R>> o) {
        return this.concatMapDelayError(o, bufferSize(), true);
    }
    
    public final <R> t<R> concatMapDelayError(final o<? super T, ? extends y<? extends R>> o, final int n, final boolean b) {
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
            return RxJavaPlugins.onAssembly((t)new ObservableConcatMap((y)this, (o)o, n, errorMode));
        }
        final Object call = ((if2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((t)new ObservableScalarXMap.a(o, call));
    }
    
    public final <R> t<R> concatMapEager(final o<? super T, ? extends y<? extends R>> o) {
        return this.concatMapEager(o, Integer.MAX_VALUE, bufferSize());
    }
    
    public final <R> t<R> concatMapEager(final o<? super T, ? extends y<? extends R>> o, final int n, final int n2) {
        if (o != null) {
            a.c(n, "maxConcurrency");
            a.c(n2, "prefetch");
            return RxJavaPlugins.onAssembly((t)new ObservableConcatMapEager((y)this, (o)o, ErrorMode.IMMEDIATE, n, n2));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> t<R> concatMapEagerDelayError(final o<? super T, ? extends y<? extends R>> o, final int n, final int n2, final boolean b) {
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
            return RxJavaPlugins.onAssembly((t)new ObservableConcatMapEager((y)this, (o)o, errorMode, n, n2));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> t<R> concatMapEagerDelayError(final o<? super T, ? extends y<? extends R>> o, final boolean b) {
        return this.concatMapEagerDelayError(o, Integer.MAX_VALUE, bufferSize(), b);
    }
    
    public final <U> t<U> concatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new h0((y)this, (o)o));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <U> t<U> concatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            return this.concatMap((ff2.o<? super T, ? extends af2.y<? extends U>>)new u0((o)o), n);
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> t<R> concatMapMaybe(final o<? super T, ? extends af2.r<? extends R>> o) {
        return this.concatMapMaybe(o, 2);
    }
    
    public final <R> t<R> concatMapMaybe(final o<? super T, ? extends af2.r<? extends R>> o, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly((t)new ObservableConcatMapMaybe(this, (o)o, ErrorMode.IMMEDIATE, n));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> t<R> concatMapMaybeDelayError(final o<? super T, ? extends af2.r<? extends R>> o) {
        return this.concatMapMaybeDelayError(o, true, 2);
    }
    
    public final <R> t<R> concatMapMaybeDelayError(final o<? super T, ? extends af2.r<? extends R>> o, final boolean b) {
        return this.concatMapMaybeDelayError(o, b, 2);
    }
    
    public final <R> t<R> concatMapMaybeDelayError(final o<? super T, ? extends af2.r<? extends R>> o, final boolean b, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            ErrorMode errorMode;
            if (b) {
                errorMode = ErrorMode.END;
            }
            else {
                errorMode = ErrorMode.BOUNDARY;
            }
            return RxJavaPlugins.onAssembly((t)new ObservableConcatMapMaybe(this, (o)o, errorMode, n));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> t<R> concatMapSingle(final o<? super T, ? extends g0<? extends R>> o) {
        return this.concatMapSingle(o, 2);
    }
    
    public final <R> t<R> concatMapSingle(final o<? super T, ? extends g0<? extends R>> o, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            return RxJavaPlugins.onAssembly((t)new ObservableConcatMapSingle(this, (o)o, ErrorMode.IMMEDIATE, n));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> t<R> concatMapSingleDelayError(final o<? super T, ? extends g0<? extends R>> o) {
        return this.concatMapSingleDelayError(o, true, 2);
    }
    
    public final <R> t<R> concatMapSingleDelayError(final o<? super T, ? extends g0<? extends R>> o, final boolean b) {
        return this.concatMapSingleDelayError(o, b, 2);
    }
    
    public final <R> t<R> concatMapSingleDelayError(final o<? super T, ? extends g0<? extends R>> o, final boolean b, final int n) {
        if (o != null) {
            a.c(n, "prefetch");
            ErrorMode errorMode;
            if (b) {
                errorMode = ErrorMode.END;
            }
            else {
                errorMode = ErrorMode.BOUNDARY;
            }
            return RxJavaPlugins.onAssembly((t)new ObservableConcatMapSingle(this, (o)o, errorMode, n));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final t<T> concatWith(final af2.e e) {
        if (e != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableConcatWithCompletable(this, e));
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<T> concatWith(final g0<? extends T> g0) {
        if (g0 != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableConcatWithSingle(this, (g0)g0));
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<T> concatWith(final af2.r<? extends T> r) {
        if (r != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableConcatWithMaybe(this, (af2.r)r));
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<T> concatWith(final y<? extends T> y) {
        if (y != null) {
            return concat((af2.y<? extends T>)this, y);
        }
        throw new NullPointerException("other is null");
    }
    
    public final c0<Boolean> contains(final Object o) {
        if (o != null) {
            return this.any((q<? super T>)new Functions$s(o));
        }
        throw new NullPointerException("element is null");
    }
    
    public final c0<Long> count() {
        return RxJavaPlugins.onAssembly((c0)new p((y)this));
    }
    
    public final t<T> debounce(final long n, final TimeUnit timeUnit) {
        return this.debounce(n, timeUnit, zf2.a.a());
    }
    
    public final t<T> debounce(final long n, final TimeUnit timeUnit, final b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableDebounceTimed(n, timeUnit, (y)this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <U> t<T> debounce(final o<? super T, ? extends y<U>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new nf2.q((y)this, (o)o));
        }
        throw new NullPointerException("debounceSelector is null");
    }
    
    public final t<T> defaultIfEmpty(final T t) {
        if (t != null) {
            return this.switchIfEmpty((y<? extends T>)just(t));
        }
        throw new NullPointerException("defaultItem is null");
    }
    
    public final t<T> delay(final long n, final TimeUnit timeUnit) {
        return this.delay(n, timeUnit, zf2.a.a(), false);
    }
    
    public final t<T> delay(final long n, final TimeUnit timeUnit, final b0 b0) {
        return this.delay(n, timeUnit, b0, false);
    }
    
    public final t<T> delay(final long n, final TimeUnit timeUnit, final b0 b0, final boolean b2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((t)new s((y)this, n, timeUnit, b0, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final t<T> delay(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.delay(n, timeUnit, zf2.a.a(), b);
    }
    
    public final <U, V> t<T> delay(final y<U> y, final o<? super T, ? extends y<V>> o) {
        return this.delaySubscription((af2.y<Object>)y).delay((ff2.o<? super T, ? extends af2.y<Object>>)o);
    }
    
    public final <U> t<T> delay(final o<? super T, ? extends y<U>> o) {
        if (o != null) {
            return this.flatMap((ff2.o<? super T, ? extends af2.y<? extends T>>)new x0((o)o));
        }
        throw new NullPointerException("itemDelay is null");
    }
    
    public final t<T> delaySubscription(final long n, final TimeUnit timeUnit) {
        return this.delaySubscription(n, timeUnit, zf2.a.a());
    }
    
    public final t<T> delaySubscription(final long n, final TimeUnit timeUnit, final b0 b0) {
        return this.delaySubscription((af2.y<Object>)timer(n, timeUnit, b0));
    }
    
    public final <U> t<T> delaySubscription(final y<U> y) {
        if (y != null) {
            return RxJavaPlugins.onAssembly((t)new nf2.t((y)this, (y)y));
        }
        throw new NullPointerException("other is null");
    }
    
    @Deprecated
    public final <T2> t<T2> dematerialize() {
        return RxJavaPlugins.onAssembly((t)new nf2.u((y)this, (o)Functions.a));
    }
    
    public final <R> t<R> dematerialize(final o<? super T, af2.s<R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new nf2.u((y)this, (o)o));
        }
        throw new NullPointerException("selector is null");
    }
    
    public final t<T> distinct() {
        return this.distinct((ff2.o<? super T, Object>)Functions.a, Functions.a());
    }
    
    public final <K> t<T> distinct(final o<? super T, K> o) {
        return this.distinct((ff2.o<? super T, Object>)o, Functions.a());
    }
    
    public final <K> t<T> distinct(final o<? super T, K> o, final Callable<? extends Collection<? super K>> callable) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (callable != null) {
            return RxJavaPlugins.onAssembly((t)new nf2.w((y)this, (o)o, (Callable)callable));
        }
        throw new NullPointerException("collectionSupplier is null");
    }
    
    public final t<T> distinctUntilChanged() {
        return this.distinctUntilChanged((ff2.o<? super T, Object>)Functions.a);
    }
    
    public final t<T> distinctUntilChanged(final ff2.d<? super T, ? super T> d) {
        if (d != null) {
            return RxJavaPlugins.onAssembly((t)new x((y)this, (o)Functions.a, (ff2.d)d));
        }
        throw new NullPointerException("comparer is null");
    }
    
    public final <K> t<T> distinctUntilChanged(final o<? super T, K> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new x((y)this, (o)o, (ff2.d)a.a));
        }
        throw new NullPointerException("keySelector is null");
    }
    
    public final t<T> doAfterNext(final ff2.g<? super T> g) {
        if (g != null) {
            return RxJavaPlugins.onAssembly((t)new nf2.y((y)this, (ff2.g)g));
        }
        throw new NullPointerException("onAfterNext is null");
    }
    
    public final t<T> doAfterTerminate(final ff2.a a) {
        if (a != null) {
            final Functions$p d = Functions.d;
            return this.doOnEach((ff2.g<? super T>)d, (ff2.g<? super Throwable>)d, (ff2.a)Functions.c, a);
        }
        throw new NullPointerException("onFinally is null");
    }
    
    public final t<T> doFinally(final ff2.a a) {
        if (a != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableDoFinally((y)this, a));
        }
        throw new NullPointerException("onFinally is null");
    }
    
    public final t<T> doOnComplete(final ff2.a a) {
        final Functions$p d = Functions.d;
        return this.doOnEach((ff2.g<? super T>)d, (ff2.g<? super Throwable>)d, a, (ff2.a)Functions.c);
    }
    
    public final t<T> doOnDispose(final ff2.a a) {
        return this.doOnLifecycle((ff2.g<? super df2.a>)Functions.d, a);
    }
    
    public final t<T> doOnEach(final a0<? super T> a0) {
        if (a0 != null) {
            return this.doOnEach((ff2.g<? super T>)new a1((a0)a0), (ff2.g<? super Throwable>)new z0((a0)a0), (ff2.a)new y0((a0)a0), (ff2.a)Functions.c);
        }
        throw new NullPointerException("observer is null");
    }
    
    public final t<T> doOnEach(final ff2.g<? super af2.s<T>> g) {
        if (g != null) {
            return this.doOnEach((ff2.g<? super T>)new Functions$c0((ff2.g)g), (ff2.g<? super Throwable>)new Functions$b0((ff2.g)g), (ff2.a)new Functions$a0((ff2.g)g), (ff2.a)Functions.c);
        }
        throw new NullPointerException("onNotification is null");
    }
    
    public final t<T> doOnError(final ff2.g<? super Throwable> g) {
        final Functions$p d = Functions.d;
        final Functions$o c = Functions.c;
        return this.doOnEach((ff2.g<? super T>)d, g, (ff2.a)c, (ff2.a)c);
    }
    
    public final t<T> doOnLifecycle(final ff2.g<? super df2.a> g, final ff2.a a) {
        if (g == null) {
            throw new NullPointerException("onSubscribe is null");
        }
        if (a != null) {
            return RxJavaPlugins.onAssembly((t)new nf2.a0(this, (ff2.g)g, a));
        }
        throw new NullPointerException("onDispose is null");
    }
    
    public final t<T> doOnNext(final ff2.g<? super T> g) {
        final Functions$p d = Functions.d;
        final Functions$o c = Functions.c;
        return this.doOnEach(g, (ff2.g<? super Throwable>)d, (ff2.a)c, (ff2.a)c);
    }
    
    public final t<T> doOnSubscribe(final ff2.g<? super df2.a> g) {
        return this.doOnLifecycle(g, (ff2.a)Functions.c);
    }
    
    public final t<T> doOnTerminate(final ff2.a a) {
        if (a != null) {
            return this.doOnEach((ff2.g<? super T>)Functions.d, (ff2.g<? super Throwable>)new Functions$a(a), a, (ff2.a)Functions.c);
        }
        throw new NullPointerException("onTerminate is null");
    }
    
    public final c0<T> elementAt(final long n, final T t) {
        if (n < 0L) {
            throw new IndexOutOfBoundsException(m5.a.e("index >= 0 required but it was ", n));
        }
        if (t != null) {
            return RxJavaPlugins.onAssembly((c0)new d0((y)this, n, (Object)t));
        }
        throw new NullPointerException("defaultItem is null");
    }
    
    public final af2.n<T> elementAt(final long n) {
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((af2.n)new nf2.c0((y)this, n));
        }
        throw new IndexOutOfBoundsException(m5.a.e("index >= 0 required but it was ", n));
    }
    
    public final c0<T> elementAtOrError(final long n) {
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((c0)new d0((y)this, n, (Object)null));
        }
        throw new IndexOutOfBoundsException(m5.a.e("index >= 0 required but it was ", n));
    }
    
    public final t<T> filter(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((t)new nf2.g0((y)this, (q)q));
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
    
    public final <R> t<R> flatMap(final o<? super T, ? extends y<? extends R>> o) {
        return this.flatMap(o, false);
    }
    
    public final <R> t<R> flatMap(final o<? super T, ? extends y<? extends R>> o, final int n) {
        return this.flatMap(o, false, n, bufferSize());
    }
    
    public final <U, R> t<R> flatMap(final o<? super T, ? extends y<? extends U>> o, final c<? super T, ? super U, ? extends R> c) {
        return this.flatMap((ff2.o<? super T, ? extends af2.y<?>>)o, (ff2.c<? super T, ? super Object, ? extends R>)c, false, bufferSize(), bufferSize());
    }
    
    public final <U, R> t<R> flatMap(final o<? super T, ? extends y<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final int n) {
        return this.flatMap((ff2.o<? super T, ? extends af2.y<?>>)o, (ff2.c<? super T, ? super Object, ? extends R>)c, false, n, bufferSize());
    }
    
    public final <U, R> t<R> flatMap(final o<? super T, ? extends y<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b) {
        return this.flatMap((ff2.o<? super T, ? extends af2.y<?>>)o, (ff2.c<? super T, ? super Object, ? extends R>)c, b, bufferSize(), bufferSize());
    }
    
    public final <U, R> t<R> flatMap(final o<? super T, ? extends y<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b, final int n) {
        return this.flatMap((ff2.o<? super T, ? extends af2.y<?>>)o, (ff2.c<? super T, ? super Object, ? extends R>)c, b, n, bufferSize());
    }
    
    public final <U, R> t<R> flatMap(final o<? super T, ? extends y<? extends U>> o, final c<? super T, ? super U, ? extends R> c, final boolean b, final int n, final int n2) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        if (c != null) {
            return this.flatMap((ff2.o<? super T, ? extends af2.y<? extends R>>)new w0((o)o, (c)c), b, n, n2);
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <R> t<R> flatMap(final o<? super T, ? extends y<? extends R>> o, final o<? super Throwable, ? extends y<? extends R>> o2, final Callable<? extends y<? extends R>> callable) {
        if (o == null) {
            throw new NullPointerException("onNextMapper is null");
        }
        if (o2 == null) {
            throw new NullPointerException("onErrorMapper is null");
        }
        if (callable != null) {
            return merge((af2.y<? extends af2.y<? extends R>>)new l1((y)this, (o)o, (o)o2, (Callable)callable));
        }
        throw new NullPointerException("onCompleteSupplier is null");
    }
    
    public final <R> t<R> flatMap(final o<? super T, ? extends y<? extends R>> o, final o<Throwable, ? extends y<? extends R>> o2, final Callable<? extends y<? extends R>> callable, final int n) {
        if (o == null) {
            throw new NullPointerException("onNextMapper is null");
        }
        if (o2 == null) {
            throw new NullPointerException("onErrorMapper is null");
        }
        if (callable != null) {
            return merge((af2.y<? extends af2.y<? extends R>>)new l1((y)this, (o)o, (o)o2, (Callable)callable), n);
        }
        throw new NullPointerException("onCompleteSupplier is null");
    }
    
    public final <R> t<R> flatMap(final o<? super T, ? extends y<? extends R>> o, final boolean b) {
        return this.flatMap(o, b, Integer.MAX_VALUE);
    }
    
    public final <R> t<R> flatMap(final o<? super T, ? extends y<? extends R>> o, final boolean b, final int n) {
        return this.flatMap(o, b, n, bufferSize());
    }
    
    public final <R> t<R> flatMap(final o<? super T, ? extends y<? extends R>> o, final boolean b, final int n, final int n2) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        a.c(n, "maxConcurrency");
        a.c(n2, "bufferSize");
        if (!(this instanceof if2.h)) {
            return RxJavaPlugins.onAssembly((t)new ObservableFlatMap((y)this, (o)o, b, n, n2));
        }
        final Object call = ((if2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((t)new ObservableScalarXMap.a(o, call));
    }
    
    public final af2.a flatMapCompletable(final o<? super T, ? extends af2.e> o) {
        return this.flatMapCompletable(o, false);
    }
    
    public final af2.a flatMapCompletable(final o<? super T, ? extends af2.e> o, final boolean b) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((af2.a)new ObservableFlatMapCompletableCompletable<Object>((af2.y<?>)this, o, b));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <U> t<U> flatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new h0((y)this, (o)o));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <U, V> t<V> flatMapIterable(final o<? super T, ? extends Iterable<? extends U>> o, final c<? super T, ? super U, ? extends V> c) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        if (c != null) {
            return this.flatMap((ff2.o<? super T, ? extends af2.y<?>>)new u0((o)o), (ff2.c<? super T, ? super Object, ? extends V>)c, false, bufferSize(), bufferSize());
        }
        throw new NullPointerException("resultSelector is null");
    }
    
    public final <R> t<R> flatMapMaybe(final o<? super T, ? extends af2.r<? extends R>> o) {
        return this.flatMapMaybe(o, false);
    }
    
    public final <R> t<R> flatMapMaybe(final o<? super T, ? extends af2.r<? extends R>> o, final boolean b) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableFlatMapMaybe((y)this, (o)o, b));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> t<R> flatMapSingle(final o<? super T, ? extends g0<? extends R>> o) {
        return this.flatMapSingle(o, false);
    }
    
    public final <R> t<R> flatMapSingle(final o<? super T, ? extends g0<? extends R>> o, final boolean b) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableFlatMapSingle((y)this, (o)o, b));
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
            final ForEachWhileObserver forEachWhileObserver = new ForEachWhileObserver((q)q, (ff2.g)g, a);
            this.subscribe((a0<? super T>)forEachWhileObserver);
            return (df2.a)forEachWhileObserver;
        }
        throw new NullPointerException("onComplete is null");
    }
    
    public final <K> t<uf2.b<K, T>> groupBy(final o<? super T, ? extends K> o) {
        return this.groupBy(o, (ff2.o<? super T, ? extends T>)Functions.a, false, bufferSize());
    }
    
    public final <K, V> t<uf2.b<K, V>> groupBy(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2) {
        return this.groupBy(o, o2, false, bufferSize());
    }
    
    public final <K, V> t<uf2.b<K, V>> groupBy(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b) {
        return this.groupBy(o, o2, b, bufferSize());
    }
    
    public final <K, V> t<uf2.b<K, V>> groupBy(final o<? super T, ? extends K> o, final o<? super T, ? extends V> o2, final boolean b, final int n) {
        if (o == null) {
            throw new NullPointerException("keySelector is null");
        }
        if (o2 != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((t)new ObservableGroupBy((y)this, (o)o, (o)o2, n, b));
        }
        throw new NullPointerException("valueSelector is null");
    }
    
    public final <K> t<uf2.b<K, T>> groupBy(final o<? super T, ? extends K> o, final boolean b) {
        return this.groupBy(o, (ff2.o<? super T, ? extends T>)Functions.a, b, bufferSize());
    }
    
    public final <TRight, TLeftEnd, TRightEnd, R> t<R> groupJoin(final y<? extends TRight> y, final o<? super T, ? extends y<TLeftEnd>> o, final o<? super TRight, ? extends y<TRightEnd>> o2, final c<? super T, ? super t<TRight>, ? extends R> c) {
        if (y == null) {
            throw new NullPointerException("other is null");
        }
        if (o == null) {
            throw new NullPointerException("leftEnd is null");
        }
        if (o2 == null) {
            throw new NullPointerException("rightEnd is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableGroupJoin((y)this, (y)y, (o)o, (o)o2, (c)c));
        }
        throw new NullPointerException("resultSelector is null");
    }
    
    public final t<T> hide() {
        return RxJavaPlugins.onAssembly((t)new p0((y)this));
    }
    
    public final af2.a ignoreElements() {
        return RxJavaPlugins.onAssembly((af2.a)new r0((y)this));
    }
    
    public final c0<Boolean> isEmpty() {
        return this.all((q<? super T>)Functions.h);
    }
    
    public final <TRight, TLeftEnd, TRightEnd, R> t<R> join(final y<? extends TRight> y, final o<? super T, ? extends y<TLeftEnd>> o, final o<? super TRight, ? extends y<TRightEnd>> o2, final c<? super T, ? super TRight, ? extends R> c) {
        if (y == null) {
            throw new NullPointerException("other is null");
        }
        if (o == null) {
            throw new NullPointerException("leftEnd is null");
        }
        if (o2 == null) {
            throw new NullPointerException("rightEnd is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableJoin((y)this, (y)y, (o)o, (o)o2, (c)c));
        }
        throw new NullPointerException("resultSelector is null");
    }
    
    public final c0<T> last(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((c0)new i1((y)this, (Object)t));
        }
        throw new NullPointerException("defaultItem is null");
    }
    
    public final af2.n<T> lastElement() {
        return RxJavaPlugins.onAssembly((af2.n)new h1((y)this));
    }
    
    public final c0<T> lastOrError() {
        return RxJavaPlugins.onAssembly((c0)new i1((y)this, (Object)null));
    }
    
    public final <R> t<R> lift(final af2.x<? extends R, ? super T> x) {
        if (x != null) {
            return RxJavaPlugins.onAssembly((t)new j1((y)this, (af2.x)x));
        }
        throw new NullPointerException("lifter is null");
    }
    
    public final <R> t<R> map(final o<? super T, ? extends R> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new k1((y)this, (o)o));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final t<af2.s<T>> materialize() {
        return RxJavaPlugins.onAssembly((t)new m1((y)this));
    }
    
    public final t<T> mergeWith(final af2.e e) {
        if (e != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableMergeWithCompletable(this, e));
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<T> mergeWith(final g0<? extends T> g0) {
        if (g0 != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableMergeWithSingle(this, (g0)g0));
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<T> mergeWith(final af2.r<? extends T> r) {
        if (r != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableMergeWithMaybe(this, (af2.r)r));
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<T> mergeWith(final y<? extends T> y) {
        if (y != null) {
            return merge((af2.y<? extends T>)this, y);
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<T> observeOn(final b0 b0) {
        return this.observeOn(b0, false, bufferSize());
    }
    
    public final t<T> observeOn(final b0 b0, final boolean b2) {
        return this.observeOn(b0, b2, bufferSize());
    }
    
    public final t<T> observeOn(final b0 b0, final boolean b2, final int n) {
        if (b0 != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((t)new ObservableObserveOn((y)this, b0, b2, n));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <U> t<U> ofType(final Class<U> clazz) {
        if (clazz != null) {
            return (t<U>)this.filter((q<? super T>)new Functions$n((Class)clazz)).cast((Class<Object>)clazz);
        }
        throw new NullPointerException("clazz is null");
    }
    
    public final t<T> onErrorResumeNext(final y<? extends T> y) {
        if (y != null) {
            return this.onErrorResumeNext((o<? super Throwable, ? extends y<? extends T>>)new Functions$w((Object)y));
        }
        throw new NullPointerException("next is null");
    }
    
    public final t<T> onErrorResumeNext(final o<? super Throwable, ? extends y<? extends T>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new o1((y)this, (o)o, false));
        }
        throw new NullPointerException("resumeFunction is null");
    }
    
    public final t<T> onErrorReturn(final o<? super Throwable, ? extends T> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new p1((y)this, (o)o));
        }
        throw new NullPointerException("valueSupplier is null");
    }
    
    public final t<T> onErrorReturnItem(final T t) {
        if (t != null) {
            return this.onErrorReturn((o<? super Throwable, ? extends T>)new Functions$w((Object)t));
        }
        throw new NullPointerException("item is null");
    }
    
    public final t<T> onExceptionResumeNext(final y<? extends T> y) {
        if (y != null) {
            return RxJavaPlugins.onAssembly((t)new o1((y)this, (o)new Functions$w((Object)y), true));
        }
        throw new NullPointerException("next is null");
    }
    
    public final t<T> onTerminateDetach() {
        return RxJavaPlugins.onAssembly((t)new v((y)this));
    }
    
    public final <R> t<R> publish(final o<? super t<T>, ? extends y<R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new ObservablePublishSelector((y)this, (o)o));
        }
        throw new NullPointerException("selector is null");
    }
    
    public final uf2.a<T> publish() {
        final AtomicReference atomicReference = new AtomicReference();
        return (uf2.a<T>)RxJavaPlugins.onAssembly((uf2.a)new ObservablePublish(new ObservablePublish$b(atomicReference), (y)this, atomicReference));
    }
    
    public final <R> c0<R> reduce(final R r, final c<R, ? super T, R> c) {
        if (r == null) {
            throw new NullPointerException("seed is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((c0)new s1((y)this, (Object)r, (c)c));
        }
        throw new NullPointerException("reducer is null");
    }
    
    public final af2.n<T> reduce(final c<T, T, T> c) {
        if (c != null) {
            return RxJavaPlugins.onAssembly((af2.n)new r1((y)this, (c)c));
        }
        throw new NullPointerException("reducer is null");
    }
    
    public final <R> c0<R> reduceWith(final Callable<R> callable, final c<R, ? super T, R> c) {
        if (callable == null) {
            throw new NullPointerException("seedSupplier is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((c0)new t1((y)this, (Callable)callable, (c)c));
        }
        throw new NullPointerException("reducer is null");
    }
    
    public final t<T> repeat() {
        return this.repeat(Long.MAX_VALUE);
    }
    
    public final t<T> repeat(final long n) {
        final long n2 = lcmp(n, 0L);
        if (n2 < 0) {
            throw new IllegalArgumentException(m5.a.e("times >= 0 required but it was ", n));
        }
        if (n2 == 0) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((t)new ObservableRepeat(this, n));
    }
    
    public final t<T> repeatUntil(final ff2.e e) {
        if (e != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableRepeatUntil(this, e));
        }
        throw new NullPointerException("stop is null");
    }
    
    public final t<T> repeatWhen(final o<? super t<Object>, ? extends y<?>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableRepeatWhen((y)this, (o)o));
        }
        throw new NullPointerException("handler is null");
    }
    
    public final <R> t<R> replay(final o<? super t<T>, ? extends y<R>> o) {
        if (o != null) {
            return ObservableReplay.f((o)o, (Callable)new b1(this));
        }
        throw new NullPointerException("selector is null");
    }
    
    public final <R> t<R> replay(final o<? super t<T>, ? extends y<R>> o, final int n) {
        if (o != null) {
            a.c(n, "bufferSize");
            return ObservableReplay.f((o)o, (Callable)new s0(this, n));
        }
        throw new NullPointerException("selector is null");
    }
    
    public final <R> t<R> replay(final o<? super t<T>, ? extends y<R>> o, final int n, final long n2, final TimeUnit timeUnit) {
        return this.replay(o, n, n2, timeUnit, zf2.a.a());
    }
    
    public final <R> t<R> replay(final o<? super t<T>, ? extends y<R>> o, final int n, final long n2, final TimeUnit timeUnit, final b0 b0) {
        if (o == null) {
            throw new NullPointerException("selector is null");
        }
        a.c(n, "bufferSize");
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return ObservableReplay.f((o)o, (Callable)new t0(this, n, n2, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <R> t<R> replay(final o<? super t<T>, ? extends y<R>> o, final int n, final b0 b0) {
        if (o == null) {
            throw new NullPointerException("selector is null");
        }
        if (b0 != null) {
            a.c(n, "bufferSize");
            return ObservableReplay.f((o)new c1((o)o, b0), (Callable)new s0(this, n));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <R> t<R> replay(final o<? super t<T>, ? extends y<R>> o, final long n, final TimeUnit timeUnit) {
        return this.replay(o, n, timeUnit, zf2.a.a());
    }
    
    public final <R> t<R> replay(final o<? super t<T>, ? extends y<R>> o, final long n, final TimeUnit timeUnit, final b0 b0) {
        if (o == null) {
            throw new NullPointerException("selector is null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return ObservableReplay.f((o)o, (Callable)new f1(this, n, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <R> t<R> replay(final o<? super t<T>, ? extends y<R>> o, final b0 b0) {
        if (o == null) {
            throw new NullPointerException("selector is null");
        }
        if (b0 != null) {
            return ObservableReplay.f((o)new c1((o)o, b0), (Callable)new b1(this));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final uf2.a<T> replay() {
        return (uf2.a<T>)ObservableReplay.e((y)this, (ObservableReplay$a)ObservableReplay.j);
    }
    
    public final uf2.a<T> replay(final int n) {
        a.c(n, "bufferSize");
        uf2.a a;
        if (n == Integer.MAX_VALUE) {
            a = ObservableReplay.e((y)this, (ObservableReplay$a)ObservableReplay.j);
        }
        else {
            a = ObservableReplay.e((y)this, (ObservableReplay$a)new ObservableReplay$f(n));
        }
        return (uf2.a<T>)a;
    }
    
    public final uf2.a<T> replay(final int n, final long n2, final TimeUnit timeUnit) {
        return this.replay(n, n2, timeUnit, zf2.a.a());
    }
    
    public final uf2.a<T> replay(final int n, final long n2, final TimeUnit timeUnit, final b0 b0) {
        a.c(n, "bufferSize");
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return (uf2.a<T>)ObservableReplay.e((y)this, (ObservableReplay$a)new ObservableReplay$h(n, n2, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final uf2.a<T> replay(final int n, final b0 b0) {
        a.c(n, "bufferSize");
        final uf2.a<T> replay = this.replay(n);
        return (uf2.a<T>)RxJavaPlugins.onAssembly((uf2.a)new ObservableReplay$d((uf2.a)replay, (t)((t)replay).observeOn(b0)));
    }
    
    public final uf2.a<T> replay(final long n, final TimeUnit timeUnit) {
        return this.replay(n, timeUnit, zf2.a.a());
    }
    
    public final uf2.a<T> replay(final long n, final TimeUnit timeUnit, final b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return (uf2.a<T>)ObservableReplay.e((y)this, (ObservableReplay$a)new ObservableReplay$h(Integer.MAX_VALUE, n, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final uf2.a<T> replay(final b0 b0) {
        if (b0 != null) {
            final uf2.a<T> replay = this.replay();
            return (uf2.a<T>)RxJavaPlugins.onAssembly((uf2.a)new ObservableReplay$d((uf2.a)replay, (t)((t)replay).observeOn(b0)));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final t<T> retry() {
        return this.retry(Long.MAX_VALUE, (q<? super Throwable>)Functions.g);
    }
    
    public final t<T> retry(final long n) {
        return this.retry(n, (q<? super Throwable>)Functions.g);
    }
    
    public final t<T> retry(final long n, final q<? super Throwable> q) {
        if (n < 0L) {
            throw new IllegalArgumentException(m5.a.e("times >= 0 required but it was ", n));
        }
        if (q != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableRetryPredicate(this, n, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final t<T> retry(final ff2.d<? super Integer, ? super Throwable> d) {
        if (d != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableRetryBiPredicate(this, (ff2.d)d));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final t<T> retry(final q<? super Throwable> q) {
        return this.retry(Long.MAX_VALUE, q);
    }
    
    public final t<T> retryUntil(final ff2.e e) {
        if (e != null) {
            return this.retry(Long.MAX_VALUE, (q<? super Throwable>)new Functions$k(e));
        }
        throw new NullPointerException("stop is null");
    }
    
    public final t<T> retryWhen(final o<? super t<Throwable>, ? extends y<?>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableRetryWhen((y)this, (o)o));
        }
        throw new NullPointerException("handler is null");
    }
    
    public final void safeSubscribe(final a0<? super T> a0) {
        if (a0 != null) {
            if (a0 instanceof vf2.f) {
                this.subscribe(a0);
            }
            else {
                this.subscribe((a0<? super T>)new vf2.f((a0)a0));
            }
            return;
        }
        throw new NullPointerException("observer is null");
    }
    
    public final t<T> sample(final long n, final TimeUnit timeUnit) {
        return this.sample(n, timeUnit, zf2.a.a());
    }
    
    public final t<T> sample(final long n, final TimeUnit timeUnit, final b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableSampleTimed((y)this, n, timeUnit, b0, false));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final t<T> sample(final long n, final TimeUnit timeUnit, final b0 b0, final boolean b2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableSampleTimed((y)this, n, timeUnit, b0, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final t<T> sample(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.sample(n, timeUnit, zf2.a.a(), b);
    }
    
    public final <U> t<T> sample(final y<U> y) {
        if (y != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableSampleWithObservable((y)this, (y)y, false));
        }
        throw new NullPointerException("sampler is null");
    }
    
    public final <U> t<T> sample(final y<U> y, final boolean b) {
        if (y != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableSampleWithObservable((y)this, (y)y, b));
        }
        throw new NullPointerException("sampler is null");
    }
    
    public final t<T> scan(final c<T, T, T> c) {
        if (c != null) {
            return RxJavaPlugins.onAssembly((t)new u1((y)this, (c)c));
        }
        throw new NullPointerException("accumulator is null");
    }
    
    public final <R> t<R> scan(final R r, final c<R, ? super T, R> c) {
        if (r != null) {
            return this.scanWith((Callable<R>)new Functions$w((Object)r), c);
        }
        throw new NullPointerException("initialValue is null");
    }
    
    public final <R> t<R> scanWith(final Callable<R> callable, final c<R, ? super T, R> c) {
        if (callable == null) {
            throw new NullPointerException("seedSupplier is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((t)new v1((y)this, (Callable)callable, (c)c));
        }
        throw new NullPointerException("accumulator is null");
    }
    
    public final t<T> serialize() {
        return RxJavaPlugins.onAssembly((t)new w1(this));
    }
    
    public final t<T> share() {
        return this.publish().d();
    }
    
    public final c0<T> single(final T t) {
        if (t != null) {
            return RxJavaPlugins.onAssembly((c0)new y1((y)this, (Object)t));
        }
        throw new NullPointerException("defaultItem is null");
    }
    
    public final af2.n<T> singleElement() {
        return RxJavaPlugins.onAssembly((af2.n)new x1((y)this));
    }
    
    public final c0<T> singleOrError() {
        return RxJavaPlugins.onAssembly((c0)new y1((y)this, (Object)null));
    }
    
    public final t<T> skip(final long n) {
        if (n <= 0L) {
            return RxJavaPlugins.onAssembly(this);
        }
        return RxJavaPlugins.onAssembly((t)new z1((y)this, n));
    }
    
    public final t<T> skip(final long n, final TimeUnit timeUnit) {
        return this.skipUntil((af2.y<Object>)timer(n, timeUnit));
    }
    
    public final t<T> skip(final long n, final TimeUnit timeUnit, final b0 b0) {
        return this.skipUntil((af2.y<Object>)timer(n, timeUnit, b0));
    }
    
    public final t<T> skipLast(final int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException(d.h("count >= 0 required but it was ", n));
        }
        if (n == 0) {
            return RxJavaPlugins.onAssembly(this);
        }
        return RxJavaPlugins.onAssembly((t)new ObservableSkipLast((y)this, n));
    }
    
    public final t<T> skipLast(final long n, final TimeUnit timeUnit) {
        return this.skipLast(n, timeUnit, (b0)zf2.a.d, false, bufferSize());
    }
    
    public final t<T> skipLast(final long n, final TimeUnit timeUnit, final b0 b0) {
        return this.skipLast(n, timeUnit, b0, false, bufferSize());
    }
    
    public final t<T> skipLast(final long n, final TimeUnit timeUnit, final b0 b0, final boolean b2) {
        return this.skipLast(n, timeUnit, b0, b2, bufferSize());
    }
    
    public final t<T> skipLast(final long n, final TimeUnit timeUnit, final b0 b0, final boolean b2, final int n2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            a.c(n2, "bufferSize");
            return RxJavaPlugins.onAssembly((t)new ObservableSkipLastTimed((y)this, n, timeUnit, b0, n2 << 1, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final t<T> skipLast(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.skipLast(n, timeUnit, (b0)zf2.a.d, b, bufferSize());
    }
    
    public final <U> t<T> skipUntil(final y<U> y) {
        if (y != null) {
            return RxJavaPlugins.onAssembly((t)new a2((y)this, (y)y));
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<T> skipWhile(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((t)new b2((y)this, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final t<T> sorted() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   af2/t.toList:()Laf2/c0;
        //     4: invokevirtual   af2/c0.N:()Laf2/t;
        //     7: new             Lio/reactivex/internal/functions/Functions$x;
        //    10: dup            
        //    11: invokestatic    io/reactivex/internal/functions/Functions.b:()Ljava/util/Comparator;
        //    14: invokespecial   io/reactivex/internal/functions/Functions$x.<init>:(Ljava/util/Comparator;)V
        //    17: invokevirtual   af2/t.map:(Lff2/o;)Laf2/t;
        //    20: getstatic       io/reactivex/internal/functions/Functions.a:Lio/reactivex/internal/functions/Functions$v;
        //    23: invokevirtual   af2/t.flatMapIterable:(Lff2/o;)Laf2/t;
        //    26: areturn        
        //    Signature:
        //  ()Laf2/t<TT;>;
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
    
    public final t<T> sorted(final Comparator<? super T> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnull          29
        //     4: aload_0        
        //     5: invokevirtual   af2/t.toList:()Laf2/c0;
        //     8: invokevirtual   af2/c0.N:()Laf2/t;
        //    11: new             Lio/reactivex/internal/functions/Functions$x;
        //    14: dup            
        //    15: aload_1        
        //    16: invokespecial   io/reactivex/internal/functions/Functions$x.<init>:(Ljava/util/Comparator;)V
        //    19: invokevirtual   af2/t.map:(Lff2/o;)Laf2/t;
        //    22: getstatic       io/reactivex/internal/functions/Functions.a:Lio/reactivex/internal/functions/Functions$v;
        //    25: invokevirtual   af2/t.flatMapIterable:(Lff2/o;)Laf2/t;
        //    28: areturn        
        //    29: new             Ljava/lang/NullPointerException;
        //    32: dup            
        //    33: ldc_w           "sortFunction is null"
        //    36: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //    39: athrow         
        //    Signature:
        //  (Ljava/util/Comparator<-TT;>;)Laf2/t<TT;>;
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
    
    public final t<T> startWith(final y<? extends T> y) {
        if (y != null) {
            return concatArray(y, (y)this);
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<T> startWith(final Iterable<? extends T> iterable) {
        return concatArray((y)fromIterable((Iterable<?>)iterable), (y)this);
    }
    
    public final t<T> startWith(final T t) {
        if (t != null) {
            return concatArray((y)just(t), (y)this);
        }
        throw new NullPointerException("item is null");
    }
    
    public final t<T> startWithArray(final T... array) {
        final t<T> fromArray = fromArray(array);
        if (fromArray == empty()) {
            return RxJavaPlugins.onAssembly(this);
        }
        return (t<T>)concatArray((y)fromArray, (y)this);
    }
    
    public final df2.a subscribe() {
        final Functions$p d = Functions.d;
        return this.subscribe((ff2.g<? super T>)d, (ff2.g<? super Throwable>)Functions.e, (ff2.a)Functions.c, (ff2.g<? super df2.a>)d);
    }
    
    public final df2.a subscribe(final ff2.g<? super T> g) {
        return this.subscribe(g, (ff2.g<? super Throwable>)Functions.e, (ff2.a)Functions.c, (ff2.g<? super df2.a>)Functions.d);
    }
    
    public final df2.a subscribe(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2) {
        return this.subscribe(g, g2, (ff2.a)Functions.c, (ff2.g<? super df2.a>)Functions.d);
    }
    
    public final df2.a subscribe(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2, final ff2.a a) {
        return this.subscribe(g, g2, a, (ff2.g<? super df2.a>)Functions.d);
    }
    
    public final df2.a subscribe(final ff2.g<? super T> g, final ff2.g<? super Throwable> g2, final ff2.a a, final ff2.g<? super df2.a> g3) {
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
            final LambdaObserver lambdaObserver = new LambdaObserver((ff2.g)g, (ff2.g)g2, a, (ff2.g)g3);
            this.subscribe((a0<? super T>)lambdaObserver);
            return (df2.a)lambdaObserver;
        }
        throw new NullPointerException("onSubscribe is null");
    }
    
    public final void subscribe(final a0<? super T> a0) {
        if (a0 != null) {
            try {
                final a0 onSubscribe = RxJavaPlugins.onSubscribe(this, (a0)a0);
                a.b((Object)onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null Observer. Please change the handler provided to RxJavaPlugins.setOnObservableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
                this.subscribeActual((a0<? super T>)onSubscribe);
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
        throw new NullPointerException("observer is null");
    }
    
    public abstract void subscribeActual(final a0<? super T> p0);
    
    public final t<T> subscribeOn(final b0 b0) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableSubscribeOn((y)this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <E extends a0<? super T>> E subscribeWith(final E e) {
        this.subscribe(e);
        return e;
    }
    
    public final t<T> switchIfEmpty(final y<? extends T> y) {
        if (y != null) {
            return RxJavaPlugins.onAssembly((t)new c2((y)this, (y)y));
        }
        throw new NullPointerException("other is null");
    }
    
    public final <R> t<R> switchMap(final o<? super T, ? extends y<? extends R>> o) {
        return this.switchMap(o, bufferSize());
    }
    
    public final <R> t<R> switchMap(final o<? super T, ? extends y<? extends R>> o, final int n) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        a.c(n, "bufferSize");
        if (!(this instanceof if2.h)) {
            return RxJavaPlugins.onAssembly((t)new ObservableSwitchMap((y)this, (o)o, n, false));
        }
        final Object call = ((if2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((t)new ObservableScalarXMap.a(o, call));
    }
    
    public final af2.a switchMapCompletable(final o<? super T, ? extends af2.e> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((af2.a)new ObservableSwitchMapCompletable(this, (o)o, false));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final af2.a switchMapCompletableDelayError(final o<? super T, ? extends af2.e> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((af2.a)new ObservableSwitchMapCompletable(this, (o)o, true));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> t<R> switchMapDelayError(final o<? super T, ? extends y<? extends R>> o) {
        return this.switchMapDelayError(o, bufferSize());
    }
    
    public final <R> t<R> switchMapDelayError(final o<? super T, ? extends y<? extends R>> o, final int n) {
        if (o == null) {
            throw new NullPointerException("mapper is null");
        }
        a.c(n, "bufferSize");
        if (!(this instanceof if2.h)) {
            return RxJavaPlugins.onAssembly((t)new ObservableSwitchMap((y)this, (o)o, n, true));
        }
        final Object call = ((if2.h)this).call();
        if (call == null) {
            return empty();
        }
        return RxJavaPlugins.onAssembly((t)new ObservableScalarXMap.a(o, call));
    }
    
    public final <R> t<R> switchMapMaybe(final o<? super T, ? extends af2.r<? extends R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableSwitchMapMaybe(this, (o)o, false));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> t<R> switchMapMaybeDelayError(final o<? super T, ? extends af2.r<? extends R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableSwitchMapMaybe(this, (o)o, true));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> t<R> switchMapSingle(final o<? super T, ? extends g0<? extends R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableSwitchMapSingle(this, (o)o, false));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final <R> t<R> switchMapSingleDelayError(final o<? super T, ? extends g0<? extends R>> o) {
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableSwitchMapSingle(this, (o)o, true));
        }
        throw new NullPointerException("mapper is null");
    }
    
    public final t<T> take(final long n) {
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((t)new d2((y)this, n));
        }
        throw new IllegalArgumentException(m5.a.e("count >= 0 required but it was ", n));
    }
    
    public final t<T> take(final long n, final TimeUnit timeUnit) {
        return this.takeUntil((af2.y<Object>)timer(n, timeUnit));
    }
    
    public final t<T> take(final long n, final TimeUnit timeUnit, final b0 b0) {
        return this.takeUntil((af2.y<Object>)timer(n, timeUnit, b0));
    }
    
    public final t<T> takeLast(final int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException(d.h("count >= 0 required but it was ", n));
        }
        if (n == 0) {
            return RxJavaPlugins.onAssembly((t)new q0((y)this));
        }
        if (n == 1) {
            return RxJavaPlugins.onAssembly((t)new e2((y)this));
        }
        return RxJavaPlugins.onAssembly((t)new ObservableTakeLast((y)this, n));
    }
    
    public final t<T> takeLast(final long n, final long n2, final TimeUnit timeUnit) {
        return this.takeLast(n, n2, timeUnit, (b0)zf2.a.d, false, bufferSize());
    }
    
    public final t<T> takeLast(final long n, final long n2, final TimeUnit timeUnit, final b0 b0) {
        return this.takeLast(n, n2, timeUnit, b0, false, bufferSize());
    }
    
    public final t<T> takeLast(final long n, final long n2, final TimeUnit timeUnit, final b0 b0, final boolean b2, final int n3) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        a.c(n3, "bufferSize");
        if (n >= 0L) {
            return RxJavaPlugins.onAssembly((t)new ObservableTakeLastTimed((y)this, n, n2, timeUnit, b0, n3, b2));
        }
        throw new IndexOutOfBoundsException(m5.a.e("count >= 0 required but it was ", n));
    }
    
    public final t<T> takeLast(final long n, final TimeUnit timeUnit) {
        return this.takeLast(n, timeUnit, (b0)zf2.a.d, false, bufferSize());
    }
    
    public final t<T> takeLast(final long n, final TimeUnit timeUnit, final b0 b0) {
        return this.takeLast(n, timeUnit, b0, false, bufferSize());
    }
    
    public final t<T> takeLast(final long n, final TimeUnit timeUnit, final b0 b0, final boolean b2) {
        return this.takeLast(n, timeUnit, b0, b2, bufferSize());
    }
    
    public final t<T> takeLast(final long n, final TimeUnit timeUnit, final b0 b0, final boolean b2, final int n2) {
        return this.takeLast(Long.MAX_VALUE, n, timeUnit, b0, b2, n2);
    }
    
    public final t<T> takeLast(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.takeLast(n, timeUnit, (b0)zf2.a.d, b, bufferSize());
    }
    
    public final <U> t<T> takeUntil(final y<U> y) {
        if (y != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableTakeUntil((y)this, (y)y));
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<T> takeUntil(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((t)new f2((y)this, (q)q));
        }
        throw new NullPointerException("stopPredicate is null");
    }
    
    public final t<T> takeWhile(final q<? super T> q) {
        if (q != null) {
            return RxJavaPlugins.onAssembly((t)new g2((y)this, (q)q));
        }
        throw new NullPointerException("predicate is null");
    }
    
    public final TestObserver<T> test() {
        final TestObserver testObserver = new TestObserver<Object>();
        this.subscribe((a0<? super T>)testObserver);
        return (TestObserver<T>)testObserver;
    }
    
    public final TestObserver<T> test(final boolean b) {
        final TestObserver testObserver = new TestObserver<Object>();
        if (b) {
            testObserver.dispose();
        }
        this.subscribe((a0<? super T>)testObserver);
        return (TestObserver<T>)testObserver;
    }
    
    public final t<T> throttleFirst(final long n, final TimeUnit timeUnit) {
        return this.throttleFirst(n, timeUnit, zf2.a.a());
    }
    
    public final t<T> throttleFirst(final long n, final TimeUnit timeUnit, final b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableThrottleFirstTimed(n, timeUnit, (y)this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final t<T> throttleLast(final long n, final TimeUnit timeUnit) {
        return this.sample(n, timeUnit);
    }
    
    public final t<T> throttleLast(final long n, final TimeUnit timeUnit, final b0 b0) {
        return this.sample(n, timeUnit, b0);
    }
    
    public final t<T> throttleLatest(final long n, final TimeUnit timeUnit) {
        return this.throttleLatest(n, timeUnit, zf2.a.a(), false);
    }
    
    public final t<T> throttleLatest(final long n, final TimeUnit timeUnit, final b0 b0) {
        return this.throttleLatest(n, timeUnit, b0, false);
    }
    
    public final t<T> throttleLatest(final long n, final TimeUnit timeUnit, final b0 b0, final boolean b2) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableThrottleLatest(this, n, timeUnit, b0, b2));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final t<T> throttleLatest(final long n, final TimeUnit timeUnit, final boolean b) {
        return this.throttleLatest(n, timeUnit, zf2.a.a(), b);
    }
    
    public final t<T> throttleWithTimeout(final long n, final TimeUnit timeUnit) {
        return this.debounce(n, timeUnit);
    }
    
    public final t<T> throttleWithTimeout(final long n, final TimeUnit timeUnit, final b0 b0) {
        return this.debounce(n, timeUnit, b0);
    }
    
    public final t<zf2.b<T>> timeInterval() {
        return this.timeInterval(TimeUnit.MILLISECONDS, zf2.a.a());
    }
    
    public final t<zf2.b<T>> timeInterval(final b0 b0) {
        return this.timeInterval(TimeUnit.MILLISECONDS, b0);
    }
    
    public final t<zf2.b<T>> timeInterval(final TimeUnit timeUnit) {
        return this.timeInterval(timeUnit, zf2.a.a());
    }
    
    public final t<zf2.b<T>> timeInterval(final TimeUnit timeUnit, final b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((t)new h2((y)this, timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final t<T> timeout(final long n, final TimeUnit timeUnit) {
        return this.timeout0(n, timeUnit, null, zf2.a.a());
    }
    
    public final t<T> timeout(final long n, final TimeUnit timeUnit, final b0 b0) {
        return this.timeout0(n, timeUnit, null, b0);
    }
    
    public final t<T> timeout(final long n, final TimeUnit timeUnit, final b0 b0, final y<? extends T> y) {
        if (y != null) {
            return this.timeout0(n, timeUnit, y, b0);
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<T> timeout(final long n, final TimeUnit timeUnit, final y<? extends T> y) {
        if (y != null) {
            return this.timeout0(n, timeUnit, y, zf2.a.a());
        }
        throw new NullPointerException("other is null");
    }
    
    public final <U, V> t<T> timeout(final y<U> y, final o<? super T, ? extends y<V>> o) {
        if (y != null) {
            return this.timeout0((af2.y<Object>)y, (ff2.o<? super T, ? extends af2.y<Object>>)o, (y<? extends T>)null);
        }
        throw new NullPointerException("firstTimeoutIndicator is null");
    }
    
    public final <U, V> t<T> timeout(final y<U> y, final o<? super T, ? extends y<V>> o, final y<? extends T> y2) {
        if (y == null) {
            throw new NullPointerException("firstTimeoutIndicator is null");
        }
        if (y2 != null) {
            return this.timeout0((af2.y<Object>)y, (ff2.o<? super T, ? extends af2.y<Object>>)o, y2);
        }
        throw new NullPointerException("other is null");
    }
    
    public final <V> t<T> timeout(final o<? super T, ? extends y<V>> o) {
        return this.timeout0((af2.y<Object>)null, (ff2.o<? super T, ? extends af2.y<Object>>)o, (y<? extends T>)null);
    }
    
    public final <V> t<T> timeout(final o<? super T, ? extends y<V>> o, final y<? extends T> y) {
        if (y != null) {
            return this.timeout0((af2.y<Object>)null, (ff2.o<? super T, ? extends af2.y<Object>>)o, y);
        }
        throw new NullPointerException("other is null");
    }
    
    public final t<zf2.b<T>> timestamp() {
        return this.timestamp(TimeUnit.MILLISECONDS, zf2.a.a());
    }
    
    public final t<zf2.b<T>> timestamp(final b0 b0) {
        return this.timestamp(TimeUnit.MILLISECONDS, b0);
    }
    
    public final t<zf2.b<T>> timestamp(final TimeUnit timeUnit) {
        return this.timestamp(timeUnit, zf2.a.a());
    }
    
    public final t<zf2.b<T>> timestamp(final TimeUnit timeUnit, final b0 b0) {
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        }
        if (b0 != null) {
            return this.map((ff2.o<? super T, ? extends zf2.b<T>>)new Functions$f0(timeUnit, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final <R> R to(final o<? super t<T>, R> o) {
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
    
    public final g<T> toFlowable(final BackpressureStrategy backpressureStrategy) {
        final lf2.c0 c0 = new lf2.c0((t<T>)this);
        final int n = t$a.a[((Enum)backpressureStrategy).ordinal()];
        if (n == 1) {
            return c0.onBackpressureDrop();
        }
        if (n == 2) {
            return c0.onBackpressureLatest();
        }
        if (n == 3) {
            return c0;
        }
        if (n != 4) {
            return c0.onBackpressureBuffer();
        }
        return RxJavaPlugins.onAssembly((g)new FlowableOnBackpressureError(c0));
    }
    
    public final Future<T> toFuture() {
        return this.subscribeWith(new jf2.h());
    }
    
    public final c0<List<T>> toList() {
        return this.toList(16);
    }
    
    public final c0<List<T>> toList(final int n) {
        a.c(n, "capacityHint");
        return RxJavaPlugins.onAssembly((c0)new j2((y)this, n));
    }
    
    public final <U extends Collection<? super T>> c0<U> toList(final Callable<U> callable) {
        if (callable != null) {
            return RxJavaPlugins.onAssembly((c0)new j2((y)this, (Callable)callable));
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
        if (o2 == null) {
            throw new NullPointerException("valueSelector is null");
        }
        if (callable != null) {
            return this.collect(callable, (ff2.b<? super Map<K, V>, ? super T>)new Functions$h0((o)o2, (o)o));
        }
        throw new NullPointerException("mapSupplier is null");
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
    
    public final c0<List<T>> toSortedList() {
        return this.toSortedList((Comparator<? super T>)Functions.j);
    }
    
    public final c0<List<T>> toSortedList(final int n) {
        return this.toSortedList((Comparator<? super T>)Functions.j, n);
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
    
    public final t<T> unsubscribeOn(final b0 b0) {
        if (b0 != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableUnsubscribeOn((y)this, b0));
        }
        throw new NullPointerException("scheduler is null");
    }
    
    public final t<t<T>> window(final long n) {
        return this.window(n, n, bufferSize());
    }
    
    public final t<t<T>> window(final long n, final long n2) {
        return this.window(n, n2, bufferSize());
    }
    
    public final t<t<T>> window(final long n, final long n2, final int n3) {
        a.d(n, "count");
        a.d(n2, "skip");
        a.c(n3, "bufferSize");
        return RxJavaPlugins.onAssembly((t)new ObservableWindow((y)this, n, n2, n3));
    }
    
    public final t<t<T>> window(final long n, final long n2, final TimeUnit timeUnit) {
        return this.window(n, n2, timeUnit, zf2.a.a(), bufferSize());
    }
    
    public final t<t<T>> window(final long n, final long n2, final TimeUnit timeUnit, final b0 b0) {
        return this.window(n, n2, timeUnit, b0, bufferSize());
    }
    
    public final t<t<T>> window(final long n, final long n2, final TimeUnit timeUnit, final b0 b0, final int n3) {
        a.d(n, "timespan");
        a.d(n2, "timeskip");
        a.c(n3, "bufferSize");
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        if (timeUnit != null) {
            return RxJavaPlugins.onAssembly((t)new l2((y)this, n, n2, timeUnit, b0, Long.MAX_VALUE, n3, false));
        }
        throw new NullPointerException("unit is null");
    }
    
    public final t<t<T>> window(final long n, final TimeUnit timeUnit) {
        return this.window(n, timeUnit, zf2.a.a(), Long.MAX_VALUE, false);
    }
    
    public final t<t<T>> window(final long n, final TimeUnit timeUnit, final long n2) {
        return this.window(n, timeUnit, zf2.a.a(), n2, false);
    }
    
    public final t<t<T>> window(final long n, final TimeUnit timeUnit, final long n2, final boolean b) {
        return this.window(n, timeUnit, zf2.a.a(), n2, b);
    }
    
    public final t<t<T>> window(final long n, final TimeUnit timeUnit, final b0 b0) {
        return this.window(n, timeUnit, b0, Long.MAX_VALUE, false);
    }
    
    public final t<t<T>> window(final long n, final TimeUnit timeUnit, final b0 b0, final long n2) {
        return this.window(n, timeUnit, b0, n2, false);
    }
    
    public final t<t<T>> window(final long n, final TimeUnit timeUnit, final b0 b0, final long n2, final boolean b2) {
        return this.window(n, timeUnit, b0, n2, b2, bufferSize());
    }
    
    public final t<t<T>> window(final long n, final TimeUnit timeUnit, final b0 b0, final long n2, final boolean b2, final int n3) {
        a.c(n3, "bufferSize");
        if (b0 == null) {
            throw new NullPointerException("scheduler is null");
        }
        if (timeUnit != null) {
            a.d(n2, "count");
            return RxJavaPlugins.onAssembly((t)new l2((y)this, n, n, timeUnit, b0, n2, n3, b2));
        }
        throw new NullPointerException("unit is null");
    }
    
    public final <B> t<t<T>> window(final y<B> y) {
        return this.window((af2.y<Object>)y, bufferSize());
    }
    
    public final <B> t<t<T>> window(final y<B> y, final int n) {
        if (y != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((t)new ObservableWindowBoundary((y)this, (y)y, n));
        }
        throw new NullPointerException("boundary is null");
    }
    
    public final <U, V> t<t<T>> window(final y<U> y, final o<? super U, ? extends y<V>> o) {
        return this.window((af2.y<Object>)y, (ff2.o<? super Object, ? extends af2.y<Object>>)o, bufferSize());
    }
    
    public final <U, V> t<t<T>> window(final y<U> y, final o<? super U, ? extends y<V>> o, final int n) {
        if (y == null) {
            throw new NullPointerException("openingIndicator is null");
        }
        if (o != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((t)new k2((y)this, (y)y, (o)o, n));
        }
        throw new NullPointerException("closingIndicator is null");
    }
    
    public final <B> t<t<T>> window(final Callable<? extends y<B>> callable) {
        return this.window((Callable<? extends af2.y<Object>>)callable, bufferSize());
    }
    
    public final <B> t<t<T>> window(final Callable<? extends y<B>> callable, final int n) {
        if (callable != null) {
            a.c(n, "bufferSize");
            return RxJavaPlugins.onAssembly((t)new ObservableWindowBoundarySupplier((y)this, (Callable)callable, n));
        }
        throw new NullPointerException("boundary is null");
    }
    
    public final <T1, T2, T3, T4, R> t<R> withLatestFrom(final y<T1> y, final y<T2> y2, final y<T3> y3, final y<T4> y4, final j<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> j) {
        if (y == null) {
            throw new NullPointerException("o1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("o2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("o3 is null");
        }
        if (y4 == null) {
            throw new NullPointerException("o4 is null");
        }
        if (j != null) {
            return this.withLatestFrom((y<?>[])new y[] { y, y2, y3, y4 }, (ff2.o<? super Object[], R>)Functions.f((j)j));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <T1, T2, T3, R> t<R> withLatestFrom(final y<T1> y, final y<T2> y2, final y<T3> y3, final i<? super T, ? super T1, ? super T2, ? super T3, R> i) {
        if (y == null) {
            throw new NullPointerException("o1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("o2 is null");
        }
        if (y3 == null) {
            throw new NullPointerException("o3 is null");
        }
        if (i != null) {
            return this.withLatestFrom((y<?>[])new y[] { y, y2, y3 }, (ff2.o<? super Object[], R>)Functions.e((i)i));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <T1, T2, R> t<R> withLatestFrom(final y<T1> y, final y<T2> y2, final h<? super T, ? super T1, ? super T2, R> h) {
        if (y == null) {
            throw new NullPointerException("o1 is null");
        }
        if (y2 == null) {
            throw new NullPointerException("o2 is null");
        }
        if (h != null) {
            return this.withLatestFrom((y<?>[])new y[] { y, y2 }, (ff2.o<? super Object[], R>)Functions.d((h)h));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <U, R> t<R> withLatestFrom(final y<? extends U> y, final c<? super T, ? super U, ? extends R> c) {
        if (y == null) {
            throw new NullPointerException("other is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableWithLatestFrom((y)this, (y)y, (c)c));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <R> t<R> withLatestFrom(final Iterable<? extends y<?>> iterable, final o<? super Object[], R> o) {
        if (iterable == null) {
            throw new NullPointerException("others is null");
        }
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableWithLatestFromMany((y)this, (Iterable)iterable, (o)o));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <R> t<R> withLatestFrom(final y<?>[] array, final o<? super Object[], R> o) {
        if (array == null) {
            throw new NullPointerException("others is null");
        }
        if (o != null) {
            return RxJavaPlugins.onAssembly((t)new ObservableWithLatestFromMany((y)this, (y[])array, (o)o));
        }
        throw new NullPointerException("combiner is null");
    }
    
    public final <U, R> t<R> zipWith(final y<? extends U> y, final c<? super T, ? super U, ? extends R> c) {
        if (y != null) {
            return zip((af2.y<?>)this, (af2.y<?>)y, (ff2.c<? super Object, ? super Object, ? extends R>)c);
        }
        throw new NullPointerException("other is null");
    }
    
    public final <U, R> t<R> zipWith(final y<? extends U> y, final c<? super T, ? super U, ? extends R> c, final boolean b) {
        return zip((af2.y<?>)this, (af2.y<?>)y, (ff2.c<? super Object, ? super Object, ? extends R>)c, b);
    }
    
    public final <U, R> t<R> zipWith(final y<? extends U> y, final c<? super T, ? super U, ? extends R> c, final boolean b, final int n) {
        return zip((af2.y<?>)this, (af2.y<?>)y, (ff2.c<? super Object, ? super Object, ? extends R>)c, b, n);
    }
    
    public final <U, R> t<R> zipWith(final Iterable<U> iterable, final c<? super T, ? super U, ? extends R> c) {
        if (iterable == null) {
            throw new NullPointerException("other is null");
        }
        if (c != null) {
            return RxJavaPlugins.onAssembly((t)new m2(this, (Iterable)iterable, (c)c));
        }
        throw new NullPointerException("zipper is null");
    }
}
