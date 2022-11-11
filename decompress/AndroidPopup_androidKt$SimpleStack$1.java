// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.window;

import zg2.l;
import ah2.c;
import c2.e0;
import java.util.ArrayList;
import ah2.f;
import c2.t;
import c2.r;
import java.util.List;
import c2.u;
import c2.s;

public final class AndroidPopup_androidKt$SimpleStack$1 implements s
{
    public static final AndroidPopup_androidKt$SimpleStack$1 a;
    
    static {
        a = new AndroidPopup_androidKt$SimpleStack$1();
    }
    
    @Override
    public final t c(final u u, final List<? extends r> list, final long n) {
        f.f((Object)u, "$this$Layout");
        f.f((Object)list, "measurables");
        final int size = list.size();
        final int n2 = 0;
        int n3 = 0;
        t t;
        if (size != 0) {
            if (size != 1) {
                final ArrayList<e0> list2 = new ArrayList<e0>(list.size());
                for (int size2 = list.size(), i = 0; i < size2; ++i) {
                    list2.add(list.get(i).I(n));
                }
                final int l = c.L((List)list2);
                int max2;
                int n4;
                if (l >= 0) {
                    int max = max2 = 0;
                    while (true) {
                        final e0 e0 = list2.get(n3);
                        max = Math.max(max, e0.f);
                        max2 = Math.max(max2, e0.g);
                        if (n3 == l) {
                            break;
                        }
                        ++n3;
                    }
                    n4 = max;
                }
                else {
                    max2 = 0;
                    n4 = n2;
                }
                t = u.E0(u, n4, max2, (l)new AndroidPopup_androidKt$SimpleStack$1$measure.AndroidPopup_androidKt$SimpleStack$1$measure$3((List)list2));
            }
            else {
                final e0 j = list.get(0).I(n);
                t = u.E0(u, j.f, j.g, (l)new AndroidPopup_androidKt$SimpleStack$1$measure.AndroidPopup_androidKt$SimpleStack$1$measure$2(j));
            }
        }
        else {
            t = u.E0(u, 0, 0, (l)AndroidPopup_androidKt$SimpleStack$1$measure.AndroidPopup_androidKt$SimpleStack$1$measure$1.INSTANCE);
        }
        return t;
    }
}
