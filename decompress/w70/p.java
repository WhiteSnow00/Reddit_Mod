// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class p extends b
{
    public static final p c;
    
    static {
        c = new p();
    }
    
    public p() {
        super(24, 25);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `canCreateSubreddit` INTEGER NOT NULL DEFAULT 0");
    }
}
