// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import wd.c;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import h3.b;
import z0.d1;

public final class f extends d1
{
    public Boolean g;
    public e h;
    public Boolean i;
    
    public f(final h4 h4) {
        super(h4);
        this.h = (e)b.g;
    }
    
    public final String N(String s) {
        try {
            s = (String)Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, s, "");
            lw0.b.R((Object)s);
            return s;
        }
        catch (final InvocationTargetException ex) {
            ((h4)super.f).h().k.b((Object)ex, "SystemProperties.get() threw an exception");
        }
        catch (final IllegalAccessException ex2) {
            ((h4)super.f).h().k.b((Object)ex2, "Could not access SystemProperties.get()");
        }
        catch (final NoSuchMethodException ex3) {
            ((h4)super.f).h().k.b((Object)ex3, "Could not find SystemProperties.get() method");
        }
        catch (final ClassNotFoundException ex4) {
            ((h4)super.f).h().k.b((Object)ex4, "Could not find SystemProperties class");
        }
        return "";
    }
    
    public final double O(String k, final q2 q2) {
        if (k == null) {
            return (double)q2.a(null);
        }
        k = this.h.k(k, q2.a);
        if (TextUtils.isEmpty((CharSequence)k)) {
            return (double)q2.a(null);
        }
        try {
            return (double)q2.a(Double.parseDouble(k));
        }
        catch (final NumberFormatException ex) {
            return (double)q2.a(null);
        }
    }
    
    public final int P() {
        final n7 y = ((h4)super.f).y();
        final Boolean j = ((h4)y.f).v().j;
        if (y.M0() < 201500 && (j == null || j)) {
            return 25;
        }
        return 100;
    }
    
    public final int Q(String k, final q2 q2) {
        if (k == null) {
            return (int)q2.a(null);
        }
        k = this.h.k(k, q2.a);
        if (TextUtils.isEmpty((CharSequence)k)) {
            return (int)q2.a(null);
        }
        try {
            return (int)q2.a(Integer.parseInt(k));
        }
        catch (final NumberFormatException ex) {
            return (int)q2.a(null);
        }
    }
    
    public final void R() {
        super.f.getClass();
    }
    
    public final long S(String k, final q2 q2) {
        if (k == null) {
            return (long)q2.a(null);
        }
        k = this.h.k(k, q2.a);
        if (TextUtils.isEmpty((CharSequence)k)) {
            return (long)q2.a(null);
        }
        try {
            return (long)q2.a(Long.parseLong(k));
        }
        catch (final NumberFormatException ex) {
            return (long)q2.a(null);
        }
    }
    
    public final Bundle T() {
        try {
            if (((h4)super.f).f.getPackageManager() == null) {
                ((h4)super.f).h().k.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            final ApplicationInfo a = c.a(((h4)super.f).f).a(128, ((h4)super.f).f.getPackageName());
            if (a == null) {
                ((h4)super.f).h().k.a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return a.metaData;
        }
        catch (final PackageManager$NameNotFoundException ex) {
            ((h4)super.f).h().k.b((Object)ex, "Failed to load metadata: Package name not found");
            return null;
        }
    }
    
    public final Boolean U(final String s) {
        lw0.b.O(s);
        final Bundle t = this.T();
        if (t == null) {
            ((h4)super.f).h().k.a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!((BaseBundle)t).containsKey(s)) {
            return null;
        }
        return ((BaseBundle)t).getBoolean(s);
    }
    
    public final boolean V(String k, final q2 q2) {
        if (k == null) {
            return (boolean)q2.a(null);
        }
        k = this.h.k(k, q2.a);
        if (TextUtils.isEmpty((CharSequence)k)) {
            return (boolean)q2.a(null);
        }
        return (boolean)q2.a("1".equals(k));
    }
    
    public final boolean W() {
        final Boolean u = this.U("google_analytics_automatic_screen_reporting_enabled");
        return u == null || u;
    }
    
    public final boolean X() {
        super.f.getClass();
        final Boolean u = this.U("firebase_analytics_collection_deactivated");
        return u != null && u;
    }
    
    public final boolean Y(final String s) {
        return "1".equals(this.h.k(s, "measurement.event_sampling_enabled"));
    }
    
    public final boolean Z() {
        if (this.g == null && (this.g = this.U("app_measurement_lite")) == null) {
            this.g = Boolean.FALSE;
        }
        return this.g || !((h4)super.f).j;
    }
}
