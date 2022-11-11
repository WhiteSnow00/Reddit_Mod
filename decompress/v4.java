// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import android.net.Uri;

public final class v4
{
    public final Uri a;
    public final boolean b;
    public final boolean c;
    
    public v4(final Uri a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final v4 a() {
        return new v4(this.a, this.b, true);
    }
    
    public final v4 b() {
        return new v4(this.a, true, this.c);
    }
    
    public final r4 c(final long n, final String s) {
        return new r4(this, s, Long.valueOf(n));
    }
    
    public final u4 d(final String s, final String s2) {
        return new u4(this, s, s2);
    }
    
    public final s4 e(final String s, final boolean b) {
        return new s4(this, s, Boolean.valueOf(b));
    }
}
