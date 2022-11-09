// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.view.ViewGroup;
import android.animation.LayoutTransition;
import android.view.ViewParent;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import a4.p0;
import a4.a2;
import android.view.WindowInsets;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Iterator;
import android.content.res.TypedArray;
import android.os.Bundle;
import ak0.m;
import ah2.f;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View$OnApplyWindowInsetsListener;
import java.util.ArrayList;
import android.widget.FrameLayout;

public final class u extends FrameLayout
{
    public final ArrayList f;
    public final ArrayList g;
    public View$OnApplyWindowInsetsListener h;
    public boolean i;
    
    public u(final Context context, final AttributeSet set, final d0 d0) {
        ah2.f.f((Object)context, "context");
        ah2.f.f((Object)set, "attrs");
        ah2.f.f((Object)d0, "fm");
        super(context, set);
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.i = true;
        final String classAttribute = set.getClassAttribute();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, pj2.u.i, 0, 0);
        String string = classAttribute;
        if (classAttribute == null) {
            string = obtainStyledAttributes.getString(0);
        }
        final String string2 = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        final int id = ((View)this).getId();
        final Fragment d2 = d0.D(id);
        if (string != null && d2 == null) {
            if (id == -1) {
                String l;
                if (string2 != null) {
                    l = m.l(" with tag ", string2);
                }
                else {
                    l = "";
                }
                throw new IllegalStateException(a40.f.n("FragmentContainerView must have an android:id to add Fragment ", string, l));
            }
            final w i = d0.I();
            context.getClassLoader();
            final Fragment instantiate = Fragment.instantiate(((d0.d0$d)i).b.v.g, string, (Bundle)null);
            ah2.f.e((Object)instantiate, "fm.fragmentFactory.insta\u2026ontext.classLoader, name)");
            instantiate.onInflate(context, set, (Bundle)null);
            final a a = new a(d0);
            a.p = true;
            instantiate.mContainer = (ViewGroup)this;
            a.e(((View)this).getId(), instantiate, string2, 1);
            if (a.g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            a.h = false;
            a.q.A((d0.o)a, true);
        }
        for (final l0 l2 : d0.c.e()) {
            final Fragment c = l2.c;
            if (c.mContainerId == ((View)this).getId()) {
                final View mView = c.mView;
                if (mView == null || mView.getParent() != null) {
                    continue;
                }
                c.mContainer = (ViewGroup)this;
                l2.b();
            }
        }
    }
    
    public final void a(final View view) {
        if (this.g.contains(view)) {
            this.f.add(view);
        }
    }
    
    public final void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        ah2.f.f((Object)view, "child");
        final Object tag = view.getTag(2131429157);
        Fragment fragment;
        if (tag instanceof Fragment) {
            fragment = (Fragment)tag;
        }
        else {
            fragment = null;
        }
        if (fragment != null) {
            super.addView(view, n, viewGroup$LayoutParams);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    public final WindowInsets dispatchApplyWindowInsets(final WindowInsets windowInsets) {
        ah2.f.f((Object)windowInsets, "insets");
        final a2 j = a2.j(null, windowInsets);
        final View$OnApplyWindowInsetsListener h = this.h;
        a2 a2;
        if (h != null) {
            final WindowInsets onApplyWindowInsets = h.onApplyWindowInsets((View)this, windowInsets);
            ah2.f.e((Object)onApplyWindowInsets, "onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)");
            a2 = a4.a2.j(null, onApplyWindowInsets);
        }
        else {
            a2 = p0.g((View)this, j);
        }
        ah2.f.e((Object)a2, "if (applyWindowInsetsLis\u2026, insetsCompat)\n        }");
        if (!a2.a.n()) {
            for (int i = 0; i < ((ViewGroup)this).getChildCount(); ++i) {
                p0.b(((ViewGroup)this).getChildAt(i), a2);
            }
        }
        return windowInsets;
    }
    
    public final void dispatchDraw(final Canvas canvas) {
        ah2.f.f((Object)canvas, "canvas");
        if (this.i) {
            final Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                super.drawChild(canvas, (View)iterator.next(), ((View)this).getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }
    
    public final boolean drawChild(final Canvas canvas, final View view, final long n) {
        ah2.f.f((Object)canvas, "canvas");
        ah2.f.f((Object)view, "child");
        return (!this.i || !(this.f.isEmpty() ^ true) || !this.f.contains(view)) && super.drawChild(canvas, view, n);
    }
    
    public final void endViewTransition(final View view) {
        ah2.f.f((Object)view, "view");
        this.g.remove(view);
        if (this.f.remove(view)) {
            this.i = true;
        }
        super.endViewTransition(view);
    }
    
    public final <F extends Fragment> F getFragment() {
        final r r = null;
        Object o = this;
        while (true) {
            while (o != null) {
                final Object tag = ((View)o).getTag(2131429157);
                Fragment fragment;
                if (tag instanceof Fragment) {
                    fragment = (Fragment)tag;
                }
                else {
                    fragment = null;
                }
                if (fragment != null) {
                    d0 d0;
                    if (fragment != null) {
                        if (!fragment.isAdded()) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("The Fragment ");
                            sb.append(fragment);
                            sb.append(" that owns View ");
                            sb.append(this);
                            sb.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
                            throw new IllegalStateException(sb.toString());
                        }
                        d0 = fragment.getChildFragmentManager();
                    }
                    else {
                        Context context = ((View)this).getContext();
                        r r2;
                        while (true) {
                            r2 = r;
                            if (!(context instanceof ContextWrapper)) {
                                break;
                            }
                            if (context instanceof r) {
                                r2 = (r)context;
                                break;
                            }
                            context = ((ContextWrapper)context).getBaseContext();
                        }
                        if (r2 == null) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("View ");
                            sb2.append(this);
                            sb2.append(" is not within a subclass of FragmentActivity.");
                            throw new IllegalStateException(sb2.toString());
                        }
                        d0 = r2.getSupportFragmentManager();
                    }
                    return (F)d0.D(((View)this).getId());
                }
                final ViewParent parent = ((View)o).getParent();
                if (parent instanceof View) {
                    o = parent;
                }
                else {
                    o = null;
                }
            }
            Fragment fragment = null;
            continue;
        }
    }
    
    public final WindowInsets onApplyWindowInsets(final WindowInsets windowInsets) {
        ah2.f.f((Object)windowInsets, "insets");
        return windowInsets;
    }
    
    public final void removeAllViewsInLayout() {
        for (int n = ((ViewGroup)this).getChildCount() - 1; -1 < n; --n) {
            final View child = ((ViewGroup)this).getChildAt(n);
            ah2.f.e((Object)child, "view");
            this.a(child);
        }
        super.removeAllViewsInLayout();
    }
    
    public final void removeView(final View view) {
        ah2.f.f((Object)view, "view");
        this.a(view);
        super.removeView(view);
    }
    
    public final void removeViewAt(final int n) {
        final View child = ((ViewGroup)this).getChildAt(n);
        ah2.f.e((Object)child, "view");
        this.a(child);
        super.removeViewAt(n);
    }
    
    public final void removeViewInLayout(final View view) {
        ah2.f.f((Object)view, "view");
        this.a(view);
        super.removeViewInLayout(view);
    }
    
    public final void removeViews(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final View child = ((ViewGroup)this).getChildAt(i);
            ah2.f.e((Object)child, "view");
            this.a(child);
        }
        super.removeViews(n, n2);
    }
    
    public final void removeViewsInLayout(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            final View child = ((ViewGroup)this).getChildAt(i);
            ah2.f.e((Object)child, "view");
            this.a(child);
        }
        super.removeViewsInLayout(n, n2);
    }
    
    public final void setDrawDisappearingViewsLast(final boolean i) {
        this.i = i;
    }
    
    public void setLayoutTransition(final LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }
    
    public void setOnApplyWindowInsetsListener(final View$OnApplyWindowInsetsListener h) {
        ah2.f.f((Object)h, "listener");
        this.h = h;
    }
    
    public final void startViewTransition(final View view) {
        ah2.f.f((Object)view, "view");
        if (view.getParent() == this) {
            this.g.add(view);
        }
        super.startViewTransition(view);
    }
}
