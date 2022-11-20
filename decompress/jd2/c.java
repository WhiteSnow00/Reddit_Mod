// 
// Decompiled by Procyon v0.6.0
// 

package jd2;

import ng2.e;

public final class c extends a
{
    public c() {
        super(4, 5);
    }
    
    public final void a(final n5.a a) {
        e.g((Object)a, "database");
        a.execSQL("ALTER TABLE 'requests' ADD COLUMN '_download_on_enqueue' INTEGER NOT NULL DEFAULT 1");
    }
}
