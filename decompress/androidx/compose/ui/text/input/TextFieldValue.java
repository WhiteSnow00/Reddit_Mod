// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.input;

import sg2.e;
import java.util.List;
import rg2.p;
import rg2.l;
import androidx.compose.runtime.saveable.SaverKt;
import i2.o;
import i2.a;

public final class TextFieldValue
{
    public final a a;
    public final long b;
    public final o c;
    
    static {
        SaverKt.a((l)TextFieldValue$Companion$Saver$2.INSTANCE, (p)TextFieldValue$Companion$Saver$1.INSTANCE);
    }
    
    public TextFieldValue(final a a, long a2, final o o) {
        this.a = a;
        this.b = wd.a.A(a.f.length(), a2);
        o c;
        if (o != null) {
            a2 = o.a;
            c = new o(wd.a.A(a.f.length(), a2));
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
        this(new a(6, s, null), b, null);
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
        e.f((Object)a, "annotatedString");
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
        e.f((Object)s, "text");
        return new TextFieldValue(new a(6, s, null), b, c);
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
        if (!o.a(b2, textFieldValue.b) || !e.a((Object)this.c, (Object)textFieldValue.c) || !e.a((Object)this.a, (Object)textFieldValue.a)) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final int c = o.c;
        final int b2 = b.b(b, hashCode * 31, 31);
        final o c2 = this.c;
        int hashCode2;
        if (c2 != null) {
            hashCode2 = Long.hashCode(c2.a);
        }
        else {
            hashCode2 = 0;
        }
        return b2 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("TextFieldValue(text='");
        r.append((Object)this.a);
        r.append("', selection=");
        r.append((Object)o.h(this.b));
        r.append(", composition=");
        r.append(this.c);
        r.append(')');
        return r.toString();
    }
}
