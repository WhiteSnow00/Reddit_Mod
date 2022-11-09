// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import kotlin.jvm.internal.n;
import java.util.Iterator;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Map;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import com.bytedance.covode.number.Covode;

public final class 0iL
{
    static {
        Covode.recordClassIndex(6693);
    }
    
    public static final String[] LIZ(final List<? extends LiveEffect> list, final Map<LiveEffect, ? extends Map<String, Float>> map) {
        CTM.LIZ((Object)list, (Object)map);
        final ArrayList list2 = new ArrayList();
    Label_0020:
        for (final LiveEffect liveEffect : list) {
            for (final LiveEffect next : map.keySet()) {
                if (next.equals((Object)liveEffect)) {
                    if (next == null) {
                        break;
                    }
                    final Map map2 = (Map)map.get(next);
                    if (map2 != null) {
                        for (final Map.Entry<String, V> entry : map2.entrySet()) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(liveEffect.unzipPath);
                            sb.append(':');
                            sb.append(entry.getKey());
                            sb.append(':');
                            sb.append(((Number)entry.getValue()).floatValue());
                            list2.add(sb.toString());
                        }
                        continue Label_0020;
                    }
                    continue Label_0020;
                }
            }
            list2.add(liveEffect.unzipPath);
        }
        final Object[] array = list2.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[])array;
    }
    
    public static final String[] LIZ(final List<? extends LiveEffect> list, final String[] array) {
        CTM.LIZ((Object)list, (Object)array);
        final ArrayList list2 = new ArrayList(array.length);
        final int length = array.length;
        int n = 0;
    Label_0021:
        while (true) {
            final String s = "";
            if (n < length) {
                final String s2 = array[n];
                while (true) {
                    for (final LiveEffect next : list) {
                        if (kotlin.jvm.internal.n.LIZ((Object)next.unzipPath, (Object)s2)) {
                            final LiveEffect liveEffect = next;
                            String extra = s;
                            if (liveEffect != null) {
                                extra = liveEffect.extra;
                                if (extra == null) {
                                    extra = s;
                                }
                            }
                            list2.add(extra);
                            ++n;
                            continue Label_0021;
                        }
                    }
                    LiveEffect next = null;
                    continue;
                }
            }
            break;
        }
        final Object[] array2 = list2.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        final String[] array3 = (String[])array2;
        final StringBuilder sb = new StringBuilder("effect extra list:");
        final String string = Arrays.toString(array3);
        kotlin.jvm.internal.n.LIZIZ((Object)string, "");
        sb.append(string);
        0ba.LIZ(3, "ComposerUtils", sb.toString());
        return array3;
    }
}
