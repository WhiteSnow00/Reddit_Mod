// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.covode.number.Covode;

public final class 0hf
{
    public static final 0hf LIZ;
    public static String LIZIZ;
    
    static {
        Covode.recordClassIndex(6477);
        LIZ = new 0hf();
        0hf.LIZIZ = "normal_video_live";
    }
    
    public final void LIZ() {
        final IBroadcastService liz = 0jR.LIZ(IBroadcastService.class);
        n.LIZIZ((Object)liz, "");
        final String broadcastScene = liz.getBroadcastScene();
        n.LIZIZ((Object)broadcastScene, "");
        0hf.LIZIZ = broadcastScene;
        final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_anchor_ksong_play");
        liz2.LIZ();
        final 1L2 ljiij = 0hc.LJIIJ;
        final String s = null;
        while (true) {
            Label_0257: {
                if (ljiij == null) {
                    break Label_0257;
                }
                final 1L1 accompaniment = ljiij.getAccompaniment();
                if (accompaniment == null) {
                    break Label_0257;
                }
                final Long value = accompaniment.LIZ;
                liz2.LIZ("music_id", String.valueOf(value));
                final 1L2 ljiij2 = 0hc.LJIIJ;
                while (true) {
                    Label_0252: {
                        if (ljiij2 == null) {
                            break Label_0252;
                        }
                        final 1L1 accompaniment2 = ljiij2.getAccompaniment();
                        if (accompaniment2 == null) {
                            break Label_0252;
                        }
                        final String liziz = accompaniment2.LIZIZ;
                        liz2.LIZ("music_name", liziz);
                        final 1L2 ljiij3 = 0hc.LJIIJ;
                        while (true) {
                            Label_0247: {
                                if (ljiij3 == null) {
                                    break Label_0247;
                                }
                                final 1L1 accompaniment3 = ljiij3.getAccompaniment();
                                if (accompaniment3 == null) {
                                    break Label_0247;
                                }
                                final String lizj = accompaniment3.LIZJ;
                                liz2.LIZ("artist_name", lizj);
                                final 1L2 ljiij4 = 0hc.LJIIJ;
                                String lj = s;
                                if (ljiij4 != null) {
                                    final 1L1 accompaniment4 = ljiij4.getAccompaniment();
                                    lj = s;
                                    if (accompaniment4 != null) {
                                        lj = accompaniment4.LJ;
                                    }
                                }
                                liz2.LIZ("music_url", lj);
                                final List<1L4> ljff = 0hc.LJFF;
                                final ArrayList list = new ArrayList();
                                for (final 1L4 next : ljff) {
                                    if (next.LIZ == 0hc.LJIIIZ) {
                                        list.add(next);
                                    }
                                }
                                final 1L4 1l4 = (1L4)Qsi.LIZIZ((List)list, 0);
                                String liziz2;
                                if (1l4 == null || (liziz2 = 1l4.LIZIZ) == null) {
                                    liziz2 = "unknown";
                                }
                                liz2.LIZ("from_request_type", liziz2);
                                liz2.LIZ("collection_id", String.valueOf(0hc.LJIIIZ));
                                liz2.LIZ("enter_from", "decorate");
                                liz2.LIZ("select_scene", 0hf.LIZIZ);
                                liz2.LIZLLL();
                                return;
                            }
                            final String lizj = null;
                            continue;
                        }
                    }
                    final String liziz = null;
                    continue;
                }
            }
            final Long value = null;
            continue;
        }
    }
    
    public final void LIZ(final DataChannel dataChannel, final String s) {
        CTM.LIZ((Object)s);
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_ksong_request_button_click");
        liz.LIZ(dataChannel);
        liz.LIZ("button_type", s);
        final 1L2 ljiij = 0hc.LJIIJ;
        while (true) {
            Label_0081: {
                if (ljiij == null) {
                    break Label_0081;
                }
                final 1L1 accompaniment = ljiij.getAccompaniment();
                if (accompaniment == null) {
                    break Label_0081;
                }
                final Long value = accompaniment.LIZ;
                liz.LIZ("music_id", String.valueOf(value));
                liz.LIZ("collection_id", String.valueOf(0hc.LJIIIZ));
                liz.LIZLLL();
                return;
            }
            final Long value = null;
            continue;
        }
    }
    
    public final void LIZ(final String s, final int n) {
        CTM.LIZ((Object)s);
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_ksong_list_play_duration");
        liz.LIZ();
        liz.LIZ("tab", s);
        liz.LIZ("duration", n);
        liz.LIZ("collection_id", String.valueOf(0hc.LJIIIZ));
        liz.LIZLLL();
    }
    
    public final void LIZ(final String s, final int n, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final 1L2 ljiij = 0hc.LJIIJ;
        if (ljiij != null) {
            final 1L1 accompaniment = ljiij.getAccompaniment();
            if (accompaniment != null) {
                final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_ksong_play_duration");
                liz.LIZ();
                liz.LIZ("is_finish", s);
                liz.LIZ("music_id", String.valueOf(accompaniment.LIZ));
                liz.LIZ("music_name", accompaniment.LIZIZ);
                liz.LIZ("artist_name", accompaniment.LIZJ);
                liz.LIZ("music_url", accompaniment.LJ);
                liz.LIZ("from_request_type", s2);
                liz.LIZ("duration", n);
                liz.LIZ("enter_from", "decorate");
                liz.LIZ("select_scene", 0hf.LIZIZ);
                liz.LIZ("collection_id", String.valueOf(0hc.LJIIIZ));
                liz.LIZLLL();
            }
        }
    }
    
    public final void LIZ(final boolean b) {
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_anchor_ksong_cut_off_music");
        liz.LIZ();
        final 1L2 ljiij = 0hc.LJIIJ;
        while (true) {
            Label_0089: {
                if (ljiij == null) {
                    break Label_0089;
                }
                final 1L1 accompaniment = ljiij.getAccompaniment();
                if (accompaniment == null) {
                    break Label_0089;
                }
                final Long value = accompaniment.LIZ;
                liz.LIZ("music_id", String.valueOf(value));
                liz.LIZ("collection_id", String.valueOf(0hc.LJIIIZ));
                String s;
                if (b) {
                    s = "cut_off_click";
                }
                else {
                    s = "collection_click";
                }
                liz.LIZ("method", s);
                liz.LIZLLL();
                return;
            }
            final Long value = null;
            continue;
        }
    }
}
