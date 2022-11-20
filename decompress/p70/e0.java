// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class e0 extends b
{
    public static final e0 c;
    
    static {
        c = new e0();
    }
    
    public e0() {
        super(38, 39);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL(" CREATE TABLE IF NOT EXISTS `rate_limit` (`requestKey` TEXT NOT NULL, `expirationTime` BIGINT NOT NULL, PRIMARY KEY(`requestKey`))");
    }
}
