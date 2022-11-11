// 
// Decompiled by Procyon v0.6.0
// 

package kotlin.reflect.jvm.internal.impl.resolve.constants;

import hi2.q;
import kotlin.collections.EmptyList;
import hi2.s;
import hi2.c;
import hi2.h;
import hi2.k;
import hi2.p;
import hi2.r;
import hi2.d;
import sg2.e;
import ti2.t;
import hi2.g;
import java.util.Iterator;
import rg2.l;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import hi2.b;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import java.util.List;

public final class ConstantValueFactory
{
    public static b a(final List list, final PrimitiveType primitiveType) {
        final List q4 = CollectionsKt___CollectionsKt.q4((Iterable)list);
        final ArrayList list2 = new ArrayList();
        final Iterator iterator = q4.iterator();
        while (iterator.hasNext()) {
            final g c = c(iterator.next());
            if (c != null) {
                list2.add(c);
            }
        }
        return new b((List)list2, (l)new ConstantValueFactory$createArrayValue$3(primitiveType));
    }
    
    public static b b(final List list, final t t) {
        e.f((Object)list, "value");
        return new b(list, (l)new ConstantValueFactory$createArrayValue$1(t));
    }
    
    public static g c(final Object o) {
        Object o2;
        if (o instanceof Byte) {
            o2 = new d(((Number)o).byteValue());
        }
        else if (o instanceof Short) {
            o2 = new r(((Number)o).shortValue());
        }
        else if (o instanceof Integer) {
            o2 = new hi2.l(((Number)o).intValue());
        }
        else if (o instanceof Long) {
            o2 = new p(((Number)o).longValue());
        }
        else if (o instanceof Character) {
            o2 = new hi2.e((char)o);
        }
        else if (o instanceof Float) {
            o2 = new k(((Number)o).floatValue());
        }
        else if (o instanceof Double) {
            o2 = new h(((Number)o).doubleValue());
        }
        else if (o instanceof Boolean) {
            o2 = new c((boolean)o);
        }
        else if (o instanceof String) {
            o2 = new s((String)o);
        }
        else if (o instanceof byte[]) {
            o2 = a(kotlin.collections.b.t1((byte[])o), PrimitiveType.BYTE);
        }
        else {
            final boolean b = o instanceof short[];
            final int n = 0;
            final int n2 = 0;
            final int n3 = 0;
            final int n4 = 0;
            final int n5 = 0;
            int n6 = 0;
            if (b) {
                final short[] array = (short[])o;
                e.f((Object)array, "<this>");
                final int length = array.length;
                Object o3;
                if (length != 0) {
                    if (length != 1) {
                        final ArrayList list = new ArrayList(array.length);
                        final int length2 = array.length;
                        while (true) {
                            o3 = list;
                            if (n6 >= length2) {
                                break;
                            }
                            list.add((Object)array[n6]);
                            ++n6;
                        }
                    }
                    else {
                        o3 = lw0.b.r1((Object)array[0]);
                    }
                }
                else {
                    o3 = EmptyList.INSTANCE;
                }
                o2 = a((List)o3, PrimitiveType.SHORT);
            }
            else if (o instanceof int[]) {
                o2 = a(kotlin.collections.b.u1((int[])o), PrimitiveType.INT);
            }
            else if (o instanceof long[]) {
                final long[] array2 = (long[])o;
                e.f((Object)array2, "<this>");
                final int length3 = array2.length;
                Object o4;
                if (length3 != 0) {
                    if (length3 != 1) {
                        final ArrayList list2 = new ArrayList(array2.length);
                        final int length4 = array2.length;
                        int n7 = n;
                        while (true) {
                            o4 = list2;
                            if (n7 >= length4) {
                                break;
                            }
                            list2.add((Object)array2[n7]);
                            ++n7;
                        }
                    }
                    else {
                        o4 = lw0.b.r1((Object)array2[0]);
                    }
                }
                else {
                    o4 = EmptyList.INSTANCE;
                }
                o2 = a((List)o4, PrimitiveType.LONG);
            }
            else if (o instanceof char[]) {
                final char[] array3 = (char[])o;
                e.f((Object)array3, "<this>");
                final int length5 = array3.length;
                Object o5;
                if (length5 != 0) {
                    if (length5 != 1) {
                        final ArrayList list3 = new ArrayList(array3.length);
                        final int length6 = array3.length;
                        int n8 = n2;
                        while (true) {
                            o5 = list3;
                            if (n8 >= length6) {
                                break;
                            }
                            list3.add((Object)array3[n8]);
                            ++n8;
                        }
                    }
                    else {
                        o5 = lw0.b.r1((Object)array3[0]);
                    }
                }
                else {
                    o5 = EmptyList.INSTANCE;
                }
                o2 = a((List)o5, PrimitiveType.CHAR);
            }
            else if (o instanceof float[]) {
                final float[] array4 = (float[])o;
                e.f((Object)array4, "<this>");
                final int length7 = array4.length;
                Object o6;
                if (length7 != 0) {
                    if (length7 != 1) {
                        final ArrayList list4 = new ArrayList(array4.length);
                        final int length8 = array4.length;
                        int n9 = n3;
                        while (true) {
                            o6 = list4;
                            if (n9 >= length8) {
                                break;
                            }
                            list4.add((Object)array4[n9]);
                            ++n9;
                        }
                    }
                    else {
                        o6 = lw0.b.r1((Object)array4[0]);
                    }
                }
                else {
                    o6 = EmptyList.INSTANCE;
                }
                o2 = a((List)o6, PrimitiveType.FLOAT);
            }
            else if (o instanceof double[]) {
                final double[] array5 = (double[])o;
                e.f((Object)array5, "<this>");
                final int length9 = array5.length;
                Object o7;
                if (length9 != 0) {
                    if (length9 != 1) {
                        final ArrayList list5 = new ArrayList(array5.length);
                        final int length10 = array5.length;
                        int n10 = n4;
                        while (true) {
                            o7 = list5;
                            if (n10 >= length10) {
                                break;
                            }
                            list5.add((Object)array5[n10]);
                            ++n10;
                        }
                    }
                    else {
                        o7 = lw0.b.r1((Object)array5[0]);
                    }
                }
                else {
                    o7 = EmptyList.INSTANCE;
                }
                o2 = a((List)o7, PrimitiveType.DOUBLE);
            }
            else if (o instanceof boolean[]) {
                final boolean[] array6 = (boolean[])o;
                e.f((Object)array6, "<this>");
                final int length11 = array6.length;
                Object o8;
                if (length11 != 0) {
                    if (length11 != 1) {
                        final ArrayList list6 = new ArrayList(array6.length);
                        final int length12 = array6.length;
                        int n11 = n5;
                        while (true) {
                            o8 = list6;
                            if (n11 >= length12) {
                                break;
                            }
                            list6.add((Object)array6[n11]);
                            ++n11;
                        }
                    }
                    else {
                        o8 = lw0.b.r1((Object)array6[0]);
                    }
                }
                else {
                    o8 = EmptyList.INSTANCE;
                }
                o2 = a((List)o8, PrimitiveType.BOOLEAN);
            }
            else if (o == null) {
                o2 = new q();
            }
            else {
                o2 = null;
            }
        }
        return (g)o2;
    }
}
