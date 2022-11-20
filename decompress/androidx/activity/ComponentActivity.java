// 
// Decompiled by Procyon v0.6.0
// 

package androidx.activity;

import android.os.BaseBundle;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.os.Trace;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.Menu;
import android.app.Activity;
import androidx.lifecycle.d0;
import java.util.Iterator;
import android.app.Application;
import androidx.lifecycle.h0;
import androidx.lifecycle.m0;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.Lifecycle;
import a4.l;
import a4.n$a;
import a4.v;
import android.view.ViewGroup$LayoutParams;
import java.util.Random;
import java.io.Serializable;
import java.util.Collection;
import java.util.ArrayList;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import android.os.Bundle;
import android.content.Context;
import l5.b$b;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.p;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import androidx.lifecycle.p0;
import androidx.core.app.PictureInPictureModeChangedInfo;
import android.content.Intent;
import androidx.core.app.MultiWindowModeChangedInfo;
import android.content.res.Configuration;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import a4.n;
import androidx.lifecycle.r;
import androidx.lifecycle.n0$b;
import e.a;
import androidx.activity.result.f;
import a4.k;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import n3.c;
import androidx.activity.result.g;
import l5.d;
import androidx.lifecycle.i;
import androidx.lifecycle.q0;

public class ComponentActivity extends androidx.core.app.ComponentActivity implements q0, i, d, m, g, c, n3.d, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, k
{
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final f mActivityResultRegistry;
    private int mContentLayoutId;
    public final a mContextAwareHelper;
    private n0$b mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    private final r mLifecycleRegistry;
    private final n mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<z3.a<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<z3.a<MultiWindowModeChangedInfo>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<z3.a<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<z3.a<PictureInPictureModeChangedInfo>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<z3.a<Integer>> mOnTrimMemoryListeners;
    public final l5.c mSavedStateRegistryController;
    private p0 mViewModelStore;
    
    public ComponentActivity() {
        this.mContextAwareHelper = new a();
        this.mMenuHostHelper = new n(new b((Object)this, 0));
        this.mLifecycleRegistry = new r((q)this);
        final l5.c mSavedStateRegistryController = new l5.c((d)this);
        this.mSavedStateRegistryController = mSavedStateRegistryController;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher((Runnable)new ComponentActivity$a(this));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = (f)new ComponentActivity$b(this);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<z3.a<Configuration>>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<z3.a<Integer>>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<z3.a<Intent>>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<z3.a<MultiWindowModeChangedInfo>>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<z3.a<PictureInPictureModeChangedInfo>>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (this.getLifecycle() != null) {
            this.getLifecycle().a((p)new o(this) {
                public final ComponentActivity f;
                
                public final void f(final q q, final Lifecycle$Event lifecycle$Event) {
                    if (lifecycle$Event == Lifecycle$Event.ON_STOP) {
                        final Window window = this.f.getWindow();
                        View peekDecorView;
                        if (window != null) {
                            peekDecorView = window.peekDecorView();
                        }
                        else {
                            peekDecorView = null;
                        }
                        if (peekDecorView != null) {
                            peekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
            this.getLifecycle().a((p)new o(this) {
                public final ComponentActivity f;
                
                public final void f(final q q, final Lifecycle$Event lifecycle$Event) {
                    if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                        this.f.mContextAwareHelper.b = null;
                        if (!this.f.isChangingConfigurations()) {
                            this.f.getViewModelStore().a();
                        }
                    }
                }
            });
            this.getLifecycle().a((p)new o(this) {
                public final ComponentActivity f;
                
                public final void f(final q q, final Lifecycle$Event lifecycle$Event) {
                    this.f.ensureViewModelStore();
                    this.f.getLifecycle().c((p)this);
                }
            });
            mSavedStateRegistryController.a();
            SavedStateHandleSupport.b((d)this);
            this.getSavedStateRegistry().c("android:support:activity-result", (b$b)new androidx.activity.c(this));
            this.addOnContextAvailableListener((e.b)new d(this, 0));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }
    
    public ComponentActivity(final int mContentLayoutId) {
        this();
        this.mContentLayoutId = mContentLayoutId;
    }
    
    public static void Z(final ComponentActivity componentActivity, final Context context) {
        componentActivity.lambda$new$1(context);
    }
    
    public static Bundle a0(final ComponentActivity componentActivity) {
        return componentActivity.lambda$new$0();
    }
    
    public static void access$001(final ComponentActivity componentActivity) {
        componentActivity.onBackPressed();
    }
    
    private void initViewTreeOwners() {
        this.getWindow().getDecorView().setTag(2131432184, (Object)this);
        this.getWindow().getDecorView().setTag(2131432187, (Object)this);
        ViewTreeSavedStateRegistryOwner.b(this.getWindow().getDecorView(), (d)this);
        vl.a.e3(this.getWindow().getDecorView(), (m)this);
    }
    
    private Bundle lambda$new$0() {
        final Bundle bundle = new Bundle();
        final f mActivityResultRegistry = this.mActivityResultRegistry;
        mActivityResultRegistry.getClass();
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(mActivityResultRegistry.c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(mActivityResultRegistry.c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(mActivityResultRegistry.e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle)mActivityResultRegistry.h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", (Serializable)mActivityResultRegistry.a);
        return bundle;
    }
    
    private void lambda$new$1(final Context context) {
        final Bundle a = this.getSavedStateRegistry().a("android:support:activity-result");
        if (a != null) {
            final f mActivityResultRegistry = this.mActivityResultRegistry;
            mActivityResultRegistry.getClass();
            final ArrayList integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            final ArrayList stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null) {
                if (integerArrayList != null) {
                    mActivityResultRegistry.e = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    mActivityResultRegistry.a = (Random)a.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                    mActivityResultRegistry.h.putAll(a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                    for (int i = 0; i < stringArrayList.size(); ++i) {
                        final String s = stringArrayList.get(i);
                        if (mActivityResultRegistry.c.containsKey(s)) {
                            final Integer n = mActivityResultRegistry.c.remove(s);
                            if (!((BaseBundle)mActivityResultRegistry.h).containsKey(s)) {
                                mActivityResultRegistry.b.remove(n);
                            }
                        }
                        final int intValue = integerArrayList.get(i);
                        final String s2 = stringArrayList.get(i);
                        mActivityResultRegistry.b.put(intValue, s2);
                        mActivityResultRegistry.c.put(s2, intValue);
                    }
                }
            }
        }
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.initViewTreeOwners();
        super.addContentView(view, viewGroup$LayoutParams);
    }
    
    public void addMenuProvider(final v v) {
        final n mMenuHostHelper = this.mMenuHostHelper;
        mMenuHostHelper.b.add(v);
        mMenuHostHelper.a.run();
    }
    
    public void addMenuProvider(final v v, final q q) {
        final n mMenuHostHelper = this.mMenuHostHelper;
        mMenuHostHelper.b.add(v);
        mMenuHostHelper.a.run();
        final Lifecycle lifecycle = q.getLifecycle();
        final n$a n$a = mMenuHostHelper.c.remove(v);
        if (n$a != null) {
            n$a.a.c((p)n$a.b);
            n$a.b = null;
        }
        mMenuHostHelper.c.put(v, new n$a(lifecycle, (o)new l(mMenuHostHelper, v)));
    }
    
    public void addMenuProvider(final v v, final q q, final Lifecycle$State lifecycle$State) {
        final n mMenuHostHelper = this.mMenuHostHelper;
        mMenuHostHelper.getClass();
        final Lifecycle lifecycle = q.getLifecycle();
        final n$a n$a = mMenuHostHelper.c.remove(v);
        if (n$a != null) {
            n$a.a.c((p)n$a.b);
            n$a.b = null;
        }
        mMenuHostHelper.c.put(v, new n$a(lifecycle, (o)new a4.m(mMenuHostHelper, lifecycle$State, v)));
    }
    
    public final void addOnConfigurationChangedListener(final z3.a<Configuration> a) {
        this.mOnConfigurationChangedListeners.add(a);
    }
    
    public final void addOnContextAvailableListener(final e.b b) {
        final a mContextAwareHelper = this.mContextAwareHelper;
        if (mContextAwareHelper.b != null) {
            b.a(mContextAwareHelper.b);
        }
        mContextAwareHelper.a.add(b);
    }
    
    public final void addOnMultiWindowModeChangedListener(final z3.a<MultiWindowModeChangedInfo> a) {
        this.mOnMultiWindowModeChangedListeners.add(a);
    }
    
    public final void addOnNewIntentListener(final z3.a<Intent> a) {
        this.mOnNewIntentListeners.add(a);
    }
    
    public final void addOnPictureInPictureModeChangedListener(final z3.a<PictureInPictureModeChangedInfo> a) {
        this.mOnPictureInPictureModeChangedListeners.add(a);
    }
    
    public final void addOnTrimMemoryListener(final z3.a<Integer> a) {
        this.mOnTrimMemoryListeners.add(a);
    }
    
    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            final ComponentActivity.ComponentActivity$d componentActivity$d = (ComponentActivity.ComponentActivity$d)this.getLastNonConfigurationInstance();
            if (componentActivity$d != null) {
                this.mViewModelStore = componentActivity$d.b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new p0();
            }
        }
    }
    
    public final f getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }
    
    public u4.a getDefaultViewModelCreationExtras() {
        final u4.c c = new u4.c();
        if (this.getApplication() != null) {
            ((u4.a)c).a.put(m0.a, this.getApplication());
        }
        ((u4.a)c).a.put(SavedStateHandleSupport.a, this);
        ((u4.a)c).a.put(SavedStateHandleSupport.b, this);
        if (this.getIntent() != null && this.getIntent().getExtras() != null) {
            ((u4.a)c).a.put(SavedStateHandleSupport.c, this.getIntent().getExtras());
        }
        return (u4.a)c;
    }
    
    public n0$b getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            final Application application = this.getApplication();
            Bundle extras;
            if (this.getIntent() != null) {
                extras = this.getIntent().getExtras();
            }
            else {
                extras = null;
            }
            this.mDefaultFactory = (n0$b)new h0(application, (d)this, extras);
        }
        return this.mDefaultFactory;
    }
    
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        final ComponentActivity.ComponentActivity$d componentActivity$d = (ComponentActivity.ComponentActivity$d)this.getLastNonConfigurationInstance();
        Object a;
        if (componentActivity$d != null) {
            a = componentActivity$d.a;
        }
        else {
            a = null;
        }
        return a;
    }
    
    @Override
    public Lifecycle getLifecycle() {
        return (Lifecycle)this.mLifecycleRegistry;
    }
    
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }
    
    public final l5.b getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b;
    }
    
    public p0 getViewModelStore() {
        if (this.getApplication() != null) {
            this.ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }
    
    public void invalidateMenu() {
        this.invalidateOptionsMenu();
    }
    
    @Deprecated
    public void onActivityResult(final int n, final int n2, final Intent intent) {
        if (!this.mActivityResultRegistry.a(n, n2, intent)) {
            super.onActivityResult(n, n2, intent);
        }
    }
    
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.b();
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final Iterator<z3.a<Configuration>> iterator = this.mOnConfigurationChangedListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(configuration);
        }
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        final a mContextAwareHelper = this.mContextAwareHelper;
        mContextAwareHelper.b = (Context)this;
        final Iterator iterator = mContextAwareHelper.a.iterator();
        while (iterator.hasNext()) {
            ((e.b)iterator.next()).a((Context)this);
        }
        super.onCreate(bundle);
        d0.c((Activity)this);
        if (v3.a.b()) {
            final OnBackPressedDispatcher mOnBackPressedDispatcher = this.mOnBackPressedDispatcher;
            mOnBackPressedDispatcher.e = ComponentActivity.ComponentActivity$c.a((Activity)this);
            mOnBackPressedDispatcher.c();
        }
        final int mContentLayoutId = this.mContentLayoutId;
        if (mContentLayoutId != 0) {
            this.setContentView(mContentLayoutId);
        }
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        if (n == 0) {
            super.onCreatePanelMenu(n, menu);
            final n mMenuHostHelper = this.mMenuHostHelper;
            final MenuInflater menuInflater = this.getMenuInflater();
            final Iterator iterator = mMenuHostHelper.b.iterator();
            while (iterator.hasNext()) {
                ((v)iterator.next()).a(menu, menuInflater);
            }
        }
        return true;
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        final boolean onMenuItemSelected = super.onMenuItemSelected(n, menuItem);
        boolean b = true;
        if (onMenuItemSelected) {
            return true;
        }
        if (n == 0) {
            final Iterator iterator = this.mMenuHostHelper.b.iterator();
            while (iterator.hasNext()) {
                if (((v)iterator.next()).d(menuItem)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    public void onMultiWindowModeChanged(final boolean b) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        final Iterator<z3.a<MultiWindowModeChangedInfo>> iterator = this.mOnMultiWindowModeChangedListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(new MultiWindowModeChangedInfo(b));
        }
    }
    
    public void onMultiWindowModeChanged(final boolean b, final Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(b, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            final Iterator<z3.a<MultiWindowModeChangedInfo>> iterator = this.mOnMultiWindowModeChangedListeners.iterator();
            while (iterator.hasNext()) {
                iterator.next().accept(new MultiWindowModeChangedInfo(b, configuration));
            }
        }
        finally {
            this.mDispatchingOnMultiWindowModeChanged = false;
        }
    }
    
    public void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        final Iterator<z3.a<Intent>> iterator = this.mOnNewIntentListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(intent);
        }
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        final Iterator iterator = this.mMenuHostHelper.b.iterator();
        while (iterator.hasNext()) {
            ((v)iterator.next()).b(menu);
        }
        super.onPanelClosed(n, menu);
    }
    
    public void onPictureInPictureModeChanged(final boolean b) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        final Iterator<z3.a<PictureInPictureModeChangedInfo>> iterator = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(new PictureInPictureModeChangedInfo(b));
        }
    }
    
    public void onPictureInPictureModeChanged(final boolean b, final Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(b, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            final Iterator<z3.a<PictureInPictureModeChangedInfo>> iterator = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (iterator.hasNext()) {
                iterator.next().accept(new PictureInPictureModeChangedInfo(b, configuration));
            }
        }
        finally {
            this.mDispatchingOnPictureInPictureModeChanged = false;
        }
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        if (n == 0) {
            super.onPreparePanel(n, view, menu);
            final Iterator iterator = this.mMenuHostHelper.b.iterator();
            while (iterator.hasNext()) {
                ((v)iterator.next()).c(menu);
            }
        }
        return true;
    }
    
    @Deprecated
    public void onRequestPermissionsResult(final int n, final String[] array, final int[] array2) {
        if (!this.mActivityResultRegistry.a(n, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", array).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", array2))) {
            super.onRequestPermissionsResult(n, array, array2);
        }
    }
    
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }
    
    public final Object onRetainNonConfigurationInstance() {
        final Object onRetainCustomNonConfigurationInstance = this.onRetainCustomNonConfigurationInstance();
        p0 b;
        final p0 p0 = b = this.mViewModelStore;
        if (p0 == null) {
            final ComponentActivity.ComponentActivity$d componentActivity$d = (ComponentActivity.ComponentActivity$d)this.getLastNonConfigurationInstance();
            b = p0;
            if (componentActivity$d != null) {
                b = componentActivity$d.b;
            }
        }
        if (b == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        final ComponentActivity.ComponentActivity$d componentActivity$d2 = new ComponentActivity.ComponentActivity$d();
        componentActivity$d2.a = onRetainCustomNonConfigurationInstance;
        componentActivity$d2.b = b;
        return componentActivity$d2;
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        final Lifecycle lifecycle = this.getLifecycle();
        if (lifecycle instanceof r) {
            ((r)lifecycle).h(Lifecycle$State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }
    
    public void onTrimMemory(final int n) {
        super.onTrimMemory(n);
        final Iterator<z3.a<Integer>> iterator = this.mOnTrimMemoryListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(n);
        }
    }
    
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.b;
    }
    
    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(final f.a<I, O> a, final androidx.activity.result.b<O> b) {
        return this.registerForActivityResult((f.a<I, Object>)a, this.mActivityResultRegistry, (androidx.activity.result.b<Object>)b);
    }
    
    public final <I, O> androidx.activity.result.c<I> registerForActivityResult(final f.a<I, O> a, final f f, final androidx.activity.result.b<O> b) {
        final StringBuilder t = a.t("activity_rq#");
        t.append(this.mNextLocalRequestCode.getAndIncrement());
        return (androidx.activity.result.c<I>)f.c(t.toString(), (q)this, (f.a)a, (androidx.activity.result.b)b);
    }
    
    public void removeMenuProvider(final v v) {
        this.mMenuHostHelper.a(v);
    }
    
    public final void removeOnConfigurationChangedListener(final z3.a<Configuration> a) {
        this.mOnConfigurationChangedListeners.remove(a);
    }
    
    public final void removeOnContextAvailableListener(final e.b b) {
        this.mContextAwareHelper.a.remove(b);
    }
    
    public final void removeOnMultiWindowModeChangedListener(final z3.a<MultiWindowModeChangedInfo> a) {
        this.mOnMultiWindowModeChangedListeners.remove(a);
    }
    
    public final void removeOnNewIntentListener(final z3.a<Intent> a) {
        this.mOnNewIntentListeners.remove(a);
    }
    
    public final void removeOnPictureInPictureModeChangedListener(final z3.a<PictureInPictureModeChangedInfo> a) {
        this.mOnPictureInPictureModeChangedListeners.remove(a);
    }
    
    public final void removeOnTrimMemoryListener(final z3.a<Integer> a) {
        this.mOnTrimMemoryListeners.remove(a);
    }
    
    public void reportFullyDrawn() {
        Label_0027: {
            try {
                if (s5.a.a()) {
                    Trace.beginSection("reportFullyDrawn() for ComponentActivity");
                }
            }
            finally {
                break Label_0027;
            }
            super.reportFullyDrawn();
            Trace.endSection();
            return;
        }
        Trace.endSection();
    }
    
    public void setContentView(final int contentView) {
        this.initViewTreeOwners();
        super.setContentView(contentView);
    }
    
    public void setContentView(final View contentView) {
        this.initViewTreeOwners();
        super.setContentView(contentView);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.initViewTreeOwners();
        super.setContentView(view, viewGroup$LayoutParams);
    }
    
    @Deprecated
    public void startActivityForResult(final Intent intent, final int n) {
        super.startActivityForResult(intent, n);
    }
    
    @Deprecated
    public void startActivityForResult(final Intent intent, final int n, final Bundle bundle) {
        super.startActivityForResult(intent, n, bundle);
    }
    
    @Deprecated
    public void startIntentSenderForResult(final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4) throws IntentSender$SendIntentException {
        super.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4);
    }
    
    @Deprecated
    public void startIntentSenderForResult(final IntentSender intentSender, final int n, final Intent intent, final int n2, final int n3, final int n4, final Bundle bundle) throws IntentSender$SendIntentException {
        super.startIntentSenderForResult(intentSender, n, intent, n2, n3, n4, bundle);
    }
}
