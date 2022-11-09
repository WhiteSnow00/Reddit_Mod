// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class t extends b
{
    public static final t c;
    
    static {
        c = new t();
    }
    
    public t() {
        super(28, 29);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `linkedIdentities` TEXT NOT NULL DEFAULT ''");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `hasPasswordSet` INTEGER NOT NULL DEFAULT 0");
    }
}
