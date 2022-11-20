// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class t1 extends b
{
    public static final t1 c;
    
    static {
        c = new t1();
    }
    
    public t1() {
        super(75, 76);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `query` ADD COLUMN `iconUrl` TEXT");
    }
}
