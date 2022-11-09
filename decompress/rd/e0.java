// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import com.google.android.gms.common.api.a$e;
import android.content.Context;
import yd.a;
import od.f;
import android.util.SparseIntArray;

public final class e0
{
    public final SparseIntArray a;
    public f b;
    
    public e0(final f b) {
        this.a = new SparseIntArray();
        yd.a.S0((Object)b);
        this.b = b;
    }
    
    public final int a(final Context context, final a$e a$e) {
        yd.a.S0((Object)context);
        yd.a.S0((Object)a$e);
        final boolean s = a$e.s();
        final int n = 0;
        if (!s) {
            return 0;
        }
        final int m = a$e.m();
        int n2 = this.a.get(m, -1);
        if (n2 == -1) {
            while (true) {
                for (int i = 0; i < this.a.size(); ++i) {
                    final int key = this.a.keyAt(i);
                    if (key > m && this.a.get(key) == 0) {
                        n2 = n;
                        if (n2 == -1) {
                            n2 = this.b.c(context, m);
                        }
                        this.a.put(m, n2);
                        return n2;
                    }
                }
                n2 = -1;
                continue;
            }
        }
        return n2;
    }
}
