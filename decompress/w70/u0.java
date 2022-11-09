// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class u0 extends b
{
    public static final u0 c;
    
    static {
        c = new u0();
    }
    
    public u0() {
        super(52, 53);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `subreddit_extra` (`parentExtraSubredditId` TEXT NOT NULL, `isTitleSafe` INTEGER, PRIMARY KEY(`parentExtraSubredditId`))");
    }
}
