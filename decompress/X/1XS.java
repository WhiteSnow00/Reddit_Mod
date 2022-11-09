// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import android.view.View;
import android.view.ViewGroup;

public class 1XS extends 0xS
{
    public ViewGroup LIZ;
    public View LIZIZ;
    public final String LIZJ;
    
    static {
        Covode.recordClassIndex(9039);
    }
    
    public 1XS(final String lizj) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
    }
    
    @Override
    public int LIZ() {
        return 2131562247;
    }
    
    @Override
    public void LIZ(ViewGroup liz) {
        final View view = null;
        ViewGroup liz2;
        if (liz != null) {
            liz2 = (ViewGroup)liz.findViewById(2131367799);
        }
        else {
            liz2 = null;
        }
        this.LIZ = liz2;
        View viewById = view;
        if (liz != null) {
            viewById = liz.findViewById(2131366795);
        }
        this.LIZIZ = viewById;
        liz = this.LIZ;
        if (liz != null) {
            GlD.LIZJ((View)liz);
        }
        final View liziz = this.LIZIZ;
        if (liziz != null) {
            GlD.LIZ(liziz);
        }
    }
    
    public void LIZIZ() {
        final ViewGroup liz = this.LIZ;
        if (liz != null) {
            GlD.LIZJ((View)liz);
        }
        final View liziz = this.LIZIZ;
        if (liziz != null) {
            GlD.LIZ(liziz);
        }
    }
    
    public void LIZJ() {
        final ViewGroup liz = this.LIZ;
        if (liz != null) {
            GlD.LIZ((View)liz);
        }
        final View liziz = this.LIZIZ;
        if (liziz != null) {
            GlD.LIZJ(liziz);
        }
    }
    
    @Override
    public String LIZLLL() {
        return this.LIZJ;
    }
}
