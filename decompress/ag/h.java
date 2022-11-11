// 
// Decompiled by Procyon v0.6.0
// 

package ag;

import android.graphics.drawable.Drawable;
import android.animation.TimeInterpolator;
import android.util.Log;
import u5.m$d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import a4.q0$i;
import android.animation.Animator;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.content.Context;
import java.util.HashMap;
import a4.t1;
import java.util.WeakHashMap;
import tf.j$b;
import tf.j$a;
import tf.n;
import tf.c;
import tf.j;
import android.graphics.RectF;
import a4.q0$g;
import a4.q0;
import android.view.View;
import u5.t;
import xe.a;
import android.os.Build$VERSION;
import u5.m;

public final class h extends m
{
    public static final String L;
    public static final String[] M;
    public static final h.h$d N;
    public static final h.h$d O;
    public int E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public float J;
    public float K;
    
    static {
        L = h.class.getSimpleName();
        M = new String[] { "materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance" };
        N = new h.h$d(new h.h$c(0.0f, 0.25f), new h.h$c(0.0f, 1.0f), new h.h$c(0.0f, 1.0f), new h.h$c(0.0f, 0.75f));
        O = new h.h$d(new h.h$c(0.6f, 0.9f), new h.h$c(0.0f, 1.0f), new h.h$c(0.0f, 0.9f), new h.h$c(0.3f, 0.9f));
    }
    
    public h() {
        this.E = 16908290;
        this.F = -1;
        this.G = -1;
        this.H = 1375731712;
        this.I = (Build$VERSION.SDK_INT >= 28);
        this.J = -1.0f;
        this.K = -1.0f;
        super.i = (TimeInterpolator)a.b;
    }
    
    public static void K(final t t, int resourceId) {
        if (resourceId != -1) {
            final View b = t.b;
            final RectF a = l.a;
            View b2 = b.findViewById(resourceId);
            if (b2 == null) {
                b2 = l.a(resourceId, b);
            }
            t.b = b2;
        }
        else if (t.b.getTag(2131430190) instanceof View) {
            final View b3 = (View)t.b.getTag(2131430190);
            t.b.setTag(2131430190, (Object)null);
            t.b = b3;
        }
        final View b4 = t.b;
        final WeakHashMap<View, t1> a2 = q0.a;
        if (q0$g.c(b4) || b4.getWidth() != 0 || b4.getHeight() != 0) {
            RectF b5;
            if (b4.getParent() == null) {
                final RectF a3 = l.a;
                b5 = new RectF((float)b4.getLeft(), (float)b4.getTop(), (float)b4.getRight(), (float)b4.getBottom());
            }
            else {
                b5 = l.b(b4);
            }
            t.a.put("materialContainerTransition:bounds", b5);
            final HashMap a4 = t.a;
            Object shapeAppearanceModel;
            if (b4.getTag(2131430190) instanceof j) {
                shapeAppearanceModel = b4.getTag(2131430190);
            }
            else {
                final Context context = b4.getContext();
                final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[] { 2130970010 });
                resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    shapeAppearanceModel = new j(j.a(context, resourceId, 0, (c)new tf.a((float)0)));
                }
                else if (b4 instanceof n) {
                    shapeAppearanceModel = ((n)b4).getShapeAppearanceModel();
                }
                else {
                    shapeAppearanceModel = new j(new j$a());
                }
            }
            a4.put("materialContainerTransition:shapeAppearance", ((j)shapeAppearanceModel).e((j$b)new ag.j(b5)));
        }
    }
    
    public final void e(final t t) {
        K(t, this.G);
    }
    
    public final void h(final t t) {
        K(t, this.F);
    }
    
    public final Animator l(final ViewGroup viewGroup, final t t, final t t2) {
        if (t != null) {
            if (t2 != null) {
                final RectF rectF = t.a.get("materialContainerTransition:bounds");
                final j j = t.a.get("materialContainerTransition:shapeAppearance");
                if (rectF != null && j != null) {
                    final RectF rectF2 = t2.a.get("materialContainerTransition:bounds");
                    final j i = t2.a.get("materialContainerTransition:shapeAppearance");
                    if (rectF2 != null && i != null) {
                        final View b = t.b;
                        final View b2 = t2.b;
                        View view;
                        if (b2.getParent() != null) {
                            view = b2;
                        }
                        else {
                            view = b;
                        }
                        View view3;
                        View a;
                        if (this.E == view.getId()) {
                            final View view2 = (View)view.getParent();
                            view3 = view;
                            a = view2;
                        }
                        else {
                            a = l.a(this.E, view);
                            view3 = null;
                        }
                        final RectF b3 = l.b(a);
                        final float n = -b3.left;
                        final float n2 = -b3.top;
                        RectF b4;
                        if (view3 != null) {
                            b4 = l.b(view3);
                            b4.offset(n, n2);
                        }
                        else {
                            b4 = new RectF(0.0f, 0.0f, (float)a.getWidth(), (float)a.getHeight());
                        }
                        rectF.offset(n, n2);
                        rectF2.offset(n, n2);
                        final float width = rectF2.width();
                        final float height = rectF2.height();
                        final float width2 = rectF.width();
                        final float height2 = rectF.height();
                        boolean b5 = false;
                        final boolean b6 = height * width > height2 * width2;
                        final android.support.v4.media.b a2 = super.A;
                        float n3 = this.J;
                        if (n3 == -1.0f) {
                            final WeakHashMap<View, t1> a3 = q0.a;
                            n3 = q0$i.i(b);
                        }
                        float n4 = this.K;
                        if (n4 == -1.0f) {
                            final WeakHashMap<View, t1> a4 = q0.a;
                            n4 = q0$i.i(b2);
                        }
                        final int h = this.H;
                        final boolean k = this.I;
                        Object o;
                        if (b6) {
                            o = ag.b.a;
                        }
                        else {
                            o = ag.b.b;
                        }
                        final float width3 = rectF.width();
                        final float height3 = rectF.height();
                        final float width4 = rectF2.width();
                        final float height4 = rectF2.height();
                        final float n5 = height4 * width3 / width4;
                        final float n6 = width4 * height3 / width3;
                        Label_0455: {
                            if (b6) {
                                if (n5 < height3) {
                                    break Label_0455;
                                }
                            }
                            else if (n6 < height4) {
                                break Label_0455;
                            }
                            b5 = true;
                        }
                        Object o2;
                        if (b5) {
                            o2 = e.a;
                        }
                        else {
                            o2 = e.b;
                        }
                        h.h$d n7 = ag.h.N;
                        final h.h$d o3 = ag.h.O;
                        if (!b6) {
                            n7 = o3;
                        }
                        final h.h$e h$e = new h.h$e(a2, b, rectF, j, n3, b2, rectF2, i, n4, h, b6, k, (ag.a)o, (d)o2, new h.h$d(n7.a, n7.b, n7.c, n7.d));
                        ((Drawable)h$e).setBounds(Math.round(b4.left), Math.round(b4.top), Math.round(b4.right), Math.round(b4.bottom));
                        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
                        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new h$a(h$e));
                        this.b((m$d)new h$b(this, a, h$e, b, b2));
                        return (Animator)ofFloat;
                    }
                    Log.w(h.L, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                else {
                    Log.w(h.L, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
                }
            }
        }
        return null;
    }
    
    public final String[] s() {
        return h.M;
    }
}
