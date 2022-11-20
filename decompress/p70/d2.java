// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class d2 extends b
{
    public static final d2 c;
    
    static {
        c = new d2();
    }
    
    public d2() {
        super(9, 10);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `moderatorsresponse` (`username` TEXT NOT NULL,\n `subredditName` TEXT NOT NULL, `responseJson` TEXT NOT NULL, \n `lastUpdateTimestamp` INTEGER NOT NULL, PRIMARY KEY(`username`, `subredditName`))");
    }
}
