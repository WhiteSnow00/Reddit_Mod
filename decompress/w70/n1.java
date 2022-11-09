// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class n1 extends b
{
    public static final n1 c;
    
    static {
        c = new n1();
    }
    
    public n1() {
        super(6, 7);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `listing` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n`sort` TEXT, `sortTimeFrame` TEXT, `beforeId` TEXT NOT NULL, `afterId` TEXT NOT NULL, \n`adDistance` TEXT NOT NULL, `subredditName` TEXT NOT NULL, `multiredditPath` TEXT NOT NULL, \n`geoFilter` TEXT NOT NULL, `categoryId` TEXT NOT NULL, `listingType` TEXT NOT NULL)");
        a.execSQL("CREATE UNIQUE INDEX `index_listing_sort_sortTimeFrame_beforeId_afterId_subredditName_multiredditPath_geoFilter_categoryId_listingType` \nON `listing` (`sort`, `sortTimeFrame`, `beforeId`, `afterId`, `subredditName`, \n`multiredditPath`, `geoFilter`, `categoryId`, `listingType`)");
        a.execSQL("CREATE TABLE IF NOT EXISTS `link` (`linkId` TEXT NOT NULL, \n`listingPosition` INTEGER NOT NULL, `linkJson` TEXT NOT NULL, \n`listingId` INTEGER NOT NULL, PRIMARY KEY(`linkId`, `listingId`), \nFOREIGN KEY(`listingId`) REFERENCES `listing`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        a.execSQL("CREATE TABLE IF NOT EXISTS `link_mutations` (`parentLinkId` TEXT NOT NULL, \n`isRead` INTEGER NOT NULL, `readTimestampUtc` INTEGER NOT NULL, `isHidden` INTEGER, \n`isSaved` INTEGER, `isFollowed` INTEGER, PRIMARY KEY(`parentLinkId`))");
    }
}
