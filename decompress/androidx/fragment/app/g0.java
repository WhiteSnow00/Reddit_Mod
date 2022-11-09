// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import java.util.Iterator;
import android.util.Log;
import androidx.lifecycle.n0$b;
import androidx.lifecycle.p0;
import java.util.HashMap;
import androidx.lifecycle.l0;

public final class g0 extends l0
{
    public static final g0$a j;
    public final HashMap<String, Fragment> d;
    public final HashMap<String, g0> e;
    public final HashMap<String, p0> f;
    public final boolean g;
    public boolean h;
    public boolean i;
    
    static {
        j = new n0$b() {
            public final <T extends l0> T b(final Class<T> clazz) {
                return (T)new g0(true);
            }
        };
    }
    
    public g0(final boolean g) {
        this.d = new HashMap<String, Fragment>();
        this.e = new HashMap<String, g0>();
        this.f = new HashMap<String, p0>();
        this.h = false;
        this.i = false;
        this.g = g;
    }
    
    public final void b() {
        if (d0.M(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.h = true;
    }
    
    public final void c(final Fragment fragment) {
        if (this.i) {
            if (d0.M(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.d.containsKey(fragment.mWho)) {
            return;
        }
        this.d.put(fragment.mWho, fragment);
        if (d0.M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public final void d(final Fragment fragment) {
        if (d0.M(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
            Log.d("FragmentManager", sb.toString());
        }
        this.e(fragment.mWho);
    }
    
    public final void e(final String s) {
        final g0 g0 = this.e.get(s);
        if (g0 != null) {
            g0.b();
            this.e.remove(s);
        }
        final p0 p = this.f.get(s);
        if (p != null) {
            p.a();
            this.f.remove(s);
        }
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && g0.class == o.getClass()) {
            final g0 g0 = (g0)o;
            if (!this.d.equals(g0.d) || !this.e.equals(g0.e) || !this.f.equals(g0.f)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final void f(final Fragment fragment) {
        if (this.i) {
            if (d0.M(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.d.remove(fragment.mWho) != null && d0.M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
    }
    
    public final int hashCode() {
        return this.f.hashCode() + (this.e.hashCode() + this.d.hashCode() * 31) * 31;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        final Iterator<Fragment> iterator = this.d.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        final Iterator<String> iterator2 = this.e.keySet().iterator();
        while (iterator2.hasNext()) {
            sb.append(iterator2.next());
            if (iterator2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        final Iterator<String> iterator3 = this.f.keySet().iterator();
        while (iterator3.hasNext()) {
            sb.append(iterator3.next());
            if (iterator3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
