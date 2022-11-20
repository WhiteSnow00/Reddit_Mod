// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class o extends b
{
    public static final o c;
    
    static {
        c = new o();
    }
    
    public o() {
        super(23, 24);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `meta_community_info` ADD COLUMN `pointsImageGrayUrl` TEXT");
        a.execSQL("ALTER TABLE `meta_community_info` ADD COLUMN `pointsImageFilledUrl` TEXT");
        a.execSQL("ALTER TABLE `meta_community_info` ADD COLUMN `currency` TEXT");
        a.execSQL("ALTER TABLE `meta_community_info` ADD COLUMN `subscriptionAddress` TEXT");
        a.execSQL("ALTER TABLE `meta_community_info` ADD COLUMN `userMembershipStart` INTEGER");
        a.execSQL("ALTER TABLE `meta_community_info` ADD COLUMN `userMembershipEnd` INTEGER");
        a.execSQL("ALTER TABLE `meta_community_info` ADD COLUMN `renews` INTEGER NOT NULL DEFAULT 1");
    }
}
