// 
// Decompiled by Procyon v0.6.0
// 

package v3;

import ah2.f;
import android.os.IBinder;
import android.os.Bundle;

public final class b
{
    public static final void a(final Bundle bundle, final String s, final IBinder binder) {
        f.f((Object)bundle, "bundle");
        f.f((Object)s, "key");
        bundle.putBinder(s, binder);
    }
}
