// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class e1 extends b
{
    public static final e1 c;
    
    static {
        c = new e1();
    }
    
    public e1() {
        super(61, 62);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `recent_subreddits` ADD COLUMN `communityIconUrl` TEXT");
        a.execSQL("UPDATE recent_subreddits\nSET communityIconUrl = (\n  SELECT communityIconUrl\n  FROM subreddit\n  WHERE subredditId = recent_subreddits.subredditId\n)");
    }
}
