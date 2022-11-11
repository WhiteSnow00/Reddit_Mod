// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.pointer;

import z0.d$a;
import ah2.f;
import z1.x;
import android.view.MotionEvent;
import zg2.l;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ l<MotionEvent, Boolean> $onTouchEvent;
    public final /* synthetic */ x $requestDisallowInterceptTouchEvent;
    
    public PointerInteropFilter_androidKt$pointerInteropFilter$2(final l<? super MotionEvent, Boolean> $onTouchEvent, final x $requestDisallowInterceptTouchEvent) {
        this.$onTouchEvent = (l<MotionEvent, Boolean>)$onTouchEvent;
        this.$requestDisallowInterceptTouchEvent = $requestDisallowInterceptTouchEvent;
        super(3);
    }
    
    public final d invoke(final d d, final z0.d d2, final int n) {
        f.f((Object)d, "$this$composed");
        d2.A(374375707);
        d2.A(-492369756);
        Object b;
        if ((b = d2.B()) == d$a.a) {
            b = new PointerInteropFilter();
            d2.v(b);
        }
        d2.I();
        final PointerInteropFilter f = (PointerInteropFilter)b;
        final l<MotionEvent, Boolean> $onTouchEvent = this.$onTouchEvent;
        f.getClass();
        ah2.f.f((Object)$onTouchEvent, "<set-?>");
        f.f = $onTouchEvent;
        final x $requestDisallowInterceptTouchEvent = this.$requestDisallowInterceptTouchEvent;
        final x g = f.g;
        if (g != null) {
            g.f = null;
        }
        f.g = $requestDisallowInterceptTouchEvent;
        if ($requestDisallowInterceptTouchEvent != null) {
            $requestDisallowInterceptTouchEvent.f = f;
        }
        d2.I();
        return (d)f;
    }
}
