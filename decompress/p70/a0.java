// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class a0 extends b
{
    public static final a0 c;
    
    static {
        c = new a0();
    }
    
    public a0() {
        super(34, 35);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `user_subreddit` ADD COLUMN `allowedPostTypes` TEXT");
    }
}
