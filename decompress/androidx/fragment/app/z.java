// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.view.View;
import android.content.Context;
import java.util.Iterator;
import android.os.Bundle;
import java.util.concurrent.CopyOnWriteArrayList;

public final class z
{
    public final CopyOnWriteArrayList<a> a;
    public final d0 b;
    
    public z(final d0 b) {
        this.a = new CopyOnWriteArrayList<a>();
        this.b = b;
    }
    
    public final void a(final Fragment fragment, final Bundle bundle, final boolean b) {
        final Fragment x = this.b.x;
        if (x != null) {
            x.getParentFragmentManager().n.a(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentActivityCreated(this.b, fragment, bundle);
            }
        }
    }
    
    public final void b(final Fragment fragment, final boolean b) {
        final d0 b2 = this.b;
        final Context g = b2.v.g;
        final Fragment x = b2.x;
        if (x != null) {
            x.getParentFragmentManager().n.b(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentAttached(this.b, fragment, g);
            }
        }
    }
    
    public final void c(final Fragment fragment, final Bundle bundle, final boolean b) {
        final Fragment x = this.b.x;
        if (x != null) {
            x.getParentFragmentManager().n.c(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentCreated(this.b, fragment, bundle);
            }
        }
    }
    
    public final void d(final Fragment fragment, final boolean b) {
        final Fragment x = this.b.x;
        if (x != null) {
            x.getParentFragmentManager().n.d(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentDestroyed(this.b, fragment);
            }
        }
    }
    
    public final void e(final Fragment fragment, final boolean b) {
        final Fragment x = this.b.x;
        if (x != null) {
            x.getParentFragmentManager().n.e(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentDetached(this.b, fragment);
            }
        }
    }
    
    public final void f(final Fragment fragment, final boolean b) {
        final Fragment x = this.b.x;
        if (x != null) {
            x.getParentFragmentManager().n.f(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentPaused(this.b, fragment);
            }
        }
    }
    
    public final void g(final Fragment fragment, final boolean b) {
        final d0 b2 = this.b;
        final Context g = b2.v.g;
        final Fragment x = b2.x;
        if (x != null) {
            x.getParentFragmentManager().n.g(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentPreAttached(this.b, fragment, g);
            }
        }
    }
    
    public final void h(final Fragment fragment, final Bundle bundle, final boolean b) {
        final Fragment x = this.b.x;
        if (x != null) {
            x.getParentFragmentManager().n.h(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentPreCreated(this.b, fragment, bundle);
            }
        }
    }
    
    public final void i(final Fragment fragment, final boolean b) {
        final Fragment x = this.b.x;
        if (x != null) {
            x.getParentFragmentManager().n.i(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentResumed(this.b, fragment);
            }
        }
    }
    
    public final void j(final Fragment fragment, final Bundle bundle, final boolean b) {
        final Fragment x = this.b.x;
        if (x != null) {
            x.getParentFragmentManager().n.j(fragment, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentSaveInstanceState(this.b, fragment, bundle);
            }
        }
    }
    
    public final void k(final Fragment fragment, final boolean b) {
        final Fragment x = this.b.x;
        if (x != null) {
            x.getParentFragmentManager().n.k(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentStarted(this.b, fragment);
            }
        }
    }
    
    public final void l(final Fragment fragment, final boolean b) {
        final Fragment x = this.b.x;
        if (x != null) {
            x.getParentFragmentManager().n.l(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentStopped(this.b, fragment);
            }
        }
    }
    
    public final void m(final Fragment fragment, final View view, final Bundle bundle, final boolean b) {
        final Fragment x = this.b.x;
        if (x != null) {
            x.getParentFragmentManager().n.m(fragment, view, bundle, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentViewCreated(this.b, fragment, view, bundle);
            }
        }
    }
    
    public final void n(final Fragment fragment, final boolean b) {
        final Fragment x = this.b.x;
        if (x != null) {
            x.getParentFragmentManager().n.n(fragment, true);
        }
        for (final a a : this.a) {
            if (!b || a.b) {
                a.a.onFragmentViewDestroyed(this.b, fragment);
            }
        }
    }
    
    public static final class a
    {
        public final d0$k a;
        public final boolean b;
        
        public a(final d0$k a) {
            this.a = a;
            this.b = true;
        }
    }
}
