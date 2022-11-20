// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class y extends b
{
    public static final y c;
    
    static {
        c = new y();
    }
    
    public y() {
        super(32, 33);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `awardeeKarma` INTEGER NOT NULL DEFAULT 0");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `awarderKarma` INTEGER NOT NULL DEFAULT 0");
    }
}
