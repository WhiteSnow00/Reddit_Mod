// 
// Decompiled by Procyon v0.6.0
// 

package l1;

import u2.b;
import n1.f;
import u2.c;
import androidx.compose.ui.unit.LayoutDirection;

public final class i implements a
{
    public static final i f;
    public static final long g;
    public static final LayoutDirection h;
    public static final c i;
    
    static {
        f = new i();
        g = n1.f.c;
        h = LayoutDirection.Ltr;
        i = new c(1.0f, 1.0f);
    }
    
    public final long e() {
        return l1.i.g;
    }
    
    public final b getDensity() {
        return (b)l1.i.i;
    }
    
    public final LayoutDirection getLayoutDirection() {
        return l1.i.h;
    }
}
