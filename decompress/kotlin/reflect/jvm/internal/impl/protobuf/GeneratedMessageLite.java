// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.io.IOException;
import java.io.Serializable;

public abstract class GeneratedMessageLite extends a implements Serializable
{
    public GeneratedMessageLite() {
    }
    
    public GeneratedMessageLite(final b b) {
    }
    
    public static boolean access$100(final f f, l l, final d d, final CodedOutputStream codedOutputStream, final e e, int n) throws IOException {
        final int n2 = n & 0x7;
        final GeneratedMessageLite.GeneratedMessageLite$e generatedMessageLite$e = e.a.get(new e$a((Object)l, n >>> 3));
        boolean q = true;
        boolean b = false;
        boolean b2 = false;
        Label_0130: {
            if (generatedMessageLite$e != null) {
                final WireFormat$FieldType h = generatedMessageLite$e.d.h;
                final f d2 = f.d;
                if (n2 == h.getWireType()) {
                    b = false;
                    b2 = false;
                    break Label_0130;
                }
                final GeneratedMessageLite.GeneratedMessageLite$d d3 = generatedMessageLite$e.d;
                if (d3.i && d3.h.isPackable()) {
                    final WireFormat$FieldType h2 = generatedMessageLite$e.d.h;
                    if (n2 == 2) {
                        b = false;
                        b2 = true;
                        break Label_0130;
                    }
                }
            }
            b2 = false;
            b = true;
        }
        if (b) {
            q = d.q(n, codedOutputStream);
        }
        else if (b2) {
            n = d.d(d.k());
            if (generatedMessageLite$e.d.h == WireFormat$FieldType.ENUM) {
                while (d.b() > 0) {
                    final Internal$a a = generatedMessageLite$e.d.f.a(d.k());
                    if (a == null) {
                        return q;
                    }
                    f.a(generatedMessageLite$e.d, generatedMessageLite$e.b((Object)a));
                }
            }
            else {
                while (d.b() > 0) {
                    f.a(generatedMessageLite$e.d, f.i(d, generatedMessageLite$e.d.h));
                }
            }
            d.c(n);
        }
        else {
            final int n3 = GeneratedMessageLite$a.a[((Enum)generatedMessageLite$e.d.u()).ordinal()];
            if (n3 != 1) {
                if (n3 != 2) {
                    l = (l)f.i(d, generatedMessageLite$e.d.h);
                }
                else {
                    final int k = d.k();
                    l = (l)generatedMessageLite$e.d.f.a(k);
                    if (l == null) {
                        codedOutputStream.t(n);
                        codedOutputStream.t(k);
                        return q;
                    }
                }
            }
            else {
                final l$a l$a = null;
                final GeneratedMessageLite.GeneratedMessageLite$d d4 = generatedMessageLite$e.d;
                l$a builder = l$a;
                if (!d4.i) {
                    final l i = (l)f.e((f$b)d4);
                    builder = l$a;
                    if (i != null) {
                        builder = i.toBuilder();
                    }
                }
                l$a builderForType;
                if ((builderForType = builder) == null) {
                    builderForType = generatedMessageLite$e.c.newBuilderForType();
                }
                final GeneratedMessageLite.GeneratedMessageLite$d d5 = generatedMessageLite$e.d;
                if (d5.h == WireFormat$FieldType.GROUP) {
                    n = d5.g;
                    final int j = d.i;
                    if (j >= 64) {
                        throw InvalidProtocolBufferException.recursionLimitExceeded();
                    }
                    d.i = j + 1;
                    builderForType.d(d, e);
                    d.a(n << 3 | 0x4);
                    --d.i;
                }
                else {
                    n = d.k();
                    if (d.i >= 64) {
                        throw InvalidProtocolBufferException.recursionLimitExceeded();
                    }
                    n = d.d(n);
                    ++d.i;
                    builderForType.d(d, e);
                    d.a(0);
                    --d.i;
                    d.c(n);
                }
                l = builderForType.build();
            }
            final GeneratedMessageLite.GeneratedMessageLite$d d6 = generatedMessageLite$e.d;
            if (d6.i) {
                f.a(d6, generatedMessageLite$e.b((Object)l));
            }
            else {
                f.j((f$b)d6, generatedMessageLite$e.b((Object)l));
            }
        }
        return q;
    }
    
    static Method getMethodOrDie(final Class clazz, String value, final Class... array) {
        try {
            return clazz.getMethod(value, (Class[])array);
        }
        catch (final NoSuchMethodException ex) {
            final String name = clazz.getName();
            value = String.valueOf(value);
            final StringBuilder sb = new StringBuilder(value.length() + (name.length() + 45));
            b.x(sb, "Generated message class \"", name, "\" missing method \"", value);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), ex);
        }
    }
    
    static Object invokeOrDie(final Method method, final Object o, final Object... array) {
        try {
            return method.invoke(o, array);
        }
        catch (final InvocationTargetException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (cause instanceof Error) {
                throw (Error)cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
        catch (final IllegalAccessException ex2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", ex2);
        }
    }
    
    public static <ContainingType extends l, Type> GeneratedMessageLite.GeneratedMessageLite$e<ContainingType, Type> newRepeatedGeneratedExtension(final ContainingType containingType, final l l, final Internal$b<?> internal$b, final int n, final WireFormat$FieldType wireFormat$FieldType, final boolean b, final Class clazz) {
        return (GeneratedMessageLite.GeneratedMessageLite$e<ContainingType, Type>)new GeneratedMessageLite.GeneratedMessageLite$e((l)containingType, (Object)Collections.emptyList(), l, new GeneratedMessageLite.GeneratedMessageLite$d((Internal$b)internal$b, n, wireFormat$FieldType, true, b), clazz);
    }
    
    public static <ContainingType extends l, Type> GeneratedMessageLite.GeneratedMessageLite$e<ContainingType, Type> newSingularGeneratedExtension(final ContainingType containingType, final Type type, final l l, final Internal$b<?> internal$b, final int n, final WireFormat$FieldType wireFormat$FieldType, final Class clazz) {
        return (GeneratedMessageLite.GeneratedMessageLite$e<ContainingType, Type>)new GeneratedMessageLite.GeneratedMessageLite$e((l)containingType, (Object)type, l, new GeneratedMessageLite.GeneratedMessageLite$d((Internal$b)internal$b, n, wireFormat$FieldType, false, false), clazz);
    }
    
    public abstract l getDefaultInstanceForType();
    
    public n<? extends l> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }
    
    public abstract int getSerializedSize();
    
    public abstract boolean isInitialized();
    
    public void makeExtensionsImmutable() {
    }
    
    public abstract l$a newBuilderForType();
    
    public boolean parseUnknownField(final d d, final CodedOutputStream codedOutputStream, final e e, final int n) throws IOException {
        return d.q(n, codedOutputStream);
    }
    
    public abstract l$a toBuilder();
    
    public abstract void writeTo(final CodedOutputStream p0) throws IOException;
    
    public abstract static class b<MessageType extends GeneratedMessageLite, BuilderType extends b> extends a$a<BuilderType>
    {
        public c f;
        
        public b() {
            this.f = (c)c.f;
        }
        
        public BuilderType b() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
        
        public abstract BuilderType c(final MessageType p0);
        
        public /* bridge */ Object clone() throws CloneNotSupportedException {
            return this.b();
        }
    }
}
