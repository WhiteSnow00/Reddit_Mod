// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class b2 extends b
{
    public static final b2 c;
    
    static {
        c = new b2();
    }
    
    public b2() {
        super(82, 83);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `isMuted` INTEGER");
        a.execSQL("ALTER TABLE `recent_subreddits` ADD COLUMN `isMuted` INTEGER");
    }
}
