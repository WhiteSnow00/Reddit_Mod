// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class e0 extends b
{
    public static final e0 c;
    
    static {
        c = new e0();
    }
    
    public e0() {
        super(38, 39);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL(" CREATE TABLE IF NOT EXISTS `rate_limit` (`requestKey` TEXT NOT NULL, `expirationTime` BIGINT NOT NULL, PRIMARY KEY(`requestKey`))");
    }
}
