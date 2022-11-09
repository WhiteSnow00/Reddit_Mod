// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class s0 extends b
{
    public static final s0 c;
    
    static {
        c = new s0();
    }
    
    public s0() {
        super(50, 51);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `hasSubscribedToPremium` INTEGER NOT NULL DEFAULT 0");
    }
}
