// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class p1 extends b
{
    public static final p1 c;
    
    static {
        c = new p1();
    }
    
    public p1() {
        super(71, 72);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `recent_subreddits` ADD COLUMN `submitType` TEXT");
        a.execSQL("ALTER TABLE `recent_subreddits` ADD COLUMN `allowImages` INTEGER");
        a.execSQL("ALTER TABLE `recent_subreddits` ADD COLUMN `spoilersEnabled` INTEGER");
        a.execSQL("ALTER TABLE `recent_subreddits` ADD COLUMN `allowPolls` INTEGER");
        a.execSQL("ALTER TABLE `recent_subreddits` ADD COLUMN `allowPredictions` INTEGER");
        a.execSQL("ALTER TABLE `recent_subreddits` ADD COLUMN `allowVideos` INTEGER");
    }
}
