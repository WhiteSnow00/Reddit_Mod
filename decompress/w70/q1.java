// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class q1 extends b
{
    public static final q1 c;
    
    static {
        c = new q1();
    }
    
    public q1() {
        super(72, 73);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `shouldShowMediaInCommentsSetting` INTEGER");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `allowedMediaInCommentsJson` TEXT");
    }
}
