// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class m1 extends b
{
    public static final m1 c;
    
    static {
        c = new m1();
    }
    
    public m1() {
        super(69, 70);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `quarantineMessageRtJson` TEXT");
    }
}
