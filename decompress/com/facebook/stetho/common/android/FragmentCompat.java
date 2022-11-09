// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common.android;

import com.facebook.stetho.common.ReflectionUtil;
import android.app.Activity;

public abstract class FragmentCompat<FRAGMENT, DIALOG_FRAGMENT, FRAGMENT_MANAGER, FRAGMENT_ACTIVITY extends Activity>
{
    private static FragmentCompat sFrameworkInstance;
    private static final boolean sHasSupportFragment;
    private static FragmentCompat sSupportInstance;
    
    static {
        sHasSupportFragment = (ReflectionUtil.tryGetClassForName("androidx.fragment.app.Fragment") != null);
    }
    
    public static FragmentCompat getFrameworkInstance() {
        if (FragmentCompat.sFrameworkInstance == null) {
            FragmentCompat.sFrameworkInstance = (FragmentCompat)new FragmentCompatFramework();
        }
        return FragmentCompat.sFrameworkInstance;
    }
    
    public static FragmentCompat getSupportLibInstance() {
        if (FragmentCompat.sSupportInstance == null && FragmentCompat.sHasSupportFragment) {
            FragmentCompat.sSupportInstance = (FragmentCompat)new FragmentCompatSupportLib();
        }
        return FragmentCompat.sSupportInstance;
    }
    
    public abstract DialogFragmentAccessor<DIALOG_FRAGMENT, FRAGMENT, FRAGMENT_MANAGER> forDialogFragment();
    
    public abstract FragmentAccessor<FRAGMENT, FRAGMENT_MANAGER> forFragment();
    
    public abstract FragmentActivityAccessor<FRAGMENT_ACTIVITY, FRAGMENT_MANAGER> forFragmentActivity();
    
    public abstract FragmentManagerAccessor<FRAGMENT_MANAGER, FRAGMENT> forFragmentManager();
    
    public abstract Class<DIALOG_FRAGMENT> getDialogFragmentClass();
    
    public abstract Class<FRAGMENT_ACTIVITY> getFragmentActivityClass();
    
    public abstract Class<FRAGMENT> getFragmentClass();
}
