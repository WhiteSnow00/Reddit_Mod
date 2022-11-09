// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class b0 extends b
{
    public static final b0 c;
    
    static {
        c = new b0();
    }
    
    public b0() {
        super(35, 36);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `subreddit_leaderboard` (`id` TEXT NOT NULL, `name` TEXT NOT NULL, `prefixedName` TEXT NOT NULL, `avatarImageUrl` TEXT, `rank` INTEGER, `rankDelta` INTEGER, `isSubscribed` INTEGER NOT NULL, `backgroundColorKey` TEXT, `backgroundColor` INTEGER, `subscribers` INTEGER NOT NULL, `isNsfw` INTEGER NOT NULL, `isQuarantined` INTEGER NOT NULL, `categoryId` TEXT NOT NULL, `cursor` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`id`, `categoryId`))");
    }
}
