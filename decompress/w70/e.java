// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class e extends b
{
    public static final e c;
    
    static {
        c = new e();
    }
    
    public e() {
        super(14, 15);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS unsubmitted_pixels (`url` TEXT NOT NULL, PRIMARY KEY(`url`))");
    }
}
