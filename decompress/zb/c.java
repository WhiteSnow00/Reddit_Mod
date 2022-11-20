// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import android.os.Message;
import android.os.Handler$Callback;

public final class c implements Handler$Callback
{
    public final d f;
    
    public c(final d f) {
        this.f = f;
    }
    
    public final boolean handleMessage(final Message message) {
        final d f = this.f;
        f.getClass();
        final int what = message.what;
        if (what != 0) {
            if (what != 1) {
                if (what != 2) {
                    throw new IllegalStateException();
                }
                final d.a a = (d.a)message.obj;
                f.k = (List<b>)Collections.unmodifiableList((List<?>)a.b);
                final boolean e = f.e();
                if (a.a) {
                    final Iterator<d.c> iterator = f.d.iterator();
                    while (iterator.hasNext()) {
                        ((d.c)iterator.next()).getClass();
                    }
                }
                else {
                    final Iterator<d.c> iterator2 = f.d.iterator();
                    while (iterator2.hasNext()) {
                        ((d.c)iterator2.next()).getClass();
                    }
                }
                if (e) {
                    f.a();
                }
            }
            else {
                final int arg1 = message.arg1;
                final int arg2 = message.arg2;
                final int e2 = f.e - arg1;
                f.e = e2;
                if (arg2 == 0 && e2 == 0) {
                    final Iterator<d.c> iterator3 = f.d.iterator();
                    while (iterator3.hasNext()) {
                        ((d.c)iterator3.next()).getClass();
                    }
                }
            }
        }
        else {
            f.k = Collections.unmodifiableList((List<? extends b>)message.obj);
            final boolean e3 = f.e();
            final Iterator<d.c> iterator4 = f.d.iterator();
            while (iterator4.hasNext()) {
                ((d.c)iterator4.next()).getClass();
            }
            if (e3) {
                f.a();
            }
        }
        return true;
    }
}
