// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.material;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.foundation.gestures.DraggableKt;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import z0.s;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import tg2.c;
import mj2.b0;
import z0.o0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import u2.b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import ah2.f;
import zg2.p;
import x0.m;
import androidx.compose.foundation.gestures.Orientation;
import o0.j;
import java.util.Map;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003" }, d2 = { "T", "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class SwipeableKt$swipeable$3 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ Map<Float, Object> $anchors;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ j $interactionSource;
    public final /* synthetic */ Orientation $orientation;
    public final /* synthetic */ m $resistance;
    public final /* synthetic */ boolean $reverseDirection;
    public final /* synthetic */ SwipeableState<Object> $state;
    public final /* synthetic */ p<Object, Object, x0.q> $thresholds;
    public final /* synthetic */ float $velocityThreshold;
    
    public SwipeableKt$swipeable$3(final Map<Float, Object> $anchors, final SwipeableState<Object> $state, final Orientation $orientation, final boolean $enabled, final j $interactionSource, final boolean $reverseDirection, final m $resistance, final p<Object, Object, ? extends x0.q> $thresholds, final float $velocityThreshold) {
        this.$anchors = $anchors;
        this.$state = $state;
        this.$orientation = $orientation;
        this.$enabled = $enabled;
        this.$interactionSource = $interactionSource;
        this.$reverseDirection = $reverseDirection;
        this.$resistance = $resistance;
        this.$thresholds = (p<Object, Object, x0.q>)$thresholds;
        this.$velocityThreshold = $velocityThreshold;
        super(3);
    }
    
    public final d invoke(d d, final z0.d d2, int n) {
        f.f((Object)d, "$this$composed");
        d2.A(43594985);
        final boolean empty = this.$anchors.isEmpty();
        n = 1;
        if (!(empty ^ true)) {
            throw new IllegalArgumentException("You must have at least one anchor.".toString());
        }
        if (CollectionsKt___CollectionsKt.h1((Iterable)this.$anchors.values()).size() != this.$anchors.size()) {
            n = 0;
        }
        if (n != 0) {
            final b b = (b)d2.t(CompositionLocalsKt.e);
            final SwipeableState<Object> $state = this.$state;
            final Map<Float, Object> $anchors = this.$anchors;
            $state.getClass();
            f.f((Object)$anchors, "newAnchors");
            if ($state.c().isEmpty()) {
                final Float b2 = androidx.compose.material.b.b((Map)$anchors, $state.d());
                if (b2 == null) {
                    throw new IllegalArgumentException("The initial value must have an associated anchor.".toString());
                }
                ((SnapshotMutableStateImpl<Float>)$state.e).setValue(b2);
                ((SnapshotMutableStateImpl<Float>)$state.g).setValue(b2);
            }
            final Map<Float, Object> $anchors2 = this.$anchors;
            final SwipeableState<Object> $state2 = this.$state;
            s.e($anchors2, $state2, (p)new p<b0, c<? super pg2.j>, Object>(b) {
                public final /* synthetic */ Map<Float, Object> $anchors;
                public final /* synthetic */ b $density;
                public final /* synthetic */ m $resistance;
                public final /* synthetic */ SwipeableState<Object> $state;
                public final /* synthetic */ p<Object, Object, x0.q> $thresholds;
                public final /* synthetic */ float $velocityThreshold;
                public int label;
                
                public final c<pg2.j> create(final Object o, final c<?> c) {
                    return (c<pg2.j>)new p<b0, c<? super pg2.j>, Object>() {
                        public final /* synthetic */ Map<Float, Object> $anchors = this.$anchors;
                        public final /* synthetic */ b $density = this.$density;
                        public final /* synthetic */ m $resistance = this.$resistance;
                        public final /* synthetic */ SwipeableState<Object> $state = this.$state;
                        public final /* synthetic */ p<Object, Object, x0.q> $thresholds = this.$thresholds;
                        public final /* synthetic */ float $velocityThreshold = this.$velocityThreshold;
                        public int label;
                    };
                }
                
                public final Object invoke(final b0 b0, final c<? super pg2.j> c) {
                    return ((SwipeableKt$swipeable$3$3)this.create(b0, c)).invokeSuspend(pg2.j.a);
                }
                
                public final Object invokeSuspend(final Object o) {
                    final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                    final int label = this.label;
                    if (label != 0) {
                        if (label != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aj2.c.Q0(o);
                    }
                    else {
                        aj2.c.Q0(o);
                        final Map c = this.$state.c();
                        final SwipeableState<Object> $state = this.$state;
                        final Map<Float, Object> $anchors = this.$anchors;
                        $state.getClass();
                        f.f((Object)$anchors, "<set-?>");
                        ((SnapshotMutableStateImpl<Map<Float, Object>>)$state.i).setValue($anchors);
                        ((SnapshotMutableStateImpl<m>)this.$state.o).setValue(this.$resistance);
                        final SwipeableState<Object> $state2 = this.$state;
                        final p<Float, Float, Float> value = (p<Float, Float, Float>)new p<Float, Float, Float>() {
                            public final /* synthetic */ Map<Float, Object> $anchors = SwipeableKt$swipeable$3$3.this.$anchors;
                            public final /* synthetic */ b $density = SwipeableKt$swipeable$3$3.this.$density;
                            public final /* synthetic */ p<Object, Object, x0.q> $thresholds = SwipeableKt$swipeable$3$3.this.$thresholds;
                            
                            public final Float invoke(final float n, final float n2) {
                                return ((x0.q)this.$thresholds.invoke(kotlin.collections.c.O1((Map)this.$anchors, (Object)n), kotlin.collections.c.O1((Map)this.$anchors, (Object)n2))).a(this.$density, n, n2);
                            }
                        };
                        $state2.getClass();
                        ((SnapshotMutableStateImpl<SwipeableKt$swipeable$3$3$1>)$state2.m).setValue(value);
                        ((SnapshotMutableStateImpl<Float>)this.$state.n).setValue(Float.valueOf(this.$density.M0(this.$velocityThreshold)));
                        final SwipeableState<Object> $state3 = this.$state;
                        final Map<Float, Object> $anchors2 = this.$anchors;
                        this.label = 1;
                        if ($state3.g(c, (Map)$anchors2, (c)this) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    return pg2.j.a;
                }
            }, d2);
            final boolean booleanValue = ((SnapshotMutableStateImpl<Boolean>)this.$state.d).getValue();
            final SwipeableState<Object> $state3 = this.$state;
            d = DraggableKt.d($state3.p, this.$orientation, this.$enabled, this.$interactionSource, booleanValue, (q)new q<b0, Float, c<? super pg2.j>, Object>() {
                public final /* synthetic */ SwipeableState<Object> $state;
                public /* synthetic */ float F$0;
                private /* synthetic */ Object L$0;
                public int label;
                
                public final Object invoke(final b0 l$0, final float f$0, final c<? super pg2.j> c) {
                    final q<b0, Float, c<? super pg2.j>, Object> q = (q<b0, Float, c<? super pg2.j>, Object>)new q<b0, Float, c<? super pg2.j>, Object>() {
                        public final /* synthetic */ SwipeableState<Object> $state = this.$state;
                        public /* synthetic */ float F$0;
                        private /* synthetic */ Object L$0;
                        public int label;
                    };
                    q.L$0 = l$0;
                    q.F$0 = f$0;
                    return q.invokeSuspend(pg2.j.a);
                }
                
                public final Object invokeSuspend(final Object o) {
                    final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (this.label == 0) {
                        aj2.c.Q0(o);
                        g.i((b0)this.L$0, (CoroutineContext)null, (CoroutineStart)null, (p)new p<b0, c<? super pg2.j>, Object>() {
                            public final /* synthetic */ SwipeableState<Object> $state;
                            public final /* synthetic */ float $velocity;
                            public int label;
                            
                            public final c<pg2.j> create(final Object o, final c<?> c) {
                                return (c<pg2.j>)new p<b0, c<? super pg2.j>, Object>() {
                                    public final /* synthetic */ SwipeableState<Object> $state = this.$state;
                                    public final /* synthetic */ float $velocity = this.$velocity;
                                    public int label;
                                };
                            }
                            
                            public final Object invoke(final b0 b0, final c<? super pg2.j> c) {
                                return ((SwipeableKt$swipeable$3$4$1)this.create(b0, c)).invokeSuspend(pg2.j.a);
                            }
                            
                            public final Object invokeSuspend(final Object o) {
                                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                                final int label = this.label;
                                if (label != 0) {
                                    if (label != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    aj2.c.Q0(o);
                                }
                                else {
                                    aj2.c.Q0(o);
                                    final SwipeableState<Object> $state = this.$state;
                                    final float $velocity = this.$velocity;
                                    this.label = 1;
                                    if ($state.f($velocity, (c)this) == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                }
                                return pg2.j.a;
                            }
                        }, 3);
                        return pg2.j.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }, this.$reverseDirection);
            d2.I();
            return d;
        }
        throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.".toString());
    }
}
