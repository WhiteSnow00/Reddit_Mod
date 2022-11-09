// 
// Decompiled by Procyon v0.6.0
// 

package u5;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.m0;
import android.util.AndroidRuntimeException;
import ak0.n;
import android.view.View;
import android.support.v4.media.a;
import bj2.d;
import android.animation.TimeInterpolator;
import java.util.Iterator;
import android.view.ViewGroup;
import java.util.ArrayList;

public class r extends m
{
    public ArrayList<m> E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    
    public r() {
        this.E = new ArrayList<m>();
        this.F = true;
        this.H = false;
        this.I = 0;
    }
    
    @Override
    public final void A(final ViewGroup viewGroup) {
        super.A(viewGroup);
        for (int size = this.E.size(), i = 0; i < size; ++i) {
            this.E.get(i).A(viewGroup);
        }
    }
    
    @Override
    public final void B() {
        if (this.E.isEmpty()) {
            this.I();
            this.n();
            return;
        }
        final r.r$b r$b = new r.r$b(this);
        final Iterator<m> iterator = this.E.iterator();
        while (iterator.hasNext()) {
            iterator.next().a((d)r$b);
        }
        this.G = this.E.size();
        if (!this.F) {
            for (int i = 1; i < this.E.size(); ++i) {
                this.E.get(i - 1).a((d)new r$a((m)this.E.get(i)));
            }
            final m m = this.E.get(0);
            if (m != null) {
                m.B();
            }
        }
        else {
            final Iterator<m> iterator2 = this.E.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().B();
            }
        }
    }
    
    @Override
    public final void D(final c z) {
        super.z = z;
        this.I |= 0x8;
        for (int size = this.E.size(), i = 0; i < size; ++i) {
            this.E.get(i).D(z);
        }
    }
    
    @Override
    public final void F(final bj2.d d) {
        super.F(d);
        this.I |= 0x4;
        if (this.E != null) {
            for (int i = 0; i < this.E.size(); ++i) {
                this.E.get(i).F(d);
            }
        }
    }
    
    @Override
    public final void G(final a y) {
        super.y = y;
        this.I |= 0x2;
        for (int size = this.E.size(), i = 0; i < size; ++i) {
            this.E.get(i).G(y);
        }
    }
    
    @Override
    public final void H(final long g) {
        super.g = g;
    }
    
    @Override
    public final String J(final String s) {
        String s2 = super.J(s);
        for (int i = 0; i < this.E.size(); ++i) {
            final StringBuilder q = d.q(s2, "\n");
            final m m = this.E.get(i);
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("  ");
            q.append(m.J(sb.toString()));
            s2 = q.toString();
        }
        return s2;
    }
    
    public final void K(final d d) {
        super.a(d);
    }
    
    public final void L(final View view) {
        for (int i = 0; i < this.E.size(); ++i) {
            this.E.get(i).c(view);
        }
        super.k.add(view);
    }
    
    public final void M(final m m) {
        this.E.add(m);
        m.o = this;
        final long h = super.h;
        if (h >= 0L) {
            m.C(h);
        }
        if ((this.I & 0x1) != 0x0) {
            m.E(super.i);
        }
        if ((this.I & 0x2) != 0x0) {
            m.G(super.y);
        }
        if ((this.I & 0x4) != 0x0) {
            m.F(super.A);
        }
        if ((this.I & 0x8) != 0x0) {
            m.D(super.z);
        }
    }
    
    public final m N(final int n) {
        if (n >= 0 && n < this.E.size()) {
            return this.E.get(n);
        }
        return null;
    }
    
    public final void O(final long h) {
        super.h = h;
        if (h >= 0L) {
            final ArrayList<m> e = this.E;
            if (e != null) {
                for (int size = e.size(), i = 0; i < size; ++i) {
                    this.E.get(i).C(h);
                }
            }
        }
    }
    
    public final void P(final TimeInterpolator i) {
        this.I |= 0x1;
        final ArrayList<m> e = this.E;
        if (e != null) {
            for (int size = e.size(), j = 0; j < size; ++j) {
                this.E.get(j).E(i);
            }
        }
        super.i = i;
    }
    
    public final void Q(final int n) {
        if (n != 0) {
            if (n != 1) {
                throw new AndroidRuntimeException(n.k("Invalid parameter for TransitionSet ordering: ", n));
            }
            this.F = false;
        }
        else {
            this.F = true;
        }
    }
    
    @Override
    public final void a(final d d) {
        super.a(d);
    }
    
    @Override
    public final void cancel() {
        super.cancel();
        for (int size = this.E.size(), i = 0; i < size; ++i) {
            this.E.get(i).cancel();
        }
    }
    
    @Override
    public final void e(final t t) {
        if (this.v(t.b)) {
            for (final m m : this.E) {
                if (m.v(t.b)) {
                    m.e(t);
                    t.c.add(m);
                }
            }
        }
    }
    
    @Override
    public final void g(final t t) {
        super.g(t);
        for (int size = this.E.size(), i = 0; i < size; ++i) {
            this.E.get(i).g(t);
        }
    }
    
    @Override
    public final void h(final t t) {
        if (this.v(t.b)) {
            for (final m m : this.E) {
                if (m.v(t.b)) {
                    m.h(t);
                    t.c.add(m);
                }
            }
        }
    }
    
    @Override
    public final m k() {
        final r o = (r)super.k();
        o.E = new ArrayList<m>();
        for (int size = this.E.size(), i = 0; i < size; ++i) {
            final m k = this.E.get(i).k();
            o.E.add(k);
            k.o = o;
        }
        return o;
    }
    
    @Override
    public final void m(final ViewGroup viewGroup, final m0 m0, final m0 m2, final ArrayList<t> list, final ArrayList<t> list2) {
        final long g = super.g;
        for (int size = this.E.size(), i = 0; i < size; ++i) {
            final m j = this.E.get(i);
            if (g > 0L && (this.F || i == 0)) {
                final long g2 = j.g;
                if (g2 > 0L) {
                    j.H(g2 + g);
                }
                else {
                    j.H(g);
                }
            }
            j.m(viewGroup, m0, m2, list, list2);
        }
    }
    
    @Override
    public final void p(final ConstraintLayout constraintLayout) {
        super.p(constraintLayout);
        for (int size = this.E.size(), i = 0; i < size; ++i) {
            this.E.get(i).p(constraintLayout);
        }
    }
    
    @Override
    public final void x(final View view) {
        super.x(view);
        for (int size = this.E.size(), i = 0; i < size; ++i) {
            this.E.get(i).x(view);
        }
    }
    
    @Override
    public final void y(final d d) {
        super.y(d);
    }
    
    @Override
    public final void z(final View view) {
        for (int i = 0; i < this.E.size(); ++i) {
            this.E.get(i).z(view);
        }
        super.k.remove(view);
    }
}
