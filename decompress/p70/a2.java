// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class a2 extends b
{
    public static final a2 c;
    
    static {
        c = new a2();
    }
    
    public a2() {
        super(81, 82);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `live_chats` (\n  `linkId` TEXT NOT NULL,\n  `title` TEXT NOT NULL,\n  `liveCommentsWebsocket` TEXT,\n  `subredditId` TEXT NOT NULL,\n  `subredditName` TEXT NOT NULL,\n  `subredditIconUrl` TEXT,\n  `engagementType` TEXT NOT NULL,\n  `lastReadAtInMillis` INTEGER NOT NULL,\n  `lastCommentedAtInMillis` INTEGER,\n  PRIMARY KEY(`linkId`)\n)");
    }
}
