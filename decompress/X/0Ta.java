// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.linkmock.api.ILinkMockService;
import com.bytedance.android.livesdkapi.host.IHostContext;
import android.view.View;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiLiveAnchorSwitchFrequency;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class 0ta
{
    public static final int LIZ;
    public static final ArrayList<Long> LIZIZ;
    public static final 0ta LIZJ;
    public static final ArrayList<Long> LIZLLL;
    public static final ArrayList<Long> LJ;
    
    static {
        Covode.recordClassIndex(9365);
        LIZJ = new 0ta();
        LIZ = MultiLiveAnchorSwitchFrequency.INSTANCE.getValue();
        LIZIZ = new ArrayList<Long>();
        LIZLLL = new ArrayList<Long>();
        LJ = new ArrayList<Long>();
    }
    
    public static final 0k8 LIZ(final int n, final int n2) {
        if (n == 1) {
            if (n2 == 0) {
                return 0k8.FLOATING_FIX;
            }
        }
        else if (n != 1) {
            if (n != 0) {
                return 0k8.NORMAL;
            }
            if (n2 == 0) {
                return 0k8.GRID_FIX;
            }
            if (n2 == 1) {
                return 0k8.GRID;
            }
            return 0k8.NORMAL;
        }
        if (n2 == 1) {
            return 0k8.FLOATING;
        }
        return 0k8.NORMAL;
    }
    
    public static final 0k8 LIZ(final 1Uo 1Uo) {
        if (0sD.LIZJ.LIZ().LIZLLL()) {
            return 0sD.LIZJ.LIZ().LJIIIIZZ();
        }
        if (1Uo instanceof 1Uo) {
            return 1Uo.LJIILL;
        }
        return null;
    }
    
    public final boolean LIZ() {
        final long currentTimeMillis = System.currentTimeMillis();
        final ArrayList<Long> lizlll = 0ta.LIZLLL;
        if (lizlll.size() < 0ta.LIZ) {
            lizlll.add(currentTimeMillis);
            return true;
        }
        final Long value = lizlll.get(0);
        n.LIZIZ((Object)value, "");
        if (currentTimeMillis - value.longValue() < 60000L) {
            return false;
        }
        lizlll.remove(0);
        lizlll.add(currentTimeMillis);
        return true;
    }
    
    public final boolean LIZ(final View view) {
        CTM.LIZ((Object)view);
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        return array[1] < 0cB.LIZIZ() / 2;
    }
    
    public final boolean LIZIZ() {
        final long currentTimeMillis = System.currentTimeMillis();
        final ArrayList<Long> lj = 0ta.LJ;
        if (lj.size() < 0ta.LIZ) {
            lj.add(currentTimeMillis);
            return true;
        }
        final Long value = lj.get(0);
        n.LIZIZ((Object)value, "");
        if (currentTimeMillis - value.longValue() < 60000L) {
            return false;
        }
        lj.remove(0);
        lj.add(currentTimeMillis);
        return true;
    }
    
    public final boolean LIZJ() {
        final 0Vq liz = 0jR.LIZ((Class<0Vq>)IHostContext.class);
        n.LIZIZ((Object)liz, "");
        return n.LIZ((Object)((IHostContext)liz).getChannel(), (Object)"local_test");
    }
    
    public final boolean LIZLLL() {
        final ILinkMockService liz = 0jR.LIZ(ILinkMockService.class);
        n.LIZIZ((Object)liz, "");
        return GTi.LIZ((CharSequence)liz.getEntranceString());
    }
}
