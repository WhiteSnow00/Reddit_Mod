// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class v1 extends b
{
    public static final v1 c;
    
    static {
        c = new v1();
    }
    
    public v1() {
        super(77, 78);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `isMiniModelEntry` INTEGER DEFAULT 0 NOT NULL");
    }
}
