// 
// Decompiled by Procyon v0.6.0
// 

package re;

public final class a3
{
    public final int a;
    public final boolean b;
    public final boolean c;
    public final /* synthetic */ c3 d;
    
    public a3(final c3 d, final int a, final boolean b, final boolean c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final String s) {
        this.d.L(this.a, this.b, this.c, s, null, null, null);
    }
    
    public final void b(final Object o, final String s) {
        this.d.L(this.a, this.b, this.c, s, o, null, null);
    }
    
    public final void c(final Object o, final String s, final Object o2) {
        this.d.L(this.a, this.b, this.c, s, o, o2, null);
    }
    
    public final void d(final Object o, final String s, final Object o2, final Object o3) {
        this.d.L(this.a, this.b, this.c, s, o, o2, o3);
    }
}
