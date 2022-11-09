// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.Spannable;
import android.graphics.Bitmap;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.covode.number.Covode;

public abstract class 2Gk<MESSAGE extends H31> extends 2AW
{
    public MESSAGE LJIILIIL;
    
    static {
        Covode.recordClassIndex(10721);
    }
    
    public 2Gk(final MESSAGE ljiiliil) {
        CTM.LIZ((Object)ljiiliil);
        super(ljiiliil.getMessageId());
        this.LJIILIIL = ljiiliil;
    }
    
    @Override
    public Text n_() {
        final CommonMessageData baseMessage = ((HDi)this.LJIILIIL).baseMessage;
        if (baseMessage != null) {
            return baseMessage.LJIIIZ;
        }
        return null;
    }
    
    @Override
    public boolean o_() {
        return this.LJIILIIL.supportDisplayText();
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(10722);
        }
        
        void LIZ(final Bitmap p0, final 2Gk<? extends H31> p1);
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(10723);
        }
        
        void LIZ(final Spannable p0);
    }
}
