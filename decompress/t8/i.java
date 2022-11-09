// 
// Decompiled by Procyon v0.6.0
// 

package t8;

import android.os.Build$VERSION;
import android.util.DisplayMetrics;
import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.Log;

public final class i
{
    public final int a;
    public final int b;
    public final int c;
    
    public i(final a a) {
        final Context a2 = a.a;
        int c;
        if (a.b.isLowRamDevice()) {
            c = 2097152;
        }
        else {
            c = 4194304;
        }
        this.c = c;
        final ActivityManager b = a.b;
        float n = 0.4f;
        final int memoryClass = b.getMemoryClass();
        final boolean lowRamDevice = b.isLowRamDevice();
        final float n2 = (float)(memoryClass * 1024 * 1024);
        if (lowRamDevice) {
            n = 0.33f;
        }
        final int round = Math.round(n2 * n);
        final DisplayMetrics a3 = a.c.a;
        final float n3 = (float)(a3.widthPixels * a3.heightPixels * 4);
        final int round2 = Math.round(a.d * n3);
        final int round3 = Math.round(n3 * 2.0f);
        final int n4 = round - c;
        final int n5 = round3 + round2;
        if (n5 <= n4) {
            this.b = round3;
            this.a = round2;
        }
        else {
            final float n6 = n4 / (a.d + 2.0f);
            this.b = Math.round(2.0f * n6);
            this.a = Math.round(n6 * a.d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            final StringBuilder k = a.k("Calculation complete, Calculated memory cache size: ");
            k.append(Formatter.formatFileSize(a2, (long)this.b));
            k.append(", pool size: ");
            k.append(Formatter.formatFileSize(a2, (long)this.a));
            k.append(", byte array size: ");
            k.append(Formatter.formatFileSize(a2, (long)c));
            k.append(", memory class limited? ");
            k.append(n5 > round);
            k.append(", max size: ");
            k.append(Formatter.formatFileSize(a2, (long)round));
            k.append(", memoryClass: ");
            k.append(a.b.getMemoryClass());
            k.append(", isLowMemoryDevice: ");
            k.append(a.b.isLowRamDevice());
            Log.d("MemorySizeCalculator", k.toString());
        }
    }
    
    public static final class a
    {
        public static final int e;
        public final Context a;
        public ActivityManager b;
        public b c;
        public float d;
        
        static {
            int e2;
            if (Build$VERSION.SDK_INT < 26) {
                e2 = 4;
            }
            else {
                e2 = 1;
            }
            e = e2;
        }
        
        public a(final Context a) {
            this.d = (float)a.e;
            this.a = a;
            this.b = (ActivityManager)a.getSystemService("activity");
            this.c = new b(a.getResources().getDisplayMetrics());
            if (Build$VERSION.SDK_INT >= 26 && this.b.isLowRamDevice()) {
                this.d = 0.0f;
            }
        }
    }
    
    public static final class b
    {
        public final DisplayMetrics a;
        
        public b(final DisplayMetrics a) {
            this.a = a;
        }
    }
}
