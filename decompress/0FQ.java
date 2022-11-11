// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import android.text.style.UpdateAppearance;
import java.util.List;

public final class 0fq
{
    public final List<UpdateAppearance> LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    
    static {
        Covode.recordClassIndex(6149);
    }
    
    public 0fq() {
        this.LIZ = new ArrayList<UpdateAppearance>();
    }
    
    public final 0fq LIZ() {
        this.LIZLLL = 33;
        return this;
    }
    
    public final 0fq LIZ(final int liziz) {
        this.LIZIZ = liziz;
        return this;
    }
    
    public final 0fq LIZ(final UpdateAppearance updateAppearance) {
        CTM.LIZ((Object)updateAppearance);
        if (updateAppearance instanceof ClickableSpan) {
            this.LIZ.add(0, updateAppearance);
        }
        else {
            this.LIZ.add(updateAppearance);
        }
        return this;
    }
    
    public final void LIZ(final SpannableStringBuilder spannableStringBuilder) {
        CTM.LIZ((Object)spannableStringBuilder);
        final Iterator<Object> iterator = this.LIZ.iterator();
        while (iterator.hasNext()) {
            spannableStringBuilder.setSpan(iterator.next(), this.LIZIZ, this.LIZJ, this.LIZLLL);
        }
    }
    
    public final 0fq LIZIZ(final int lizj) {
        this.LIZJ = lizj;
        return this;
    }
}
