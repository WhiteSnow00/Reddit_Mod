// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.concurrent.TimeUnit;
import android.widget.ImageView;
import kotlin.jvm.internal.n;
import android.view.ViewGroup;
import android.view.View;
import android.view.LayoutInflater;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;

public final class 1kD extends 327
{
    public final ArrayList<ImageModel> LIZ;
    public final List<Integer> LJ;
    
    static {
        Covode.recordClassIndex(7380);
    }
    
    public 1kD(final Context context, final LayoutInflater layoutInflater) {
        CTM.LIZ((Object)context, (Object)layoutInflater);
        super(context, layoutInflater);
        this.LIZ = new ArrayList<ImageModel>();
        final ArrayList lj = new ArrayList();
        final Integer value = 2131234857;
        lj.add(value);
        lj.add(2131234855);
        lj.add(2131234854);
        lj.add(2131234856);
        lj.add(value);
        this.LJ = lj;
    }
    
    public final View LIZ(int intValue, final View view, final ViewGroup viewGroup) {
        Object o = view;
        if (!(view instanceof 0mT)) {
            o = null;
        }
        0mT 0mT;
        if ((0mT = (0mT)o) == null) {
            final Context lizlll = super.LIZLLL;
            n.LIZIZ((Object)lizlll, "");
            0mT = new 0mT(lizlll, (byte)0);
        }
        0mT.setTag((Object)intValue);
        if (this.LIZ.size() >= 10) {
            final ImageModel value = this.LIZ.get(Math.abs(intValue) % this.LIZ.size());
            n.LIZIZ((Object)value, "");
            final ImageModel imageModel = value;
            CTM.LIZ((Object)imageModel);
            HFv.LIZ((ImageView)0mT.getMUserAvatar(), imageModel, 0mT.getMUserAvatar().getWidth(), 0mT.getMUserAvatar().getHeight(), 2131234398);
        }
        else {
            intValue = this.LJ.get(Math.abs(intValue) % this.LJ.size()).intValue();
            0cm.LIZ((ImageView)0mT.getMUserAvatar(), intValue, 0mT.getMUserAvatar().getWidth(), 0mT.getMUserAvatar().getHeight());
        }
        return (View)0mT;
    }
    
    public final int LIZIZ() {
        return Integer.MAX_VALUE;
    }
    
    public static final class a implements f
    {
        public 0Gh LIZ;
        public final boolean LIZIZ;
        
        static {
            Covode.recordClassIndex(7381);
        }
        
        public a(final 0Gh liz, final boolean liziz) {
            CTM.LIZ((Object)liz);
            this.LIZ = liz;
            this.LIZIZ = liziz;
        }
        
        @Override
        public final void LIZ(final View view, final float n) {
            CTM.LIZ((Object)view);
            final 0do 0do = new 0do((byte)0);
            final View viewById = view.findViewById(2131367080);
            if (viewById != null) {
                Object tag;
                if (!((tag = view.getTag()) instanceof Integer)) {
                    tag = null;
                }
                final Integer n2 = (Integer)tag;
                if (n2 != null) {
                    final int intValue = n2.intValue();
                    if (intValue - this.LIZ.getCurrentItem() == 2) {
                        viewById.setPivotX(0.0f);
                    }
                    else if (this.LIZ.getCurrentItem() - intValue == 2) {
                        viewById.setPivotX((float)viewById.getWidth());
                    }
                    else {
                        viewById.setPivotX(viewById.getWidth() / 2.0f);
                    }
                }
                viewById.setPivotY(viewById.getHeight() / 2.0f);
                final float n3 = 0.7f * n;
                viewById.setScaleX(1.0f - 0do.getInterpolation(Math.abs(n3)));
                viewById.setScaleY(1.0f - 0do.getInterpolation(Math.abs(n3)));
                viewById.setAlpha(1.0f - Math.abs(n));
            }
            if (n == 0.0f) {
                Object o = view;
                if (!(view instanceof 0mT)) {
                    o = null;
                }
                final 0mT 0mT = (0mT)o;
                if (this.LIZIZ) {
                    if (0mT != null) {
                        0mT.LIZ();
                    }
                    return;
                }
                if (0mT != null) {
                    0mT.LIZ = FBH.LIZ(2300L, TimeUnit.MILLISECONDS).LIZ((FCD)new FC5()).LIZLLL((2d6)new 1Pe(0mT));
                }
            }
        }
    }
}
