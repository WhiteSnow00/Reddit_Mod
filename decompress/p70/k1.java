// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class k1 extends b
{
    public static final k1 c;
    
    static {
        c = new k1();
    }
    
    public k1() {
        super(67, 68);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("DROP TABLE `rate_limit`");
    }
}
