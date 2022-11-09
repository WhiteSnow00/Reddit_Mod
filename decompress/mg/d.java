// 
// Decompiled by Procyon v0.6.0
// 

package mg;

import java.io.File;

public final class d extends q
{
    public final File a;
    public final String b;
    
    public d(final File a, final String b) {
        this.a = a;
        if (b != null) {
            this.b = b;
            return;
        }
        throw new NullPointerException("Null splitId");
    }
    
    @Override
    public final File a() {
        return this.a;
    }
    
    @Override
    public final String b() {
        return this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof q) {
            final q q = (q)o;
            if (this.a.equals(q.a()) && this.b.equals(q.b())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String b = this.b;
        final StringBuilder sb = new StringBuilder(value.length() + 35 + b.length());
        d.B(sb, "SplitFileInfo{splitFile=", value, ", splitId=", b);
        sb.append("}");
        return sb.toString();
    }
}
