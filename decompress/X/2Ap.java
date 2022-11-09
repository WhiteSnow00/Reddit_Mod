// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.Menu;
import android.view.MenuItem;
import android.content.ComponentName;
import android.os.Bundle;
import android.content.Intent;
import android.view.MenuInflater;
import android.app.Activity;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.view.Window;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import android.content.res.Configuration;
import kotlin.jvm.internal.n;
import java.util.Objects;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.setting.TiktokSkinHelper;
import com.bytedance.covode.number.Covode;
import android.content.res.Resources;

public class 2Ap extends 1nL implements 026, 06S.a
{
    public 027 mDelegate;
    public Resources mResources;
    public Object rewordResources;
    
    static {
        Covode.recordClassIndex(262);
    }
    
    public 2Ap() {
    }
    
    public 2Ap(final int n) {
        super(n);
    }
    
    public static Resources androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources(final 2Ap 2Ap) {
        final Resources androidx_appcompat_app_AppCompatActivity__getResources$___twin___ = 2Ap.androidx_appcompat_app_AppCompatActivity__getResources$___twin___();
        TiktokSkinHelper.LIZ(androidx_appcompat_app_AppCompatActivity__getResources$___twin___);
        return androidx_appcompat_app_AppCompatActivity__getResources$___twin___;
    }
    
    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_recreate(final 2Ap 2Ap) {
        2Ap.androidx_appcompat_app_AppCompatActivity__recreate$___twin___();
        try {
            throw new RuntimeException("Activity recreated!");
        }
        catch (final Exception ex) {
            6Q0.LIZ((Throwable)ex);
        }
    }
    
    public static void androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ViewInflateLancet_setContentView(final 2Ap 2Ap, final int n) {
        if (!6Vs.LIZ()) {
            2Ap.androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(n);
            return;
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        2Ap.androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(n);
        6Vs.LIZ("set", n, SystemClock.elapsedRealtime() - elapsedRealtime, (Context)2Ap);
    }
    
    public static Resources androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_reword_lancet_ResourcesLancet_getActivityResources(final 2Ap 2Ap) {
        final Resources androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources = androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources(2Ap);
        Objects.requireNonNull(androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources, "null cannot be cast to non-null type android.content.res.Resources");
        if (NqC.LIZIZ) {
            final Object rewordResources = 2Ap.rewordResources;
            final boolean b = rewordResources instanceof Resources;
            final NqX nqX = null;
            Object rewordResources2;
            if (!b || (rewordResources2 = rewordResources) == null) {
                final Configuration configuration = androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources.getConfiguration();
                CTM.LIZ((Object)androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources);
                rewordResources2 = androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources;
                if (NqC.LIZLLL != null) {
                    if (NqC.LJFF == null) {
                        rewordResources2 = androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources;
                    }
                    else {
                        NqX lizlll = NqC.LIZLLL;
                        if (lizlll == null) {
                            n.LIZ("");
                            lizlll = nqX;
                        }
                        final NqW nqW = new NqW(androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources, lizlll);
                        Configuration configuration2 = configuration;
                        if (configuration == null) {
                            configuration2 = nqW.getConfiguration();
                        }
                        configuration2.setLocale(NqC.LIZ.LIZIZ());
                        nqW.updateConfiguration(configuration2, androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources.getDisplayMetrics());
                        rewordResources2 = nqW;
                    }
                }
                2Ap.rewordResources = rewordResources2;
            }
            return (Resources)rewordResources2;
        }
        return androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_getResources;
    }
    
    private boolean performMenuItemShortcut(final int n, final KeyEvent keyEvent) {
        if (Build$VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode())) {
            final Window window = this.getWindow();
            if (window != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public void addContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.getDelegate().LIZIZ(view, viewGroup$LayoutParams);
    }
    
    public Resources androidx_appcompat_app_AppCompatActivity__getResources$___twin___() {
        Resources resources;
        if ((resources = this.mResources) == null) {
            resources = super.getResources();
        }
        return resources;
    }
    
    public void androidx_appcompat_app_AppCompatActivity__recreate$___twin___() {
        super.recreate();
    }
    
    public void androidx_appcompat_app_AppCompatActivity__setContentView$___twin___(final int n) {
        this.getDelegate().LIZJ(n);
    }
    
    public void attachBaseContext(final Context context) {
        super.attachBaseContext(context);
        this.getDelegate().LJII();
    }
    
    public void closeOptionsMenu() {
        final 023 supportActionBar = this.getSupportActionBar();
        if (this.getWindow().hasFeature(0) && (supportActionBar == null || !supportActionBar.LJI())) {
            super.closeOptionsMenu();
        }
    }
    
    @Override
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final int keyCode = keyEvent.getKeyCode();
        final 023 supportActionBar = this.getSupportActionBar();
        return (keyCode == 82 && supportActionBar != null && supportActionBar.LIZ(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }
    
    public <T extends View> T findViewById(final int n) {
        return this.getDelegate().LIZIZ(n);
    }
    
    public 027 getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = new 12Y(this, this);
        }
        return this.mDelegate;
    }
    
    public 12N.a getDrawerToggleDelegate() {
        return this.getDelegate().LJIIJ();
    }
    
    public MenuInflater getMenuInflater() {
        return this.getDelegate().LIZIZ();
    }
    
    public Resources getResources() {
        return androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_reword_lancet_ResourcesLancet_getActivityResources(this);
    }
    
    public 023 getSupportActionBar() {
        return this.getDelegate().LIZ();
    }
    
    @Override
    public Intent getSupportParentActivityIntent() {
        return 066.LIZ(this);
    }
    
    public void invalidateOptionsMenu() {
        this.getDelegate().LJIIIIZZ();
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        this.getDelegate().LIZ(configuration);
    }
    
    public void onContentChanged() {
        this.onSupportContentChanged();
    }
    
    @Override
    public void onCreate(final Bundle bundle) {
        final 027 delegate = this.getDelegate();
        delegate.LJIIJJI();
        delegate.LIZJ();
        super.onCreate(bundle);
    }
    
    public void onCreateSupportNavigateUpTaskStack(final 06S 06S) {
        Intent intent;
        if ((intent = ((06S.a)this).getSupportParentActivityIntent()) == null) {
            intent = 066.LIZ(this);
            if (intent == null) {
                return;
            }
        }
        ComponentName componentName;
        if ((componentName = intent.getComponent()) == null) {
            componentName = intent.resolveActivity(06S.LIZIZ.getPackageManager());
        }
        06S.LIZ(componentName);
        06S.LIZ.add(intent);
    }
    
    @Override
    public void onDestroy() {
        super.onDestroy();
        this.getDelegate().LJIIIZ();
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        return this.performMenuItemShortcut(n, keyEvent) || super.onKeyDown(n, keyEvent);
    }
    
    @Override
    public final boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        if (super.onMenuItemSelected(n, menuItem)) {
            return true;
        }
        final 023 supportActionBar = this.getSupportActionBar();
        return menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.LIZIZ() & 0x4) != 0x0 && this.onSupportNavigateUp();
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return super.onMenuOpened(n, menu);
    }
    
    public void onNightModeChanged(final int n) {
    }
    
    @Override
    public void onPanelClosed(final int n, final Menu menu) {
        super.onPanelClosed(n, menu);
    }
    
    public void onPostCreate(final Bundle bundle) {
        super.onPostCreate(bundle);
        this.getDelegate().LIZLLL();
    }
    
    @Override
    public void onPostResume() {
        super.onPostResume();
        this.getDelegate().LJI();
    }
    
    public void onPrepareSupportNavigateUpTaskStack(final 06S 06S) {
    }
    
    @Override
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.getDelegate().LJIIL();
    }
    
    @Override
    public void onStart() {
        super.onStart();
        this.getDelegate().LJ();
    }
    
    @Override
    public void onStop() {
        super.onStop();
        this.getDelegate().LJFF();
    }
    
    @Override
    public void onSupportActionModeFinished(final 02T 02T) {
    }
    
    @Override
    public void onSupportActionModeStarted(final 02T 02T) {
    }
    
    public void onSupportContentChanged() {
    }
    
    public boolean onSupportNavigateUp() {
        final Intent supportParentActivityIntent = this.getSupportParentActivityIntent();
        if (supportParentActivityIntent != null) {
            Label_0113: {
                if (!this.supportShouldUpRecreateTask(supportParentActivityIntent)) {
                    break Label_0113;
                }
                final 06S 06S = new 06S((Context)this);
                this.onCreateSupportNavigateUpTaskStack(06S);
                this.onPrepareSupportNavigateUpTaskStack(06S);
                Label_0102: {
                    if (06S.LIZ.isEmpty()) {
                        break Label_0102;
                    }
                    final Intent[] array = 06S.LIZ.toArray(new Intent[06S.LIZ.size()]);
                    array[0] = new Intent(array[0]).addFlags(268484608);
                    06S.LIZIZ.startActivities(array, (Bundle)null);
                    try {
                        this.finishAffinity();
                        return true;
                        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
                        this.supportNavigateUpTo(supportParentActivityIntent);
                    }
                    catch (final IllegalStateException ex) {
                        this.finish();
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public void onTitleChanged(final CharSequence charSequence, final int n) {
        super.onTitleChanged(charSequence, n);
        this.getDelegate().LIZ(charSequence);
    }
    
    @Override
    public 02T onWindowStartingSupportActionMode(final 02T.a a) {
        return null;
    }
    
    public void openOptionsMenu() {
        final 023 supportActionBar = this.getSupportActionBar();
        if (this.getWindow().hasFeature(0) && (supportActionBar == null || !supportActionBar.LJFF())) {
            super.openOptionsMenu();
        }
    }
    
    public void recreate() {
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_recreate(this);
    }
    
    @Override
    public void setContentView(final int n) {
        androidx_appcompat_app_AppCompatActivity_com_ss_android_ugc_aweme_lancet_ViewInflateLancet_setContentView(this, n);
    }
    
    @Override
    public void setContentView(final View view) {
        this.getDelegate().LIZ(view);
    }
    
    @Override
    public void setContentView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        this.getDelegate().LIZ(view, viewGroup$LayoutParams);
    }
    
    public void setSupportActionBar(final 03X 03X) {
        this.getDelegate().LIZ(03X);
    }
    
    public void setSupportProgress(final int n) {
    }
    
    public void setSupportProgressBarIndeterminate(final boolean b) {
    }
    
    public void setSupportProgressBarIndeterminateVisibility(final boolean b) {
    }
    
    public void setSupportProgressBarVisibility(final boolean b) {
    }
    
    public void setTheme(final int theme) {
        super.setTheme(theme);
        this.getDelegate().LIZ(theme);
    }
    
    public 02T startSupportActionMode(final 02T.a a) {
        return this.getDelegate().LIZ(a);
    }
    
    @Override
    public void supportInvalidateOptionsMenu() {
        this.getDelegate().LJIIIIZZ();
    }
    
    public void supportNavigateUpTo(final Intent intent) {
        this.navigateUpTo(intent);
    }
    
    public boolean supportRequestWindowFeature(final int n) {
        return this.getDelegate().LIZLLL(n);
    }
    
    public boolean supportShouldUpRecreateTask(final Intent intent) {
        return this.shouldUpRecreateTask(intent);
    }
}
