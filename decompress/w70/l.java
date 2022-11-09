// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class l extends b
{
    public static final l c;
    
    static {
        c = new l();
    }
    
    public l() {
        super(20, 21);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `allowPolls` INTEGER");
    }
}
