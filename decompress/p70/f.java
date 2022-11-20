// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class f extends b
{
    public static final f c;
    
    static {
        c = new f();
    }
    
    public f() {
        super(15, 16);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `email` TEXT");
    }
}
