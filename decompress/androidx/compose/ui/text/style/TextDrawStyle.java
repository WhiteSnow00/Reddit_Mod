// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.style;

import t2.b;
import o1.r;
import ah2.f;
import zg2.a;

public interface TextDrawStyle
{
    long a();
    
    default TextDrawStyle b(final zg2.a<? extends TextDrawStyle> a) {
        f.f((Object)a, "other");
        TextDrawStyle textDrawStyle;
        if (!f.a((Object)this, (Object)b.a)) {
            textDrawStyle = this;
        }
        else {
            textDrawStyle = (TextDrawStyle)a.invoke();
        }
        return textDrawStyle;
    }
    
    default TextDrawStyle c(final TextDrawStyle textDrawStyle) {
        f.f((Object)textDrawStyle, "other");
        textDrawStyle.d();
        this.d();
        return textDrawStyle.b((zg2.a<? extends TextDrawStyle>)new TextDrawStyle$merge.TextDrawStyle$merge$1(this));
    }
    
    void d();
    
    public static final class a
    {
        public static TextDrawStyle a(final long n) {
            TextDrawStyle a;
            if (n != r.l) {
                a = new t2.b(n);
            }
            else {
                a = b.a;
            }
            return a;
        }
    }
    
    public static final class b implements TextDrawStyle
    {
        public static final b a;
        
        static {
            a = new b();
        }
        
        @Override
        public final long a() {
            final int m = r.m;
            return r.l;
        }
        
        @Override
        public final void d() {
        }
    }
}
