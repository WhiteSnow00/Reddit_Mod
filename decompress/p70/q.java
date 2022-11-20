// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class q extends b
{
    public static final q c;
    
    static {
        c = new q();
    }
    
    public q() {
        super(25, 26);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `meta_community_info` ADD COLUMN `userMembershipCurrency` TEXT");
    }
}
