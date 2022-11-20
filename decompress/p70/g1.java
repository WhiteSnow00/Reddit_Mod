// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class g1 extends b
{
    public static final g1 c;
    
    static {
        c = new g1();
    }
    
    public g1() {
        super(63, 64);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `userIsContributor` INTEGER");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `restrictPosting` INTEGER");
    }
}
