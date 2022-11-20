// 
// Decompiled by Procyon v0.6.0
// 

package x6;

import java.util.Arrays;
import r6.c;
import com.airbnb.lottie.model.layer.a;
import com.airbnb.lottie.LottieDrawable;
import java.util.List;

public final class j implements b
{
    public final String a;
    public final List<b> b;
    public final boolean c;
    
    public j(final String a, final boolean c, final List b) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final r6.b a(final LottieDrawable lottieDrawable, final a a) {
        return (r6.b)new c(lottieDrawable, a, this);
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("ShapeGroup{name='");
        t.append(this.a);
        t.append("' Shapes: ");
        t.append(Arrays.toString(this.b.toArray()));
        t.append('}');
        return t.toString();
    }
}
