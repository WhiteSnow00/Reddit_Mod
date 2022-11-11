// 
// Decompiled by Procyon v0.6.0
// 

package s8;

import l9.a;
import l9.a$c;
import o8.d;
import k9.g;

public final class j
{
    public final g<d, String> a;
    public final a$c b;
    
    public j() {
        this.a = (g<d, String>)new g(1000L);
        this.b = l9.a.a(10, (a.b)new j$a());
    }
    
    public final String a(final d d) {
        Object o = this.a;
        synchronized (o) {
            final String s = (String)this.a.a((Object)d);
            monitorexit(o);
            o = s;
            if (s == null) {
                o = this.b.a();
                ml0.a.l(o);
                final j.j$b j$b = (j.j$b)o;
                try {
                    d.updateDiskCacheKey(j$b.f);
                    final byte[] digest = j$b.f.digest();
                    final char[] b = k9.j.b;
                    monitorenter(b);
                    int i = 0;
                    try {
                        while (i < digest.length) {
                            final int n = digest[i] & 0xFF;
                            final int n2 = i * 2;
                            o = k9.j.a;
                            b[n2] = (char)o[n >>> 4];
                            b[n2 + 1] = (char)o[n & 0xF];
                            ++i;
                        }
                        o = new String(b);
                    }
                    finally {
                        monitorexit(b);
                    }
                }
                finally {
                    this.b.b((Object)j$b);
                }
            }
            synchronized (this.a) {
                this.a.d((Object)d, o);
                return (String)o;
            }
        }
    }
}
