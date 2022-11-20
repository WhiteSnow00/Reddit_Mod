// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class n extends b
{
    public static final n c;
    
    static {
        c = new n();
    }
    
    public n() {
        super(22, 23);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `experiment_exposure`(\n        `experimentNameWithVersion` TEXT NOT NULL,\n        `experimentName` TEXT NOT NULL,\n        `variantName` TEXT,\n        `version` TEXT, \n        PRIMARY KEY(`experimentNameWithVersion`))");
    }
}
