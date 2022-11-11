// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import android.os.BaseBundle;
import v4.a$a;
import java.util.Arrays;
import rg2.l;
import ml0.a;
import java.util.List;
import sg2.h;
import sg2.e;
import m5.b;
import android.os.Bundle;
import m5.d;
import v4.c;

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
    
    public static final f0 a(final c c) {
        final d d = ((v4.a)c).a.get(SavedStateHandleSupport.a);
        if (d == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        final q0 q0 = ((v4.a)c).a.get(SavedStateHandleSupport.b);
        if (q0 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        final Bundle bundle = ((v4.a)c).a.get(SavedStateHandleSupport.c);
        final String s = ((v4.a)c).a.get(o0.a);
        if (s == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        final b.b b = d.getSavedStateRegistry().b();
        SavedStateHandlesProvider savedStateHandlesProvider;
        if (b instanceof SavedStateHandlesProvider) {
            savedStateHandlesProvider = (SavedStateHandlesProvider)b;
        }
        else {
            savedStateHandlesProvider = null;
        }
        if (savedStateHandlesProvider != null) {
            final g0 c2 = c(q0);
            f0 a;
            if ((a = c2.d.get(s)) == null) {
                final Class<?>[] f = f0.f;
                final boolean b2 = savedStateHandlesProvider.b;
                boolean b3 = true;
                if (!b2) {
                    savedStateHandlesProvider.c = savedStateHandlesProvider.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    savedStateHandlesProvider.b = true;
                    final g0 g0 = savedStateHandlesProvider.d.getValue();
                }
                final Bundle c3 = savedStateHandlesProvider.c;
                Bundle bundle2;
                if (c3 != null) {
                    bundle2 = c3.getBundle(s);
                }
                else {
                    bundle2 = null;
                }
                final Bundle c4 = savedStateHandlesProvider.c;
                if (c4 != null) {
                    c4.remove(s);
                }
                final Bundle c5 = savedStateHandlesProvider.c;
                if (c5 == null || !((BaseBundle)c5).isEmpty()) {
                    b3 = false;
                }
                if (b3) {
                    savedStateHandlesProvider.c = null;
                }
                a = f0.a.a(bundle2, bundle);
                c2.d.put(s, a);
            }
            return a;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }
    
    public static final <T extends d & q0> void b(final T t) {
        e.f((Object)t, "<this>");
        final Lifecycle.State b = ((q)t).getLifecycle().b();
        e.e((Object)b, "lifecycle.currentState");
        if (b == Lifecycle.State.INITIALIZED || b == Lifecycle.State.CREATED) {
            if (t.getSavedStateRegistry().b() == null) {
                final SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t.getSavedStateRegistry(), t);
                t.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", (b.b)savedStateHandlesProvider);
                ((q)t).getLifecycle().a((p)new SavedStateHandleAttacher(savedStateHandlesProvider));
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public static final g0 c(final q0 q0) {
        e.f((Object)q0, "<this>");
        final w w = new w(1);
        final SavedStateHandleSupport$savedStateHandlesVM$1.SavedStateHandleSupport$savedStateHandlesVM$1$1 instance = SavedStateHandleSupport$savedStateHandlesVM$1.SavedStateHandleSupport$savedStateHandlesVM$1$1.INSTANCE;
        final zg2.d a = h.a((Class)g0.class);
        e.f((Object)a, "clazz");
        e.f((Object)instance, "initializer");
        ((List)w.g).add(new v4.d(ml0.a.J(a), (l)instance));
        final Object[] array = ((List)w.g).toArray(new v4.d[0]);
        if (array != null) {
            final v4.d[] array2 = (v4.d[])array;
            final v4.b b = new v4.b((v4.d[])Arrays.copyOf(array2, array2.length));
            final p0 viewModelStore = q0.getViewModelStore();
            e.e((Object)viewModelStore, "owner.viewModelStore");
            Object o;
            if (q0 instanceof i) {
                o = ((i)q0).getDefaultViewModelCreationExtras();
                e.e(o, "{\n        owner.defaultV\u2026ModelCreationExtras\n    }");
            }
            else {
                o = a$a.b;
            }
            return (g0)new n0(viewModelStore, (n0.b)b, (v4.a)o).b(g0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
