// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import androidx.work.NetworkType;

public final class b
{
    public static final b i;
    public NetworkType a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public c h;
    
    static {
        i = new b(new a());
    }
    
    public b() {
        this.a = NetworkType.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new c();
    }
    
    public b(final a a) {
        this.a = NetworkType.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        new c();
        this.b = false;
        this.c = a.a;
        this.a = a.b;
        this.d = a.c;
        this.e = a.d;
        this.h = a.g;
        this.f = a.e;
        this.g = a.f;
    }
    
    public b(final b b) {
        this.a = NetworkType.NOT_REQUIRED;
        this.f = -1L;
        this.g = -1L;
        this.h = new c();
        this.b = b.b;
        this.c = b.c;
        this.a = b.a;
        this.d = b.d;
        this.e = b.e;
        this.h = b.h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && b.class == o.getClass()) {
            final b b = (b)o;
            return this.b == b.b && this.c == b.c && this.d == b.d && this.e == b.e && this.f == b.f && this.g == b.g && this.a == b.a && this.h.equals(b.h);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b ? 1 : 0;
        final int c = this.c ? 1 : 0;
        final int d = this.d ? 1 : 0;
        final int e = this.e ? 1 : 0;
        final long f = this.f;
        final int n = (int)(f ^ f >>> 32);
        final long g = this.g;
        return this.h.hashCode() + ((((((hashCode * 31 + b) * 31 + c) * 31 + d) * 31 + e) * 31 + n) * 31 + (int)(g ^ g >>> 32)) * 31;
    }
    
    public static final class a
    {
        public boolean a;
        public NetworkType b;
        public boolean c;
        public boolean d;
        public long e;
        public long f;
        public c g;
        
        public a() {
            this.a = false;
            this.b = NetworkType.NOT_REQUIRED;
            this.c = false;
            this.d = false;
            this.e = -1L;
            this.f = -1L;
            this.g = new c();
        }
    }
}
