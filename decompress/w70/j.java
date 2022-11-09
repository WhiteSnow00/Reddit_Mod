// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class j extends b
{
    public static final j c;
    
    static {
        c = new j();
    }
    
    public j() {
        super(19, 20);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `user_subreddit` ADD COLUMN `icon_size_width` INTEGER");
        a.execSQL("ALTER TABLE `user_subreddit` ADD COLUMN `icon_size_height` INTEGER");
        a.execSQL("ALTER TABLE `user_subreddit` ADD COLUMN `banner_size_width` INTEGER");
        a.execSQL("ALTER TABLE `user_subreddit` ADD COLUMN `banner_size_height` INTEGER");
    }
}
