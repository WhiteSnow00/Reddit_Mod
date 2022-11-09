// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class j0 extends b
{
    public static final j0 c;
    
    static {
        c = new j0();
    }
    
    public j0() {
        super(42, 43);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("DROP TABLE `category_click`");
    }
}
