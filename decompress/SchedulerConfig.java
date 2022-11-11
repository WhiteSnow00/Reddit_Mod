// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import com.google.android.datatransport.Priority;
import ta.a;

public abstract class SchedulerConfig
{
    public abstract ta.a a();
    
    public final long b(final Priority priority, final long n, int n2) {
        final long a = this.a().a();
        final b b = this.c().get(priority);
        final long a2 = b.a();
        --n2;
        long n3;
        if (a2 > 1L) {
            n3 = a2;
        }
        else {
            n3 = 2L;
        }
        return Math.min(Math.max((long)(Math.pow(3.0, n2) * a2 * Math.max(1.0, Math.log(10000.0) / Math.log((double)(n3 * n2)))), n - a), b.c());
    }
    
    public abstract Map<Priority, b> c();
    
    public enum Flag
    {
        DEVICE_CHARGING, 
        DEVICE_IDLE, 
        NETWORK_UNMETERED;
    }
    
    public static final class a
    {
        public ta.a a;
        public HashMap b;
        
        public a() {
            this.b = new HashMap();
        }
    }
    
    public abstract static class b
    {
        public abstract long a();
        
        public abstract Set<Flag> b();
        
        public abstract long c();
        
        public abstract static class a
        {
        }
    }
}
