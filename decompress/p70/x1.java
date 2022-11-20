// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class x1 extends b
{
    public static final x1 c;
    
    static {
        c = new x1();
    }
    
    public x1() {
        super(79, 80);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `isMyReddit` INTEGER");
        a.execSQL("ALTER TABLE `recent_subreddits` ADD COLUMN `isMyReddit` INTEGER");
    }
}
