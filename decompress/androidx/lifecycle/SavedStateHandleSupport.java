// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import android.os.BaseBundle;
import v4.b;
import java.util.Arrays;
import zg2.l;
import v4.e;
import a80.a;
import ah2.i;
import v4.c;
import ah2.f;
import m5.b$b;
import android.os.Bundle;
import v4.d;

public final class SavedStateHandleSupport
{
    public static final SavedStateHandleSupport$b a;
    public static final SavedStateHandleSupport$c b;
    public static final SavedStateHandleSupport$a c;
    
    static {
        a = new Object() {};
        b = new Object() {};
        c = new Object() {};
    }
    
    public static final f0 a(final d d) {
        final m5.d d2 = d.a.get(SavedStateHandleSupport.a);
        if (d2 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        final q0 q0 = d.a.get(SavedStateHandleSupport.b);
        if (q0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        final Bundle bundle = d.a.get(SavedStateHandleSupport.c);
        final String s = d.a.get(o0.a);
        if (s == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        final b$b b = d2.getSavedStateRegistry().b();
        SavedStateHandlesProvider savedStateHandlesProvider;
        if (b instanceof SavedStateHandlesProvider) {
            savedStateHandlesProvider = (SavedStateHandlesProvider)b;
        }
        else {
            savedStateHandlesProvider = null;
        }
        if (savedStateHandlesProvider != null) {
            final g0 c = c(q0);
            f0 a;
            if ((a = c.d.get(s)) == null) {
                final Class[] f = f0.f;
                final boolean b2 = savedStateHandlesProvider.b;
                boolean b3 = true;
                if (!b2) {
                    savedStateHandlesProvider.c = savedStateHandlesProvider.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    savedStateHandlesProvider.b = true;
                    final g0 g0 = (g0)savedStateHandlesProvider.d.getValue();
                }
                final Bundle c2 = savedStateHandlesProvider.c;
                Bundle bundle2;
                if (c2 != null) {
                    bundle2 = c2.getBundle(s);
                }
                else {
                    bundle2 = null;
                }
                final Bundle c3 = savedStateHandlesProvider.c;
                if (c3 != null) {
                    c3.remove(s);
                }
                final Bundle c4 = savedStateHandlesProvider.c;
                if (c4 == null || !((BaseBundle)c4).isEmpty()) {
                    b3 = false;
                }
                if (b3) {
                    savedStateHandlesProvider.c = null;
                }
                a = f0$a.a(bundle2, bundle);
                c.d.put(s, a);
            }
            return a;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }
    
    public static final <T extends m5.d & q0> void b(final T t) {
        f.f((Object)t, "<this>");
        final Lifecycle.State b = ((q)t).getLifecycle().b();
        f.e((Object)b, "lifecycle.currentState");
        if (b == Lifecycle.State.INITIALIZED || b == Lifecycle.State.CREATED) {
            if (t.getSavedStateRegistry().b() == null) {
                final SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t.getSavedStateRegistry(), t);
                t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", (b$b)savedStateHandlesProvider);
                ((q)t).getLifecycle().a((p)new SavedStateHandleAttacher(savedStateHandlesProvider));
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public static final g0 c(final q0 q0) {
        f.f((Object)q0, "<this>");
        final c c = new c(0);
        final SavedStateHandleSupport$savedStateHandlesVM$1$1 instance = SavedStateHandleSupport$savedStateHandlesVM$1$1.INSTANCE;
        final hh2.d a = i.a((Class)g0.class);
        f.f((Object)a, "clazz");
        f.f((Object)instance, "initializer");
        c.a.add(new e(a80.a.O(a), (zg2.l<? super v4.a, ? extends l0>)instance));
        final e[] array = c.a.toArray(new e[0]);
        if (array != null) {
            final e[] array2 = array;
            final b b = new b((e<?>[])Arrays.copyOf(array2, array2.length));
            final p0 viewModelStore = q0.getViewModelStore();
            f.e((Object)viewModelStore, "owner.viewModelStore");
            v4.a a2;
            if (q0 instanceof androidx.lifecycle.i) {
                a2 = ((androidx.lifecycle.i)q0).getDefaultViewModelCreationExtras();
                f.e((Object)a2, "{\n        owner.defaultV\u2026ModelCreationExtras\n    }");
            }
            else {
                a2 = v4.a.a.b;
            }
            return (g0)new n0(viewModelStore, (n0$b)b, a2).b((Class)g0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
