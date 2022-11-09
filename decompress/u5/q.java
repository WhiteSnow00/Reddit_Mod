// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import j0.i;
import androidx.fragment.app.m0;
import android.animation.Animator;
import android.util.SparseArray;
import j0.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.WeakHashMap;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import a4.p0;
import java.util.ArrayList;
import android.view.ViewGroup;
import j0.b;
import java.lang.ref.WeakReference;

public final class q
{
    public static u5.a a;
    public static ThreadLocal<WeakReference<b<ViewGroup, ArrayList<m>>>> b;
    public static ArrayList<ViewGroup> c;
    
    static {
        q.a = new u5.a();
        q.b = new ThreadLocal<WeakReference<b<ViewGroup, ArrayList<m>>>>();
        q.c = new ArrayList<ViewGroup>();
    }
    
    public static void a(final ViewGroup viewGroup, m k) {
        if (!q.c.contains(viewGroup)) {
            final WeakHashMap a = p0.a;
            if (p0.g.c((View)viewGroup)) {
                q.c.add(viewGroup);
                Object a2;
                if ((a2 = k) == null) {
                    a2 = q.a;
                }
                k = ((m)a2).k();
                final ArrayList list = (ArrayList)((i)b()).getOrDefault((Object)viewGroup, (Object)null);
                if (list != null && list.size() > 0) {
                    final Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        ((m)iterator.next()).x((View)viewGroup);
                    }
                }
                if (k != null) {
                    k.i(viewGroup, true);
                }
                if (((View)viewGroup).getTag(2131431876) != null) {
                    throw null;
                }
                ((View)viewGroup).setTag(2131431876, (Object)null);
                if (k != null) {
                    final a a3 = new a(viewGroup, k);
                    ((View)viewGroup).addOnAttachStateChangeListener((View$OnAttachStateChangeListener)a3);
                    ((View)viewGroup).getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)a3);
                }
            }
        }
    }
    
    public static b<ViewGroup, ArrayList<m>> b() {
        final WeakReference weakReference = q.b.get();
        if (weakReference != null) {
            final b b = (b)weakReference.get();
            if (b != null) {
                return (b<ViewGroup, ArrayList<m>>)b;
            }
        }
        final b b2 = new b();
        q.b.set(new WeakReference<b<ViewGroup, ArrayList<m>>>((b<ViewGroup, ArrayList<m>>)b2));
        return (b<ViewGroup, ArrayList<m>>)b2;
    }
    
    public static final class a implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener
    {
        public m f;
        public ViewGroup g;
        
        public a(final ViewGroup g, final m f) {
            this.f = f;
            this.g = g;
        }
        
        public final boolean onPreDraw() {
            ((View)this.g).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            ((View)this.g).removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            if (!q.c.remove(this.g)) {
                return true;
            }
            final b<ViewGroup, ArrayList<m>> b = q.b();
            final ArrayList list = (ArrayList)((i)b).getOrDefault((Object)this.g, (Object)null);
            ArrayList list2 = null;
            ArrayList list4 = null;
            Label_0105: {
                if (list == null) {
                    list2 = new ArrayList();
                    ((i)b).put((Object)this.g, (Object)list2);
                }
                else {
                    list2 = list;
                    if (list.size() > 0) {
                        final ArrayList list3 = new ArrayList(list);
                        list2 = list;
                        list4 = list3;
                        break Label_0105;
                    }
                }
                list4 = null;
            }
            list2.add(this.f);
            this.f.a((m.d)new q$a$a(this, (b)b));
            this.f.i(this.g, false);
            if (list4 != null) {
                final Iterator iterator = list4.iterator();
                while (iterator.hasNext()) {
                    ((m)iterator.next()).A(this.g);
                }
            }
            final m f = this.f;
            final ViewGroup g = this.g;
            f.getClass();
            f.q = new ArrayList<t>();
            f.r = new ArrayList<t>();
            m0 m = f.m;
            final m0 n = f.n;
            final b b2 = new b((b)m.a);
            final b b3 = new b((b)n.a);
            int n2 = 0;
            while (true) {
                final int[] p = f.p;
                if (n2 >= p.length) {
                    break;
                }
                final int n3 = p[n2];
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            m0 m2;
                            if (n3 != 4) {
                                m2 = m;
                            }
                            else {
                                final f f2 = (f)m.c;
                                final f f3 = (f)n.c;
                                final int h = f2.h();
                                int n4 = 0;
                                while (true) {
                                    m2 = m;
                                    if (n4 >= h) {
                                        break;
                                    }
                                    final View view = (View)f2.i(n4);
                                    if (view != null && f.v(view)) {
                                        final View view2 = (View)f3.e(f2.f(n4), (Long)null);
                                        if (view2 != null && f.v(view2)) {
                                            final t t = (t)((i)b2).getOrDefault((Object)view, (Object)null);
                                            final t t2 = (t)((i)b3).getOrDefault((Object)view2, (Object)null);
                                            if (t != null && t2 != null) {
                                                f.q.add(t);
                                                f.r.add(t2);
                                                ((i)b2).remove((Object)view);
                                                ((i)b3).remove((Object)view2);
                                            }
                                        }
                                    }
                                    ++n4;
                                }
                            }
                            m = m2;
                        }
                        else {
                            final m0 m3 = m;
                            final SparseArray sparseArray = (SparseArray)m3.b;
                            final SparseArray sparseArray2 = (SparseArray)n.b;
                            final int size = sparseArray.size();
                            int n5 = 0;
                            while (true) {
                                m = m3;
                                if (n5 >= size) {
                                    break;
                                }
                                final View view3 = (View)sparseArray.valueAt(n5);
                                if (view3 != null && f.v(view3)) {
                                    final View view4 = (View)sparseArray2.get(sparseArray.keyAt(n5));
                                    if (view4 != null && f.v(view4)) {
                                        final t t3 = (t)((i)b2).getOrDefault((Object)view3, (Object)null);
                                        final t t4 = (t)((i)b3).getOrDefault((Object)view4, (Object)null);
                                        if (t3 != null && t4 != null) {
                                            f.q.add(t3);
                                            f.r.add(t4);
                                            ((i)b2).remove((Object)view3);
                                            ((i)b3).remove((Object)view4);
                                        }
                                    }
                                }
                                ++n5;
                            }
                        }
                    }
                    else {
                        final m0 m4 = m;
                        final b b4 = (b)m4.d;
                        final b b5 = (b)n.d;
                        final int h2 = ((i)b4).h;
                        int n6 = 0;
                        while (true) {
                            m = m4;
                            if (n6 >= h2) {
                                break;
                            }
                            final View view5 = (View)((i)b4).n(n6);
                            if (view5 != null && f.v(view5)) {
                                final View view6 = (View)((i)b5).getOrDefault(((i)b4).j(n6), (Object)null);
                                if (view6 != null && f.v(view6)) {
                                    final t t5 = (t)((i)b2).getOrDefault((Object)view5, (Object)null);
                                    final t t6 = (t)((i)b3).getOrDefault((Object)view6, (Object)null);
                                    if (t5 != null && t6 != null) {
                                        f.q.add(t5);
                                        f.r.add(t6);
                                        ((i)b2).remove((Object)view5);
                                        ((i)b3).remove((Object)view6);
                                    }
                                }
                            }
                            ++n6;
                        }
                    }
                }
                else {
                    final m0 m5 = m;
                    int h3 = ((i)b2).h;
                    while (true) {
                        final int n7 = h3 - 1;
                        m = m5;
                        if (n7 < 0) {
                            break;
                        }
                        final View view7 = (View)((i)b2).j(n7);
                        h3 = n7;
                        if (view7 == null) {
                            continue;
                        }
                        h3 = n7;
                        if (!f.v(view7)) {
                            continue;
                        }
                        final t t7 = (t)((i)b3).remove((Object)view7);
                        h3 = n7;
                        if (t7 == null) {
                            continue;
                        }
                        h3 = n7;
                        if (!f.v(t7.b)) {
                            continue;
                        }
                        f.q.add((t)((i)b2).l(n7));
                        f.r.add(t7);
                        h3 = n7;
                    }
                }
                ++n2;
            }
            for (int i = 0; i < ((i)b2).h; ++i) {
                final t t8 = (t)((i)b2).n(i);
                if (f.v(t8.b)) {
                    f.q.add(t8);
                    f.r.add(null);
                }
            }
            for (int j = 0; j < ((i)b3).h; ++j) {
                final t t9 = (t)((i)b3).n(j);
                if (f.v(t9.b)) {
                    f.r.add(t9);
                    f.q.add(null);
                }
            }
            final b<Animator, m.b> r = u5.m.r();
            int k = ((i)r).h;
            final b0 a = x.a;
            final f0 f4 = new f0((View)g);
            --k;
            while (k >= 0) {
                final Animator animator = (Animator)((i)r).j(k);
                if (animator != null) {
                    final m.b b6 = (m.b)((i)r).getOrDefault((Object)animator, (Object)null);
                    if (b6 != null && b6.a != null && f4.equals(b6.d)) {
                        final t c = b6.c;
                        final View a2 = b6.a;
                        final t t10 = f.t(a2, true);
                        t q = f.q(a2, true);
                        if (t10 == null && q == null) {
                            q = (t)((i)f.n.a).getOrDefault((Object)a2, (Object)null);
                        }
                        if ((t10 != null || q != null) && b6.e.u(c, q)) {
                            if (!animator.isRunning() && !animator.isStarted()) {
                                ((i)r).remove((Object)animator);
                            }
                            else {
                                animator.cancel();
                            }
                        }
                    }
                }
                --k;
            }
            f.m(g, f.m, f.n, f.q, f.r);
            f.B();
            return true;
        }
        
        public final void onViewAttachedToWindow(final View view) {
        }
        
        public final void onViewDetachedFromWindow(final View view) {
            ((View)this.g).getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
            ((View)this.g).removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
            q.c.remove(this.g);
            final ArrayList list = (ArrayList)((i)q.b()).getOrDefault((Object)this.g, (Object)null);
            if (list != null && list.size() > 0) {
                final Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    ((m)iterator.next()).A(this.g);
                }
            }
            this.f.j(true);
        }
    }
}
