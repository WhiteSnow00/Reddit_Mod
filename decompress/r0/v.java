// 
// Decompiled by Procyon v0.6.0
// 

package r0;

import java.util.ArrayList;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;

public final class v
{
    public final int a;
    public final t[] b;
    public final List<c> c;
    public final boolean d;
    public final int e;
    public final LayoutDirection f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    
    public v() {
        throw null;
    }
    
    public v(int i, final t[] b, final List c, final boolean d, int max, final LayoutDirection f, int g, int length) {
        this.a = i;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = max;
        this.f = f;
        this.g = g;
        this.h = length;
        length = b.length;
        g = 0;
        i = 0;
        max = 0;
        while (i < length) {
            max = Math.max(max, b[i].m);
            ++i;
        }
        this.i = max;
        i = max + this.g;
        if (i < 0) {
            i = g;
        }
        this.j = i;
    }
    
    public final ArrayList a(final int n, final int n2, final int n3) {
        final t[] b = this.b;
        final ArrayList list = new ArrayList<q>(b.length);
        final int length = b.length;
        int i = 0;
        int n4 = 0;
        int n6;
        int n5 = n6 = 0;
        while (i < length) {
            final t t = b[i];
            final int n7 = (int)this.c.get(n4).a;
            int a;
            if (this.f == LayoutDirection.Rtl) {
                a = this.e - n5 - n7;
            }
            else {
                a = n5;
            }
            final boolean d = this.d;
            int a2;
            if (d) {
                a2 = this.a;
            }
            else {
                a2 = a;
            }
            if (!d) {
                a = this.a;
            }
            final q a3 = t.a(n, n6, n2, n3, a2, a, this.i);
            n6 += t.d + this.h;
            n5 += n7;
            list.add(a3);
            ++i;
            ++n4;
        }
        return list;
    }
}
