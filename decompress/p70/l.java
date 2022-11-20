// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class l extends b
{
    public static final l c;
    
    static {
        c = new l();
    }
    
    public l() {
        super(20, 21);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `allowPolls` INTEGER");
    }
}
