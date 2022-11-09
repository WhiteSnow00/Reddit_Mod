// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class g1 extends b
{
    public static final g1 c;
    
    static {
        c = new g1();
    }
    
    public g1() {
        super(63, 64);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `userIsContributor` INTEGER");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `restrictPosting` INTEGER");
    }
}
