// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class z extends b
{
    public static final z c;
    
    static {
        c = new z();
    }
    
    public z() {
        super(33, 34);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `totalKarma` INTEGER NOT NULL DEFAULT 0");
    }
}
