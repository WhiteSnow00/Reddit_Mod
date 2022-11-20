// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class m0 extends b
{
    public static final m0 c;
    
    static {
        c = new m0();
    }
    
    public m0() {
        super(45, 46);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `allowPredictions` INTEGER");
    }
}
