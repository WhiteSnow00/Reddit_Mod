// 
// Decompiled by Procyon v0.6.0
// 

package ld;

import android.util.Log;

public final class g extends ClassLoader
{
    public final Class<?> loadClass(final String s, final boolean b) throws ClassNotFoundException {
        if ("com.google.android.gms.iid.MessengerCompat".equals(s)) {
            if (Log.isLoggable("CloudMessengerCompat", 3)) {
                Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
            }
            return h.class;
        }
        return super.loadClass(s, b);
    }
}
