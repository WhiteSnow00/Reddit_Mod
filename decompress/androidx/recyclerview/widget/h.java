// 
// Decompiled by Procyon v0.6.0
// 

package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import java.util.WeakHashMap;
import a4.p0;
import android.view.ViewPropertyAnimator;
import java.util.Iterator;
import java.util.Collection;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import java.util.List;
import java.util.ArrayList;
import android.animation.TimeInterpolator;

public class h extends j0
{
    public static TimeInterpolator s;
    public ArrayList<RecyclerView.f0> h;
    public ArrayList<RecyclerView.f0> i;
    public ArrayList<h$e> j;
    public ArrayList<h$d> k;
    public ArrayList<ArrayList<RecyclerView.f0>> l;
    public ArrayList<ArrayList<h$e>> m;
    public ArrayList<ArrayList<h$d>> n;
    public ArrayList<RecyclerView.f0> o;
    public ArrayList<RecyclerView.f0> p;
    public ArrayList<RecyclerView.f0> q;
    public ArrayList<RecyclerView.f0> r;
    
    public h() {
        this.h = new ArrayList<RecyclerView.f0>();
        this.i = new ArrayList<RecyclerView.f0>();
        this.j = new ArrayList<h$e>();
        this.k = new ArrayList<h$d>();
        this.l = new ArrayList<ArrayList<RecyclerView.f0>>();
        this.m = new ArrayList<ArrayList<h$e>>();
        this.n = new ArrayList<ArrayList<h$d>>();
        this.o = new ArrayList<RecyclerView.f0>();
        this.p = new ArrayList<RecyclerView.f0>();
        this.q = new ArrayList<RecyclerView.f0>();
        this.r = new ArrayList<RecyclerView.f0>();
    }
    
    public final boolean g(final RecyclerView.f0 f0, final List<Object> list) {
        return !list.isEmpty() || this.f(f0);
    }
    
    public final void j(final RecyclerView.f0 f0) {
        final View itemView = f0.itemView;
        itemView.animate().cancel();
        int size = this.j.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            size = n;
            if (this.j.get(n).a != f0) {
                continue;
            }
            itemView.setTranslationY(0.0f);
            itemView.setTranslationX(0.0f);
            ((RecyclerView.l)this).h(f0);
            this.j.remove(n);
            size = n;
        }
        this.t(f0, this.k);
        if (this.h.remove(f0)) {
            itemView.setAlpha(1.0f);
            ((RecyclerView.l)this).h(f0);
        }
        if (this.i.remove(f0)) {
            itemView.setAlpha(1.0f);
            ((RecyclerView.l)this).h(f0);
        }
        int size2 = this.n.size();
        while (--size2 >= 0) {
            final ArrayList list = this.n.get(size2);
            this.t(f0, list);
            if (list.isEmpty()) {
                this.n.remove(size2);
            }
        }
        int size3 = this.m.size();
        while (true) {
            final int n2 = size3 - 1;
            if (n2 < 0) {
                break;
            }
            final ArrayList list2 = this.m.get(n2);
            int size4 = list2.size();
            while (--size4 >= 0) {
                if (((h$e)list2.get(size4)).a == f0) {
                    itemView.setTranslationY(0.0f);
                    itemView.setTranslationX(0.0f);
                    ((RecyclerView.l)this).h(f0);
                    list2.remove(size4);
                    if (list2.isEmpty()) {
                        this.m.remove(n2);
                        break;
                    }
                    break;
                }
            }
            size3 = n2;
        }
        int size5 = this.l.size();
        while (--size5 >= 0) {
            final ArrayList list3 = this.l.get(size5);
            if (list3.remove(f0)) {
                itemView.setAlpha(1.0f);
                ((RecyclerView.l)this).h(f0);
                if (!list3.isEmpty()) {
                    continue;
                }
                this.l.remove(size5);
            }
        }
        this.q.remove(f0);
        this.o.remove(f0);
        this.r.remove(f0);
        this.p.remove(f0);
        this.s();
    }
    
    public final void k() {
        int size = this.j.size();
        while (--size >= 0) {
            final h$e h$e = this.j.get(size);
            final View itemView = h$e.a.itemView;
            itemView.setTranslationY(0.0f);
            itemView.setTranslationX(0.0f);
            ((RecyclerView.l)this).h(h$e.a);
            this.j.remove(size);
        }
        int size2 = this.h.size();
        while (--size2 >= 0) {
            ((RecyclerView.l)this).h(this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (--size3 >= 0) {
            final RecyclerView.f0 f0 = this.i.get(size3);
            f0.itemView.setAlpha(1.0f);
            ((RecyclerView.l)this).h(f0);
            this.i.remove(size3);
        }
        int size4 = this.k.size();
        while (--size4 >= 0) {
            final h$d h$d = this.k.get(size4);
            final RecyclerView.f0 a = h$d.a;
            if (a != null) {
                this.u(h$d, a);
            }
            final RecyclerView.f0 b = h$d.b;
            if (b != null) {
                this.u(h$d, b);
            }
        }
        this.k.clear();
        if (!this.l()) {
            return;
        }
        int size5 = this.m.size();
        while (true) {
            final int n = size5 - 1;
            if (n < 0) {
                break;
            }
            final ArrayList list = this.m.get(n);
            int size6 = list.size();
            while (--size6 >= 0) {
                final h$e h$e2 = (h$e)list.get(size6);
                final View itemView2 = h$e2.a.itemView;
                itemView2.setTranslationY(0.0f);
                itemView2.setTranslationX(0.0f);
                ((RecyclerView.l)this).h(h$e2.a);
                list.remove(size6);
                if (list.isEmpty()) {
                    this.m.remove(list);
                }
            }
            size5 = n;
        }
        int size7 = this.l.size();
        while (true) {
            final int n2 = size7 - 1;
            if (n2 < 0) {
                break;
            }
            final ArrayList list2 = this.l.get(n2);
            int size8 = list2.size();
            while (--size8 >= 0) {
                final RecyclerView.f0 f2 = (RecyclerView.f0)list2.get(size8);
                f2.itemView.setAlpha(1.0f);
                ((RecyclerView.l)this).h(f2);
                list2.remove(size8);
                if (list2.isEmpty()) {
                    this.l.remove(list2);
                }
            }
            size7 = n2;
        }
        int size9 = this.n.size();
        while (true) {
            final int n3 = size9 - 1;
            if (n3 < 0) {
                break;
            }
            final ArrayList list3 = this.n.get(n3);
            int size10 = list3.size();
            while (--size10 >= 0) {
                final h$d h$d2 = (h$d)list3.get(size10);
                final RecyclerView.f0 a2 = h$d2.a;
                if (a2 != null) {
                    this.u(h$d2, a2);
                }
                final RecyclerView.f0 b2 = h$d2.b;
                if (b2 != null) {
                    this.u(h$d2, b2);
                }
                if (list3.isEmpty()) {
                    this.n.remove(list3);
                }
            }
            size9 = n3;
        }
        this.r(this.q);
        this.r(this.p);
        this.r(this.o);
        this.r(this.r);
        ((RecyclerView.l)this).i();
    }
    
    public final boolean l() {
        return !this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty();
    }
    
    public final void m() {
        final boolean b = this.h.isEmpty() ^ true;
        final boolean b2 = this.j.isEmpty() ^ true;
        final boolean b3 = this.k.isEmpty() ^ true;
        final boolean b4 = this.i.isEmpty() ^ true;
        if (!b && !b2 && !b4 && !b3) {
            return;
        }
        for (final RecyclerView.f0 f0 : this.h) {
            final View itemView = f0.itemView;
            final ViewPropertyAnimator animate = itemView.animate();
            this.q.add(f0);
            animate.setDuration(((RecyclerView.l)this).d).alpha(0.0f).setListener((Animator$AnimatorListener)new i(itemView, animate, this, f0)).start();
        }
        this.h.clear();
        if (b2) {
            final ArrayList list = new ArrayList();
            list.addAll(this.j);
            this.m.add(list);
            this.j.clear();
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    for (final h$e h$e : list) {
                        final h g = androidx.recyclerview.widget.h.this;
                        final RecyclerView.f0 a = h$e.a;
                        final int b = h$e.b;
                        final int c = h$e.c;
                        final int d = h$e.d;
                        final int e = h$e.e;
                        g.getClass();
                        final View itemView = a.itemView;
                        final int n = d - b;
                        final int n2 = e - c;
                        if (n != 0) {
                            itemView.animate().translationX(0.0f);
                        }
                        if (n2 != 0) {
                            itemView.animate().translationY(0.0f);
                        }
                        final ViewPropertyAnimator animate = itemView.animate();
                        g.p.add(a);
                        animate.setDuration(((RecyclerView.l)g).e).setListener((Animator$AnimatorListener)new k(g, a, n, itemView, n2, animate)).start();
                    }
                    list.clear();
                    androidx.recyclerview.widget.h.this.m.remove(list);
                }
            };
            if (b) {
                final View itemView2 = ((h$e)list.get(0)).a.itemView;
                final long d = ((RecyclerView.l)this).d;
                final WeakHashMap a = p0.a;
                p0.d.n(itemView2, runnable, d);
            }
            else {
                runnable.run();
            }
        }
        if (b3) {
            final ArrayList list2 = new ArrayList();
            list2.addAll(this.k);
            this.n.add(list2);
            this.k.clear();
            final Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    for (final h$d h$d : list2) {
                        final h g = androidx.recyclerview.widget.h.this;
                        g.getClass();
                        final RecyclerView.f0 a = h$d.a;
                        View itemView = null;
                        View itemView2;
                        if (a == null) {
                            itemView2 = null;
                        }
                        else {
                            itemView2 = a.itemView;
                        }
                        final RecyclerView.f0 b = h$d.b;
                        if (b != null) {
                            itemView = b.itemView;
                        }
                        if (itemView2 != null) {
                            final ViewPropertyAnimator setDuration = itemView2.animate().setDuration(((RecyclerView.l)g).f);
                            g.r.add(h$d.a);
                            setDuration.translationX((float)(h$d.e - h$d.c));
                            setDuration.translationY((float)(h$d.f - h$d.d));
                            setDuration.alpha(0.0f).setListener((Animator$AnimatorListener)new l(g, h$d, setDuration, itemView2)).start();
                        }
                        if (itemView != null) {
                            final ViewPropertyAnimator animate = itemView.animate();
                            g.r.add(h$d.b);
                            animate.translationX(0.0f).translationY(0.0f).setDuration(((RecyclerView.l)g).f).alpha(1.0f).setListener((Animator$AnimatorListener)new m(g, h$d, animate, itemView)).start();
                        }
                    }
                    list2.clear();
                    androidx.recyclerview.widget.h.this.n.remove(list2);
                }
            };
            if (b) {
                final View itemView3 = ((h$d)list2.get(0)).a.itemView;
                final long d2 = ((RecyclerView.l)this).d;
                final WeakHashMap a2 = p0.a;
                p0.d.n(itemView3, runnable2, d2);
            }
            else {
                runnable2.run();
            }
        }
        if (b4) {
            final ArrayList list3 = new ArrayList();
            list3.addAll(this.i);
            this.l.add(list3);
            this.i.clear();
            final h$c h$c = new h$c(this, (ArrayList)list3);
            if (!b && !b2 && !b3) {
                h$c.run();
            }
            else {
                long f2 = 0L;
                long d3;
                if (b) {
                    d3 = ((RecyclerView.l)this).d;
                }
                else {
                    d3 = 0L;
                }
                long e;
                if (b2) {
                    e = ((RecyclerView.l)this).e;
                }
                else {
                    e = 0L;
                }
                if (b3) {
                    f2 = ((RecyclerView.l)this).f;
                }
                final long max = Math.max(e, f2);
                final View itemView4 = ((RecyclerView.f0)list3.get(0)).itemView;
                final WeakHashMap a3 = p0.a;
                p0.d.n(itemView4, (Runnable)h$c, max + d3);
            }
        }
    }
    
    public final void n(final RecyclerView.f0 f0) {
        this.v(f0);
        f0.itemView.setAlpha(0.0f);
        this.i.add(f0);
    }
    
    public final boolean o(final RecyclerView.f0 f0, final RecyclerView.f0 f2, final int n, final int n2, final int n3, final int n4) {
        if (f0 == f2) {
            return this.p(f0, n, n2, n3, n4);
        }
        final float translationX = f0.itemView.getTranslationX();
        final float translationY = f0.itemView.getTranslationY();
        final float alpha = f0.itemView.getAlpha();
        this.v(f0);
        final int n5 = (int)(n3 - n - translationX);
        final int n6 = (int)(n4 - n2 - translationY);
        f0.itemView.setTranslationX(translationX);
        f0.itemView.setTranslationY(translationY);
        f0.itemView.setAlpha(alpha);
        if (f2 != null) {
            this.v(f2);
            f2.itemView.setTranslationX((float)(-n5));
            f2.itemView.setTranslationY((float)(-n6));
            f2.itemView.setAlpha(0.0f);
        }
        this.k.add(new h$d(f0, f2, n, n2, n3, n4));
        return true;
    }
    
    public final boolean p(final RecyclerView.f0 f0, int n, int n2, final int n3, final int n4) {
        final View itemView = f0.itemView;
        n += (int)itemView.getTranslationX();
        final int n5 = n2 + (int)f0.itemView.getTranslationY();
        this.v(f0);
        n2 = n3 - n;
        final int n6 = n4 - n5;
        if (n2 == 0 && n6 == 0) {
            ((RecyclerView.l)this).h(f0);
            return false;
        }
        if (n2 != 0) {
            itemView.setTranslationX((float)(-n2));
        }
        if (n6 != 0) {
            itemView.setTranslationY((float)(-n6));
        }
        this.j.add(new h$e(f0, n, n5, n3, n4));
        return true;
    }
    
    public final void q(final RecyclerView.f0 f0) {
        this.v(f0);
        this.h.add(f0);
    }
    
    public final void r(final ArrayList list) {
        int size = list.size();
        while (--size >= 0) {
            ((RecyclerView.f0)list.get(size)).itemView.animate().cancel();
        }
    }
    
    public final void s() {
        if (!this.l()) {
            ((RecyclerView.l)this).i();
        }
    }
    
    public final void t(final RecyclerView.f0 f0, final ArrayList list) {
        int size = list.size();
        while (true) {
            final int n = size - 1;
            if (n < 0) {
                break;
            }
            final h$d h$d = (h$d)list.get(n);
            size = n;
            if (!this.u(h$d, f0)) {
                continue;
            }
            size = n;
            if (h$d.a != null) {
                continue;
            }
            size = n;
            if (h$d.b != null) {
                continue;
            }
            list.remove(h$d);
            size = n;
        }
    }
    
    public final boolean u(final h$d h$d, final RecyclerView.f0 f0) {
        if (h$d.b == f0) {
            h$d.b = null;
        }
        else {
            if (h$d.a != f0) {
                return false;
            }
            h$d.a = null;
        }
        f0.itemView.setAlpha(1.0f);
        f0.itemView.setTranslationX(0.0f);
        f0.itemView.setTranslationY(0.0f);
        ((RecyclerView.l)this).h(f0);
        return true;
    }
    
    public final void v(final RecyclerView.f0 f0) {
        if (androidx.recyclerview.widget.h.s == null) {
            androidx.recyclerview.widget.h.s = new ValueAnimator().getInterpolator();
        }
        f0.itemView.animate().setInterpolator(androidx.recyclerview.widget.h.s);
        this.j(f0);
    }
}
