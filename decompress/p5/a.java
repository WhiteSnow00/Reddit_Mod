// 
// Decompiled by Procyon v0.6.0
// 

package p5;

import android.os.BaseBundle;
import java.util.List;
import android.os.Trace;
import java.util.Iterator;
import androidx.startup.StartupException;
import android.os.Bundle;
import android.content.Context;
import java.util.HashSet;
import java.util.HashMap;

public final class a
{
    public static volatile a d;
    public static final Object e;
    public final HashMap a;
    public final HashSet b;
    public final Context c;
    
    static {
        e = new Object();
    }
    
    public a(final Context context) {
        this.c = context.getApplicationContext();
        this.b = new HashSet();
        this.a = new HashMap();
    }
    
    public static a c(final Context context) {
        if (a.d == null) {
            synchronized (a.e) {
                if (a.d == null) {
                    a.d = new a(context);
                }
            }
        }
        return a.d;
    }
    
    public final void a(final Bundle bundle) {
        final String string = this.c.getString(2131952060);
        if (bundle != null) {
            try {
                final HashSet set = new HashSet();
                for (final String s : ((BaseBundle)bundle).keySet()) {
                    if (string.equals(((BaseBundle)bundle).getString(s, (String)null))) {
                        final Class<?> forName = Class.forName(s);
                        if (!b.class.isAssignableFrom(forName)) {
                            continue;
                        }
                        this.b.add(forName);
                    }
                }
                final Iterator iterator2 = this.b.iterator();
                while (iterator2.hasNext()) {
                    this.b((Class)iterator2.next(), set);
                }
            }
            catch (final ClassNotFoundException ex) {
                throw new StartupException((Throwable)ex);
            }
        }
    }
    
    public final Object b(final Class clazz, final HashSet set) {
        Label_0013: {
            if (!t5.a.a()) {
                break Label_0013;
            }
            try {
                Trace.beginSection(clazz.getSimpleName());
                if (!set.contains(clazz)) {
                    if (!this.a.containsKey(clazz)) {
                        set.add(clazz);
                        b b;
                        final Throwable t;
                        try {
                            b = clazz.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                            final List dependencies = b.dependencies();
                            if (!dependencies.isEmpty()) {
                                for (final Class clazz2 : dependencies) {
                                    if (!this.a.containsKey(clazz2)) {
                                        this.b(clazz2, set);
                                    }
                                }
                            }
                        }
                        finally {
                            throw new StartupException(t);
                        }
                        final Object create = b.create(this.c);
                        ((HashSet)t).remove(clazz);
                        this.a.put(clazz, create);
                        return create;
                    }
                    return this.a.get(clazz);
                }
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", clazz.getName()));
            }
            finally {
                Trace.endSection();
            }
        }
    }
    
    public final <T> T d(final Class<? extends b<T>> clazz) {
        synchronized (p5.a.e) {
            Object o;
            if ((o = this.a.get(clazz)) == null) {
                o = this.b(clazz, new HashSet());
            }
            return (T)o;
        }
    }
}
