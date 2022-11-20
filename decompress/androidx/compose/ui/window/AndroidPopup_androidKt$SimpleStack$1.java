// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.window;

import mg2.l;
import cg.d;
import c2.h0;
import java.util.ArrayList;
import ng2.e;
import c2.w;
import c2.u;
import java.util.List;
import c2.x;
import c2.v;

public final class AndroidPopup_androidKt$SimpleStack$1 implements v
{
    public static final AndroidPopup_androidKt$SimpleStack$1 a;
    
    static {
        a = new AndroidPopup_androidKt$SimpleStack$1();
    }
    
    @Override
    public final w i(final x x, final List<? extends u> list, final long n) {
        e.f((Object)x, "$this$Layout");
        e.f((Object)list, "measurables");
        final int size = list.size();
        int max = 0;
        int n2 = 0;
        w w;
        if (size != 0) {
            if (size != 1) {
                final ArrayList<h0> list2 = new ArrayList<h0>(list.size());
                for (int size2 = list.size(), i = 0; i < size2; ++i) {
                    list2.add(list.get(i).s0(n));
                }
                final int r2 = d.R2((List)list2);
                int max2;
                if (r2 >= 0) {
                    max = 0;
                    max2 = 0;
                    while (true) {
                        final h0 h0 = list2.get(n2);
                        max = Math.max(max, h0.f);
                        max2 = Math.max(max2, h0.g);
                        if (n2 == r2) {
                            break;
                        }
                        ++n2;
                    }
                }
                else {
                    max2 = 0;
                }
                w = x.N0(x, max, max2, (l)new AndroidPopup_androidKt$SimpleStack$1$measure$3((List)list2));
            }
            else {
                final h0 s0 = list.get(0).s0(n);
                w = x.N0(x, s0.f, s0.g, (l)new AndroidPopup_androidKt$SimpleStack$1$measure$2(s0));
            }
        }
        else {
            w = x.N0(x, 0, 0, (l)AndroidPopup_androidKt$SimpleStack$1$measure$1.INSTANCE);
        }
        return w;
    }
}
