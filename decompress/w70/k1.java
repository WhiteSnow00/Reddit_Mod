// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class k1 extends b
{
    public static final k1 c;
    
    static {
        c = new k1();
    }
    
    public k1() {
        super(67, 68);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("DROP TABLE `rate_limit`");
    }
}
