// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import kotlin.jvm.internal.n;
import android.view.ViewGroup;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.animation.AnimatorSet;
import android.widget.FrameLayout;

public final class 0pn extends FrameLayout
{
    public 1si LIZ;
    public 1si LIZIZ;
    public AnimatorSet LIZJ;
    
    static {
        Covode.recordClassIndex(8223);
    }
    
    public 0pn(final Context context) {
        CTM.LIZ((Object)context);
        super(context, (AttributeSet)null, 0);
        MethodCollector.i(8755);
        FrameLayout.inflate(context, 2131561768, (ViewGroup)this);
        final View viewById = this.findViewById(2131362592);
        n.LIZIZ((Object)viewById, "");
        this.LIZ = (1si)viewById;
        final View viewById2 = this.findViewById(2131362598);
        n.LIZIZ((Object)viewById2, "");
        this.LIZIZ = (1si)viewById2;
        MethodCollector.o(8755);
    }
    
    public 0pn(final Context context, final byte b) {
        CTM.LIZ((Object)context);
        this(context);
    }
    
    public 0pn(final Context context, final char c) {
        CTM.LIZ((Object)context);
        this(context, (byte)0);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final AnimatorSet lizj = this.LIZJ;
        if (lizj != null && lizj.isRunning()) {
            final AnimatorSet lizj2 = this.LIZJ;
            if (lizj2 != null) {
                lizj2.end();
            }
        }
    }
}
