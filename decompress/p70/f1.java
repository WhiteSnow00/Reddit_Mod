// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class f1 extends b
{
    public static final f1 c;
    
    static {
        c = new f1();
    }
    
    public f1() {
        super(62, 63);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `subreddit_forking` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `linkId` TEXT NOT NULL, `bottomSheetShown` INTEGER NOT NULL, `hookModuleDismissed` INTEGER NOT NULL, `subredditForked` INTEGER NOT NULL)");
    }
}
