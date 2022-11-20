// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.app.AlarmManager$AlarmClockInfo;
import android.app.PendingIntent;
import android.app.AlarmManager;

public final class AlarmManagerCompat
{
    private AlarmManagerCompat() {
    }
    
    public static void setAlarmClock(final AlarmManager alarmManager, final long n, final PendingIntent pendingIntent, final PendingIntent pendingIntent2) {
        b.b(alarmManager, b.a(n, pendingIntent), pendingIntent2);
    }
    
    public static void setAndAllowWhileIdle(final AlarmManager alarmManager, final int n, final long n2, final PendingIntent pendingIntent) {
        c.a(alarmManager, n, n2, pendingIntent);
    }
    
    public static void setExact(final AlarmManager alarmManager, final int n, final long n2, final PendingIntent pendingIntent) {
        a.a(alarmManager, n, n2, pendingIntent);
    }
    
    public static void setExactAndAllowWhileIdle(final AlarmManager alarmManager, final int n, final long n2, final PendingIntent pendingIntent) {
        c.b(alarmManager, n, n2, pendingIntent);
    }
    
    public static final class a
    {
        public static void a(final AlarmManager alarmManager, final int n, final long n2, final PendingIntent pendingIntent) {
            alarmManager.setExact(n, n2, pendingIntent);
        }
    }
    
    public static final class b
    {
        public static AlarmManager$AlarmClockInfo a(final long n, final PendingIntent pendingIntent) {
            return new AlarmManager$AlarmClockInfo(n, pendingIntent);
        }
        
        public static void b(final AlarmManager alarmManager, final Object o, final PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager$AlarmClockInfo)o, pendingIntent);
        }
    }
    
    public static final class c
    {
        public static void a(final AlarmManager alarmManager, final int n, final long n2, final PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(n, n2, pendingIntent);
        }
        
        public static void b(final AlarmManager alarmManager, final int n, final long n2, final PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(n, n2, pendingIntent);
        }
    }
}
