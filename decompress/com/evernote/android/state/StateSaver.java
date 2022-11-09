// 
// Decompiled by Procyon v0.6.0
// 

package com.evernote.android.state;

import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.os.Parcelable;
import java.util.Map;
import java.util.LinkedHashMap;

public final class StateSaver
{
    public static final String ANDROID_PREFIX = "android.";
    private static final StateSaverImpl IMPL;
    public static final String JAVA_PREFIX = "java.";
    public static final String SUFFIX = "$$StateSaver";
    
    static {
        IMPL = new StateSaverImpl(new LinkedHashMap<Class<?>, Injector>());
    }
    
    private StateSaver() {
        throw new UnsupportedOperationException();
    }
    
    public static <T extends View> Parcelable restoreInstanceState(final T t, final Parcelable parcelable) {
        return StateSaver.IMPL.restoreInstanceState(t, parcelable);
    }
    
    public static <T> void restoreInstanceState(final T t, final Bundle bundle) {
        StateSaver.IMPL.restoreInstanceState(t, bundle);
    }
    
    public static <T extends View> Parcelable saveInstanceState(final T t, final Parcelable parcelable) {
        return StateSaver.IMPL.saveInstanceState(t, parcelable);
    }
    
    public static <T> void saveInstanceState(final T t, final Bundle bundle) {
        StateSaver.IMPL.saveInstanceState(t, bundle);
    }
    
    public static void setEnabledForAllActivitiesAndSupportFragments(final Application application, final boolean b) {
        StateSaver.IMPL.setEnabledForAllActivitiesAndSupportFragments(application, b);
    }
}
