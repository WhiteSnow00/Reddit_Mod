// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class z0 extends b
{
    public static final z0 c;
    
    static {
        c = new z0();
    }
    
    public z0() {
        super(57, 58);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `listing` ADD COLUMN `topicSlug` TEXT NOT NULL DEFAULT ''");
        a.execSQL("DROP INDEX IF EXISTS index_listing_sort_sortTimeFrame_beforeId_afterId_subredditName_multiredditPath_geoFilter_categoryId_listingType");
        a.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_listing_sort_sortTimeFrame_beforeId_afterId_subredditName_multiredditPath_geoFilter_categoryId_topicSlug_listingType` ON `listing` (`sort`, `sortTimeFrame`, `beforeId`, `afterId`, `subredditName`, `multiredditPath`, `geoFilter`, `categoryId`, `topicSlug`, `listingType`)");
        a.execSQL("CREATE TABLE IF NOT EXISTS `discover_feed_items` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `ordinal` INTEGER NOT NULL, `topicSlug` TEXT NOT NULL, `json` TEXT, `after` TEXT NOT NULL, PRIMARY KEY(`id`, `ordinal`))");
    }
}
