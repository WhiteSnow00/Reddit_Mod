// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.Map;
import a40.f;
import n.b;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import n.a;

public final class r extends Lifecycle
{
    public a<p, r.r$a> b;
    public State c;
    public final WeakReference<q> d;
    public int e;
    public boolean f;
    public boolean g;
    public ArrayList<State> h;
    public final boolean i;
    
    public r(final q q) {
        this.b = new a<p, r.r$a>();
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = new ArrayList<State>();
        this.d = new WeakReference<q>(q);
        this.c = State.INITIALIZED;
        this.i = true;
    }
    
    @Override
    public final void a(final p p) {
        this.e("addObserver");
        final State c = this.c;
        State state = State.DESTROYED;
        if (c != state) {
            state = State.INITIALIZED;
        }
        final r.r$a r$a = new r.r$a(p, state);
        if (this.b.b(p, r$a) != null) {
            return;
        }
        final q q = this.d.get();
        if (q == null) {
            return;
        }
        final boolean b = this.e != 0 || this.f;
        State state2 = this.d(p);
        ++this.e;
        while (r$a.a.compareTo(state2) < 0 && this.b.j.containsKey(p)) {
            this.h.add(r$a.a);
            final Event up = Event.upFrom(r$a.a);
            if (up == null) {
                final StringBuilder k = a.k("no event up from ");
                k.append(r$a.a);
                throw new IllegalStateException(k.toString());
            }
            r$a.a(q, up);
            final ArrayList<State> h = this.h;
            h.remove(h.size() - 1);
            state2 = this.d(p);
        }
        if (!b) {
            this.i();
        }
        --this.e;
    }
    
    @Override
    public final State b() {
        return this.c;
    }
    
    @Override
    public final void c(final p p) {
        this.e("removeObserver");
        this.b.c(p);
    }
    
    public final State d(final p p) {
        final a<p, r.r$a> b = this.b;
        final boolean containsKey = b.j.containsKey(p);
        State state = null;
        b.c<K, V> i;
        if (containsKey) {
            i = (b.c<K, V>)b.j.get(p).i;
        }
        else {
            i = null;
        }
        State a;
        if (i != null) {
            a = ((r.r$a)i.g).a;
        }
        else {
            a = null;
        }
        if (!this.h.isEmpty()) {
            final ArrayList<State> h = this.h;
            state = h.get(h.size() - 1);
        }
        final State c = this.c;
        if (a == null || a.compareTo(c) >= 0) {
            a = c;
        }
        if (state == null || state.compareTo(a) >= 0) {
            state = a;
        }
        return state;
    }
    
    public final void e(final String s) {
        if (this.i && !m.a.r2().s2()) {
            throw new IllegalStateException(a40.f.n("Method ", s, " must be called on the main thread"));
        }
    }
    
    public final void f(final Event event) {
        this.e("handleLifecycleEvent");
        this.g(event.getTargetState());
    }
    
    public final void g(final State c) {
        final State c2 = this.c;
        if (c2 == c) {
            return;
        }
        if (c2 == State.INITIALIZED && c == State.DESTROYED) {
            final StringBuilder k = a.k("no event down from ");
            k.append(this.c);
            throw new IllegalStateException(k.toString());
        }
        this.c = c;
        if (!this.f && this.e == 0) {
            this.f = true;
            this.i();
            this.f = false;
            if (this.c == State.DESTROYED) {
                this.b = new a<p, r.r$a>();
            }
            return;
        }
        this.g = true;
    }
    
    public final void h(final State state) {
        this.e("setCurrentState");
        this.g(state);
    }
    
    public final void i() {
        final q q = this.d.get();
        if (q == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            final a<p, r.r$a> b = this.b;
            final int i = b.i;
            boolean b2 = true;
            if (i != 0) {
                final State a = b.f.g.a;
                final State a2 = b.g.g.a;
                if (a != a2 || this.c != a2) {
                    b2 = false;
                }
            }
            if (b2) {
                this.g = false;
                return;
            }
            this.g = false;
            if (this.c.compareTo(b.f.g.a) < 0) {
                final a<p, r.r$a> b3 = this.b;
                final b.b b4 = new b.b<p, r.r$a>((b.c<Object, Object>)b3.g, (b.c<Object, Object>)b3.f);
                b3.h.put((b.f<p, r.r$a>)b4, Boolean.FALSE);
                while (b4.hasNext() && !this.g) {
                    final Map.Entry entry = (Map.Entry)b4.next();
                    final r.r$a r$a = (r.r$a)entry.getValue();
                    while (r$a.a.compareTo(this.c) > 0 && !this.g && this.b.j.containsKey(entry.getKey())) {
                        final Event down = Event.downFrom(r$a.a);
                        if (down == null) {
                            final StringBuilder k = a.k("no event down from ");
                            k.append(r$a.a);
                            throw new IllegalStateException(k.toString());
                        }
                        this.h.add(down.getTargetState());
                        r$a.a(q, down);
                        final ArrayList<State> h = this.h;
                        h.remove(h.size() - 1);
                    }
                }
            }
            final b.c<p, r.r$a> g = this.b.g;
            if (this.g || g == null || this.c.compareTo(g.g.a) <= 0) {
                continue;
            }
            final a<p, r.r$a> b5 = this.b;
            b5.getClass();
            final b.d d = b5.new d();
            b5.h.put((b.f<p, r.r$a>)d, Boolean.FALSE);
            while (d.hasNext() && !this.g) {
                final Map.Entry entry2 = (Map.Entry)d.next();
                final r.r$a r$a2 = (r.r$a)entry2.getValue();
                while (r$a2.a.compareTo(this.c) < 0 && !this.g && this.b.j.containsKey(entry2.getKey())) {
                    this.h.add(r$a2.a);
                    final Event up = Event.upFrom(r$a2.a);
                    if (up == null) {
                        final StringBuilder j = a.k("no event up from ");
                        j.append(r$a2.a);
                        throw new IllegalStateException(j.toString());
                    }
                    r$a2.a(q, up);
                    final ArrayList<State> h2 = this.h;
                    h2.remove(h2.size() - 1);
                }
            }
        }
    }
}
