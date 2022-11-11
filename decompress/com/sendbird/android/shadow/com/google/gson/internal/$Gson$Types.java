// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android.shadow.com.google.gson.internal;

import java.lang.reflect.Modifier;
import java.lang.reflect.Array;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import ml0.a;
import java.io.Serializable;
import java.lang.reflect.WildcardType;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public final class $Gson$Types
{
    public static final Type[] a;
    
    static {
        a = new Type[0];
    }
    
    public static Type a(final Type type) {
        if (type instanceof Class) {
            Serializable s;
            final Class clazz = (Class)(s = (Class)type);
            if (clazz.isArray()) {
                s = new GenericArrayTypeImpl(a(clazz.getComponentType()));
            }
            return (Type)s;
        }
        if (type instanceof ParameterizedType) {
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType)type).getGenericComponentType());
        }
        if (type instanceof WildcardType) {
            final WildcardType wildcardType = (WildcardType)type;
            return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
        return type;
    }
    
    public static void b(final Type type) {
        ml0.a.h(!(type instanceof Class) || !((Class)type).isPrimitive());
    }
    
    public static boolean c(final Type type, Type ownerType) {
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        if (type == ownerType) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(ownerType);
        }
        if (type instanceof ParameterizedType) {
            if (!(ownerType instanceof ParameterizedType)) {
                return false;
            }
            final ParameterizedType parameterizedType = (ParameterizedType)type;
            final ParameterizedType parameterizedType2 = (ParameterizedType)ownerType;
            ownerType = parameterizedType.getOwnerType();
            final Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                b3 = false;
            }
            return b3;
        }
        else {
            if (type instanceof GenericArrayType) {
                return ownerType instanceof GenericArrayType && c(((GenericArrayType)type).getGenericComponentType(), ((GenericArrayType)ownerType).getGenericComponentType());
            }
            if (type instanceof WildcardType) {
                if (!(ownerType instanceof WildcardType)) {
                    return false;
                }
                final WildcardType wildcardType = (WildcardType)type;
                final WildcardType wildcardType2 = (WildcardType)ownerType;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds()) && b;
            }
            else {
                if (!(type instanceof TypeVariable)) {
                    return false;
                }
                if (!(ownerType instanceof TypeVariable)) {
                    return false;
                }
                final TypeVariable typeVariable = (TypeVariable)type;
                final TypeVariable typeVariable2 = (TypeVariable)ownerType;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName()) && b2;
            }
        }
    }
    
    public static Class<?> d(Type rawType) {
        if (rawType instanceof Class) {
            return (Class)rawType;
        }
        if (rawType instanceof ParameterizedType) {
            rawType = ((ParameterizedType)rawType).getRawType();
            ml0.a.h(rawType instanceof Class);
            return (Class)rawType;
        }
        if (rawType instanceof GenericArrayType) {
            return Array.newInstance(d(((GenericArrayType)rawType).getGenericComponentType()), 0).getClass();
        }
        if (rawType instanceof TypeVariable) {
            return Object.class;
        }
        if (rawType instanceof WildcardType) {
            return d(((WildcardType)rawType).getUpperBounds()[0]);
        }
        String name;
        if (rawType == null) {
            name = "null";
        }
        else {
            name = rawType.getClass().getName();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected a Class, ParameterizedType, or GenericArrayType, but <");
        sb.append(rawType);
        sb.append("> is of type ");
        sb.append(name);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static String e(final Type type) {
        String s;
        if (type instanceof Class) {
            s = ((Class)type).getName();
        }
        else {
            s = type.toString();
        }
        return s;
    }
    
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable
    {
        private static final long serialVersionUID = 0L;
        private final Type componentType;
        
        public GenericArrayTypeImpl(final Type type) {
            this.componentType = $Gson$Types.a(type);
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof GenericArrayType && $Gson$Types.c(this, (Type)o);
        }
        
        @Override
        public Type getGenericComponentType() {
            return this.componentType;
        }
        
        @Override
        public int hashCode() {
            return this.componentType.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append($Gson$Types.e(this.componentType));
            sb.append("[]");
            return sb.toString();
        }
    }
    
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable
    {
        private static final long serialVersionUID = 0L;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;
        
        public ParameterizedTypeImpl(Type a, final Type type, final Type... array) {
            final boolean b = type instanceof Class;
            final int n = 0;
            if (b) {
                final Class clazz = (Class)type;
                final boolean static1 = Modifier.isStatic(clazz.getModifiers());
                final boolean b2 = true;
                final boolean b3 = static1 || clazz.getEnclosingClass() == null;
                boolean b4 = b2;
                if (a == null) {
                    b4 = (b3 && b2);
                }
                ml0.a.h(b4);
            }
            if (a == null) {
                a = null;
            }
            else {
                a = $Gson$Types.a(a);
            }
            this.ownerType = a;
            this.rawType = $Gson$Types.a(type);
            final Type[] typeArguments = array.clone();
            this.typeArguments = typeArguments;
            for (int length = typeArguments.length, i = n; i < length; ++i) {
                this.typeArguments[i].getClass();
                $Gson$Types.b(this.typeArguments[i]);
                final Type[] typeArguments2 = this.typeArguments;
                typeArguments2[i] = $Gson$Types.a(typeArguments2[i]);
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof ParameterizedType && $Gson$Types.c(this, (Type)o);
        }
        
        @Override
        public Type[] getActualTypeArguments() {
            return this.typeArguments.clone();
        }
        
        @Override
        public Type getOwnerType() {
            return this.ownerType;
        }
        
        @Override
        public Type getRawType() {
            return this.rawType;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = Arrays.hashCode(this.typeArguments);
            final int hashCode2 = this.rawType.hashCode();
            final Type ownerType = this.ownerType;
            int hashCode3;
            if (ownerType != null) {
                hashCode3 = ownerType.hashCode();
            }
            else {
                hashCode3 = 0;
            }
            return hashCode ^ hashCode2 ^ hashCode3;
        }
        
        @Override
        public String toString() {
            final int length = this.typeArguments.length;
            if (length == 0) {
                return $Gson$Types.e(this.rawType);
            }
            final StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append($Gson$Types.e(this.rawType));
            sb.append("<");
            sb.append($Gson$Types.e(this.typeArguments[0]));
            for (int i = 1; i < length; ++i) {
                sb.append(", ");
                sb.append($Gson$Types.e(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }
    
    public static final class WildcardTypeImpl implements WildcardType, Serializable
    {
        private static final long serialVersionUID = 0L;
        private final Type lowerBound;
        private final Type upperBound;
        
        public WildcardTypeImpl(final Type[] array, final Type[] array2) {
            final int length = array2.length;
            final boolean b = true;
            ml0.a.h(length <= 1);
            ml0.a.h(array.length == 1);
            if (array2.length == 1) {
                array2[0].getClass();
                $Gson$Types.b(array2[0]);
                ml0.a.h(array[0] == Object.class && b);
                this.lowerBound = $Gson$Types.a(array2[0]);
                this.upperBound = Object.class;
            }
            else {
                array[0].getClass();
                $Gson$Types.b(array[0]);
                this.lowerBound = null;
                this.upperBound = $Gson$Types.a(array[0]);
            }
        }
        
        @Override
        public boolean equals(final Object o) {
            return o instanceof WildcardType && $Gson$Types.c(this, (Type)o);
        }
        
        @Override
        public Type[] getLowerBounds() {
            final Type lowerBound = this.lowerBound;
            Type[] a;
            if (lowerBound != null) {
                a = new Type[] { lowerBound };
            }
            else {
                a = $Gson$Types.a;
            }
            return a;
        }
        
        @Override
        public Type[] getUpperBounds() {
            return new Type[] { this.upperBound };
        }
        
        @Override
        public int hashCode() {
            final Type lowerBound = this.lowerBound;
            int n;
            if (lowerBound != null) {
                n = lowerBound.hashCode() + 31;
            }
            else {
                n = 1;
            }
            return n ^ this.upperBound.hashCode() + 31;
        }
        
        @Override
        public String toString() {
            if (this.lowerBound != null) {
                final StringBuilder r = a.r("? super ");
                r.append($Gson$Types.e(this.lowerBound));
                return r.toString();
            }
            if (this.upperBound == Object.class) {
                return "?";
            }
            final StringBuilder r2 = a.r("? extends ");
            r2.append($Gson$Types.e(this.upperBound));
            return r2.toString();
        }
    }
}
