// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class v0 extends b
{
    public static final v0 c;
    
    static {
        c = new v0();
    }
    
    public v0() {
        super(53, 54);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `allowPredictionsTournament` INTEGER");
    }
}
