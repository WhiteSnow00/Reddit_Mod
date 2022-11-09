// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import android.os.Handler;
import java.util.concurrent.Executor;
import android.os.Looper;
import vd.a;
import he.e;
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
        this.g = vd.a.b();
        this.h = 5000L;
        this.i = 300000L;
    }
    
    @Override
    public final boolean c(final e1 e1, final x0 x0, String string, final Executor executor) {
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
                        f2.a(string, executor);
                        this.d.put(e1, f2);
                        final f1 f3 = f2;
                        break Label_0167;
                    }
                    break Label_0079;
                }
                finally {
                    monitorexit(d);
                    f1 f3 = null;
                    final boolean h = f3.h;
                    monitorexit(d);
                    return h;
                    Label_0179: {
                        string = e1.toString();
                    }
                    final StringBuilder sb = new StringBuilder(string.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                    final f1 f1;
                Block_5_Outer:
                    while (true) {
                        f3 = f1;
                        continue Block_7_Outer;
                        int g = 0;
                    Block_6:
                        while (true) {
                            f1.f.put(x0, x0);
                            g = f1.g;
                            iftrue(Label_0150:)(g == 1);
                            break Block_6;
                            ((Handler)this.f).removeMessages(0, (Object)e1);
                            iftrue(Label_0179:)(f1.f.containsKey(x0));
                            continue;
                        }
                        iftrue(Label_0136:)(g == 2);
                        continue Block_5_Outer;
                    }
                    Label_0150:
                    x0.onServiceConnected(f1.k, f1.i);
                    f3 = f1;
                    continue Block_7_Outer;
                    Label_0136:
                    f1.a(string, executor);
                    f3 = f1;
                    continue Block_7_Outer;
                }
            }
            break;
        }
    }
}
