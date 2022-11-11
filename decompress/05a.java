// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.ViewGroup$LayoutParams;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import java.util.Arrays;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import android.view.View;

public abstract class 05a extends View
{
    public int mCount;
    public 13n mHelperWidget;
    public int[] mIds;
    public String mReferenceIds;
    public boolean mUseViewMeasure;
    public Context myContext;
    
    static {
        Covode.recordClassIndex(639);
    }
    
    public 05a(final Context myContext) {
        super(myContext);
        this.mIds = new int[32];
        this.myContext = myContext;
        this.init(null);
    }
    
    public 05a(final Context myContext, final AttributeSet set) {
        super(myContext, set);
        this.mIds = new int[32];
        this.myContext = myContext;
        this.init(set);
    }
    
    public 05a(final Context myContext, final AttributeSet set, final int n) {
        super(myContext, set, n);
        this.mIds = new int[32];
        this.myContext = myContext;
        this.init(set);
    }
    
    private void addID(final String s) {
        if (s == null) {
            return;
        }
        if (this.myContext == null) {
            return;
        }
        final String trim = s.trim();
        int n = 0;
        Label_0123: {
            try {
                if ((n = R.id.class.getField(trim).getInt(null)) != 0) {
                    break Label_0123;
                }
            }
            catch (final Exception ex) {}
            if ((n = this.myContext.getResources().getIdentifier(trim, "id", this.myContext.getPackageName())) == 0) {
                if (!this.isInEditMode() || !(this.getParent() instanceof ConstraintLayout)) {
                    return;
                }
                final Object designInformation = ((ConstraintLayout)this.getParent()).getDesignInformation(0, trim);
                if (designInformation == null || !(designInformation instanceof Integer)) {
                    return;
                }
                n = (int)designInformation;
                if (n == 0) {
                    return;
                }
            }
        }
        this.setTag(n, null);
    }
    
    private void setIds(final String s) {
        if (s == null) {
            return;
        }
        int n = 0;
        while (true) {
            final int index = s.indexOf(44, n);
            if (index == -1) {
                break;
            }
            this.addID(s.substring(n, index));
            n = index + 1;
        }
        this.addID(s.substring(n));
    }
    
    public int[] getReferencedIds() {
        return Arrays.copyOf(this.mIds, this.mCount);
    }
    
    public void init(final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, new int[] { 16842948, 16843039, 16843040, 16843071, 16843072, 2130969098, 2130969099, 2130969229, 2130969379, 2130969380, 2130969795, 2130969796, 2130969797, 2130969798, 2130969799, 2130969800, 2130969801, 2130969802, 2130969803, 2130969804, 2130969805, 2130969806, 2130969807, 2130969808, 2130969809, 2130969810, 2130969811, 2130969812, 2130969813, 2130969814, 2130969815, 2130969816, 2130969817, 2130969818, 2130969819, 2130969820, 2130969821, 2130969822, 2130969823, 2130969824, 2130969825, 2130969826, 2130969827, 2130969828, 2130969829, 2130969830, 2130969831, 2130969832, 2130969833, 2130969834, 2130969835, 2130969837, 2130969838, 2130969842, 2130969843, 2130969844, 2130969845, 2130969846, 2130969847, 2130969858 });
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 9) {
                    this.setIds(this.mReferenceIds = obtainStyledAttributes.getString(index));
                }
            }
        }
    }
    
    public void onDraw(final Canvas canvas) {
    }
    
    public void onMeasure(final int n, final int n2) {
        if (this.mUseViewMeasure) {
            super.onMeasure(n, n2);
            return;
        }
        this.setMeasuredDimension(0, 0);
    }
    
    public void setReferencedIds(final int[] array) {
        int i = 0;
        this.mCount = 0;
        while (i < array.length) {
            this.setTag(array[i], null);
            ++i;
        }
    }
    
    public void setTag(final int n, final Object o) {
        final int mCount = this.mCount;
        final int[] mIds = this.mIds;
        if (mCount + 1 > mIds.length) {
            this.mIds = Arrays.copyOf(mIds, mIds.length * 2);
        }
        final int[] mIds2 = this.mIds;
        final int mCount2 = this.mCount;
        mIds2[mCount2] = n;
        this.mCount = mCount2 + 1;
    }
    
    public void updatePostLayout(final ConstraintLayout constraintLayout) {
    }
    
    public void updatePostMeasure(final ConstraintLayout constraintLayout) {
    }
    
    public void updatePreLayout(final ConstraintLayout constraintLayout) {
        if (this.isInEditMode()) {
            this.setIds(this.mReferenceIds);
        }
        final 13n mHelperWidget = this.mHelperWidget;
        if (mHelperWidget == null) {
            return;
        }
        mHelperWidget.LIZ();
        for (int i = 0; i < this.mCount; ++i) {
            final View viewById = constraintLayout.getViewById(this.mIds[i]);
            if (viewById != null) {
                this.mHelperWidget.LIZ(constraintLayout.getViewWidget(viewById));
            }
        }
    }
    
    public void validateParams() {
        if (this.mHelperWidget == null) {
            return;
        }
        final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a)layoutParams).widget = this.mHelperWidget;
        }
    }
}
