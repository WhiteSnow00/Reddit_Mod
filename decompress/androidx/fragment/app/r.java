// 
// Decompiled by Procyon v0.6.0
// 

package androidx.fragment.app;

import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.app.Activity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.SharedElementCallback;
import android.view.MenuItem;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import androidx.lifecycle.Lifecycle;
import z3.a;
import m5.b;
import androidx.activity.c;
import android.os.Bundle;
import android.content.Context;
import android.content.res.Configuration;
import android.content.Intent;
import androidx.lifecycle.q;
import androidx.core.app.ActivityCompat$RequestPermissionsRequestCodeValidator;
import androidx.core.app.ActivityCompat$OnRequestPermissionsResultCallback;
import androidx.activity.ComponentActivity;

public class r extends ComponentActivity implements ActivityCompat$OnRequestPermissionsResultCallback, ActivityCompat$RequestPermissionsRequestCodeValidator
{
    public static final String LIFECYCLE_TAG = "android:support:lifecycle";
    public boolean mCreated;
    public final androidx.lifecycle.r mFragmentLifecycleRegistry;
    public final v mFragments;
    public boolean mResumed;
    public boolean mStopped;
    
    public r() {
        this.mFragments = new v(new r.r$a(this));
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.r((q)this);
        this.mStopped = true;
        this.init();
    }
    
    public r(final int n) {
        super(n);
        this.mFragments = new v(new r.r$a(this));
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.r((q)this);
        this.mStopped = true;
        this.init();
    }
    
    private void init() {
        this.getSavedStateRegistry().c("android:support:lifecycle", (b.b)new c((ComponentActivity)this, 1));
        this.addOnConfigurationChangedListener((a)new o(this, 0));
        this.addOnNewIntentListener((a)new p(this));
        this.addOnContextAvailableListener((e.b)new androidx.fragment.app.q(this));
    }
    
    private void lambda$init$3(final Context context) {
        final x<?> a = this.mFragments.a;
        a.i.c((x)a, (t)a, (Fragment)null);
    }
    
    private static boolean markState(final d0 d0, final Lifecycle.State state) {
        final Iterator iterator = d0.J().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Fragment fragment = (Fragment)iterator.next();
            if (fragment == null) {
                continue;
            }
            boolean b = n != 0;
            if (fragment.getHost() != null) {
                b = ((n | (markState(fragment.getChildFragmentManager(), state) ? 1 : 0)) != 0x0);
            }
            final v0 mViewLifecycleOwner = fragment.mViewLifecycleOwner;
            n = (b ? 1 : 0);
            if (mViewLifecycleOwner != null) {
                mViewLifecycleOwner.b();
                n = (b ? 1 : 0);
                if (mViewLifecycleOwner.i.c.isAtLeast(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.i.h(state);
                    n = (true ? 1 : 0);
                }
            }
            if (!fragment.mLifecycleRegistry.c.isAtLeast(Lifecycle.State.STARTED)) {
                continue;
            }
            fragment.mLifecycleRegistry.h(state);
            n = (true ? 1 : 0);
        }
        return n != 0;
    }
    
    public final View dispatchFragmentsOnCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        return this.mFragments.a.i.f.onCreateView(view, s, context, set);
    }
    
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.dump(s, fileDescriptor, printWriter, array);
        if (!((androidx.core.app.ComponentActivity)this).shouldDumpInternalState(array)) {
            return;
        }
        printWriter.print(s);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("  ");
        final String string = sb.toString();
        printWriter.print(string);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (((Activity)this).getApplication() != null) {
            w4.a.a((q)this).c(string, printWriter);
        }
        this.mFragments.a.i.w(s, fileDescriptor, printWriter, array);
    }
    
    public d0 getSupportFragmentManager() {
        return this.mFragments.a.i;
    }
    
    @Deprecated
    public w4.a getSupportLoaderManager() {
        return w4.a.a((q)this);
    }
    
    public void markFragmentsCreated() {
        while (markState(this.getSupportFragmentManager(), Lifecycle.State.CREATED)) {}
    }
    
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        this.mFragments.a();
        super.onActivityResult(n, n2, intent);
    }
    
    @Deprecated
    public void onAttachFragment(final Fragment fragment) {
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
        final e0 i = this.mFragments.a.i;
        i.G = false;
        i.H = false;
        i.N.i = false;
        i.u(1);
    }
    
    public View onCreateView(final View view, final String s, final Context context, final AttributeSet set) {
        final View dispatchFragmentsOnCreateView = this.dispatchFragmentsOnCreateView(view, s, context, set);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(view, s, context, set);
        }
        return dispatchFragmentsOnCreateView;
    }
    
    public View onCreateView(final String s, final Context context, final AttributeSet set) {
        final View dispatchFragmentsOnCreateView = this.dispatchFragmentsOnCreateView(null, s, context, set);
        if (dispatchFragmentsOnCreateView == null) {
            return super.onCreateView(s, context, set);
        }
        return dispatchFragmentsOnCreateView;
    }
    
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.a.i.l();
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_DESTROY);
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return super.onMenuItemSelected(n, menuItem) || (n == 6 && this.mFragments.a.i.j(menuItem));
    }
    
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.a.i.u(5);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_PAUSE);
    }
    
    public void onPostResume() {
        super.onPostResume();
        this.onResumeFragments();
    }
    
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        this.mFragments.a();
        super.onRequestPermissionsResult(n, array, array2);
    }
    
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.a.i.z(true);
    }
    
    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_RESUME);
        final e0 i = this.mFragments.a.i;
        i.G = false;
        i.H = false;
        i.N.i = false;
        i.u(7);
    }
    
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            final e0 i = this.mFragments.a.i;
            i.G = false;
            i.H = false;
            i.N.i = false;
            i.u(4);
        }
        this.mFragments.a.i.z(true);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_START);
        final e0 j = this.mFragments.a.i;
        j.G = false;
        j.H = false;
        j.N.i = false;
        j.u(5);
    }
    
    public void onStateNotSaved() {
        this.mFragments.a();
    }
    
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        this.markFragmentsCreated();
        final e0 i = this.mFragments.a.i;
        i.H = true;
        i.N.i = true;
        i.u(4);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
    }
    
    public void setEnterSharedElementCallback(final SharedElementCallback sharedElementCallback) {
        ActivityCompat.setEnterSharedElementCallback((Activity)this, sharedElementCallback);
    }
    
    public void setExitSharedElementCallback(final SharedElementCallback sharedElementCallback) {
        ActivityCompat.setExitSharedElementCallback((Activity)this, sharedElementCallback);
    }
    
    public void startActivityFromFragment(final Fragment fragment, final Intent intent, final int n) {
        this.startActivityFromFragment(fragment, intent, n, null);
    }
    
    public void startActivityFromFragment(final Fragment fragment, final Intent intent, final int n, final Bundle bundle) {
        if (n == -1) {
            ActivityCompat.startActivityForResult((Activity)this, intent, -1, bundle);
            return;
        }
        fragment.startActivityForResult(intent, n, bundle);
    }
    
    @Deprecated
    public void startIntentSenderFromFragment(final Fragment fragment, final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) throws IntentSender$SendIntentException {
        if (n == -1) {
            ActivityCompat.startIntentSenderForResult((Activity)this, intentSender, n, intent, n2, n3, n4, bundle);
            return;
        }
        fragment.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4, bundle);
    }
    
    public void supportFinishAfterTransition() {
        ActivityCompat.finishAfterTransition((Activity)this);
    }
    
    @Deprecated
    public void supportInvalidateOptionsMenu() {
        ((Activity)this).invalidateOptionsMenu();
    }
    
    public void supportPostponeEnterTransition() {
        ActivityCompat.postponeEnterTransition((Activity)this);
    }
    
    public void supportStartPostponedEnterTransition() {
        ActivityCompat.startPostponedEnterTransition((Activity)this);
    }
    
    @Deprecated
    public final void validateRequestPermissionsRequestCode(final int n) {
    }
}
