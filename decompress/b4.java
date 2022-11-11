// 
// Decompiled by Procyon v0.6.0
// 

package ke;

public final class b4 implements e6
{
    public static final b4 a;
    
    static {
        a = new b4();
    }
    
    @Override
    public final boolean a(final int n) {
        int n2;
        if (n != 0) {
            n2 = 2;
            if (n != 1) {
                if (n != 2) {
                    n2 = 4;
                    if (n != 3) {
                        if (n != 4) {
                            n2 = 0;
                        }
                        else {
                            n2 = 5;
                        }
                    }
                }
                else {
                    n2 = 3;
                }
            }
        }
        else {
            n2 = 1;
        }
        return n2 != 0;
    }
}
