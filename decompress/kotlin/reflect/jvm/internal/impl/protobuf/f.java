// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.io.UnsupportedEncodingException;

public final class f<FieldDescriptorType extends b<FieldDescriptorType>>
{
    public static final f d;
    public final q a;
    public boolean b;
    public boolean c;
    
    static {
        d = new f(0);
    }
    
    public f() {
        this.c = false;
        final int k = r.k;
        this.a = new q(16);
    }
    
    public f(int k) {
        this.c = false;
        k = r.k;
        this.a = new q(0);
        this.g();
    }
    
    public static int c(final WireFormat$FieldType wireFormat$FieldType, final Object o) {
        switch (f$a.b[wireFormat$FieldType.ordinal()]) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                if (o instanceof Internal.a) {
                    return CodedOutputStream.c(((Internal.a)o).getNumber());
                }
                return CodedOutputStream.c((int)o);
            }
            case 17: {
                if (!(o instanceof g)) {
                    final int serializedSize = ((l)o).getSerializedSize();
                    return CodedOutputStream.e(serializedSize) + serializedSize;
                }
                final g g = (g)o;
                if (((h)g).a) {
                    final int serializedSize2 = ((h)g).b.getSerializedSize();
                    return CodedOutputStream.e(serializedSize2) + serializedSize2;
                }
                throw null;
            }
            case 16: {
                return ((l)o).getSerializedSize();
            }
            case 15: {
                final long longValue = (long)o;
                return CodedOutputStream.f(longValue >> 63 ^ longValue << 1);
            }
            case 14: {
                final int intValue = (int)o;
                return CodedOutputStream.e(intValue >> 31 ^ intValue << 1);
            }
            case 13: {
                ((Long)o).longValue();
                return 8;
            }
            case 12: {
                ((Integer)o).intValue();
                return 4;
            }
            case 11: {
                return CodedOutputStream.e((int)o);
            }
            case 10: {
                if (o instanceof c) {
                    final c c = (c)o;
                    return c.size() + CodedOutputStream.e(c.size());
                }
                final byte[] array = (byte[])o;
                return CodedOutputStream.e(array.length) + array.length;
            }
            case 9: {
                final String s = (String)o;
                try {
                    final byte[] bytes = s.getBytes("UTF-8");
                    return CodedOutputStream.e(bytes.length) + bytes.length;
                }
                catch (final UnsupportedEncodingException ex) {
                    throw new RuntimeException("UTF-8 not supported.", ex);
                }
            }
            case 8: {
                ((Boolean)o).booleanValue();
                return 1;
            }
            case 7: {
                ((Integer)o).intValue();
                return 4;
            }
            case 6: {
                ((Long)o).longValue();
                return 8;
            }
            case 5: {
                return CodedOutputStream.c((int)o);
            }
            case 4: {
                return CodedOutputStream.f((long)o);
            }
            case 3: {
                return CodedOutputStream.f((long)o);
            }
            case 2: {
                ((Float)o).floatValue();
                return 4;
            }
            case 1: {
                ((Double)o).doubleValue();
                return 8;
            }
        }
    }
    
    public static int d(final b<?> b, final Object o) {
        final WireFormat$FieldType q = b.q();
        final int number = b.getNumber();
        if (!b.z()) {
            int g = CodedOutputStream.g(number);
            if (q == WireFormat$FieldType.GROUP) {
                g *= 2;
            }
            return c(q, o) + g;
        }
        final boolean packed = b.isPacked();
        final int n = 0;
        int n2 = 0;
        if (packed) {
            final Iterator iterator = ((List)o).iterator();
            while (iterator.hasNext()) {
                n2 += c(q, iterator.next());
            }
            return CodedOutputStream.e(n2) + (CodedOutputStream.g(number) + n2);
        }
        final Iterator iterator2 = ((List)o).iterator();
        int n3 = n;
        while (iterator2.hasNext()) {
            final Object next = iterator2.next();
            int g2 = CodedOutputStream.g(number);
            if (q == WireFormat$FieldType.GROUP) {
                g2 *= 2;
            }
            n3 += c(q, next) + g2;
        }
        return n3;
    }
    
    public static boolean f(final Map.Entry entry) {
        final b b = entry.getKey();
        if (b.x() == WireFormat$JavaType.MESSAGE) {
            if (b.z()) {
                final Iterator iterator = ((List)entry.getValue()).iterator();
                while (iterator.hasNext()) {
                    if (!((m)iterator.next()).isInitialized()) {
                        return false;
                    }
                }
            }
            else {
                final V value = entry.getValue();
                if (value instanceof l) {
                    if (!((m)value).isInitialized()) {
                        return false;
                    }
                }
                else {
                    if (value instanceof g) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }
    
    public static Object i(final d d, final WireFormat$FieldType wireFormat$FieldType) throws IOException {
        final int n = f$a.b[wireFormat$FieldType.ordinal()];
        boolean b = true;
        switch (n) {
            default: {
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
            case 18: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            }
            case 17: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            }
            case 16: {
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            }
            case 15: {
                final long l = d.l();
                return -(l & 0x1L) ^ l >>> 1;
            }
            case 14: {
                final int k = d.k();
                return -(k & 0x1) ^ k >>> 1;
            }
            case 13: {
                return d.j();
            }
            case 12: {
                return d.i();
            }
            case 11: {
                return d.k();
            }
            case 10: {
                return d.e();
            }
            case 9: {
                final int i = d.k();
                final int b2 = d.b;
                final int d2 = d.d;
                String s2;
                if (i <= b2 - d2 && i > 0) {
                    final String s = new String(d.a, d2, i, "UTF-8");
                    d.d += i;
                    s2 = s;
                }
                else if (i == 0) {
                    s2 = "";
                }
                else {
                    s2 = new String(d.h(i), "UTF-8");
                }
                return s2;
            }
            case 8: {
                if (d.l() == 0L) {
                    b = false;
                }
                return b;
            }
            case 7: {
                return d.i();
            }
            case 6: {
                return d.j();
            }
            case 5: {
                return d.k();
            }
            case 4: {
                return d.l();
            }
            case 3: {
                return d.l();
            }
            case 2: {
                return Float.intBitsToFloat(d.i());
            }
            case 1: {
                return Double.longBitsToDouble(d.j());
            }
        }
    }
    
    public static void k(final WireFormat$FieldType wireFormat$FieldType, final Object o) {
        o.getClass();
        final int n = f$a.a[wireFormat$FieldType.getJavaType().ordinal()];
        final boolean b = true;
        int n2 = 0;
        Label_0147: {
            switch (n) {
                default: {
                    break Label_0147;
                }
                case 9: {
                    n2 = (b ? 1 : 0);
                    if (o instanceof l) {
                        break Label_0147;
                    }
                    if (o instanceof g) {
                        n2 = (b ? 1 : 0);
                        break Label_0147;
                    }
                    break;
                }
                case 8: {
                    n2 = (b ? 1 : 0);
                    if (o instanceof Integer) {
                        break Label_0147;
                    }
                    if (o instanceof Internal.a) {
                        n2 = (b ? 1 : 0);
                        break Label_0147;
                    }
                    break;
                }
                case 7: {
                    n2 = (b ? 1 : 0);
                    if (o instanceof c) {
                        break Label_0147;
                    }
                    if (o instanceof byte[]) {
                        n2 = (b ? 1 : 0);
                        break Label_0147;
                    }
                    break;
                }
                case 6: {
                    n2 = ((o instanceof String) ? 1 : 0);
                    break Label_0147;
                }
                case 5: {
                    n2 = ((o instanceof Boolean) ? 1 : 0);
                    break Label_0147;
                }
                case 4: {
                    n2 = ((o instanceof Double) ? 1 : 0);
                    break Label_0147;
                }
                case 3: {
                    n2 = ((o instanceof Float) ? 1 : 0);
                    break Label_0147;
                }
                case 2: {
                    n2 = ((o instanceof Long) ? 1 : 0);
                    break Label_0147;
                }
                case 1: {
                    n2 = ((o instanceof Integer) ? 1 : 0);
                    break Label_0147;
                }
            }
            n2 = 0;
        }
        if (n2 != 0) {
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
    
    public static void l(final CodedOutputStream codedOutputStream, final WireFormat$FieldType wireFormat$FieldType, final int n, final Object o) throws IOException {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            final l l = (l)o;
            codedOutputStream.v(n, 3);
            l.writeTo(codedOutputStream);
            codedOutputStream.v(n, 4);
        }
        else {
            codedOutputStream.v(n, wireFormat$FieldType.getWireType());
            m(codedOutputStream, wireFormat$FieldType, o);
        }
    }
    
    public static void m(final CodedOutputStream codedOutputStream, final WireFormat$FieldType wireFormat$FieldType, final Object o) throws IOException {
        switch (f$a.b[wireFormat$FieldType.ordinal()]) {
            case 18: {
                if (o instanceof Internal.a) {
                    codedOutputStream.m(((Internal.a)o).getNumber());
                    break;
                }
                codedOutputStream.m((int)o);
                break;
            }
            case 17: {
                final l l = (l)o;
                codedOutputStream.getClass();
                codedOutputStream.t(l.getSerializedSize());
                l.writeTo(codedOutputStream);
                break;
            }
            case 16: {
                final l i = (l)o;
                codedOutputStream.getClass();
                i.writeTo(codedOutputStream);
                break;
            }
            case 15: {
                final long longValue = (long)o;
                codedOutputStream.u(longValue >> 63 ^ longValue << 1);
                break;
            }
            case 14: {
                final int intValue = (int)o;
                codedOutputStream.t(intValue >> 31 ^ intValue << 1);
                break;
            }
            case 13: {
                codedOutputStream.s((long)o);
                break;
            }
            case 12: {
                codedOutputStream.r((int)o);
                break;
            }
            case 11: {
                codedOutputStream.t((int)o);
                break;
            }
            case 10: {
                if (o instanceof c) {
                    final c c = (c)o;
                    codedOutputStream.getClass();
                    codedOutputStream.t(c.size());
                    codedOutputStream.p(c);
                    break;
                }
                final byte[] array = (byte[])o;
                codedOutputStream.getClass();
                codedOutputStream.t(array.length);
                codedOutputStream.q(array);
                break;
            }
            case 9: {
                final String s = (String)o;
                codedOutputStream.getClass();
                final byte[] bytes = s.getBytes("UTF-8");
                codedOutputStream.t(bytes.length);
                codedOutputStream.q(bytes);
                break;
            }
            case 8: {
                codedOutputStream.o(((boolean)o) ? 1 : 0);
                break;
            }
            case 7: {
                codedOutputStream.r((int)o);
                break;
            }
            case 6: {
                codedOutputStream.s((long)o);
                break;
            }
            case 5: {
                codedOutputStream.m((int)o);
                break;
            }
            case 4: {
                codedOutputStream.u((long)o);
                break;
            }
            case 3: {
                codedOutputStream.u((long)o);
                break;
            }
            case 2: {
                final float floatValue = (float)o;
                codedOutputStream.getClass();
                codedOutputStream.r(Float.floatToRawIntBits(floatValue));
                break;
            }
            case 1: {
                final double doubleValue = (double)o;
                codedOutputStream.getClass();
                codedOutputStream.s(Double.doubleToRawLongBits(doubleValue));
                break;
            }
        }
    }
    
    public final void a(final GeneratedMessageLite$d generatedMessageLite$d, final Object o) {
        if (generatedMessageLite$d.i) {
            k(generatedMessageLite$d.h, o);
            final Object e = this.e(generatedMessageLite$d);
            List list2;
            if (e == null) {
                final ArrayList list = new ArrayList();
                ((r<GeneratedMessageLite$d, ArrayList>)this.a).f(generatedMessageLite$d, list);
                list2 = list;
            }
            else {
                list2 = (List)e;
            }
            list2.add(o);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }
    
    public final f<FieldDescriptorType> b() {
        final f f = new f();
        for (int i = 0; i < ((r)this.a).g.size(); ++i) {
            final Map.Entry entry = ((r)this.a).g.get(i);
            f.j((b)entry.getKey(), entry.getValue());
        }
        for (final Map.Entry<b, V> entry2 : ((r<Comparable, Object>)this.a).d()) {
            f.j(entry2.getKey(), entry2.getValue());
        }
        f.c = this.c;
        return f;
    }
    
    public final Object e(final FieldDescriptorType fieldDescriptorType) {
        Object o2;
        final Object o = o2 = ((r<K, Object>)this.a).get(fieldDescriptorType);
        if (o instanceof g) {
            o2 = ((g)o).a();
        }
        return o2;
    }
    
    public final void g() {
        if (this.b) {
            return;
        }
        final q a = this.a;
        if (!((r)a).i) {
            for (int i = 0; i < ((r)a).g.size(); ++i) {
                final Map.Entry entry = ((r)a).g.get(i);
                if (((b)entry.getKey()).z()) {
                    entry.setValue(Collections.unmodifiableList((List<?>)entry.getValue()));
                }
            }
            for (final Map.Entry<b, V> entry2 : ((r)a).d()) {
                if (entry2.getKey().z()) {
                    entry2.setValue((V)Collections.unmodifiableList((List<?>)entry2.getValue()));
                }
            }
        }
        if (!((r)a).i) {
            Map<Object, Object> h;
            if (((r)a).h.isEmpty()) {
                h = (Map<Object, Object>)Collections.emptyMap();
            }
            else {
                h = (Map<Object, Object>)Collections.unmodifiableMap((Map<? extends K, ? extends V>)((r)a).h);
            }
            ((r)a).h = (Map<K, V>)h;
            ((r)a).i = true;
        }
        this.b = true;
    }
    
    public final void h(final Map.Entry<FieldDescriptorType, Object> entry) {
        final b<FieldDescriptorType> b = entry.getKey();
        l l;
        final g g = (g)(l = (l)entry.getValue());
        if (g instanceof g) {
            l = g.a();
        }
        if (b.z()) {
            Object e;
            if ((e = this.e((FieldDescriptorType)b)) == null) {
                e = new ArrayList();
            }
            for (final Object next : (List)l) {
                final List list = (List)e;
                Object o = next;
                if (next instanceof byte[]) {
                    final byte[] array = (byte[])next;
                    o = new byte[array.length];
                    System.arraycopy(array, 0, o, 0, array.length);
                }
                list.add(o);
            }
            ((r<FieldDescriptorType, List>)this.a).f((FieldDescriptorType)b, (List)e);
        }
        else if (b.x() == WireFormat$JavaType.MESSAGE) {
            final Object e2 = this.e((FieldDescriptorType)b);
            if (e2 == null) {
                final q a = this.a;
                Object o2 = l;
                if (l instanceof byte[]) {
                    final byte[] array2 = (Object)l;
                    o2 = new byte[array2.length];
                    System.arraycopy(array2, 0, o2, 0, array2.length);
                }
                ((r<FieldDescriptorType, Object>)a).f((FieldDescriptorType)b, o2);
            }
            else {
                ((r<FieldDescriptorType, l>)this.a).f((FieldDescriptorType)b, ((l$a)b.b(((l)e2).toBuilder(), l)).build());
            }
        }
        else {
            final q a2 = this.a;
            Object o3 = l;
            if (l instanceof byte[]) {
                final byte[] array3 = (Object)l;
                o3 = new byte[array3.length];
                System.arraycopy(array3, 0, o3, 0, array3.length);
            }
            ((r<FieldDescriptorType, Object>)a2).f((FieldDescriptorType)b, o3);
        }
    }
    
    public final void j(final FieldDescriptorType fieldDescriptorType, Object next) {
        if (fieldDescriptorType.z()) {
            if (!(next instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            final ArrayList list = new ArrayList();
            list.addAll((Collection)next);
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                next = iterator.next();
                k(fieldDescriptorType.q(), next);
            }
            next = list;
        }
        else {
            k(fieldDescriptorType.q(), next);
        }
        if (next instanceof g) {
            this.c = true;
        }
        ((r<FieldDescriptorType, Object>)this.a).f(fieldDescriptorType, next);
    }
    
    public interface b<T extends b<T>> extends Comparable<T>
    {
        GeneratedMessageLite$b b(final l$a p0, final l p1);
        
        int getNumber();
        
        boolean isPacked();
        
        WireFormat$FieldType q();
        
        WireFormat$JavaType x();
        
        boolean z();
    }
}
