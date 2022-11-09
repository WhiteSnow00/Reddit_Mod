// 
// Decompiled by Procyon v0.6.0
// 

package com.evernote.android.state;

import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.os.Parcelable;
import androidx.viewpager.widget.c;
import java.util.Map;

final class StateSaverImpl
{
    private final Map<Class<?>, Injector> mInjectors;
    
    public StateSaverImpl(final Map<Class<?>, Injector> mInjectors) {
        this.mInjectors = mInjectors;
    }
    
    private Injector getInjector(final Class<?> clazz) {
        final Injector injector = this.mInjectors.get(clazz);
        if (injector != null || this.mInjectors.containsKey(clazz)) {
            return injector;
        }
        final String name = clazz.getName();
        if (!name.startsWith("android.") && !name.startsWith("java.")) {
            Injector injector2;
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append(name);
                sb.append("$$StateSaver");
                injector2 = (Injector)Class.forName(sb.toString()).newInstance();
            }
            catch (final Exception ex) {
                injector2 = this.getInjector(clazz.getSuperclass());
            }
            this.mInjectors.put(clazz, injector2);
            return injector2;
        }
        return null;
    }
    
    private <T extends Injector> T safeGet(Object o, final Injector injector) {
        try {
            final Injector injector2 = this.getInjector(o.getClass());
            if (injector2 == null) {
                o = injector;
            }
            else {
                o = injector2;
            }
            return (T)o;
        }
        catch (final Exception ex) {
            throw new RuntimeException(c.h("Unable to inject state for ", o), ex);
        }
    }
    
    public <T extends View> Parcelable restoreInstanceState(final T t, final Parcelable parcelable) {
        if (parcelable != null) {
            return this.safeGet(t, (Injector)Injector$View.DEFAULT).restore((Object)t, parcelable);
        }
        return null;
    }
    
    public <T> void restoreInstanceState(final T t, final Bundle bundle) {
        if (bundle != null) {
            this.safeGet(t, (Injector)Injector$Object.DEFAULT).restore((Object)t, bundle);
        }
    }
    
    public <T extends View> Parcelable saveInstanceState(final T t, final Parcelable parcelable) {
        return this.safeGet(t, (Injector)Injector$View.DEFAULT).save((Object)t, parcelable);
    }
    
    public <T> void saveInstanceState(final T t, final Bundle bundle) {
        this.safeGet(t, (Injector)Injector$Object.DEFAULT).save((Object)t, bundle);
    }
    
    public void setEnabledForAllActivitiesAndSupportFragments(final Application application, final boolean mEnabled) {
        final AndroidLifecycleCallbacks instance = AndroidLifecycleCallbacks.INSTANCE;
        if (instance.mEnabled != mEnabled) {
            if (mEnabled) {
                application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)instance);
            }
            else {
                application.unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)instance);
            }
            instance.mEnabled = mEnabled;
        }
    }
}
