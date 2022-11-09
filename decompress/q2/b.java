// 
// Decompiled by Procyon v0.6.0
// 

package q2;

import ah2.f;
import android.text.style.TypefaceSpan;
import android.graphics.Typeface;

public final class b
{
    public static final b a;
    
    static {
        a = new b();
    }
    
    public final TypefaceSpan a(final Typeface typeface) {
        f.f((Object)typeface, "typeface");
        return new TypefaceSpan(typeface);
    }
}
