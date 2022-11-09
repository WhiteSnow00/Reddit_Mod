// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.json;

import com.facebook.stetho.common.ExceptionUtil;
import com.facebook.stetho.json.annotation.JsonValue;
import java.util.Iterator;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.json.JSONArray;
import com.facebook.stetho.json.annotation.JsonProperty;
import org.json.JSONException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import org.json.JSONObject;
import java.util.IdentityHashMap;
import java.lang.reflect.Method;
import java.util.Map;

public class ObjectMapper
{
    private final Map<Class<?>, Method> mJsonValueMethodCache;
    
    public ObjectMapper() {
        this.mJsonValueMethodCache = new IdentityHashMap<Class<?>, Method>();
    }
    
    private <T> T _convertFromJSONObject(final JSONObject jsonObject, final Class<T> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, JSONException {
        final Constructor declaredConstructor = clazz.getDeclaredConstructor((Class[])null);
        declaredConstructor.setAccessible(true);
        int i = 0;
        final Object instance = declaredConstructor.newInstance(new Object[0]);
        final Field[] fields = clazz.getFields();
        while (i < fields.length) {
            final Field field = fields[i];
            Label_0082: {
                if (Modifier.isStatic(field.getModifiers())) {
                    break Label_0082;
                }
                final Object valueForField = this.getValueForField(field, jsonObject.opt(field.getName()));
                try {
                    field.set(instance, valueForField);
                    ++i;
                    continue;
                }
                catch (final IllegalArgumentException ex) {
                    final StringBuilder k = a.k("Class: ");
                    k.append(clazz.getSimpleName());
                    k.append(" Field: ");
                    k.append(field.getName());
                    k.append(" type ");
                    String name;
                    if (valueForField != null) {
                        name = valueForField.getClass().getName();
                    }
                    else {
                        name = "null";
                    }
                    k.append(name);
                    throw new IllegalArgumentException(k.toString(), ex);
                }
            }
            break;
        }
        return (T)instance;
    }
    
    private JSONObject _convertToJSONObject(final Object o) throws JSONException, InvocationTargetException, IllegalAccessException {
        final JSONObject jsonObject = new JSONObject();
        final Field[] fields = o.getClass().getFields();
        for (int i = 0; i < fields.length; ++i) {
            final Field field = fields[i];
            if (!Modifier.isStatic(field.getModifiers())) {
                final JsonProperty jsonProperty = field.getAnnotation(JsonProperty.class);
                if (jsonProperty != null) {
                    final Object value = field.get(o);
                    Class<?> clazz = field.getType();
                    if (value != null) {
                        clazz = value.getClass();
                    }
                    final String name = field.getName();
                    Object o2;
                    if (jsonProperty.required() && value == null) {
                        o2 = JSONObject.NULL;
                    }
                    else if (value == JSONObject.NULL) {
                        o2 = value;
                    }
                    else {
                        o2 = this.getJsonValue(value, clazz, field);
                    }
                    jsonObject.put(name, o2);
                }
            }
        }
        return jsonObject;
    }
    
    private static boolean canDirectlySerializeClass(final Class clazz) {
        return isWrapperOrPrimitiveType(clazz) || clazz.equals(String.class);
    }
    
    private List<Object> convertArrayToList(final Field field, final JSONArray jsonArray) throws IllegalAccessException, JSONException {
        if (!List.class.isAssignableFrom(field.getType())) {
            final StringBuilder k = a.k("only know how to deserialize List<?> on field ");
            k.append(field.getName());
            throw new IllegalArgumentException(k.toString());
        }
        final Type[] actualTypeArguments = ((ParameterizedType)field.getGenericType()).getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            int i = 0;
            final Class clazz = (Class)actualTypeArguments[0];
            final ArrayList list = new ArrayList();
            while (i < jsonArray.length()) {
                if (clazz.isEnum()) {
                    list.add(this.getEnumValue(jsonArray.getString(i), clazz));
                }
                else if (canDirectlySerializeClass(clazz)) {
                    list.add(jsonArray.get(i));
                }
                else {
                    final JSONObject jsonObject = jsonArray.getJSONObject(i);
                    if (jsonObject == null) {
                        list.add(null);
                    }
                    else {
                        list.add(this.convertValue(jsonObject, (Class<Object>)clazz));
                    }
                }
                ++i;
            }
            return list;
        }
        final StringBuilder j = a.k("Only able to handle a single type in a list ");
        j.append(field.getName());
        throw new IllegalArgumentException(j.toString());
    }
    
    private JSONArray convertListToJsonArray(Object jsonValue) throws InvocationTargetException, IllegalAccessException {
        final JSONArray jsonArray = new JSONArray();
        for (final Object next : (List)jsonValue) {
            jsonValue = null;
            if (next != null) {
                jsonValue = this.getJsonValue(next, next.getClass(), null);
            }
            jsonArray.put(jsonValue);
        }
        return jsonArray;
    }
    
    private Enum getEnumByMethod(final String s, final Class<? extends Enum> clazz, final Method method) {
        final Enum[] array = clazz.getEnumConstants();
        int i = 0;
        while (i < array.length) {
            final Enum enum1 = array[i];
            try {
                final Object invoke = method.invoke(enum1, new Object[0]);
                if (invoke != null && invoke.toString().equals(s)) {
                    return enum1;
                }
                ++i;
                continue;
            }
            catch (final Exception ex) {
                throw new IllegalArgumentException(ex);
            }
            break;
        }
        final StringBuilder k = a.k("No enum constant ");
        k.append(clazz.getName());
        k.append(".");
        k.append(s);
        throw new IllegalArgumentException(k.toString());
    }
    
    private Enum getEnumValue(final String s, final Class<? extends Enum> clazz) {
        final Method jsonValueMethod = this.getJsonValueMethod(clazz);
        if (jsonValueMethod != null) {
            return this.getEnumByMethod(s, clazz, jsonValueMethod);
        }
        return Enum.valueOf(clazz, s);
    }
    
    private Object getJsonValue(final Object o, final Class<?> clazz, final Field field) throws InvocationTargetException, IllegalAccessException {
        if (o == null) {
            return null;
        }
        if (List.class.isAssignableFrom(clazz)) {
            return this.convertListToJsonArray(o);
        }
        final Method jsonValueMethod = this.getJsonValueMethod(clazz);
        if (jsonValueMethod != null) {
            return jsonValueMethod.invoke(o, new Object[0]);
        }
        if (!canDirectlySerializeClass(clazz)) {
            return this.convertValue(o, JSONObject.class);
        }
        if (!clazz.equals(Double.class)) {
            final Object o2 = o;
            if (!clazz.equals(Float.class)) {
                return o2;
            }
        }
        final double doubleValue = ((Number)o).doubleValue();
        if (Double.isNaN(doubleValue)) {
            return "NaN";
        }
        if (doubleValue == Double.POSITIVE_INFINITY) {
            return "Infinity";
        }
        Object o2 = o;
        if (doubleValue == Double.NEGATIVE_INFINITY) {
            o2 = "-Infinity";
        }
        return o2;
    }
    
    private Method getJsonValueMethod(final Class<?> clazz) {
        synchronized (this.mJsonValueMethodCache) {
            Method jsonValueMethodImpl;
            final Method method = jsonValueMethodImpl = this.mJsonValueMethodCache.get(clazz);
            if (method == null) {
                jsonValueMethodImpl = method;
                if (!this.mJsonValueMethodCache.containsKey(clazz)) {
                    jsonValueMethodImpl = getJsonValueMethodImpl(clazz);
                    this.mJsonValueMethodCache.put(clazz, jsonValueMethodImpl);
                }
            }
            return jsonValueMethodImpl;
        }
    }
    
    private static Method getJsonValueMethodImpl(final Class<?> clazz) {
        final Method[] methods = clazz.getMethods();
        for (int i = 0; i < methods.length; ++i) {
            if (methods[i].getAnnotation(JsonValue.class) != null) {
                return methods[i];
            }
        }
        return null;
    }
    
    private Object getValueForField(final Field field, final Object o) throws JSONException {
        if (o != null) {
            try {
                if (o == JSONObject.NULL) {
                    return null;
                }
                if (o.getClass() == field.getType()) {
                    return o;
                }
                if (o instanceof JSONObject) {
                    return this.convertValue(o, field.getType());
                }
                if (field.getType().isEnum()) {
                    return this.getEnumValue((String)o, field.getType().asSubclass(Enum.class));
                }
                if (o instanceof JSONArray) {
                    return this.convertArrayToList(field, (JSONArray)o);
                }
                if (o instanceof Number) {
                    final Number n = (Number)o;
                    final Class<?> type = field.getType();
                    if (type == Integer.class || type == Integer.TYPE) {
                        return n.intValue();
                    }
                    if (type == Long.class || type == Long.TYPE) {
                        return n.longValue();
                    }
                    if (type == Double.class || type == Double.TYPE) {
                        return n.doubleValue();
                    }
                    if (type == Float.class || type == Float.TYPE) {
                        return n.floatValue();
                    }
                    if (type == Byte.class || type == Byte.TYPE) {
                        return n.byteValue();
                    }
                    if (type != Short.class && type != Short.TYPE) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Not setup to handle class ");
                        sb.append(type.getName());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    return n.shortValue();
                }
            }
            catch (final IllegalAccessException ex) {
                final StringBuilder k = a.k("Unable to set value for field ");
                k.append(field.getName());
                throw new IllegalArgumentException(k.toString(), ex);
            }
        }
        return o;
    }
    
    private static boolean isWrapperOrPrimitiveType(final Class<?> clazz) {
        return clazz.isPrimitive() || clazz.equals(Boolean.class) || clazz.equals(Integer.class) || clazz.equals(Character.class) || clazz.equals(Byte.class) || clazz.equals(Short.class) || clazz.equals(Double.class) || clazz.equals(Long.class) || clazz.equals(Float.class);
    }
    
    public <T> T convertValue(Object o, final Class<T> clazz) throws IllegalArgumentException {
        if (o == null) {
            return null;
        }
        if (clazz != Object.class && clazz.isAssignableFrom(o.getClass())) {
            return (T)o;
        }
        try {
            if (o instanceof JSONObject) {
                return this._convertFromJSONObject((JSONObject)o, clazz);
            }
            if (clazz == JSONObject.class) {
                return (T)this._convertToJSONObject(o);
            }
            o = new IllegalArgumentException("Expecting either fromValue or toValueType to be a JSONObject");
            throw o;
        }
        catch (final InvocationTargetException ex) {
            throw ExceptionUtil.propagate(ex.getCause());
        }
        catch (final JSONException ex2) {
            throw new IllegalArgumentException((Throwable)ex2);
        }
        catch (final InstantiationException ex3) {
            throw new IllegalArgumentException(ex3);
        }
        catch (final IllegalAccessException ex4) {
            throw new IllegalArgumentException(ex4);
        }
        catch (final NoSuchMethodException ex5) {
            throw new IllegalArgumentException(ex5);
        }
    }
}
