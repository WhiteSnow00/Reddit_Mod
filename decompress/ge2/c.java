// 
// Decompiled by Procyon v0.6.0
// 

package ge2;

import android.os.SystemClock;
import android.database.ContentObserver;
import android.provider.Settings$System;
import androidx.fragment.app.r;
import android.os.Vibrator;
import android.content.Context;

public final class c
{
    public final Context a;
    public final b b;
    public Vibrator c;
    public boolean d;
    public long e;
    
    public c(final r a) {
        this.a = (Context)a;
        this.b = new b(this);
    }
    
    public final void a() {
        final Context a = this.a;
        final int checkPermission = a.getPackageManager().checkPermission("android.permission.VIBRATE", a.getPackageName());
        boolean d = true;
        if (checkPermission == 0) {
            this.c = (Vibrator)this.a.getSystemService("vibrator");
        }
        if (Settings$System.getInt(this.a.getContentResolver(), "haptic_feedback_enabled", 0) != 1) {
            d = false;
        }
        this.d = d;
        this.a.getContentResolver().registerContentObserver(Settings$System.getUriFor("haptic_feedback_enabled"), false, (ContentObserver)this.b);
    }
    
    public final void b() {
        if (this.c != null && this.d) {
            final long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.e >= 125L) {
                this.c.vibrate(50L);
                this.e = uptimeMillis;
            }
        }
    }
}
