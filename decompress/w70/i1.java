// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class i1 extends b
{
    public static final i1 c;
    
    static {
        c = new i1();
    }
    
    public i1() {
        super(65, 66);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `descriptionRtJson` TEXT");
    }
}
