// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class f0 extends b
{
    public static final f0 c;
    
    static {
        c = new f0();
    }
    
    public f0() {
        super(39, 40);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `acceptPrivateMessages` INTEGER");
    }
}
