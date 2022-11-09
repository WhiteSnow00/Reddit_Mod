// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class s extends b
{
    public static final s c;
    
    static {
        c = new s();
    }
    
    public s() {
        super(27, 28);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `meta_community_info` ADD COLUMN `pointsDecimals` INTEGER NOT NULL DEFAULT 0");
    }
}
