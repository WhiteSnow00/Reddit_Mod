// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import java.util.WeakHashMap;
import a4.l0$d;
import a4.l0;
import android.graphics.Paint;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorListener;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

public final class d extends g0
{
    public d() {
    }
    
    public d(final int e) {
        if ((e & 0xFFFFFFFC) == 0x0) {
            super.E = e;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
    
    public final Animator M(final ViewGroup viewGroup, final View view, final t t, final t t2) {
        final float n = 0.0f;
        float floatValue = 0.0f;
        Label_0036: {
            if (t != null) {
                final Float n2 = t.a.get("android:fade:transitionAlpha");
                if (n2 != null) {
                    floatValue = n2;
                    break Label_0036;
                }
            }
            floatValue = 0.0f;
        }
        if (floatValue == 1.0f) {
            floatValue = n;
        }
        return (Animator)this.O(view, floatValue, 1.0f);
    }
    
    public final Animator N(final ViewGroup viewGroup, final View view, final t t) {
        z.a.getClass();
        if (t != null) {
            final Float n = t.a.get("android:fade:transitionAlpha");
            if (n != null) {
                final float floatValue = n;
                return (Animator)this.O(view, floatValue, 0.0f);
            }
        }
        final float floatValue = 1.0f;
        return (Animator)this.O(view, floatValue, 0.0f);
    }
    
    public final ObjectAnimator O(final View view, final float n, final float n2) {
        if (n == n2) {
            return null;
        }
        ((a0)z.a).v4(view, n);
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, (Property)z.b, new float[] { n2 });
        ((Animator)ofFloat).addListener((Animator$AnimatorListener)new a(view));
        ((m)this).a((m.d)new c(view));
        return ofFloat;
    }
    
    public final void h(final t t) {
        this.K(t);
        t.a.put("android:fade:transitionAlpha", ((a0)z.a).u4(t.b));
    }
    
    public static final class a extends AnimatorListenerAdapter
    {
        public final View a;
        public boolean b;
        
        public a(final View a) {
            this.b = false;
            this.a = a;
        }
        
        public final void onAnimationEnd(final Animator animator) {
            ((a0)z.a).v4(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, (Paint)null);
            }
        }
        
        public final void onAnimationStart(final Animator animator) {
            final View a = this.a;
            final WeakHashMap a2 = l0.a;
            if (l0$d.h(a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, (Paint)null);
            }
        }
    }
}
