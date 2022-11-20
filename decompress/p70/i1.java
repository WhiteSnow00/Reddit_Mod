// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class i1 extends b
{
    public static final i1 c;
    
    static {
        c = new i1();
    }
    
    public i1() {
        super(65, 66);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `descriptionRtJson` TEXT");
    }
}
