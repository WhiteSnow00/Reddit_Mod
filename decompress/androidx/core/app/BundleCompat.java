// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.os.IBinder;
import android.os.Bundle;

public final class BundleCompat
{
    private BundleCompat() {
    }
    
    public static IBinder getBinder(final Bundle bundle, final String s) {
        return a.a(bundle, s);
    }
    
    public static void putBinder(final Bundle bundle, final String s, final IBinder binder) {
        a.b(bundle, s, binder);
    }
    
    public static final class a
    {
        public static IBinder a(final Bundle bundle, final String s) {
            return bundle.getBinder(s);
        }
        
        public static void b(final Bundle bundle, final String s, final IBinder binder) {
            bundle.putBinder(s, binder);
        }
    }
}
