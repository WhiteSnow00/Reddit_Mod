// 
// Decompiled by Procyon v0.6.0
// 

package jd2;

public final class e extends a
{
    public e() {
        super(6, 7);
    }
    
    public final void a(final n5.a a) {
        ng2.e.g((Object)a, "database");
        a.execSQL("ALTER TABLE 'requests' ADD COLUMN '_auto_retry_max_attempts' INTEGER NOT NULL DEFAULT '0'");
        a.execSQL("ALTER TABLE 'requests' ADD COLUMN '_auto_retry_attempts' INTEGER NOT NULL DEFAULT '0'");
    }
}
