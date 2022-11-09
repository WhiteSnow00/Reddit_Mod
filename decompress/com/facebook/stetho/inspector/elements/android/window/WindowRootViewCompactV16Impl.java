// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android.window;

import java.util.Collections;
import java.util.Arrays;
import android.view.View;
import java.util.List;
import java.lang.reflect.Field;
import android.content.Context;

class WindowRootViewCompactV16Impl extends WindowRootViewCompat
{
    private Context mContext;
    
    public WindowRootViewCompactV16Impl(final Context mContext) {
        this.mContext = mContext;
    }
    
    private static Object getOuter(Object value) {
        try {
            final Field declaredField = value.getClass().getDeclaredField("mWindowManager");
            declaredField.setAccessible(true);
            value = declaredField.get(value);
            declaredField.setAccessible(false);
            return value;
        }
        catch (final IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
        catch (final NoSuchFieldException ex2) {
            throw new RuntimeException(ex2);
        }
    }
    
    private static List<View> getWindowViews(final Object o) {
        try {
            final Field declaredField = o.getClass().getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return (List<View>)Collections.unmodifiableList((List<?>)Arrays.asList((T[])declaredField.get(o)));
        }
        catch (final IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
        catch (final NoSuchFieldException ex2) {
            throw new RuntimeException(ex2);
        }
    }
    
    @Override
    public List<View> getRootViews() {
        return getWindowViews(getOuter(this.mContext.getSystemService("window")));
    }
}
