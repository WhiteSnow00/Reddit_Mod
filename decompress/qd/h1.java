// 
// Decompiled by Procyon v0.6.0
// 

package qd;

import android.os.Handler;
import java.util.concurrent.Executor;
import android.os.Looper;
import ud.a;
import ge.e;
import android.content.Context;
import java.util.HashMap;

public final class h1 extends h
{
    public final HashMap<e1, f1> d;
    public final Context e;
    public volatile e f;
    public final a g;
    public final long h;
    public final long i;
    
    public h1(final Context context, final Looper looper) {
        this.d = new HashMap<e1, f1>();
        final g1 g1 = new g1(this);
        this.e = context.getApplicationContext();
        this.f = new e(looper, g1);
        this.g = a.b();
        this.h = 5000L;
        this.i = 300000L;
    }
    
    public final boolean c(final e1 e1, final x0 x0, final String s, final Executor executor) {
        final HashMap<e1, f1> d = this.d;
        monitorenter(d);
    Block_7_Outer:
        while (true) {
            Label_0079: {
                try {
                    final f1 f1 = this.d.get(e1);
                    if (f1 == null) {
                        final f1 f2 = new f1(this, e1);
                        f2.f.put(x0, x0);
                        f2.a(s, executor);
                        this.d.put(e1, f2);
                        final f1 f3 = f2;
                        break Label_0167;
                    }
                    break Label_0079;
                }
                finally {
                    monitorexit(d);
                    ((Handler)this.f).removeMessages(0, (Object)e1);
                    final f1 f1;
                    iftrue(Label_0179:)(f1.f.containsKey(x0));
                    Block_5: {
                        break Block_5;
                        final f1 f3;
                        final boolean h = f3.h;
                        monitorexit(d);
                        return h;
                    }
                    f1.f.put(x0, x0);
                    final int g = f1.g;
                    iftrue(Label_0150:)(g == 1);
                    while (true) {
                        Block_6: {
                            break Block_6;
                            f1 f3 = f1;
                            continue Block_7_Outer;
                            final String string;
                            Label_0179: {
                                string = e1.toString();
                            }
                            final StringBuilder sb = new StringBuilder(string.length() + 81);
                            sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                            sb.append(string);
                            throw new IllegalStateException(sb.toString());
                            Label_0150:
                            x0.onServiceConnected(f1.k, f1.i);
                            f3 = f1;
                            continue Block_7_Outer;
                            Label_0136:
                            f1.a(s, executor);
                            f3 = f1;
                            continue Block_7_Outer;
                        }
                        iftrue(Label_0136:)(g == 2);
                        continue;
                    }
                }
            }
            break;
        }
    }
}
