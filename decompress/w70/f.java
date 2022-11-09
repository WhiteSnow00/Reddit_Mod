// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import o5.a;
import k5.b;

public final class f extends b
{
    public static final f c;
    
    static {
        c = new f();
    }
    
    public f() {
        super(15, 16);
    }
    
    @Override
    public final void a(final a a) {
        ah2.f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `email` TEXT");
    }
}
