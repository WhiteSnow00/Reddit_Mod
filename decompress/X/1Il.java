// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectChannelResponseTemplate;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.text.TextUtils;
import java.util.Arrays;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.google.gson.m;
import java.util.Collection;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorBeautyAbGroupSetting;
import com.google.gson.o;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.List;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Map;

public class 1il implements 1JP
{
    public static volatile 1il LJIILJJIL;
    public 0gU LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public final Map<String, Map<String, LiveEffect>> LJ;
    public final Map<LiveEffect, Map<String, Float>> LJFF;
    public final List<LiveEffect> LJI;
    public final List<0g7> LJII;
    public final List<0g6> LJIIIIZZ;
    public final Map<String, List<String>> LJIIIZ;
    public final Map<String, List<String>> LJIIJ;
    public final Map<String, Map<String, Float>> LJIIJJI;
    public final Map<String, Map<String, Float>> LJIIL;
    public final Map<String, Integer> LJIILIIL;
    
    static {
        Covode.recordClassIndex(6157);
    }
    
    public 1il() {
        this.LJFF = new HashMap<LiveEffect, Map<String, Float>>();
        this.LJIIJJI = new HashMap<String, Map<String, Float>>();
        this.LJII = new ArrayList<0g7>();
        this.LJIIJ = (Map)((44T)GST.LJJIJIL).LIZ();
        this.LJIIL = (Map)((44T)GST.LJJIJL).LIZ();
        this.LJIIIZ = new HashMap<String, List<String>>();
        this.LJ = new HashMap<String, Map<String, LiveEffect>>();
        this.LJI = new ArrayList<LiveEffect>();
        this.LJIIIIZZ = new ArrayList<0g6>();
        this.LJIILIIL = new HashMap<String, Integer>();
    }
    
    private void LIZ(final LiveEffect liveEffect, final String s, final float n) {
        if (this.LIZ == null) {
            return;
        }
        if (!Fhk.LIZ((List)liveEffect.updateKeys) && liveEffect.updateKeys.contains(s)) {
            this.LIZ.LIZJ.LIZ(liveEffect.unzipPath, s, n);
            final StringBuilder sb = new StringBuilder("updateTagValue path:");
            sb.append(liveEffect.unzipPath);
            sb.append(" tag:");
            sb.append(s);
            sb.append(" value:");
            sb.append(n);
            0ba.LIZ(3, "LiveComposerManager", sb.toString());
            final LiveEffect liveEffect2 = null;
            while (true) {
                for (final LiveEffect liveEffect3 : this.LJFF.keySet()) {
                    if (liveEffect3.unzipPath.equals(liveEffect.unzipPath) && liveEffect3.updateKeys.contains(s)) {
                        final LiveEffect liveEffect4 = liveEffect3;
                        final Map map = this.LJFF.get(liveEffect4);
                        LiveEffect liveEffect5 = liveEffect4;
                        if (map != null) {
                            map.put(s, n);
                            liveEffect5 = liveEffect4;
                        }
                        while (true) {
                            for (final String s2 : this.LJ.keySet()) {
                                final Map map2 = this.LJ.get(s2);
                                LiveEffect liveEffect6;
                                if (liveEffect5 != null) {
                                    liveEffect6 = liveEffect5;
                                }
                                else {
                                    liveEffect6 = liveEffect;
                                }
                                if (map2.containsValue(liveEffect6)) {
                                    final String s3 = s2;
                                    this.LIZ(s3, liveEffect, s, n);
                                    if (!this.LJIIIIZZ.isEmpty()) {
                                        for (0g6 0g6 : this.LJIIIIZZ) {}
                                    }
                                    return;
                                }
                            }
                            final String s3 = "";
                            continue;
                        }
                    }
                }
                this.LJFF.put(liveEffect, new HashMap<String, Float>());
                final Map map3 = this.LJFF.get(liveEffect);
                LiveEffect liveEffect5 = liveEffect2;
                if (map3 != null) {
                    map3.put(s, n);
                    liveEffect5 = liveEffect2;
                }
                continue;
            }
        }
    }
    
    private void LIZ(final Effect effect, final String s, final List<String> list) {
        if (effect == null) {
            return;
        }
        if (!list.contains(((com.ss.ugc.effectplatform.model.Effect)effect).getUnzipPath())) {
            return;
        }
        try {
            final m ljiil = new o().LIZ(((com.ss.ugc.effectplatform.model.Effect)effect).getExtra()).LJIIL();
            if (ljiil.LIZIZ("ab_group") && LiveAnchorBeautyAbGroupSetting.INSTANCE.getValue() != ljiil.LIZJ("ab_group").LJI()) {
                return;
            }
        }
        catch (final Exception ex) {
            0ba.LIZ("LiveComposerManager", ex);
        }
        if (this.LJIIL.containsKey(((com.ss.ugc.effectplatform.model.Effect)effect).getUnzipPath())) {
            final LiveEffect liz = 0iO.LIZ(effect);
            final Map map = this.LJIIL.get(((com.ss.ugc.effectplatform.model.Effect)effect).getUnzipPath());
            liz.updateKeys.addAll(map.keySet());
            this.LIZ(s, liz);
            for (final Object next : map.keySet()) {
                if (!this.LJIIJJI.containsKey(((com.ss.ugc.effectplatform.model.Effect)effect).getUnzipPath()) || !this.LJIIJJI.get(((com.ss.ugc.effectplatform.model.Effect)effect).getUnzipPath()).containsKey(next)) {
                    final String extra = ((com.ss.ugc.effectplatform.model.Effect)effect).getExtra();
                    final String s2 = (String)next;
                    if (!extra.contains(s2)) {
                        continue;
                    }
                    liz.updateKeys.add(s2);
                    final Object value = map.get(next);
                    Float value2;
                    if (value instanceof Double) {
                        value2 = ((Double)value).floatValue();
                    }
                    else {
                        value2 = (Float)value;
                    }
                    this.LIZ(s2, value2);
                }
            }
            return;
        }
        this.LIZ(s, 0iO.LIZ(effect));
    }
    
    private void LIZ(final String s, final LiveEffect liveEffect, final String s2, final float n) {
        if (this.LJIIIZ.containsKey(s) && this.LJIIIZ.get(s).contains(liveEffect.unzipPath)) {
            if (!this.LJIIJJI.containsKey(liveEffect.unzipPath)) {
                this.LJIIJJI.put(liveEffect.unzipPath, new HashMap<String, Float>());
            }
            this.LJIIJJI.get(liveEffect.unzipPath).put(s2, n);
        }
    }
    
    private void LIZ(final boolean b) {
        if (this.LIZ == null) {
            return;
        }
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final Iterator<0g4> iterator = this.LIZ.LIZ.iterator();
        final int n = 0;
        boolean b2 = false;
        while (iterator.hasNext()) {
            final 0g4 0g4 = iterator.next();
            if (this.LIZ(list2, 0g4) || (this.LJ.containsKey(0g4.LIZIZ) && this.LIZ(list2, 0g4.LIZ))) {
                if (list2.isEmpty()) {
                    list2.addAll(0g4.LIZ);
                }
                else {
                    list2.retainAll(0g4.LIZ);
                }
                if (this.LIZ.LIZLLL.contains(0g4.LIZIZ)) {
                    b2 = true;
                }
                list.addAll(this.LJ.get(0g4.LIZIZ).values());
            }
        }
        if (!b && this.LJI.containsAll(list) && list.containsAll(this.LJI)) {
            return;
        }
        this.LJI.clear();
        this.LJI.addAll(list);
        if (this.LIZIZ) {
            this.LIZ.LIZJ.LIZ(0jR.LIZ(IBroadcastService.class).getLiveComposerFilePath(), b2);
            final StringBuilder sb = new StringBuilder("show sticker: ");
            sb.append(0jR.LIZ(IBroadcastService.class).getLiveComposerFilePath());
            0ba.LIZ(3, "LiveComposerManager", sb.toString());
            this.LIZIZ = false;
        }
        this.LIZ.LIZJ.LIZ(b2);
        final String[] liz = 0iL.LIZ(list, this.LJFF);
        final String[] liz2 = 0iL.LIZ(list, liz);
        final Iterator iterator2 = list.iterator();
        while (true) {
            LiveEffect liveEffect;
            do {
                final int n2 = n;
                if (iterator2.hasNext()) {
                    liveEffect = (LiveEffect)iterator2.next();
                }
                else {
                    if (n2 != 0) {
                        this.LIZ.LIZJ.LIZIZ(liz, liz2);
                        final StringBuilder sb2 = new StringBuilder("show sticker composer: ");
                        sb2.append(Arrays.toString(liz));
                        sb2.append(" extra:");
                        sb2.append(Arrays.toString(liz2));
                        0ba.LIZ(3, "LiveComposerManager", sb2.toString());
                        return;
                    }
                    this.LIZ.LIZJ.LIZ(liz, liz2);
                    final StringBuilder sb3 = new StringBuilder("show sticker composer: ");
                    sb3.append(Arrays.toString(liz));
                    sb3.append(" extra:");
                    sb3.append(Arrays.toString(liz2));
                    0ba.LIZ(3, "LiveComposerManager", sb3.toString());
                    return;
                }
            } while (liveEffect.sdkExtraModel == null || liveEffect.sdkExtraModel.LIZIZ == null || !liveEffect.sdkExtraModel.LIZIZ.getUseOutput());
            final int n2 = 1;
            continue;
        }
    }
    
    private boolean LIZ(final List<Integer> list, final 0g4 0g4) {
        if (TextUtils.equals((CharSequence)0g4.LIZIZ, (CharSequence)0gZ.LIZIZ) && this.LJ.containsKey(0g4.LIZIZ) && this.LJ.get(0g4.LIZIZ).entrySet().size() > 0) {
            final LiveEffect liveEffect = ((Map.Entry)this.LJ.get(0g4.LIZIZ).entrySet().iterator().next()).getValue();
            final ArrayList list2 = new ArrayList();
            if (liveEffect.coexistGroup.isEmpty()) {
                list2.addAll(0g4.LIZ);
            }
            else {
                list2.addAll(liveEffect.coexistGroup);
            }
            return this.LIZ(list, list2);
        }
        return false;
    }
    
    private boolean LIZ(final List<Integer> list, final List<Integer> list2) {
        if (list.isEmpty()) {
            return true;
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (list2.contains(iterator.next())) {
                return true;
            }
        }
        return false;
    }
    
    private void LIZIZ(final String s, final LiveEffect liveEffect) {
        if (this.LIZ != null && liveEffect != null) {
            if (!this.LJIIIZ.containsKey(s)) {
                this.LJIIIZ.put(s, new ArrayList<String>());
            }
            if (this.LJIIIZ.get(s).contains(liveEffect.unzipPath)) {
                return;
            }
            if (!5ow.LIZ(liveEffect.unzipPath) && this.LIZ.LIZIZ.contains(s)) {
                this.LJIIIZ.get(s).add(liveEffect.unzipPath);
            }
        }
    }
    
    private void LIZJ(final String s, final LiveEffect liveEffect) {
        if (!this.LJIIIZ.containsKey(s)) {
            return;
        }
        if (liveEffect != null && !5ow.LIZ(liveEffect.unzipPath)) {
            this.LJIIIZ.get(s).remove(liveEffect.unzipPath);
        }
    }
    
    public static 1il LJFF() {
        MethodCollector.i(1744);
        if (1il.LJIILJJIL == null) {
            monitorenter(1il.class);
            try {
                if (1il.LJIILJJIL == null) {
                    1il.LJIILJJIL = new 1il();
                }
                monitorexit(1il.class);
            }
            finally {
                monitorexit(1il.class);
                MethodCollector.o(1744);
            }
        }
        final 1il ljiiljjil = 1il.LJIILJJIL;
        MethodCollector.o(1744);
        return ljiiljjil;
    }
    
    private void LJI() {
        this.LIZ(false);
    }
    
    @Override
    public final Map<String, Map<String, LiveEffect>> LIZ() {
        return this.LJ;
    }
    
    @Override
    public final void LIZ(final 0g6 0g6) {
        if (0g6 == null) {
            return;
        }
        if (!this.LJIIIIZZ.contains(0g6)) {
            this.LJIIIIZZ.add(0g6);
        }
    }
    
    @Override
    public final void LIZ(final 0g7 0g7) {
        if (0g7 == null) {
            return;
        }
        if (!this.LJII.contains(0g7)) {
            this.LJII.add(0g7);
        }
    }
    
    @Override
    public final void LIZ(final 0gU liz) {
        this.LIZ = liz;
        this.LIZIZ = true;
    }
    
    @Override
    public final void LIZ(final EffectChannelResponse effectChannelResponse) {
        if (this.LIZ == null) {
            return;
        }
        final String panel = ((com.ss.ugc.effectplatform.model.EffectChannelResponse)effectChannelResponse).getPanel();
        if (!this.LIZ.LIZIZ.contains(panel)) {
            return;
        }
        final Map<String, List<String>> ljiij = this.LJIIJ;
        if (ljiij != null && !ljiij.isEmpty()) {
            if (!this.LJIIJ.containsKey(panel)) {
                return;
            }
            final List list = this.LJIIJ.get(panel);
            for (final Effect effect : ((EffectChannelResponseTemplate)effectChannelResponse).getAllCategoryEffects()) {
                if (effect != null) {
                    final int effectType = ((EffectTemplate)effect).getEffectType();
                    int i = 0;
                    if (effectType == 1 && !5s7.LIZ((Collection)effect.getChildEffects())) {
                        while (i < effect.getChildEffects().size()) {
                            final Effect effect2 = effect.getChildEffects().get(i);
                            if (list != null && effect2 != null && list.contains(((com.ss.ugc.effectplatform.model.Effect)effect2).getUnzipPath())) {
                                this.LJIILIIL.put(((EffectTemplate)effect).getEffectId(), i);
                            }
                            this.LIZ(effect2, panel, list);
                            ++i;
                        }
                    }
                    else {
                        this.LIZ(effect, panel, list);
                    }
                }
            }
            this.LJIIJ.remove(panel);
        }
    }
    
    @Override
    public final void LIZ(final String s) {
        if (this.LJ.containsKey(s) && this.LJ.get(s).size() > 0) {
            final Iterator iterator = this.LJ.get(s).values().iterator();
            while (iterator.hasNext()) {
                this.LIZJ(s, (LiveEffect)iterator.next());
            }
            this.LJ.remove(s);
            this.LIZ(false);
            final Iterator<0g7> iterator2 = this.LJII.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().LIZ(false, s, null);
            }
        }
    }
    
    @Override
    public final void LIZ(final String s, final float n) {
        if (this.LIZ == null) {
            return;
        }
    Label_0517:
        for (final LiveEffect liveEffect : this.LJI) {
            if (!Fhk.LIZ((List)liveEffect.updateKeys) && liveEffect.updateKeys.contains(s)) {
                if (this.LJFF.containsKey(liveEffect) && this.LJFF.get(liveEffect).containsKey(s) && ((Float)this.LJFF.get(liveEffect).get(s)).equals(n)) {
                    return;
                }
                this.LIZ.LIZJ.LIZ(liveEffect.unzipPath, s, n);
                final StringBuilder sb = new StringBuilder("updateTagValue path:");
                sb.append(liveEffect.unzipPath);
                sb.append(" tag:");
                sb.append(s);
                sb.append(" value:");
                sb.append(n);
                0ba.LIZ(3, "LiveComposerManager", sb.toString());
                final LiveEffect liveEffect2 = null;
                while (true) {
                    for (final LiveEffect liveEffect3 : this.LJFF.keySet()) {
                        if (liveEffect3.unzipPath.equals(liveEffect.unzipPath) && liveEffect3.updateKeys.contains(s)) {
                            final LiveEffect liveEffect4 = liveEffect3;
                            final Map map = this.LJFF.get(liveEffect4);
                            LiveEffect liveEffect5 = liveEffect4;
                            if (map != null) {
                                map.put(s, n);
                                liveEffect5 = liveEffect4;
                            }
                            while (true) {
                                for (final String s2 : this.LJ.keySet()) {
                                    final Map map2 = this.LJ.get(s2);
                                    LiveEffect liveEffect6;
                                    if (liveEffect5 != null) {
                                        liveEffect6 = liveEffect5;
                                    }
                                    else {
                                        liveEffect6 = liveEffect;
                                    }
                                    if (map2.containsValue(liveEffect6)) {
                                        final String s3 = s2;
                                        this.LIZ(s3, liveEffect, s, n);
                                        if (!this.LJIIIIZZ.isEmpty()) {
                                            for (0g6 0g6 : this.LJIIIIZZ) {}
                                            break Label_0517;
                                        }
                                        break Label_0517;
                                    }
                                }
                                final String s3 = "";
                                continue;
                            }
                        }
                    }
                    this.LJFF.put(liveEffect, new HashMap<String, Float>());
                    final Map map3 = this.LJFF.get(liveEffect);
                    LiveEffect liveEffect5 = liveEffect2;
                    if (map3 != null) {
                        map3.put(s, n);
                        liveEffect5 = liveEffect2;
                    }
                    continue;
                }
            }
        }
    }
    
    @Override
    public final void LIZ(final String s, final LiveEffect liveEffect) {
        if (liveEffect != null && this.LIZ != null) {
            if (!this.LJ.containsKey(s)) {
                this.LJ.put(s, new HashMap<String, LiveEffect>());
            }
            final Map map = this.LJ.get(s);
            if (map.containsKey(liveEffect.unzipPath)) {
                ((LiveEffect)map.get(liveEffect.unzipPath)).updateKeys.addAll(liveEffect.updateKeys);
                return;
            }
            map.put(liveEffect.unzipPath, liveEffect);
            if (this.LIZ.LIZIZ.contains(s)) {
                this.LIZIZ(s, liveEffect);
            }
            this.LJI();
            final Iterator<0g7> iterator = this.LJII.iterator();
            while (iterator.hasNext()) {
                iterator.next().LIZ(true, s, liveEffect);
            }
        }
    }
    
    @Override
    public final void LIZ(final String s, final LiveEffect liveEffect, final LiveEffect liveEffect2) {
        if (this.LIZ == null) {
            return;
        }
        if (liveEffect != null && this.LJ.containsKey(s) && this.LJ.get(s).size() > 0) {
            this.LJ.get(s).remove(liveEffect.unzipPath);
            if (this.LIZ.LIZIZ.contains(s)) {
                this.LIZJ(s, liveEffect);
            }
            final Iterator<0g7> iterator = this.LJII.iterator();
            while (iterator.hasNext()) {
                iterator.next().LIZ(false, s, liveEffect);
            }
        }
        if (liveEffect2 != null) {
            if (!this.LJ.containsKey(s)) {
                this.LJ.put(s, new HashMap<String, LiveEffect>());
            }
            final Map map = this.LJ.get(s);
            if (map.containsKey(liveEffect2.unzipPath)) {
                ((LiveEffect)map.get(liveEffect2.unzipPath)).updateKeys.addAll(liveEffect2.updateKeys);
                return;
            }
            map.put(liveEffect2.unzipPath, liveEffect2);
            if (this.LIZ.LIZIZ.contains(s)) {
                this.LIZIZ(s, liveEffect2);
            }
            final Iterator<0g7> iterator2 = this.LJII.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().LIZ(true, s, liveEffect2);
            }
        }
        else if (liveEffect == null) {
            return;
        }
        this.LJI();
    }
    
    @Override
    public final void LIZ(final String s, final String s2) {
    }
    
    @Override
    public final List<LiveEffect> LIZIZ(final String s) {
        if (this.LJ.containsKey(s)) {
            return new ArrayList<LiveEffect>(this.LJ.get(s).values());
        }
        return new ArrayList<LiveEffect>();
    }
    
    @Override
    public final void LIZIZ() {
        if (!this.LJIIJ.isEmpty()) {
            this.LJIIIZ.putAll(this.LJIIJ);
        }
        this.LIZIZ = true;
        ((44T)GST.LJJIJIL).LIZ((Object)this.LJIIIZ);
        ((44T)GST.LJJIJL).LIZ((Object)this.LJIIJJI);
        final 0gU liz = this.LIZ;
        if (liz != null && liz.LIZJ != null) {
            try {
                this.LIZ.LIZJ.LIZ(new String[0]);
                this.LIZ.LIZJ.LIZ();
            }
            finally {
                final Throwable t;
                0ba.LIZ("LiveComposerManager", t);
            }
        }
        this.LJIIJ.clear();
        this.LJIIJ.putAll(this.LJIIIZ);
        this.LJIIL.clear();
        this.LJIIL.putAll(this.LJIIJJI);
        this.LJ.clear();
        this.LJII.clear();
        this.LJIIIIZZ.clear();
        this.LJIIIZ.clear();
        this.LJI.clear();
        this.LJFF.clear();
        this.LJIIJJI.clear();
        this.LIZ = null;
    }
    
    @Override
    public final void LIZIZ(final 0g6 0g6) {
        if (0g6 == null) {
            return;
        }
        this.LJIIIIZZ.remove(0g6);
    }
    
    @Override
    public final void LIZIZ(final 0g7 0g7) {
        if (0g7 == null) {
            return;
        }
        this.LJII.remove(0g7);
    }
    
    @Override
    public final void LIZJ() {
        this.LIZ(true);
        for (final Map map : new HashMap(this.LJFF).values()) {
            if (map != null && map.size() != 0) {
                for (final String s : map.keySet()) {
                    if (map.get(s) != null) {
                        final float floatValue = (float)map.get(s);
                        for (final LiveEffect liveEffect : this.LJI) {
                            if (!Fhk.LIZ((List)liveEffect.updateKeys) && liveEffect.updateKeys.contains(s)) {
                                this.LIZ(liveEffect, s, floatValue);
                            }
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public final void LIZJ(final String lizj) {
        this.LIZJ = lizj;
    }
    
    @Override
    public final String LIZLLL() {
        return this.LIZJ;
    }
    
    @Override
    public final void LIZLLL(final String lizlll) {
        this.LIZLLL = lizlll;
    }
    
    @Override
    public final String LJ() {
        return this.LIZLLL;
    }
}
