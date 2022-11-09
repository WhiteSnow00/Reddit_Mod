// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class b2 extends b
{
    public static final b2 c;
    
    static {
        c = new b2();
    }
    
    public b2() {
        super(8, 9);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE spans ADD COLUMN traceName TEXT NOT NULL DEFAULT ''");
    }
}
