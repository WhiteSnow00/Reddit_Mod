// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import androidx.appcompat.widget.AppCompatTextView;

public class 1ib extends AppCompatTextView
{
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public 09k LIZJ;
    public 0fZ LJ;
    public boolean LJFF;
    public 1ih LJI;
    
    static {
        Covode.recordClassIndex(6104);
        LIZ = 0dw.a.LIZ.LIZ();
        LIZIZ = 0dw.a.LIZ.LIZIZ;
    }
    
    public 1ib(final Context context) {
        super(context);
        this.LIZ(null, 0);
    }
    
    public 1ib(final Context context, final AttributeSet set) {
        super(context, set);
        this.LIZ(set, 0);
    }
    
    public 1ib(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.LIZ(set, n);
    }
    
    private 09k getEmojiTextViewHelper() {
        if (this.LIZJ == null) {
            this.LIZJ = new 09k(this);
        }
        return this.LIZJ;
    }
    
    private 0fZ getInputFilterHelper() {
        if (this.LJ == null) {
            this.LJ = new 0fZ((View)this);
        }
        return this.LJ;
    }
    
    private 1ih getTextStyleableHelper() {
        if (this.LJI == null) {
            this.LJI = new 1ih(this);
        }
        return this.LJI;
    }
    
    public final void LIZ(final int n) {
        this.getTextStyleableHelper().LIZIZ(n);
    }
    
    public void LIZ(final AttributeSet set, final int n) {
        if (!this.LJFF) {
            this.LJFF = true;
            this.getTextStyleableHelper().LIZ(set, n, 0);
            if (1ib.LIZ) {
                this.getEmojiTextViewHelper().LIZ.LIZ();
            }
        }
    }
    
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        if (1ib.LIZ) {
            this.getEmojiTextViewHelper().LIZ(allCaps);
        }
    }
    
    public void setFilters(final InputFilter[] array) {
        InputFilter[] filters = array;
        Label_0039: {
            if (1ib.LIZIZ) {
                final 0fZ inputFilterHelper = this.getInputFilterHelper();
                for (int length = array.length, i = 0; i < length; ++i) {
                    if (array[i] instanceof 0fg) {
                        filters = array;
                        break Label_0039;
                    }
                }
                final int length2 = array.length;
                filters = new InputFilter[array.length + 1];
                System.arraycopy(array, 0, filters, 0, length2);
                filters[length2] = (InputFilter)inputFilterHelper.LIZ;
            }
        }
        if (1ib.LIZ) {
            super.setFilters(this.getEmojiTextViewHelper().LIZ(filters));
            return;
        }
        super.setFilters(filters);
    }
    
    @Override
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        this.getTextStyleableHelper().LIZ(n);
    }
}
