// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class r extends b
{
    public static final r c;
    
    static {
        c = new r();
    }
    
    public r() {
        super(26, 27);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `canEditName` INTEGER NOT NULL DEFAULT 0");
    }
}
