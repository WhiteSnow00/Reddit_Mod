// 
// Decompiled by Procyon v0.6.0
// 

package m82;

import sg2.e;
import o5.a;
import k5.b;

public final class f extends b
{
    public static final f c;
    
    static {
        c = new f();
    }
    
    public f() {
        super(6, 7);
    }
    
    @Override
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `network`(\n        `providerKey` TEXT NOT NULL,\n        `txUrl` TEXT,\n        PRIMARY KEY(`providerKey`))");
    }
}
