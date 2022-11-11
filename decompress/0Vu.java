// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Set;
import java.util.Map;
import com.bytedance.android.livesdkapi.depend.model.live.match.MultiMatchPrepareResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import java.util.Iterator;
import java.util.List;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTest;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.covode.number.Covode;

public final class 0vu
{
    public static boolean LIZ;
    public static final 0vu LIZIZ;
    
    static {
        Covode.recordClassIndex(9839);
        LIZIZ = new 0vu();
    }
    
    public final boolean LIZ(final LinkMicBattleMessage linkMicBattleMessage) {
        CTM.LIZ((Object)linkMicBattleMessage);
        final List ljiilliil = linkMicBattleMessage.LJIILLIIL;
        boolean liz = false;
        if (ljiilliil != null) {
            final Iterator iterator = ljiilliil.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final BattleABTestList liziz = ((BattleABTestSetting)iterator.next()).LIZIZ;
                if (liziz != null) {
                    final List liz2 = liziz.LIZ;
                    if (liz2 == null) {
                        continue;
                    }
                    final Iterator iterator2 = liz2.iterator();
                    int n2 = n;
                    while (true) {
                        n = n2;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final BattleABTest battleABTest = (BattleABTest)iterator2.next();
                        if (battleABTest.LIZ != 1 || battleABTest.LIZIZ != 1) {
                            continue;
                        }
                        ++n2;
                    }
                }
            }
            liz = liz;
            if (n == 4) {
                liz = true;
            }
        }
        return 0vu.LIZ = liz;
    }
    
    public final boolean LIZ(final MultiMatchPrepareResponse multiMatchPrepareResponse) {
        CTM.LIZ((Object)multiMatchPrepareResponse);
        final Map lizj = multiMatchPrepareResponse.LIZJ;
        boolean liz;
        final boolean b = liz = false;
        if (lizj != null) {
            final Set keySet = lizj.keySet();
            liz = b;
            if (keySet != null) {
                final Iterator iterator = keySet.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final long longValue = ((Number)iterator.next()).longValue();
                    final Map lizj2 = multiMatchPrepareResponse.LIZJ;
                    if (lizj2 != null) {
                        final BattleABTestList list = lizj2.get(longValue);
                        if (list == null) {
                            continue;
                        }
                        final List liz2 = list.LIZ;
                        if (liz2 == null) {
                            continue;
                        }
                        final Iterator iterator2 = liz2.iterator();
                        int n2 = n;
                        while (true) {
                            n = n2;
                            if (!iterator2.hasNext()) {
                                break;
                            }
                            final BattleABTest battleABTest = (BattleABTest)iterator2.next();
                            if (battleABTest.LIZ != 1 || battleABTest.LIZIZ != 1) {
                                continue;
                            }
                            ++n2;
                        }
                    }
                }
                liz = b;
                if (n == 4) {
                    liz = true;
                }
            }
        }
        return 0vu.LIZ = liz;
    }
}
