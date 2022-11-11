// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.os.BaseBundle;
import android.view.Window;
import android.view.ViewGroup;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import android.view.LayoutInflater;
import androidx.activity.h;
import android.content.Context;
import android.app.Activity;
import android.os.Bundle;
import al0.g7;
import android.content.DialogInterface;
import android.os.Looper;
import android.view.View;
import android.util.Log;
import androidx.lifecycle.q;
import androidx.lifecycle.y;
import android.os.Handler;
import android.app.Dialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;

public class n extends Fragment implements DialogInterface$OnCancelListener, DialogInterface$OnDismissListener
{
    private static final String SAVED_BACK_STACK_ID = "android:backStackId";
    private static final String SAVED_CANCELABLE = "android:cancelable";
    private static final String SAVED_DIALOG_STATE_TAG = "android:savedDialogState";
    private static final String SAVED_INTERNAL_DIALOG_SHOWING = "android:dialogShowing";
    private static final String SAVED_SHOWS_DIALOG = "android:showsDialog";
    private static final String SAVED_STYLE = "android:style";
    private static final String SAVED_THEME = "android:theme";
    public static final int STYLE_NORMAL = 0;
    public static final int STYLE_NO_FRAME = 2;
    public static final int STYLE_NO_INPUT = 3;
    public static final int STYLE_NO_TITLE = 1;
    private int mBackStackId;
    private boolean mCancelable;
    private boolean mCreatingDialog;
    private Dialog mDialog;
    private boolean mDialogCreated;
    private Runnable mDismissRunnable;
    private boolean mDismissed;
    private Handler mHandler;
    private y<q> mObserver;
    private DialogInterface$OnCancelListener mOnCancelListener;
    private DialogInterface$OnDismissListener mOnDismissListener;
    private boolean mShownByMe;
    private boolean mShowsDialog;
    private int mStyle;
    private int mTheme;
    private boolean mViewDestroyed;
    
    public n() {
        this.mDismissRunnable = (Runnable)new n$a(this);
        this.mOnCancelListener = (DialogInterface$OnCancelListener)new n$b(this);
        this.mOnDismissListener = (DialogInterface$OnDismissListener)new n$c(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new y<q>() {
            @Override
            public final void a(final Object o) {
                if (o != null && n.access$200(n.this)) {
                    final View requireView = n.this.requireView();
                    if (requireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (n.access$000(n.this) != null) {
                        if (d0.M(3)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("DialogFragment ");
                            sb.append(this);
                            sb.append(" setting the content view on ");
                            sb.append(n.access$000(n.this));
                            Log.d("FragmentManager", sb.toString());
                        }
                        n.access$000(n.this).setContentView(requireView);
                    }
                }
            }
        };
        this.mDialogCreated = false;
    }
    
    public n(final int n) {
        super(n);
        this.mDismissRunnable = (Runnable)new n$a(this);
        this.mOnCancelListener = (DialogInterface$OnCancelListener)new n$b(this);
        this.mOnDismissListener = (DialogInterface$OnDismissListener)new n$c(this);
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
        this.mObserver = new y<q>() {
            @Override
            public final void a(final Object o) {
                if (o != null && n.access$200(n.this)) {
                    final View requireView = n.this.requireView();
                    if (requireView.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    if (n.access$000(n.this) != null) {
                        if (d0.M(3)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("DialogFragment ");
                            sb.append(this);
                            sb.append(" setting the content view on ");
                            sb.append(n.access$000(n.this));
                            Log.d("FragmentManager", sb.toString());
                        }
                        n.access$000(n.this).setContentView(requireView);
                    }
                }
            }
        };
        this.mDialogCreated = false;
    }
    
    public static /* synthetic */ Dialog access$000(final n n) {
        return n.mDialog;
    }
    
    public static /* synthetic */ boolean access$200(final n n) {
        return n.mShowsDialog;
    }
    
    private void dismissInternal(final boolean b, final boolean b2, final boolean b3) {
        if (this.mDismissed) {
            return;
        }
        this.mDismissed = true;
        this.mShownByMe = false;
        final Dialog mDialog = this.mDialog;
        if (mDialog != null) {
            mDialog.setOnDismissListener((DialogInterface$OnDismissListener)null);
            this.mDialog.dismiss();
            if (!b2) {
                if (Looper.myLooper() == this.mHandler.getLooper()) {
                    this.onDismiss((DialogInterface)this.mDialog);
                }
                else {
                    this.mHandler.post(this.mDismissRunnable);
                }
            }
        }
        this.mViewDestroyed = true;
        if (this.mBackStackId >= 0) {
            if (b3) {
                final d0 parentFragmentManager = this.getParentFragmentManager();
                final int mBackStackId = this.mBackStackId;
                if (mBackStackId < 0) {
                    parentFragmentManager.getClass();
                    throw new IllegalArgumentException(d.h("Bad id: ", mBackStackId));
                }
                parentFragmentManager.S(mBackStackId, 1, (String)null);
            }
            else {
                final d0 parentFragmentManager2 = this.getParentFragmentManager();
                final int mBackStackId2 = this.mBackStackId;
                parentFragmentManager2.getClass();
                if (mBackStackId2 < 0) {
                    throw new IllegalArgumentException(d.h("Bad id: ", mBackStackId2));
                }
                parentFragmentManager2.x((d0$o)parentFragmentManager2.new p(null, mBackStackId2, 1), b);
            }
            this.mBackStackId = -1;
        }
        else {
            final d0 parentFragmentManager3 = this.getParentFragmentManager();
            final a c = g7.c(parentFragmentManager3, parentFragmentManager3);
            c.p = true;
            c.o(this);
            if (b3) {
                c.m();
            }
            else if (b) {
                c.k();
            }
            else {
                c.j();
            }
        }
    }
    
    private void prepareDialog(final Bundle bundle) {
        if (!this.mShowsDialog) {
            return;
        }
        if (!this.mDialogCreated) {
            try {
                this.mCreatingDialog = true;
                final Dialog onCreateDialog = this.onCreateDialog(bundle);
                this.mDialog = onCreateDialog;
                if (this.mShowsDialog) {
                    this.setupDialog(onCreateDialog, this.mStyle);
                    final Context context = this.getContext();
                    if (context instanceof Activity) {
                        this.mDialog.setOwnerActivity((Activity)context);
                    }
                    this.mDialog.setCancelable(this.mCancelable);
                    this.mDialog.setOnCancelListener(this.mOnCancelListener);
                    this.mDialog.setOnDismissListener(this.mOnDismissListener);
                    this.mDialogCreated = true;
                }
                else {
                    this.mDialog = null;
                }
            }
            finally {
                this.mCreatingDialog = false;
            }
        }
    }
    
    public t createFragmentContainer() {
        return new t() {
            public final /* synthetic */ t f = super.createFragmentContainer();
            
            @Override
            public final View b(final int n) {
                if (this.f.c()) {
                    return this.f.b(n);
                }
                return n.this.onFindViewById(n);
            }
            
            @Override
            public final boolean c() {
                return this.f.c() || n.this.onHasView();
            }
        };
    }
    
    public void dismiss() {
        this.dismissInternal(false, false, false);
    }
    
    public void dismissAllowingStateLoss() {
        this.dismissInternal(true, false, false);
    }
    
    public void dismissNow() {
        this.dismissInternal(false, false, true);
    }
    
    public Dialog getDialog() {
        return this.mDialog;
    }
    
    public boolean getShowsDialog() {
        return this.mShowsDialog;
    }
    
    public int getTheme() {
        return this.mTheme;
    }
    
    public boolean isCancelable() {
        return this.mCancelable;
    }
    
    @Deprecated
    public void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
    }
    
    public void onAttach(final Context context) {
        super.onAttach(context);
        this.getViewLifecycleOwnerLiveData().f(this.mObserver);
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = (super.mContainerId == 0);
        if (bundle != null) {
            this.mStyle = ((BaseBundle)bundle).getInt("android:style", 0);
            this.mTheme = ((BaseBundle)bundle).getInt("android:theme", 0);
            this.mCancelable = ((BaseBundle)bundle).getBoolean("android:cancelable", true);
            this.mShowsDialog = ((BaseBundle)bundle).getBoolean("android:showsDialog", this.mShowsDialog);
            this.mBackStackId = ((BaseBundle)bundle).getInt("android:backStackId", -1);
        }
    }
    
    public Dialog onCreateDialog(final Bundle bundle) {
        if (d0.M(3)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("onCreateDialog called for DialogFragment ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        return (Dialog)new h(this.requireContext(), this.getTheme());
    }
    
    public void onDestroyView() {
        super.onDestroyView();
        final Dialog mDialog = this.mDialog;
        if (mDialog != null) {
            this.mViewDestroyed = true;
            mDialog.setOnDismissListener((DialogInterface$OnDismissListener)null);
            this.mDialog.dismiss();
            if (!this.mDismissed) {
                this.onDismiss((DialogInterface)this.mDialog);
            }
            this.mDialog = null;
            this.mDialogCreated = false;
        }
    }
    
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
        this.getViewLifecycleOwnerLiveData().j(this.mObserver);
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        if (!this.mViewDestroyed) {
            if (d0.M(3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("onDismiss called for DialogFragment ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            this.dismissInternal(true, true, false);
        }
    }
    
    public View onFindViewById(final int n) {
        final Dialog mDialog = this.mDialog;
        if (mDialog != null) {
            return mDialog.findViewById(n);
        }
        return null;
    }
    
    public LayoutInflater onGetLayoutInflater(final Bundle bundle) {
        final LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.mShowsDialog && !this.mCreatingDialog) {
            this.prepareDialog(bundle);
            if (d0.M(2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("get layout inflater for DialogFragment ");
                sb.append(this);
                sb.append(" from dialog context");
                Log.d("FragmentManager", sb.toString());
            }
            final Dialog mDialog = this.mDialog;
            LayoutInflater cloneInContext = onGetLayoutInflater;
            if (mDialog != null) {
                cloneInContext = onGetLayoutInflater.cloneInContext(mDialog.getContext());
            }
            return cloneInContext;
        }
        if (d0.M(2)) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("getting layout inflater for DialogFragment ");
            sb2.append(this);
            final String string = sb2.toString();
            if (!this.mShowsDialog) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("mShowsDialog = false: ");
                sb3.append(string);
                Log.d("FragmentManager", sb3.toString());
            }
            else {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("mCreatingDialog = true: ");
                sb4.append(string);
                Log.d("FragmentManager", sb4.toString());
            }
        }
        return onGetLayoutInflater;
    }
    
    public boolean onHasView() {
        return this.mDialogCreated;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final Dialog mDialog = this.mDialog;
        if (mDialog != null) {
            final Bundle onSaveInstanceState = mDialog.onSaveInstanceState();
            ((BaseBundle)onSaveInstanceState).putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        final int mStyle = this.mStyle;
        if (mStyle != 0) {
            ((BaseBundle)bundle).putInt("android:style", mStyle);
        }
        final int mTheme = this.mTheme;
        if (mTheme != 0) {
            ((BaseBundle)bundle).putInt("android:theme", mTheme);
        }
        final boolean mCancelable = this.mCancelable;
        if (!mCancelable) {
            ((BaseBundle)bundle).putBoolean("android:cancelable", mCancelable);
        }
        final boolean mShowsDialog = this.mShowsDialog;
        if (!mShowsDialog) {
            ((BaseBundle)bundle).putBoolean("android:showsDialog", mShowsDialog);
        }
        final int mBackStackId = this.mBackStackId;
        if (mBackStackId != -1) {
            ((BaseBundle)bundle).putInt("android:backStackId", mBackStackId);
        }
    }
    
    public void onStart() {
        super.onStart();
        final Dialog mDialog = this.mDialog;
        if (mDialog != null) {
            this.mViewDestroyed = false;
            mDialog.show();
            final View decorView = this.mDialog.getWindow().getDecorView();
            decorView.setTag(2131432178, (Object)this);
            decorView.setTag(2131432181, (Object)this);
            ViewTreeSavedStateRegistryOwner.b(decorView, (m5.d)this);
        }
    }
    
    public void onStop() {
        super.onStop();
        final Dialog mDialog = this.mDialog;
        if (mDialog != null) {
            mDialog.hide();
        }
    }
    
    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (this.mDialog != null && bundle != null) {
            bundle = bundle.getBundle("android:savedDialogState");
            if (bundle != null) {
                this.mDialog.onRestoreInstanceState(bundle);
            }
        }
    }
    
    public void performCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (super.mView == null && this.mDialog != null && bundle != null) {
            final Bundle bundle2 = bundle.getBundle("android:savedDialogState");
            if (bundle2 != null) {
                this.mDialog.onRestoreInstanceState(bundle2);
            }
        }
    }
    
    public final Dialog requireDialog() {
        final Dialog dialog = this.getDialog();
        if (dialog != null) {
            return dialog;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }
    
    public void setCancelable(final boolean b) {
        this.mCancelable = b;
        final Dialog mDialog = this.mDialog;
        if (mDialog != null) {
            mDialog.setCancelable(b);
        }
    }
    
    public void setShowsDialog(final boolean mShowsDialog) {
        this.mShowsDialog = mShowsDialog;
    }
    
    public void setStyle(final int mStyle, final int mTheme) {
        if (d0.M(2)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Setting style and theme for DialogFragment ");
            sb.append(this);
            sb.append(" to ");
            sb.append(mStyle);
            sb.append(", ");
            sb.append(mTheme);
            Log.d("FragmentManager", sb.toString());
        }
        this.mStyle = mStyle;
        if (mStyle == 2 || mStyle == 3) {
            this.mTheme = 16973913;
        }
        if (mTheme != 0) {
            this.mTheme = mTheme;
        }
    }
    
    public void setupDialog(final Dialog dialog, final int n) {
        if (n != 1 && n != 2) {
            if (n != 3) {
                return;
            }
            final Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }
    
    public int show(final n0 n0, final String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        n0.e(0, (Fragment)this, s, 1);
        this.mViewDestroyed = false;
        return this.mBackStackId = ((a)n0).l(false);
    }
    
    public void show(final d0 d0, final String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        final a c = g7.c(d0, d0);
        c.p = true;
        c.e(0, this, s, 1);
        c.j();
    }
    
    public void showNow(final d0 d0, final String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        final a c = g7.c(d0, d0);
        c.p = true;
        c.e(0, this, s, 1);
        c.m();
    }
}
