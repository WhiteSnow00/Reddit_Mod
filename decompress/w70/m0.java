// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class m0 extends b
{
    public static final m0 c;
    
    static {
        c = new m0();
    }
    
    public m0() {
        super(45, 46);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `allowPredictions` INTEGER");
    }
}
