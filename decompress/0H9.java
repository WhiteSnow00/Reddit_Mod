// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.Iterator;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.n;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.view.View$OnClickListener;

public final class 0h9 implements View$OnClickListener
{
    public final /* synthetic */ 1iq LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ 1iq.b LIZJ;
    
    static {
        Covode.recordClassIndex(6329);
    }
    
    public 0h9(final 1iq liz, final int liziz, final 1iq.b lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final void onClick(final View view) {
        if (this.LIZ.LIZJ != null) {
            final 1iq liz = this.LIZ;
            liz.LIZIZ(liz.LIZIZ);
            this.LIZ.LIZ(this.LIZIZ);
            this.LIZ.LIZIZ = this.LIZIZ;
            final 1iq liz2 = this.LIZ;
            final 1iq.b lizj = this.LIZJ;
            final int liziz = this.LIZIZ;
            Label_0092: {
                if (liz2.LIZ.size() > liziz && ((LiveEffect)liz2.LIZ.get(liziz)).getEffect() != null) {
                    if (lizj != null) {
                        lizj.LIZ();
                    }
                    ((LiveEffect)liz2.LIZ.get(liziz)).isNew = false;
                    final 1KD liz3 = 1KD.LJFF.LIZ();
                    final Effect effect = ((LiveEffect)liz2.LIZ.get(liziz)).getEffect();
                    final String s = null;
                    String id;
                    if (effect != null) {
                        id = ((com.ss.ugc.effectplatform.model.Effect)effect).getId();
                    }
                    else {
                        id = null;
                    }
                    if (!liz3.LIZ.isEmpty()) {
                        if (!TextUtils.isEmpty((CharSequence)id)) {
                            while (true) {
                                for (final LiveEffect next : liz3.LIZ) {
                                    final LiveEffect liveEffect = next;
                                    if (liveEffect.getEffect() != null) {
                                        final Effect effect2 = liveEffect.getEffect();
                                        String id2;
                                        if (effect2 != null) {
                                            id2 = ((com.ss.ugc.effectplatform.model.Effect)effect2).getId();
                                        }
                                        else {
                                            id2 = null;
                                        }
                                        if (!n.LIZ((Object)id2, (Object)id)) {
                                            continue;
                                        }
                                        final LiveEffect liveEffect2 = next;
                                        final LiveEffect liveEffect3 = liveEffect2;
                                        if (liveEffect3 != null) {
                                            liveEffect3.isNew = false;
                                            final Effect effect3 = liveEffect3.getEffect();
                                            String tagsUpdated = s;
                                            if (effect3 != null) {
                                                tagsUpdated = ((EffectTemplate)effect3).getTagsUpdatedAt();
                                            }
                                            liz3.LIZ(id, tagsUpdated);
                                        }
                                        break Label_0092;
                                    }
                                }
                                final LiveEffect liveEffect2 = null;
                                continue;
                            }
                        }
                    }
                }
            }
            this.LIZ.LIZJ.LIZ(this.LIZIZ);
        }
    }
}
