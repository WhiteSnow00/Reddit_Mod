// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class q0 extends b
{
    public static final q0 c;
    
    static {
        c = new q0();
    }
    
    public q0() {
        super(49, 50);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `predictionLeaderboardEntryType` TEXT");
    }
}
