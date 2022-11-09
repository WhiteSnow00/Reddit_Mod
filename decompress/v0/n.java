// 
// Decompiled by Procyon v0.6.0
// 

package v0;

import androidx.compose.ui.text.platform.AndroidParagraph;
import java.util.List;
import a80.a;
import kotlin.collections.EmptyList;
import mj2.c0;
import ah2.f;
import n2.g;
import u2.b;
import i2.p;
import kj2.j;

public final class n
{
    public static final String a;
    
    static {
        a = j.Z1(10, "H");
    }
    
    public static final long a(final p p5, final b b, final g.a a, final String s, final int n) {
        f.f((Object)p5, "style");
        f.f((Object)b, "density");
        f.f((Object)a, "fontFamilyResolver");
        f.f((Object)s, "text");
        final AndroidParagraph e = a.e(s, p5, c0.b(0, 0, 15), b, a, (List)EmptyList.INSTANCE, n);
        return yl.a.c(at1.a.D1((float)Math.ceil(e.a.b())), at1.a.D1((float)Math.ceil(e.getHeight())));
    }
}
