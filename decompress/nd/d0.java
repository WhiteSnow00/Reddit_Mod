// 
// Decompiled by Procyon v0.6.0
// 

package nd;

public class d0
{
    public static final d0 d;
    public final boolean a;
    public final String b;
    public final Throwable c;
    
    static {
        d = new d0(null, null, true);
    }
    
    public d0(final String b, final Exception c, final boolean a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static d0 b(final String s) {
        return new d0(s, null, false);
    }
    
    public static d0 c(final String s, final Exception ex) {
        return new d0(s, ex, false);
    }
    
    public String a() {
        return this.b;
    }
}
