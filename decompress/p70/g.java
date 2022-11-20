// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class g extends b
{
    public static final g c;
    
    static {
        c = new g();
    }
    
    public g() {
        super(16, 17);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `meta_community_info` (\n`id` TEXT NOT NULL, \n`specialMembershipsEnabled` INTEGER NOT NULL, \n`specialMembershipsBoughtBefore` INTEGER NOT NULL, \n`userHasActiveMembership` INTEGER NOT NULL, \n`showSpecialMembershipBanner` INTEGER NOT NULL, \n`pointsName` TEXT, \n`membershipAlt` TEXT NOT NULL, \n`membership` TEXT NOT NULL, \n`memberAlt` TEXT NOT NULL, \n`memberAltPlural` TEXT NOT NULL, \n`member` TEXT NOT NULL, \nPRIMARY KEY(`id`))");
    }
}
