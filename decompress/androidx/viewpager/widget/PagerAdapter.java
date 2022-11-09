// 
// Decompiled by Procyon v0.6.0
// 

package androidx.viewpager.widget;

import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.database.DataSetObserver;
import android.database.DataSetObservable;

public abstract class PagerAdapter
{
    public final DataSetObservable LIZ;
    public DataSetObserver mViewPagerObserver;
    
    static {
        Covode.recordClassIndex(1760);
    }
    
    public PagerAdapter() {
        this.LIZ = new DataSetObservable();
    }
    
    public int LIZ(final Object o) {
        return -1;
    }
    
    public Object LIZ(final View view, final int n) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }
    
    public Object LIZ(final ViewGroup viewGroup, final int n) {
        return this.LIZ((View)viewGroup, n);
    }
    
    public void LIZ(final DataSetObserver dataSetObserver) {
        this.LIZ.registerObserver((Object)dataSetObserver);
    }
    
    public void LIZ(final Parcelable parcelable, final ClassLoader classLoader) {
    }
    
    public void LIZ(final View view) {
    }
    
    public void LIZ(final View view, final int n, final Object o) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }
    
    public void LIZ(final ViewGroup viewGroup) {
        this.LIZ((View)viewGroup);
    }
    
    public void LIZ(final ViewGroup viewGroup, final int n, final Object o) {
        this.LIZ((View)viewGroup, n, o);
    }
    
    public abstract boolean LIZ(final View p0, final Object p1);
    
    public abstract int LIZIZ();
    
    public void LIZIZ(final DataSetObserver dataSetObserver) {
        this.LIZ.unregisterObserver((Object)dataSetObserver);
    }
    
    public void LIZIZ(final View view, final int n, final Object o) {
    }
    
    public void LIZIZ(final ViewGroup viewGroup) {
    }
    
    public void LIZIZ(final ViewGroup viewGroup, final int n, final Object o) {
        this.LIZIZ((View)viewGroup, n, o);
    }
    
    public CharSequence LIZJ(final int n) {
        return null;
    }
    
    public void LIZJ() {
        synchronized (this) {
            final DataSetObserver mViewPagerObserver = this.mViewPagerObserver;
            if (mViewPagerObserver != null) {
                mViewPagerObserver.onChanged();
            }
            monitorexit(this);
            this.LIZ.notifyChanged();
        }
    }
    
    public void LIZJ(final DataSetObserver mViewPagerObserver) {
        synchronized (this) {
            this.mViewPagerObserver = mViewPagerObserver;
        }
    }
    
    public float d_(final int n) {
        return 1.0f;
    }
    
    public Parcelable da_() {
        return null;
    }
}
