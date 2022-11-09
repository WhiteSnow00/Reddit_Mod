// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class y extends b
{
    public static final y c;
    
    static {
        c = new y();
    }
    
    public y() {
        super(32, 33);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `awardeeKarma` INTEGER NOT NULL DEFAULT 0");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `awarderKarma` INTEGER NOT NULL DEFAULT 0");
    }
}
