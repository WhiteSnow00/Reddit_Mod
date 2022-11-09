// 
// Decompiled by Procyon v0.6.0
// 

package sa;

import ak0.m;

public abstract class e
{
    public static final sa.a a;
    
    static {
        final a$a a$a = new a$a();
        a$a.a = 10485760L;
        a$a.b = 200;
        a$a.c = 10000;
        a$a.d = 604800000L;
        a$a.e = 81920;
        String s;
        if (a$a.a == null) {
            s = " maxStorageSizeInBytes";
        }
        else {
            s = "";
        }
        String l = s;
        if (a$a.b == null) {
            l = m.l(s, " loadBatchSize");
        }
        String i = l;
        if (a$a.c == null) {
            i = m.l(l, " criticalSectionEnterTimeoutMs");
        }
        String j = i;
        if (a$a.d == null) {
            j = m.l(i, " eventCleanUpAge");
        }
        String k = j;
        if (a$a.e == null) {
            k = m.l(j, " maxBlobByteSizePerRow");
        }
        if (k.isEmpty()) {
            a = new sa.a((long)a$a.a, (int)a$a.b, (int)a$a.c, (long)a$a.d, (int)a$a.e);
            return;
        }
        throw new IllegalStateException(m.l("Missing required properties:", k));
    }
    
    public abstract int a();
    
    public abstract long b();
    
    public abstract int c();
    
    public abstract int d();
    
    public abstract long e();
    
    public abstract static class a
    {
    }
}
