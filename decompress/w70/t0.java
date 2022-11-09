// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class t0 extends b
{
    public static final t0 c;
    
    static {
        c = new t0();
    }
    
    public t0() {
        super(51, 52);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `subreddit_triggered_invite` (`subredditName` TEXT NOT NULL, `status` TEXT NOT NULL, `shownUtc` INTEGER NOT NULL, PRIMARY KEY(`subredditName`))");
    }
}
