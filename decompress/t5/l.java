// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import android.view.animation.BaseInterpolator;
import android.animation.Animator;
import java.util.WeakHashMap;
import a4.l0$e;
import a4.l0;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

public final class l extends g0
{
    public static final DecelerateInterpolator H;
    public static final AccelerateInterpolator I;
    public static final l$a J;
    public static final l$b K;
    public static final l$c L;
    public static final l$d M;
    public static final l$e N;
    public static final l$f O;
    public g G;
    
    static {
        H = new DecelerateInterpolator();
        I = new AccelerateInterpolator();
        J = new l$h() {
            public final float b(final ViewGroup viewGroup, final View view) {
                return view.getTranslationX() - ((View)viewGroup).getWidth();
            }
        };
        K = new l$h() {
            public final float b(final ViewGroup viewGroup, final View view) {
                final WeakHashMap a = l0.a;
                final int d = l0$e.d((View)viewGroup);
                boolean b = true;
                if (d != 1) {
                    b = false;
                }
                float n;
                if (b) {
                    n = view.getTranslationX() + ((View)viewGroup).getWidth();
                }
                else {
                    n = view.getTranslationX() - ((View)viewGroup).getWidth();
                }
                return n;
            }
        };
        L = new l$i() {
            public final float a(final ViewGroup viewGroup, final View view) {
                return view.getTranslationY() - ((View)viewGroup).getHeight();
            }
        };
        M = new l$h() {
            public final float b(final ViewGroup viewGroup, final View view) {
                return view.getTranslationX() + ((View)viewGroup).getWidth();
            }
        };
        N = new l$h() {
            public final float b(final ViewGroup viewGroup, final View view) {
                final WeakHashMap a = l0.a;
                final int d = l0$e.d((View)viewGroup);
                boolean b = true;
                if (d != 1) {
                    b = false;
                }
                float n;
                if (b) {
                    n = view.getTranslationX() - ((View)viewGroup).getWidth();
                }
                else {
                    n = view.getTranslationX() + ((View)viewGroup).getWidth();
                }
                return n;
            }
        };
        O = new l$i() {
            public final float a(final ViewGroup viewGroup, final View view) {
                return view.getTranslationY() + ((View)viewGroup).getHeight();
            }
        };
    }
    
    public l() {
        this.G = (g)l.O;
        this.O(80);
    }
    
    public l(final int n) {
        this.G = (g)l.O;
        this.O(n);
    }
    
    public final Animator M(final ViewGroup viewGroup, final View view, final t t, final t t2) {
        if (t2 == null) {
            return null;
        }
        final int[] array = t2.a.get("android:slide:screenPosition");
        return (Animator)v.a(view, t2, array[0], array[1], this.G.b(viewGroup, view), this.G.a(viewGroup, view), view.getTranslationX(), view.getTranslationY(), (BaseInterpolator)l.H, (m)this);
    }
    
    public final Animator N(final ViewGroup viewGroup, final View view, final t t) {
        if (t == null) {
            return null;
        }
        final int[] array = t.a.get("android:slide:screenPosition");
        return (Animator)v.a(view, t, array[0], array[1], view.getTranslationX(), view.getTranslationY(), this.G.b(viewGroup, view), this.G.a(viewGroup, view), (BaseInterpolator)l.I, (m)this);
    }
    
    public final void O(final int g) {
        if (g != 3) {
            if (g != 5) {
                if (g != 48) {
                    if (g != 80) {
                        if (g != 8388611) {
                            if (g != 8388613) {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                            this.G = (g)l.N;
                        }
                        else {
                            this.G = (g)l.K;
                        }
                    }
                    else {
                        this.G = (g)l.O;
                    }
                }
                else {
                    this.G = (g)l.L;
                }
            }
            else {
                this.G = (g)l.M;
            }
        }
        else {
            this.G = (g)l.J;
        }
        final k y = new k();
        y.g = g;
        ((m)this).y = y;
    }
    
    public final void e(final t t) {
        this.K(t);
        final View b = t.b;
        final int[] array = new int[2];
        b.getLocationOnScreen(array);
        t.a.put("android:slide:screenPosition", array);
    }
    
    public final void h(final t t) {
        this.K(t);
        final View b = t.b;
        final int[] array = new int[2];
        b.getLocationOnScreen(array);
        t.a.put("android:slide:screenPosition", array);
    }
    
    public interface g
    {
        float a(final ViewGroup p0, final View p1);
        
        float b(final ViewGroup p0, final View p1);
    }
}
