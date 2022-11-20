// 
// Decompiled by Procyon v0.6.0
// 

package y60;

import ng2.e;

public final class a
{
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    
    public a(final String s, final String s2, final String s3, final int a) {
        this.a = a;
        if (a != 1) {
            e.f((Object)s, "id");
            e.f((Object)s2, "name");
            this.b = s;
            this.c = s2;
            this.d = s3;
            return;
        }
        e.f((Object)s, "id");
        e.f((Object)s2, "name");
        this.b = s;
        this.c = s2;
        this.d = s3;
    }
}
