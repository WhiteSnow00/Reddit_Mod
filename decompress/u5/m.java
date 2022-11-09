// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import android.widget.AdapterView;
import android.widget.Adapter;
import j0.i;
import android.graphics.Rect;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import android.util.SparseIntArray;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import mj2.c0;
import j0.f;
import android.widget.ListView;
import a4.p0;
import android.util.SparseArray;
import android.support.v4.media.a;
import androidx.fragment.app.m0;
import android.view.View;
import java.util.ArrayList;
import android.animation.TimeInterpolator;
import bj2.d;
import android.animation.Animator;
import j0.b;

public abstract class m implements Cloneable
{
    public static final int[] B;
    public static final m$a C;
    public static ThreadLocal<j0.b<Animator, b>> D;
    public bj2.d A;
    public String f;
    public long g;
    public long h;
    public TimeInterpolator i;
    public ArrayList<Integer> j;
    public ArrayList<View> k;
    public ArrayList<View> l;
    public m0 m;
    public m0 n;
    public r o;
    public int[] p;
    public ArrayList<t> q;
    public ArrayList<t> r;
    public ArrayList<Animator> s;
    public int t;
    public boolean u;
    public boolean v;
    public ArrayList<d> w;
    public ArrayList<Animator> x;
    public a y;
    public c z;
    
    static {
        B = new int[] { 2, 1, 3, 4 };
        C = new m$a();
        m.D = new ThreadLocal<j0.b<Animator, b>>();
    }
    
    public m() {
        this.f = this.getClass().getName();
        this.g = -1L;
        this.h = -1L;
        this.i = null;
        this.j = new ArrayList<Integer>();
        this.k = new ArrayList<View>();
        this.l = null;
        this.m = new m0(1);
        this.n = new m0(1);
        this.o = null;
        this.p = u5.m.B;
        this.s = new ArrayList<Animator>();
        this.t = 0;
        this.u = false;
        this.v = false;
        this.w = null;
        this.x = new ArrayList<Animator>();
        this.A = (bj2.d)u5.m.C;
    }
    
    public static void d(final m0 m0, View view, final t t) {
        ((i)m0.a).put((Object)view, (Object)t);
        final int id = view.getId();
        if (id >= 0) {
            if (((SparseArray)m0.b).indexOfKey(id) >= 0) {
                ((SparseArray)m0.b).put(id, (Object)null);
            }
            else {
                ((SparseArray)m0.b).put(id, (Object)view);
            }
        }
        final WeakHashMap a = p0.a;
        final String k = p0.i.k(view);
        if (k != null) {
            if (((i)m0.d).containsKey((Object)k)) {
                ((i)m0.d).put((Object)k, (Object)null);
            }
            else {
                ((i)m0.d).put((Object)k, (Object)view);
            }
        }
        if (view.getParent() instanceof ListView) {
            final ListView listView = (ListView)view.getParent();
            if (((Adapter)listView.getAdapter()).hasStableIds()) {
                final long itemIdAtPosition = ((AdapterView)listView).getItemIdAtPosition(((AdapterView)listView).getPositionForView(view));
                final f f = (f)m0.c;
                if (f.f) {
                    f.d();
                }
                if (c0.m(f.i, itemIdAtPosition, f.g) >= 0) {
                    view = (View)((f)m0.c).e(itemIdAtPosition, (Long)null);
                    if (view != null) {
                        p0.d.r(view, false);
                        ((f)m0.c).g(itemIdAtPosition, (Object)null);
                    }
                }
                else {
                    p0.d.r(view, true);
                    ((f)m0.c).g(itemIdAtPosition, (Object)view);
                }
            }
        }
    }
    
    public static j0.b<Animator, b> r() {
        j0.b b;
        if ((b = m.D.get()) == null) {
            b = new j0.b();
            m.D.set((j0.b<Animator, b>)b);
        }
        return (j0.b<Animator, b>)b;
    }
    
    public static boolean w(final t t, final t t2, final String s) {
        final Object value = t.a.get(s);
        final Object value2 = t2.a.get(s);
        final boolean b = true;
        boolean b2;
        if (value == null && value2 == null) {
            b2 = false;
        }
        else {
            b2 = b;
            if (value != null) {
                if (value2 == null) {
                    b2 = b;
                }
                else {
                    b2 = (true ^ value.equals(value2));
                }
            }
        }
        return b2;
    }
    
    public void A(final ViewGroup viewGroup) {
        if (this.u) {
            if (!this.v) {
                final j0.b<Animator, b> r = r();
                int h = ((i)r).h;
                final b0 a = u5.x.a;
                final f0 f0 = new f0((View)viewGroup);
                while (true) {
                    final int n = h - 1;
                    if (n < 0) {
                        break;
                    }
                    final b b = (b)((i)r).n(n);
                    h = n;
                    if (b.a == null) {
                        continue;
                    }
                    h = n;
                    if (!f0.equals(b.d)) {
                        continue;
                    }
                    ((Animator)((i)r).j(n)).resume();
                    h = n;
                }
                final ArrayList<d> w = this.w;
                if (w != null && w.size() > 0) {
                    final ArrayList list = (ArrayList)this.w.clone();
                    for (int size = list.size(), i = 0; i < size; ++i) {
                        ((d)list.get(i)).c(this);
                    }
                }
            }
            this.u = false;
        }
    }
    
    public void B() {
        this.I();
        final j0.b<Animator, b> r = r();
        for (final Animator animator : this.x) {
            if (((i)r).containsKey((Object)animator)) {
                this.I();
                if (animator == null) {
                    continue;
                }
                animator.addListener((Animator$AnimatorListener)new n(this, r));
                final long h = this.h;
                if (h >= 0L) {
                    animator.setDuration(h);
                }
                final long g = this.g;
                if (g >= 0L) {
                    animator.setStartDelay(animator.getStartDelay() + g);
                }
                final TimeInterpolator i = this.i;
                if (i != null) {
                    animator.setInterpolator(i);
                }
                animator.addListener((Animator$AnimatorListener)new o(this));
                animator.start();
            }
        }
        this.x.clear();
        this.n();
    }
    
    public void C(final long h) {
        this.h = h;
    }
    
    public void D(final c z) {
        this.z = z;
    }
    
    public void E(final TimeInterpolator i) {
        this.i = i;
    }
    
    public void F(final bj2.d a) {
        if (a == null) {
            this.A = (bj2.d)u5.m.C;
        }
        else {
            this.A = a;
        }
    }
    
    public void G(final a y) {
        this.y = y;
    }
    
    public void H(final long g) {
        this.g = g;
    }
    
    public final void I() {
        if (this.t == 0) {
            final ArrayList<d> w = this.w;
            if (w != null && w.size() > 0) {
                final ArrayList list = (ArrayList)this.w.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((d)list.get(i)).d(this);
                }
            }
            this.v = false;
        }
        ++this.t;
    }
    
    public String J(String s) {
        final StringBuilder k = a.k(s);
        k.append(this.getClass().getSimpleName());
        k.append("@");
        k.append(Integer.toHexString(this.hashCode()));
        k.append(": ");
        final String s2 = s = k.toString();
        if (this.h != -1L) {
            s = ak0.n.o(d.q(s2, "dur("), this.h, ") ");
        }
        String o = s;
        if (this.g != -1L) {
            o = ak0.n.o(d.q(s, "dly("), this.g, ") ");
        }
        s = o;
        if (this.i != null) {
            final StringBuilder q = d.q(o, "interp(");
            q.append(this.i);
            q.append(") ");
            s = q.toString();
        }
        if (this.j.size() <= 0) {
            final String l = s;
            if (this.k.size() <= 0) {
                return l;
            }
        }
        String s3 = ak0.m.l(s, "tgts(");
        final int size = this.j.size();
        final int n = 0;
        s = s3;
        if (size > 0) {
            int n2 = 0;
            while (true) {
                s = s3;
                if (n2 >= this.j.size()) {
                    break;
                }
                s = s3;
                if (n2 > 0) {
                    s = ak0.m.l(s3, ", ");
                }
                final StringBuilder i = a.k(s);
                i.append(this.j.get(n2));
                s3 = i.toString();
                ++n2;
            }
        }
        String s4 = s;
        if (this.k.size() > 0) {
            int n3 = n;
            while (true) {
                s4 = s;
                if (n3 >= this.k.size()) {
                    break;
                }
                String j = s;
                if (n3 > 0) {
                    j = ak0.m.l(s, ", ");
                }
                final StringBuilder m = a.k(j);
                m.append(this.k.get(n3));
                s = m.toString();
                ++n3;
            }
        }
        return ak0.m.l(s4, ")");
    }
    
    public void a(final d d) {
        if (this.w == null) {
            this.w = new ArrayList<d>();
        }
        this.w.add(d);
    }
    
    public void c(final View view) {
        this.k.add(view);
    }
    
    public void cancel() {
        for (int i = this.s.size() - 1; i >= 0; --i) {
            this.s.get(i).cancel();
        }
        final ArrayList<d> w = this.w;
        if (w != null && w.size() > 0) {
            final ArrayList list = (ArrayList)this.w.clone();
            for (int size = list.size(), j = 0; j < size; ++j) {
                ((d)list.get(j)).b(this);
            }
        }
    }
    
    public abstract void e(final t p0);
    
    public final void f(final View view, final boolean b) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            final t t = new t(view);
            if (b) {
                this.h(t);
            }
            else {
                this.e(t);
            }
            t.c.add(this);
            this.g(t);
            if (b) {
                d(this.m, view, t);
            }
            else {
                d(this.n, view, t);
            }
        }
        if (view instanceof ViewGroup) {
            final ArrayList<View> l = this.l;
            if (l != null && l.contains(view)) {
                return;
            }
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                this.f(viewGroup.getChildAt(i), b);
            }
        }
    }
    
    public void g(final t t) {
        if (this.y != null && !t.a.isEmpty()) {
            this.y.c1();
            final String[] g = u5.k.g;
            final int n = 0;
            int i = 0;
            while (true) {
                while (i < 2) {
                    if (!t.a.containsKey(g[i])) {
                        final int n2 = n;
                        if (n2 == 0) {
                            this.y.F(t);
                        }
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                final int n2 = 1;
                continue;
            }
        }
    }
    
    public abstract void h(final t p0);
    
    public final void i(final ViewGroup viewGroup, final boolean b) {
        this.j(b);
        if (this.j.size() <= 0 && this.k.size() <= 0) {
            this.f((View)viewGroup, b);
        }
        else {
            final int n = 0;
            int n2 = 0;
            int i;
            while (true) {
                i = n;
                if (n2 >= this.j.size()) {
                    break;
                }
                final View viewById = ((View)viewGroup).findViewById((int)this.j.get(n2));
                if (viewById != null) {
                    final t t = new t(viewById);
                    if (b) {
                        this.h(t);
                    }
                    else {
                        this.e(t);
                    }
                    t.c.add(this);
                    this.g(t);
                    if (b) {
                        d(this.m, viewById, t);
                    }
                    else {
                        d(this.n, viewById, t);
                    }
                }
                ++n2;
            }
            while (i < this.k.size()) {
                final View view = this.k.get(i);
                final t t2 = new t(view);
                if (b) {
                    this.h(t2);
                }
                else {
                    this.e(t2);
                }
                t2.c.add(this);
                this.g(t2);
                if (b) {
                    d(this.m, view, t2);
                }
                else {
                    d(this.n, view, t2);
                }
                ++i;
            }
        }
    }
    
    public final void j(final boolean b) {
        if (b) {
            ((i)this.m.a).clear();
            ((SparseArray)this.m.b).clear();
            ((f)this.m.c).a();
        }
        else {
            ((i)this.n.a).clear();
            ((SparseArray)this.n.b).clear();
            ((f)this.n.c).a();
        }
    }
    
    public m k() {
        try {
            final m m = (m)super.clone();
            m.x = new ArrayList<Animator>();
            m.m = new m0(1);
            m.n = new m0(1);
            m.q = null;
            m.r = null;
            return m;
        }
        catch (final CloneNotSupportedException ex) {
            return null;
        }
    }
    
    public Animator l(final ViewGroup viewGroup, final t t, final t t2) {
        return null;
    }
    
    public void m(final ViewGroup viewGroup, final m0 m0, final m0 m2, final ArrayList<t> list, final ArrayList<t> list2) {
        final j0.b<Animator, b> r = r();
        final SparseIntArray sparseIntArray = new SparseIntArray();
        final int size = list.size();
        long n = Long.MAX_VALUE;
        long min;
        for (int i = 0; i < size; ++i, n = min) {
            final t t = list.get(i);
            final t t2 = list2.get(i);
            t t3;
            if ((t3 = t) != null) {
                t3 = t;
                if (!t.c.contains(this)) {
                    t3 = null;
                }
            }
            t t4;
            if ((t4 = t2) != null) {
                t4 = t2;
                if (!t2.c.contains(this)) {
                    t4 = null;
                }
            }
            if ((t3 != null || t4 != null) && (t3 == null || t4 == null || this.u(t3, t4))) {
                final Animator l = this.l(viewGroup, t3, t4);
                if (l != null) {
                    Animator animator;
                    t t9;
                    View view;
                    if (t4 != null) {
                        final View b = t4.b;
                        final String[] s = this.s();
                        t t7 = null;
                        Label_0409: {
                            if (s != null && s.length > 0) {
                                final t t5 = new t(b);
                                final t t6 = (t)((i)m2.a).getOrDefault((Object)b, (Object)null);
                                if (t6 != null) {
                                    for (int j = 0; j < s.length; ++j) {
                                        final HashMap a = t5.a;
                                        final String s2 = s[j];
                                        a.put(s2, t6.a.get(s2));
                                    }
                                }
                                for (int h = ((i)r).h, k = 0; k < h; ++k) {
                                    final b b2 = (b)((i)r).getOrDefault((Object)((i)r).j(k), (Object)null);
                                    if (b2.c != null && b2.a == b && b2.b.equals(this.f) && b2.c.equals(t5)) {
                                        t7 = t5;
                                        animator = null;
                                        break Label_0409;
                                    }
                                }
                                final t t8 = t5;
                                animator = l;
                                t7 = t8;
                            }
                            else {
                                animator = l;
                                t7 = null;
                            }
                        }
                        t9 = t7;
                        view = b;
                    }
                    else {
                        final View b3 = t3.b;
                        animator = l;
                        t9 = null;
                        view = b3;
                    }
                    min = n;
                    if (animator != null) {
                        final a y = this.y;
                        min = n;
                        if (y != null) {
                            final long f1 = y.f1(viewGroup, this, t3, t4);
                            sparseIntArray.put(this.x.size(), (int)f1);
                            min = Math.min(f1, n);
                        }
                        final String f2 = this.f;
                        final b0 a2 = u5.x.a;
                        ((i)r).put((Object)animator, (Object)new b(view, f2, this, new f0((View)viewGroup), t9));
                        this.x.add(animator);
                    }
                    continue;
                }
            }
            min = n;
        }
        if (sparseIntArray.size() != 0) {
            for (int n2 = 0; n2 < sparseIntArray.size(); ++n2) {
                final Animator animator2 = this.x.get(sparseIntArray.keyAt(n2));
                animator2.setStartDelay(animator2.getStartDelay() + (sparseIntArray.valueAt(n2) - n));
            }
        }
    }
    
    public final void n() {
        final int t = this.t - 1;
        this.t = t;
        if (t == 0) {
            final ArrayList<d> w = this.w;
            if (w != null && w.size() > 0) {
                final ArrayList list = (ArrayList)this.w.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((d)list.get(i)).a(this);
                }
            }
            for (int j = 0; j < ((f)this.m.c).h(); ++j) {
                final View view = (View)((f)this.m.c).i(j);
                if (view != null) {
                    final WeakHashMap a = p0.a;
                    p0.d.r(view, false);
                }
            }
            for (int k = 0; k < ((f)this.n.c).h(); ++k) {
                final View view2 = (View)((f)this.n.c).i(k);
                if (view2 != null) {
                    final WeakHashMap a2 = p0.a;
                    p0.d.r(view2, false);
                }
            }
            this.v = true;
        }
    }
    
    public final void o(final View view) {
        ArrayList<View> l;
        final ArrayList<View> list = l = this.l;
        if (view != null && (l = list) != null) {
            list.remove(view);
            l = list;
            if (list.isEmpty()) {
                l = null;
            }
        }
        this.l = l;
    }
    
    public void p(final ConstraintLayout constraintLayout) {
        final j0.b<Animator, b> r = r();
        int h = ((i)r).h;
        if (constraintLayout != null) {
            if (h != 0) {
                final b0 a = u5.x.a;
                final f0 f0 = new f0((View)constraintLayout);
                final j0.b b = new j0.b((j0.b)r);
                ((i)r).clear();
                while (true) {
                    final int n = h - 1;
                    if (n < 0) {
                        break;
                    }
                    final b b2 = (b)((i)b).n(n);
                    h = n;
                    if (b2.a == null) {
                        continue;
                    }
                    h = n;
                    if (!f0.equals(b2.d)) {
                        continue;
                    }
                    ((Animator)((i)b).j(n)).end();
                    h = n;
                }
            }
        }
    }
    
    public final t q(final View view, final boolean b) {
        final r o = this.o;
        if (o != null) {
            return o.q(view, b);
        }
        ArrayList<t> list;
        if (b) {
            list = this.q;
        }
        else {
            list = this.r;
        }
        final t t = null;
        if (list == null) {
            return null;
        }
        final int size = list.size();
        final int n = -1;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= size) {
                break;
            }
            final t t2 = list.get(n2);
            if (t2 == null) {
                return null;
            }
            if (t2.b == view) {
                n3 = n2;
                break;
            }
            ++n2;
        }
        t t3 = t;
        if (n3 >= 0) {
            ArrayList<t> list2;
            if (b) {
                list2 = this.r;
            }
            else {
                list2 = this.q;
            }
            t3 = list2.get(n3);
        }
        return t3;
    }
    
    public String[] s() {
        return null;
    }
    
    public final t t(final View view, final boolean b) {
        final r o = this.o;
        if (o != null) {
            return o.t(view, b);
        }
        m0 m0;
        if (b) {
            m0 = this.m;
        }
        else {
            m0 = this.n;
        }
        return (t)((i)m0.a).getOrDefault((Object)view, (Object)null);
    }
    
    @Override
    public final String toString() {
        return this.J("");
    }
    
    public boolean u(final t t, final t t2) {
        boolean b2;
        final boolean b = b2 = false;
        if (t != null) {
            b2 = b;
            if (t2 != null) {
                final String[] s = this.s();
                if (s != null) {
                    final int length = s.length;
                    int n = 0;
                    while (true) {
                        b2 = b;
                        if (n >= length) {
                            return b2;
                        }
                        if (w(t, t2, s[n])) {
                            break;
                        }
                        ++n;
                    }
                }
                else {
                    final Iterator iterator = t.a.keySet().iterator();
                    do {
                        b2 = b;
                        if (iterator.hasNext()) {
                            continue;
                        }
                        return b2;
                    } while (!w(t, t2, (String)iterator.next()));
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    public final boolean v(final View view) {
        final int id = view.getId();
        return (this.j.size() == 0 && this.k.size() == 0) || this.j.contains(id) || this.k.contains(view);
    }
    
    public void x(final View view) {
        if (!this.v) {
            final j0.b<Animator, b> r = r();
            int i = ((i)r).h;
            final b0 a = u5.x.a;
            final f0 f0 = new f0(view);
            --i;
            while (i >= 0) {
                final b b = (b)((i)r).n(i);
                if (b.a != null && f0.equals(b.d)) {
                    ((Animator)((i)r).j(i)).pause();
                }
                --i;
            }
            final ArrayList<d> w = this.w;
            if (w != null && w.size() > 0) {
                final ArrayList list = (ArrayList)this.w.clone();
                for (int size = list.size(), j = 0; j < size; ++j) {
                    ((d)list.get(j)).e(this);
                }
            }
            this.u = true;
        }
    }
    
    public void y(final d d) {
        final ArrayList<d> w = this.w;
        if (w == null) {
            return;
        }
        w.remove(d);
        if (this.w.size() == 0) {
            this.w = null;
        }
    }
    
    public void z(final View view) {
        this.k.remove(view);
    }
    
    public static final class b
    {
        public View a;
        public String b;
        public t c;
        public g0 d;
        public m e;
        
        public b(final View a, final String b, final m e, final f0 d, final t c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
    
    public abstract static class c
    {
        public abstract Rect a();
    }
    
    public interface d
    {
        void a(final m p0);
        
        void b(final m p0);
        
        void c(final m p0);
        
        void d(final m p0);
        
        void e(final m p0);
    }
}
