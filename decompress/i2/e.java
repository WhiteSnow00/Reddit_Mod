// 
// Decompiled by Procyon v0.6.0
// 

package i2;

import lg.e0;
import wd.a;
import androidx.compose.ui.text.platform.AndroidParagraph;

public final class e
{
    public final d a;
    public final int b;
    public final int c;
    public int d;
    public int e;
    public float f;
    public float g;
    
    public e(final AndroidParagraph a, final int b, final int c, final int d, final int e, final float f, final float g) {
        this.a = (d)a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final n1.d a(final n1.d d) {
        sg2.e.f((Object)d, "<this>");
        return d.e(wd.a.f(0.0f, this.f));
    }
    
    public final int b(final int n) {
        return e0.v(n, this.b, this.c) - this.b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return sg2.e.a((Object)this.a, (Object)e.a) && this.b == e.b && this.c == e.c && this.d == e.d && this.e == e.e && sg2.e.a((Object)this.f, (Object)e.f) && sg2.e.a((Object)this.g, (Object)e.g);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.g) + d.d(this.f, a.c(this.e, a.c(this.d, a.c(this.c, a.c(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ParagraphInfo(paragraph=");
        r.append(this.a);
        r.append(", startIndex=");
        r.append(this.b);
        r.append(", endIndex=");
        r.append(this.c);
        r.append(", startLineIndex=");
        r.append(this.d);
        r.append(", endLineIndex=");
        r.append(this.e);
        r.append(", top=");
        r.append(this.f);
        r.append(", bottom=");
        return b.h(r, this.g, ')');
    }
}
