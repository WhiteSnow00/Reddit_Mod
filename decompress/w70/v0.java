// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class v0 extends b
{
    public static final v0 c;
    
    static {
        c = new v0();
    }
    
    public v0() {
        super(53, 54);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `allowPredictionsTournament` INTEGER");
    }
}