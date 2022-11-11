// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import v4.c;
import v4.a$a;
import sg2.e;
import v4.a;

public final class n0
{
    public final p0 a;
    public final b b;
    public final a c;
    
    public n0(final p0 p2, final b b) {
        e.f((Object)p2, "store");
        e.f((Object)b, "factory");
        this(p2, b, (a)a$a.b);
    }
    
    public n0(final p0 a, final b b, final a c) {
        e.f((Object)a, "store");
        e.f((Object)b, "factory");
        e.f((Object)c, "defaultCreationExtras");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public n0(final q0 q0) {
        e.f((Object)q0, "owner");
        final p0 viewModelStore = q0.getViewModelStore();
        e.e((Object)viewModelStore, "owner.viewModelStore");
        final boolean b = q0 instanceof i;
        Object o;
        if (b) {
            o = ((i)q0).getDefaultViewModelProviderFactory();
            e.e(o, "owner.defaultViewModelProviderFactory");
        }
        else {
            if (n0.n0$c.a == null) {
                n0.n0$c.a = new n0.n0$c();
            }
            o = n0.n0$c.a;
            e.c(o);
        }
        Object o2;
        if (b) {
            o2 = ((i)q0).getDefaultViewModelCreationExtras();
            e.e(o2, "{\n        owner.defaultV\u2026ModelCreationExtras\n    }");
        }
        else {
            o2 = a$a.b;
        }
        this(viewModelStore, (b)o, (a)o2);
    }
    
    public final <T extends l0> T a(final Class<T> clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return (T)this.b(clazz, sb.toString());
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    
    public final l0 b(Class o, final String s) {
        e.f((Object)s, "key");
        final l0 l0 = this.a.a.get(s);
        if (!((Class)o).isInstance(l0)) {
            final c c = new c(this.c);
            ((a)c).a.put(o0.a, s);
            try {
                o = this.b.a((Class)o, c);
            }
            catch (final AbstractMethodError abstractMethodError) {
                o = this.b.b((Class<Class>)o);
            }
            final l0 l2 = this.a.a.put(s, (l0)o);
            if (l2 != null) {
                l2.b();
            }
            return (l0)o;
        }
        final b b = this.b;
        d d;
        if (b instanceof d) {
            d = (d)b;
        }
        else {
            d = null;
        }
        if (d != null) {
            e.e((Object)l0, "viewModel");
            d.c(l0);
        }
        if (l0 != null) {
            return l0;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
    }
    
    public interface b
    {
        default l0 a(final Class clazz, final c c) {
            return this.b((Class<l0>)clazz);
        }
        
        default <T extends l0> T b(final Class<T> clazz) {
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }
    }
    
    public static class d
    {
        public void c(final l0 l0) {
        }
    }
}
