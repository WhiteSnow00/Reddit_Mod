// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class x extends b
{
    public static final x c;
    
    static {
        c = new x();
    }
    
    public x() {
        super(31, 32);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `announcement` ADD COLUMN `impressionCount` INTEGER NOT NULL DEFAULT '0'");
    }
}
