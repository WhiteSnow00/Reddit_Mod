// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class f1 extends b
{
    public static final f1 c;
    
    static {
        c = new f1();
    }
    
    public f1() {
        super(62, 63);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `subreddit_forking` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `linkId` TEXT NOT NULL, `bottomSheetShown` INTEGER NOT NULL, `hookModuleDismissed` INTEGER NOT NULL, `subredditForked` INTEGER NOT NULL)");
    }
}
