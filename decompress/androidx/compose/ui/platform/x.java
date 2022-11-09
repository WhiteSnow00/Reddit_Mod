// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.os.Build$VERSION;
import n2.s;
import android.graphics.Typeface;
import android.content.Context;
import n2.f;

public final class x implements a
{
    public final Context a;
    
    public x(final Context a) {
        this.a = a;
    }
    
    @Override
    public final Typeface a(final f f) {
        ah2.f.f((Object)f, "font");
        if (f instanceof s) {
            Typeface typeface;
            if (Build$VERSION.SDK_INT >= 26) {
                typeface = y.a.a(this.a, ((s)f).a);
            }
            else {
                typeface = p3.f.a(((s)f).a, this.a);
                ah2.f.c((Object)typeface);
            }
            return typeface;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown font type: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }
}
