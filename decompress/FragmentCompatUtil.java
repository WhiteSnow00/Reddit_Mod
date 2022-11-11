// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common.android;

import java.util.List;
import android.app.Activity;
import android.view.View;

public final class FragmentCompatUtil
{
    private FragmentCompatUtil() {
    }
    
    public static Object findFragmentForView(final View view) {
        final Activity tryGetActivity = ViewUtil.tryGetActivity(view);
        if (tryGetActivity == null) {
            return null;
        }
        return findFragmentForViewInActivity(tryGetActivity, view);
    }
    
    private static Object findFragmentForViewInActivity(final Activity activity, final View view) {
        final FragmentCompat<Object, Object, Object, Activity> supportLibInstance = FragmentCompat.getSupportLibInstance();
        if (supportLibInstance != null && supportLibInstance.getFragmentActivityClass().isInstance(activity)) {
            final Object fragmentForViewInActivity = findFragmentForViewInActivity(supportLibInstance, activity, view);
            if (fragmentForViewInActivity != null) {
                return fragmentForViewInActivity;
            }
        }
        final FragmentCompat<Object, Object, Object, Activity> frameworkInstance = FragmentCompat.getFrameworkInstance();
        if (frameworkInstance != null) {
            final Object fragmentForViewInActivity2 = findFragmentForViewInActivity(frameworkInstance, activity, view);
            if (fragmentForViewInActivity2 != null) {
                return fragmentForViewInActivity2;
            }
        }
        return null;
    }
    
    private static Object findFragmentForViewInActivity(final FragmentCompat fragmentCompat, final Activity activity, final View view) {
        final Object fragmentManager = fragmentCompat.forFragmentActivity().getFragmentManager(activity);
        if (fragmentManager != null) {
            return findFragmentForViewInFragmentManager(fragmentCompat, fragmentManager, view);
        }
        return null;
    }
    
    private static Object findFragmentForViewInFragment(final FragmentCompat fragmentCompat, Object childFragmentManager, final View view) {
        final FragmentAccessor forFragment = fragmentCompat.forFragment();
        if (forFragment.getView(childFragmentManager) == view) {
            return childFragmentManager;
        }
        childFragmentManager = forFragment.getChildFragmentManager(childFragmentManager);
        if (childFragmentManager != null) {
            return findFragmentForViewInFragmentManager(fragmentCompat, childFragmentManager, view);
        }
        return null;
    }
    
    private static Object findFragmentForViewInFragmentManager(final FragmentCompat fragmentCompat, Object fragmentForViewInFragment, final View view) {
        final List<Object> addedFragments = fragmentCompat.forFragmentManager().getAddedFragments(fragmentForViewInFragment);
        if (addedFragments != null) {
            for (int i = 0; i < addedFragments.size(); ++i) {
                fragmentForViewInFragment = findFragmentForViewInFragment(fragmentCompat, addedFragments.get(i), view);
                if (fragmentForViewInFragment != null) {
                    return fragmentForViewInFragment;
                }
            }
        }
        return null;
    }
    
    public static boolean isDialogFragment(final Object o) {
        final FragmentCompat<Object, Object, Object, Activity> supportLibInstance = FragmentCompat.getSupportLibInstance();
        if (supportLibInstance != null && supportLibInstance.getDialogFragmentClass().isInstance(o)) {
            return true;
        }
        final FragmentCompat<Object, Object, Object, Activity> frameworkInstance = FragmentCompat.getFrameworkInstance();
        return frameworkInstance != null && frameworkInstance.getDialogFragmentClass().isInstance(o);
    }
}
