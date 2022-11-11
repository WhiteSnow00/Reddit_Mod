// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 0gy
{
    public static final 0gy LIZ;
    
    static {
        Covode.recordClassIndex(6286);
        LIZ = new 0gy();
    }
    
    public final void LIZ(final DataChannel dataChannel, final TreeMap<Integer, HAJ> treeMap, final List<0gn> list) {
        CTM.LIZ((Object)treeMap, (Object)list);
        if (treeMap.isEmpty()) {
            return;
        }
        final ArrayList list2 = new ArrayList();
        final ArrayList list3 = new ArrayList();
        for (final Map.Entry<K, HAJ> entry : treeMap.entrySet()) {
            list2.add(entry.getValue().LIZJ + 1);
            final 0gn 0gn = (0gn)Qsi.LIZIZ((List)list, entry.getValue().LIZJ);
            long liziz;
            if (0gn != null) {
                liziz = 0gn.LIZIZ;
            }
            else {
                liziz = 0L;
            }
            list3.add(liziz);
        }
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_sound_show");
        liz.LIZ(dataChannel);
        liz.LIZ("sticker_position", list2.toString());
        liz.LIZ("effect_id_set", list3.toString());
        final IBroadcastService liz2 = 0jR.LIZ(IBroadcastService.class);
        n.LIZIZ((Object)liz2, "");
        liz.LIZ("select_scene", liz2.getBroadcastScene());
        liz.LIZLLL();
    }
    
    public final void LIZ(final DataChannel dataChannel, final boolean b) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_sound_panel_show");
        liz.LIZ(dataChannel);
        String s;
        if (b) {
            s = "shortcut";
        }
        else {
            s = "normal";
        }
        liz.LIZ("panel_type", s);
        liz.LIZLLL();
    }
    
    public final void LIZ(final DataChannel dataChannel, final boolean b, final long n) {
        if (n == 0L) {
            return;
        }
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_sound_panel_duration");
        liz.LIZ(dataChannel);
        String s;
        if (b) {
            s = "shortcut";
        }
        else {
            s = "normal";
        }
        liz.LIZ("panel_type", s);
        liz.LIZ("duration", (System.currentTimeMillis() - n) / 1000L);
        liz.LIZLLL();
    }
}
