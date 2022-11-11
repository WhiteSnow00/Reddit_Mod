// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.lang.reflect.Modifier;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Iterator;
import p2.e;
import com.google.android.gms.internal.measurement.zzjd;
import java.util.Map;
import java.util.List;

public final class b7
{
    public static final void a(final StringBuilder sb, final int n, final String s, final Object o) {
        if (o instanceof List) {
            final Iterator iterator = ((List)o).iterator();
            while (iterator.hasNext()) {
                a(sb, n, s, iterator.next());
            }
            return;
        }
        if (o instanceof Map) {
            final Iterator iterator2 = ((Map)o).entrySet().iterator();
            while (iterator2.hasNext()) {
                a(sb, n, s, iterator2.next());
            }
            return;
        }
        sb.append('\n');
        final int n2 = 0;
        final int n3 = 0;
        for (int i = 0; i < n; ++i) {
            sb.append(' ');
        }
        sb.append(s);
        if (o instanceof String) {
            sb.append(": \"");
            sb.append(e.o(zzjd.zzm((String)o)));
            sb.append('\"');
            return;
        }
        if (o instanceof zzjd) {
            sb.append(": \"");
            sb.append(e.o((zzjd)o));
            sb.append('\"');
            return;
        }
        if (o instanceof c6) {
            sb.append(" {");
            c((z6)o, sb, n + 2);
            sb.append("\n");
            for (int j = n3; j < n; ++j) {
                sb.append(' ');
            }
            sb.append("}");
            return;
        }
        if (o instanceof Map.Entry) {
            sb.append(" {");
            final Map.Entry entry = (Map.Entry)o;
            final int n4 = n + 2;
            a(sb, n4, "key", entry.getKey());
            a(sb, n4, "value", entry.getValue());
            sb.append("\n");
            for (int k = n2; k < n; ++k) {
                sb.append(' ');
            }
            sb.append("}");
            return;
        }
        sb.append(": ");
        sb.append(o);
    }
    
    public static final String b(final String s) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (Character.isUpperCase(char1)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(char1));
        }
        return sb.toString();
    }
    
    public static void c(final z6 z6, final StringBuilder sb, final int n) {
        final HashMap hashMap = new HashMap();
        final HashMap hashMap2 = new HashMap();
        final TreeSet set = new TreeSet();
        final Method[] declaredMethods = z6.getClass().getDeclaredMethods();
        final int length = declaredMethods.length;
        final int n2 = 0;
        for (final Method method : declaredMethods) {
            hashMap2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                hashMap.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    set.add(method.getName());
                }
            }
        }
        for (final String s : set) {
            String substring;
            if (s.startsWith("get")) {
                substring = s.substring(3);
            }
            else {
                substring = s;
            }
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List")) {
                final String concat = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 4)));
                final Method method2 = hashMap.get(s);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb, n, b(concat), c6.l(method2, z6, new Object[0]));
                    continue;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map")) {
                final String concat2 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1, substring.length() - 3)));
                final Method method3 = hashMap.get(s);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb, n, b(concat2), c6.l(method3, z6, new Object[0]));
                    continue;
                }
            }
            if (hashMap2.get("set".concat(substring)) != null && (!substring.endsWith("Bytes") || !hashMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                final String concat3 = String.valueOf(substring.substring(0, 1).toLowerCase()).concat(String.valueOf(substring.substring(1)));
                final Method method4 = hashMap.get("get".concat(substring));
                final Method method5 = hashMap.get("has".concat(substring));
                if (method4 == null) {
                    continue;
                }
                final Object l = c6.l(method4, z6, new Object[0]);
                Label_0768: {
                    if (method5 == null) {
                        if (l instanceof Boolean) {
                            if (!(boolean)l) {
                                continue;
                            }
                        }
                        else if (l instanceof Integer) {
                            if ((int)l == 0) {
                                continue;
                            }
                        }
                        else if (l instanceof Float) {
                            if (Float.floatToRawIntBits((float)l) == 0) {
                                continue;
                            }
                        }
                        else if (l instanceof Double) {
                            if (Double.doubleToRawLongBits((double)l) == 0L) {
                                continue;
                            }
                        }
                        else {
                            boolean b;
                            if (l instanceof String) {
                                b = l.equals("");
                            }
                            else if (l instanceof zzjd) {
                                b = l.equals(zzjd.zzb);
                            }
                            else if (l instanceof z6) {
                                if (l != ((a7)l).e()) {
                                    break Label_0768;
                                }
                                continue;
                            }
                            else {
                                if (!(l instanceof Enum)) {
                                    break Label_0768;
                                }
                                if (((Enum)l).ordinal() != 0) {
                                    break Label_0768;
                                }
                                continue;
                            }
                            if (b) {
                                continue;
                            }
                        }
                    }
                    else if (!(boolean)c6.l(method5, z6, new Object[0])) {
                        continue;
                    }
                }
                a(sb, n, b(concat3), l);
            }
        }
        if (!(z6 instanceof a6)) {
            final v7 zzc = ((c6)z6).zzc;
            if (zzc != null) {
                for (int j = n2; j < zzc.a; ++j) {
                    a(sb, n, String.valueOf(zzc.b[j] >>> 3), zzc.c[j]);
                }
            }
            return;
        }
        final a6 a6 = (a6)z6;
        throw null;
    }
}
