// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class u0 extends b
{
    public static final u0 c;
    
    static {
        c = new u0();
    }
    
    public u0() {
        super(52, 53);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `subreddit_extra` (`parentExtraSubredditId` TEXT NOT NULL, `isTitleSafe` INTEGER, PRIMARY KEY(`parentExtraSubredditId`))");
    }
}
