// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class w extends b
{
    public static final w c;
    
    static {
        c = new w();
    }
    
    public w() {
        super(30, 31);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `skipped_geo_tagging`\n          (`subredditId` TEXT NOT NULL,\n           `skippedUtc` INTEGER NOT NULL,\n           PRIMARY KEY(`subredditId`))");
    }
}
