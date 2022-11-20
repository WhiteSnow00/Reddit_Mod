// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class j extends b
{
    public static final j c;
    
    static {
        c = new j();
    }
    
    public j() {
        super(19, 20);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `user_subreddit` ADD COLUMN `icon_size_width` INTEGER");
        a.execSQL("ALTER TABLE `user_subreddit` ADD COLUMN `icon_size_height` INTEGER");
        a.execSQL("ALTER TABLE `user_subreddit` ADD COLUMN `banner_size_width` INTEGER");
        a.execSQL("ALTER TABLE `user_subreddit` ADD COLUMN `banner_size_height` INTEGER");
    }
}
