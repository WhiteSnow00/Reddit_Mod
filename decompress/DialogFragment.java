// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import X.0AB;
import android.view.LayoutInflater;
import X.1nL;
import android.app.Activity;
import X.0AO;
import android.view.WindowManager$BadTokenException;
import X.KN6;
import java.lang.reflect.Field;
import X.6G9;
import X.6Nw;
import X.2Lq;
import android.os.Looper;
import android.content.ClipboardManager;
import X.2JT;
import android.os.Build$VERSION;
import android.content.Context;
import android.view.View;
import X.0RT;
import android.os.Bundle;
import android.content.DialogInterface;
import com.bytedance.covode.number.Covode;
import android.os.Handler;
import android.app.Dialog;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;

public class DialogFragment extends Fragment implements DialogInterface$OnCancelListener, DialogInterface$OnDismissListener
{
    public int mBackStackId;
    public boolean mCancelable;
    public Dialog mDialog;
    public Runnable mDismissRunnable;
    public boolean mDismissed;
    public Handler mHandler;
    public boolean mShownByMe;
    public boolean mShowsDialog;
    public int mStyle;
    public int mTheme;
    public boolean mViewDestroyed;
    
    static {
        Covode.recordClassIndex(1029);
    }
    
    public DialogFragment() {
        this.mDismissRunnable = new Runnable() {
            static {
                Covode.recordClassIndex(1030);
            }
            
            @Override
            public final void run() {
                if (DialogFragment.this.mDialog != null) {
                    final DialogFragment liz = DialogFragment.this;
                    liz.onDismiss((DialogInterface)liz.mDialog);
                }
            }
        };
        this.mStyle = 0;
        this.mTheme = 0;
        this.mCancelable = true;
        this.mShowsDialog = true;
        this.mBackStackId = -1;
    }
    
    public static Dialog INVOKEVIRTUAL_androidx_fragment_app_DialogFragment_com_bytedance_analytics_expose_HookDialog_onCreateDialog(final DialogFragment dialogFragment, final Bundle bundle) {
        final Dialog onCreateDialog = dialogFragment.onCreateDialog(bundle);
        if (0RT.LIZ(dialogFragment.hashCode())) {
            final View decorView = onCreateDialog.getWindow().getDecorView();
            if (decorView != null) {
                decorView.setTag(2131374348, (Object)true);
            }
        }
        return onCreateDialog;
    }
    
    public static void INVOKEVIRTUAL_androidx_fragment_app_DialogFragment_com_bytedance_analytics_expose_HookDialog_show(final Dialog dialog) {
        dialog.show();
        final View decorView = dialog.getWindow().getDecorView();
        if (decorView != null) {
            final Boolean b = (Boolean)decorView.getTag(2131374348);
            if (b != null && b) {
                0RT.LIZ(dialog);
                decorView.setTag(2131374349, (Object)decorView.hashCode());
            }
        }
    }
    
    public static Object INVOKEVIRTUAL_androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(Context context, String ex) {
        Label_0158: {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(ex)) {
                if (!2JT.LIZ) {
                    break Label_0158;
                }
                synchronized (ClipboardManager.class) {
                    final Object systemService = context.getSystemService((String)ex);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            final Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            ex = (Exception)new 2Lq((Handler)declaredField.get(systemService));
                            declaredField.set(systemService, ex);
                        }
                        catch (final Exception ex) {
                            6Nw.LIZ((Throwable)ex, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    return context;
                }
            }
            Label_0149: {
                if (2JT.LIZIZ || !"connectivity".equals(ex)) {
                    break Label_0149;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                    context = (Context)context.getSystemService((String)ex);
                    return context;
                }
                finally {
                    return context.getSystemService((String)ex);
                }
            }
        }
    }
    
    public static void INVOKEVIRTUAL_androidx_fragment_app_DialogFragment_com_ss_android_ugc_tiktok_security_lancet_DialogLancet_show(final Dialog dialog) {
        INVOKEVIRTUAL_androidx_fragment_app_DialogFragment_com_bytedance_analytics_expose_HookDialog_show(dialog);
        KN6.LIZ.LIZ(dialog);
    }
    
    public static void androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_onStart(final DialogFragment dialogFragment) {
        try {
            dialogFragment.androidx_fragment_app_DialogFragment__onStart$___twin___();
        }
        catch (final WindowManager$BadTokenException ex) {}
    }
    
    public void androidx_fragment_app_DialogFragment__onStart$___twin___() {
        super.onStart();
        final Dialog mDialog = this.mDialog;
        if (mDialog != null) {
            this.mViewDestroyed = false;
            INVOKEVIRTUAL_androidx_fragment_app_DialogFragment_com_ss_android_ugc_tiktok_security_lancet_DialogLancet_show(mDialog);
        }
    }
    
    public void dismiss() {
        this.dismissInternal(false, false);
    }
    
    public void dismissAllowingStateLoss() {
        this.dismissInternal(true, false);
    }
    
    public void dismissInternal(final boolean b, final boolean b2) {
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
            this.requireFragmentManager().LIZIZ(this.mBackStackId);
            this.mBackStackId = -1;
            return;
        }
        final 0AO liz = this.requireFragmentManager().LIZ();
        liz.LIZ(this);
        if (b) {
            liz.LIZJ();
            return;
        }
        liz.LIZIZ();
    }
    
    public Dialog getDialog() {
        return this.mDialog;
    }
    
    public int getTheme() {
        return this.mTheme;
    }
    
    @Override
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!this.mShowsDialog) {
            return;
        }
        final View view = this.getView();
        if (view != null) {
            if (view.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            this.mDialog.setContentView(view);
        }
        final 1nL activity = this.getActivity();
        if (activity != null) {
            this.mDialog.setOwnerActivity((Activity)activity);
        }
        this.mDialog.setCancelable(this.mCancelable);
        this.mDialog.setOnCancelListener((DialogInterface$OnCancelListener)this);
        this.mDialog.setOnDismissListener((DialogInterface$OnDismissListener)this);
        if (bundle != null) {
            bundle = bundle.getBundle("android:savedDialogState");
            if (bundle != null) {
                this.mDialog.onRestoreInstanceState(bundle);
            }
        }
    }
    
    @Override
    public void onAttach(final Context context) {
        super.onAttach(context);
        if (!this.mShownByMe) {
            this.mDismissed = false;
        }
    }
    
    public void onCancel(final DialogInterface dialogInterface) {
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.mHandler = new Handler();
        this.mShowsDialog = (super.mContainerId == 0);
        if (bundle != null) {
            this.mStyle = bundle.getInt("android:style", 0);
            this.mTheme = bundle.getInt("android:theme", 0);
            this.mCancelable = bundle.getBoolean("android:cancelable", true);
            this.mShowsDialog = bundle.getBoolean("android:showsDialog", this.mShowsDialog);
            this.mBackStackId = bundle.getInt("android:backStackId", -1);
        }
    }
    
    public Dialog onCreateDialog(final Bundle bundle) {
        return new Dialog(this.requireContext(), this.getTheme());
    }
    
    @Override
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
        }
    }
    
    @Override
    public void onDetach() {
        super.onDetach();
        if (!this.mShownByMe && !this.mDismissed) {
            this.mDismissed = true;
        }
    }
    
    public void onDismiss(final DialogInterface dialogInterface) {
        if (!this.mViewDestroyed) {
            this.dismissInternal(true, true);
        }
    }
    
    @Override
    public LayoutInflater onGetLayoutInflater(final Bundle bundle) {
        if (!this.mShowsDialog) {
            return super.onGetLayoutInflater(bundle);
        }
        final Dialog invokevirtual_androidx_fragment_app_DialogFragment_com_bytedance_analytics_expose_HookDialog_onCreateDialog = INVOKEVIRTUAL_androidx_fragment_app_DialogFragment_com_bytedance_analytics_expose_HookDialog_onCreateDialog(this, bundle);
        if ((this.mDialog = invokevirtual_androidx_fragment_app_DialogFragment_com_bytedance_analytics_expose_HookDialog_onCreateDialog) != null) {
            this.setupDialog(invokevirtual_androidx_fragment_app_DialogFragment_com_bytedance_analytics_expose_HookDialog_onCreateDialog, this.mStyle);
            return (LayoutInflater)INVOKEVIRTUAL_androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(this.mDialog.getContext(), "layout_inflater");
        }
        return (LayoutInflater)INVOKEVIRTUAL_androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_lancet_GetSystemServiceLancet_getSystemService(super.mHost.LIZJ, "layout_inflater");
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final Dialog mDialog = this.mDialog;
        if (mDialog != null) {
            final Bundle onSaveInstanceState = mDialog.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        final int mStyle = this.mStyle;
        if (mStyle != 0) {
            bundle.putInt("android:style", mStyle);
        }
        final int mTheme = this.mTheme;
        if (mTheme != 0) {
            bundle.putInt("android:theme", mTheme);
        }
        final boolean mCancelable = this.mCancelable;
        if (!mCancelable) {
            bundle.putBoolean("android:cancelable", mCancelable);
        }
        final boolean mShowsDialog = this.mShowsDialog;
        if (!mShowsDialog) {
            bundle.putBoolean("android:showsDialog", mShowsDialog);
        }
        final int mBackStackId = this.mBackStackId;
        if (mBackStackId != -1) {
            bundle.putInt("android:backStackId", mBackStackId);
        }
    }
    
    @Override
    public void onStart() {
        androidx_fragment_app_DialogFragment_com_ss_android_ugc_aweme_utils_DesignBugFixLancet_onStart(this);
    }
    
    @Override
    public void onStop() {
        super.onStop();
        final Dialog mDialog = this.mDialog;
        if (mDialog != null) {
            mDialog.hide();
        }
    }
    
    public final Dialog requireDialog() {
        final Dialog dialog = this.getDialog();
        if (dialog != null) {
            return dialog;
        }
        final StringBuilder sb = new StringBuilder("DialogFragment ");
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
    
    public void setStyle(final int mStyle, final int mTheme) {
        this.mStyle = mStyle;
        if (mStyle == 2 || mStyle == 3) {
            this.mTheme = 16973913;
        }
        if (mTheme != 0) {
            this.mTheme = mTheme;
        }
    }
    
    public void setupDialog(final Dialog dialog, final int n) {
        Label_0025: {
            if (n == 1 || n == 2) {
                break Label_0025;
            }
            if (n == 3) {
                dialog.getWindow().addFlags(24);
                break Label_0025;
            }
            return;
        }
        dialog.requestWindowFeature(1);
    }
    
    public int show(final 0AO 0ao, final String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        0ao.LIZ(this, s);
        this.mViewDestroyed = false;
        return this.mBackStackId = 0ao.LIZIZ();
    }
    
    public void show(final 0AB 0ab, final String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        final 0AO liz = 0ab.LIZ();
        liz.LIZ(this, s);
        liz.LIZIZ();
    }
    
    public void showNow(final 0AB 0ab, final String s) {
        this.mDismissed = false;
        this.mShownByMe = true;
        final 0AO liz = 0ab.LIZ();
        liz.LIZ(this, s);
        liz.LIZLLL();
    }
}
