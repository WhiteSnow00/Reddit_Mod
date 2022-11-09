// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import a2.b;
import android.view.ViewGroup;
import androidx.viewpager.widget.a;

@Deprecated
public abstract class i0 extends a
{
    public static final int BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT = 1;
    @Deprecated
    public static final int BEHAVIOR_SET_USER_VISIBLE_HINT = 0;
    private static final boolean DEBUG = false;
    private static final String TAG = "FragmentPagerAdapter";
    private final int mBehavior;
    private n0 mCurTransaction;
    private Fragment mCurrentPrimaryItem;
    private boolean mExecutingFinishUpdate;
    private final d0 mFragmentManager;
    
    @Deprecated
    public i0(final d0 d0) {
        this(d0, 0);
    }
    
    public i0(final d0 mFragmentManager, final int mBehavior) {
        this.mCurTransaction = null;
        this.mCurrentPrimaryItem = null;
        this.mFragmentManager = mFragmentManager;
        this.mBehavior = mBehavior;
    }
    
    private static String makeFragmentName(final int n, final long n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("android:switcher:");
        sb.append(n);
        sb.append(":");
        sb.append(n2);
        return sb.toString();
    }
    
    public void destroyItem(final ViewGroup viewGroup, final int n, final Object o) {
        final Fragment fragment = (Fragment)o;
        if (this.mCurTransaction == null) {
            final d0 mFragmentManager = this.mFragmentManager;
            this.mCurTransaction = b.c(mFragmentManager, mFragmentManager);
        }
        final androidx.fragment.app.a a = (androidx.fragment.app.a)this.mCurTransaction;
        a.getClass();
        final d0 mFragmentManager2 = fragment.mFragmentManager;
        if (mFragmentManager2 != null && mFragmentManager2 != a.q) {
            final StringBuilder k = a.k("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            k.append(fragment.toString());
            k.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(k.toString());
        }
        a.b(new n0.a(fragment, 6));
        if (fragment.equals((Object)this.mCurrentPrimaryItem)) {
            this.mCurrentPrimaryItem = null;
        }
    }
    
    public void finishUpdate(final ViewGroup viewGroup) {
        final n0 mCurTransaction = this.mCurTransaction;
        if (mCurTransaction != null) {
            if (!this.mExecutingFinishUpdate) {
                try {
                    this.mExecutingFinishUpdate = true;
                    final androidx.fragment.app.a a = (androidx.fragment.app.a)mCurTransaction;
                    if (a.g) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    a.h = false;
                    a.q.A((d0.o)a, true);
                }
                finally {
                    this.mExecutingFinishUpdate = false;
                }
            }
            this.mCurTransaction = null;
        }
    }
    
    public abstract Fragment getItem(final int p0);
    
    public long getItemId(final int n) {
        return n;
    }
    
    public Object instantiateItem(final ViewGroup viewGroup, final int n) {
        if (this.mCurTransaction == null) {
            final d0 mFragmentManager = this.mFragmentManager;
            this.mCurTransaction = b.c(mFragmentManager, mFragmentManager);
        }
        final long itemId = this.getItemId(n);
        final Fragment e = this.mFragmentManager.E(makeFragmentName(((View)viewGroup).getId(), itemId));
        Fragment fragment;
        if (e != null) {
            final n0 mCurTransaction = this.mCurTransaction;
            mCurTransaction.getClass();
            mCurTransaction.b(new n0.a(e, 7));
            fragment = e;
        }
        else {
            final Fragment item = this.getItem(n);
            this.mCurTransaction.e(((View)viewGroup).getId(), item, makeFragmentName(((View)viewGroup).getId(), itemId), 1);
            fragment = item;
        }
        if (fragment != this.mCurrentPrimaryItem) {
            fragment.setMenuVisibility(false);
            if (this.mBehavior == 1) {
                this.mCurTransaction.h(fragment, Lifecycle.State.STARTED);
            }
            else {
                fragment.setUserVisibleHint(false);
            }
        }
        return fragment;
    }
    
    public boolean isViewFromObject(final View view, final Object o) {
        return ((Fragment)o).getView() == view;
    }
    
    public void restoreState(final Parcelable parcelable, final ClassLoader classLoader) {
    }
    
    public Parcelable saveState() {
        return null;
    }
    
    public void setPrimaryItem(final ViewGroup viewGroup, final int n, final Object o) {
        final Fragment mCurrentPrimaryItem = (Fragment)o;
        final Fragment mCurrentPrimaryItem2 = this.mCurrentPrimaryItem;
        if (mCurrentPrimaryItem != mCurrentPrimaryItem2) {
            if (mCurrentPrimaryItem2 != null) {
                mCurrentPrimaryItem2.setMenuVisibility(false);
                if (this.mBehavior == 1) {
                    if (this.mCurTransaction == null) {
                        final d0 mFragmentManager = this.mFragmentManager;
                        this.mCurTransaction = b.c(mFragmentManager, mFragmentManager);
                    }
                    this.mCurTransaction.h(this.mCurrentPrimaryItem, Lifecycle.State.STARTED);
                }
                else {
                    this.mCurrentPrimaryItem.setUserVisibleHint(false);
                }
            }
            mCurrentPrimaryItem.setMenuVisibility(true);
            if (this.mBehavior == 1) {
                if (this.mCurTransaction == null) {
                    final d0 mFragmentManager2 = this.mFragmentManager;
                    this.mCurTransaction = b.c(mFragmentManager2, mFragmentManager2);
                }
                this.mCurTransaction.h(mCurrentPrimaryItem, Lifecycle.State.RESUMED);
            }
            else {
                mCurrentPrimaryItem.setUserVisibleHint(true);
            }
            this.mCurrentPrimaryItem = mCurrentPrimaryItem;
        }
    }
    
    public void startUpdate(final ViewGroup viewGroup) {
        if (((View)viewGroup).getId() != -1) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("ViewPager with adapter ");
        sb.append(this);
        sb.append(" requires a view id");
        throw new IllegalStateException(sb.toString());
    }
}
