// 
// Decompiled by Procyon v0.6.0
// 

package s6;

import x6.j;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import android.graphics.Path$FillType;
import java.util.List;
import y6.l;
import com.airbnb.lottie.LottieDrawable;
import android.graphics.Path;
import t6.a;

public final class r implements m, a
{
    public final Path a;
    public final boolean b;
    public final LottieDrawable c;
    public final t6.m d;
    public boolean e;
    public final b f;
    
    public r(final LottieDrawable c, final com.airbnb.lottie.model.layer.a a, final l l) {
        this.a = new Path();
        this.f = new b(0);
        l.getClass();
        this.b = l.d;
        this.c = c;
        final t6.m d = new t6.m((List)((j)l.c).b);
        a.c((t6.a<?, ?>)(this.d = d));
        ((t6.a)d).a((a)this);
    }
    
    public final Path T0() {
        if (this.e) {
            return this.a;
        }
        this.a.reset();
        if (this.b) {
            this.e = true;
            return this.a;
        }
        final Path path = ((t6.a<K, Path>)this.d).f();
        if (path == null) {
            return this.a;
        }
        this.a.set(path);
        this.a.setFillType(Path$FillType.EVEN_ODD);
        this.f.c(this.a);
        this.e = true;
        return this.a;
    }
    
    public final void f() {
        this.e = false;
        this.c.invalidateSelf();
    }
    
    public final void g(final List<s6.c> list, final List<s6.c> list2) {
        List<s> k = null;
        int n = 0;
        while (true) {
            final ArrayList list3 = (ArrayList)list;
            if (n >= list3.size()) {
                break;
            }
            final s6.c c = list3.get(n);
            List<s> list4 = null;
            Label_0123: {
                if (c instanceof u) {
                    final u u = (u)c;
                    if (u.c == ShapeTrimPath$Type.SIMULTANEOUSLY) {
                        this.f.a.add(u);
                        u.a((a)this);
                        list4 = k;
                        break Label_0123;
                    }
                }
                list4 = k;
                if (c instanceof s) {
                    if ((list4 = k) == null) {
                        list4 = new ArrayList<s>();
                    }
                    list4.add((s)c);
                }
            }
            ++n;
            k = list4;
        }
        this.d.k = k;
    }
}
