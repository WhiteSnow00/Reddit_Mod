// 
// Decompiled by Procyon v0.6.0
// 

package m5;

import android.os.BaseBundle;
import androidx.lifecycle.q;
import java.util.Map;
import n.b$d;
import android.os.Bundle;
import androidx.lifecycle.p;
import androidx.savedstate.Recreator;
import androidx.lifecycle.Lifecycle;
import sg2.e;

public final class c
{
    public final d a;
    public final b b;
    public boolean c;
    
    public c(final d a) {
        this.a = a;
        this.b = new b();
    }
    
    public final void a() {
        final Lifecycle lifecycle = ((q)this.a).getLifecycle();
        e.e((Object)lifecycle, "owner.lifecycle");
        if (lifecycle.b() != Lifecycle.State.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        lifecycle.a((p)new Recreator(this.a));
        final b b = this.b;
        b.getClass();
        if (b.b ^ true) {
            lifecycle.a((p)new a(b));
            b.b = true;
            this.c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }
    
    public final void b(Bundle bundle) {
        if (!this.c) {
            this.a();
        }
        final Lifecycle lifecycle = ((q)this.a).getLifecycle();
        e.e((Object)lifecycle, "owner.lifecycle");
        if (!(lifecycle.b().isAtLeast(Lifecycle.State.STARTED) ^ true)) {
            final StringBuilder r = a.r("performRestore cannot be called when owner is ");
            r.append(lifecycle.b());
            throw new IllegalStateException(r.toString().toString());
        }
        final b b = this.b;
        if (!b.b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (b.d ^ true) {
            if (bundle != null) {
                bundle = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            else {
                bundle = null;
            }
            b.c = bundle;
            b.d = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
    }
    
    public final void c(final Bundle bundle) {
        e.f((Object)bundle, "outBundle");
        final b b = this.b;
        b.getClass();
        final Bundle bundle2 = new Bundle();
        final Bundle c = b.c;
        if (c != null) {
            bundle2.putAll(c);
        }
        final n.b<String, b.b> a = b.a;
        a.getClass();
        final b$d b$d = new b$d((n.b)a);
        a.h.put(b$d, Boolean.FALSE);
        while (b$d.hasNext()) {
            final Map.Entry entry = (Map.Entry)b$d.next();
            bundle2.putBundle((String)entry.getKey(), ((b.b)entry.getValue()).D());
        }
        if (!((BaseBundle)bundle2).isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
