// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class c2 extends b
{
    public static final c2 c;
    
    static {
        c = new c2();
    }
    
    public c2() {
        super(9, 10);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `moderatorsresponse` (`username` TEXT NOT NULL,\n `subredditName` TEXT NOT NULL, `responseJson` TEXT NOT NULL, \n `lastUpdateTimestamp` INTEGER NOT NULL, PRIMARY KEY(`username`, `subredditName`))");
    }
}
