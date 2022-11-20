// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class s0 extends b
{
    public static final s0 c;
    
    static {
        c = new s0();
    }
    
    public s0() {
        super(50, 51);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `hasSubscribedToPremium` INTEGER NOT NULL DEFAULT 0");
    }
}
