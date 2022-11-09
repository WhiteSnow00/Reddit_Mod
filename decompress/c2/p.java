// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.Map;
import ah2.f;
import java.util.List;
import u2.a;
import androidx.compose.ui.layout.b;
import androidx.compose.ui.node.LayoutNode$d;

public final class p extends LayoutNode$d
{
    public final /* synthetic */ b b;
    public final /* synthetic */ zg2.p<i0, a, t> c;
    
    public p(final b b, final zg2.p<? super i0, ? super a, ? extends t> c, final String s) {
        this.b = b;
        this.c = (zg2.p<i0, a, t>)c;
        super(s);
    }
    
    public final t c(final u u, final List<? extends r> list, final long n) {
        f.f((Object)u, "$this$measure");
        f.f((Object)list, "measurables");
        final b.b g = this.b.g;
        final LayoutDirection layoutDirection = u.getLayoutDirection();
        g.getClass();
        f.f((Object)layoutDirection, "<set-?>");
        g.f = layoutDirection;
        this.b.g.g = u.getDensity();
        this.b.g.h = u.getFontScale();
        final b b = this.b;
        b.d = 0;
        final t t = (t)this.c.invoke((Object)b.g, (Object)new a(n));
        final b b2 = this.b;
        return new t() {
            public final /* synthetic */ int c = b2.d;
            
            @Override
            public final Map<c2.a, Integer> c() {
                return t.c();
            }
            
            @Override
            public final void e() {
                b2.d = this.c;
                t.e();
                final b b = b2;
                b.a(b.d);
            }
            
            @Override
            public final int getHeight() {
                return t.getHeight();
            }
            
            @Override
            public final int getWidth() {
                return t.getWidth();
            }
        };
    }
}
