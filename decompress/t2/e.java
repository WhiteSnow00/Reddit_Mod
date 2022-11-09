// 
// Decompiled by Procyon v0.6.0
// 

package t2;

import ah2.f;
import java.util.ArrayList;

public final class e
{
    public static final e b;
    public static final e c;
    public static final e d;
    public final int a;
    
    static {
        b = new e(0);
        c = new e(1);
        d = new e(2);
    }
    
    public e(final int a) {
        this.a = a;
    }
    
    public final boolean a(final e e) {
        final int a = this.a;
        return (e.a | a) == a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof e && this.a == ((e)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a;
    }
    
    @Override
    public final String toString() {
        if (this.a == 0) {
            return "TextDecoration.None";
        }
        final ArrayList list = new ArrayList();
        if ((this.a & 0x1) != 0x0) {
            list.add("Underline");
        }
        if ((this.a & 0x2) != 0x0) {
            list.add("LineThrough");
        }
        final int size = list.size();
        int i = 0;
        if (size == 1) {
            final StringBuilder k = a.k("TextDecoration.");
            k.append((String)list.get(0));
            return k.toString();
        }
        final StringBuilder j = a.k("TextDecoration[");
        final StringBuilder sb = new StringBuilder();
        sb.append((CharSequence)"");
        final int size2 = list.size();
        int n = 0;
        while (i < size2) {
            final Object value = list.get(i);
            if (++n > 1) {
                sb.append((CharSequence)", ");
            }
            if (value == null || value instanceof CharSequence) {
                sb.append((CharSequence)value);
            }
            else if (value instanceof Character) {
                sb.append((char)value);
            }
            else {
                sb.append((CharSequence)String.valueOf(value));
            }
            ++i;
        }
        sb.append((CharSequence)"");
        final String string = sb.toString();
        f.e((Object)string, "fastJoinTo(StringBuilder\u2026form)\n        .toString()");
        j.append(string);
        j.append(']');
        return j.toString();
    }
}
