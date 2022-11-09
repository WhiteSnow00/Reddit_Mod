// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class l0 extends b
{
    public static final l0 c;
    
    static {
        c = new l0();
    }
    
    public l0() {
        super(44, 45);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `stream_link_state` (\n`streamId` TEXT NOT NULL,\n`voteDirection` INTEGER NOT NULL,\nPRIMARY KEY(`streamId`)\n)");
    }
}
