// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class o0 extends b
{
    public static final o0 c;
    
    static {
        c = new o0();
    }
    
    public o0() {
        super(47, 48);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `chat_goal` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `chatUrl` TEXT NOT NULL, `topicTitle` TEXT NOT NULL, `maxCounter` INTEGER NOT NULL, `currentCounter` INTEGER NOT NULL)");
        a.execSQL("CREATE INDEX IF NOT EXISTS `index_chat_goal_chatUrl` ON `chat_goal` (`chatUrl`)");
    }
}
