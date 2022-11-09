// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class v1 extends b
{
    public static final v1 c;
    
    static {
        c = new v1();
    }
    
    public v1() {
        super(77, 78);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `isMiniModelEntry` INTEGER DEFAULT 0 NOT NULL");
    }
}
