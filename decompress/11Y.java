// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import kotlin.jvm.internal.n;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import android.widget.FrameLayout;

public final class 11Y extends FrameLayout
{
    public HashMap LIZ;
    
    static {
        Covode.recordClassIndex(23349);
    }
    
    public 11Y(final Context context) {
        CTM.LIZ((Object)context);
        super(context, (AttributeSet)null, 0);
        MethodCollector.i(8717);
        0II.LIZ(LayoutInflater.from(this.getContext()), 2131562229, (ViewGroup)this, true);
        this.findViewById(2131367982);
        MethodCollector.o(8717);
    }
    
    public final 11Y LIZ(final int icon) {
        if (this.LIZIZ(2131367980) != null) {
            final 1It 1It = (1It)this.LIZIZ(2131367980);
            n.LIZIZ((Object)1It, "");
            1It.setVisibility(0);
            ((1It)this.LIZIZ(2131367980)).setIcon(icon);
        }
        else {
            final 1It 1It2 = (1It)this.LIZIZ(2131367980);
            n.LIZIZ((Object)1It2, "");
            1It2.setVisibility(8);
        }
        return this;
    }
    
    public final 11Y LIZ(final String text) {
        if (this.LIZIZ(2131367981) != null) {
            final 1ib 1ib = (1ib)this.LIZIZ(2131367981);
            n.LIZIZ((Object)1ib, "");
            1ib.setText((CharSequence)text);
        }
        return this;
    }
    
    public final 11Y LIZIZ(final String text) {
        final 1ib 1ib = (1ib)this.LIZIZ(2131367983);
        n.LIZIZ((Object)1ib, "");
        1ib.setText((CharSequence)text);
        final 1ib 1ib2 = (1ib)this.LIZIZ(2131367983);
        n.LIZIZ((Object)1ib2, "");
        1ib2.setVisibility(0);
        return this;
    }
    
    public final View LIZIZ(final int n) {
        if (this.LIZ == null) {
            this.LIZ = new HashMap();
        }
        View viewById;
        if ((viewById = this.LIZ.get(n)) == null) {
            viewById = ((View)this).findViewById(n);
            this.LIZ.put(n, viewById);
        }
        return viewById;
    }
}
