// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class x1 extends b
{
    public static final x1 c;
    
    static {
        c = new x1();
    }
    
    public x1() {
        super(79, 80);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `isMyReddit` INTEGER");
        a.execSQL("ALTER TABLE `recent_subreddits` ADD COLUMN `isMyReddit` INTEGER");
    }
}
