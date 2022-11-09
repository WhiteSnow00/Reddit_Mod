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
    public static final i a;
    public static final long b;
    public static final LayoutDirection c;
    public static final c d;
    
    static {
        a = new i();
        b = f.c;
        c = LayoutDirection.Ltr;
        d = new c(1.0f, 1.0f);
    }
    
    @Override
    public final long b() {
        return i.b;
    }
    
    @Override
    public final b getDensity() {
        return i.d;
    }
    
    @Override
    public final LayoutDirection getLayoutDirection() {
        return i.c;
    }
}
