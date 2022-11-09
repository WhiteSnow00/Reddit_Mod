// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.input;

import ah2.f;
import java.util.List;
import eg.n0;
import zg2.p;
import zg2.l;
import androidx.compose.runtime.saveable.SaverKt;
import i2.o;
import i2.a;

public final class TextFieldValue
{
    public final a a;
    public final long b;
    public final o c;
    
    static {
        SaverKt.a((l)TextFieldValue$Companion$Saver.TextFieldValue$Companion$Saver$2.INSTANCE, (p)TextFieldValue$Companion$Saver.TextFieldValue$Companion$Saver$1.INSTANCE);
    }
    
    public TextFieldValue(final a a, long a2, final o o) {
        this.a = a;
        this.b = n0.B(a.f.length(), a2);
        o c;
        if (o != null) {
            a2 = o.a;
            c = new o(n0.B(a.f.length(), a2));
        }
        else {
            c = null;
        }
        this.c = c;
    }
    
    public TextFieldValue(String s, long b, final int n) {
        if ((n & 0x1) != 0x0) {
            s = "";
        }
        if ((n & 0x2) != 0x0) {
            b = o.b;
        }
        this(new a(6, s, (List)null), b, null);
    }
    
    public static TextFieldValue a(final TextFieldValue textFieldValue, a a, long b, final int n) {
        if ((n & 0x1) != 0x0) {
            a = textFieldValue.a;
        }
        if ((n & 0x2) != 0x0) {
            b = textFieldValue.b;
        }
        o c;
        if ((n & 0x4) != 0x0) {
            c = textFieldValue.c;
        }
        else {
            c = null;
        }
        textFieldValue.getClass();
        f.f((Object)a, "annotatedString");
        return new TextFieldValue(a, b, c);
    }
    
    public static TextFieldValue b(final TextFieldValue textFieldValue, final String s, long b, final int n) {
        if ((n & 0x2) != 0x0) {
            b = textFieldValue.b;
        }
        o c;
        if ((n & 0x4) != 0x0) {
            c = textFieldValue.c;
        }
        else {
            c = null;
        }
        textFieldValue.getClass();
        f.f((Object)s, "text");
        return new TextFieldValue(new a(6, s, (List)null), b, c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof TextFieldValue)) {
            return false;
        }
        final long b2 = this.b;
        final TextFieldValue textFieldValue = (TextFieldValue)o;
        if (!o.a(b2, textFieldValue.b) || !f.a((Object)this.c, (Object)textFieldValue.c) || !f.a((Object)this.a, (Object)textFieldValue.a)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final int c = o.c;
        final int c2 = b.c(b, hashCode * 31, 31);
        final o c3 = this.c;
        int hashCode2;
        if (c3 != null) {
            hashCode2 = Long.hashCode(c3.a);
        }
        else {
            hashCode2 = 0;
        }
        return c2 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("TextFieldValue(text='");
        k.append(this.a);
        k.append("', selection=");
        k.append((Object)o.h(this.b));
        k.append(", composition=");
        k.append(this.c);
        k.append(')');
        return k.toString();
    }
}
