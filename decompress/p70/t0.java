// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class t0 extends b
{
    public static final t0 c;
    
    static {
        c = new t0();
    }
    
    public t0() {
        super(51, 52);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `subreddit_triggered_invite` (`subredditName` TEXT NOT NULL, `status` TEXT NOT NULL, `shownUtc` INTEGER NOT NULL, PRIMARY KEY(`subredditName`))");
    }
}
