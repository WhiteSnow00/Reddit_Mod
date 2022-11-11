// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.lang.reflect.Executable;
import java.lang.reflect.Constructor;
import java.util.List;
import v4.c;
import sg2.e;
import m5.d;
import m5.b;
import android.os.Bundle;
import android.app.Application;

public final class h0 extends d implements b
{
    public Application a;
    public final n0$a b;
    public Bundle c;
    public Lifecycle d;
    public m5.b e;
    
    public h0(final Application a, final m5.d d, final Bundle c) {
        sg2.e.f((Object)d, "owner");
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
            sg2.e.c((Object)c2);
        }
        else {
            c2 = new n0$a((Application)null);
        }
        this.b = c2;
    }
    
    @Override
    public final l0 a(final Class clazz, final c c) {
        final String s = ((v4.a)c).a.get(o0.a);
        if (s != null) {
            l0 l0;
            if (((v4.a)c).a.get(SavedStateHandleSupport.a) != null && ((v4.a)c).a.get(SavedStateHandleSupport.b) != null) {
                final Application application = ((v4.a)c).a.get(m0.a);
                final boolean assignable = a.class.isAssignableFrom(clazz);
                Executable executable;
                if (assignable && application != null) {
                    executable = i0.a((Class<T>)clazz, i0.a);
                }
                else {
                    executable = i0.a((Class<T>)clazz, i0.b);
                }
                if (executable == null) {
                    return this.b.a(clazz, c);
                }
                if (assignable && application != null) {
                    l0 = i0.b(clazz, (Constructor<l0>)executable, application, SavedStateHandleSupport.a(c));
                }
                else {
                    l0 = i0.b(clazz, (Constructor<l0>)executable, SavedStateHandleSupport.a(c));
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
    
    @Override
    public final <T extends l0> T b(final Class<T> clazz) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName != null) {
            return (T)this.d(clazz, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    
    @Override
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
        Executable executable;
        if (assignable && this.a != null) {
            executable = i0.a((Class<T>)clazz, i0.a);
        }
        else {
            executable = i0.a((Class<T>)clazz, i0.b);
        }
        if (executable == null) {
            l0 l0;
            if (this.a != null) {
                l0 = this.b.b(clazz);
            }
            else {
                if (n0$c.a == null) {
                    n0$c.a = new n0$c();
                }
                final n0$c a = n0$c.a;
                sg2.e.c((Object)a);
                l0 = a.b(clazz);
            }
            return l0;
        }
        final m5.b e = this.e;
        final Lifecycle d = this.d;
        final Bundle c = this.c;
        final Bundle a2 = e.a(s);
        final Class<?>[] f = f0.f;
        final f0 a3 = f0.a.a(a2, c);
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
                        l2 = i0.b(clazz, (Constructor<l0>)executable, a4, a3);
                        break Label_0245;
                    }
                }
                l2 = i0.b(clazz, (Constructor<l0>)executable, a3);
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
