// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.os.BaseBundle;
import android.util.Log;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

public final class n0 extends t0
{
    public final AtomicReference a;
    public boolean b;
    
    public n0() {
        this.a = new AtomicReference();
    }
    
    public static final Object R(final Bundle bundle, final Class clazz) {
        if (bundle != null) {
            final Object value = ((BaseBundle)bundle).get("r");
            if (value != null) {
                try {
                    return clazz.cast(value);
                }
                catch (final ClassCastException ex) {
                    Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", clazz.getCanonicalName(), value.getClass().getCanonicalName()), (Throwable)ex);
                    throw ex;
                }
            }
        }
        return null;
    }
    
    public final String J(final long n) {
        return (String)R(this.m(n), String.class);
    }
    
    public final void b(final Bundle bundle) {
        final AtomicReference a = this.a;
        monitorenter(a);
        try {
            this.a.set(bundle);
            this.b = true;
            return;
        }
        finally {
            this.a.notify();
        }
        try {}
        finally {
            monitorexit(a);
        }
    }
    
    public final Bundle m(final long n) {
        synchronized (this.a) {
            if (!this.b) {
                try {
                    this.a.wait(n);
                }
                catch (final InterruptedException ex) {
                    return null;
                }
            }
            return this.a.get();
        }
    }
}
