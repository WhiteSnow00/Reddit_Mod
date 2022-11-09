// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class j1 extends b
{
    public static final j1 c;
    
    static {
        c = new j1();
    }
    
    public j1() {
        super(66, 67);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `listing` ADD COLUMN `prune` INTEGER DEFAULT 0 NOT NULL");
    }
}
