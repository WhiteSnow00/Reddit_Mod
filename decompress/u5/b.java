// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import java.util.HashMap;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TypeConverter;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import a4.p0;
import android.view.View;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.graphics.PointF;

public final class b extends m
{
    public static final String[] E;
    public static final b$b F;
    public static final b$c G;
    public static final b$d H;
    public static final b$e I;
    public static final b$f J;
    
    static {
        E = new String[] { "android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY" };
        new Property<Drawable, PointF>(PointF.class) {
            public Rect a = new Rect();
            
            public final Object get(final Object o) {
                ((Drawable)o).copyBounds(this.a);
                final Rect a = this.a;
                return new PointF((float)a.left, (float)a.top);
            }
            
            public final void set(final Object o, final Object o2) {
                final Drawable drawable = (Drawable)o;
                final PointF pointF = (PointF)o2;
                drawable.copyBounds(this.a);
                this.a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
                drawable.setBounds(this.a);
            }
        };
        F = new Property<i, PointF>(PointF.class) {
            public final void set(final Object o, final Object o2) {
                final i i = (i)o;
                final PointF pointF = (PointF)o2;
                i.getClass();
                i.a = Math.round(pointF.x);
                final int round = Math.round(pointF.y);
                i.b = round;
                final int f = i.f + 1;
                i.f = f;
                if (f == i.g) {
                    u5.x.a(i.e, i.a, round, i.c, i.d);
                    i.f = 0;
                    i.g = 0;
                }
            }
        };
        G = new Property<i, PointF>(PointF.class) {
            public final void set(final Object o, final Object o2) {
                final i i = (i)o;
                final PointF pointF = (PointF)o2;
                i.getClass();
                i.c = Math.round(pointF.x);
                final int round = Math.round(pointF.y);
                i.d = round;
                final int g = i.g + 1;
                i.g = g;
                if (i.f == g) {
                    u5.x.a(i.e, i.a, i.b, i.c, round);
                    i.f = 0;
                    i.g = 0;
                }
            }
        };
        H = new Property<View, PointF>(PointF.class) {
            public final void set(final Object o, final Object o2) {
                final View view = (View)o;
                final PointF pointF = (PointF)o2;
                u5.x.a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
            }
        };
        I = new Property<View, PointF>(PointF.class) {
            public final void set(final Object o, final Object o2) {
                final View view = (View)o;
                final PointF pointF = (PointF)o2;
                u5.x.a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
            }
        };
        J = new Property<View, PointF>(PointF.class) {
            public final void set(final Object o, final Object o2) {
                final View view = (View)o;
                final PointF pointF = (PointF)o2;
                final int round = Math.round(pointF.x);
                final int round2 = Math.round(pointF.y);
                u5.x.a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
            }
        };
    }
    
    public final void K(final t t) {
        final View b = t.b;
        final WeakHashMap a = p0.a;
        if (p0.g.c(b) || b.getWidth() != 0 || b.getHeight() != 0) {
            t.a.put("android:changeBounds:bounds", new Rect(b.getLeft(), b.getTop(), b.getRight(), b.getBottom()));
            t.a.put("android:changeBounds:parent", t.b.getParent());
        }
    }
    
    @Override
    public final void e(final t t) {
        this.K(t);
    }
    
    @Override
    public final void h(final t t) {
        this.K(t);
    }
    
    @Override
    public final Animator l(ViewGroup viewGroup, final t t, final t t2) {
        if (t == null || t2 == null) {
            return null;
        }
        final HashMap a = t.a;
        final HashMap a2 = t2.a;
        viewGroup = (ViewGroup)a.get("android:changeBounds:parent");
        final ViewGroup viewGroup2 = a2.get("android:changeBounds:parent");
        if (viewGroup == null || viewGroup2 == null) {
            return null;
        }
        final View b = t2.b;
        final Rect rect = t.a.get("android:changeBounds:bounds");
        final Rect rect2 = t2.a.get("android:changeBounds:bounds");
        final int left = rect.left;
        final int left2 = rect2.left;
        final int top = rect.top;
        final int top2 = rect2.top;
        final int right = rect.right;
        final int right2 = rect2.right;
        final int bottom = rect.bottom;
        final int bottom2 = rect2.bottom;
        final int n = right - left;
        final int n2 = bottom - top;
        final int n3 = right2 - left2;
        final int n4 = bottom2 - top2;
        final Rect rect3 = t.a.get("android:changeBounds:clip");
        final Rect rect4 = t2.a.get("android:changeBounds:clip");
        int n6 = 0;
        Label_0271: {
            if ((n != 0 && n2 != 0) || (n3 != 0 && n4 != 0)) {
                int n5;
                if (left == left2 && top == top2) {
                    n5 = 0;
                }
                else {
                    n5 = 1;
                }
                if (right == right2) {
                    n6 = n5;
                    if (bottom == bottom2) {
                        break Label_0271;
                    }
                }
                n6 = n5 + 1;
            }
            else {
                n6 = 0;
            }
        }
        int n7 = 0;
        Label_0305: {
            if (rect3 == null || rect3.equals((Object)rect4)) {
                n7 = n6;
                if (rect3 != null) {
                    break Label_0305;
                }
                n7 = n6;
                if (rect4 == null) {
                    break Label_0305;
                }
            }
            n7 = n6 + 1;
        }
        if (n7 > 0) {
            u5.x.a(b, left, top, right, bottom);
            Object o;
            if (n7 == 2) {
                if (n == n3 && n2 == n4) {
                    o = ObjectAnimator.ofObject((Object)b, (Property)u5.b.J, (TypeConverter)null, super.A.R((float)left, (float)top, (float)left2, (float)top2));
                }
                else {
                    final i i = new i(b);
                    final ObjectAnimator ofObject = ObjectAnimator.ofObject((Object)i, (Property)u5.b.F, (TypeConverter)null, super.A.R((float)left, (float)top, (float)left2, (float)top2));
                    final ObjectAnimator ofObject2 = ObjectAnimator.ofObject((Object)i, (Property)u5.b.G, (TypeConverter)null, super.A.R((float)right, (float)bottom, (float)right2, (float)bottom2));
                    o = new AnimatorSet();
                    ((AnimatorSet)o).playTogether(new Animator[] { (Animator)ofObject, (Animator)ofObject2 });
                    ((Animator)o).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter(i) {
                        private i mViewBounds = mViewBounds;
                    });
                }
            }
            else if (left == left2 && top == top2) {
                o = ObjectAnimator.ofObject((Object)b, (Property)u5.b.H, (TypeConverter)null, super.A.R((float)right, (float)bottom, (float)right2, (float)bottom2));
            }
            else {
                o = ObjectAnimator.ofObject((Object)b, (Property)u5.b.I, (TypeConverter)null, super.A.R((float)left, (float)top, (float)left2, (float)top2));
            }
            if (b.getParent() instanceof ViewGroup) {
                final ViewGroup viewGroup3 = (ViewGroup)b.getParent();
                u5.v.a(viewGroup3, true);
                this.a((d)new b$h(viewGroup3));
            }
            return (Animator)o;
        }
        return null;
    }
    
    @Override
    public final String[] s() {
        return b.E;
    }
    
    public static final class i
    {
        public int a;
        public int b;
        public int c;
        public int d;
        public View e;
        public int f;
        public int g;
        
        public i(final View e) {
            this.e = e;
        }
    }
}
