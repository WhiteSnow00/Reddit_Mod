// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class z extends b
{
    public static final z c;
    
    static {
        c = new z();
    }
    
    public z() {
        super(33, 34);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `totalKarma` INTEGER NOT NULL DEFAULT 0");
    }
}
