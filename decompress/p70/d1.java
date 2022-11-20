// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class d1 extends b
{
    public static final d1 c;
    
    static {
        c = new d1();
    }
    
    public d1() {
        super(60, 61);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `postFlairEnabled` INTEGER");
    }
}
