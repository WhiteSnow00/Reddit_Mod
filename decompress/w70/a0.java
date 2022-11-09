// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class a0 extends b
{
    public static final a0 c;
    
    static {
        c = new a0();
    }
    
    public a0() {
        super(34, 35);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `user_subreddit` ADD COLUMN `allowedPostTypes` TEXT");
    }
}
