// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class z1 extends b
{
    public static final z1 c;
    
    static {
        c = new z1();
    }
    
    public z1() {
        super(80, 81);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `listing` ADD COLUMN `flair` TEXT NOT NULL DEFAULT ''");
        a.execSQL("DROP INDEX IF EXISTS index_listing_sort_sortTimeFrame_beforeId_afterId_subredditName_multiredditPath_geoFilter_categoryId_topicSlug_listingType");
        a.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_listing_sort_sortTimeFrame_beforeId_afterId_subredditName_multiredditPath_geoFilter_categoryId_topicSlug_listingType_flair` ON `listing` (`sort`, `sortTimeFrame`, `beforeId`, `afterId`, `subredditName`, `multiredditPath`, `geoFilter`, `categoryId`, `topicSlug`, `listingType`, `flair`)");
    }
}
