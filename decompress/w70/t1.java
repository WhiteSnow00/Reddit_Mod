// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class t1 extends b
{
    public static final t1 c;
    
    static {
        c = new t1();
    }
    
    public t1() {
        super(75, 76);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `query` ADD COLUMN `iconUrl` TEXT");
    }
}
