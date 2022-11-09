// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.lang.reflect.Constructor;
import ah2.f;
import m5.d;
import m5.b;
import android.os.Bundle;
import android.app.Application;

public final class h0 extends n0$d implements n0$b
{
    public Application a;
    public final n0$a b;
    public Bundle c;
    public Lifecycle d;
    public b e;
    
    public h0(final Application a, final d d, final Bundle c) {
        f.f((Object)d, "owner");
        this.e = d.getSavedStateRegistry();
        this.d = ((q)d).getLifecycle();
        this.c = c;
        this.a = a;
        n0$a c2;
        if (a != null) {
            if (n0$a.c == null) {
                n0$a.c = new n0$a(a);
            }
            c2 = n0$a.c;
            f.c((Object)c2);
        }
        else {
            c2 = new n0$a((Application)null);
        }
        this.b = c2;
    }
    
    public final l0 a(final Class clazz, final v4.d d) {
        final String s = d.a.get(o0.a);
        if (s != null) {
            l0 l0;
            if (d.a.get(SavedStateHandleSupport.a) != null && d.a.get(SavedStateHandleSupport.b) != null) {
                final Application application = d.a.get(m0.a);
                final boolean assignable = a.class.isAssignableFrom(clazz);
                Constructor constructor;
                if (assignable && application != null) {
                    constructor = i0.a(clazz, i0.a);
                }
                else {
                    constructor = i0.a(clazz, i0.b);
                }
                if (constructor == null) {
                    return this.b.a(clazz, d);
                }
                if (assignable && application != null) {
                    l0 = i0.b(clazz, constructor, new Object[] { application, SavedStateHandleSupport.a(d) });
                }
                else {
                    l0 = i0.b(clazz, constructor, new Object[] { SavedStateHandleSupport.a(d) });
                }
            }
            else {
                if (this.d == null) {
                    throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
                }
                l0 = this.d(clazz, s);
            }
            return l0;
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }
    
    public final <T extends l0> T b(final Class<T> clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName != null) {
            return (T)this.d(clazz, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    
    public final void c(final l0 l0) {
        final Lifecycle d = this.d;
        if (d != null) {
            j.a(l0, this.e, d);
        }
    }
    
    public final l0 d(final Class clazz, final String s) {
        if (this.d == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        final boolean assignable = a.class.isAssignableFrom(clazz);
        Constructor constructor;
        if (assignable && this.a != null) {
            constructor = i0.a(clazz, i0.a);
        }
        else {
            constructor = i0.a(clazz, i0.b);
        }
        if (constructor == null) {
            l0 l0;
            if (this.a != null) {
                l0 = this.b.b(clazz);
            }
            else {
                if (n0.c.a == null) {
                    n0.c.a = new n0.c();
                }
                final n0.c a = n0.c.a;
                f.c((Object)a);
                l0 = a.b((Class<l0>)clazz);
            }
            return l0;
        }
        final b e = this.e;
        final Lifecycle d = this.d;
        final Bundle c = this.c;
        final Bundle a2 = e.a(s);
        final Class[] f = f0.f;
        final f0 a3 = f0$a.a(a2, c);
        final SavedStateHandleController savedStateHandleController = new SavedStateHandleController(s, a3);
        if (!savedStateHandleController.g) {
            savedStateHandleController.g = true;
            d.a((p)savedStateHandleController);
            e.c(s, a3.e);
            j.b(d, e);
            l0 l2 = null;
            Label_0245: {
                if (assignable) {
                    final Application a4 = this.a;
                    if (a4 != null) {
                        l2 = i0.b(clazz, constructor, new Object[] { a4, a3 });
                        break Label_0245;
                    }
                }
                l2 = i0.b(clazz, constructor, new Object[] { a3 });
            }
            synchronized (l2.a) {
                Object value = l2.a.get("androidx.lifecycle.savedstate.vm.tag");
                if (value == null) {
                    l2.a.put("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
                }
                monitorexit(l2.a);
                if (value == null) {
                    value = savedStateHandleController;
                }
                if (l2.c) {
                    l0.a(value);
                }
                return l2;
            }
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}
