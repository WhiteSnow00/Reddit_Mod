// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class c2 extends b
{
    public static final c2 c;
    
    static {
        c = new c2();
    }
    
    public c2() {
        super(8, 9);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE spans ADD COLUMN traceName TEXT NOT NULL DEFAULT ''");
    }
}
