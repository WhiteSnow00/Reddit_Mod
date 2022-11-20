// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.pointer;

import z0.d$a;
import androidx.compose.runtime.ComposerKt;
import ng2.e;
import z1.z;
import android.view.MotionEvent;
import mg2.l;
import kotlin.Metadata;
import j1.d;
import mg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final l<MotionEvent, Boolean> $onTouchEvent;
    public final z $requestDisallowInterceptTouchEvent;
    
    public PointerInteropFilter_androidKt$pointerInteropFilter$2(final l<? super MotionEvent, Boolean> $onTouchEvent, final z $requestDisallowInterceptTouchEvent) {
        this.$onTouchEvent = (l<MotionEvent, Boolean>)$onTouchEvent;
        this.$requestDisallowInterceptTouchEvent = $requestDisallowInterceptTouchEvent;
        super(3);
    }
    
    public final d invoke(final d d, final z0.d d2, final int n) {
        e.f((Object)d, "$this$composed");
        d2.A(374375707);
        final q a = ComposerKt.a;
        d2.A(-492369756);
        Object b;
        if ((b = d2.B()) == d$a.a) {
            b = new PointerInteropFilter();
            d2.w(b);
        }
        d2.H();
        final PointerInteropFilter f = (PointerInteropFilter)b;
        final l<MotionEvent, Boolean> $onTouchEvent = this.$onTouchEvent;
        f.getClass();
        e.f((Object)$onTouchEvent, "<set-?>");
        f.f = $onTouchEvent;
        final z $requestDisallowInterceptTouchEvent = this.$requestDisallowInterceptTouchEvent;
        final z g = f.g;
        if (g != null) {
            g.f = null;
        }
        f.g = $requestDisallowInterceptTouchEvent;
        if ($requestDisallowInterceptTouchEvent != null) {
            $requestDisallowInterceptTouchEvent.f = f;
        }
        d2.H();
        return (d)f;
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2, final Object o3) {
        return this.invoke((d)o, (z0.d)o2, ((Number)o3).intValue());
    }
}
