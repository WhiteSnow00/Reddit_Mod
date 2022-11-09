// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import androidx.compose.ui.unit.LayoutDirection;
import ah2.f;
import java.util.Map;
import kotlin.collections.c;
import zg2.l;

public interface u extends j
{
    default t Q(final int n, final int n2, final Map<a, Integer> map, final l<? super e0.a, pg2.j> l) {
        f.f((Object)map, "alignmentLines");
        f.f((Object)l, "placementBlock");
        return new t(map) {
            public final int a = n;
            public final int b = b;
            public final Map<a, Integer> c = c;
            public final /* synthetic */ u e;
            
            @Override
            public final Map<a, Integer> c() {
                return this.c;
            }
            
            @Override
            public final void e() {
                final e0.a.a a = e0.a.a;
                final int d = n;
                final LayoutDirection layoutDirection = this.e.getLayoutDirection();
                final l<e0.a, pg2.j> f = (l<e0.a, pg2.j>)l;
                a.getClass();
                final int c = e0.a.c;
                a.getClass();
                final LayoutDirection b = e0.a.b;
                e0.a.c = d;
                e0.a.b = layoutDirection;
                f.invoke((Object)a);
                e0.a.c = c;
                e0.a.b = b;
            }
            
            @Override
            public final int getHeight() {
                return this.b;
            }
            
            @Override
            public final int getWidth() {
                return this.a;
            }
        };
    }
}
