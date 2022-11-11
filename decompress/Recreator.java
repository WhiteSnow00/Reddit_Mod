// 
// Decompiled by Procyon v0.6.0
// 

package androidx.savedstate;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Bundle;
import ak0.m;
import m5.b$a;
import androidx.lifecycle.p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import ah2.f;
import m5.d;
import kotlin.Metadata;
import androidx.lifecycle.o;

@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003" }, d2 = { "Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/o;", "a", "savedstate_release" }, k = 1, mv = { 1, 6, 0 })
public final class Recreator implements o
{
    public final d f;
    
    public Recreator(final d f) {
        ah2.f.f((Object)f, "owner");
        this.f = f;
    }
    
    @Override
    public final void f(q ex, Lifecycle.Event subclass) {
        if (subclass != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError((Object)"Next event must be ON_CREATE");
        }
        ((q)ex).getLifecycle().c((p)this);
        final Bundle a = this.f.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a == null) {
            return;
        }
        final ArrayList stringArrayList = a.getStringArrayList("classes_to_restore");
        if (stringArrayList != null) {
            final Iterator iterator = stringArrayList.iterator();
            while (iterator.hasNext()) {
                ex = (NoSuchMethodException)iterator.next();
                try {
                    subclass = (Exception)Class.forName((String)ex, false, Recreator.class.getClassLoader()).asSubclass(b$a.class);
                    ah2.f.e((Object)subclass, "{\n                Class.\u2026class.java)\n            }");
                    try {
                        final Constructor<Object> declaredConstructor = ((Class<Object>)subclass).getDeclaredConstructor((Class<?>[])new Class[0]);
                        declaredConstructor.setAccessible(true);
                        try {
                            final Object instance = declaredConstructor.newInstance(new Object[0]);
                            ah2.f.e(instance, "{\n                constr\u2026wInstance()\n            }");
                            ((b$a)instance).a(this.f);
                        }
                        catch (final Exception subclass) {
                            throw new RuntimeException(m.l("Failed to instantiate ", (String)ex), subclass);
                        }
                    }
                    catch (final NoSuchMethodException ex) {
                        final StringBuilder k = a.k("Class ");
                        k.append(((Class)subclass).getSimpleName());
                        k.append(" must have default constructor in order to be automatically recreated");
                        throw new IllegalStateException(k.toString(), ex);
                    }
                }
                catch (final ClassNotFoundException ex2) {
                    throw new RuntimeException(a40.f.n("Class ", (String)ex, " wasn't found"), ex2);
                }
                break;
            }
            return;
        }
        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
    }
}
