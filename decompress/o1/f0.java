// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import wd.a;
import n1.c;
import sg2.e;
import u2.b;
import androidx.compose.ui.unit.LayoutDirection;

public final class f0
{
    public static final f0$a a;
    
    static {
        a = new l0() {
            @Override
            public final z g(final long n, final LayoutDirection layoutDirection, final b b) {
                e.f((Object)layoutDirection, "layoutDirection");
                e.f((Object)b, "density");
                return new z.b(wd.a.h(c.b, n));
            }
            
            @Override
            public final String toString() {
                return "RectangleShape";
            }
        };
    }
}
