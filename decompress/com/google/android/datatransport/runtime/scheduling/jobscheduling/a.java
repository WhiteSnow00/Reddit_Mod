// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import java.util.Map;

public final class a extends SchedulerConfig
{
    public final ua.a a;
    public final Map<Priority, SchedulerConfig$b> b;
    
    public a(final ua.a a, final Map<Priority, SchedulerConfig$b> b) {
        if (a == null) {
            throw new NullPointerException("Null clock");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null values");
    }
    
    public final ua.a a() {
        return this.a;
    }
    
    public final Map<Priority, SchedulerConfig$b> c() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof SchedulerConfig) {
            final SchedulerConfig schedulerConfig = (SchedulerConfig)o;
            if (!this.a.equals(schedulerConfig.a()) || !this.b.equals(schedulerConfig.c())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    public final String toString() {
        final StringBuilder t = a.t("SchedulerConfig{clock=");
        t.append(this.a);
        t.append(", values=");
        t.append(this.b);
        t.append("}");
        return t.toString();
    }
}
