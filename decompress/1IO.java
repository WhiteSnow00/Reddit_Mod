// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Handler;
import java.util.List;
import java.util.ArrayList;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Iterator;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Set;

public final class 1io implements 1JR
{
    public static Set<String> LIZ;
    public static Map<String, String> LIZIZ;
    public static boolean LIZJ;
    public static final 1io LIZLLL;
    public static Map<Long, 1JO> LJ;
    public static Map<Long, Integer> LJFF;
    public static Map<Long, String> LJI;
    public static Map<Long, 1JO> LJII;
    public static Map<Long, 1JO> LJIIIIZZ;
    public static Map<Long, 1JO> LJIIIZ;
    public static Map<Long, 1JO> LJIIJ;
    public static Map<Long, 1JO> LJIIJJI;
    public static Map<Long, a> LJIIL;
    public static Set<String> LJIILIIL;
    public static 0g8 LJIILJJIL;
    public static String LJIILL;
    
    static {
        Covode.recordClassIndex(6273);
        LIZLLL = new 1io();
        1io.LJ = new LinkedHashMap<Long, 1JO>();
        1io.LJFF = new LinkedHashMap<Long, Integer>();
        1io.LJI = new LinkedHashMap<Long, String>();
        1io.LJII = new LinkedHashMap<Long, 1JO>();
        1io.LJIIIIZZ = new LinkedHashMap<Long, 1JO>();
        1io.LJIIIZ = new LinkedHashMap<Long, 1JO>();
        1io.LJIIJ = new LinkedHashMap<Long, 1JO>();
        1io.LJIIJJI = new LinkedHashMap<Long, 1JO>();
        1io.LJIIL = new LinkedHashMap<Long, a>();
        1io.LJIILIIL = new LinkedHashSet<String>();
        1io.LIZ = new LinkedHashSet<String>();
        new LinkedHashSet();
        1io.LJIILJJIL = 0fx.LIZ.LIZ();
        1io.LJIILL = "";
    }
    
    private final void LIZ(final DataChannel dataChannel, final Map<Long, 1JO> map) {
        for (final Map.Entry<K, 1JO> entry : map.entrySet()) {
            final 1JO 1jo = entry.getValue();
            final LiveEffect lizlll = 1jo.LIZLLL;
            final 1JO 1jo2 = 1io.LJ.get(entry.getKey());
            if (1jo2 == null) {
                continue;
            }
            String s;
            if ((s = 1io.LJI.get(entry.getKey())) == null) {
                s = "video_anchor_connect_detail";
            }
            if (1jo2.LIZIZ == 0.0f) {
                continue;
            }
            final long currentTimeMillis = System.currentTimeMillis();
            final long ljff = 1jo2.LJFF;
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_guest_connection_beauty_use_time");
            liz.LIZ(dataChannel);
            liz.LIZ("beauty_value", Float.valueOf(1jo2.LIZIZ));
            liz.LIZ("use_time", currentTimeMillis - ljff);
            liz.LIZ("event_scene", (Number)1io.LJFF.get(1jo.LIZ));
            liz.LIZ("event_page", s);
            liz.LIZ("is_default_value", (int)(1jo2.LJ ? 1 : 0));
            0gY.LIZ(liz, lizlll);
            liz.LIZ((Map)1io.LIZIZ);
            liz.LIZLLL();
        }
    }
    
    private final void LIZ(final DataChannel dataChannel, final Map<Long, 1JO> map, final int n, final String s) {
        this.LIZ("reportBeautyUseInternal", String.valueOf(map));
        for (final Map.Entry<K, 1JO> entry : map.entrySet()) {
            final LiveEffect lizlll = entry.getValue().LIZLLL;
            1io.LJFF.put(entry.getValue().LIZ, n);
            1io.LJI.put(entry.getValue().LIZ, s);
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_guest_connection_beauty_use");
            liz.LIZ(dataChannel);
            final Gaz smallItemConfig = lizlll.getSmallItemConfig();
            Object value = null;
            Integer value2;
            if (smallItemConfig != null) {
                value2 = smallItemConfig.LJI;
            }
            else {
                value2 = null;
            }
            final Gaz smallItemConfig2 = lizlll.getSmallItemConfig();
            if (smallItemConfig2 != null) {
                value = smallItemConfig2.LJII;
            }
            liz.LIZ("is_default_value", (int)(n.LIZ((Object)value2, value) ? 1 : 0));
            liz.LIZ("event_scene", n);
            liz.LIZ("event_page", s);
            liz.LIZ("beauty_value", Float.valueOf(entry.getValue().LIZIZ));
            liz.LIZ((Map)1io.LIZIZ);
            0gY.LIZ(liz, lizlll);
            liz.LIZLLL();
        }
    }
    
    @Override
    public final void LIZ() {
        GSQ.LJ = (1io.LJII.isEmpty() ^ true);
        1io.LJ.clear();
        1io.LJ.putAll(1io.LJII);
        1io.LJIIIIZZ.clear();
        1io.LJIIIZ.clear();
        1io.LJIIJ.clear();
        1io.LJII.clear();
        final StringBuilder sb = new StringBuilder("previousBeautyMap = ");
        sb.append(1io.LJ);
        this.LIZ("finishLog", sb.toString());
    }
    
    @Override
    public final void LIZ(final 0g8 ljiiljjil) {
        CTM.LIZ((Object)ljiiljjil);
        1io.LJIILJJIL = ljiiljjil;
    }
    
    @Override
    public final void LIZ(final DataChannel dataChannel) {
        if (1io.LIZJ) {
            this.LIZ(dataChannel, FJ3.LIZ((Map)1io.LJIIIZ, (Map)1io.LJIIJ));
        }
    }
    
    @Override
    public final void LIZ(final DataChannel dataChannel, final int n) {
        this.LIZ(dataChannel, 1io.LJII, n, 1io.LJIILL);
    }
    
    public final void LIZ(final DataChannel dataChannel, final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_guest_connection_reset_beauty_popup_window_click");
        liz.LIZ(dataChannel);
        liz.LIZ("tab_name", s);
        liz.LIZ("click_type", s2);
        liz.LIZ((Map)1io.LIZIZ);
        liz.LIZLLL();
    }
    
    @Override
    public final void LIZ(final DataChannel dataChannel, final boolean b) {
        if (1io.LIZJ) {
            final String ljiill = 1io.LJIILL;
            final StringBuilder sb = new StringBuilder();
            sb.append(1io.LJIIIIZZ);
            sb.append(' ');
            sb.append(1io.LJIIIZ);
            this.LIZ("reportBeautySelected", sb.toString());
            for (final Map.Entry<K, 1JO> entry : FJ3.LIZ((Map)1io.LJIIIIZZ, (Map)1io.LJIIIZ).entrySet()) {
                final LiveEffect lizlll = entry.getValue().LIZLLL;
                final Gkn liz = Gkn.LJFF.LIZ("livesdk_guest_connection_beauty_select");
                liz.LIZ(dataChannel);
                final Gaz smallItemConfig = lizlll.getSmallItemConfig();
                Object value = null;
                Integer value2;
                if (smallItemConfig != null) {
                    value2 = smallItemConfig.LJI;
                }
                else {
                    value2 = null;
                }
                final Gaz smallItemConfig2 = lizlll.getSmallItemConfig();
                if (smallItemConfig2 != null) {
                    value = smallItemConfig2.LJII;
                }
                liz.LIZ("is_default_value", (int)(n.LIZ((Object)value2, value) ? 1 : 0));
                liz.LIZ("event_page", ljiill);
                liz.LIZ("beauty_value", Float.valueOf(entry.getValue().LIZIZ));
                liz.LIZ((Map)1io.LIZIZ);
                0gY.LIZ(liz, lizlll);
                liz.LIZLLL();
            }
        }
    }
    
    @Override
    public final void LIZ(final String ljiill) {
        CTM.LIZ((Object)ljiill);
        1io.LJIILL = ljiill;
    }
    
    public final void LIZ(final String s, final String s2) {
        final StringBuilder sb = new StringBuilder("method#");
        sb.append(s);
        sb.append(" - ");
        sb.append(s2);
        0ba.LIZ(3, "LiveMultiGuestBeautyLogManager", sb.toString());
    }
    
    @Override
    public final void LIZ(final Map<String, String> liziz) {
        CTM.LIZ((Object)liziz);
        1io.LIZIZ = liziz;
    }
    
    @Override
    public final void LIZ(final boolean b) {
        if (b) {
            for (final Map.Entry<Object, V> entry : 1io.LJ.entrySet()) {
                1io.LJIIJ.put(entry.getKey(), new 1JO((1JO)entry.getValue()));
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("previewBeautyMap = ");
        sb.append(1io.LJ);
        this.LIZ("prepareLogData", sb.toString());
        final List<LiveEffect> liziz = 1io.LJIILJJIL.LIZIZ("liveguestbeauty");
        n.LIZIZ((Object)liziz, "");
        final ArrayList list = new ArrayList();
        for (final LiveEffect next : liziz) {
            if (GTi.LIZ((CharSequence)next.getName())) {
                list.add(next);
            }
        }
        for (final LiveEffect liveEffect : list) {
            final 1io lizlll = 1io.LIZLLL;
            lizlll.LIZ("prepareLogData", "current sticker ".concat(String.valueOf(liveEffect)));
            final 1JO 1jo = 1io.LJ.get(liveEffect.effectId);
            n.LIZIZ((Object)liveEffect, "");
            final Gaz smallItemConfig = liveEffect.getSmallItemConfig();
            int lji;
            if (smallItemConfig != null) {
                lji = smallItemConfig.LJI;
            }
            else {
                lji = 0;
            }
            final float n = LIK.LIZ(0g3.LIZ(liveEffect, lji) * 100.0f) / 100.0f;
            final Object o = null;
            Object value = null;
            if (1jo == null) {
                if (n != 0.0f) {
                    final long effectId = liveEffect.effectId;
                    final String name = liveEffect.getName();
                    final Gaz smallItemConfig2 = liveEffect.getSmallItemConfig();
                    Integer value2;
                    if (smallItemConfig2 != null) {
                        value2 = smallItemConfig2.LJI;
                    }
                    else {
                        value2 = null;
                    }
                    final Gaz smallItemConfig3 = liveEffect.getSmallItemConfig();
                    if (smallItemConfig3 != null) {
                        value = smallItemConfig3.LJII;
                    }
                    final 1JO 1jo2 = new 1JO(effectId, n, name, liveEffect, kotlin.jvm.internal.n.LIZ((Object)value2, value));
                    1io.LJIIIIZZ.put(liveEffect.effectId, 1jo2);
                    1io.LJII.put(liveEffect.effectId, 1jo2);
                    lizlll.LIZ("prepareLogData", "find new added ".concat(String.valueOf(liveEffect)));
                }
                else {
                    lizlll.LIZ("prepareLogData", "preview beauty == null and new effect.");
                }
            }
            else if (n == 0.0f) {
                lizlll.LIZ("prepareLogData", "find effect to be deleted ".concat(String.valueOf(liveEffect)));
                1io.LJIIJ.put(liveEffect.effectId, 1jo);
            }
            else if (n != 1jo.LIZIZ) {
                lizlll.LIZ("prepareLogData", "find a changed effect ".concat(String.valueOf(liveEffect)));
                final long effectId2 = liveEffect.effectId;
                final String name2 = liveEffect.getName();
                final Gaz smallItemConfig4 = liveEffect.getSmallItemConfig();
                Integer value3;
                if (smallItemConfig4 != null) {
                    value3 = smallItemConfig4.LJI;
                }
                else {
                    value3 = null;
                }
                final Gaz smallItemConfig5 = liveEffect.getSmallItemConfig();
                Object value4 = o;
                if (smallItemConfig5 != null) {
                    value4 = smallItemConfig5.LJII;
                }
                final 1JO 1jo3 = new 1JO(effectId2, n, name2, liveEffect, kotlin.jvm.internal.n.LIZ((Object)value3, value4));
                1io.LJIIIZ.put(liveEffect.effectId, 1jo3);
                1io.LJII.put(liveEffect.effectId, 1jo3);
            }
            else {
                lizlll.LIZ("prepareLogData", "find a existing effect ".concat(String.valueOf(liveEffect)));
                if (1io.LJIIJJI.containsKey(1jo.LIZLLL.effectId)) {
                    1io.LJII.put(liveEffect.effectId, new 1JO(1jo.LIZ, 1jo.LIZIZ, 1jo.LIZJ, 1jo.LIZLLL, 1jo.LJ, System.currentTimeMillis()));
                }
                else {
                    1io.LJII.put(liveEffect.effectId, 1jo);
                }
            }
        }
        final Map<Long, 1JO> lj = 1io.LJ;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final Map.Entry<Object, V> entry2 : lj.entrySet()) {
            if (1io.LJII.containsKey(entry2.getKey()) ^ true) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (final Map.Entry<Object, V> entry3 : linkedHashMap.entrySet()) {
            1io.LJIIJ.put(entry3.getKey(), new 1JO((1JO)entry3.getValue()));
        }
        1io.LJIIJJI.clear();
        final StringBuilder sb2 = new StringBuilder("deleteMap = ");
        sb2.append(1io.LJIIJ);
        this.LIZ("prepareLogData", sb2.toString());
    }
    
    @Override
    public final void LIZIZ() {
        1io.LJ.clear();
        1io.LJII.clear();
        1io.LJIIIIZZ.clear();
        1io.LJIIIZ.clear();
        1io.LJIIJ.clear();
        final Iterator<Map.Entry<Long, a>> iterator = 1io.LJIIL.entrySet().iterator();
        while (iterator.hasNext()) {
            0cf.LIZ().removeCallbacks((Runnable)((Map.Entry<K, Runnable>)iterator.next()).getValue());
        }
        1io.LJIIL.clear();
        1io.LIZ.clear();
        1io.LJIILIIL.clear();
    }
    
    @Override
    public final void LIZIZ(final DataChannel dataChannel) {
    }
    
    @Override
    public final void LIZIZ(final DataChannel dataChannel, final boolean b) {
        final Handler liz = 0cf.LIZ();
        final Iterator<Map.Entry<Long, 1JO>> iterator = 1io.LJIIJ.entrySet().iterator();
        while (iterator.hasNext()) {
            final a a = 1io.LJIIL.remove(((Map.Entry<Object, V>)iterator.next()).getKey());
            if (a != null) {
                liz.removeCallbacks((Runnable)a);
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(1io.LJIIIIZZ);
        sb.append(' ');
        sb.append(1io.LJIIIZ);
        this.LIZ("reportBeautyEffectiveUse", sb.toString());
        for (final Map.Entry<Object, V> entry : FJ3.LIZ((Map)1io.LJIIIIZZ, (Map)1io.LJIIIZ).entrySet()) {
            final a a2 = 1io.LJIIL.remove(entry.getKey());
            if (a2 != null) {
                liz.removeCallbacks((Runnable)a2);
            }
            if (((1JO)entry.getValue()).LIZIZ != 0.0f) {
                final LiveEffect lizlll = ((1JO)entry.getValue()).LIZLLL;
                final float liziz = ((1JO)entry.getValue()).LIZIZ;
                final Integer n = 1io.LJFF.get(((1JO)entry.getValue()).LIZ);
                int intValue;
                if (n != null) {
                    intValue = n;
                }
                else {
                    intValue = 1;
                }
                final a a3 = new a(dataChannel, lizlll, liziz, intValue, 1io.LJIILL);
                1io.LJIIL.put(entry.getKey(), a3);
                liz.postDelayed((Runnable)a3, 30000L);
            }
        }
    }
    
    @Override
    public final void LIZJ() {
        final StringBuilder sb = new StringBuilder("effectuse map ");
        sb.append(1io.LJIIL);
        this.LIZ("clearMultiGuestEffectiveUseTimer", sb.toString());
        final Iterator<Map.Entry<Long, a>> iterator = 1io.LJIIL.entrySet().iterator();
        while (iterator.hasNext()) {
            0cf.LIZ().removeCallbacks((Runnable)((Map.Entry<K, Runnable>)iterator.next()).getValue());
        }
        1io.LJIIL.clear();
    }
    
    @Override
    public final void LIZJ(final DataChannel dataChannel) {
        this.LIZ(dataChannel, FJ3.LIZ((Map)1io.LJIIIIZZ, (Map)1io.LJIIIZ), 1, 1io.LJIILL);
    }
    
    @Override
    public final void LIZLLL() {
        1io.LJIIJJI.clear();
        1io.LJIIJJI.putAll(1io.LJII);
    }
    
    @Override
    public final void LIZLLL(final DataChannel dataChannel) {
        this.LIZ(dataChannel, 1io.LJ);
    }
    
    @Override
    public final void LJ() {
        1io.LJ.clear();
        this.LIZ(false);
        1io.LJ.clear();
        1io.LJ.putAll(1io.LJII);
        1io.LJII.clear();
        1io.LJIIIIZZ.clear();
        1io.LJIIIZ.clear();
        1io.LJIIJ.clear();
    }
    
    @Override
    public final void LJ(final DataChannel dataChannel) {
        final Handler liz = 0cf.LIZ();
        final Iterator<Map.Entry<Long, a>> iterator = 1io.LJIIL.entrySet().iterator();
        while (iterator.hasNext()) {
            liz.removeCallbacks((Runnable)((Map.Entry<K, Runnable>)iterator.next()).getValue());
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(1io.LJIIIIZZ);
        sb.append(' ');
        sb.append(1io.LJIIIZ);
        this.LIZ("reportAllBeautyEffectiveUse", sb.toString());
        for (final Map.Entry<Object, V> entry : 1io.LJII.entrySet()) {
            final a a = 1io.LJIIL.remove(entry.getKey());
            if (a != null) {
                liz.removeCallbacks((Runnable)a);
            }
            if (((1JO)entry.getValue()).LIZIZ != 0.0f) {
                final LiveEffect lizlll = ((1JO)entry.getValue()).LIZLLL;
                final float liziz = ((1JO)entry.getValue()).LIZIZ;
                final Integer n = 1io.LJFF.get(((1JO)entry.getValue()).LIZ);
                int intValue;
                if (n != null) {
                    intValue = n;
                }
                else {
                    intValue = 1;
                }
                final a a2 = new a(dataChannel, lizlll, liziz, intValue, 1io.LJIILL);
                1io.LJIIL.put(entry.getKey(), a2);
                liz.postDelayed((Runnable)a2, 30000L);
            }
        }
    }
    
    public static final class a implements Runnable
    {
        public final DataChannel LIZ;
        public final LiveEffect LIZIZ;
        public final float LIZJ;
        public final int LIZLLL;
        public final String LJ;
        
        static {
            Covode.recordClassIndex(6274);
        }
        
        public a(final DataChannel liz, final LiveEffect liziz, final float lizj, final int lizlll, final String lj) {
            CTM.LIZ((Object)liziz, (Object)lj);
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
            this.LJ = lj;
        }
        
        @Override
        public final void run() {
            final String effectPanelKey = this.LIZIZ.effectPanelKey;
            if (effectPanelKey != null) {
                1io.LIZ.add(effectPanelKey);
            }
            1io.LIZLLL.LIZ("ReportBeautyEffectiveUseRunnable", "report effective use");
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_guest_connection_beauty_effective_use");
            liz.LIZ(this.LIZ);
            final Gaz smallItemConfig = this.LIZIZ.getSmallItemConfig();
            Object value = null;
            Integer value2;
            if (smallItemConfig != null) {
                value2 = smallItemConfig.LJI;
            }
            else {
                value2 = null;
            }
            final Gaz smallItemConfig2 = this.LIZIZ.getSmallItemConfig();
            if (smallItemConfig2 != null) {
                value = smallItemConfig2.LJII;
            }
            liz.LIZ("is_default_value", (int)(n.LIZ((Object)value2, value) ? 1 : 0));
            liz.LIZ("event_page", "video_anchor_connect_detail");
            liz.LIZ("event_scene", this.LIZLLL);
            liz.LIZ("event_page", this.LJ);
            liz.LIZ("beauty_value", Float.valueOf(this.LIZJ));
            liz.LIZ((Map)1io.LIZIZ);
            0gY.LIZ(liz, this.LIZIZ);
            liz.LIZLLL();
        }
    }
}
