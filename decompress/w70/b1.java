// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class b1 extends b
{
    public static final b1 c;
    
    static {
        c = new b1();
    }
    
    public b1() {
        super(59, 60);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `acceptFollowers` INTEGER NOT NULL DEFAULT 1");
    }
}
