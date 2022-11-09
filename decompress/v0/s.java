// 
// Decompiled by Procyon v0.6.0
// 

package v0;

import ah2.f;
import androidx.compose.ui.text.input.TextFieldValue;

public final class s
{
    public final int a;
    public a b;
    public a c;
    public int d;
    public Long e;
    public boolean f;
    
    public s() {
        this(0);
    }
    
    public s(final int n) {
        this.a = 100000;
    }
    
    public final void a(final TextFieldValue b) {
        ah2.f.f((Object)b, "value");
        this.f = false;
        final a b2 = this.b;
        TextFieldValue b3;
        if (b2 != null) {
            b3 = b2.b;
        }
        else {
            b3 = null;
        }
        if (ah2.f.a((Object)b, (Object)b3)) {
            return;
        }
        final String f = b.a.f;
        final a b4 = this.b;
        String f2 = null;
        Label_0078: {
            if (b4 != null) {
                final TextFieldValue b5 = b4.b;
                if (b5 != null) {
                    f2 = b5.a.f;
                    break Label_0078;
                }
            }
            f2 = null;
        }
        if (ah2.f.a((Object)f, (Object)f2)) {
            final a b6 = this.b;
            if (b6 != null) {
                b6.b = b;
            }
            return;
        }
        this.b = new a(this.b, b);
        this.c = null;
        if ((this.d += b.a.f.length()) > this.a) {
            a a = this.b;
            a a2;
            if (a != null) {
                a2 = a.a;
            }
            else {
                a2 = null;
            }
            if (a2 != null) {
                while (true) {
                    a a4 = null;
                    Label_0210: {
                        if (a != null) {
                            final a a3 = a.a;
                            if (a3 != null) {
                                a4 = a3.a;
                                break Label_0210;
                            }
                        }
                        a4 = null;
                    }
                    if (a4 == null) {
                        break;
                    }
                    a = a.a;
                }
                if (a != null) {
                    a.a = null;
                }
            }
        }
    }
    
    public static final class a
    {
        public a a;
        public TextFieldValue b;
        
        public a(final a a, final TextFieldValue b) {
            f.f((Object)b, "value");
            this.a = a;
            this.b = b;
        }
    }
}
