// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import java.util.List;
import java.util.ArrayList;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Collection;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.filter.composerfilter.LiveComposerFilterFragment;

public final class 0h3 implements Runnable
{
    public final /* synthetic */ LiveComposerFilterFragment LIZ;
    public final /* synthetic */ H2n LIZIZ;
    
    static {
        Covode.recordClassIndex(6310);
    }
    
    public 0h3(final LiveComposerFilterFragment liz, final H2n liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        final List<LiveEffect> liz = 1KD.LJFF.LIZ().LIZ;
        if (!(liz instanceof Collection) || !liz.isEmpty()) {
            final Iterator<Object> iterator = liz.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().isNew) {
                    for (int size = this.LIZ.LIZJ.size(), i = 0; i < size; ++i) {
                        if (this.LIZ.LIZJ.get(i).isNew) {
                            ((RecyclerView)this.LIZIZ).LIZJ(i);
                            final 1KD liz2 = 1KD.LJFF.LIZ();
                            final List<LiveEffect> liz3 = liz2.LIZ;
                            final ArrayList list = new ArrayList();
                            for (final LiveEffect next : liz3) {
                                final LiveEffect liveEffect = next;
                                if (liveEffect.isNew && liveEffect.getEffect() != null) {
                                    list.add(next);
                                }
                            }
                            for (final LiveEffect liveEffect2 : list) {
                                liveEffect2.isNew = false;
                                final Effect effect = liveEffect2.getEffect();
                                String tagsUpdated = null;
                                String id;
                                if (effect != null) {
                                    id = ((com.ss.ugc.effectplatform.model.Effect)effect).getId();
                                }
                                else {
                                    id = null;
                                }
                                final Effect effect2 = liveEffect2.getEffect();
                                if (effect2 != null) {
                                    tagsUpdated = ((EffectTemplate)effect2).getTagsUpdatedAt();
                                }
                                liz2.LIZ(id, tagsUpdated);
                            }
                            return;
                        }
                    }
                    break;
                }
            }
        }
        final H2n liziz = this.LIZIZ;
        final 44V ljiizilj = GST.LJIIZILJ;
        n.LIZIZ((Object)ljiizilj, "");
        final Object liz4 = ((44T)ljiizilj).LIZ();
        n.LIZIZ(liz4, "");
        ((RecyclerView)liziz).LIZJ(((Number)liz4).intValue());
    }
}
