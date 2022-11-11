// 
// Decompiled by Procyon v0.6.0
// 

package i1;

public final class n
{
    public static final Object a;
    
    static {
        a = new Object();
    }
    
    public static final void a(final int n, final int n2) {
        int n3 = 0;
        if (n >= 0) {
            n3 = n3;
            if (n < n2) {
                n3 = 1;
            }
        }
        if (n3 != 0) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("index (");
        sb.append(n);
        sb.append(") is out of bound of [0, ");
        sb.append(n2);
        sb.append(')');
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
