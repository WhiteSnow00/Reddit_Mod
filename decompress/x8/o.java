// 
// Decompiled by Procyon v0.6.0
// 

package x8;

import android.graphics.Bitmap$Config;
import android.graphics.BitmapFactory$Options;
import android.util.Log;
import java.util.Iterator;
import android.os.Build;
import java.util.Arrays;
import android.os.Build$VERSION;
import java.util.concurrent.atomic.AtomicBoolean;
import java.io.File;

public final class o
{
    public static final boolean g;
    public static final boolean h;
    public static final File i;
    public static volatile o j;
    public static volatile int k;
    public final boolean a;
    public final int b;
    public final int c;
    public int d;
    public boolean e;
    public final AtomicBoolean f;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = true;
        g = (sdk_INT < 29);
        h = (sdk_INT >= 26 && b);
        i = new File("/proc/self/fd");
        o.k = -1;
    }
    
    public o() {
        final boolean b = true;
        this.e = true;
        this.f = new AtomicBoolean(false);
        boolean b2 = false;
        Label_0182: {
            if (Build$VERSION.SDK_INT == 26) {
                final Iterator<String> iterator = Arrays.asList("SC-04J", "SM-N935", "SM-J720", "SM-G570F", "SM-G570M", "SM-G960", "SM-G965", "SM-G935", "SM-G930", "SM-A520", "SM-A720F", "moto e5", "moto e5 play", "moto e5 plus", "moto e5 cruise", "moto g(6) forge", "moto g(6) play").iterator();
                while (iterator.hasNext()) {
                    if (Build.MODEL.startsWith(iterator.next())) {
                        b2 = true;
                        break Label_0182;
                    }
                }
            }
            b2 = false;
        }
        this.a = (!b2 && (Build$VERSION.SDK_INT != 27 || !Arrays.asList("LG-M250", "LG-M320", "LG-Q710AL", "LG-Q710PL", "LGM-K121K", "LGM-K121L", "LGM-K121S", "LGM-X320K", "LGM-X320L", "LGM-X320S", "LGM-X401L", "LGM-X401S", "LM-Q610.FG", "LM-Q610.FGN", "LM-Q617.FG", "LM-Q617.FGN", "LM-Q710.FG", "LM-Q710.FGN", "LM-X220PM", "LM-X220QMA", "LM-X410PM").contains(Build.MODEL)) && b);
        if (Build$VERSION.SDK_INT >= 28) {
            this.b = 20000;
            this.c = 0;
        }
        else {
            this.b = 700;
            this.c = 128;
        }
    }
    
    public final boolean a(int d, int length, final boolean b, final boolean b2) {
        if (!b) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!this.a) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by device model");
            }
            return false;
        }
        if (!o.h) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (o.g && !this.f.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (b2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        final int c = this.c;
        if (d < c) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because width is too small");
            }
            return false;
        }
        if (length < c) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because height is too small");
            }
            return false;
        }
        synchronized (this) {
            d = this.d + 1;
            this.d = d;
            if (d >= 50) {
                this.d = 0;
                length = o.i.list().length;
                if (o.k != -1) {
                    d = o.k;
                }
                else {
                    d = this.b;
                }
                final long n = d;
                final boolean e = length < n;
                this.e = e;
                if (!e && Log.isLoggable("Downsampler", 5)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                    sb.append(length);
                    sb.append(", limit ");
                    sb.append(n);
                    Log.w("Downsampler", sb.toString());
                }
            }
            final boolean e2 = this.e;
            monitorexit(this);
            if (!e2) {
                if (Log.isLoggable("HardwareConfig", 2)) {
                    Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                }
                return false;
            }
            return true;
        }
    }
    
    public final boolean b(final int n, final int n2, final BitmapFactory$Options bitmapFactory$Options, final boolean b, final boolean b2) {
        final boolean a = this.a(n, n2, b, b2);
        if (a) {
            bitmapFactory$Options.inPreferredConfig = Bitmap$Config.HARDWARE;
            bitmapFactory$Options.inMutable = false;
        }
        return a;
    }
}
