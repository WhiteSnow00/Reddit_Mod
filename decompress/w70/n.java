// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class n extends b
{
    public static final n c;
    
    static {
        c = new n();
    }
    
    public n() {
        super(22, 23);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `experiment_exposure`(\n        `experimentNameWithVersion` TEXT NOT NULL,\n        `experimentName` TEXT NOT NULL,\n        `variantName` TEXT,\n        `version` TEXT, \n        PRIMARY KEY(`experimentNameWithVersion`))");
    }
}
