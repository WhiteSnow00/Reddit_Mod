// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android;

import java.lang.reflect.InvocationTargetException;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import java.util.Arrays;
import java.util.List;

public class MethodInvoker
{
    private static final List<TypedMethodInvoker<?>> invokers;
    
    static {
        invokers = Arrays.asList((TypedMethodInvoker)new MethodInvoker.MethodInvoker$StringMethodInvoker(), (TypedMethodInvoker)new MethodInvoker.MethodInvoker$CharSequenceMethodInvoker(), (TypedMethodInvoker)new MethodInvoker.MethodInvoker$IntegerMethodInvoker(), (TypedMethodInvoker)new MethodInvoker.MethodInvoker$FloatMethodInvoker(), (TypedMethodInvoker)new MethodInvoker.MethodInvoker$BooleanMethodInvoker());
    }
    
    public void invoke(final Object o, final String s, final String s2) {
        Util.throwIfNull(o, (Object)s, (Object)s2);
        for (int size = MethodInvoker.invokers.size(), i = 0; i < size; ++i) {
            if (MethodInvoker.invokers.get(i).invoke(o, s, s2)) {
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Method with name ");
        sb.append(s);
        sb.append(" not found for any of the MethodInvoker supported argument types.");
        LogUtil.w(sb.toString());
    }
    
    public abstract static class TypedMethodInvoker<T>
    {
        private final Class<T> mArgType;
        
        public TypedMethodInvoker(final Class<T> mArgType) {
            this.mArgType = mArgType;
        }
        
        public abstract T convertArgument(final String p0);
        
        public boolean invoke(final Object o, final String s, final String s2) {
            try {
                o.getClass().getMethod(s, this.mArgType).invoke(o, this.convertArgument(s2));
                return true;
            }
            catch (final IllegalArgumentException ex) {
                final StringBuilder r = a.r("IllegalArgumentException: ");
                r.append(ex.getMessage());
                LogUtil.w(r.toString());
                goto Label_0113;
            }
            catch (final IllegalAccessException ex2) {
                final StringBuilder r2 = a.r("IllegalAccessException: ");
                r2.append(ex2.getMessage());
                LogUtil.w(r2.toString());
                goto Label_0113;
            }
            catch (final InvocationTargetException ex3) {
                final StringBuilder r3 = a.r("InvocationTargetException: ");
                r3.append(ex3.getMessage());
                LogUtil.w(r3.toString());
            }
            catch (final NoSuchMethodException ex4) {
                goto Label_0113;
            }
        }
    }
}
