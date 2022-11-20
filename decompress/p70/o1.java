// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class o1 extends b
{
    public static final o1 c;
    
    static {
        c = new o1();
    }
    
    public o1() {
        super(70, 71);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `query` ADD COLUMN `subredditQuarantined` INTEGER");
        a.execSQL("ALTER TABLE `query` ADD COLUMN `subredditNsfw` INTEGER");
        a.execSQL("ALTER TABLE `query` ADD COLUMN `userSubredditNsfw` INTEGER");
    }
}
