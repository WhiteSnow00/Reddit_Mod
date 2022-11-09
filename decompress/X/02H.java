// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.location.Location;
import java.lang.reflect.Field;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import com.bytedance.covode.number.Covode;
import android.location.LocationManager;
import android.content.Context;

public final class 02H
{
    public static 02H LIZJ;
    public final Context LIZ;
    public final a LIZIZ;
    public final LocationManager LIZLLL;
    
    static {
        Covode.recordClassIndex(294);
    }
    
    public 02H(final Context liz, final LocationManager lizlll) {
        this.LIZIZ = new a();
        this.LIZ = liz;
        this.LIZLLL = lizlll;
    }
    
    public static 02H LIZ(Context liziz) {
        if (02H.LIZJ == null) {
            liziz = LIZIZ(liziz);
            02H.LIZJ = new 02H(liziz, (LocationManager)LIZ(liziz, "location"));
        }
        return 02H.LIZJ;
    }
    
    public static Object LIZ(Context context, String ex) {
        Label_0158: {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0158;
                }
                synchronized (ClipboardManager.class) {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)declaredField.get(systemService);
                            declaredField.set(systemService, new 2Lq((Handler)ex));
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    return context;
                }
            }
            Label_0149: {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0149;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                }
                finally {
                    return context.getSystemService((String)ex);
                }
            }
        }
    }
    
    public static Context LIZIZ(Context applicationContext) {
        applicationContext = applicationContext.getApplicationContext();
        if (!5WL.LIZIZ) {
            return applicationContext;
        }
        if (applicationContext != null) {
            return applicationContext;
        }
        return (Context)5WL.LIZ;
    }
    
    public final Location LIZ(final String s) {
        try {
            if (!this.LIZLLL.isProviderEnabled(s)) {
                return null;
            }
            final LocationManager lizlll = this.LIZLLL;
            final 5an liz = new 5aq().LIZ(100000, "android/location/LocationManager", "getLastKnownLocation", (Object)lizlll, new Object[] { s }, "android.location.Location", new 5dv(false));
            if (liz.LIZ) {
                return (Location)liz.LIZIZ;
            }
            return lizlll.getLastKnownLocation(s);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static final class a
    {
        public boolean LIZ;
        public long LIZIZ;
        
        static {
            Covode.recordClassIndex(295);
        }
    }
}
