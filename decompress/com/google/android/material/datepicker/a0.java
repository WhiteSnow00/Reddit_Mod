// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.material.datepicker;

import java.util.TimeZone;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;

public final class a0
{
    public static AtomicReference<z> a;
    
    static {
        a0.a = new AtomicReference<z>();
    }
    
    public static long a(final long timeInMillis) {
        final Calendar d = d(null);
        d.setTimeInMillis(timeInMillis);
        return b(d).getTimeInMillis();
    }
    
    public static Calendar b(Calendar d) {
        d = d(d);
        final Calendar d2 = d(null);
        d2.set(d.get(1), d.get(2), d.get(5));
        return d2;
    }
    
    public static Calendar c() {
        z c;
        if ((c = a0.a.get()) == null) {
            c = z.c;
        }
        final TimeZone b = c.b;
        Calendar calendar;
        if (b == null) {
            calendar = Calendar.getInstance();
        }
        else {
            calendar = Calendar.getInstance(b);
        }
        final Long a = c.a;
        if (a != null) {
            calendar.setTimeInMillis(a);
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }
    
    public static Calendar d(final Calendar calendar) {
        final Calendar instance = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
        }
        else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
