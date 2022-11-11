// 
// Decompiled by Procyon v0.6.0
// 

package androidx.appcompat.app;

import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import v3.h;
import androidx.core.app.TaskStackBuilder;
import android.content.res.Configuration;
import android.app.Activity;
import androidx.core.app.NavUtils;
import android.content.Intent;
import androidx.appcompat.widget.h1;
import android.view.MenuInflater;
import h.s;
import h.g;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.Window;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import androidx.activity.l;
import yg.a;
import m5.d;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import m5.b;
import android.content.res.Resources;
import androidx.core.app.TaskStackBuilder$SupportParentable;
import h.c;
import androidx.fragment.app.r;

public class f extends r implements c, TaskStackBuilder$SupportParentable
{
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private h.f mDelegate;
    private Resources mResources;
    
    public f() {
        this.initDelegate();
    }
    
    public f(final int n) {
        super(n);
        this.initDelegate();
    }
    
    private void initDelegate() {
        this.getSavedStateRegistry().c("androidx:appcompat", (b.b)new f$a(this));
        this.addOnContextAvailableListener((e.b)new f$b(this));
    }
    
    private void initViewTreeOwners() {
        ((Activity)this).getWindow().getDecorView().setTag(2131432178, (Object)this);
        ((Activity)this).getWindow().getDecorView().setTag(2131432181, (Object)this);
        ViewTreeSavedStateRegistryOwner.b(((Activity)this).getWindow().getDecorView(), (d)this);
        a.G1(((Activity)this).getWindow().getDecorView(), (l)this);
    }
    
    private boolean performMenuItemShortcut(final KeyEvent keyEvent) {
        if (Build$VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            final Window window = ((Activity)this).getWindow();
            if (window != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }
    
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.initViewTreeOwners();
        this.getDelegate().c(view, viewGroup$LayoutParams);
    }
    
    public void attachBaseContext(final Context context) {
        super.attachBaseContext(this.getDelegate().e(context));
    }
    
    public void closeOptionsMenu() {
        final h.a supportActionBar = this.getSupportActionBar();
        if (((Activity)this).getWindow().hasFeature(0) && (supportActionBar == null || !supportActionBar.a())) {
            super.closeOptionsMenu();
        }
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        final h.a supportActionBar = this.getSupportActionBar();
        return (keyCode == 82 && supportActionBar != null && supportActionBar.k(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }
    
    public <T extends View> T findViewById(final int n) {
        return (T)this.getDelegate().g(n);
    }
    
    public h.f getDelegate() {
        if (this.mDelegate == null) {
            final s.a f = h.f.f;
            this.mDelegate = (h.f)new g((Context)this, (Window)null, (c)this, (Object)this);
        }
        return this.mDelegate;
    }
    
    public h.b getDrawerToggleDelegate() {
        return (h.b)this.getDelegate().j();
    }
    
    public MenuInflater getMenuInflater() {
        return this.getDelegate().m();
    }
    
    public Resources getResources() {
        final Resources mResources = this.mResources;
        if (mResources == null) {
            final int a = h1.a;
        }
        Resources resources;
        if ((resources = mResources) == null) {
            resources = super.getResources();
        }
        return resources;
    }
    
    public h.a getSupportActionBar() {
        return this.getDelegate().n();
    }
    
    public Intent getSupportParentActivityIntent() {
        return NavUtils.getParentActivityIntent((Activity)this);
    }
    
    public void invalidateOptionsMenu() {
        this.getDelegate().p();
    }
    
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.getDelegate().r(configuration);
        if (this.mResources != null) {
            configuration = super.getResources().getConfiguration();
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
    }
    
    public void onContentChanged() {
        this.onSupportContentChanged();
    }
    
    public void onCreateSupportNavigateUpTaskStack(final TaskStackBuilder taskStackBuilder) {
        taskStackBuilder.addParentStack((Activity)this);
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        this.getDelegate().t();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return this.performMenuItemShortcut(keyEvent) || super.onKeyDown(n, keyEvent);
    }
    
    public void onLocalesChanged(final h h) {
    }
    
    @Override
    public final boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        if (super.onMenuItemSelected(n, menuItem)) {
            return true;
        }
        final h.a supportActionBar = this.getSupportActionBar();
        return menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.d() & 0x4) != 0x0 && this.onSupportNavigateUp();
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return super.onMenuOpened(n, menu);
    }
    
    public void onNightModeChanged(final int n) {
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        super.onPanelClosed(n, menu);
    }
    
    public void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        this.getDelegate().u();
    }
    
    @Override
    public void onPostResume() {
        super.onPostResume();
        this.getDelegate().v();
    }
    
    public void onPrepareSupportNavigateUpTaskStack(final TaskStackBuilder taskStackBuilder) {
    }
    
    @Override
    public void onStart() {
        super.onStart();
        this.getDelegate().x();
    }
    
    @Override
    public void onStop() {
        super.onStop();
        this.getDelegate().y();
    }
    
    public void onSupportActionModeFinished(final k.b b) {
    }
    
    public void onSupportActionModeStarted(final k.b b) {
    }
    
    @Deprecated
    public void onSupportContentChanged() {
    }
    
    public boolean onSupportNavigateUp() {
        final Intent supportParentActivityIntent = this.getSupportParentActivityIntent();
        if (supportParentActivityIntent != null) {
            if (this.supportShouldUpRecreateTask(supportParentActivityIntent)) {
                final TaskStackBuilder create = TaskStackBuilder.create((Context)this);
                this.onCreateSupportNavigateUpTaskStack(create);
                this.onPrepareSupportNavigateUpTaskStack(create);
                create.startActivities();
                try {
                    ActivityCompat.finishAffinity((Activity)this);
                }
                catch (final IllegalStateException ex) {
                    ((Activity)this).finish();
                }
            }
            else {
                this.supportNavigateUpTo(supportParentActivityIntent);
            }
            return true;
        }
        return false;
    }
    
    public void onTitleChanged(final CharSequence charSequence, final int n) {
        super.onTitleChanged(charSequence, n);
        this.getDelegate().I(charSequence);
    }
    
    public k.b onWindowStartingSupportActionMode(final k.b.a a) {
        return null;
    }
    
    public void openOptionsMenu() {
        final h.a supportActionBar = this.getSupportActionBar();
        if (((Activity)this).getWindow().hasFeature(0) && (supportActionBar == null || !supportActionBar.l())) {
            super.openOptionsMenu();
        }
    }
    
    public void setContentView(final int n) {
        this.initViewTreeOwners();
        this.getDelegate().C(n);
    }
    
    public void setContentView(final View view) {
        this.initViewTreeOwners();
        this.getDelegate().D(view);
    }
    
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.initViewTreeOwners();
        this.getDelegate().E(view, viewGroup$LayoutParams);
    }
    
    public void setSupportActionBar(final Toolbar toolbar) {
        this.getDelegate().G(toolbar);
    }
    
    @Deprecated
    public void setSupportProgress(final int n) {
    }
    
    @Deprecated
    public void setSupportProgressBarIndeterminate(final boolean b) {
    }
    
    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(final boolean b) {
    }
    
    @Deprecated
    public void setSupportProgressBarVisibility(final boolean b) {
    }
    
    public void setTheme(final int theme) {
        super.setTheme(theme);
        this.getDelegate().H(theme);
    }
    
    public k.b startSupportActionMode(final k.b.a a) {
        return this.getDelegate().J(a);
    }
    
    @Override
    public void supportInvalidateOptionsMenu() {
        this.getDelegate().p();
    }
    
    public void supportNavigateUpTo(final Intent intent) {
        NavUtils.navigateUpTo((Activity)this, intent);
    }
    
    public boolean supportRequestWindowFeature(final int n) {
        return this.getDelegate().A(n);
    }
    
    public boolean supportShouldUpRecreateTask(final Intent intent) {
        return NavUtils.shouldUpRecreateTask((Activity)this, intent);
    }
}
