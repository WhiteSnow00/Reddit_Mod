// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class x0 extends b
{
    public static final x0 c;
    
    static {
        c = new x0();
    }
    
    public x0() {
        super(55, 56);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit_leaderboard` ADD COLUMN `publicDescription` TEXT");
    }
}
