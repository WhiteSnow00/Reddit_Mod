// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class m1 extends b
{
    public static final m1 c;
    
    static {
        c = new m1();
    }
    
    public m1() {
        super(69, 70);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `quarantineMessageRtJson` TEXT");
    }
}
