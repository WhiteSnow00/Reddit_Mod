// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 1J8 extends 04T
{
    public 1ih LIZ;
    public 1ic LIZIZ;
    public 1ie LIZJ;
    
    static {
        Covode.recordClassIndex(6101);
    }
    
    public 1J8(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 1J8(final Context context, final AttributeSet set, final byte b) {
        super(context, set, 2130970786);
        (this.LIZIZ = new 1ic((View)this)).LIZ(set, 2130970786, 0);
        (this.LIZ = new 1ih((TextView)this)).LIZ(set, 2130970786, 0);
        (this.LIZJ = new 1ie((CompoundButton)this)).LIZ(set, 2130970786, 0);
    }
    
    public final void LIZ(final int n) {
        final 1ic liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(n);
        }
        this.LIZJ.LIZ(n);
    }
    
    public void draw(final Canvas canvas) {
        final 1ic liziz = this.LIZIZ;
        if (liziz == null) {
            super.draw(canvas);
            return;
        }
        final boolean liz = liziz.LIZ(canvas);
        super.draw(canvas);
        this.LIZIZ.LIZ(canvas, liz);
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        this.LIZ.LIZ(n);
    }
}
