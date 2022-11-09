// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class o0 extends b
{
    public static final o0 c;
    
    static {
        c = new o0();
    }
    
    public o0() {
        super(47, 48);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `chat_goal` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `chatUrl` TEXT NOT NULL, `topicTitle` TEXT NOT NULL, `maxCounter` INTEGER NOT NULL, `currentCounter` INTEGER NOT NULL)");
        a.execSQL("CREATE INDEX IF NOT EXISTS `index_chat_goal_chatUrl` ON `chat_goal` (`chatUrl`)");
    }
}
