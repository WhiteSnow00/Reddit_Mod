// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class j0 extends b
{
    public static final j0 c;
    
    static {
        c = new j0();
    }
    
    public j0() {
        super(42, 43);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("DROP TABLE `category_click`");
    }
}
