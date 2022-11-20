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
import z0.m0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import ng2.e;
import z0.d;
import o0.i;
import z0.g0;

public final class b extends androidx.compose.material.ripple.b
{
    public b() {
        throw null;
    }
    
    public b(final boolean b, final float n, final g0 g0) {
        super(b, n, g0);
    }
    
    public final h b(final i i, final boolean b, final float n, final g0 g0, final g0 g2, final d d) {
        e.f((Object)i, "interactionSource");
        d.A(331259447);
        d.A(-1737891121);
        Object u;
        ViewParent parent;
        for (u = d.u((m0)AndroidCompositionLocals_androidKt.f); !(u instanceof ViewGroup); u = parent) {
            parent = ((View)u).getParent();
            if (!(parent instanceof View)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Couldn't find a valid parent for ");
                sb.append(u);
                sb.append(". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            e.e((Object)parent, "parent");
        }
        final ViewGroup viewGroup = (ViewGroup)u;
        d.H();
        d.A(1643267286);
        if (((View)viewGroup).isInEditMode()) {
            d.A(-3686552);
            final boolean m = d.m((Object)i);
            final boolean j = d.m((Object)this);
            final Object b2 = d.B();
            CommonRippleIndicationInstance commonRippleIndicationInstance;
            if ((m | j) || (commonRippleIndicationInstance = (CommonRippleIndicationInstance)b2) == d$a.a) {
                commonRippleIndicationInstance = new CommonRippleIndicationInstance(b, n, g0, g2);
                d.w((Object)commonRippleIndicationInstance);
            }
            d.H();
            final CommonRippleIndicationInstance commonRippleIndicationInstance2 = commonRippleIndicationInstance;
            d.H();
            d.H();
            return commonRippleIndicationInstance2;
        }
        d.H();
        final y0.e e = null;
        int n2 = 0;
        final int childCount = viewGroup.getChildCount();
        View child;
        while (true) {
            child = (View)e;
            if (n2 >= childCount) {
                break;
            }
            child = viewGroup.getChildAt(n2);
            if (child instanceof y0.e) {
                break;
            }
            ++n2;
        }
        Object o;
        if ((o = child) == null) {
            final Context context = ((View)viewGroup).getContext();
            ng2.e.e((Object)context, "view.context");
            o = new y0.e(context);
            viewGroup.addView((View)o);
        }
        d.A(-3686095);
        final boolean k = d.m((Object)i);
        final boolean l = d.m((Object)this);
        final boolean m2 = d.m(o);
        final Object b3 = d.B();
        a a;
        if ((k | l | m2) || (a = (a)b3) == d$a.a) {
            a = new a(b, n, g0, g2, (y0.e)o);
            d.w((Object)a);
        }
        d.H();
        final a a2 = a;
        d.H();
        return a2;
    }
}
