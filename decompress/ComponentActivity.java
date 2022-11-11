// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import androidx.lifecycle.d0;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import android.view.View;
import android.view.Window$Callback;
import android.view.KeyEvent;
import v3.a;
import android.os.Build$VERSION;
import androidx.lifecycle.r;
import a4.i;
import androidx.lifecycle.q;
import android.app.Activity;

public class ComponentActivity extends Activity implements q, a
{
    private j0.i<Class<? extends ComponentActivity.ComponentActivity$ExtraData>, ComponentActivity.ComponentActivity$ExtraData> mExtraDataMap;
    private r mLifecycleRegistry;
    
    public ComponentActivity() {
        this.mExtraDataMap = (j0.i<Class<? extends ComponentActivity.ComponentActivity$ExtraData>, ComponentActivity.ComponentActivity$ExtraData>)new j0.i();
        this.mLifecycleRegistry = new r((q)this);
    }
    
    private static boolean shouldSkipDump(final String[] array) {
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        boolean b4 = b2;
        if (array != null) {
            b4 = b2;
            if (array.length > 0) {
                final String s = array[0];
                s.getClass();
                int n = -1;
                switch (s) {
                    case "--autofill": {
                        n = 4;
                        break;
                    }
                    case "--contentcapture": {
                        n = 3;
                        break;
                    }
                    case "--list-dumpables": {
                        n = 2;
                        break;
                    }
                    case "--dump-dumpable": {
                        n = 1;
                        break;
                    }
                    case "--translation": {
                        n = 0;
                        break;
                    }
                    default:
                        break;
                }
                switch (n) {
                    default: {
                        b4 = b2;
                        break;
                    }
                    case 4: {
                        boolean b5 = b3;
                        if (Build$VERSION.SDK_INT >= 26) {
                            b5 = true;
                        }
                        return b5;
                    }
                    case 3: {
                        boolean b6 = b;
                        if (Build$VERSION.SDK_INT >= 29) {
                            b6 = true;
                        }
                        return b6;
                    }
                    case 1:
                    case 2: {
                        return v3.a.b();
                    }
                    case 0: {
                        b4 = b2;
                        if (Build$VERSION.SDK_INT >= 31) {
                            b4 = true;
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return b4;
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        return (decorView != null && i.a(decorView, keyEvent)) || i.b((i.a)this, decorView, (Window$Callback)this, keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        return (decorView != null && i.a(decorView, keyEvent)) || super.dispatchKeyShortcutEvent(keyEvent);
    }
    
    @Deprecated
    public <T extends ComponentActivity.ComponentActivity$ExtraData> T getExtraData(final Class<T> clazz) {
        return (T)this.mExtraDataMap.getOrDefault((Object)clazz, (Object)null);
    }
    
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }
    
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        d0.c(this);
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        final r mLifecycleRegistry = this.mLifecycleRegistry;
        final Lifecycle.State created = Lifecycle.State.CREATED;
        mLifecycleRegistry.e("markState");
        mLifecycleRegistry.h(created);
        super.onSaveInstanceState(bundle);
    }
    
    @Deprecated
    public void putExtraData(final ComponentActivity.ComponentActivity$ExtraData componentActivity$ExtraData) {
        this.mExtraDataMap.put((Object)componentActivity$ExtraData.getClass(), (Object)componentActivity$ExtraData);
    }
    
    public final boolean shouldDumpInternalState(final String[] array) {
        return shouldSkipDump(array) ^ true;
    }
    
    public boolean superDispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
