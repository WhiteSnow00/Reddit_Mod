// 
// Decompiled by Procyon v0.6.0
// 

package k4;

import java.util.ArrayList;
import j0.i;

public final class a
{
    public static final ThreadLocal<a> g;
    public final i<b, Long> a;
    public final ArrayList<b> b;
    public final a c;
    public a$d d;
    public long e;
    public boolean f;
    
    static {
        g = new ThreadLocal<a>();
    }
    
    public a() {
        this.a = (i<b, Long>)new i();
        this.b = new ArrayList<b>();
        this.c = new a();
        this.e = 0L;
        this.f = false;
    }
    
    public final class a
    {
    }
    
    public interface b
    {
        boolean a(final long p0);
    }
    
    public abstract static class c
    {
        public final a a;
        
        public c(final a a) {
            this.a = a;
        }
    }
}
