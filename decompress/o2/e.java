// 
// Decompiled by Procyon v0.6.0
// 

package o2;

import eg.n0;
import java.util.List;
import i2.a;
import i2.o;
import i2.b;
import androidx.compose.ui.text.input.TextFieldValue;

public final class e
{
    public TextFieldValue a;
    public f b;
    
    public e() {
        final a a = i2.b.a;
        final TextFieldValue a2 = new TextFieldValue(a, o.b, null);
        this.a = a2;
        this.b = new f(a, a2.b);
    }
    
    public final TextFieldValue a(final List<? extends d> list) {
        ah2.f.f((Object)list, "editCommands");
        final int size = list.size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            ((d)list.get(i)).a(this.b);
        }
        final String string = this.b.toString();
        o o = null;
        final a a = new a(6, string, (List)null);
        final f b = this.b;
        final long j = n0.j(b.b, b.c);
        final f b2 = this.b;
        final int d = b2.d;
        int n2 = n;
        if (d != -1) {
            n2 = 1;
        }
        if (n2 != 0) {
            o = new o(n0.j(d, b2.e));
        }
        return this.a = new TextFieldValue(a, j, o);
    }
}
