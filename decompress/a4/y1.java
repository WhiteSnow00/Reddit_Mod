// 
// Decompiled by Procyon v0.6.0
// 

package a4;

import android.animation.TimeInterpolator;
import java.util.HashMap;
import java.util.ArrayList;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.Interpolator;
import android.view.WindowInsetsAnimation;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Collections;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import java.util.Objects;
import java.util.WeakHashMap;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation$Bounds;
import q3.f;
import android.os.Build$VERSION;
import android.view.animation.DecelerateInterpolator;

public final class y1
{
    public e a;
    
    public y1(final int n, final DecelerateInterpolator decelerateInterpolator, final long n2) {
        if (Build$VERSION.SDK_INT >= 30) {
            this.a = (e)new d(n, decelerateInterpolator, n2);
        }
        else {
            this.a = (e)new c(n, decelerateInterpolator, n2);
        }
    }
    
    public final int a() {
        return this.a.d();
    }
    
    public static final class a
    {
        public final f a;
        public final f b;
        
        public a(final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
            this.a = d.h(windowInsetsAnimation$Bounds);
            this.b = d.g(windowInsetsAnimation$Bounds);
        }
        
        public a(final f a, final f b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("Bounds{lower=");
            r.append(this.a);
            r.append(" upper=");
            r.append(this.b);
            r.append("}");
            return r.toString();
        }
    }
    
    public abstract static class b
    {
        public WindowInsets f;
        public final int g;
        
        public b(final int g) {
            this.g = g;
        }
        
        public abstract void b(final y1 p0);
        
        public abstract void c(final y1 p0);
        
        public abstract a2 d(final a2 p0, final List<y1> p1);
        
        public y1.a e(final y1 y1, final y1.a a) {
            return a;
        }
    }
    
    public static final class c extends e
    {
        public c(final int n, final DecelerateInterpolator decelerateInterpolator, final long n2) {
            super(n, decelerateInterpolator, n2);
        }
        
        public static void f(final View view, final y1 y1) {
            final b k = k(view);
            if (k != null) {
                k.b(y1);
                if (k.g == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                    f(viewGroup.getChildAt(i), y1);
                }
            }
        }
        
        public static void g(final View view, final y1 y1, final WindowInsets f, final boolean b) {
            final b k = k(view);
            int i = 0;
            boolean b2 = b;
            if (k != null) {
                k.f = f;
                if (!(b2 = b)) {
                    k.c(y1);
                    b2 = (k.g == 0);
                }
            }
            if (view instanceof ViewGroup) {
                for (ViewGroup viewGroup = (ViewGroup)view; i < viewGroup.getChildCount(); ++i) {
                    g(viewGroup.getChildAt(i), y1, f, b2);
                }
            }
        }
        
        public static void h(final View view, final a2 a2, final List<y1> list) {
            final b k = k(view);
            a2 d = a2;
            if (k != null) {
                d = k.d(a2, list);
                if (k.g == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                    h(viewGroup.getChildAt(i), d, list);
                }
            }
        }
        
        public static void i(final View view, final y1 y1, final y1.a a) {
            final b k = k(view);
            if (k != null) {
                k.e(y1, a);
                if (k.g == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                    i(viewGroup.getChildAt(i), y1, a);
                }
            }
        }
        
        public static WindowInsets j(final View view, final WindowInsets windowInsets) {
            if (view.getTag(2131431626) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        
        public static b k(final View view) {
            final Object tag = view.getTag(2131431635);
            b a;
            if (tag instanceof a) {
                a = ((a)tag).a;
            }
            else {
                a = null;
            }
            return a;
        }
        
        public static final class a implements View$OnApplyWindowInsetsListener
        {
            public final b a;
            public a2 b;
            
            public a(final View view, final b a) {
                this.a = a;
                final WeakHashMap<View, t1> a2 = q0.a;
                final a2 a3 = q0$j.a(view);
                a2 a4;
                if (a3 != null) {
                    a4 = new a2$b(a3).a();
                }
                else {
                    a4 = null;
                }
                this.b = a4;
            }
            
            public final WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.b = a2.j(view, windowInsets);
                    return c.j(view, windowInsets);
                }
                final a2 j = a2.j(view, windowInsets);
                if (this.b == null) {
                    final WeakHashMap<View, t1> a = q0.a;
                    this.b = q0$j.a(view);
                }
                if (this.b == null) {
                    this.b = j;
                    return c.j(view, windowInsets);
                }
                final b k = c.k(view);
                if (k != null && Objects.equals(k.f, windowInsets)) {
                    return c.j(view, windowInsets);
                }
                final a2 b = this.b;
                int i = 1;
                int n = 0;
                while (i <= 256) {
                    int n2 = n;
                    if (!j.a(i).equals((Object)b.a(i))) {
                        n2 = (n | i);
                    }
                    i <<= 1;
                    n = n2;
                }
                if (n == 0) {
                    return c.j(view, windowInsets);
                }
                final a2 b2 = this.b;
                final y1 y1 = new y1(n, new DecelerateInterpolator(), 160L);
                y1.a.e(0.0f);
                final ValueAnimator setDuration = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f }).setDuration(y1.a.a());
                final f a2 = j.a(n);
                final f a3 = b2.a(n);
                final y1.a a4 = new y1.a(f.b(Math.min(a2.a, a3.a), Math.min(a2.b, a3.b), Math.min(a2.c, a3.c), Math.min(a2.d, a3.d)), f.b(Math.max(a2.a, a3.a), Math.max(a2.b, a3.b), Math.max(a2.c, a3.c), Math.max(a2.d, a3.d)));
                c.g(view, y1, windowInsets, false);
                setDuration.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                    public final void onAnimationUpdate(final ValueAnimator valueAnimator) {
                        y1.a.e(valueAnimator.getAnimatedFraction());
                        final a2 b = j;
                        final a2 c = b2;
                        final float c2 = y1.a.c();
                        final int d = n;
                        final a2$b a2$b = new a2$b(b);
                        for (int i = 1; i <= 256; i <<= 1) {
                            if ((d & i) == 0x0) {
                                a2$b.a.c(i, b.a(i));
                            }
                            else {
                                final f a = b.a(i);
                                final f a2 = c.a(i);
                                final float n = (float)(a.a - a2.a);
                                final float n2 = 1.0f - c2;
                                a2$b.a.c(i, a4.a2.g(a, (int)(n * n2 + 0.5), (int)((a.b - a2.b) * n2 + 0.5), (int)((a.c - a2.c) * n2 + 0.5), (int)((a.d - a2.d) * n2 + 0.5)));
                            }
                        }
                        y1.c.h(view, a2$b.a(), Collections.singletonList(y1));
                    }
                });
                ((Animator)setDuration).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(final Animator animator) {
                        y1.a.e(1.0f);
                        c.f(view, y1);
                    }
                });
                j0.a(view, (Runnable)new Runnable() {
                    @Override
                    public final void run() {
                        c.i(view, y1, a4);
                        setDuration.start();
                    }
                });
                this.b = j;
                return c.j(view, windowInsets);
            }
        }
    }
    
    public static final class d extends e
    {
        public final WindowInsetsAnimation e;
        
        public d(final int n, final DecelerateInterpolator decelerateInterpolator, final long n2) {
            this(new WindowInsetsAnimation(n, (Interpolator)decelerateInterpolator, n2));
        }
        
        public d(final WindowInsetsAnimation e) {
            super(0, null, 0L);
            this.e = e;
        }
        
        public static WindowInsetsAnimation$Bounds f(final y1.a a) {
            return new WindowInsetsAnimation$Bounds(a.a.d(), a.b.d());
        }
        
        public static f g(final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
            return f.c(windowInsetsAnimation$Bounds.getUpperBound());
        }
        
        public static f h(final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
            return f.c(windowInsetsAnimation$Bounds.getLowerBound());
        }
        
        @Override
        public final long a() {
            return this.e.getDurationMillis();
        }
        
        @Override
        public final float b() {
            return this.e.getFraction();
        }
        
        @Override
        public final float c() {
            return this.e.getInterpolatedFraction();
        }
        
        @Override
        public final int d() {
            return this.e.getTypeMask();
        }
        
        @Override
        public final void e(final float fraction) {
            this.e.setFraction(fraction);
        }
        
        public static final class a extends WindowInsetsAnimation$Callback
        {
            public final b a;
            public List<y1> b;
            public ArrayList<y1> c;
            public final HashMap<WindowInsetsAnimation, y1> d;
            
            public a(final b a) {
                super(a.g);
                this.d = new HashMap<WindowInsetsAnimation, y1>();
                this.a = a;
            }
            
            public final y1 a(final WindowInsetsAnimation windowInsetsAnimation) {
                y1 y1;
                if ((y1 = this.d.get(windowInsetsAnimation)) == null) {
                    y1 = new y1(0, null, 0L);
                    if (Build$VERSION.SDK_INT >= 30) {
                        y1.a = (e)new d(windowInsetsAnimation);
                    }
                    this.d.put(windowInsetsAnimation, y1);
                }
                return y1;
            }
            
            public final void onEnd(final WindowInsetsAnimation windowInsetsAnimation) {
                this.a.b(this.a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }
            
            public final void onPrepare(final WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(this.a(windowInsetsAnimation));
            }
            
            public final WindowInsets onProgress(final WindowInsets windowInsets, final List<WindowInsetsAnimation> list) {
                final ArrayList<y1> c = this.c;
                if (c == null) {
                    final ArrayList c2 = new ArrayList(list.size());
                    this.c = c2;
                    this.b = (List<y1>)Collections.unmodifiableList((List<?>)c2);
                }
                else {
                    c.clear();
                }
                int size = list.size();
                while (--size >= 0) {
                    final WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    final y1 a = this.a(windowInsetsAnimation);
                    a.a.e(windowInsetsAnimation.getFraction());
                    this.c.add(a);
                }
                return this.a.d(a2.j((View)null, windowInsets), this.b).i();
            }
            
            public final WindowInsetsAnimation$Bounds onStart(final WindowInsetsAnimation windowInsetsAnimation, final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
                final y1.a e = this.a.e(this.a(windowInsetsAnimation), new y1.a(windowInsetsAnimation$Bounds));
                e.getClass();
                return y1.d.f(e);
            }
        }
    }
    
    public static class e
    {
        public final int a;
        public float b;
        public final Interpolator c;
        public final long d;
        
        public e(final int a, final DecelerateInterpolator c, final long d) {
            this.a = a;
            this.c = (Interpolator)c;
            this.d = d;
        }
        
        public long a() {
            return this.d;
        }
        
        public float b() {
            return this.b;
        }
        
        public float c() {
            final Interpolator c = this.c;
            if (c != null) {
                return ((TimeInterpolator)c).getInterpolation(this.b);
            }
            return this.b;
        }
        
        public int d() {
            return this.a;
        }
        
        public void e(final float b) {
            this.b = b;
        }
    }
}
