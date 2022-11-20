// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class t extends b
{
    public static final t c;
    
    static {
        c = new t();
    }
    
    public t() {
        super(28, 29);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `linkedIdentities` TEXT NOT NULL DEFAULT ''");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `hasPasswordSet` INTEGER NOT NULL DEFAULT 0");
    }
}
