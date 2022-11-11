// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;

public final class w4<Key, Value>
{
    public static final long c;
    public static final ScheduledExecutorService d;
    public final HashMap a;
    public final Object b;
    
    static {
        c = TimeUnit.MINUTES.toMillis(5L);
        d = Executors.newSingleThreadScheduledExecutor();
    }
    
    public w4() {
        this.a = new HashMap();
        this.b = new Object();
    }
    
    public final boolean a(final Object o, final long n, final Object o2) {
        synchronized (this.b) {
            final a a = this.a.get(o);
            final boolean b = true;
            if (a == null) {
                this.a.put(o, new a(o2, n, false));
                if (o2 != null) {
                    return b;
                }
            }
            else {
                if (a.c >= n) {
                    return false;
                }
                this.a.put(o, new a(o2, n, false));
                boolean b2 = b;
                if (a.b) {
                    return b2;
                }
                if (a.a != o2) {
                    b2 = b;
                    return b2;
                }
            }
            return false;
        }
    }
    
    public final Object b(final long n, final Object o) {
        synchronized (this.b) {
            final a a = this.a.get(o);
            boolean b = false;
            if (a != null) {
                if (a.c < n) {
                    b = true;
                }
            }
            if (a == null || b) {
                this.a.put(o, new a(null, n, true));
                w4.d.schedule(new v4(this, o), w4.c, TimeUnit.MILLISECONDS);
            }
            monitorexit(this.b);
            if (b) {
                return a.a;
            }
            return null;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("VersioningLruCache{removeDelayMillis=");
        r.append(w4.c);
        r.append(", delegate=");
        r.append(this.a);
        r.append('}');
        return r.toString();
    }
    
    public static final class a<ValueType>
    {
        public final ValueType a;
        public final boolean b;
        public final long c;
        
        public a(final Object a, final long c, final boolean b) {
            this.a = (ValueType)a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("DataHolder{value=");
            r.append(this.a);
            r.append(", isRemoved=");
            r.append(this.b);
            r.append(", updatedAt=");
            return b.i(r, this.c, '}');
        }
    }
}
