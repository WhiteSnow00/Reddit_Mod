// 
// Decompiled by Procyon v0.6.0
// 

package t5;

import android.widget.AdapterView;
import android.widget.Adapter;
import android.graphics.Rect;
import java.util.HashMap;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import java.util.Iterator;
import android.animation.Animator$AnimatorListener;
import java.util.WeakHashMap;
import a4.l0$d;
import hg1.a;
import j0.f;
import android.widget.ListView;
import a4.l0$i;
import a4.l0;
import android.util.SparseArray;
import android.graphics.Path;
import android.view.View;
import java.util.ArrayList;
import android.animation.TimeInterpolator;
import android.animation.Animator;
import j0.b;

public abstract class m implements Cloneable
{
    public static final int[] B;
    public static final m$a C;
    public static ThreadLocal<j0.b<Animator, b>> D;
    public android.support.v4.media.b A;
    public String f;
    public long g;
    public long h;
    public TimeInterpolator i;
    public ArrayList<Integer> j;
    public ArrayList<View> k;
    public ArrayList<View> l;
    public u m;
    public u n;
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
    public android.support.v4.media.b y;
    public c z;
    
    static {
        B = new int[] { 2, 1, 3, 4 };
        C = new android.support.v4.media.b() {
            public final Path E1(final float n, final float n2, final float n3, final float n4) {
                final Path path = new Path();
                path.moveTo(n, n2);
                path.lineTo(n3, n4);
                return path;
            }
        };
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
        this.m = new u();
        this.n = new u();
        this.o = null;
        this.p = t5.m.B;
        this.s = new ArrayList<Animator>();
        this.t = 0;
        this.u = false;
        this.v = false;
        this.w = null;
        this.x = new ArrayList<Animator>();
        this.A = t5.m.C;
    }
    
    public static void c(final u u, View view, final t t) {
        ((j0.b)u.a).put((Object)view, (Object)t);
        final int id = view.getId();
        if (id >= 0) {
            if (((SparseArray)u.c).indexOfKey(id) >= 0) {
                ((SparseArray)u.c).put(id, (Object)null);
            }
            else {
                ((SparseArray)u.c).put(id, (Object)view);
            }
        }
        final WeakHashMap a = l0.a;
        final String k = l0$i.k(view);
        if (k != null) {
            if (((j0.b)u.b).containsKey((Object)k)) {
                ((j0.b)u.b).put((Object)k, (Object)null);
            }
            else {
                ((j0.b)u.b).put((Object)k, (Object)view);
            }
        }
        if (view.getParent() instanceof ListView) {
            final ListView listView = (ListView)view.getParent();
            if (((Adapter)listView.getAdapter()).hasStableIds()) {
                final long itemIdAtPosition = ((AdapterView)listView).getItemIdAtPosition(((AdapterView)listView).getPositionForView(view));
                final f f = (f)u.d;
                if (f.f) {
                    f.c();
                }
                if (hg1.a.f(f.i, itemIdAtPosition, f.g) >= 0) {
                    view = (View)((f)u.d).e(itemIdAtPosition, (Long)null);
                    if (view != null) {
                        l0$d.r(view, false);
                        ((f)u.d).g(itemIdAtPosition, (Object)null);
                    }
                }
                else {
                    l0$d.r(view, true);
                    ((f)u.d).g(itemIdAtPosition, (Object)view);
                }
            }
        }
    }
    
    public static j0.b<Animator, b> q() {
        j0.b b;
        if ((b = m.D.get()) == null) {
            b = new j0.b();
            m.D.set(b);
        }
        return b;
    }
    
    public static boolean v(final t t, final t t2, final String s) {
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
    
    public void A() {
        this.I();
        final j0.b<Animator, b> q = q();
        for (final Animator animator : this.x) {
            if (q.containsKey((Object)animator)) {
                this.I();
                if (animator == null) {
                    continue;
                }
                animator.addListener((Animator$AnimatorListener)new n(this, q));
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
    
    public void B(final long h) {
        this.h = h;
    }
    
    public void C(final c z) {
        this.z = z;
    }
    
    public void D(final TimeInterpolator i) {
        this.i = i;
    }
    
    public void E(final android.support.v4.media.b a) {
        if (a == null) {
            this.A = t5.m.C;
        }
        else {
            this.A = a;
        }
    }
    
    public void F(final android.support.v4.media.b y) {
        this.y = y;
    }
    
    public void G(final long g) {
        this.g = g;
    }
    
    public final void I() {
        if (this.t == 0) {
            final ArrayList<d> w = this.w;
            if (w != null && w.size() > 0) {
                final ArrayList list = (ArrayList)this.w.clone();
                for (int size = list.size(), i = 0; i < size; ++i) {
                    ((d)list.get(i)).c(this);
                }
            }
            this.v = false;
        }
        ++this.t;
    }
    
    public String J(String s) {
        final StringBuilder t = a.t(s);
        t.append(this.getClass().getSimpleName());
        t.append("@");
        t.append(Integer.toHexString(this.hashCode()));
        t.append(": ");
        final String s2 = s = t.toString();
        if (this.h != -1L) {
            s = d.k(android.support.v4.media.a.q(s2, "dur("), this.h, ") ");
        }
        String k = s;
        if (this.g != -1L) {
            k = d.k(android.support.v4.media.a.q(s, "dly("), this.g, ") ");
        }
        s = k;
        if (this.i != null) {
            final StringBuilder q = android.support.v4.media.a.q(k, "interp(");
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
        String s3 = b.l(s, "tgts(");
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
                    s = b.l(s3, ", ");
                }
                final StringBuilder t2 = a.t(s);
                t2.append(this.j.get(n2));
                s3 = t2.toString();
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
                String i = s;
                if (n3 > 0) {
                    i = b.l(s, ", ");
                }
                final StringBuilder t3 = a.t(i);
                t3.append(this.k.get(n3));
                s = t3.toString();
                ++n3;
            }
        }
        return b.l(s4, ")");
    }
    
    public void a(final d d) {
        if (this.w == null) {
            this.w = new ArrayList<d>();
        }
        this.w.add(d);
    }
    
    public void b(final View view) {
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
                ((d)list.get(j)).d(this);
            }
        }
    }
    
    public /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.k();
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
                c(this.m, view, t);
            }
            else {
                c(this.n, view, t);
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
            this.y.F1();
            final String[] h = t5.k.h;
            final int n = 0;
            int i = 0;
            while (true) {
                while (i < 2) {
                    if (!t.a.containsKey(h[i])) {
                        final int n2 = n;
                        if (n2 == 0) {
                            this.y.h1(t);
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
                        c(this.m, viewById, t);
                    }
                    else {
                        c(this.n, viewById, t);
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
                    c(this.m, view, t2);
                }
                else {
                    c(this.n, view, t2);
                }
                ++i;
            }
        }
    }
    
    public final void j(final boolean b) {
        if (b) {
            ((j0.b)this.m.a).clear();
            ((SparseArray)this.m.c).clear();
            ((f)this.m.d).a();
        }
        else {
            ((j0.b)this.n.a).clear();
            ((SparseArray)this.n.c).clear();
            ((f)this.n.d).a();
        }
    }
    
    public m k() {
        try {
            final m m = (m)super.clone();
            m.x = new ArrayList<Animator>();
            m.m = new u();
            m.n = new u();
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
    
    public void m(final ViewGroup viewGroup, final u u, final u u2, final ArrayList<t> list, final ArrayList<t> list2) {
        final j0.b<Animator, b> q = q();
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
            if ((t3 != null || t4 != null) && (t3 == null || t4 == null || this.t(t3, t4))) {
                Animator l = this.l(viewGroup, t3, t4);
                if (l != null) {
                    t t7;
                    Animator animator2;
                    View b3;
                    if (t4 != null) {
                        final View b = t4.b;
                        final String[] r = this.r();
                        t t5;
                        if (r != null && r.length > 0) {
                            t5 = new t(b);
                            final t t6 = (t)((j0.b)u2.a).getOrDefault((Object)b, (Object)null);
                            if (t6 != null) {
                                for (int j = 0; j < r.length; ++j) {
                                    final HashMap a = t5.a;
                                    final String s = r[j];
                                    a.put(s, t6.a.get(s));
                                }
                            }
                            for (int h = q.h, k = 0; k < h; ++k) {
                                final b b2 = (b)q.getOrDefault((Object)q.j(k), (Object)null);
                                if (b2.c != null && b2.a == b && b2.b.equals(this.f) && b2.c.equals(t5)) {
                                    l = null;
                                    break;
                                }
                            }
                        }
                        else {
                            t5 = null;
                        }
                        final Animator animator = l;
                        t7 = t5;
                        animator2 = animator;
                        b3 = b;
                    }
                    else {
                        b3 = t3.b;
                        final t t8 = null;
                        animator2 = l;
                        t7 = t8;
                    }
                    min = n;
                    if (animator2 != null) {
                        final android.support.v4.media.b y = this.y;
                        min = n;
                        if (y != null) {
                            final long i2 = y.I1(viewGroup, this, t3, t4);
                            sparseIntArray.put(this.x.size(), (int)i2);
                            min = Math.min(i2, n);
                        }
                        final String f = this.f;
                        final d0 a2 = t5.z.a;
                        q.put((Object)animator2, (Object)new b(b3, f, this, new h0((View)viewGroup), t7));
                        this.x.add(animator2);
                    }
                    continue;
                }
            }
            min = n;
        }
        if (sparseIntArray.size() != 0) {
            for (int n2 = 0; n2 < sparseIntArray.size(); ++n2) {
                final Animator animator3 = this.x.get(sparseIntArray.keyAt(n2));
                animator3.setStartDelay(animator3.getStartDelay() + (sparseIntArray.valueAt(n2) - n));
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
            for (int j = 0; j < ((f)this.m.d).h(); ++j) {
                final View view = (View)((f)this.m.d).i(j);
                if (view != null) {
                    final WeakHashMap a = l0.a;
                    l0$d.r(view, false);
                }
            }
            for (int k = 0; k < ((f)this.n.d).h(); ++k) {
                final View view2 = (View)((f)this.n.d).i(k);
                if (view2 != null) {
                    final WeakHashMap a2 = l0.a;
                    l0$d.r(view2, false);
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
    
    public final t p(final View view, final boolean b) {
        final r o = this.o;
        if (o != null) {
            return ((m)o).p(view, b);
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
    
    public String[] r() {
        return null;
    }
    
    public final t s(final View view, final boolean b) {
        final r o = this.o;
        if (o != null) {
            return ((m)o).s(view, b);
        }
        u u;
        if (b) {
            u = this.m;
        }
        else {
            u = this.n;
        }
        return (t)((j0.b)u.a).getOrDefault((Object)view, (Object)null);
    }
    
    public boolean t(final t t, final t t2) {
        boolean b2;
        final boolean b = b2 = false;
        if (t != null) {
            b2 = b;
            if (t2 != null) {
                final String[] r = this.r();
                if (r != null) {
                    final int length = r.length;
                    int n = 0;
                    while (true) {
                        b2 = b;
                        if (n >= length) {
                            return b2;
                        }
                        if (v(t, t2, r[n])) {
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
                    } while (!v(t, t2, (String)iterator.next()));
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final String toString() {
        return this.J("");
    }
    
    public final boolean u(final View view) {
        final int id = view.getId();
        return (this.j.size() == 0 && this.k.size() == 0) || this.j.contains(id) || this.k.contains(view);
    }
    
    public void w(final View view) {
        if (!this.v) {
            final j0.b<Animator, b> q = q();
            int i = q.h;
            final d0 a = t5.z.a;
            final h0 h0 = new h0(view);
            --i;
            while (i >= 0) {
                final b b = (b)q.n(i);
                if (b.a != null && h0.equals((Object)b.d)) {
                    ((Animator)q.j(i)).pause();
                }
                --i;
            }
            final ArrayList<d> w = this.w;
            if (w != null && w.size() > 0) {
                final ArrayList list = (ArrayList)this.w.clone();
                for (int size = list.size(), j = 0; j < size; ++j) {
                    ((d)list.get(j)).b(this);
                }
            }
            this.u = true;
        }
    }
    
    public void x(final d d) {
        final ArrayList<d> w = this.w;
        if (w == null) {
            return;
        }
        w.remove(d);
        if (this.w.size() == 0) {
            this.w = null;
        }
    }
    
    public void y(final View view) {
        this.k.remove(view);
    }
    
    public void z(final ViewGroup viewGroup) {
        if (this.u) {
            if (!this.v) {
                final j0.b<Animator, b> q = q();
                int h = q.h;
                final d0 a = t5.z.a;
                final h0 h2 = new h0((View)viewGroup);
                while (true) {
                    final int n = h - 1;
                    if (n < 0) {
                        break;
                    }
                    final b b = (b)q.n(n);
                    h = n;
                    if (b.a == null) {
                        continue;
                    }
                    h = n;
                    if (!h2.equals((Object)b.d)) {
                        continue;
                    }
                    ((Animator)q.j(n)).resume();
                    h = n;
                }
                final ArrayList<d> w = this.w;
                if (w != null && w.size() > 0) {
                    final ArrayList list = (ArrayList)this.w.clone();
                    for (int size = list.size(), i = 0; i < size; ++i) {
                        ((d)list.get(i)).e(this);
                    }
                }
            }
            this.u = false;
        }
    }
    
    public static final class b
    {
        public View a;
        public String b;
        public t c;
        public i0 d;
        public m e;
        
        public b(final View a, final String b, final m e, final h0 d, final t c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = (i0)d;
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
