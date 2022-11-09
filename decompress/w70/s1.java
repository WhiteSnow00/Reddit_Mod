// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class s1 extends b
{
    public static final s1 c;
    
    static {
        c = new s1();
    }
    
    public s1() {
        super(74, 75);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `canAssignLinkFlair` INTEGER");
    }
}
