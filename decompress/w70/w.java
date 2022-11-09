// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class w extends b
{
    public static final w c;
    
    static {
        c = new w();
    }
    
    public w() {
        super(30, 31);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `skipped_geo_tagging`\n          (`subredditId` TEXT NOT NULL,\n           `skippedUtc` INTEGER NOT NULL,\n           PRIMARY KEY(`subredditId`))");
    }
}
