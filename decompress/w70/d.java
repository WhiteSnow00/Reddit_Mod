// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class d extends b
{
    public static final d c;
    
    static {
        c = new d();
    }
    
    public d() {
        super(13, 14);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `experiments`\n          (`type` TEXT NOT NULL,\n           `experimentsJson` TEXT NOT NULL,\n           `timeStamp` INTEGER NOT NULL,\n           PRIMARY KEY(`type`))");
    }
}
