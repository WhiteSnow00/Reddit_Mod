// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class o1 extends b
{
    public static final o1 c;
    
    static {
        c = new o1();
    }
    
    public o1() {
        super(70, 71);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `query` ADD COLUMN `subredditQuarantined` INTEGER");
        a.execSQL("ALTER TABLE `query` ADD COLUMN `subredditNsfw` INTEGER");
        a.execSQL("ALTER TABLE `query` ADD COLUMN `userSubredditNsfw` INTEGER");
    }
}
