// 
// Decompiled by Procyon v0.6.0
// 

package vj2;

import net.sourceforge.jaad.aac.AACException;

public final class a
{
    public d a;
    public f b;
    public b c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    
    public a() {
        this.a = vj2.d.e;
        this.b = vj2.f.d;
        this.c = vj2.b.c;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = false;
    }
    
    public static void b(final bk2.a a, final a a2) throws AACException {
        if (a.c(11) == 695) {
            final d a3 = d.a(a.c(5));
            if (a3.equals(d.i) && a.d()) {
                a2.a = a3;
                final int c = a.c(4);
                if (c == a2.b.a) {
                    a2.e = true;
                }
                if (c == 15) {
                    throw new AACException("sample rate specified explicitly, not supported yet!");
                }
            }
        }
    }
    
    public final int a() {
        int n;
        if (this.d) {
            n = 960;
        }
        else {
            n = 1024;
        }
        return n;
    }
}
