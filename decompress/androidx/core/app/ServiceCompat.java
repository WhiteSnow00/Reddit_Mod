// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import android.app.Service;

public final class ServiceCompat
{
    public static final int START_STICKY = 1;
    public static final int STOP_FOREGROUND_DETACH = 2;
    public static final int STOP_FOREGROUND_REMOVE = 1;
    
    private ServiceCompat() {
    }
    
    public static void stopForeground(final Service service, final int n) {
        a.a(service, n);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface StopForegroundFlags {
    }
    
    public static final class a
    {
        public static void a(final Service service, final int n) {
            service.stopForeground(n);
        }
    }
}
