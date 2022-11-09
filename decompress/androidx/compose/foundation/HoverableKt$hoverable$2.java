// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import mj2.b0;
import z0.d$a$a;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import z0.p;
import a80.a;
import z0.l;
import a2.b;
import z0.s;
import kotlin.coroutines.EmptyCoroutineContext;
import z0.d$a;
import o0.g;
import o0.h;
import o0.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import z0.h0;
import o0.j;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class HoverableKt$hoverable$2 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ j $interactionSource;
    
    public HoverableKt$hoverable$2(final j $interactionSource, final boolean $enabled) {
        this.$interactionSource = $interactionSource;
        this.$enabled = $enabled;
        super(3);
    }
    
    public static final Object access$invoke$emitEnter(final j j, h0 l$0, final c c) {
        Object o = null;
        Label_0049: {
            if (c instanceof HoverableKt$hoverable$2$invoke$emitEnter$1) {
                final HoverableKt$hoverable$2$invoke$emitEnter$1 hoverableKt$hoverable$2$invoke$emitEnter$1 = (HoverableKt$hoverable$2$invoke$emitEnter$1)c;
                final int label = hoverableKt$hoverable$2$invoke$emitEnter$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    hoverableKt$hoverable$2$invoke$emitEnter$1.label = label + Integer.MIN_VALUE;
                    o = hoverableKt$hoverable$2$invoke$emitEnter$1;
                    break Label_0049;
                }
            }
            o = new HoverableKt$hoverable$2$invoke$emitEnter$1((c<? super HoverableKt$hoverable$2$invoke$emitEnter$1>)c);
        }
        final Object result = ((HoverableKt$hoverable$2$invoke$emitEnter$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((HoverableKt$hoverable$2$invoke$emitEnter$1)o).label;
        Object value;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            value = ((HoverableKt$hoverable$2$invoke$emitEnter$1)o).L$1;
            l$0 = (h0)((HoverableKt$hoverable$2$invoke$emitEnter$1)o).L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            if (l$0.getValue() != null) {
                return pg2.j.a;
            }
            final f l$2 = new f();
            ((HoverableKt$hoverable$2$invoke$emitEnter$1)o).L$0 = l$0;
            ((HoverableKt$hoverable$2$invoke$emitEnter$1)o).L$1 = l$2;
            ((HoverableKt$hoverable$2$invoke$emitEnter$1)o).label = 1;
            if (j.a((h)l$2, (c<? super pg2.j>)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            value = l$2;
        }
        l$0.setValue(value);
        return pg2.j.a;
    }
    
    public static final Object access$invoke$emitExit(h0 l$0, final j j, final c c) {
        HoverableKt$hoverable$2$invoke$emitExit$1 hoverableKt$hoverable$2$invoke$emitExit$2 = null;
        Label_0049: {
            if (c instanceof HoverableKt$hoverable$2$invoke$emitExit$1) {
                final HoverableKt$hoverable$2$invoke$emitExit$1 hoverableKt$hoverable$2$invoke$emitExit$1 = (HoverableKt$hoverable$2$invoke$emitExit$1)c;
                final int label = hoverableKt$hoverable$2$invoke$emitExit$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    hoverableKt$hoverable$2$invoke$emitExit$1.label = label + Integer.MIN_VALUE;
                    hoverableKt$hoverable$2$invoke$emitExit$2 = hoverableKt$hoverable$2$invoke$emitExit$1;
                    break Label_0049;
                }
            }
            hoverableKt$hoverable$2$invoke$emitExit$2 = new HoverableKt$hoverable$2$invoke$emitExit$1((c<? super HoverableKt$hoverable$2$invoke$emitExit$1>)c);
        }
        final Object result = hoverableKt$hoverable$2$invoke$emitExit$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = hoverableKt$hoverable$2$invoke$emitExit$2.label;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l$0 = (h0)hoverableKt$hoverable$2$invoke$emitExit$2.L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            final f f = (f)l$0.getValue();
            if (f == null) {
                return pg2.j.a;
            }
            final g g = new g(f);
            hoverableKt$hoverable$2$invoke$emitExit$2.L$0 = l$0;
            hoverableKt$hoverable$2$invoke$emitExit$2.label = 1;
            if (j.a((h)g, (c<? super pg2.j>)hoverableKt$hoverable$2$invoke$emitExit$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        l$0.setValue(null);
        return pg2.j.a;
    }
    
    public static final void access$invoke$tryEmitExit(final h0 h0, final j j) {
        final f f = (f)h0.getValue();
        if (f != null) {
            j.b((h)new g(f));
            h0.setValue(null);
        }
    }
    
    public final d invoke(d o, final z0.d d, final int n) {
        ah2.f.f(o, "$this$composed");
        d.A(1294013553);
        d.A(773894976);
        d.A(-492369756);
        final Object b = d.B();
        final d$a$a a = d$a.a;
        Object p3 = b;
        if (b == a) {
            p3 = a2.b.p(s.i(EmptyCoroutineContext.INSTANCE, d), d);
        }
        d.I();
        final b0 f = ((l)p3).f;
        d.I();
        d.A(-492369756);
        Object o2;
        if ((o2 = d.B()) == a) {
            o2 = a80.a.n0(null);
            d.v(o2);
        }
        d.I();
        final h0 h0 = (h0)o2;
        final j $interactionSource = this.$interactionSource;
        s.c($interactionSource, (zg2.l)new zg2.l<z0.q, p>() {
            public final p invoke(final z0.q q) {
                ah2.f.f((Object)q, "$this$DisposableEffect");
                return new p() {
                    @Override
                    public final void dispose() {
                        HoverableKt$hoverable$2.access$invoke$tryEmitExit(h0, $interactionSource);
                    }
                };
            }
        }, d);
        s.f(this.$enabled, (zg2.p)new HoverableKt$hoverable$2$2(this.$enabled, h0, this.$interactionSource, (c)null), d);
        if (this.$enabled) {
            final d.a f2 = j1.d.a.f;
            final j $interactionSource2 = this.$interactionSource;
            o = SuspendingPointerInputFilterKt.b((d)f2, (Object)$interactionSource2, (zg2.p)new HoverableKt$hoverable$2$3(f, $interactionSource2, h0, (c)null));
        }
        else {
            o = j1.d.a.f;
        }
        d.I();
        return (d)o;
    }
}
