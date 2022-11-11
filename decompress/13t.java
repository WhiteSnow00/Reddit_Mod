// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 13t extends 05a
{
    public 1fg mBarrier;
    public int mIndicatedType;
    public int mResolvedType;
    
    static {
        Covode.recordClassIndex(631);
    }
    
    public 13t(final Context context) {
        super(context);
        super.setVisibility(8);
    }
    
    public 13t(final Context context, final AttributeSet set) {
        super(context, set);
        super.setVisibility(8);
    }
    
    public 13t(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        super.setVisibility(8);
    }
    
    public boolean allowsGoneWidget() {
        return this.mBarrier.LIZIZ;
    }
    
    public int getType() {
        return this.mIndicatedType;
    }
    
    @Override
    public void init(final AttributeSet set) {
        super.init(set);
        this.mBarrier = new 1fg();
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, new int[] { 16842948, 16843039, 16843040, 16843071, 16843072, 2130969098, 2130969099, 2130969229, 2130969379, 2130969380, 2130969795, 2130969796, 2130969797, 2130969798, 2130969799, 2130969800, 2130969801, 2130969802, 2130969803, 2130969804, 2130969805, 2130969806, 2130969807, 2130969808, 2130969809, 2130969810, 2130969811, 2130969812, 2130969813, 2130969814, 2130969815, 2130969816, 2130969817, 2130969818, 2130969819, 2130969820, 2130969821, 2130969822, 2130969823, 2130969824, 2130969825, 2130969826, 2130969827, 2130969828, 2130969829, 2130969830, 2130969831, 2130969832, 2130969833, 2130969834, 2130969835, 2130969837, 2130969838, 2130969842, 2130969843, 2130969844, 2130969845, 2130969846, 2130969847, 2130969858 });
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.setType(obtainStyledAttributes.getInt(index, 0));
                }
                else if (index == 5) {
                    this.mBarrier.LIZIZ = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        super.mHelperWidget = this.mBarrier;
        this.validateParams();
    }
    
    public void setAllowsGoneWidget(final boolean liziz) {
        this.mBarrier.LIZIZ = liziz;
    }
    
    public void setType(int n) {
        this.mIndicatedType = n;
        this.mResolvedType = n;
        if (1 == this.getResources().getConfiguration().getLayoutDirection()) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            n = this.mIndicatedType;
            if (n == 5) {
                this.mResolvedType = 1;
            }
            else if (n == 6) {
                this.mResolvedType = 0;
            }
        }
        else {
            n = this.mIndicatedType;
            if (n == 5) {
                this.mResolvedType = 0;
            }
            else if (n == 6) {
                this.mResolvedType = 1;
            }
        }
        this.mBarrier.LIZ = this.mResolvedType;
    }
}
