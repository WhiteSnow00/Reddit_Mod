// 
// Decompiled by Procyon v0.6.0
// 

package jd2;

import ng2.e;

public final class d extends a
{
    public d() {
        super(1, 2);
    }
    
    public final void a(final n5.a a) {
        e.g((Object)a, "database");
        a.execSQL("ALTER TABLE 'requests' ADD COLUMN '_tag' TEXT NULL DEFAULT NULL");
    }
}
