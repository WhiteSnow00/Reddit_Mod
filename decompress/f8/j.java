// 
// Decompiled by Procyon v0.6.0
// 

package f8;

import u5.d;
import android.view.ViewTreeObserver$OnPreDrawListener;
import cg.h;
import u5.r;
import java.util.Iterator;
import com.bluelinelabs.conductor.c;
import a4.l1;
import android.view.ViewGroup;
import android.view.View;
import u5.m;
import java.util.ArrayList;
import j0.b;

public abstract class j extends n
{
    public final j0.b<String, String> l;
    public final ArrayList m;
    public final ArrayList n;
    public m o;
    public m p;
    public m q;
    
    public j() {
        this.l = (j0.b<String, String>)new j0.b();
        this.m = new ArrayList();
        this.n = new ArrayList();
    }
    
    public static void q(final View view, final ArrayList list) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                if (l1.b(viewGroup)) {
                    list.add(viewGroup);
                }
                else {
                    for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                        q(viewGroup.getChildAt(i), list);
                    }
                }
            }
            else {
                list.add(view);
            }
        }
    }
    
    @Override
    public final void g(final c c) {
        super.i = true;
        this.n.clear();
    }
    
    @Override
    public final void n(final ViewGroup viewGroup, final View view, final View view2, final m m, final boolean b) {
        if (view2 != null && this.n.size() > 0) {
            view2.setVisibility(0);
            for (final j.j$b j$b : this.n) {
                j$b.b.addView(j$b.a);
            }
            this.n.clear();
        }
        super.n(viewGroup, view, view2, m, b);
    }
    
    @Override
    public final m o(final ViewGroup viewGroup, final View view, final View view2, final boolean b) {
        this.o = (m)this.t(viewGroup);
        this.p = (m)this.s(viewGroup);
        final h u = this.u(viewGroup, view, b);
        this.q = u;
        final m p4 = this.p;
        if (p4 == null && u == null && this.o == null) {
            throw new IllegalStateException("SharedElementTransitionChangeHandler must have at least one transaction.");
        }
        final m o = this.o;
        final r r = new r();
        for (int i = 0; i < 3; ++i) {
            final m m = (new m[] { o, p4, u })[i];
            if (m != null) {
                r.M(m);
            }
        }
        r.Q(0);
        return r;
    }
    
    @Override
    public final void p(final ViewGroup viewGroup, final View view, final View view2, final m m, final boolean b, final f8.m i) {
        final f8.a a = new f8.a(this, viewGroup, view, view2, m, b, i);
        this.r(viewGroup);
        if (view2 != null && view2.getParent() == null && this.m.size() > 0) {
            view2.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new f8.b(this, view2, a));
            viewGroup.addView(view2);
        }
        else {
            a.onPrepared();
        }
    }
    
    public abstract void r(final ViewGroup p0);
    
    public abstract u5.d s(final ViewGroup p0);
    
    public abstract u5.d t(final ViewGroup p0);
    
    public abstract h u(final ViewGroup p0, final View p1, final boolean p2);
}
