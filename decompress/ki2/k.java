// 
// Decompiled by Procyon v0.6.0
// 

package ki2;

import java.util.Iterator;
import yh2.c;
import ch2.v;
import p7.a;
import yh2.b;
import ng2.e;
import ch2.w;

public final class k implements f
{
    public final w a;
    
    public k(final w a) {
        e.f((Object)a, "packageFragmentProvider");
        this.a = a;
    }
    
    @Override
    public final ki2.e a(final b b) {
        e.f((Object)b, "classId");
        final w a = this.a;
        final c h = b.h();
        e.e((Object)h, "classId.packageFqName");
        for (final v v : p7.a.H(a, h)) {
            if (v instanceof l) {
                final ki2.e a2 = ((l)v).E0().a(b);
                if (a2 != null) {
                    return a2;
                }
                continue;
            }
        }
        return null;
    }
}
