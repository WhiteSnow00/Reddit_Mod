// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import android.net.Uri;
import android.content.Context;
import a92.b;
import com.google.android.gms.internal.measurement.zzif;
import v0.i;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a5
{
    public static final Object f;
    public static volatile i4 g;
    public static final AtomicInteger h;
    public final x4 a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    
    static {
        f = new Object();
        new AtomicReference();
        new i();
        h = new AtomicInteger();
    }
    
    public abstract Object a(final String p0);
    
    public final Object b() {
        final int value = a5.h.get();
        if (this.d < value) {
            monitorenter(this);
        Label_0421_Outer:
            while (true) {
                try {
                    if (this.d >= value) {
                        break Label_0421_Outer;
                    }
                    final i4 g = a5.g;
                    if (g == null) {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                    final x4 a = this.a;
                    a.getClass();
                    final Uri a2 = a.a;
                    final String s = null;
                    if (a2 == null) {
                        break Label_0421_Outer;
                    }
                    k4 a3;
                    if (q4.a(g.a, this.a.a)) {
                        this.a.getClass();
                        a3 = k4.a(g.a.getContentResolver(), this.a.a, (Runnable)s4.f);
                    }
                    else {
                        a3 = null;
                    }
                    if (a3 == null) {
                        break Label_0421_Outer;
                    }
                    this.a.getClass();
                    final String s2 = a3.b().get(this.b);
                    if (s2 != null) {
                        final Object e = this.a(s2);
                        break Label_0158;
                    }
                    break Label_0421_Outer;
                }
                finally {
                    monitorexit(this);
                    final i4 g;
                    final String s;
                    Object e = null;
                    String s3;
                    Object o;
                    zzif zzif;
                    m4 m4;
                    Uri a4;
                    String b;
                    j0.i i;
                    j0.b a5;
                    o4 c;
                    String b2;
                    String a6;
                    Label_0280_Outer:Block_12_Outer:
                    while (true) {
                        this.e = e;
                        this.d = value;
                        break Label_0421_Outer;
                        Label_0415: {
                            e = this.a(s3);
                        }
                        continue Label_0280_Outer;
                        Block_18: {
                            while (true) {
                            Label_0283_Outer:
                                while (true) {
                                    o = null;
                                    Block_15_Outer:Label_0296_Outer:
                                    while (true) {
                                        break Label_0283;
                                    Label_0403_Outer:
                                        while (true) {
                                            Block_11: {
                                                while (true) {
                                                    Block_16: {
                                                        while (true) {
                                                            m4 = (m4)zzif.zza();
                                                            a4 = this.a.a;
                                                            b = this.b;
                                                            m4.getClass();
                                                            s3 = s;
                                                            iftrue(Label_0403:)(a4 == null);
                                                            break Block_16;
                                                            zzif = (zzif)g.b.zza();
                                                            iftrue(Label_0421:)(!zzif.zzb());
                                                            continue Label_0296_Outer;
                                                        }
                                                        iftrue(Label_0415:)(s3 != null);
                                                        break Block_18;
                                                    }
                                                    i = (j0.i)m4.a.getOrDefault((Object)a4.toString(), (Object)null);
                                                    iftrue(Label_0384:)(i != null);
                                                    Block_17: {
                                                        break Block_17;
                                                        Label_0384:
                                                        s3 = (String)i.getOrDefault((Object)"".concat(String.valueOf(b)), (Object)null);
                                                        continue Block_12_Outer;
                                                        iftrue(Label_0165:)(e == null);
                                                        break Block_11;
                                                    }
                                                    s3 = s;
                                                    continue Block_12_Outer;
                                                }
                                                e = o;
                                                iftrue(Label_0296:)(o != null);
                                                Block_14: {
                                                    break Block_14;
                                                    e = null;
                                                    continue Label_0421_Outer;
                                                }
                                                e = this.c;
                                            }
                                            continue Label_0403_Outer;
                                        }
                                        this.a.getClass();
                                        a5 = b5.a;
                                        throw null;
                                        o = g.a;
                                        synchronized (o4.class) {
                                            if (o4.c == null) {
                                                if (a92.b.A((Context)o, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                                                    c = new o4((Context)o);
                                                }
                                                else {
                                                    c = new o4();
                                                }
                                                o4.c = c;
                                            }
                                            o = o4.c;
                                            monitorexit(o4.class);
                                            if (this.a.b) {
                                                b2 = null;
                                            }
                                            else {
                                                b2 = this.b;
                                            }
                                            a6 = ((o4)o).a(b2);
                                            if (a6 != null) {
                                                o = this.a(a6);
                                                continue Block_15_Outer;
                                            }
                                        }
                                        break;
                                    }
                                    continue Label_0283_Outer;
                                }
                                Label_0165:
                                iftrue(Label_0280:)(this.a.b);
                                continue;
                            }
                        }
                        e = this.c;
                        continue Label_0280_Outer;
                    }
                    monitorexit(this);
                }
                break;
            }
        }
        return this.e;
    }
}
