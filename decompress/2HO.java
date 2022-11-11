// 
// Decompiled by Procyon v0.6.0
// 

package X;

import webcast.data.MsgFilter;
import com.bytedance.android.live.base.model.user.User;
import android.text.SpannableStringBuilder;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;

public final class 2Ho extends 2He<EmoteChatMessage>
{
    public final List<a> LJIILLIIL;
    public final int LJIIZILJ;
    
    static {
        Covode.recordClassIndex(10836);
    }
    
    public 2Ho(final EmoteChatMessage emoteChatMessage) {
        CTM.LIZ((Object)emoteChatMessage);
        super((H31)emoteChatMessage);
        final ArrayList ljiilliil = new ArrayList();
        this.LJIILLIIL = ljiilliil;
        this.LJIIZILJ = 1;
        ljiilliil.clear();
        final List liz = emoteChatMessage.LIZ;
        if (liz != null) {
            final List ljii = Qsi.LJII((Iterable)liz);
            if (ljii != null) {
                final Iterator iterator = ljii.iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final Object next = iterator.next();
                    if (n < 0) {
                        Ey9.LIZ();
                    }
                    this.LJIILLIIL.add(new a(n, (EmoteModel)next, (byte)0));
                    ++n;
                }
            }
        }
    }
    
    @Override
    public final void LIZ(final a a) {
        CTM.LIZ((Object)a);
        final Drawable liz = a.LIZ;
        if (liz == null) {
            return;
        }
        if (((CharSequence)super.LJJII).length() == 0) {
            return;
        }
        super.LJJII.removeSpan((Object)a.LIZLLL);
        final int n = this.LJIIZILJ * a.LJ;
        final SpannableStringBuilder ljjii = super.LJJII;
        final 7wk lizlll = new 7wk(liz);
        lizlll.LIZ((float)2He.LJJIIZ);
        lizlll.LIZJ = 2He.LJJIIJZLJL;
        lizlll.LIZLLL = 2He.LJJIIJZLJL;
        ((7wj)lizlll).LIZ = 2He.LJJIIJZLJL;
        ((7wj)lizlll).LIZIZ = 2He.LJJIIJZLJL;
        ljjii.setSpan((Object)(a.LIZLLL = lizlll), n, n + 1, 33);
        super.LIZJ = null;
        this.t_().LIZ(this);
    }
    
    @Override
    public final User LIZIZ() {
        return ((EmoteChatMessage)super.LJIILIIL).LIZIZ;
    }
    
    @Override
    public final void LIZIZ(final 10r 10r) {
        CTM.LIZ((Object)10r);
        super.LIZIZ(10r);
    }
    
    @Override
    public final MsgFilter LIZJ() {
        return ((EmoteChatMessage)super.LJIILIIL).LIZJ;
    }
    
    @Override
    public final void LJJIIJZLJL() {
        super.LJJIIJZLJL();
        super.LJJII.clear();
    }
    
    @Override
    public final SpannableStringBuilder LJJIIZ() {
        return new SpannableStringBuilder();
    }
    
    @Override
    public final boolean LJJIIZI() {
        return true;
    }
    
    @Override
    public final List<a> LJJJJJL() {
        return this.LJIILLIIL;
    }
    
    @Override
    public final String LJJJJL() {
        return "";
    }
    
    @Override
    public final int LJJJJLI() {
        return ((EmoteChatMessage)super.LJIILIIL).LIZ.size();
    }
    
    @Override
    public final CharSequence p_() {
        return (CharSequence)super.LJJII;
    }
}
