// 
// Decompiled by Procyon v0.6.0
// 

package t8;

import ng.f0;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import m9.a;
import p8.d;
import l9.g;

public final class j
{
    public final g<d, String> a;
    public final a.c b;
    
    public j() {
        this.a = new g<d, String>(1000L);
        this.b = m9.a.a(10, (a.b)new a.b<b>() {
            @Override
            public final Object create() {
                try {
                    return new j.b(MessageDigest.getInstance("SHA-256"));
                }
                catch (final NoSuchAlgorithmException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
    
    public final String a(final d d) {
        Object o = this.a;
        synchronized (o) {
            final String s = this.a.a(d);
            monitorexit(o);
            o = s;
            if (s == null) {
                o = this.b.a();
                f0.a2(o);
                final b b = (b)o;
                try {
                    d.updateDiskCacheKey(b.f);
                    final byte[] digest = b.f.digest();
                    final char[] b2 = l9.j.b;
                    monitorenter(b2);
                    int i = 0;
                    try {
                        while (i < digest.length) {
                            final int n = digest[i] & 0xFF;
                            final int n2 = i * 2;
                            o = l9.j.a;
                            b2[n2] = (char)o[n >>> 4];
                            b2[n2 + 1] = (char)o[n & 0xF];
                            ++i;
                        }
                        o = new String(b2);
                    }
                    finally {
                        monitorexit(b2);
                    }
                }
                finally {
                    this.b.b(b);
                }
            }
            synchronized (this.a) {
                this.a.d(d, (String)o);
                return (String)o;
            }
        }
    }
    
    public static final class b implements d
    {
        public final MessageDigest f;
        public final m9.d.a g;
        
        public b(final MessageDigest f) {
            this.g = new m9.d.a();
            this.f = f;
        }
        
        @Override
        public final m9.d.a a() {
            return this.g;
        }
    }
}
