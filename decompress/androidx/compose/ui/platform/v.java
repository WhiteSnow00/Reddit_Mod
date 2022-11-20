// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import android.os.Build$VERSION;
import n2.u;
import ng2.e;
import android.graphics.Typeface;
import n2.f;
import android.content.Context;
import n2.f$a;

public final class v implements f$a
{
    public final Context a;
    
    public v(final Context a) {
        this.a = a;
    }
    
    public final Typeface a(final f f) {
        e.f((Object)f, "font");
        if (f instanceof u) {
            Typeface typeface;
            if (Build$VERSION.SDK_INT >= 26) {
                typeface = w.a.a(this.a, ((u)f).a);
            }
            else {
                typeface = p3.f.a(((u)f).a, this.a);
                e.c((Object)typeface);
            }
            return typeface;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unknown font type: ");
        sb.append(f);
        throw new IllegalArgumentException(sb.toString());
    }
}
