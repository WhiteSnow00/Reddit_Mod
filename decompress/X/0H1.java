// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.ss.ugc.effectplatform.model.Effect;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.model.FilterModel;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.effect.filter.LiveFilterFragment;

public final class 0h1 implements Runnable
{
    public final /* synthetic */ LiveFilterFragment LIZ;
    public final /* synthetic */ H2n LIZIZ;
    
    static {
        Covode.recordClassIndex(6297);
    }
    
    public 0h1(final LiveFilterFragment liz, final H2n liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        final 1KJ liz = 1KJ.b.LIZ;
        if (liz.LIZ != null) {
            final Iterator<FilterModel> iterator = liz.LIZ.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().isNew) {
                    for (int size = this.LIZ.LIZ.size(), i = 0; i < size; ++i) {
                        if (this.LIZ.LIZ.get(i).isNew) {
                            ((RecyclerView)this.LIZIZ).LIZJ(i);
                            final 1KJ liz2 = 1KJ.b.LIZ;
                            if (liz2.LIZ != null) {
                                for (final LiveEffect liveEffect : liz2.LIZ) {
                                    if (liveEffect.getEffect() != null && liveEffect.isNew) {
                                        liveEffect.isNew = false;
                                        liz2.LIZ(((Effect)liveEffect.getEffect()).getId(), ((EffectTemplate)liveEffect.getEffect()).getTagsUpdatedAt());
                                    }
                                }
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
        final Object liz3 = ((44T)ljiizilj).LIZ();
        n.LIZIZ(liz3, "");
        ((RecyclerView)liziz).LIZJ(((Number)liz3).intValue());
    }
}
