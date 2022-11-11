// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.animation.core;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Ref$BooleanRef;
import bg.d;
import l0.e;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import l0.a;
import kotlin.Metadata;
import l0.i;
import l0.b;
import lg2.c;
import rg2.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@" }, d2 = { "T", "Ll0/i;", "V", "Ll0/b;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@mg2.c(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", l = { 291 }, m = "invokeSuspend")
final class Animatable$runAnimation$2 extends SuspendLambda implements l<c<? super b<Object, i>>, Object>
{
    public final /* synthetic */ a<Object, i> $animation;
    public final /* synthetic */ l<Animatable<Object, i>, j> $block;
    public final /* synthetic */ Object $initialVelocity;
    public final /* synthetic */ long $startTime;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Animatable<Object, i> this$0;
    
    public Animatable$runAnimation$2(final Animatable<Object, i> this$0, final Object $initialVelocity, final a<Object, i> $animation, final long $startTime, final l<? super Animatable<Object, i>, j> $block, final c<? super Animatable$runAnimation$2> c) {
        this.this$0 = this$0;
        this.$initialVelocity = $initialVelocity;
        this.$animation = $animation;
        this.$startTime = $startTime;
        this.$block = (l<Animatable<Object, i>, j>)$block;
        super(1, (c<Object>)c);
    }
    
    public final c<j> create(final c<?> c) {
        return (c<j>)new Animatable$runAnimation$2(this.this$0, this.$initialVelocity, this.$animation, this.$startTime, this.$block, (c<? super Animatable$runAnimation$2>)c);
    }
    
    @Override
    public final Object invoke(final c<? super b<Object, i>> c) {
        return ((Animatable$runAnimation$2)this.create(c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object l$0) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        Label_0054: {
            if (label == 0) {
                break Label_0054;
            }
            Label_0044: {
                if (label != 1) {
                    break Label_0044;
                }
                Object l$2 = this.L$1;
                final e e = (e)this.L$0;
                try {
                    yd.b.k0(l$0);
                    l$0 = e;
                    AnimationEndReason animationEndReason = null;
                    Label_0290: {
                        if (((Ref$BooleanRef)l$2).element) {
                            animationEndReason = AnimationEndReason.BoundReached;
                        }
                        else {
                            animationEndReason = AnimationEndReason.Finished;
                        }
                    }
                    final Animatable<Object, i> this$0 = this.this$0;
                    final e c = this$0.c;
                    c.h.d();
                    c.i = Long.MIN_VALUE;
                    ((SnapshotMutableStateImpl)this$0.d).setValue((Object)Boolean.FALSE);
                    l$0 = new b((e)l$0, animationEndReason);
                    return l$0;
                    yd.b.k0(l$0);
                    final Animatable<Object, i> this$2 = this.this$0;
                    final e c2 = this$2.c;
                    final i h = this$2.a.a().invoke(this.$initialVelocity);
                    c2.getClass();
                    sg2.e.f((Object)h, "<set-?>");
                    c2.h = h;
                    ((SnapshotMutableStateImpl)this.this$0.e).setValue(this.$animation.f());
                    ((SnapshotMutableStateImpl)this.this$0.d).setValue((Object)Boolean.TRUE);
                    final e c3 = this.this$0.c;
                    l$0 = new e(c3.f, c3.getValue(), bg.d.P(c3.h), c3.i, Long.MIN_VALUE, c3.k);
                    l$2 = new Ref$BooleanRef();
                    final a<Object, i> $animation = this.$animation;
                    final long $startTime = this.$startTime;
                    final Animatable$runAnimation$2$1 animatable$runAnimation$2$1 = new Animatable$runAnimation$2$1((Animatable)this.this$0, (e)l$0, (l)this.$block, (Ref$BooleanRef)l$2);
                    this.L$0 = l$0;
                    this.L$1 = l$2;
                    this.label = 1;
                    iftrue(Label_0290:)(SuspendAnimationKt.a((e)l$0, (a)$animation, $startTime, (l)animatable$runAnimation$2$1, (c)this) != coroutine_SUSPENDED);
                    return coroutine_SUSPENDED;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final CancellationException ex) {
                    final Animatable<Object, i> this$3 = this.this$0;
                    final e c4 = this$3.c;
                    c4.h.d();
                    c4.i = Long.MIN_VALUE;
                    ((SnapshotMutableStateImpl)this$3.d).setValue((Object)Boolean.FALSE);
                    throw ex;
                }
            }
        }
    }
}
