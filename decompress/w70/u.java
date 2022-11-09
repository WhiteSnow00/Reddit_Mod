// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class u extends b
{
    public static final u c;
    
    static {
        c = new u();
    }
    
    public u() {
        super(29, 30);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("\n      CREATE TABLE IF NOT EXISTS `user_subreddit_new` (`username` TEXT NOT NULL COLLATE NOCASE, `bannerImg` TEXT, `userIsBanned` INTEGER, `description` TEXT NOT NULL, `userIsMuted` INTEGER, `displayName` TEXT NOT NULL, `headerImg` TEXT, `title` TEXT NOT NULL, `userIsModerator` INTEGER, `over18` INTEGER NOT NULL, `iconImg` TEXT NOT NULL, `displayNamePrefixed` TEXT NOT NULL, `subscribers` INTEGER NOT NULL, `isDefaultIcon` INTEGER NOT NULL, `keyColor` TEXT NOT NULL, `kindWithId` TEXT NOT NULL, `isDefaultBanner` INTEGER NOT NULL, `url` TEXT NOT NULL, `userIsContributor` INTEGER, `publicDescription` TEXT NOT NULL, `subredditType` TEXT NOT NULL, `userIsSubscriber` INTEGER, `showInDefaultSubreddits` INTEGER NOT NULL, `icon_size_width` INTEGER, `icon_size_height` INTEGER, `banner_size_width` INTEGER, `banner_size_height` INTEGER, PRIMARY KEY(`username`), FOREIGN KEY(`username`) REFERENCES `account`(`name`) ON UPDATE CASCADE ON DELETE CASCADE )\n      ");
        a.execSQL("\n        INSERT INTO `user_subreddit_new` (`username`, `bannerImg`, `userIsBanned`, `description`, `userIsMuted`, `displayName`, `headerImg`, `title`, `userIsModerator`,`over18`,`iconImg`, `displayNamePrefixed`, `subscribers`, `isDefaultIcon`, `keyColor`, `kindWithId`, `isDefaultBanner`,`url`, `userIsContributor`, `publicDescription`,`subredditType`, `userIsSubscriber`,  `showInDefaultSubreddits`, `icon_size_width`, `icon_size_height`, `banner_size_width`, `banner_size_height`)\n            SELECT `username`, `bannerImg`, `userIsBanned`, `description`, `userIsMuted`, `displayName`, `headerImg`, `title`, `userIsModerator`,`over18`,`iconImg`, `displayNamePrefixed`, `subscribers`, `isDefaultIcon`, `keyColor`, `kindWithId`, `isDefaultBanner`,`url`, `userIsContributor`, `publicDescription`,`subredditType`, `userIsSubscriber`,  `showInDefaultSubreddits`, `icon_size_width`, `icon_size_height`, `banner_size_width`, `banner_size_height`\n            FROM `user_subreddit`\n      ");
        a.execSQL("DROP TABLE `user_subreddit`");
        a.execSQL("ALTER TABLE `user_subreddit_new` RENAME TO `user_subreddit`");
    }
}
