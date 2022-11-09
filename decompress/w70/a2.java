// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class a2 extends b
{
    public static final a2 c;
    
    static {
        c = new a2();
    }
    
    public a2() {
        super(81, 82);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `live_chats` (\n  `linkId` TEXT NOT NULL,\n  `title` TEXT NOT NULL,\n  `liveCommentsWebsocket` TEXT,\n  `subredditId` TEXT NOT NULL,\n  `subredditName` TEXT NOT NULL,\n  `subredditIconUrl` TEXT,\n  `engagementType` TEXT NOT NULL,\n  `lastReadAtInMillis` INTEGER NOT NULL,\n  `lastCommentedAtInMillis` INTEGER,\n  PRIMARY KEY(`linkId`)\n)");
    }
}
