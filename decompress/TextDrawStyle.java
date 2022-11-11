// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.style;

import t2.b;
import o1.r;
import sg2.e;
import rg2.a;

public interface TextDrawStyle
{
    long a();
    
    default TextDrawStyle b(final rg2.a<? extends TextDrawStyle> a) {
        e.f((Object)a, "other");
        TextDrawStyle textDrawStyle;
        if (!e.a((Object)this, (Object)TextDrawStyle$b.a)) {
            textDrawStyle = this;
        }
        else {
            textDrawStyle = (TextDrawStyle)a.invoke();
        }
        return textDrawStyle;
    }
    
    default TextDrawStyle c(final TextDrawStyle textDrawStyle) {
        e.f((Object)textDrawStyle, "other");
        textDrawStyle.d();
        this.d();
        return textDrawStyle.b((rg2.a<? extends TextDrawStyle>)new TextDrawStyle$merge$1(this));
    }
    
    void d();
    
    public static final class a
    {
        public static TextDrawStyle a(final long n) {
            Object a;
            if (n != r.l) {
                a = new b(n);
            }
            else {
                a = TextDrawStyle$b.a;
            }
            return (TextDrawStyle)a;
        }
    }
}
