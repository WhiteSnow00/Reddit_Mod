// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android.window;

import java.util.Collections;
import java.util.Arrays;
import android.view.View;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

class WindowRootViewCompactV18Impl extends WindowRootViewCompat
{
    private Field mViewsField;
    private Object mWindowManagerGlobal;
    
    public WindowRootViewCompactV18Impl() {
        try {
            final Class<?> forName = Class.forName("android.view.WindowManagerGlobal");
            this.mWindowManagerGlobal = forName.getDeclaredMethod("getInstance", (Class[])new Class[0]).invoke(forName, new Object[0]);
            (this.mViewsField = forName.getDeclaredField("mViews")).setAccessible(true);
        }
        catch (final NoSuchFieldException ex) {
            throw new RuntimeException(ex);
        }
        catch (final InvocationTargetException ex2) {
            throw new RuntimeException(ex2);
        }
        catch (final IllegalAccessException ex3) {
            throw new RuntimeException(ex3);
        }
        catch (final NoSuchMethodException ex4) {
            throw new RuntimeException(ex4);
        }
        catch (final ClassNotFoundException ex5) {
            throw new RuntimeException(ex5);
        }
    }
    
    @Override
    public List<View> getRootViews() {
        try {
            return Collections.unmodifiableList((List<? extends View>)Arrays.asList((T[])this.mViewsField.get(this.mWindowManagerGlobal)));
        }
        catch (final IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }
}
