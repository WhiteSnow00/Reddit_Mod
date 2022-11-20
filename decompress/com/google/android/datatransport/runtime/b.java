// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.datatransport.runtime;

import java.util.Arrays;
import com.google.android.datatransport.Priority;

public final class b extends c
{
    public final String a;
    public final byte[] b;
    public final Priority c;
    
    public b(final String a, final byte[] b, final Priority c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final String b() {
        return this.a;
    }
    
    public final byte[] c() {
        return this.b;
    }
    
    public final Priority d() {
        return this.c;
    }
    
    public final boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof c) {
            final c c = (c)o;
            if (this.a.equals(c.b())) {
                final byte[] b2 = this.b;
                byte[] array;
                if (c instanceof b) {
                    array = ((b)c).b;
                }
                else {
                    array = c.c();
                }
                if (Arrays.equals(b2, array) && this.c.equals(c.d())) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b)) * 1000003 ^ this.c.hashCode();
    }
    
    public static final class a extends c$a
    {
        public String a;
        public byte[] b;
        public Priority c;
        
        public final b a() {
            String s;
            if (this.a == null) {
                s = " backendName";
            }
            else {
                s = "";
            }
            String l = s;
            if (this.c == null) {
                l = b.l(s, " priority");
            }
            if (l.isEmpty()) {
                return new b(this.a, this.b, this.c);
            }
            throw new IllegalStateException(b.l("Missing required properties:", l));
        }
        
        public final a b(final String a) {
            if (a != null) {
                this.a = a;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }
        
        public final a c(final Priority c) {
            if (c != null) {
                this.c = c;
                return this;
            }
            throw new NullPointerException("Null priority");
        }
    }
}
