// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class q1 extends b
{
    public static final q1 c;
    
    static {
        c = new q1();
    }
    
    public q1() {
        super(72, 73);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `shouldShowMediaInCommentsSetting` INTEGER");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `allowedMediaInCommentsJson` TEXT");
    }
}
