// 
// Decompiled by Procyon v0.6.0
// 

package zi2;

import ej2.m;
import kotlinx.coroutines.b;
import ej2.u;

public final class e0
{
    public static final h0 a;
    
    static {
        final int a2 = u.a;
        String property;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        }
        catch (final SecurityException ex) {
            property = null;
        }
        Object a3;
        if (property == null || !Boolean.parseBoolean(property)) {
            a3 = b.n;
        }
        else {
            final ij2.b a4 = k0.a;
            final g1 a5 = m.a;
            a5.V();
            if (!(a5 instanceof h0)) {
                a3 = b.n;
            }
            else {
                a3 = a5;
            }
        }
        a = (h0)a3;
    }
}
