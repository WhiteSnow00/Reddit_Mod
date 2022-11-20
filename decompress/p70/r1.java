// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class r1 extends b
{
    public static final r1 c;
    
    static {
        c = new r1();
    }
    
    public r1() {
        super(73, 74);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `subreddit_pinned_posts` (`parentPinnedPostsSubredditId` TEXT NOT NULL, `pinnedPosts` TEXT NOT NULL, PRIMARY KEY(`parentPinnedPostsSubredditId`))");
    }
}
