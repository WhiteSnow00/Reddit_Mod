// 
// Decompiled by Procyon v0.6.0
// 

package vj2;

public final class b
{
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static final b g;
    public static final b h;
    public static final b i;
    public static final b j;
    public static final b k;
    public final int a;
    public final String b;
    
    static {
        c = new b(-1, "invalid");
        d = new b(0, "No channel");
        e = new b(1, "Mono");
        f = new b(2, "Stereo");
        g = new b(3, "Stereo+Center");
        h = new b(4, "Stereo+Center+Rear");
        i = new b(5, "Five channels");
        j = new b(6, "Five channels+LF");
        k = new b(8, "Seven channels+LF");
    }
    
    public b(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static b a(final int n) {
        b b = null;
        switch (n) {
            default: {
                b = vj2.b.c;
                break;
            }
            case 7:
            case 8: {
                b = vj2.b.k;
                break;
            }
            case 6: {
                b = vj2.b.j;
                break;
            }
            case 5: {
                b = vj2.b.i;
                break;
            }
            case 4: {
                b = vj2.b.h;
                break;
            }
            case 3: {
                b = vj2.b.g;
                break;
            }
            case 2: {
                b = vj2.b.f;
                break;
            }
            case 1: {
                b = vj2.b.e;
                break;
            }
            case 0: {
                b = vj2.b.d;
                break;
            }
        }
        return b;
    }
    
    @Override
    public final String toString() {
        return this.b;
    }
}
