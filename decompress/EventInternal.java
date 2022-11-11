// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime;

import java.util.Collections;
import ja.e;
import java.util.Map;
import java.util.HashMap;

public abstract class EventInternal
{
    public static a builder() {
        final a$a a$a = new a$a();
        a$a.f = new HashMap();
        return (a)a$a;
    }
    
    public final String get(String s) {
        if ((s = this.getAutoMetadata().get(s)) == null) {
            s = "";
        }
        return s;
    }
    
    public abstract Map<String, String> getAutoMetadata();
    
    public abstract Integer getCode();
    
    public abstract e getEncodedPayload();
    
    public abstract long getEventMillis();
    
    public final int getInteger(String s) {
        s = this.getAutoMetadata().get(s);
        int intValue;
        if (s == null) {
            intValue = 0;
        }
        else {
            intValue = Integer.valueOf(s);
        }
        return intValue;
    }
    
    public final long getLong(String s) {
        s = this.getAutoMetadata().get(s);
        long longValue;
        if (s == null) {
            longValue = 0L;
        }
        else {
            longValue = Long.valueOf(s);
        }
        return longValue;
    }
    
    public final Map<String, String> getMetadata() {
        return Collections.unmodifiableMap((Map<? extends String, ? extends String>)this.getAutoMetadata());
    }
    
    public final String getOrDefault(String s, String s2) {
        s = this.getAutoMetadata().get(s);
        if (s != null) {
            s2 = s;
        }
        return s2;
    }
    
    @Deprecated
    public byte[] getPayload() {
        return this.getEncodedPayload().b;
    }
    
    public abstract String getTransportName();
    
    public abstract long getUptimeMillis();
    
    public a toBuilder() {
        final a$a a$a = new a$a();
        a$a.d(this.getTransportName());
        a$a.b = this.getCode();
        a$a.c(this.getEncodedPayload());
        a$a.d = this.getEventMillis();
        a$a.e = this.getUptimeMillis();
        a$a.f = new HashMap(this.getAutoMetadata());
        return (a)a$a;
    }
    
    public abstract static class a
    {
        public final void a(final String s, final String s2) {
            final Map f = ((a$a)this).f;
            if (f != null) {
                f.put(s, s2);
                return;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        
        public abstract com.google.android.datatransport.runtime.a b();
        
        public abstract a$a c(final e p0);
        
        public abstract a$a d(final String p0);
    }
}
