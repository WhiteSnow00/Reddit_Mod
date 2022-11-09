// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class i0 extends b
{
    public static final i0 c;
    
    static {
        c = new i0();
    }
    
    public i0() {
        super(41, 42);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `userIsBanned` INTEGER");
    }
}
