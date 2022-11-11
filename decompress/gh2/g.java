// 
// Decompiled by Procyon v0.6.0
// 

package gh2;

import kotlin.reflect.jvm.internal.impl.builtins.e$a;
import di2.d;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import ig2.o;
import sg2.e;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import java.util.Set;
import ig2.e0;
import kotlin.reflect.jvm.internal.impl.load.kotlin.b;
import java.util.LinkedHashSet;

public final class g
{
    public static final LinkedHashSet a;
    public static final LinkedHashSet b;
    public static final LinkedHashSet c;
    public static final LinkedHashSet d;
    public static final LinkedHashSet e;
    public static final LinkedHashSet f;
    
    static {
        a = e0.Y0((Set)kotlin.reflect.jvm.internal.impl.load.kotlin.b.e("Collection", new String[] { "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;" }), (Object)"java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        final List s1 = lw0.b.s1((Object[])new JvmPrimitiveType[] { JvmPrimitiveType.BOOLEAN, JvmPrimitiveType.CHAR });
        final LinkedHashSet set = new LinkedHashSet();
        for (final JvmPrimitiveType jvmPrimitiveType : s1) {
            final String c2 = jvmPrimitiveType.getWrapperFqName().f().c();
            sg2.e.e((Object)c2, "it.wrapperFqName.shortName().asString()");
            final StringBuilder sb = new StringBuilder();
            sb.append(jvmPrimitiveType.getJavaKeywordName());
            sb.append("Value()");
            sb.append(jvmPrimitiveType.getDesc());
            o.j3((Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.d(c2, new String[] { sb.toString() }), (Collection)set);
        }
        b = e0.X0((Set)e0.X0((Set)e0.X0((Set)e0.X0((Set)e0.X0((Set)e0.X0((Set)set, (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.e("List", new String[] { "sort(Ljava/util/Comparator;)V" })), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.d("String", new String[] { "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;" })), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.d("Double", new String[] { "isInfinite()Z", "isNaN()Z" })), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.d("Float", new String[] { "isInfinite()Z", "isNaN()Z" })), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.d("Enum", new String[] { "getDeclaringClass()Ljava/lang/Class;", "finalize()V" })), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.d("CharSequence", new String[] { "isEmpty()Z" }));
        c = e0.X0((Set)e0.X0((Set)e0.X0((Set)e0.X0((Set)e0.X0((Set)e0.X0((Set)kotlin.reflect.jvm.internal.impl.load.kotlin.b.d("CharSequence", new String[] { "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;" }), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.e("Iterator", new String[] { "forEachRemaining(Ljava/util/function/Consumer;)V" })), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.d("Iterable", new String[] { "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;" })), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.d("Throwable", new String[] { "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V" })), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.e("Collection", new String[] { "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z" })), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.e("List", new String[] { "replaceAll(Ljava/util/function/UnaryOperator;)V" })), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.e("Map", new String[] { "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;" }));
        d = e0.X0((Set)e0.X0((Set)kotlin.reflect.jvm.internal.impl.load.kotlin.b.e("Collection", new String[] { "removeIf(Ljava/util/function/Predicate;)Z" }), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.e("List", new String[] { "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V" })), (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.e("Map", new String[] { "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z" }));
        final JvmPrimitiveType boolean1 = JvmPrimitiveType.BOOLEAN;
        final JvmPrimitiveType byte1 = JvmPrimitiveType.BYTE;
        final List s2 = lw0.b.s1((Object[])new JvmPrimitiveType[] { boolean1, byte1, JvmPrimitiveType.DOUBLE, JvmPrimitiveType.FLOAT, byte1, JvmPrimitiveType.INT, JvmPrimitiveType.LONG, JvmPrimitiveType.SHORT });
        final LinkedHashSet set2 = new LinkedHashSet();
        final Iterator iterator2 = s2.iterator();
        while (iterator2.hasNext()) {
            final String c3 = ((JvmPrimitiveType)iterator2.next()).getWrapperFqName().f().c();
            sg2.e.e((Object)c3, "it.wrapperFqName.shortName().asString()");
            final String[] a2 = kotlin.reflect.jvm.internal.impl.load.kotlin.b.a(new String[] { "Ljava/lang/String;" });
            o.j3((Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.d(c3, (String[])Arrays.copyOf(a2, a2.length)), (Collection)set2);
        }
        final String[] a3 = kotlin.reflect.jvm.internal.impl.load.kotlin.b.a(new String[] { "D" });
        final LinkedHashSet x0 = e0.X0((Set)set2, (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.d("Float", (String[])Arrays.copyOf(a3, a3.length)));
        final String[] a4 = kotlin.reflect.jvm.internal.impl.load.kotlin.b.a(new String[] { "[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;" });
        e = e0.X0((Set)x0, (Iterable)kotlin.reflect.jvm.internal.impl.load.kotlin.b.d("String", (String[])Arrays.copyOf(a4, a4.length)));
        final String[] a5 = kotlin.reflect.jvm.internal.impl.load.kotlin.b.a(new String[] { "Ljava/lang/String;Ljava/lang/Throwable;ZZ" });
        f = kotlin.reflect.jvm.internal.impl.load.kotlin.b.d("Throwable", (String[])Arrays.copyOf(a5, a5.length));
    }
    
    public static boolean a(final d d) {
        final boolean a = sg2.e.a((Object)d, (Object)e$a.g);
        boolean b = false;
        if (a || e$a.c0.get(d) != null) {
            b = true;
        }
        return b;
    }
}
