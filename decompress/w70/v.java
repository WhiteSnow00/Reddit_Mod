// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class v extends b
{
    public static final v c;
    
    static {
        c = new v();
    }
    
    public v() {
        super(2, 3);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `account` \n(`accountId` TEXT NOT NULL, \n`name` TEXT NOT NULL COLLATE NOCASE, \n`createdUtc` INTEGER NOT NULL, \n`isEmployee` INTEGER NOT NULL, \n`isFriend` INTEGER NOT NULL, \n`isSuspended` INTEGER NOT NULL, \n`suspensionExpiration` INTEGER, \n`hideFromRobots` INTEGER NOT NULL, \n`linkKarma` INTEGER NOT NULL, \n`commentKarma` INTEGER NOT NULL, \n`isGold` INTEGER NOT NULL, \n`isPremiumSubscriber` INTEGER NOT NULL, \n`premiumExpirationUtc` INTEGER, \n`premiumSinceUtc` INTEGER, \n`isMod` INTEGER NOT NULL, \n`hasVerifiedEmail` INTEGER, \n`inboxCount` INTEGER NOT NULL, \n`hasMail` INTEGER NOT NULL, \n`hasModMail` INTEGER NOT NULL, \n`hideAds` INTEGER NOT NULL, \n`coins` INTEGER NOT NULL, \n`iconUrl` TEXT NOT NULL, \n`showMyActiveCommunities` INTEGER, \n`outboundClickTracking` INTEGER NOT NULL, \n`forcePasswordReset` INTEGER NOT NULL, \n`inChat` INTEGER NOT NULL, \n`featuresJson` TEXT NOT NULL, \nPRIMARY KEY(`accountId`))");
        a.execSQL("CREATE UNIQUE INDEX `index_account_name` ON `account` (`name`)");
        a.execSQL("CREATE TABLE IF NOT EXISTS `account_mutations` (\n`parentAccountId` TEXT NOT NULL, \n`hasBeenVisited` INTEGER, \nPRIMARY KEY(`parentAccountId`))");
        a.execSQL("CREATE TABLE IF NOT EXISTS `user_subreddit` (\n`username` TEXT NOT NULL COLLATE NOCASE, \n`bannerImg` TEXT, \n`userIsBanned` INTEGER, \n`description` TEXT NOT NULL, \n`userIsMuted` INTEGER, \n`displayName` TEXT NOT NULL, \n`headerImg` TEXT, \n`title` TEXT NOT NULL, \n`userIsModerator` INTEGER, \n`over18` INTEGER NOT NULL, \n`iconImg` TEXT NOT NULL, \n`displayNamePrefixed` TEXT NOT NULL, \n`subscribers` INTEGER NOT NULL, \n`isDefaultIcon` INTEGER NOT NULL, \n`keyColor` TEXT NOT NULL, \n`kindWithId` TEXT NOT NULL, \n`isDefaultBanner` INTEGER NOT NULL, \n`url` TEXT NOT NULL, \n`userIsContributor` INTEGER, \n`publicDescription` TEXT NOT NULL, \n`subredditType` TEXT NOT NULL, \n`userIsSubscriber` INTEGER, \n`showInDefaultSubreddits` INTEGER NOT NULL, \nPRIMARY KEY(`username`), \nFOREIGN KEY(`username`) REFERENCES `account`(`name`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
    }
}
