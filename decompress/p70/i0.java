// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class i0 extends b
{
    public static final i0 c;
    
    static {
        c = new i0();
    }
    
    public i0() {
        super(41, 42);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `userIsBanned` INTEGER");
    }
}
