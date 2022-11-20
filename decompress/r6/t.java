// 
// Decompiled by Procyon v0.6.0
// 

package r6;

import java.util.List;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import s6.d;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import s6.a;

public final class t implements b, a
{
    public final boolean a;
    public final ArrayList b;
    public final ShapeTrimPath$Type c;
    public final s6.d d;
    public final s6.d e;
    public final s6.d f;
    
    public t(final com.airbnb.lottie.model.layer.a a, final ShapeTrimPath shapeTrimPath) {
        this.b = new ArrayList();
        shapeTrimPath.getClass();
        this.a = shapeTrimPath.e;
        this.c = shapeTrimPath.a;
        final s6.a<Float, Float> b = shapeTrimPath.b.b();
        this.d = (s6.d)b;
        final s6.a<Float, Float> b2 = shapeTrimPath.c.b();
        this.e = (s6.d)b2;
        final s6.a<Float, Float> b3 = shapeTrimPath.d.b();
        this.f = (s6.d)b3;
        a.c((s6.a)b);
        a.c((s6.a)b2);
        a.c((s6.a)b3);
        b.a((a)this);
        b2.a((a)this);
        b3.a((a)this);
    }
    
    public final void a(final a a) {
        this.b.add(a);
    }
    
    @Override
    public final void e() {
        for (int i = 0; i < this.b.size(); ++i) {
            ((a)this.b.get(i)).e();
        }
    }
    
    @Override
    public final void f(final List<b> list, final List<b> list2) {
    }
}
