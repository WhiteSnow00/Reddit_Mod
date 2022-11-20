// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime;

import java.util.Map;
import ka.e;

public final class a extends EventInternal
{
    public final String a;
    public final Integer b;
    public final e c;
    public final long d;
    public final long e;
    public final Map<String, String> f;
    
    public a(final String a, final Integer b, final e c, final long d, final long e, final Map f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof EventInternal) {
            final EventInternal eventInternal = (EventInternal)o;
            if (this.a.equals(eventInternal.getTransportName())) {
                final Integer b2 = this.b;
                if (b2 == null) {
                    if (eventInternal.getCode() != null) {
                        return false;
                    }
                }
                else if (!b2.equals(eventInternal.getCode())) {
                    return false;
                }
                if (this.c.equals((Object)eventInternal.getEncodedPayload()) && this.d == eventInternal.getEventMillis() && this.e == eventInternal.getUptimeMillis() && this.f.equals(eventInternal.getAutoMetadata())) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final Map<String, String> getAutoMetadata() {
        return this.f;
    }
    
    public final Integer getCode() {
        return this.b;
    }
    
    public final e getEncodedPayload() {
        return this.c;
    }
    
    public final long getEventMillis() {
        return this.d;
    }
    
    public final String getTransportName() {
        return this.a;
    }
    
    public final long getUptimeMillis() {
        return this.e;
    }
    
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final Integer b = this.b;
        int hashCode2;
        if (b == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = b.hashCode();
        }
        final int hashCode3 = this.c.hashCode();
        final long d = this.d;
        final int n = (int)(d ^ d >>> 32);
        final long e = this.e;
        return (((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ n) * 1000003 ^ (int)(e ^ e >>> 32)) * 1000003 ^ this.f.hashCode();
    }
    
    public final String toString() {
        final StringBuilder t = a.t("EventInternal{transportName=");
        t.append(this.a);
        t.append(", code=");
        t.append(this.b);
        t.append(", encodedPayload=");
        t.append(this.c);
        t.append(", eventMillis=");
        t.append(this.d);
        t.append(", uptimeMillis=");
        t.append(this.e);
        t.append(", autoMetadata=");
        t.append(this.f);
        t.append("}");
        return t.toString();
    }
    
    public static final class a extends EventInternal$a
    {
        public String a;
        public Integer b;
        public e c;
        public Long d;
        public Long e;
        public Map<String, String> f;
        
        public final com.google.android.datatransport.runtime.a b() {
            String s;
            if (this.a == null) {
                s = " transportName";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.c == null) {
                l = b.l(s, " encodedPayload");
            }
            String i = l;
            if (this.d == null) {
                i = b.l(l, " eventMillis");
            }
            String j = i;
            if (this.e == null) {
                j = b.l(i, " uptimeMillis");
            }
            String k = j;
            if (this.f == null) {
                k = b.l(j, " autoMetadata");
            }
            if (k.isEmpty()) {
                return new com.google.android.datatransport.runtime.a(this.a, this.b, this.c, this.d, this.e, this.f);
            }
            throw new IllegalStateException(b.l("Missing required properties:", k));
        }
        
        public final a c(final e c) {
            if (c != null) {
                this.c = c;
                return this;
            }
            throw new NullPointerException("Null encodedPayload");
        }
        
        public final a d(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }
}
