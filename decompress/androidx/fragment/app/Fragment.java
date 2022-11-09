// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import X.07P;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;
import X.0A5;
import X.0Ad;
import android.util.AttributeSet;
import X.0II;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.view.animation.Animation;
import android.view.MenuItem;
import android.content.res.Configuration;
import android.app.Activity;
import X.0Bw;
import androidx.lifecycle.LiveData;
import X.0GO;
import android.content.res.Resources;
import android.view.LayoutInflater$Factory2;
import X.06Q;
import X.0AB;
import android.animation.Animator;
import X.1nL;
import X.0Ca;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import java.lang.reflect.InvocationTargetException;
import X.0A7;
import android.content.Context;
import X.0CG;
import X.15t;
import X.Q0z;
import X.Bhl;
import X.Uhn;
import X.Uhp;
import X.0Qu;
import android.content.Intent;
import java.util.UUID;
import com.bytedance.covode.number.Covode;
import X.15z;
import X.15K;
import android.os.Parcelable;
import android.util.SparseArray;
import X.0GP;
import X.0CC;
import X.15u;
import android.view.LayoutInflater;
import android.view.View;
import X.15C;
import android.view.ViewGroup;
import android.os.Bundle;
import X.17e;
import X.0CH;
import X.0Bx;
import android.view.View$OnCreateContextMenuListener;
import android.content.ComponentCallbacks;

public class Fragment implements ComponentCallbacks, View$OnCreateContextMenuListener, 0Bx, 0CH, 17e
{
    public static final Object USE_DEFAULT_TRANSITION;
    public boolean mAdded;
    public Fragment.a mAnimationInfo;
    public Bundle mArguments;
    public int mBackStackNesting;
    public boolean mCalled;
    public m mChildFragmentManager;
    public ViewGroup mContainer;
    public int mContainerId;
    public int mContentLayoutId;
    public boolean mDeferStart;
    public boolean mDetached;
    public int mFragmentId;
    public m mFragmentManager;
    public boolean mFromLayout;
    public boolean mHasMenu;
    public boolean mHidden;
    public boolean mHiddenChanged;
    public 15C mHost;
    public boolean mInLayout;
    public View mInnerView;
    public boolean mIsCreated;
    public boolean mIsNewlyAdded;
    public Boolean mIsPrimaryNavigationFragment;
    public LayoutInflater mLayoutInflater;
    public 15u mLifecycleRegistry;
    public 0CC.b mMaxState;
    public boolean mMenuVisible;
    public Fragment mParentFragment;
    public boolean mPerformedCreateView;
    public float mPostponedAlpha;
    public Runnable mPostponedDurationRunnable;
    public boolean mRemoving;
    public boolean mRestored;
    public boolean mRetainInstance;
    public boolean mRetainInstanceChangedWhileDetached;
    public Bundle mSavedFragmentState;
    public 0GP mSavedStateRegistryController;
    public Boolean mSavedUserVisibleHint;
    public SparseArray<Parcelable> mSavedViewState;
    public int mState;
    public String mTag;
    public Fragment mTarget;
    public int mTargetRequestCode;
    public String mTargetWho;
    public boolean mUserVisibleHint;
    public View mView;
    public 15K mViewLifecycleOwner;
    public 15z<0CH> mViewLifecycleOwnerLiveData;
    public String mWho;
    
    static {
        Covode.recordClassIndex(1031);
        USE_DEFAULT_TRANSITION = new Object();
    }
    
    public Fragment() {
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new m();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() {
            static {
                Covode.recordClassIndex(1032);
            }
            
            @Override
            public final void run() {
                Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = 0CC.b.RESUMED;
        this.mViewLifecycleOwnerLiveData = new 15z<0CH>();
        this.initLifecycle();
    }
    
    public Fragment(final int mContentLayoutId) {
        this();
        this.mContentLayoutId = mContentLayoutId;
    }
    
    public static View INVOKEVIRTUAL_androidx_fragment_app_Fragment_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_proxyOnCreateView(final Fragment fragment, final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View onCreateView = fragment.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView != null) {
            onCreateView.setTag(2131363869, (Object)fragment);
        }
        return onCreateView;
    }
    
    public static void androidx_fragment_app_Fragment_com_bytedance_analytics_expose_HookRecyclerView_startActivityForResultInFragment(final Fragment fragment, final Intent intent, final int n) {
        0Qu.LIZ(intent, fragment);
        fragment.androidx_fragment_app_Fragment__startActivityForResult$___twin___(intent, n);
    }
    
    public static void androidx_fragment_app_Fragment_com_bytedance_analytics_expose_HookRecyclerView_startActivityForResultInFragmentX(final Fragment fragment, final Intent intent, final int n, final Bundle bundle) {
        0Qu.LIZ(intent, fragment);
        fragment.androidx_fragment_app_Fragment__startActivityForResult$___twin___(intent, n, bundle);
    }
    
    public static void androidx_fragment_app_Fragment_com_bytedance_scalpel_scene_lancet_common_FragmentManagerLancet_setUserVisibleHint(final Fragment fragment, final boolean b) {
        fragment.androidx_fragment_app_Fragment__setUserVisibleHint$___twin___(b);
        if (Uhp.LIZ()) {
            Uhn.LIZ().execute((Runnable)new Bhl(b, fragment));
        }
    }
    
    public static void androidx_fragment_app_Fragment_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivityForResultInFragment(final Fragment fragment, final Intent intent, final int n) {
        Q0z.LIZ(intent, (Object)fragment);
        androidx_fragment_app_Fragment_com_bytedance_analytics_expose_HookRecyclerView_startActivityForResultInFragment(fragment, intent, n);
    }
    
    public static void androidx_fragment_app_Fragment_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivityForResultInFragmentX(final Fragment fragment, final Intent intent, final int n, final Bundle bundle) {
        Q0z.LIZ(intent, (Object)fragment);
        androidx_fragment_app_Fragment_com_bytedance_analytics_expose_HookRecyclerView_startActivityForResultInFragmentX(fragment, intent, n, bundle);
    }
    
    private Fragment.a ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new Fragment.a();
        }
        return this.mAnimationInfo;
    }
    
    private void initLifecycle() {
        this.mLifecycleRegistry = new 15u(this);
        this.mSavedStateRegistryController = 0GP.LIZ(this);
        this.mLifecycleRegistry.LIZ(new 15t() {
            static {
                Covode.recordClassIndex(1033);
            }
            
            @Override
            public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
                if (a == 0CC.a.ON_STOP && Fragment.this.mView != null) {
                    Fragment.this.mView.cancelPendingInputEvents();
                }
            }
        });
    }
    
    public static Fragment instantiate(final Context context, final String s) {
        return instantiate(context, s, null);
    }
    
    public static Fragment instantiate(final Context context, final String s, final Bundle arguments) {
        try {
            final Fragment fragment = (Fragment)0A7.LIZIZ(context.getClassLoader(), s).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
            if (arguments != null) {
                arguments.setClassLoader(fragment.getClass().getClassLoader());
                fragment.setArguments(arguments);
            }
            return fragment;
        }
        catch (final InvocationTargetException ex) {
            final StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(s);
            sb.append(": calling Fragment constructor caused an exception");
            throw new Fragment.b(sb.toString(), (Exception)ex);
        }
        catch (final NoSuchMethodException ex2) {
            final StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(s);
            sb2.append(": could not find Fragment constructor");
            throw new Fragment.b(sb2.toString(), (Exception)ex2);
        }
        catch (final IllegalAccessException ex3) {
            final StringBuilder sb3 = new StringBuilder("Unable to instantiate fragment ");
            sb3.append(s);
            sb3.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new Fragment.b(sb3.toString(), (Exception)ex3);
        }
        catch (final InstantiationException ex4) {
            final StringBuilder sb4 = new StringBuilder("Unable to instantiate fragment ");
            sb4.append(s);
            sb4.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new Fragment.b(sb4.toString(), (Exception)ex4);
        }
    }
    
    public void androidx_fragment_app_Fragment__setUserVisibleHint$___twin___(final boolean mUserVisibleHint) {
        if (!this.mUserVisibleHint && mUserVisibleHint && this.mState < 3 && this.mFragmentManager != null && this.isAdded() && this.mIsCreated) {
            this.mFragmentManager.LJ(this);
        }
        this.mUserVisibleHint = mUserVisibleHint;
        this.mDeferStart = (this.mState < 3 && !mUserVisibleHint);
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = mUserVisibleHint;
        }
    }
    
    public void androidx_fragment_app_Fragment__startActivityForResult$___twin___(final Intent intent, final int n) {
        this.startActivityForResult(intent, n, null);
    }
    
    public void androidx_fragment_app_Fragment__startActivityForResult$___twin___(final Intent intent, final int n, final Bundle bundle) {
        final 15C mHost = this.mHost;
        if (mHost != null) {
            mHost.LIZ(this, intent, n, bundle);
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
    
    public void callStartTransitionListener() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo != null) {
            mAnimationInfo.LJIILLIIL = false;
            final Fragment.c ljiizilj = this.mAnimationInfo.LJIIZILJ;
            this.mAnimationInfo.LJIIZILJ = null;
            if (ljiizilj != null) {
                ljiizilj.LIZ();
            }
        }
    }
    
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        printWriter.print(s);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(s);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(s);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(s);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(s);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(s);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(s);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(s);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(s);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(s);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(s);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        final Fragment targetFragment = this.getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(s);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        if (this.getNextAnim() != 0) {
            printWriter.print(s);
            printWriter.print("mNextAnim=");
            printWriter.println(this.getNextAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(s);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(s);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (this.mInnerView != null) {
            printWriter.print(s);
            printWriter.print("mInnerView=");
            printWriter.println(this.mView);
        }
        if (this.getAnimatingAway() != null) {
            printWriter.print(s);
            printWriter.print("mAnimatingAway=");
            printWriter.println(this.getAnimatingAway());
            printWriter.print(s);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.getStateAfterAnimating());
        }
        if (this.getContext() != null) {
            0Ca.LIZ(this).LIZ(s, fileDescriptor, printWriter, array);
        }
        printWriter.print(s);
        final StringBuilder sb = new StringBuilder("Child ");
        sb.append(this.mChildFragmentManager);
        sb.append(":");
        printWriter.println(sb.toString());
        final m mChildFragmentManager = this.mChildFragmentManager;
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(s);
        sb2.append("  ");
        mChildFragmentManager.LIZ(sb2.toString(), fileDescriptor, printWriter, array);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return super.equals(o);
    }
    
    public Fragment findFragmentByWho(final String s) {
        if (s.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.LIZIZ(s);
    }
    
    public final 1nL getActivity() {
        final 15C mHost = this.mHost;
        if (mHost == null) {
            return null;
        }
        return (1nL)mHost.LIZIZ;
    }
    
    public boolean getAllowEnterTransitionOverlap() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        return mAnimationInfo == null || mAnimationInfo.LJIILIIL == null || this.mAnimationInfo.LJIILIIL;
    }
    
    public boolean getAllowReturnTransitionOverlap() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        return mAnimationInfo == null || mAnimationInfo.LJIIL == null || this.mAnimationInfo.LJIIL;
    }
    
    public View getAnimatingAway() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.LIZ;
    }
    
    public Animator getAnimator() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.LIZIZ;
    }
    
    public final Bundle getArguments() {
        return this.mArguments;
    }
    
    public final 0AB getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }
    
    public Context getContext() {
        final 15C mHost = this.mHost;
        if (mHost == null) {
            return null;
        }
        return mHost.LIZJ;
    }
    
    public Object getEnterTransition() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.LJI;
    }
    
    public 06Q getEnterTransitionCallback() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.LJIILJJIL;
    }
    
    public Object getExitTransition() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.LJIIIIZZ;
    }
    
    public 06Q getExitTransitionCallback() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.LJIILL;
    }
    
    public final 0AB getFragmentManager() {
        return this.mFragmentManager;
    }
    
    public final Object getHost() {
        final 15C mHost = this.mHost;
        if (mHost == null) {
            return null;
        }
        return mHost.LJI();
    }
    
    public final int getId() {
        return this.mFragmentId;
    }
    
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater;
        if ((layoutInflater = this.mLayoutInflater) == null) {
            layoutInflater = this.performGetLayoutInflater(null);
        }
        return layoutInflater;
    }
    
    public LayoutInflater getLayoutInflater(final Bundle bundle) {
        final 15C mHost = this.mHost;
        if (mHost != null) {
            final LayoutInflater lizj = mHost.LIZJ();
            lizj.setFactory2((LayoutInflater$Factory2)this.mChildFragmentManager);
            return lizj;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }
    
    public 0CC getLifecycle() {
        return this.mLifecycleRegistry;
    }
    
    public 0Ca getLoaderManager() {
        return 0Ca.LIZ(this);
    }
    
    public int getNextAnim() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return 0;
        }
        return mAnimationInfo.LIZLLL;
    }
    
    public int getNextTransition() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return 0;
        }
        return mAnimationInfo.LJ;
    }
    
    public int getNextTransitionStyle() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return 0;
        }
        return mAnimationInfo.LJFF;
    }
    
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }
    
    public Object getReenterTransition() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        if (mAnimationInfo.LJIIIZ == Fragment.USE_DEFAULT_TRANSITION) {
            return this.getExitTransition();
        }
        return this.mAnimationInfo.LJIIIZ;
    }
    
    public final Resources getResources() {
        return this.requireContext().getResources();
    }
    
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }
    
    public Object getReturnTransition() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        if (mAnimationInfo.LJII == Fragment.USE_DEFAULT_TRANSITION) {
            return this.getEnterTransition();
        }
        return this.mAnimationInfo.LJII;
    }
    
    public final 0GO getSavedStateRegistry() {
        return this.mSavedStateRegistryController.LIZ;
    }
    
    public Object getSharedElementEnterTransition() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        return mAnimationInfo.LJIIJ;
    }
    
    public Object getSharedElementReturnTransition() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return null;
        }
        if (mAnimationInfo.LJIIJJI == Fragment.USE_DEFAULT_TRANSITION) {
            return this.getSharedElementEnterTransition();
        }
        return this.mAnimationInfo.LJIIJJI;
    }
    
    public int getStateAfterAnimating() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        if (mAnimationInfo == null) {
            return 0;
        }
        return mAnimationInfo.LIZJ;
    }
    
    public final String getString(final int n) {
        return this.getResources().getString(n);
    }
    
    public final String getString(final int n, final Object... array) {
        return this.getResources().getString(n, array);
    }
    
    public final String getTag() {
        return this.mTag;
    }
    
    public final Fragment getTargetFragment() {
        final Fragment mTarget = this.mTarget;
        if (mTarget != null) {
            return mTarget;
        }
        final m mFragmentManager = this.mFragmentManager;
        if (mFragmentManager != null && this.mTargetWho != null) {
            return mFragmentManager.LJII.get(this.mTargetWho);
        }
        return null;
    }
    
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }
    
    public final CharSequence getText(final int n) {
        return this.getResources().getText(n);
    }
    
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }
    
    public View getView() {
        return this.mView;
    }
    
    public 0CH getViewLifecycleOwner() {
        final 15K mViewLifecycleOwner = this.mViewLifecycleOwner;
        if (mViewLifecycleOwner != null) {
            return mViewLifecycleOwner;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }
    
    public LiveData<0CH> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }
    
    public 0Bw getViewModelStore() {
        final m mFragmentManager = this.mFragmentManager;
        if (mFragmentManager != null) {
            final FragmentManagerViewModel ljjiizi = mFragmentManager.LJJIIZI;
            0Bw 0Bw;
            if ((0Bw = ljjiizi.LIZJ.get(this.mWho)) == null) {
                0Bw = new 0Bw();
                ljjiizi.LIZJ.put(this.mWho, 0Bw);
            }
            return 0Bw;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }
    
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }
    
    @Override
    public final int hashCode() {
        return super.hashCode();
    }
    
    public void initState() {
        this.initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new m();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }
    
    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }
    
    public final boolean isDetached() {
        return this.mDetached;
    }
    
    public final boolean isHidden() {
        return this.mHidden;
    }
    
    public boolean isHideReplaced() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        return mAnimationInfo != null && mAnimationInfo.LJIJ;
    }
    
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }
    
    public final boolean isInLayout() {
        return this.mInLayout;
    }
    
    public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }
    
    public boolean isPostponed() {
        final Fragment.a mAnimationInfo = this.mAnimationInfo;
        return mAnimationInfo != null && mAnimationInfo.LJIILLIIL;
    }
    
    public final boolean isRemoving() {
        return this.mRemoving;
    }
    
    public final boolean isResumed() {
        return this.mState >= 4;
    }
    
    public final boolean isStateSaved() {
        final m mFragmentManager = this.mFragmentManager;
        return mFragmentManager != null && mFragmentManager.LJIIIIZZ();
    }
    
    public final boolean isVisible() {
        if (this.isAdded() && !this.isHidden()) {
            final View mView = this.mView;
            if (mView != null && mView.getWindowToken() != null && this.mView.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }
    
    public void noteStateNotSaved() {
        this.mChildFragmentManager.LJIIL();
    }
    
    public void onActivityCreated(final Bundle bundle) {
        this.mCalled = true;
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
    }
    
    public void onAttach(final Activity activity) {
        this.mCalled = true;
    }
    
    public void onAttach(final Context context) {
        this.mCalled = true;
        final 15C mHost = this.mHost;
        if (mHost != null) {
            final Activity liziz = mHost.LIZIZ;
            if (liziz != null) {
                this.mCalled = false;
                this.onAttach(liziz);
            }
        }
    }
    
    public void onAttachFragment(final Fragment fragment) {
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        this.mCalled = true;
    }
    
    public boolean onContextItemSelected(final MenuItem menuItem) {
        return false;
    }
    
    public void onCreate(final Bundle bundle) {
        this.mCalled = true;
        this.restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.LJIILL <= 0) {
            this.mChildFragmentManager.LJIILIIL();
        }
    }
    
    public Animation onCreateAnimation(final int n, final boolean b, final int n2) {
        return null;
    }
    
    public Animator onCreateAnimator(final int n, final boolean b, final int n2) {
        return null;
    }
    
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        this.requireActivity().onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    public void onCreateOptionsMenu(final Menu menu, final MenuInflater menuInflater) {
    }
    
    public View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final int mContentLayoutId = this.mContentLayoutId;
        if (mContentLayoutId != 0) {
            return 0II.LIZ(layoutInflater, mContentLayoutId, viewGroup, false);
        }
        return null;
    }
    
    public void onDestroy() {
        this.mCalled = true;
    }
    
    public void onDestroyOptionsMenu() {
    }
    
    public void onDestroyView() {
        this.mCalled = true;
    }
    
    public void onDetach() {
        this.mCalled = true;
    }
    
    public LayoutInflater onGetLayoutInflater(final Bundle bundle) {
        return this.getLayoutInflater(bundle);
    }
    
    public void onHiddenChanged(final boolean b) {
    }
    
    public void onInflate(final Activity activity, final AttributeSet set, final Bundle bundle) {
        this.mCalled = true;
    }
    
    public void onInflate(final Context context, final AttributeSet set, final Bundle bundle) {
        this.mCalled = true;
        final 15C mHost = this.mHost;
        if (mHost != null) {
            final Activity liziz = mHost.LIZIZ;
            if (liziz != null) {
                this.mCalled = false;
                this.onInflate(liziz, set, bundle);
            }
        }
    }
    
    public void onLowMemory() {
        this.mCalled = true;
    }
    
    public void onMultiWindowModeChanged(final boolean b) {
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        return false;
    }
    
    public void onOptionsMenuClosed(final Menu menu) {
    }
    
    public void onPause() {
        this.mCalled = true;
    }
    
    public void onPictureInPictureModeChanged(final boolean b) {
    }
    
    public void onPrepareOptionsMenu(final Menu menu) {
    }
    
    public void onPrimaryNavigationFragmentChanged(final boolean b) {
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
    }
    
    public void onResume() {
        this.mCalled = true;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
    }
    
    public void onStart() {
        this.mCalled = true;
    }
    
    public void onStop() {
        this.mCalled = true;
    }
    
    public void onViewCreated(final View view, final Bundle bundle) {
    }
    
    public void onViewStateRestored(final Bundle bundle) {
        this.mCalled = true;
    }
    
    public void performActivityCreated(final Bundle bundle) {
        this.mChildFragmentManager.LJIIL();
        this.mState = 2;
        this.mCalled = false;
        this.onActivityCreated(bundle);
        if (this.mCalled) {
            this.mChildFragmentManager.LJIILJJIL();
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new 0Ad(sb.toString());
    }
    
    public void performAttach() {
        this.mChildFragmentManager.LIZ(this.mHost, new 0A5() {
            static {
                Covode.recordClassIndex(1035);
            }
            
            @Override
            public final View LIZ(final int n) {
                if (Fragment.this.mView != null) {
                    return Fragment.this.mView.findViewById(n);
                }
                final StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(this);
                sb.append(" does not have a view");
                throw new IllegalStateException(sb.toString());
            }
            
            @Override
            public final boolean LIZ() {
                return Fragment.this.mView != null;
            }
        }, this);
        this.mCalled = false;
        this.onAttach(this.mHost.LIZJ);
        if (this.mCalled) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onAttach()");
        throw new 0Ad(sb.toString());
    }
    
    public void performConfigurationChanged(final Configuration configuration) {
        this.onConfigurationChanged(configuration);
        this.mChildFragmentManager.LIZ(configuration);
    }
    
    public boolean performContextItemSelected(final MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.onContextItemSelected(menuItem)) {
                return true;
            }
            if (this.mChildFragmentManager.LIZIZ(menuItem)) {
                return true;
            }
        }
        return false;
    }
    
    public void performCreate(final Bundle bundle) {
        this.mChildFragmentManager.LJIIL();
        this.mState = 1;
        this.mCalled = false;
        this.mSavedStateRegistryController.LIZ(bundle);
        this.onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.LIZ(0CC.a.ON_CREATE);
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new 0Ad(sb.toString());
    }
    
    public boolean performCreateOptionsMenu(final Menu menu, final MenuInflater menuInflater) {
        final boolean mHidden = this.mHidden;
        boolean b = false;
        final boolean b2 = false;
        if (!mHidden) {
            boolean b3 = b2;
            if (this.mHasMenu) {
                b3 = b2;
                if (this.mMenuVisible) {
                    b3 = true;
                    this.onCreateOptionsMenu(menu, menuInflater);
                }
            }
            b = (b3 | this.mChildFragmentManager.LIZ(menu, menuInflater));
        }
        return b;
    }
    
    public void performCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.mChildFragmentManager.LJIIL();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new 15K();
        final View invokevirtual_androidx_fragment_app_Fragment_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_proxyOnCreateView = INVOKEVIRTUAL_androidx_fragment_app_Fragment_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_proxyOnCreateView(this, layoutInflater, viewGroup, bundle);
        this.mView = invokevirtual_androidx_fragment_app_Fragment_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_proxyOnCreateView;
        if (invokevirtual_androidx_fragment_app_Fragment_com_bytedance_provider_lancet_FragmentOnCreateViewLancet_proxyOnCreateView != null) {
            this.mViewLifecycleOwner.LIZ();
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
            return;
        }
        if (this.mViewLifecycleOwner.LIZ != null) {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
        this.mViewLifecycleOwner = null;
    }
    
    public void performDestroy() {
        this.mChildFragmentManager.LJIJ();
        this.mLifecycleRegistry.LIZ(0CC.a.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        this.onDestroy();
        if (this.mCalled) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroy()");
        throw new 0Ad(sb.toString());
    }
    
    public void performDestroyView() {
        this.mChildFragmentManager.LIZLLL(1);
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(0CC.a.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        this.onDestroyView();
        if (this.mCalled) {
            0Ca.LIZ(this).LIZ();
            this.mPerformedCreateView = false;
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new 0Ad(sb.toString());
    }
    
    public void performDetach() {
        this.mCalled = false;
        this.onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (!this.mChildFragmentManager.LJJ) {
                this.mChildFragmentManager.LJIJ();
                this.mChildFragmentManager = new m();
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDetach()");
        throw new 0Ad(sb.toString());
    }
    
    public LayoutInflater performGetLayoutInflater(final Bundle bundle) {
        return this.mLayoutInflater = this.onGetLayoutInflater(bundle);
    }
    
    public void performLowMemory() {
        this.onLowMemory();
        this.mChildFragmentManager.LJIJI();
    }
    
    public void performMultiWindowModeChanged(final boolean b) {
        this.onMultiWindowModeChanged(b);
        this.mChildFragmentManager.LIZ(b);
    }
    
    public boolean performOptionsItemSelected(final MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && this.onOptionsItemSelected(menuItem)) {
                return true;
            }
            if (this.mChildFragmentManager.LIZ(menuItem)) {
                return true;
            }
        }
        return false;
    }
    
    public void performOptionsMenuClosed(final Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                this.onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.LIZIZ(menu);
        }
    }
    
    public void performPause() {
        this.mChildFragmentManager.LIZLLL(3);
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(0CC.a.ON_PAUSE);
        }
        this.mLifecycleRegistry.LIZ(0CC.a.ON_PAUSE);
        this.mState = 3;
        this.mCalled = false;
        this.onPause();
        if (this.mCalled) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onPause()");
        throw new 0Ad(sb.toString());
    }
    
    public void performPictureInPictureModeChanged(final boolean b) {
        this.onPictureInPictureModeChanged(b);
        this.mChildFragmentManager.LIZIZ(b);
    }
    
    public boolean performPrepareOptionsMenu(final Menu menu) {
        final boolean mHidden = this.mHidden;
        boolean b = false;
        final boolean b2 = false;
        if (!mHidden) {
            boolean b3 = b2;
            if (this.mHasMenu) {
                b3 = b2;
                if (this.mMenuVisible) {
                    b3 = true;
                    this.onPrepareOptionsMenu(menu);
                }
            }
            b = (b3 | this.mChildFragmentManager.LIZ(menu));
        }
        return b;
    }
    
    public void performPrimaryNavigationFragmentChanged() {
        final boolean liziz = this.mFragmentManager.LIZIZ(this);
        final Boolean mIsPrimaryNavigationFragment = this.mIsPrimaryNavigationFragment;
        if (mIsPrimaryNavigationFragment == null || mIsPrimaryNavigationFragment != liziz) {
            this.mIsPrimaryNavigationFragment = liziz;
            this.onPrimaryNavigationFragmentChanged(liziz);
            final m mChildFragmentManager = this.mChildFragmentManager;
            mChildFragmentManager.LJIIIZ();
            mChildFragmentManager.LJIILIIL(mChildFragmentManager.LJIJI);
        }
    }
    
    public void performResume() {
        this.mChildFragmentManager.LJIIL();
        m.LIZIZ(this.mChildFragmentManager);
        this.mState = 4;
        this.mCalled = false;
        this.onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.LIZ(0CC.a.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.LIZ(0CC.a.ON_RESUME);
            }
            this.mChildFragmentManager.LJIILLIIL();
            m.LIZIZ(this.mChildFragmentManager);
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new 0Ad(sb.toString());
    }
    
    public void performSaveInstanceState(final Bundle bundle) {
        this.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.LIZIZ(bundle);
        final Parcelable ljiijji = this.mChildFragmentManager.LJIIJJI();
        if (ljiijji != null) {
            bundle.putParcelable("android:support:fragments", ljiijji);
        }
    }
    
    public void performStart() {
        this.mChildFragmentManager.LJIIL();
        m.LIZIZ(this.mChildFragmentManager);
        this.mState = 3;
        this.mCalled = false;
        this.onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.LIZ(0CC.a.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.LIZ(0CC.a.ON_START);
            }
            this.mChildFragmentManager.LJIILL();
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new 0Ad(sb.toString());
    }
    
    public void performStop() {
        this.mChildFragmentManager.LJIIZILJ();
        if (this.mView != null) {
            this.mViewLifecycleOwner.LIZ(0CC.a.ON_STOP);
        }
        this.mLifecycleRegistry.LIZ(0CC.a.ON_STOP);
        this.mState = 2;
        this.mCalled = false;
        this.onStop();
        if (this.mCalled) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStop()");
        throw new 0Ad(sb.toString());
    }
    
    public void postponeEnterTransition() {
        this.ensureAnimationInfo().LJIILLIIL = true;
    }
    
    public final void postponeEnterTransition(final long n, final TimeUnit timeUnit) {
        this.ensureAnimationInfo().LJIILLIIL = true;
        final m mFragmentManager = this.mFragmentManager;
        Handler lizlll;
        if (mFragmentManager != null) {
            lizlll = mFragmentManager.LJIILLIIL.LIZLLL;
        }
        else {
            lizlll = new Handler(Looper.getMainLooper());
        }
        lizlll.removeCallbacks(this.mPostponedDurationRunnable);
        lizlll.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(n));
    }
    
    public void registerForContextMenu(final View view) {
        view.setOnCreateContextMenuListener((View$OnCreateContextMenuListener)this);
    }
    
    public final void requestPermissions(final String[] array, final int n) {
        final 15C mHost = this.mHost;
        if (mHost != null) {
            mHost.LIZ(this, array, n);
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
    
    public final 1nL requireActivity() {
        final 1nL activity = this.getActivity();
        if (activity != null) {
            return activity;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final Bundle requireArguments() {
        final Bundle arguments = this.getArguments();
        if (arguments != null) {
            return arguments;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" does not have any arguments.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final Context requireContext() {
        final Context context = this.getContext();
        if (context != null) {
            return context;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final 0AB requireFragmentManager() {
        final 0AB fragmentManager = this.getFragmentManager();
        if (fragmentManager != null) {
            return fragmentManager;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final Object requireHost() {
        final Object host = this.getHost();
        if (host != null) {
            return host;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to a host.");
        throw new IllegalStateException(sb.toString());
    }
    
    public final Fragment requireParentFragment() {
        final Fragment parentFragment = this.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (this.getContext() == null) {
            final StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(this);
            sb.append(" is not attached to any Fragment or host");
            throw new IllegalStateException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder("Fragment ");
        sb2.append(this);
        sb2.append(" is not a child Fragment, it is directly attached to ");
        sb2.append(this.getContext());
        throw new IllegalStateException(sb2.toString());
    }
    
    public final View requireView() {
        final View view = this.getView();
        if (view != null) {
            return view;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }
    
    public void restoreChildFragmentState(final Bundle bundle) {
        if (bundle != null) {
            final Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                this.mChildFragmentManager.LIZ(parcelable);
                this.mChildFragmentManager.LJIILIIL();
            }
        }
    }
    
    public final void restoreViewState(final Bundle bundle) {
        final SparseArray<Parcelable> mSavedViewState = this.mSavedViewState;
        if (mSavedViewState != null) {
            this.mInnerView.restoreHierarchyState((SparseArray)mSavedViewState);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        this.onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.LIZ(0CC.a.ON_CREATE);
            }
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onViewStateRestored()");
        throw new 0Ad(sb.toString());
    }
    
    public void setAllowEnterTransitionOverlap(final boolean b) {
        this.ensureAnimationInfo().LJIILIIL = b;
    }
    
    public void setAllowReturnTransitionOverlap(final boolean b) {
        this.ensureAnimationInfo().LJIIL = b;
    }
    
    public void setAnimatingAway(final View liz) {
        this.ensureAnimationInfo().LIZ = liz;
    }
    
    public void setAnimator(final Animator liziz) {
        this.ensureAnimationInfo().LIZIZ = liziz;
    }
    
    public void setArguments(final Bundle mArguments) {
        if (this.mFragmentManager == null || !this.isStateSaved()) {
            this.mArguments = mArguments;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }
    
    public void setEnterSharedElementCallback(final 06Q ljiiljjil) {
        this.ensureAnimationInfo().LJIILJJIL = ljiiljjil;
    }
    
    public void setEnterTransition(final Object lji) {
        this.ensureAnimationInfo().LJI = lji;
    }
    
    public void setExitSharedElementCallback(final 06Q ljiill) {
        this.ensureAnimationInfo().LJIILL = ljiill;
    }
    
    public void setExitTransition(final Object ljiiiizz) {
        this.ensureAnimationInfo().LJIIIIZZ = ljiiiizz;
    }
    
    public void setHasOptionsMenu(final boolean mHasMenu) {
        if (this.mHasMenu != mHasMenu) {
            this.mHasMenu = mHasMenu;
            if (this.isAdded() && !this.isHidden()) {
                this.mHost.LIZLLL();
            }
        }
    }
    
    public void setHideReplaced(final boolean ljij) {
        this.ensureAnimationInfo().LJIJ = ljij;
    }
    
    public void setInitialSavedState(final SavedState savedState) {
        if (this.mFragmentManager == null) {
            Bundle liz;
            if (savedState != null && savedState.LIZ != null) {
                liz = savedState.LIZ;
            }
            else {
                liz = null;
            }
            this.mSavedFragmentState = liz;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }
    
    public void setMenuVisibility(final boolean mMenuVisible) {
        if (this.mMenuVisible != mMenuVisible) {
            this.mMenuVisible = mMenuVisible;
            if (this.mHasMenu && this.isAdded() && !this.isHidden()) {
                this.mHost.LIZLLL();
            }
        }
    }
    
    public void setNextAnim(final int lizlll) {
        if (this.mAnimationInfo == null && lizlll == 0) {
            return;
        }
        this.ensureAnimationInfo().LIZLLL = lizlll;
    }
    
    public void setNextTransition(final int lj, final int ljff) {
        if (this.mAnimationInfo == null && lj == 0 && ljff == 0) {
            return;
        }
        this.ensureAnimationInfo();
        this.mAnimationInfo.LJ = lj;
        this.mAnimationInfo.LJFF = ljff;
    }
    
    public void setOnStartEnterTransitionListener(final Fragment.c ljiizilj) {
        this.ensureAnimationInfo();
        if (ljiizilj == this.mAnimationInfo.LJIIZILJ) {
            return;
        }
        if (ljiizilj == null || this.mAnimationInfo.LJIIZILJ == null) {
            if (this.mAnimationInfo.LJIILLIIL) {
                this.mAnimationInfo.LJIIZILJ = ljiizilj;
            }
            if (ljiizilj != null) {
                ljiizilj.LIZIZ();
            }
            return;
        }
        throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on ".concat(String.valueOf(this)));
    }
    
    public void setReenterTransition(final Object ljiiiz) {
        this.ensureAnimationInfo().LJIIIZ = ljiiiz;
    }
    
    public void setRetainInstance(final boolean mRetainInstance) {
        this.mRetainInstance = mRetainInstance;
        final m mFragmentManager = this.mFragmentManager;
        if (mFragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        if (mRetainInstance) {
            mFragmentManager.LIZJ(this);
            return;
        }
        mFragmentManager.LIZLLL(this);
    }
    
    public void setReturnTransition(final Object ljii) {
        this.ensureAnimationInfo().LJII = ljii;
    }
    
    public void setSharedElementEnterTransition(final Object ljiij) {
        this.ensureAnimationInfo().LJIIJ = ljiij;
    }
    
    public void setSharedElementReturnTransition(final Object ljiijji) {
        this.ensureAnimationInfo().LJIIJJI = ljiijji;
    }
    
    public void setStateAfterAnimating(final int lizj) {
        this.ensureAnimationInfo().LIZJ = lizj;
    }
    
    public void setTargetFragment(final Fragment mTarget, final int mTargetRequestCode) {
        final 0AB fragmentManager = this.getFragmentManager();
        0AB fragmentManager2;
        if (mTarget != null) {
            fragmentManager2 = mTarget.getFragmentManager();
        }
        else {
            fragmentManager2 = null;
        }
        if (fragmentManager == null || fragmentManager2 == null || fragmentManager == fragmentManager2) {
            for (Fragment targetFragment = mTarget; targetFragment != null; targetFragment = targetFragment.getTargetFragment()) {
                if (targetFragment == this) {
                    final StringBuilder sb = new StringBuilder("Setting ");
                    sb.append(mTarget);
                    sb.append(" as the target of ");
                    sb.append(this);
                    sb.append(" would create a target cycle");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            if (mTarget == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            }
            else if (this.mFragmentManager != null && mTarget.mFragmentManager != null) {
                this.mTargetWho = mTarget.mWho;
                this.mTarget = null;
            }
            else {
                this.mTargetWho = null;
                this.mTarget = mTarget;
            }
            this.mTargetRequestCode = mTargetRequestCode;
            return;
        }
        final StringBuilder sb2 = new StringBuilder("Fragment ");
        sb2.append(mTarget);
        sb2.append(" must share the same FragmentManager to be set as a target fragment");
        throw new IllegalArgumentException(sb2.toString());
    }
    
    public void setUserVisibleHint(final boolean b) {
        androidx_fragment_app_Fragment_com_bytedance_scalpel_scene_lancet_common_FragmentManagerLancet_setUserVisibleHint(this, b);
    }
    
    public boolean shouldShowRequestPermissionRationale(final String s) {
        final 15C mHost = this.mHost;
        return mHost != null && mHost.LIZ(s);
    }
    
    public void startActivity(final Intent intent) {
        this.startActivity(intent, null);
    }
    
    public void startActivity(final Intent intent, final Bundle bundle) {
        final 15C mHost = this.mHost;
        if (mHost != null) {
            mHost.LIZ(this, intent, -1, bundle);
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
    
    public void startActivityForResult(final Intent intent, final int n) {
        androidx_fragment_app_Fragment_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivityForResultInFragment(this, intent, n);
    }
    
    public void startActivityForResult(final Intent intent, final int n, final Bundle bundle) {
        androidx_fragment_app_Fragment_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivityForResultInFragmentX(this, intent, n, bundle);
    }
    
    public void startIntentSenderForResult(final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) {
        final 15C mHost = this.mHost;
        if (mHost != null) {
            mHost.LIZ(this, intentSender, n, intent, n2, n3, n4, bundle);
            return;
        }
        final StringBuilder sb = new StringBuilder("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }
    
    public void startPostponedEnterTransition() {
        final m mFragmentManager = this.mFragmentManager;
        if (mFragmentManager == null || mFragmentManager.LJIILLIIL == null) {
            this.ensureAnimationInfo().LJIILLIIL = false;
            return;
        }
        if (Looper.myLooper() != this.mFragmentManager.LJIILLIIL.LIZLLL.getLooper()) {
            this.mFragmentManager.LJIILLIIL.LIZLLL.postAtFrontOfQueue((Runnable)new Runnable() {
                static {
                    Covode.recordClassIndex(1034);
                }
                
                @Override
                public final void run() {
                    Fragment.this.callStartTransitionListener();
                }
            });
            return;
        }
        this.callStartTransitionListener();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        07P.LIZ(this, sb);
        sb.append(" (");
        sb.append(this.mWho);
        sb.append(")");
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" ");
            sb.append(this.mTag);
        }
        sb.append('}');
        return sb.toString();
    }
    
    public void unregisterForContextMenu(final View view) {
        view.setOnCreateContextMenuListener((View$OnCreateContextMenuListener)null);
    }
    
    public static class SavedState implements Parcelable
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public final Bundle LIZ;
        
        static {
            Covode.recordClassIndex(1036);
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<SavedState>() {
                static {
                    Covode.recordClassIndex(1037);
                }
            };
        }
        
        public SavedState(final Bundle liz) {
            this.LIZ = liz;
        }
        
        public SavedState(final Parcel parcel, final ClassLoader classLoader) {
            final Bundle bundle = parcel.readBundle();
            this.LIZ = bundle;
            if (classLoader != null && bundle != null) {
                bundle.setClassLoader(classLoader);
            }
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeBundle(this.LIZ);
        }
    }
}
