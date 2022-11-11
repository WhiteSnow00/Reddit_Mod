// 
// Decompiled by Procyon v0.6.0
// 

package androidx.lifecycle;

import java.util.Iterator;
import java.util.Collection;
import java.util.HashSet;
import m5.d;
import java.util.HashMap;
import m5.b;

public final class j
{
    public static void a(final l0 l0, final b b, final Lifecycle lifecycle) {
        final HashMap a = l0.a;
        Label_0028: {
            if (a == null) {
                final SavedStateHandleController value = null;
                break Label_0028;
            }
            synchronized (a) {
                final SavedStateHandleController value = l0.a.get("androidx.lifecycle.savedstate.vm.tag");
                monitorexit(a);
                final SavedStateHandleController savedStateHandleController = value;
                if (savedStateHandleController != null) {
                    final boolean g = savedStateHandleController.g;
                    if (!g) {
                        if (g) {
                            throw new IllegalStateException("Already attached to lifecycleOwner");
                        }
                        savedStateHandleController.g = true;
                        lifecycle.a((p)savedStateHandleController);
                        b.c(savedStateHandleController.f, savedStateHandleController.h.e);
                        b(lifecycle, b);
                    }
                }
            }
        }
    }
    
    public static void b(final Lifecycle lifecycle, final b b) {
        final Lifecycle.State b2 = lifecycle.b();
        if (b2 != Lifecycle.State.INITIALIZED && !b2.isAtLeast(Lifecycle.State.STARTED)) {
            lifecycle.a((p)new LegacySavedStateHandleController$1(lifecycle, b));
        }
        else {
            b.d();
        }
    }
    
    public static final class a implements m5.b.a
    {
        @Override
        public final void a(final d d) {
            if (d instanceof q0) {
                final p0 viewModelStore = ((q0)d).getViewModelStore();
                final b savedStateRegistry = d.getSavedStateRegistry();
                viewModelStore.getClass();
                final Iterator iterator = new HashSet(viewModelStore.a.keySet()).iterator();
                while (iterator.hasNext()) {
                    j.a(viewModelStore.a.get(iterator.next()), savedStateRegistry, ((q)d).getLifecycle());
                }
                if (!new HashSet(viewModelStore.a.keySet()).isEmpty()) {
                    savedStateRegistry.d();
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
        }
    }
}
