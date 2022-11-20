// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class n0 extends b
{
    public static final n0 c;
    
    static {
        c = new n0();
    }
    
    public n0() {
        super(46, 47);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `snoovatarUrl` TEXT");
    }
}
