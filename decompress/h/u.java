// 
// Decompiled by Procyon v0.6.0
// 

package h;

import android.location.Location;
import java.util.Calendar;
import android.util.Log;
import a92.b;
import android.location.LocationManager;
import android.content.Context;

public final class u
{
    public static u d;
    public final Context a;
    public final LocationManager b;
    public final a c;
    
    public u(final Context a, final LocationManager b) {
        this.c = new a();
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        final a c = this.c;
        final long b = c.b;
        final long currentTimeMillis = System.currentTimeMillis();
        final boolean b2 = true;
        boolean a = true;
        if (b > currentTimeMillis) {
            return c.a;
        }
        final int a2 = a92.b.A(this.a, "android.permission.ACCESS_COARSE_LOCATION");
        final Location location = null;
        Location lastKnownLocation = null;
        if (a2 == 0) {
            Label_0107: {
                try {
                    if (this.b.isProviderEnabled("network")) {
                        lastKnownLocation = this.b.getLastKnownLocation("network");
                        break Label_0107;
                    }
                }
                catch (final Exception ex) {
                    Log.d("u", "Failed to get last known location", (Throwable)ex);
                }
                lastKnownLocation = null;
            }
        }
        else {
            lastKnownLocation = null;
        }
        Location lastKnownLocation2 = location;
        if (a92.b.A(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            lastKnownLocation2 = location;
            try {
                if (this.b.isProviderEnabled("gps")) {
                    lastKnownLocation2 = this.b.getLastKnownLocation("gps");
                }
            }
            catch (final Exception ex2) {
                Log.d("u", "Failed to get last known location", (Throwable)ex2);
                lastKnownLocation2 = location;
            }
        }
        Location location2 = null;
        Label_0219: {
            if (lastKnownLocation2 != null && lastKnownLocation != null) {
                location2 = lastKnownLocation;
                if (lastKnownLocation2.getTime() <= lastKnownLocation.getTime()) {
                    break Label_0219;
                }
            }
            else {
                location2 = lastKnownLocation;
                if (lastKnownLocation2 == null) {
                    break Label_0219;
                }
            }
            location2 = lastKnownLocation2;
        }
        if (location2 != null) {
            final a c2 = this.c;
            final long currentTimeMillis2 = System.currentTimeMillis();
            if (x.d == null) {
                x.d = new x();
            }
            final x d = x.d;
            d.a(location2.getLatitude(), location2.getLongitude(), currentTimeMillis2 - 86400000L);
            d.a(location2.getLatitude(), location2.getLongitude(), currentTimeMillis2);
            if (d.c != 1) {
                a = false;
            }
            final long b3 = d.b;
            final long a3 = d.a;
            d.a(location2.getLatitude(), location2.getLongitude(), currentTimeMillis2 + 86400000L);
            final long b4 = d.b;
            long b5;
            if (b3 != -1L && a3 != -1L) {
                long n;
                if (currentTimeMillis2 > a3) {
                    n = b4 + 0L;
                }
                else if (currentTimeMillis2 > b3) {
                    n = a3 + 0L;
                }
                else {
                    n = b3 + 0L;
                }
                b5 = n + 60000L;
            }
            else {
                b5 = 43200000L + currentTimeMillis2;
            }
            c2.a = a;
            c2.b = b5;
            return c.a;
        }
        Log.i("u", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        final int value = Calendar.getInstance().get(11);
        boolean b6 = b2;
        if (value >= 6) {
            b6 = (value >= 19 && b2);
        }
        return b6;
    }
    
    public static final class a
    {
        public boolean a;
        public long b;
    }
}
