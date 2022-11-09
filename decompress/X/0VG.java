// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.Comparator;

public final class 0vG<T> implements Comparator
{
    public final /* synthetic */ 0vH LIZ;
    
    static {
        Covode.recordClassIndex(9635);
    }
    
    public 0vG(final 0vH liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final int compare(final T t, final T t2) {
        final View view = (View)t;
        final List<LinkPlayerInfo> ljiil = this.LIZ.LIZ().LJIIL;
        final int n = 0;
    Label_0083:
        while (true) {
            if (ljiil != null) {
                final Iterator<LinkPlayerInfo> iterator = ljiil.iterator();
                int n2 = 0;
                while (iterator.hasNext()) {
                    final LinkPlayerInfo linkPlayerInfo = iterator.next();
                    String interactId;
                    if (view instanceof 1ln) {
                        interactId = ((1ln)view).getInteractId();
                    }
                    else {
                        interactId = "";
                    }
                    if (kotlin.jvm.internal.n.LIZ((Object)linkPlayerInfo.LJIIIZ, (Object)interactId)) {
                        break Label_0083;
                    }
                    ++n2;
                }
            }
            Label_0243: {
                break Label_0243;
                final int n3 = Integer.MAX_VALUE;
                final int n2;
                int n4;
                if ((n4 = n2) == -1) {
                    n4 = Integer.MAX_VALUE;
                }
                final View view2 = (View)t2;
                final List<LinkPlayerInfo> ljiil2 = this.LIZ.LIZ().LJIIL;
                int n5 = n3;
                if (ljiil2 != null) {
                    final Iterator<LinkPlayerInfo> iterator2 = ljiil2.iterator();
                    int n6 = n;
                    while (true) {
                        n5 = n3;
                        if (!iterator2.hasNext()) {
                            return JwY.LIZ((Comparable)n4, (Comparable)n5);
                        }
                        final LinkPlayerInfo linkPlayerInfo2 = iterator2.next();
                        String interactId2;
                        if (view2 instanceof 1ln) {
                            interactId2 = ((1ln)view2).getInteractId();
                        }
                        else {
                            interactId2 = "";
                        }
                        if (kotlin.jvm.internal.n.LIZ((Object)linkPlayerInfo2.LJIIIZ, (Object)interactId2)) {
                            if (n6 == -1) {
                                n5 = n3;
                                return JwY.LIZ((Comparable)n4, (Comparable)n5);
                            }
                            break;
                        }
                        else {
                            ++n6;
                        }
                    }
                    n5 = n6;
                }
                return JwY.LIZ((Comparable)n4, (Comparable)n5);
            }
            int n2 = -1;
            continue Label_0083;
        }
    }
}
