// 
// Decompiled by Procyon v0.6.0
// 

package jd2;

import ng2.e;

public final class f extends a
{
    public f() {
        super(3, 4);
    }
    
    public final void a(final n5.a a) {
        e.g((Object)a, "database");
        a.execSQL("ALTER TABLE 'requests' ADD COLUMN '_identifier' INTEGER NOT NULL DEFAULT 0");
    }
}
