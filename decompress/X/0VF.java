// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import kotlin.jvm.internal.n;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Comparator;

public final class 0vF<T> implements Comparator
{
    public final /* synthetic */ ArrayList LIZ;
    
    static {
        Covode.recordClassIndex(9633);
    }
    
    public 0vF(final ArrayList liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final int compare(final T t, final T t2) {
        final View view = (View)t;
        final Iterator iterator = this.LIZ.iterator();
        final int n = 0;
        int n2 = 0;
        while (true) {
            while (iterator.hasNext()) {
                final 1aK 1aK = (1aK)iterator.next();
                String interactId;
                if (view instanceof 1ln) {
                    interactId = ((1ln)view).getInteractId();
                }
                else {
                    interactId = "";
                }
                if (kotlin.jvm.internal.n.LIZ((Object)1aK.LIZ, (Object)interactId)) {
                    final int n3 = Integer.MAX_VALUE;
                    int n4;
                    if ((n4 = n2) == -1) {
                        n4 = Integer.MAX_VALUE;
                    }
                    final View view2 = (View)t2;
                    final Iterator iterator2 = this.LIZ.iterator();
                    int n5 = n;
                    Label_0187: {
                        int n6;
                        while (true) {
                            n6 = n3;
                            if (!iterator2.hasNext()) {
                                break;
                            }
                            final 1aK 1aK2 = (1aK)iterator2.next();
                            String interactId2;
                            if (view2 instanceof 1ln) {
                                interactId2 = ((1ln)view2).getInteractId();
                            }
                            else {
                                interactId2 = "";
                            }
                            if (kotlin.jvm.internal.n.LIZ((Object)1aK2.LIZ, (Object)interactId2)) {
                                if (n5 == -1) {
                                    n6 = n3;
                                    break;
                                }
                                break Label_0187;
                            }
                            else {
                                ++n5;
                            }
                        }
                        return JwY.LIZ((Comparable)n4, (Comparable)n6);
                    }
                    int n6 = n5;
                    return JwY.LIZ((Comparable)n4, (Comparable)n6);
                }
                ++n2;
            }
            n2 = -1;
            continue;
        }
    }
}
