// 
// Decompiled by Procyon v0.6.0
// 

package h;

import java.util.WeakHashMap;
import java.lang.reflect.Method;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarContextView;
import n3.a;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import a4.p0;
import android.util.Log;
import androidx.appcompat.widget.i1;
import android.graphics.Rect;
import android.view.ViewGroup$MarginLayoutParams;
import a4.a2;
import android.view.View;
import a4.f0;

public final class g implements f0
{
    public final /* synthetic */ f f;
    
    public g(final f f) {
        this.f = f;
    }
    
    @Override
    public final a2 a(final View view, a2 a) {
        final int f = a.f();
        final f f2 = this.f;
        f2.getClass();
        int f3 = a.f();
        final ActionBarContextView c = f2.C;
        final int n = 8;
        int n7;
        int n8;
        if (c != null && ((View)c).getLayoutParams() instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams layoutParams = (ViewGroup$MarginLayoutParams)((View)f2.C).getLayoutParams();
            final boolean shown = ((View)f2.C).isShown();
            int n2 = 1;
            final int n3 = 1;
            boolean b2;
            if (shown) {
                if (f2.k0 == null) {
                    f2.k0 = new Rect();
                    f2.l0 = new Rect();
                }
                final Rect k0 = f2.k0;
                final Rect l0 = f2.l0;
                k0.set(a.d(), a.f(), a.e(), a.c());
                final ViewGroup i = f2.I;
                final Method a2 = i1.a;
                if (a2 != null) {
                    try {
                        a2.invoke(i, k0, l0);
                    }
                    catch (final Exception ex) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", (Throwable)ex);
                    }
                }
                final int top = k0.top;
                final int left = k0.left;
                final int right = k0.right;
                final ViewGroup j = f2.I;
                final WeakHashMap a3 = p0.a;
                final a2 a4 = p0.j.a((View)j);
                int d;
                if (a4 == null) {
                    d = 0;
                }
                else {
                    d = a4.d();
                }
                int e;
                if (a4 == null) {
                    e = 0;
                }
                else {
                    e = a4.e();
                }
                int n4;
                if (layoutParams.topMargin == top && layoutParams.leftMargin == left && layoutParams.rightMargin == right) {
                    n4 = 0;
                }
                else {
                    layoutParams.topMargin = top;
                    layoutParams.leftMargin = left;
                    layoutParams.rightMargin = right;
                    n4 = 1;
                }
                if (top > 0 && f2.K == null) {
                    (f2.K = new View(f2.r)).setVisibility(8);
                    final FrameLayout$LayoutParams frameLayout$LayoutParams = new FrameLayout$LayoutParams(-1, layoutParams.topMargin, 51);
                    frameLayout$LayoutParams.leftMargin = d;
                    frameLayout$LayoutParams.rightMargin = e;
                    f2.I.addView(f2.K, -1, (ViewGroup$LayoutParams)frameLayout$LayoutParams);
                }
                else {
                    final View m = f2.K;
                    if (m != null) {
                        final ViewGroup$MarginLayoutParams layoutParams2 = (ViewGroup$MarginLayoutParams)m.getLayoutParams();
                        final int height = layoutParams2.height;
                        final int topMargin = layoutParams.topMargin;
                        if (height != topMargin || layoutParams2.leftMargin != d || layoutParams2.rightMargin != e) {
                            layoutParams2.height = topMargin;
                            layoutParams2.leftMargin = d;
                            layoutParams2.rightMargin = e;
                            f2.K.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                        }
                    }
                }
                final View k2 = f2.K;
                boolean b;
                if (k2 != null) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (b && k2.getVisibility() != 0) {
                    final View k3 = f2.K;
                    int n5;
                    if ((p0.d.g(k3) & 0x2000) != 0x0) {
                        n5 = n3;
                    }
                    else {
                        n5 = 0;
                    }
                    int backgroundColor;
                    if (n5 != 0) {
                        backgroundColor = a.getColor(f2.r, 2131099654);
                    }
                    else {
                        backgroundColor = a.getColor(f2.r, 2131099653);
                    }
                    k3.setBackgroundColor(backgroundColor);
                }
                int n6 = f3;
                if (!f2.P) {
                    n6 = f3;
                    if (b) {
                        n6 = 0;
                    }
                }
                f3 = n6;
                n2 = n4;
                b2 = b;
            }
            else if (layoutParams.topMargin != 0) {
                layoutParams.topMargin = 0;
                b2 = false;
            }
            else {
                n2 = ((b2 = false) ? 1 : 0);
            }
            n7 = f3;
            n8 = (b2 ? 1 : 0);
            if (n2 != 0) {
                ((View)f2.C).setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                n7 = f3;
                n8 = (b2 ? 1 : 0);
            }
        }
        else {
            n8 = 0;
            n7 = f3;
        }
        final View k4 = f2.K;
        if (k4 != null) {
            int visibility = n;
            if (n8 != 0) {
                visibility = 0;
            }
            k4.setVisibility(visibility);
        }
        if (f != n7) {
            final int d2 = a.d();
            final int e2 = a.e();
            final int c2 = a.c();
            final a2.b b3 = new a2.b(a);
            b3.a.g(q3.f.b(d2, n7, e2, c2));
            a = b3.a();
        }
        return p0.g(view, a);
    }
}
