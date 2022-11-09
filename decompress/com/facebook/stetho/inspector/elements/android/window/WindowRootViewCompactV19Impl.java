// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android.window;

import java.util.Collections;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import android.view.View;
import java.util.List;

class WindowRootViewCompactV19Impl extends WindowRootViewCompat
{
    private List<View> mRootViews;
    
    public WindowRootViewCompactV19Impl() {
        try {
            final Class<?> forName = Class.forName("android.view.WindowManagerGlobal");
            final Object invoke = forName.getDeclaredMethod("getInstance", (Class[])new Class[0]).invoke(forName, new Object[0]);
            final Field declaredField = forName.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            this.mRootViews = (List)declaredField.get(invoke);
            declaredField.setAccessible(false);
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
        return Collections.unmodifiableList((List<? extends View>)this.mRootViews);
    }
}
