// 
// Decompiled by Procyon v0.6.0
// 

package ie;

public class ac
{
    public final String a;
    public final ic b;
    
    public ac(final String a, final ic b) {
        this.a = a;
        this.b = b;
    }
    
    public final String a(final String s, final String s2) {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append(a);
        sb.append(s);
        sb.append("?key=");
        sb.append(s2);
        return sb.toString();
    }
}
