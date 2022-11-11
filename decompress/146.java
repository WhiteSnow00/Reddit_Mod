// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import android.view.Window$Callback;
import androidx.core.g.t;
import android.view.KeyEvent;
import androidx.lifecycle.af;
import java.lang.reflect.Field;
import android.content.res.TypedArray;
import android.content.pm.ActivityInfo;
import android.os.Build$VERSION;
import android.app.Fragment;
import com.bytedance.ies.abmock.SettingsManager;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import android.app.Activity;

public class 146 extends Activity implements 07z.a, 0CH
{
    public 050<Class<? extends a>, a> mExtraDataMap;
    public 15u mLifecycleRegistry;
    
    static {
        Covode.recordClassIndex(692);
    }
    
    public 146() {
        this.mExtraDataMap = new 050<Class<? extends a>, a>();
        this.mLifecycleRegistry = new 15u(this);
    }
    
    public static void androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onCreate(final 146 146, final Bundle bundle) {
        if (bundle != null && SettingsManager.LIZ().LIZ("fix_androidx_fragment", 0) == 1) {
            0A4.LIZ(bundle, Fragment.class, "android:fragments");
            0A4.LIZ(bundle, androidx.fragment.app.Fragment.class, "android:support:fragments");
        }
        if (Build$VERSION.SDK_INT == 26) {
            final TypedArray obtainStyledAttributes = 146.obtainStyledAttributes(new int[] { 16842840 });
            final boolean boolean1 = obtainStyledAttributes.getBoolean(0, false);
            final int requestedOrientation = 146.getRequestedOrientation();
            obtainStyledAttributes.recycle();
            if (boolean1 && requestedOrientation != -1) {
                try {
                    final Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                    declaredField.setAccessible(true);
                    ((ActivityInfo)declaredField.get(146)).screenOrientation = -1;
                    declaredField.setAccessible(false);
                }
                catch (final Exception ex) {
                    0II.LIZ(ex);
                }
            }
        }
        146.androidx_core_app_ComponentActivity__onCreate$___twin___(bundle);
    }
    
    public static void androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_setRequestedOrientation(final 146 146, final int n) {
        if (Build$VERSION.SDK_INT != 26) {
            146.androidx_core_app_ComponentActivity__setRequestedOrientation$___twin___(n);
            return;
        }
        final TypedArray obtainStyledAttributes = 146.obtainStyledAttributes(new int[] { 16842840 });
        final boolean boolean1 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (!boolean1) {
            146.androidx_core_app_ComponentActivity__setRequestedOrientation$___twin___(n);
        }
    }
    
    public void androidx_core_app_ComponentActivity__onCreate$___twin___(final Bundle bundle) {
        super.onCreate(bundle);
        af.LIZ(this);
    }
    
    public void androidx_core_app_ComponentActivity__setRequestedOrientation$___twin___(final int requestedOrientation) {
        super.setRequestedOrientation(requestedOrientation);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        return (decorView != null && t.LIZ(decorView, keyEvent)) || 07z.LIZ((07z.a)this, decorView, (Window$Callback)this, keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        return (decorView != null && t.LIZ(decorView, keyEvent)) || super.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public <T extends a> T getExtraData(final Class<T> clazz) {
        return (T)this.mExtraDataMap.get(clazz);
    }
    
    public 0CC getLifecycle() {
        return this.mLifecycleRegistry;
    }
    
    public void onCreate(final Bundle bundle) {
        androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_onCreate(this, bundle);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        this.mLifecycleRegistry.LIZ(0CC.b.CREATED);
        super.onSaveInstanceState(bundle);
    }
    
    public void putExtraData(final a a) {
        this.mExtraDataMap.put(a.getClass(), a);
    }
    
    public void setRequestedOrientation(final int n) {
        androidx_core_app_ComponentActivity_com_ss_android_ugc_aweme_lancet_ActivityLancet_setRequestedOrientation(this, n);
    }
    
    public boolean superDispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    public static class a
    {
        static {
            Covode.recordClassIndex(693);
        }
    }
}
