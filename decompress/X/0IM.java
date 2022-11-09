// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.google.gson.m;
import com.google.gson.j;
import com.google.gson.o;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAudienceBeautyAbGroupSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorBeautyAbGroupSetting;
import java.util.Collection;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.n.y;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchExperimentSetting;
import com.bytedance.covode.number.Covode;

public final class 0iM
{
    static {
        Covode.recordClassIndex(6713);
    }
    
    public static final int LIZ() {
        if (!LiveBeautySwitchExperimentSetting.INSTANCE.hasNone()) {
            return -1;
        }
        final 44V lllj = GST.LLLJ;
        n.LIZIZ((Object)lllj, "");
        final Object liz = ((44T)lllj).LIZ();
        n.LIZIZ(liz, "");
        if (liz) {
            final 44V ljjii = GST.LJJII;
            n.LIZIZ((Object)ljjii, "");
            final Object liz2 = ((44T)ljjii).LIZ();
            n.LIZIZ(liz2, "");
            if (liz2) {
                return 0;
            }
            return 1;
        }
        else {
            if (LiveBeautySwitchExperimentSetting.INSTANCE.isUCAN()) {
                return 0;
            }
            return 1;
        }
    }
    
    public static final int LIZ(final String s, final List<? extends LiveEffect> list, final 1JQ 1jq, final String s2) {
        CTM.LIZ((Object)s2);
        1JQ liz = 1jq;
        if (1jq == null) {
            liz = 0fx.LIZ.LIZ();
        }
        final List<LiveEffect> liziz = liz.LIZIZ(s2);
        LiveEffect liveEffect2 = null;
        Label_0076: {
            if (liziz != null) {
                while (true) {
                    for (final LiveEffect next : liziz) {
                        if (n.LIZ((Object)next.effectPanelName, (Object)s)) {
                            final LiveEffect liveEffect = next;
                            liveEffect2 = liveEffect;
                            break Label_0076;
                        }
                    }
                    final LiveEffect liveEffect = null;
                    continue;
                }
            }
            liveEffect2 = null;
        }
        if (list != null) {
            final LiveEffect liveEffect3 = (LiveEffect)list.get(0);
            if (liveEffect3 != null) {
                final String effectPanelKey = liveEffect3.effectPanelKey;
                if (effectPanelKey != null && y.LIZIZ(effectPanelKey, "beauty", false)) {
                    final Integer value = LIZ();
                    if (value.intValue() >= 0 && value != null) {
                        return value.intValue();
                    }
                }
            }
            final Iterator<? extends LiveEffect> iterator2 = list.iterator();
            int n = 0;
            while (iterator2.hasNext()) {
                final String resourceId = ((LiveEffect)iterator2.next()).getResourceId();
                String resourceId2;
                if (liveEffect2 != null) {
                    resourceId2 = liveEffect2.getResourceId();
                }
                else {
                    resourceId2 = null;
                }
                if (kotlin.jvm.internal.n.LIZ((Object)resourceId, (Object)resourceId2) && GTi.LIZ(Boolean.valueOf(liveEffect2.isExclusive))) {
                    return RjR.LIZJ(n, 0);
                }
                ++n;
            }
            n = -1;
            return RjR.LIZJ(n, 0);
        }
        return 0;
    }
    
    public static final void LIZ(final List<? extends LiveEffect> list, final List<? extends LiveEffect> list2, final String effectPanelKey) {
        CTM.LIZ((Object)list, (Object)list2);
        if (!list2.isEmpty() && !list.isEmpty()) {
            final HashMap hashMap = new HashMap();
            for (final LiveEffect liveEffect : list2) {
                hashMap.put(String.valueOf(liveEffect.effectId), liveEffect);
            }
            for (final LiveEffect liveEffect2 : list) {
                if (0gY.LIZIZ(liveEffect2)) {
                    final ArrayList subStickers = new ArrayList();
                    int n = 0;
                    final Effect effect = liveEffect2.getEffect();
                    if (effect != null) {
                        final List children = ((com.ss.ugc.effectplatform.model.Effect)effect).getChildren();
                        if (children != null) {
                            final Iterator iterator3 = children.iterator();
                            while (iterator3.hasNext()) {
                                final LiveEffect liveEffect3 = (LiveEffect)hashMap.get(iterator3.next());
                                final int n2 = n + 1;
                                final String s = null;
                                n = n2;
                                if (liveEffect3 != null) {
                                    final Effect effect2 = liveEffect2.getEffect();
                                    String resourceId;
                                    if (effect2 != null) {
                                        resourceId = ((EffectTemplate)effect2).getResourceId();
                                    }
                                    else {
                                        resourceId = null;
                                    }
                                    liveEffect3.parentResId = resourceId;
                                    final Effect effect3 = liveEffect2.getEffect();
                                    String effectId;
                                    if (effect3 != null) {
                                        effectId = ((EffectTemplate)effect3).getEffectId();
                                    }
                                    else {
                                        effectId = null;
                                    }
                                    liveEffect3.parentEffectId = effectId;
                                    final Effect effect4 = liveEffect2.getEffect();
                                    String name = s;
                                    if (effect4 != null) {
                                        name = ((com.ss.ugc.effectplatform.model.Effect)effect4).getName();
                                    }
                                    liveEffect3.parentResName = name;
                                    liveEffect3.indexInParent = String.valueOf(n2);
                                    liveEffect3.effectPanelKey = effectPanelKey;
                                    subStickers.add(liveEffect3);
                                    n = n2;
                                }
                            }
                        }
                    }
                    if (!(subStickers.isEmpty() ^ true)) {
                        continue;
                    }
                    liveEffect2.subStickers = subStickers;
                }
            }
        }
    }
    
    public static final boolean LIZ(final LiveEffect liveEffect) {
        CTM.LIZ((Object)liveEffect);
        final Effect effect = liveEffect.getEffect();
        return effect != null && ((EffectTemplate)effect).getEffectType() == 1 && !5s7.LIZ((Collection)liveEffect.subStickers);
    }
    
    public static final boolean LIZ(LiveEffect liveEffect, final 1JQ 1jq) {
        CTM.LIZ((Object)liveEffect);
        1JQ liz;
        if (1jq == null) {
            liz = 0fx.LIZ.LIZ();
        }
        else {
            liz = 1jq;
        }
        final boolean liz2 = LIZ(liveEffect);
        final boolean b = true;
        if (liz2) {
            final List subStickers = liveEffect.subStickers;
            Boolean value;
            if (subStickers != null) {
                boolean b2 = false;
                Label_0117: {
                    if (subStickers instanceof Collection) {
                        b2 = b;
                        if (subStickers.isEmpty()) {
                            break Label_0117;
                        }
                    }
                    final Iterator iterator = subStickers.iterator();
                    while (true) {
                        b2 = b;
                        if (!iterator.hasNext()) {
                            break;
                        }
                        liveEffect = (LiveEffect)iterator.next();
                        if (liveEffect.isNone()) {
                            continue;
                        }
                        if (LIZ(liveEffect, 1jq)) {
                            continue;
                        }
                        b2 = false;
                        break;
                    }
                }
                value = b2;
            }
            else {
                value = null;
            }
            return GTi.LIZ(value);
        }
        if (liveEffect.composerConfigList.isEmpty()) {
            return liz.LIZJ(liveEffect.unzipPath, "") == -1;
        }
        final List composerConfigList = liveEffect.composerConfigList;
        if (!(composerConfigList instanceof Collection) || !composerConfigList.isEmpty()) {
            for (final Gaz gaz : composerConfigList) {
                final String unzipPath = liveEffect.unzipPath;
                String lizj;
                if ((lizj = gaz.LIZJ) == null) {
                    lizj = "";
                }
                if (liz.LIZJ(unzipPath, lizj) == -1) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static final boolean LIZ(LiveEffect liziz, final 1JQ 1jq, final String s) {
        if (liziz == null) {
            return false;
        }
        1JQ liz;
        if (1jq == null) {
            liz = 0fx.LIZ.LIZ();
        }
        else {
            liz = 1jq;
        }
        float n;
        if (LIZ(liziz)) {
            liziz = LIZIZ(liziz, liz, s);
            if (liziz != null) {
                n = LIZIZ(liziz, 1jq);
            }
            else {
                n = 0.0f;
            }
        }
        else {
            n = LIZIZ(liziz, liz);
        }
        return !Float.valueOf(n).equals(0.0f);
    }
    
    public static final boolean LIZ(final LiveEffect liveEffect, final LiveEffect liveEffect2) {
        CTM.LIZ((Object)liveEffect);
        final List subStickers = liveEffect.subStickers;
        if (subStickers != null) {
            if (subStickers instanceof Collection && subStickers.isEmpty()) {
                return false;
            }
            final Iterator iterator = subStickers.iterator();
            while (iterator.hasNext()) {
                final String resourceId = ((LiveEffect)iterator.next()).getResourceId();
                String resourceId2;
                if (liveEffect2 != null) {
                    resourceId2 = liveEffect2.getResourceId();
                }
                else {
                    resourceId2 = null;
                }
                if (n.LIZ((Object)resourceId, (Object)resourceId2)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static final boolean LIZ(final String s, boolean liziz) {
        int n;
        if (liziz) {
            n = LiveAnchorBeautyAbGroupSetting.INSTANCE.getValue();
        }
        else {
            n = LiveAudienceBeautyAbGroupSetting.INSTANCE.getValue();
        }
        try {
            final j liz = new o().LIZ(s);
            kotlin.jvm.internal.n.LIZIZ((Object)liz, "");
            final m ljiil = liz.LJIIL();
            liziz = ljiil.LIZIZ("ab_group");
            if (liziz) {
                try {
                    final j lizj = ljiil.LIZJ("ab_group");
                    kotlin.jvm.internal.n.LIZIZ((Object)lizj, "");
                    if (n != lizj.LJI()) {
                        return false;
                    }
                }
                finally {
                    if (liziz) {
                        if (!false) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        finally {}
        return true;
    }
    
    public static float LIZIZ(final LiveEffect liveEffect, final 1JQ 1jq) {
        CTM.LIZ((Object)liveEffect);
        1JQ liz = 1jq;
        if (1jq == null) {
            liz = 0fx.LIZ.LIZ();
        }
        final String resourceId = liveEffect.getResourceId();
        final Gaz smallItemConfig = liveEffect.getSmallItemConfig();
        String lizj;
        if (smallItemConfig == null || (lizj = smallItemConfig.LIZJ) == null) {
            lizj = "";
        }
        Float n;
        if ((n = liz.LIZIZ(resourceId, lizj)) == null) {
            final Gaz smallItemConfig2 = liveEffect.getSmallItemConfig();
            int ljii;
            if (smallItemConfig2 != null) {
                ljii = smallItemConfig2.LJII;
            }
            else {
                ljii = 0;
            }
            n = 0g3.LIZ(liveEffect, ljii);
        }
        return n;
    }
    
    public static final LiveEffect LIZIZ(LiveEffect liveEffect, final 1JQ 1jq, final String s) {
        CTM.LIZ((Object)liveEffect);
        if (!LIZ(liveEffect)) {
            return null;
        }
        1JQ liz;
        if ((liz = 1jq) == null) {
            liz = 0fx.LIZ.LIZ();
        }
        final List<LiveEffect> liziz = liz.LIZIZ(s);
        final List subStickers = liveEffect.subStickers;
        if (subStickers != null) {
        Label_0050:
            for (final LiveEffect liveEffect2 : subStickers) {
                n.LIZIZ((Object)liziz, "");
                while (true) {
                    for (final LiveEffect next : liziz) {
                        if (n.LIZ((Object)next.getResourceId(), (Object)liveEffect2.getResourceId())) {
                            liveEffect = next;
                            if (liveEffect != null) {
                                return liveEffect;
                            }
                            continue Label_0050;
                        }
                    }
                    LiveEffect next = null;
                    continue;
                }
            }
        }
        return null;
    }
    
    public static final boolean LIZIZ() {
        return LIZ() == 0;
    }
    
    public static final boolean LIZIZ(final LiveEffect liveEffect) {
        CTM.LIZ((Object)liveEffect);
        return LIZ(liveEffect, 0fx.LIZ.LIZ());
    }
    
    public static final boolean LIZJ(final LiveEffect liveEffect) {
        if (0gY.LIZIZ(liveEffect)) {
            if (liveEffect != null) {
                final List subStickers = liveEffect.subStickers;
                if (subStickers != null && !subStickers.isEmpty()) {
                    if (liveEffect != null) {
                        final List subStickers2 = liveEffect.subStickers;
                        if (subStickers2 != null) {
                            final Iterator iterator = subStickers2.iterator();
                            while (iterator.hasNext()) {
                                if (!1KZ.LIZIZ.LIZ((LiveEffect)iterator.next())) {
                                    return false;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    public static final boolean LIZLLL(final LiveEffect liveEffect) {
        if (liveEffect != null) {
            final Effect effect = liveEffect.getEffect();
            if (effect != null) {
                return 0hi.LIZ.LIZ(((com.ss.ugc.effectplatform.model.Effect)effect).getExtra(), "is_avatar", false) || 0hi.LIZ.LIZ(((EffectTemplate)effect).getSdkExtra(), "is_avatar", false);
            }
        }
        return false;
    }
    
    public static final boolean LJ(final LiveEffect liveEffect) {
        if (liveEffect != null) {
            final String name = liveEffect.getName();
            if (name != null && name.equals(0cB.LIZ(2131829159)) && liveEffect != null) {
                final String extra = liveEffect.extra;
                if (extra != null && extra.equals("first_none_in_beauty")) {
                    return true;
                }
            }
        }
        return false;
    }
}
