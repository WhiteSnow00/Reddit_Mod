// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.Handler;
import kotlin.n.y;
import java.util.List;
import java.util.ArrayList;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import com.bytedance.covode.number.Covode;
import java.util.Set;
import java.util.Map;

public final class 1Jc implements 0gB
{
    public static Map<Long, a> LIZ;
    public static Map<Long, a> LIZIZ;
    public static Map<Long, a> LIZJ;
    public static Map<Long, a> LIZLLL;
    public static boolean LJ;
    public static Set<String> LJFF;
    public static Set<String> LJI;
    public static Set<Long> LJII;
    public static String LJIIIIZZ;
    public static final 1Jc LJIIIZ;
    public static Map<Long, a> LJIIJ;
    public static Map<Long, b> LJIIJJI;
    
    static {
        Covode.recordClassIndex(6263);
        LJIIIZ = new 1Jc();
        1Jc.LIZ = new LinkedHashMap<Long, a>();
        1Jc.LJIIJ = new LinkedHashMap<Long, a>();
        1Jc.LIZIZ = new LinkedHashMap<Long, a>();
        1Jc.LIZJ = new LinkedHashMap<Long, a>();
        1Jc.LIZLLL = new LinkedHashMap<Long, a>();
        1Jc.LJIIJJI = new LinkedHashMap<Long, b>();
        1Jc.LJFF = new LinkedHashSet<String>();
        1Jc.LJI = new LinkedHashSet<String>();
        1Jc.LJII = new LinkedHashSet<Long>();
        1Jc.LJIIIIZZ = "normal_video_live";
    }
    
    public final Gkn LIZ(final Gkn gkn, final LiveEffect liveEffect) {
        gkn.LIZ("tab_name", liveEffect.effectPanelKey);
        gkn.LIZ("effect_id", liveEffect.effectId);
        gkn.LIZ("resource_id", liveEffect.getResourceId());
        String s;
        if ((s = liveEffect.parentResName) == null) {
            s = liveEffect.getName();
        }
        gkn.LIZ("beauty_type", s);
        String s2;
        if ((s2 = liveEffect.parentResName) == null) {
            s2 = liveEffect.getName();
        }
        gkn.LIZ("beauty_type_name", s2);
        String name;
        if (liveEffect.isSubItem()) {
            name = liveEffect.getName();
        }
        else {
            name = "";
        }
        gkn.LIZ("beauty_type_name_tier2", name);
        Integer n;
        if (liveEffect.isSubItem()) {
            n = liveEffect.parentImpressionPos;
        }
        else {
            n = liveEffect.impressionPos;
        }
        Integer value;
        if (n != null) {
            value = n + 1;
        }
        else {
            value = null;
        }
        gkn.LIZ("impr_position", (Number)value);
        return gkn;
    }
    
    @Override
    public final void LIZ() {
        GSQ.LJ = (1Jc.LJIIJ.isEmpty() ^ true);
        1Jc.LIZ.clear();
        1Jc.LIZ.putAll(1Jc.LJIIJ);
        1Jc.LIZIZ.clear();
        1Jc.LIZJ.clear();
        1Jc.LIZLLL.clear();
        1Jc.LJIIJ.clear();
        1Jc.LJ = false;
    }
    
    @Override
    public final void LIZ(final 0g8 0g8) {
        CTM.LIZ((Object)0g8);
    }
    
    @Override
    public final void LIZ(final DataChannel dataChannel) {
        final 44V lllj = GST.LLLJ;
        n.LIZIZ((Object)lllj, "");
        if (GTi.LIZIZ((Boolean)((44T)lllj).LIZ())) {
            return;
        }
        if (GTi.LIZJ()) {
            return;
        }
        1Jj.LIZ.LIZIZ(2L);
        boolean b = false;
        for (final Map.Entry<Object, V> entry : FJ3.LIZ((Map)1Jc.LIZJ, (Map)1Jc.LIZLLL).entrySet()) {
            final int contains = 1Jc.LJII.contains(entry.getKey()) ? 1 : 0;
            1Jc.LJII.remove(entry.getKey());
            final LiveEffect lizlll = ((a)entry.getValue()).LIZLLL;
            if (!0iM.LJ(lizlll)) {
                final a a = 1Jc.LIZ.get(entry.getKey());
                if (a == null) {
                    continue;
                }
                if (a.LIZIZ == 0.0f) {
                    continue;
                }
                final long ljff = ((a)entry.getValue()).LJFF;
                final long ljff2 = a.LJFF;
                final 1Jc ljiiiz = 1Jc.LJIIIZ;
                final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_beauty_use_time");
                liz.LIZ(dataChannel);
                liz.LIZ("beauty_value", Float.valueOf(a.LIZIZ));
                liz.LIZ("use_time", ljff - ljff2);
                liz.LIZ("is_live_take_default", contains);
                liz.LIZ("is_default_value", (int)(a.LJ ? 1 : 0));
                String s;
                if (ljiiiz.LIZJ()) {
                    s = "makeup";
                }
                else {
                    s = "normal";
                }
                liz.LIZ("beauty_status", s);
                ljiiiz.LIZ(liz, lizlll);
                liz.LIZLLL();
                final long effectId = lizlll.effectId;
                String name;
                if ((name = lizlll.getName()) == null) {
                    name = "";
                }
                final String resourceId = lizlll.getResourceId();
                final long n = a.LJFF / 1000L;
                final long n2 = Gqs.LIZ() / 1000L;
                String effectPanelKey;
                if ((effectPanelKey = lizlll.effectPanelKey) == null) {
                    effectPanelKey = "";
                }
                Long n3;
                if (a.LJ) {
                    n3 = 1L;
                }
                else {
                    n3 = 2L;
                }
                Long n4;
                if (contains != 0) {
                    n4 = 2L;
                }
                else {
                    n4 = 1L;
                }
                1Jj.LIZ.LIZ(2L, new 1JX(effectId, name, resourceId, 2L, n, n2, 0L, effectPanelKey, n3, n4, a.LIZIZ, null, 1Jc.LJIIIIZZ, null, 24576));
                b = true;
            }
        }
        if (b && GTi.LIZIZ(Boolean.valueOf(1Jc.LJ))) {
            1Jj.LIZ.LIZ(2L);
        }
    }
    
    public final void LIZ(final DataChannel dataChannel, final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_reset_beauty_popup_window_click");
        liz.LIZ(dataChannel);
        liz.LIZ("tab_name", s);
        liz.LIZ("click_type", s2);
        liz.LIZLLL();
    }
    
    @Override
    public final void LIZ(final DataChannel dataChannel, final boolean b) {
        final 44V lllj = GST.LLLJ;
        n.LIZIZ((Object)lllj, "");
        if (GTi.LIZIZ((Boolean)((44T)lllj).LIZ())) {
            return;
        }
        if (GTi.LIZLLL()) {
            1Jj.LIZ.LIZIZ(2L);
        }
        boolean b2 = false;
        final IBroadcastService liz = 0jR.LIZ(IBroadcastService.class);
        n.LIZIZ((Object)liz, "");
        final String broadcastScene = liz.getBroadcastScene();
        n.LIZIZ((Object)broadcastScene, "");
        1Jc.LJIIIIZZ = broadcastScene;
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        for (final Map.Entry<K, a> entry : FJ3.LIZ((Map)1Jc.LIZIZ, (Map)1Jc.LIZJ).entrySet()) {
            final LiveEffect lizlll = entry.getValue().LIZLLL;
            if (b) {
                1Jc.LJII.add((Long)entry.getKey());
            }
            if (!0iM.LJ(lizlll)) {
                final 1Jc ljiiiz = 1Jc.LJIIIZ;
                final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_live_take_beauty_select");
                liz2.LIZ(dataChannel);
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
                Integer value3;
                if (smallItemConfig2 != null) {
                    value3 = smallItemConfig2.LJII;
                }
                else {
                    value3 = null;
                }
                liz2.LIZ("is_default_value", (int)(n.LIZ((Object)value2, (Object)value3) ? 1 : 0));
                liz2.LIZ("is_live_take_default", (int)(b ? 1 : 0));
                liz2.LIZ("beauty_value", Float.valueOf(entry.getValue().LIZIZ));
                String s;
                if (ljiiiz.LIZJ()) {
                    s = "makeup";
                }
                else {
                    s = "normal";
                }
                liz2.LIZ("beauty_status", s);
                ljiiiz.LIZ(liz2, lizlll);
                liz2.LIZLLL();
                if (!GTi.LIZLLL()) {
                    continue;
                }
                list.add(lizlll.getResourceId());
                list2.add(entry.getValue().LIZIZ);
                final long effectId = lizlll.effectId;
                String name;
                if ((name = lizlll.getName()) == null) {
                    name = "";
                }
                final String resourceId = lizlll.getResourceId();
                final long n = Gqs.LIZ() / 1000L;
                String effectPanelKey;
                if ((effectPanelKey = lizlll.effectPanelKey) == null) {
                    effectPanelKey = "";
                }
                final Gaz smallItemConfig3 = lizlll.getSmallItemConfig();
                Integer value4;
                if (smallItemConfig3 != null) {
                    value4 = smallItemConfig3.LJI;
                }
                else {
                    value4 = null;
                }
                final Gaz smallItemConfig4 = lizlll.getSmallItemConfig();
                if (smallItemConfig4 != null) {
                    value = smallItemConfig4.LJII;
                }
                Long n2;
                if (kotlin.jvm.internal.n.LIZ((Object)value4, value)) {
                    n2 = 1L;
                }
                else {
                    n2 = 2L;
                }
                Long n3;
                if ((b ? 1 : 0) != 0) {
                    n3 = 2L;
                }
                else {
                    n3 = 1L;
                }
                1Jj.LIZ.LIZ(2L, new 1JX(effectId, name, resourceId, 2L, n, null, 0L, effectPanelKey, n2, n3, entry.getValue().LIZIZ, null, 1Jc.LJIIIIZZ, null, 24576));
                b2 = true;
            }
        }
        if (GTi.LIZLLL() && b2 && GTi.LIZIZ(Boolean.valueOf(1Jc.LJ))) {
            1Jj.LIZ.LIZ(2L);
        }
        CTM.LIZ((Object)list);
        Gec.LJ.put("beauty_list", list.toString());
        CTM.LIZ((Object)list2);
        Gec.LJ.put("beauty_level", list2.toString());
    }
    
    @Override
    public final void LIZ(final boolean b) {
        if (b) {
            for (final Map.Entry<Object, V> entry : 1Jc.LIZ.entrySet()) {
                1Jc.LIZLLL.put(entry.getKey(), new a((a)entry.getValue()));
            }
            return;
        }
        final List<LiveEffect> liziz = 0fx.LIZ.LIZ().LIZIZ(0gZ.LIZLLL);
        n.LIZIZ((Object)liziz, "");
        final ArrayList list = new ArrayList();
        for (final LiveEffect next : liziz) {
            if (GTi.LIZ((CharSequence)next.getName())) {
                list.add(next);
            }
        }
        for (final LiveEffect liveEffect : list) {
            final a a = 1Jc.LIZ.get(liveEffect.effectId);
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
            Object value = null;
            final Object o = null;
            if (a == null && n != 0.0f) {
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
                Object value3 = o;
                if (smallItemConfig3 != null) {
                    value3 = smallItemConfig3.LJII;
                }
                final a a2 = new a(effectId, n, name, liveEffect, kotlin.jvm.internal.n.LIZ((Object)value2, value3));
                1Jc.LIZIZ.put(liveEffect.effectId, a2);
                1Jc.LJIIJ.put(liveEffect.effectId, a2);
            }
            else {
                final 44V ljjii = GST.LJJII;
                kotlin.jvm.internal.n.LIZIZ((Object)ljjii, "");
                if (kotlin.jvm.internal.n.LIZ(((44T)ljjii).LIZ(), (Object)true)) {
                    final String effectPanelKey = liveEffect.effectPanelKey;
                    if (effectPanelKey == null || !y.LIZIZ(effectPanelKey, "beauty", false) || 0iM.LJ(liveEffect) || a == null) {
                        continue;
                    }
                    1Jc.LIZLLL.put(liveEffect.effectId, a);
                }
                else {
                    if (a == null) {
                        continue;
                    }
                    if (n == 0.0f) {
                        1Jc.LIZLLL.put(liveEffect.effectId, a);
                    }
                    else if (n != a.LIZIZ) {
                        final long effectId2 = liveEffect.effectId;
                        final String name2 = liveEffect.getName();
                        final Gaz smallItemConfig4 = liveEffect.getSmallItemConfig();
                        Integer value4;
                        if (smallItemConfig4 != null) {
                            value4 = smallItemConfig4.LJI;
                        }
                        else {
                            value4 = null;
                        }
                        final Gaz smallItemConfig5 = liveEffect.getSmallItemConfig();
                        if (smallItemConfig5 != null) {
                            value = smallItemConfig5.LJII;
                        }
                        final a a3 = new a(effectId2, n, name2, liveEffect, kotlin.jvm.internal.n.LIZ((Object)value4, value));
                        1Jc.LIZJ.put(liveEffect.effectId, a3);
                        1Jc.LJIIJ.put(liveEffect.effectId, a3);
                    }
                    else {
                        1Jc.LJIIJ.put(liveEffect.effectId, a);
                    }
                }
            }
        }
        final Map<Long, a> liz = 1Jc.LIZ;
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final Map.Entry<Object, V> entry2 : liz.entrySet()) {
            if (1Jc.LJIIJ.containsKey(entry2.getKey()) ^ true) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        for (final Map.Entry<Object, V> entry3 : linkedHashMap.entrySet()) {
            1Jc.LIZLLL.put(entry3.getKey(), new a((a)entry3.getValue()));
        }
    }
    
    @Override
    public final void LIZIZ() {
        1Jc.LIZ.clear();
        1Jc.LJIIJ.clear();
        1Jc.LIZIZ.clear();
        1Jc.LIZJ.clear();
        1Jc.LIZLLL.clear();
        final Iterator<Map.Entry<Long, b>> iterator = 1Jc.LJIIJJI.entrySet().iterator();
        while (iterator.hasNext()) {
            0cf.LIZ().removeCallbacks((Runnable)((Map.Entry<K, Runnable>)iterator.next()).getValue());
        }
        1Jc.LJIIJJI.clear();
        1Jc.LJI.clear();
        1Jc.LJFF.clear();
    }
    
    @Override
    public final void LIZIZ(final DataChannel dataChannel) {
        for (final String s : 1Jc.LJFF) {
            if (y.LIZIZ(s, "beauty", false)) {
                final 44V ljjii = GST.LJJII;
                n.LIZIZ((Object)ljjii, "");
                if (n.LIZ(((44T)ljjii).LIZ(), (Object)true)) {
                    continue;
                }
            }
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_beauty_use");
            liz.LIZ(dataChannel);
            liz.LIZ("tab_name", s);
            String s2;
            if (1Jc.LJI.contains(s)) {
                s2 = "use";
            }
            else {
                s2 = "unused";
            }
            liz.LIZ("use_status", s2);
            liz.LIZLLL();
        }
    }
    
    @Override
    public final void LIZIZ(final DataChannel dataChannel, final boolean b) {
        if (GTi.LIZJ()) {
            return;
        }
        final 44V lllj = GST.LLLJ;
        n.LIZIZ((Object)lllj, "");
        if (GTi.LIZIZ((Boolean)((44T)lllj).LIZ())) {
            return;
        }
        final Handler liz = 0cf.LIZ();
        final Iterator<Map.Entry<Long, a>> iterator = 1Jc.LIZLLL.entrySet().iterator();
        while (iterator.hasNext()) {
            final b b2 = 1Jc.LJIIJJI.remove(((Map.Entry<Object, V>)iterator.next()).getKey());
            if (b2 != null) {
                liz.removeCallbacks((Runnable)b2);
            }
        }
        for (final Map.Entry<Object, V> entry : FJ3.LIZ((Map)1Jc.LIZIZ, (Map)1Jc.LIZJ).entrySet()) {
            final b b3 = 1Jc.LJIIJJI.remove(entry.getKey());
            if (b3 != null) {
                liz.removeCallbacks((Runnable)b3);
            }
            if (((a)entry.getValue()).LIZIZ != 0.0f) {
                final b b4 = new b(dataChannel, b, ((a)entry.getValue()).LIZLLL, ((a)entry.getValue()).LIZIZ, 1Jc.LJIIIZ.LIZJ());
                1Jc.LJIIJJI.put(entry.getKey(), b4);
                liz.postDelayed((Runnable)b4, 30000L);
            }
        }
    }
    
    public final boolean LIZJ() {
        final List<LiveEffect> liziz = 0fx.LIZ.LIZ().LIZIZ(0gZ.LIZLLL);
        n.LIZIZ((Object)liziz, "");
        final Iterator<Object> iterator = liziz.iterator();
        while (true) {
            Boolean value;
            LiveEffect next;
            do {
                final boolean hasNext = iterator.hasNext();
                final LiveEffect liveEffect = null;
                final Boolean b = null;
                if (!hasNext) {
                    final LiveEffect liveEffect2 = liveEffect;
                    if (liveEffect2 != null) {
                        final Gaz smallItemConfig = liveEffect2.getSmallItemConfig();
                        int lji;
                        if (smallItemConfig != null) {
                            lji = smallItemConfig.LJI;
                        }
                        else {
                            lji = 0;
                        }
                        if (LIK.LIZ(0g3.LIZ(liveEffect2, lji) * 100.0f) / 100.0f != 0.0f) {
                            return true;
                        }
                    }
                    return false;
                }
                next = iterator.next();
                final String effectPanelKey = next.effectPanelKey;
                value = b;
                if (effectPanelKey == null) {
                    continue;
                }
                value = y.LIZIZ(effectPanelKey, "makeup", false);
            } while (!GTi.LIZ(value));
            final LiveEffect liveEffect = next;
            continue;
        }
    }
    
    public static final class a
    {
        public final long LIZ;
        public final float LIZIZ;
        public final String LIZJ;
        public final LiveEffect LIZLLL;
        public final boolean LJ;
        public final long LJFF;
        
        static {
            Covode.recordClassIndex(6264);
        }
        
        public a(final long liz, final float liziz, final String lizj, final LiveEffect lizlll, final boolean lj, final long ljff) {
            CTM.LIZ((Object)lizlll);
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
            this.LJ = lj;
            this.LJFF = ljff;
        }
        
        public a(final a a) {
            CTM.LIZ((Object)a);
            this(a.LIZ, a.LIZIZ, a.LIZJ, a.LIZLLL, a.LJ);
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof a) {
                    final a a = (a)o;
                    if (this.LIZ == a.LIZ && Float.compare(this.LIZIZ, a.LIZIZ) == 0 && n.LIZ((Object)this.LIZJ, (Object)a.LIZJ) && n.LIZ((Object)this.LIZLLL, (Object)a.LIZLLL) && this.LJ == a.LJ && this.LJFF == a.LJFF) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final long liz = this.LIZ;
            final int n = (int)(liz ^ liz >>> 32);
            final int floatToIntBits = Float.floatToIntBits(this.LIZIZ);
            final String lizj = this.LIZJ;
            int hashCode = 0;
            int hashCode2;
            if (lizj != null) {
                hashCode2 = lizj.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final LiveEffect lizlll = this.LIZLLL;
            if (lizlll != null) {
                hashCode = lizlll.hashCode();
            }
            int lj;
            if ((lj = (this.LJ ? 1 : 0)) != 0) {
                lj = 1;
            }
            final long ljff = this.LJFF;
            return ((((n * 31 + floatToIntBits) * 31 + hashCode2) * 31 + hashCode) * 31 + lj) * 31 + (int)(ljff ^ ljff >>> 32);
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("BeautyLogBean(id=");
            sb.append(this.LIZ);
            sb.append(", value=");
            sb.append(this.LIZIZ);
            sb.append(", name=");
            sb.append(this.LIZJ);
            sb.append(", liveEffect=");
            sb.append(this.LIZLLL);
            sb.append(", isDefaultValue=");
            sb.append(this.LJ);
            sb.append(", startTime=");
            sb.append(this.LJFF);
            sb.append(")");
            return sb.toString();
        }
    }
    
    public static final class b implements Runnable
    {
        public final DataChannel LIZ;
        public final boolean LIZIZ;
        public final LiveEffect LIZJ;
        public final float LIZLLL;
        public final boolean LJ;
        
        static {
            Covode.recordClassIndex(6265);
        }
        
        public b(final DataChannel liz, final boolean liziz, final LiveEffect lizj, final float lizlll, final boolean lj) {
            CTM.LIZ((Object)lizj);
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
            this.LJ = lj;
        }
        
        @Override
        public final void run() {
            if (0iM.LJ(this.LIZJ)) {
                return;
            }
            final String effectPanelKey = this.LIZJ.effectPanelKey;
            if (effectPanelKey != null) {
                1Jc.LJI.add(effectPanelKey);
            }
            final 1Jc ljiiiz = 1Jc.LJIIIZ;
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_take_beauty_effective_use");
            liz.LIZ(this.LIZ);
            final Gaz smallItemConfig = this.LIZJ.getSmallItemConfig();
            Object value = null;
            Integer value2;
            if (smallItemConfig != null) {
                value2 = smallItemConfig.LJI;
            }
            else {
                value2 = null;
            }
            final Gaz smallItemConfig2 = this.LIZJ.getSmallItemConfig();
            if (smallItemConfig2 != null) {
                value = smallItemConfig2.LJII;
            }
            liz.LIZ("is_default_value", (int)(n.LIZ((Object)value2, value) ? 1 : 0));
            liz.LIZ("is_live_take_default", (int)(this.LIZIZ ? 1 : 0));
            liz.LIZ("beauty_value", Float.valueOf(this.LIZLLL));
            String s;
            if (this.LJ) {
                s = "makeup";
            }
            else {
                s = "normal";
            }
            liz.LIZ("beauty_status", s);
            ljiiiz.LIZ(liz, this.LIZJ);
            liz.LIZLLL();
        }
    }
}
