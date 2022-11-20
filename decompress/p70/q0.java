// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class q0 extends b
{
    public static final q0 c;
    
    static {
        c = new q0();
    }
    
    public q0() {
        super(49, 50);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `predictionLeaderboardEntryType` TEXT");
    }
}
