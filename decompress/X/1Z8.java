// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.ViewGroup;
import kotlin.jvm.internal.n;
import android.view.View;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import androidx.viewpager.widget.PagerAdapter;

public final class 1Z8 extends PagerAdapter implements T1t
{
    public final /* synthetic */ ArrayList LIZ;
    public final /* synthetic */ String[] LIZIZ;
    public final /* synthetic */ ArrayList LIZJ;
    
    static {
        Covode.recordClassIndex(9477);
    }
    
    public 1Z8(final ArrayList liz, final String[] liziz, final ArrayList lizj) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
    }
    
    public final View LIZ(final int n) {
        final View value = this.LIZJ.get(n);
        n.LIZIZ((Object)value, "");
        return value;
    }
    
    @Override
    public final Object LIZ(final ViewGroup viewGroup, final int n) {
        MethodCollector.i(9469);
        CTM.LIZ((Object)viewGroup);
        final View value = this.LIZ.get(n);
        n.LIZIZ((Object)value, "");
        final View view = value;
        viewGroup.addView(view);
        MethodCollector.o(9469);
        return view;
    }
    
    @Override
    public final void LIZ(final ViewGroup viewGroup, final int n, final Object o) {
        MethodCollector.i(9471);
        CTM.LIZ((Object)viewGroup, o);
        viewGroup.removeView((View)o);
        MethodCollector.o(9471);
    }
    
    @Override
    public final boolean LIZ(final View view, final Object o) {
        CTM.LIZ((Object)view, o);
        return view == o;
    }
    
    @Override
    public final int LIZIZ() {
        return this.LIZ.size();
    }
    
    @Override
    public final CharSequence LIZJ(final int n) {
        return this.LIZIZ[n];
    }
}
