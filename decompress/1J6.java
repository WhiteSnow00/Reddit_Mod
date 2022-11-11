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

public class 1J6 extends 037
{
    public 1ih LIZ;
    public 1ic LIZIZ;
    public 1ie LIZJ;
    
    static {
        Covode.recordClassIndex(6099);
    }
    
    public 1J6(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 1J6(final Context context, final AttributeSet set, final byte b) {
        super(context, set, 2130969231);
        (this.LIZIZ = new 1ic((View)this)).LIZ(set, 2130969231, 0);
        (this.LIZ = new 1ih((TextView)this)).LIZ(set, 2130969231, 0);
        (this.LIZJ = new 1ie((CompoundButton)this)).LIZ(set, 2130969231, 0);
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
