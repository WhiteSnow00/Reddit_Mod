// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import a81.e;

public final class c implements d
{
    public final int a;
    public final int b;
    
    public c(final int a, final int b) {
        this.a = a;
        this.b = b;
        if (a >= 0 && b >= 0) {
            return;
        }
        throw new IllegalArgumentException(e.m("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", a, " and ", b, " respectively.").toString());
    }
    
    @Override
    public final void a(final f f) {
        sg2.e.f((Object)f, "buffer");
        final int a = this.a;
        int n2;
        int n = n2 = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= a) {
                break;
            }
            final int n4 = n2 + 1;
            final int b = f.b;
            if (b > (n2 = n4)) {
                final char b2 = f.b(b - n4 - 1);
                final char b3 = f.b(f.b - n4);
                final boolean b4 = Character.isHighSurrogate(b2) && Character.isLowSurrogate(b3);
                n2 = n4;
                if (b4) {
                    n2 = n4 + 1;
                }
            }
            if ((n3 = n2) == f.b) {
                break;
            }
            ++n;
        }
        final int b5 = this.b;
        int n6;
        int n5 = n6 = 0;
        int n7;
        while (true) {
            n7 = n6;
            if (n5 >= b5) {
                break;
            }
            final int n8 = ++n6;
            if (f.c + n8 < f.c()) {
                final char b6 = f.b(f.c + n8 - 1);
                final char b7 = f.b(f.c + n8);
                final boolean b8 = Character.isHighSurrogate(b6) && Character.isLowSurrogate(b7);
                n6 = n8;
                if (b8) {
                    n6 = n8 + 1;
                }
            }
            n7 = n6;
            if (f.c + n6 == f.c()) {
                break;
            }
            ++n5;
        }
        final int c = f.c;
        f.a(c, n7 + c);
        final int b9 = f.b;
        f.a(b9 - n3, b9);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final int a = this.a;
        final c c = (c)o;
        return a == c.a && this.b == c.b;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        r.append(this.a);
        r.append(", lengthAfterCursor=");
        return d.l(r, this.b, ')');
    }
}
