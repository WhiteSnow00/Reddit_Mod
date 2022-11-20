// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class y1 extends b
{
    public static final y1 c;
    
    static {
        c = new y1();
    }
    
    public y1() {
        super(7, 8);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `query` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n`query` TEXT NOT NULL COLLATE NOCASE, `subreddit` TEXT NOT NULL, \n`subredditId` TEXT NOT NULL, `userSubreddit` TEXT NOT NULL, \n`userSubredditKindWithId` TEXT NOT NULL, `flair` TEXT NOT NULL, \n`flairRichText` TEXT NOT NULL, `flairTextColor` TEXT NOT NULL, \n`flairBackgroundColorHex` TEXT NOT NULL, `flairApiText` TEXT NOT NULL, \n`category` TEXT NOT NULL, `categoryId` TEXT NOT NULL, `timestamp` INTEGER NOT NULL)");
        a.execSQL("CREATE UNIQUE INDEX `index_query_query_subreddit_subredditId_userSubreddit_userSubredditKindWithId_flair_flairRichText_flairTextColor_flairBackgroundColorHex_flairApiText_category_categoryId` \nON `query` (`query`, `subreddit`, `subredditId`, `userSubreddit`, \n`userSubredditKindWithId`, `flair`, `flairRichText`, `flairTextColor`, \n`flairBackgroundColorHex`, `flairApiText`, `category`, `categoryId`)");
    }
}
