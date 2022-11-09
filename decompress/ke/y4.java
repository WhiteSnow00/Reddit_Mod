// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.net.Uri;
import j0.i;
import com.google.android.gms.internal.measurement.zzif;
import android.content.Context;
import at1.a;
import h3.b;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class y4
{
    public static final Object f;
    public static volatile g4 g;
    public static final AtomicInteger h;
    public final v4 a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    
    static {
        f = new Object();
        new AtomicReference();
        new b();
        h = new AtomicInteger();
    }
    
    public abstract Object a(final String p0);
    
    public final Object b() {
        final int value = y4.h.get();
        if (this.d < value) {
            monitorenter(this);
            Label_0158: {
                try {
                    if (this.d >= value) {
                        break Label_0158;
                    }
                    final g4 g = y4.g;
                    if (g == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    final v4 a = this.a;
                    a.getClass();
                    final Uri a2 = a.a;
                    final String s = null;
                    if (a2 == null) {
                        break Label_0158;
                    }
                    i4 a3;
                    if (o4.a(g.a, this.a.a)) {
                        this.a.getClass();
                        a3 = i4.a(g.a.getContentResolver(), this.a.a, q4.f);
                    }
                    else {
                        a3 = null;
                    }
                    if (a3 == null) {
                        break Label_0158;
                    }
                    this.a.getClass();
                    final String s2 = a3.b().get(this.b);
                    if (s2 != null) {
                        final Object e = this.a(s2);
                        break Label_0158;
                    }
                    break Label_0158;
                }
                finally {
                    monitorexit(this);
                    this.a.getClass();
                    final j0.b a4 = z4.a;
                    throw null;
                    final g4 g;
                    final String s;
                    Object e = null;
                    Object o = null;
                    zzif zzif;
                    k4 k4 = null;
                    Uri a5 = null;
                    String b;
                    String s3;
                    m4 c;
                    String b2;
                    String a6;
                    i i;
                    Label_0296:Label_0403_Outer:
                    while (true) {
                    Label_0403:
                        while (true) {
                            Block_15_Outer:Block_18_Outer:
                            while (true) {
                                e = o;
                                iftrue(Label_0296:)(o != null);
                                Label_0280: {
                                    while (true) {
                                        Label_0421: {
                                            Block_16: {
                                                while (true) {
                                                    Block_12: {
                                                        Block_14: {
                                                            break Block_14;
                                                            k4 = (k4)zzif.zza();
                                                            a5 = this.a.a;
                                                            b = this.b;
                                                            k4.getClass();
                                                            s3 = s;
                                                            iftrue(Label_0403:)(a5 == null);
                                                            break Block_16;
                                                            Label_0165: {
                                                                iftrue(Label_0280:)(this.a.b);
                                                            }
                                                            break Block_12;
                                                        }
                                                        e = this.c;
                                                        break Label_0296;
                                                    }
                                                    o = g.a;
                                                    synchronized (m4.class) {
                                                        if (m4.c == null) {
                                                            if (at1.a.W((Context)o, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                                                                c = new m4((Context)o);
                                                            }
                                                            else {
                                                                c = new m4();
                                                            }
                                                            m4.c = c;
                                                        }
                                                        o = m4.c;
                                                        monitorexit(m4.class);
                                                        if (this.a.b) {
                                                            b2 = null;
                                                        }
                                                        else {
                                                            b2 = this.b;
                                                        }
                                                        a6 = ((m4)o).a(b2);
                                                        if (a6 != null) {
                                                            o = this.a(a6);
                                                            continue Block_15_Outer;
                                                        }
                                                    }
                                                    break Label_0280;
                                                    e = null;
                                                    break Label_0158;
                                                    zzif = (zzif)g.b.zza();
                                                    iftrue(Label_0421:)(!zzif.zzb());
                                                    continue Block_18_Outer;
                                                }
                                                Label_0415: {
                                                    e = this.a(s3);
                                                }
                                                break Label_0421;
                                                e = this.c;
                                                break Label_0421;
                                            }
                                            i = (i)k4.a.getOrDefault((Object)a5.toString(), (Object)null);
                                            iftrue(Label_0384:)(i != null);
                                            break Block_15_Outer;
                                        }
                                        this.e = e;
                                        this.d = value;
                                        break Label_0158;
                                        iftrue(Label_0415:)(s3 != null);
                                        continue Label_0403_Outer;
                                    }
                                    Label_0384: {
                                        s3 = (String)i.getOrDefault((Object)"".concat(String.valueOf(b)), (Object)null);
                                    }
                                    continue Label_0403;
                                }
                                o = null;
                                continue Block_15_Outer;
                            }
                            s3 = s;
                            continue Label_0403;
                        }
                        iftrue(Label_0165:)(e == null);
                        Block_11: {
                            break Block_11;
                            monitorexit(this);
                            return this.e;
                        }
                        continue Label_0296;
                    }
                }
            }
        }
        return this.e;
    }
}
