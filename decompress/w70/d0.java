// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class d0 extends b
{
    public static final d0 c;
    
    static {
        c = new d0();
    }
    
    public d0() {
        super(37, 38);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("DROP TABLE `experiment_exposure`");
    }
}
