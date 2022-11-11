// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.LayoutInflater$Factory;
import android.content.res.TypedArray;
import android.view.View;
import android.view.View$OnClickListener;
import com.bytedance.android.ecommerce.ocr.view.OcrTitleView;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class 0V9 extends RelativeLayout
{
    public ImageView LIZ;
    public ImageView LIZIZ;
    
    static {
        Covode.recordClassIndex(4778);
    }
    
    public 0V9(final Context context, final AttributeSet set) {
        super(context, set);
        MethodCollector.i(4028);
        final View liz = LIZ(LayoutInflater.from(this.getContext()), (ViewGroup)this);
        this.LIZ = (ImageView)liz.findViewById(2131372969);
        this.LIZIZ = (ImageView)liz.findViewById(2131373269);
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, new int[] { 2130969084, 2130969215, 2130969216, 2130969569 });
            if (obtainStyledAttributes.getBoolean(1, true)) {
                final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId != 0) {
                    this.LIZ.setBackgroundResource(resourceId);
                }
            }
            if (obtainStyledAttributes.getBoolean(2, true)) {
                this.LIZIZ.setBackgroundResource(2131233138);
            }
            obtainStyledAttributes.recycle();
        }
        this.LIZ.setOnClickListener((View$OnClickListener)new OcrTitleView.OcrTitleView$1(this));
        MethodCollector.o(4028);
    }
    
    public static View LIZ(final LayoutInflater layoutInflater, final ViewGroup viewGroup) {
        MethodCollector.i(5792);
        if (NEN.LIZ(NEN.LIZ(), true, "tiktok_tux_text_view_opt", false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory((LayoutInflater$Factory)new SgJ());
            }
            catch (final Exception ex) {
                final View inflate = layoutInflater.inflate(2131561664, viewGroup);
                MethodCollector.o(5792);
                return inflate;
            }
        }
        final View inflate2 = layoutInflater.inflate(2131561664, viewGroup);
        MethodCollector.o(5792);
        return inflate2;
    }
    
    public void setFlashLightClickListener(final View$OnClickListener onClickListener) {
        final ImageView liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.setOnClickListener(onClickListener);
        }
    }
    
    public void setTorch(final boolean b) {
        final ImageView liziz = this.LIZIZ;
        int backgroundResource;
        if (b) {
            backgroundResource = 2131233139;
        }
        else {
            backgroundResource = 2131233138;
        }
        liziz.setBackgroundResource(backgroundResource);
    }
}
