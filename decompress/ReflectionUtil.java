// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.common;

import java.lang.reflect.Field;

public final class ReflectionUtil
{
    private ReflectionUtil() {
    }
    
    public static Object getFieldValue(final Field field, final Object o) {
        try {
            return field.get(o);
        }
        catch (final IllegalAccessException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static Class<?> tryGetClassForName(final String s) {
        try {
            return Class.forName(s);
        }
        catch (final ClassNotFoundException ex) {
            return null;
        }
    }
    
    public static Field tryGetDeclaredField(final Class<?> clazz, final String s) {
        try {
            return clazz.getDeclaredField(s);
        }
        catch (final NoSuchFieldException ex) {
            LogUtil.d(ex, "Could not retrieve %s field from %s", s, clazz);
            return null;
        }
    }
}
