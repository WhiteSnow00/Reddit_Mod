// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import com.google.android.exoplayer2.n$a;
import java.util.Collections;
import java.util.ArrayList;
import bd.s;
import com.google.android.exoplayer2.n;
import java.util.List;

public final class h implements e0$c
{
    public final int a;
    public final List<n> b;
    
    public h(final int a, final List<n> b) {
        this.a = a;
        this.b = b;
    }
    
    public final e0 a(final int n, final e0$b e0$b) {
        if (n != 2) {
            if (n == 3 || n == 4) {
                return (e0)new u((k)new r(e0$b.a));
            }
            if (n == 21) {
                return (e0)new u((k)new p());
            }
            final e0 e0 = null;
            final e0 e2 = null;
            final e0 e3 = null;
            final e0 e4 = null;
            if (n == 27) {
                Object o;
                if (this.c(4)) {
                    o = e3;
                }
                else {
                    o = new u((k)new nb.n(new a0((List)this.b(e0$b)), this.c(1), this.c(8)));
                }
                return (e0)o;
            }
            if (n == 36) {
                return (e0)new u((k)new o(new a0((List)this.b(e0$b))));
            }
            if (n != 89) {
                if (n != 138) {
                    if (n == 172) {
                        return (e0)new u((k)new e(e0$b.a));
                    }
                    if (n == 257) {
                        return (e0)new z((y)new t("application/vnd.dvb.ait"));
                    }
                    if (n != 134) {
                        Label_0250: {
                            if (n != 135) {
                                switch (n) {
                                    default: {
                                        switch (n) {
                                            default: {
                                                return null;
                                            }
                                            case 130: {
                                                if (!this.c(64)) {
                                                    return null;
                                                }
                                                return (e0)new u((k)new i(e0$b.a));
                                            }
                                            case 129: {
                                                break Label_0250;
                                            }
                                            case 128: {
                                                return (e0)new u((k)new l(new f0((List)this.b(e0$b))));
                                            }
                                        }
                                        break;
                                    }
                                    case 17: {
                                        Object o2;
                                        if (this.c(2)) {
                                            o2 = e4;
                                        }
                                        else {
                                            o2 = new u((k)new q(e0$b.a));
                                        }
                                        return (e0)o2;
                                    }
                                    case 16: {
                                        return (e0)new u((k)new m(new f0((List)this.b(e0$b))));
                                    }
                                    case 15: {
                                        Object o3;
                                        if (this.c(2)) {
                                            o3 = e0;
                                        }
                                        else {
                                            o3 = new u((k)new g(false, e0$b.a));
                                        }
                                        return (e0)o3;
                                    }
                                }
                            }
                        }
                        return (e0)new u((k)new b(e0$b.a));
                    }
                    Object o4;
                    if (this.c(16)) {
                        o4 = e2;
                    }
                    else {
                        o4 = new z((y)new t("application/x-scte35"));
                    }
                    return (e0)o4;
                }
                return (e0)new u((k)new i(e0$b.a));
            }
            return (e0)new u((k)new j(e0$b.b));
        }
        return (e0)new u((k)new l(new f0((List)this.b(e0$b))));
    }
    
    public final List<n> b(final e0$b e0$b) {
        if (this.c(32)) {
            return this.b;
        }
        final s s = new s(e0$b.c);
        List<n> b = this.b;
        while (s.c - s.b > 0) {
            final int r = s.r();
            final int r2 = s.r();
            final int b2 = s.b;
            if (r == 134) {
                final ArrayList<n> list = new ArrayList<n>();
                final int r3 = s.r();
                int n = 0;
                while (true) {
                    b = list;
                    if (n >= (r3 & 0x1F)) {
                        break;
                    }
                    final String o = s.o(3);
                    final int r4 = s.r();
                    final boolean b3 = (r4 & 0x80) != 0x0;
                    int c;
                    String k;
                    if (b3) {
                        c = (r4 & 0x3F);
                        k = "application/cea-708";
                    }
                    else {
                        k = "application/cea-608";
                        c = 1;
                    }
                    final byte b4 = (byte)s.r();
                    s.C(1);
                    List<byte[]> singletonList = null;
                    if (b3) {
                        byte[] array;
                        if ((b4 & 0x40) != 0x0) {
                            array = new byte[] { 1 };
                        }
                        else {
                            array = new byte[] { 0 };
                        }
                        singletonList = Collections.singletonList(array);
                    }
                    final n$a n$a = new n$a();
                    n$a.k = k;
                    n$a.c = o;
                    n$a.C = c;
                    n$a.m = singletonList;
                    list.add(new n(n$a));
                    ++n;
                }
            }
            s.B(b2 + r2);
        }
        return b;
    }
    
    public final boolean c(final int n) {
        return (n & this.a) != 0x0;
    }
}
