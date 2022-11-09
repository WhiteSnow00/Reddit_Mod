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
        invokers = Arrays.asList((TypedMethodInvoker)new StringMethodInvoker(), (TypedMethodInvoker)new CharSequenceMethodInvoker(), (TypedMethodInvoker)new IntegerMethodInvoker(), (TypedMethodInvoker)new FloatMethodInvoker(), (TypedMethodInvoker)new BooleanMethodInvoker());
    }
    
    public void invoke(final Object o, final String s, final String s2) {
        Util.throwIfNull(o, s, s2);
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
    
    public static class BooleanMethodInvoker extends TypedMethodInvoker<Boolean>
    {
        public BooleanMethodInvoker() {
            super(Boolean.TYPE);
        }
        
        public Boolean convertArgument(final String s) {
            return Boolean.parseBoolean(s);
        }
    }
    
    public static class CharSequenceMethodInvoker extends TypedMethodInvoker<CharSequence>
    {
        public CharSequenceMethodInvoker() {
            super(CharSequence.class);
        }
        
        public CharSequence convertArgument(final String s) {
            return s;
        }
    }
    
    public static class FloatMethodInvoker extends TypedMethodInvoker<Float>
    {
        public FloatMethodInvoker() {
            super(Float.TYPE);
        }
        
        public Float convertArgument(final String s) {
            return Float.parseFloat(s);
        }
    }
    
    public static class IntegerMethodInvoker extends TypedMethodInvoker<Integer>
    {
        public IntegerMethodInvoker() {
            super(Integer.TYPE);
        }
        
        public Integer convertArgument(final String s) {
            return Integer.parseInt(s);
        }
    }
    
    public static class StringMethodInvoker extends TypedMethodInvoker<String>
    {
        public StringMethodInvoker() {
            super(String.class);
        }
        
        public String convertArgument(final String s) {
            return s;
        }
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
                final StringBuilder k = a.k("IllegalArgumentException: ");
                k.append(ex.getMessage());
                LogUtil.w(k.toString());
                goto Label_0113;
            }
            catch (final IllegalAccessException ex2) {
                final StringBuilder i = a.k("IllegalAccessException: ");
                i.append(ex2.getMessage());
                LogUtil.w(i.toString());
                goto Label_0113;
            }
            catch (final InvocationTargetException ex3) {
                final StringBuilder j = a.k("InvocationTargetException: ");
                j.append(ex3.getMessage());
                LogUtil.w(j.toString());
            }
            catch (final NoSuchMethodException ex4) {
                goto Label_0113;
            }
        }
    }
}
