// 
// Decompiled by Procyon v0.6.0
// 

package androidx.emoji.widget;

import n4.d;
import android.text.InputFilter;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import n4.f;
import androidx.appcompat.widget.AppCompatTextView;

public class EmojiAppCompatTextView extends AppCompatTextView
{
    public f m;
    public boolean n;
    
    public EmojiAppCompatTextView(final Context context, final AttributeSet set) {
        super(context, set);
        if (!this.n) {
            this.n = true;
            this.getEmojiTextViewHelper().a.a();
        }
    }
    
    public EmojiAppCompatTextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        if (!this.n) {
            this.n = true;
            this.getEmojiTextViewHelper().a.a();
        }
    }
    
    private f getEmojiTextViewHelper() {
        if (this.m == null) {
            this.m = new f(this);
        }
        return this.m;
    }
    
    @Override
    public void setAllCaps(final boolean allCaps) {
        super.setAllCaps(allCaps);
        final f.a a = this.getEmojiTextViewHelper().a;
        if (allCaps) {
            a.a();
        }
        else {
            a.getClass();
        }
    }
    
    @Override
    public void setFilters(InputFilter[] filters) {
        final f.a a = this.getEmojiTextViewHelper().a;
        a.getClass();
        final int length = filters.length;
        while (true) {
            for (int i = 0; i < length; ++i) {
                if (filters[i] instanceof d) {
                    super.setFilters(filters);
                    return;
                }
            }
            final InputFilter[] array = new InputFilter[filters.length + 1];
            System.arraycopy(filters, 0, array, 0, length);
            array[length] = (InputFilter)a.b;
            filters = array;
            continue;
        }
    }
}
