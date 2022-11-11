// 
// Decompiled by Procyon v0.6.0
// 

package m5;

import android.os.BaseBundle;
import androidx.lifecycle.j;
import java.util.Iterator;
import java.util.Map;
import n.b$e;
import sg2.e;
import androidx.savedstate.Recreator$a;
import android.os.Bundle;

public final class b
{
    public final b<String, b> a;
    public boolean b;
    public Bundle c;
    public boolean d;
    public Recreator$a e;
    public boolean f;
    
    public b() {
        this.a = (b<String, b>)new b();
        this.f = true;
    }
    
    public final Bundle a(final String s) {
        sg2.e.f((Object)s, "key");
        if (!this.d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        final Bundle c = this.c;
        if (c != null) {
            Bundle bundle;
            if (c != null) {
                bundle = c.getBundle(s);
            }
            else {
                bundle = null;
            }
            final Bundle c2 = this.c;
            if (c2 != null) {
                c2.remove(s);
            }
            final Bundle c3 = this.c;
            int n = 0;
            if (c3 != null) {
                n = n;
                if (!((BaseBundle)c3).isEmpty()) {
                    n = 1;
                }
            }
            if (n == 0) {
                this.c = null;
            }
            return bundle;
        }
        return null;
    }
    
    public final b b() {
        final Iterator iterator = this.a.iterator();
        String s;
        b b;
        do {
            final b$e b$e = (b$e)iterator;
            if (!b$e.hasNext()) {
                b = null;
                return b;
            }
            final Map.Entry entry = (Map.Entry)b$e.next();
            sg2.e.e((Object)entry, "components");
            s = (String)entry.getKey();
            b = (b)entry.getValue();
        } while (!sg2.e.a((Object)s, (Object)"androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return b;
    }
    
    public final void c(final String s, final b b) {
        sg2.e.f((Object)s, "key");
        sg2.e.f((Object)b, "provider");
        if (this.a.b((Object)s, (Object)b) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }
    
    public final void d() {
        if (this.f) {
            Recreator$a e;
            if ((e = this.e) == null) {
                e = new Recreator$a(this);
            }
            this.e = e;
            try {
                j.a.class.getDeclaredConstructor((Class<?>[])new Class[0]);
                final Recreator$a e2 = this.e;
                if (e2 != null) {
                    e2.a.add(j.a.class.getName());
                }
                return;
            }
            catch (final NoSuchMethodException ex) {
                final StringBuilder r = a.r("Class ");
                r.append(j.a.class.getSimpleName());
                r.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(r.toString(), ex);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
    
    public interface a
    {
        void a(final d p0);
    }
    
    public interface b
    {
        Bundle D();
    }
}
