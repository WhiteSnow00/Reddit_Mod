// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class d1 extends b
{
    public static final d1 c;
    
    static {
        c = new d1();
    }
    
    public d1() {
        super(60, 61);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `postFlairEnabled` INTEGER");
    }
}
