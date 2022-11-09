// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class q extends b
{
    public static final q c;
    
    static {
        c = new q();
    }
    
    public q() {
        super(25, 26);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `meta_community_info` ADD COLUMN `userMembershipCurrency` TEXT");
    }
}
