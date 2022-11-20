// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Set;

public final class b extends SchedulerConfig$b
{
    public final long a;
    public final long b;
    public final Set<SchedulerConfig$Flag> c;
    
    public b(final long a, final long b, final Set c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final long a() {
        return this.a;
    }
    
    public final Set<SchedulerConfig$Flag> b() {
        return this.c;
    }
    
    public final long c() {
        return this.b;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof SchedulerConfig$b) {
            final SchedulerConfig$b schedulerConfig$b = (SchedulerConfig$b)o;
            if (this.a != schedulerConfig$b.a() || this.b != schedulerConfig$b.c() || !this.c.equals(schedulerConfig$b.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        return ((n ^ 0xF4243) * 1000003 ^ (int)(b >>> 32 ^ b)) * 1000003 ^ this.c.hashCode();
    }
    
    public final String toString() {
        final StringBuilder t = a.t("ConfigValue{delta=");
        t.append(this.a);
        t.append(", maxAllowedDelay=");
        t.append(this.b);
        t.append(", flags=");
        t.append(this.c);
        t.append("}");
        return t.toString();
    }
    
    public static final class a extends SchedulerConfig$b$a
    {
        public Long a;
        public Long b;
        public Set<SchedulerConfig$Flag> c;
        
        public final b a() {
            String s;
            if (this.a == null) {
                s = " delta";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.b == null) {
                l = b.l(s, " maxAllowedDelay");
            }
            String i = l;
            if (this.c == null) {
                i = b.l(l, " flags");
            }
            if (i.isEmpty()) {
                return new b(this.a, this.b, this.c);
            }
            throw new IllegalStateException(b.l("Missing required properties:", i));
        }
    }
}
