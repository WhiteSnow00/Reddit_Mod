// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class x0 extends b
{
    public static final x0 c;
    
    static {
        c = new x0();
    }
    
    public x0() {
        super(55, 56);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit_leaderboard` ADD COLUMN `publicDescription` TEXT");
    }
}
