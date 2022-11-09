// 
// Decompiled by Procyon v0.6.0
// 

package t1;

import ah2.f;
import android.util.AttributeSet;
import android.content.res.Resources;
import p3.k;
import p3.c;
import android.content.res.Resources$Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

public final class a
{
    public final XmlPullParser a;
    public int b;
    
    public a(final XmlResourceParser a) {
        this.a = (XmlPullParser)a;
        this.b = 0;
    }
    
    public final c a(final TypedArray typedArray, final Resources$Theme resources$Theme, final String s, final int n) {
        final c c = k.c(typedArray, this.a, resources$Theme, s, n);
        this.f(typedArray.getChangingConfigurations());
        return c;
    }
    
    public final float b(final TypedArray typedArray, final String s, final int n, float d) {
        d = k.d(typedArray, this.a, s, n, d);
        this.f(typedArray.getChangingConfigurations());
        return d;
    }
    
    public final int c(final TypedArray typedArray, final String s, int e, final int n) {
        e = k.e(typedArray, this.a, s, e, n);
        this.f(typedArray.getChangingConfigurations());
        return e;
    }
    
    public final String d(final TypedArray typedArray, final int n) {
        final String string = typedArray.getString(n);
        this.f(typedArray.getChangingConfigurations());
        return string;
    }
    
    public final TypedArray e(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final int[] array) {
        final TypedArray h = k.h(resources, resources$Theme, set, array);
        f.e((Object)h, "obtainAttributes(\n      \u2026          attrs\n        )");
        this.f(h.getChangingConfigurations());
        return h;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return f.a((Object)this.a, (Object)a.a) && this.b == a.b;
    }
    
    public final void f(final int n) {
        this.b |= n;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("AndroidVectorParser(xmlParser=");
        k.append(this.a);
        k.append(", config=");
        return d.k(k, this.b, ')');
    }
}
