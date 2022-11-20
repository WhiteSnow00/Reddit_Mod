// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class s extends b
{
    public static final s c;
    
    static {
        c = new s();
    }
    
    public s() {
        super(27, 28);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `meta_community_info` ADD COLUMN `pointsDecimals` INTEGER NOT NULL DEFAULT 0");
    }
}
