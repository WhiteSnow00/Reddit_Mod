// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import java.util.concurrent.CancellationException;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import yd.b;
import lg.e0;
import java.util.Map;
import rg2.p;
import hg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hj2.f;
import rg2.a;
import kotlin.collections.c;
import sg2.e;
import l0.d0;
import androidx.compose.foundation.gestures.DefaultDraggableState;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;
import z0.l0;
import rg2.l;
import l0.d;

public final class SwipeableState<T>
{
    public final d<Float> a;
    public final l<T, Boolean> b;
    public final l0 c;
    public final l0 d;
    public final l0 e;
    public final l0 f;
    public final l0 g;
    public final l0 h;
    public final l0 i;
    public final FlowKt__LimitKt$take$$inlined$unsafeFlow$1 j;
    public float k;
    public float l;
    public final l0 m;
    public final l0 n;
    public final l0 o;
    public final DefaultDraggableState p;
    
    public SwipeableState(final T t, final d<Float> a, final l<? super T, Boolean> b) {
        sg2.e.f((Object)a, "animationSpec");
        sg2.e.f((Object)b, "confirmStateChange");
        this.a = a;
        this.b = (l<T, Boolean>)b;
        this.c = bg.d.t0((Object)t);
        this.d = bg.d.t0((Object)Boolean.FALSE);
        final Float value = 0.0f;
        this.e = bg.d.t0((Object)value);
        this.f = bg.d.t0((Object)value);
        this.g = bg.d.t0((Object)value);
        this.h = bg.d.t0((Object)null);
        this.i = bg.d.t0((Object)kotlin.collections.c.V0());
        this.j = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1((hj2.e)new SwipeableState$special$$inlined$filter$1(androidx.compose.runtime.e.b((a)new SwipeableState$latestNonEmptyAnchorsFlow.SwipeableState$latestNonEmptyAnchorsFlow$1(this))));
        this.k = Float.NEGATIVE_INFINITY;
        this.l = Float.POSITIVE_INFINITY;
        this.m = bg.d.t0((Object)SwipeableState$thresholds.SwipeableState$thresholds$2.INSTANCE);
        this.n = bg.d.t0((Object)value);
        this.o = bg.d.t0((Object)null);
        this.p = new DefaultDraggableState((l)new SwipeableState$draggableState.SwipeableState$draggableState$1(this));
    }
    
    public static Object b(final SwipeableState swipeableState, final Object o, final lg2.c c) {
        Object o2 = swipeableState.j.a((f)new SwipeableState$animateTo$2(o, swipeableState, (d)swipeableState.a), c);
        if (o2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            o2 = j.a;
        }
        return o2;
    }
    
    public final Object a(final float n, final d<Float> d, final lg2.c<? super j> c) {
        final Object b = n0.c.b((n0.c)this.p, (p)new SwipeableState$animateInternalToOffset$2(this, n, (d)d, (lg2.c)null), (lg2.c)c);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        return hg2.j.a;
    }
    
    public final Map<Float, T> c() {
        return (Map)((SnapshotMutableStateImpl)this.i).getValue();
    }
    
    public final T d() {
        return (T)((SnapshotMutableStateImpl)this.c).getValue();
    }
    
    public final float e(float n) {
        n = e0.u(((Number)((SnapshotMutableStateImpl)this.g).getValue()).floatValue() + n, this.k, this.l) - ((Number)((SnapshotMutableStateImpl)this.g).getValue()).floatValue();
        if (Math.abs(n) > 0.0f) {
            this.p.a.invoke(n);
        }
        return n;
    }
    
    public final Object f(final float n, final lg2.c<? super j> c) {
        final Object a = this.j.a((f)new SwipeableState$a(this, n), (lg2.c)c);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return hg2.j.a;
    }
    
    public final Object g(Map<Float, ? extends T> l$0, Map<Float, ? extends T> o, lg2.c<? super j> o2) {
        Object i = null;
        Label_0052: {
            if (o2 instanceof SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1) {
                i = o2;
                final int label = ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).label = label + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            i = new SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1(this, (lg2.c)o2);
        }
        final Object result = ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).label;
        Label_0209: {
            if (label2 == 0) {
                break Label_0209;
            }
            Label_0201: {
                if (label2 == 1) {
                    break Label_0201;
                }
                Label_1044: {
                    if (label2 != 2) {
                        if (label2 == 3) {
                            final float n = ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).F$0;
                            o = ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).L$1;
                            l$0 = ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).L$0;
                            try {
                                yd.b.k0(result);
                                break Label_1044;
                            }
                            finally {
                                break Label_1044;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    float n = ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).F$0;
                    o = ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).L$1;
                    final Map<Object, Map<Object, Map<Object, Map<Object, Map<Object, d<Float>>>>>> map;
                    l$0 = (map = (Map<Object, Map<Object, Map<Object, Map<Object, Map<Object, d<Float>>>>>>)((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).L$0);
                    final float n2 = n;
                    o2 = o;
                    Float q3;
                    Float q4;
                    Float q5;
                    Object next;
                    float abs;
                    float n3 = 0.0f;
                    Number n4 = null;
                    Float n5 = null;
                    Iterator iterator = null;
                    Iterator iterator2 = null;
                    SwipeableState swipeableState = null;
                    d<Float> d = null;
                    Object next2;
                    float abs2;
                    float n6 = 0.0f;
                    Float n7;
                    Label_0531_Outer:Block_23_Outer:
                    while (true) {
                        try {
                            while (true) {
                            Label_0531:
                                while (true) {
                                    Label_0515: {
                                        Label_0766:Block_19_Outer:Block_12_Outer:
                                        while (true) {
                                        Label_0464_Outer:
                                            while (true) {
                                                while (true) {
                                                Label_0753:
                                                    while (true) {
                                                        Label_0737: {
                                                            while (true) {
                                                                Label_0678: {
                                                                    while (true) {
                                                                        Block_20: {
                                                                            while (true) {
                                                                                Block_22: {
                                                                                    Block_21: {
                                                                                    Block_17:
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                                Label_0817: {
                                                                                                    try {
                                                                                                        yd.b.k0(result);
                                                                                                        break Label_0817;
                                                                                                    }
                                                                                                    finally {
                                                                                                        l$0 = map;
                                                                                                        n = n2;
                                                                                                        o = o2;
                                                                                                        break Label_1044;
                                                                                                    }
                                                                                                    yd.b.k0(result);
                                                                                                    Label_0308: {
                                                                                                        return hg2.j.a;
                                                                                                    }
                                                                                                    try {
                                                                                                        l$0 = this.a;
                                                                                                        ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).L$0 = this;
                                                                                                        ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).L$1 = o;
                                                                                                        ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).F$0 = n;
                                                                                                        ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).label = 2;
                                                                                                        l$0 = this.a(n, (d<Float>)l$0, (lg2.c<? super j>)i);
                                                                                                        if (l$0 == coroutine_SUSPENDED) {
                                                                                                            return coroutine_SUSPENDED;
                                                                                                        }
                                                                                                        l$0 = this;
                                                                                                        ((SwipeableState<Float>)l$0).h((Float)kotlin.collections.c.W0((Map)o, (Object)new Float(n)));
                                                                                                        q3 = CollectionsKt___CollectionsKt.Q3((Collection)((Map)o).keySet());
                                                                                                        sg2.e.c((Object)q3);
                                                                                                        ((SwipeableState)l$0).k = q3;
                                                                                                        o = CollectionsKt___CollectionsKt.O3((Collection)((Map)o).keySet());
                                                                                                        sg2.e.c(o);
                                                                                                        ((SwipeableState)l$0).l = (float)o;
                                                                                                        return hg2.j.a;
                                                                                                    }
                                                                                                    catch (CancellationException l$0) {
                                                                                                        l$0 = this;
                                                                                                    }
                                                                                                    finally {
                                                                                                        l$0 = this;
                                                                                                        break Label_1044;
                                                                                                    }
                                                                                                }
                                                                                                ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).L$0 = l$0;
                                                                                                ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).L$1 = o;
                                                                                                ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).F$0 = n;
                                                                                                ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).label = 3;
                                                                                                i = ((SwipeableState)l$0).i(n, (ContinuationImpl)i);
                                                                                                if (i == coroutine_SUSPENDED) {
                                                                                                    return coroutine_SUSPENDED;
                                                                                                }
                                                                                                ((SwipeableState<Float>)l$0).h((Float)kotlin.collections.c.W0((Map)o, (Object)new Float(n)));
                                                                                                q4 = CollectionsKt___CollectionsKt.Q3((Collection)((Map)o).keySet());
                                                                                                sg2.e.c((Object)q4);
                                                                                                ((SwipeableState)l$0).k = q4;
                                                                                                o = CollectionsKt___CollectionsKt.O3((Collection)((Map)o).keySet());
                                                                                                sg2.e.c(o);
                                                                                                ((SwipeableState)l$0).l = (float)o;
                                                                                                Label_1110: {
                                                                                                    return hg2.j.a;
                                                                                                }
                                                                                                ((SwipeableState<Float>)l$0).h((Float)kotlin.collections.c.W0((Map)o, (Object)new Float(n)));
                                                                                                q5 = CollectionsKt___CollectionsKt.Q3((Collection)((Map)o).keySet());
                                                                                                sg2.e.c((Object)q5);
                                                                                                ((SwipeableState)l$0).k = q5;
                                                                                                o = CollectionsKt___CollectionsKt.O3((Collection)((Map)o).keySet());
                                                                                                sg2.e.c(o);
                                                                                                ((SwipeableState)l$0).l = (float)o;
                                                                                                Label_0312:
                                                                                                throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
                                                                                                l$0 = next;
                                                                                                n3 = abs;
                                                                                                break Label_0515;
                                                                                                Label_0650:
                                                                                                n = Math.abs(((Number)l$0).floatValue() - ((Number)((SnapshotMutableStateImpl)this.e).getValue()).floatValue());
                                                                                                n4 = (Number)l$0;
                                                                                                break Label_0678;
                                                                                                Label_0547:
                                                                                                iftrue(Label_0582:)(!sg2.e.a(l$0 = ((Map<Object, Number>)l$0).get(((SnapshotMutableStateImpl)this.e).getValue()), this.d()));
                                                                                                break Block_20;
                                                                                                l$0 = androidx.compose.material.b.b((Map)o, ((Map<Object, Object>)l$0).get((Object)n5));
                                                                                                iftrue(Label_0394:)(l$0 == null);
                                                                                                break Label_0464_Outer;
                                                                                                sg2.e.c(l$0);
                                                                                                n = ((Number)l$0).floatValue();
                                                                                                continue Label_0766;
                                                                                                Label_0601:
                                                                                                iterator = ((Map)o).keySet().iterator();
                                                                                                iftrue(Label_0629:)(iterator.hasNext());
                                                                                                break Block_22;
                                                                                                sg2.e.c(l$0);
                                                                                                n = ((Number)l$0).floatValue();
                                                                                                continue Block_19_Outer;
                                                                                            }
                                                                                            Label_0394: {
                                                                                                iterator2 = ((Map)o).keySet().iterator();
                                                                                            }
                                                                                            iftrue(Label_0423:)(iterator2.hasNext());
                                                                                            break Block_17;
                                                                                            Label_0423:
                                                                                            l$0 = iterator2.next();
                                                                                            iftrue(Label_0444:)(iterator2.hasNext());
                                                                                            break Label_0766;
                                                                                            l$0 = androidx.compose.material.b.b((Map)o, l$0);
                                                                                            iftrue(Label_0601:)(l$0 == null);
                                                                                            break Block_21;
                                                                                            this.k = Float.NEGATIVE_INFINITY;
                                                                                            this.l = Float.POSITIVE_INFINITY;
                                                                                            n5 = (Float)((SnapshotMutableStateImpl)this.h).getValue();
                                                                                            swipeableState = null;
                                                                                            d = null;
                                                                                            iftrue(Label_0547:)(n5 == null);
                                                                                            continue Label_0531_Outer;
                                                                                        }
                                                                                        l$0 = d;
                                                                                        continue Label_0531;
                                                                                    }
                                                                                    n = (float)l$0;
                                                                                    continue Label_0766;
                                                                                }
                                                                                l$0 = swipeableState;
                                                                                continue Label_0753;
                                                                                n = (float)l$0;
                                                                                ((SwipeableState$processNewAnchors.SwipeableState$processNewAnchors$1)i).label = 1;
                                                                                iftrue(Label_0308:)(this.i(n, (ContinuationImpl)i) != coroutine_SUSPENDED);
                                                                                return coroutine_SUSPENDED;
                                                                                Label_0326: {
                                                                                    iftrue(Label_1110:)(sg2.e.a(o, l$0));
                                                                                }
                                                                                continue Block_12_Outer;
                                                                            }
                                                                        }
                                                                        l$0 = this.d();
                                                                        continue Block_12_Outer;
                                                                    }
                                                                }
                                                                next2 = iterator.next();
                                                                abs2 = Math.abs(((Number)next2).floatValue() - ((Number)((SnapshotMutableStateImpl)this.e).getValue()).floatValue());
                                                                l$0 = n4;
                                                                n6 = n;
                                                                iftrue(Label_0737:)(Float.compare(n, abs2) <= 0);
                                                                l$0 = next2;
                                                                n6 = abs2;
                                                                break Label_0737;
                                                                next = iterator2.next();
                                                                abs = Math.abs(((Number)next).floatValue() - n5);
                                                                l$0 = n7;
                                                                n3 = n;
                                                                iftrue(Label_0515:)(Float.compare(n, abs) <= 0);
                                                                continue Label_0531_Outer;
                                                            }
                                                            continue Label_0753;
                                                        }
                                                        n4 = (Number)l$0;
                                                        n = n6;
                                                        iftrue(Label_0678:)(iterator.hasNext());
                                                        continue Label_0753;
                                                    }
                                                    Label_0444: {
                                                        n = Math.abs(((Number)l$0).floatValue() - n5);
                                                    }
                                                    n7 = (Float)l$0;
                                                    continue Block_23_Outer;
                                                }
                                                yd.b.k0(result);
                                                iftrue(Label_0326:)(!((Map)l$0).isEmpty());
                                                l$0 = CollectionsKt___CollectionsKt.Q3((Collection)((Map)o).keySet());
                                                sg2.e.c(l$0);
                                                this.k = (float)l$0;
                                                l$0 = CollectionsKt___CollectionsKt.O3((Collection)((Map)o).keySet());
                                                sg2.e.c(l$0);
                                                this.l = (float)l$0;
                                                l$0 = androidx.compose.material.b.b((Map)o, this.d());
                                                iftrue(Label_0312:)(l$0 == null);
                                                continue Label_0464_Outer;
                                            }
                                            n = (float)l$0;
                                            continue Label_0766;
                                        }
                                        continue Label_0531;
                                    }
                                    n7 = (Float)l$0;
                                    n = n3;
                                    iftrue(Label_0464:)(iterator2.hasNext());
                                    continue Label_0531;
                                }
                                Label_0629: {
                                    l$0 = iterator.next();
                                }
                                iftrue(Label_0650:)(iterator.hasNext());
                                continue;
                            }
                        }
                        catch (final CancellationException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public final void h(final T value) {
        ((SnapshotMutableStateImpl)this.c).setValue((Object)value);
    }
    
    public final Object i(final float n, final ContinuationImpl continuationImpl) {
        final Object b = n0.c.b((n0.c)this.p, (p)new SwipeableState$snapInternalToOffset$2(n, this, (lg2.c)null), (lg2.c)continuationImpl);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        return hg2.j.a;
    }
}
