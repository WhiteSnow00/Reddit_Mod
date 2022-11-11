// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import sg2.e;

public final class h
{
    public int a;
    public char[] b;
    public int c;
    public int d;
    
    public h(final char[] b, final int c, final int d) {
        this.a = b.length;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((CharSequence)sb);
        final String string = sb.toString();
        e.e((Object)string, "StringBuilder().apply { append(this) }.toString()");
        return string;
    }
}
