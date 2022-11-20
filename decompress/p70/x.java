// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class x extends b
{
    public static final x c;
    
    static {
        c = new x();
    }
    
    public x() {
        super(31, 32);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `announcement` ADD COLUMN `impressionCount` INTEGER NOT NULL DEFAULT '0'");
    }
}
