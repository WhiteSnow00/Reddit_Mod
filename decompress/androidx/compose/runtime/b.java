// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import java.util.Iterator;
import java.util.Collection;
import sg2.e;
import kotlin.a;
import hg2.f;
import z0.t;
import java.util.HashMap;
import java.util.ArrayList;
import z0.z;
import java.util.List;

public final class b
{
    public final List<z> a;
    public final int b;
    public int c;
    public final ArrayList d;
    public final HashMap<Integer, t> e;
    public final f f;
    
    public b(final ArrayList a, int i) {
        this.a = a;
        this.b = i;
        final int n = 0;
        if (i >= 0) {
            i = 1;
        }
        else {
            i = 0;
        }
        if (i != 0) {
            this.d = new ArrayList();
            final HashMap<Integer, t> e = new HashMap<Integer, t>();
            final int size = a.size();
            int n2 = 0;
            z z;
            for (i = n; i < size; ++i) {
                z = this.a.get(i);
                e.put(z.c, new t(i, n2, z.d));
                n2 += z.d;
            }
            this.e = e;
            this.f = kotlin.a.b((rg2.a)new Pending$keyMap$2(this));
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }
    
    public final int a(final z z) {
        sg2.e.f((Object)z, "keyInfo");
        final t t = this.e.get(z.c);
        int b;
        if (t != null) {
            b = t.b;
        }
        else {
            b = -1;
        }
        return b;
    }
    
    public final boolean b(int b, int n) {
        final t t = this.e.get(b);
        if (t != null) {
            b = t.b;
            final int n2 = n - t.c;
            t.c = n;
            if (n2 != 0) {
                final Collection<t> values = this.e.values();
                sg2.e.e((Object)values, "groupInfos.values");
                for (final t t2 : values) {
                    if (t2.b >= b && !sg2.e.a((Object)t2, (Object)t)) {
                        n = t2.b + n2;
                        if (n < 0) {
                            continue;
                        }
                        t2.b = n;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
