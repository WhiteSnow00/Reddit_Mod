// 
// Decompiled by Procyon v0.6.0
// 

package y0;

import android.content.Context;
import android.view.ViewParent;
import androidx.compose.material.ripple.a;
import androidx.compose.material.ripple.CommonRippleIndicationInstance;
import z0.d$a;
import android.view.View;
import android.view.ViewGroup;
import z0.o0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ah2.f;
import z0.d;
import o0.i;
import z0.h0;

public final class b extends androidx.compose.material.ripple.b
{
    public b() {
        throw null;
    }
    
    public b(final boolean b, final float n, final h0 h0) {
        super(b, n, h0);
    }
    
    public final h b(final i i, final boolean b, final float n, final h0 h0, final h0 h2, final d d) {
        f.f((Object)i, "interactionSource");
        d.A(331259447);
        d.A(-1737891121);
        Object t;
        ViewParent parent;
        for (t = d.t(AndroidCompositionLocals_androidKt.f); !(t instanceof ViewGroup); t = parent) {
            parent = ((View)t).getParent();
            if (!(parent instanceof View)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Couldn't find a valid parent for ");
                sb.append(t);
                sb.append(". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            f.e((Object)parent, "parent");
        }
        final ViewGroup viewGroup = (ViewGroup)t;
        d.I();
        d.A(1643267286);
        if (((View)viewGroup).isInEditMode()) {
            d.A(-3686552);
            final boolean l = d.l(i);
            final boolean j = d.l(this);
            final Object b2 = d.B();
            CommonRippleIndicationInstance commonRippleIndicationInstance;
            if ((l | j) || (commonRippleIndicationInstance = (CommonRippleIndicationInstance)b2) == d$a.a) {
                commonRippleIndicationInstance = new CommonRippleIndicationInstance(b, n, h0, h2);
                d.v(commonRippleIndicationInstance);
            }
            d.I();
            final CommonRippleIndicationInstance commonRippleIndicationInstance2 = commonRippleIndicationInstance;
            d.I();
            d.I();
            return (h)commonRippleIndicationInstance2;
        }
        d.I();
        final e e = null;
        int n2 = 0;
        final int childCount = viewGroup.getChildCount();
        View child;
        while (true) {
            child = (View)e;
            if (n2 >= childCount) {
                break;
            }
            child = viewGroup.getChildAt(n2);
            if (child instanceof e) {
                break;
            }
            ++n2;
        }
        Object o;
        if ((o = child) == null) {
            final Context context = ((View)viewGroup).getContext();
            f.e((Object)context, "view.context");
            o = new e(context);
            viewGroup.addView((View)o);
        }
        d.A(-3686095);
        final boolean k = d.l(i);
        final boolean m = d.l(this);
        final boolean l2 = d.l(o);
        final Object b3 = d.B();
        a a;
        if ((k | m | l2) || (a = (a)b3) == d$a.a) {
            a = new a(b, n, h0, h2, (e)o);
            d.v(a);
        }
        d.I();
        final a a2 = a;
        d.I();
        return (h)a2;
    }
}
