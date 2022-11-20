// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class r0 extends b
{
    public static final r0 c;
    
    static {
        c = new r0();
    }
    
    public r0() {
        super(4, 5);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `recent_subreddits` \n(`subredditId` TEXT NOT NULL, \n`recentSubredditKindWithId` TEXT NOT NULL, `displayName` TEXT NOT NULL COLLATE NOCASE, \n`displayNamePrefixed` TEXT NOT NULL, `iconImg` TEXT, `keyColor` TEXT NOT NULL, \n`description` TEXT NOT NULL, `publicDescription` TEXT NOT NULL, \n`descriptionHtml` TEXT, `url` TEXT NOT NULL, `subscribers` INTEGER NOT NULL, \n`accountsActive` INTEGER, `bannerImg` TEXT, `over18` INTEGER NOT NULL, \n`subredditType` TEXT NOT NULL, `lastVisited` INTEGER NOT NULL, \n`createdUtc` INTEGER NOT NULL, `advertiserCategory` TEXT, `audienceTarget` TEXT, \n`contentCategory` TEXT, `quarantined` INTEGER, `quarantineMessage` TEXT, \n`quarantineMessageHtml` TEXT, `allowChatPostCreation` INTEGER, \n`isModerator` INTEGER, PRIMARY KEY(`subredditId`))");
        a.execSQL("CREATE UNIQUE INDEX \n`index_recent_subreddits_username_displayName` ON `recent_subreddits` (`displayName`)");
        a.execSQL("CREATE TABLE IF NOT EXISTS `subreddit` (`subredditId` TEXT NOT NULL, \n`subredditKindWithId` TEXT NOT NULL, `displayName` TEXT NOT NULL COLLATE NOCASE, \n`displayNamePrefixed` TEXT NOT NULL, `iconImg` TEXT, `keyColor` TEXT NOT NULL, \n`bannerImg` TEXT, `headerImg` TEXT, `title` TEXT, `description` TEXT NOT NULL, \n`publicDescription` TEXT NOT NULL, `descriptionHtml` TEXT, `publicDescriptionHtml` TEXT, \n`subscribers` INTEGER NOT NULL, `accountsActive` INTEGER, `createdUtc` INTEGER NOT NULL, \n`subredditType` TEXT NOT NULL, `url` TEXT NOT NULL, `over18` INTEGER NOT NULL, \n`wikiEnabled` INTEGER, `whitelistStatus` TEXT, `newModMailEnabled` INTEGER, \n`submitType` TEXT, `allowImages` INTEGER, `allowVideos` INTEGER, `allowGifs` INTEGER, \n`allowChatPostCreation` INTEGER, `spoilersEnabled` INTEGER, `userIsSubscriber` INTEGER, \n`userIsModerator` INTEGER, `userHasFavorited` INTEGER, `notificationLevel` TEXT, \n`updatedTimestampUtc` INTEGER NOT NULL, `primaryColorKey` TEXT, `communityIconUrl` TEXT, \n`bannerBackgroundImageUrl` TEXT, `mobileBannerImageUrl` TEXT, \n`isRedditPickDefault` INTEGER NOT NULL, `userFlairTemplateId` TEXT, \n`userSubredditFlairEnabled` INTEGER, `canAssignUserFlair` INTEGER, \n`userFlairEnabled` INTEGER, `userFlairBackgroundColor` TEXT, `userFlairTextColor` TEXT, \n`userFlairText` TEXT, `userFlairRichTextJson` TEXT, `advertiserCategory` TEXT, \n`audienceTarget` TEXT, `contentCategory` TEXT, `quarantined` INTEGER, \n`quarantineMessage` TEXT, `quarantineMessageHtml` TEXT, PRIMARY KEY(`subredditId`))");
        a.execSQL("CREATE TABLE IF NOT EXISTS `subreddit_mutations` (`parentSubredditId` TEXT NOT NULL, \n`hasBeenVisited` INTEGER, PRIMARY KEY(`parentSubredditId`))");
    }
}
