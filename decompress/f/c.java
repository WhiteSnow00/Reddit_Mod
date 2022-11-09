// 
// Decompiled by Procyon v0.6.0
// 

package f;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.b;
import java.util.ArrayList;
import kotlin.Pair;
import java.util.LinkedHashMap;
import a4.u1;
import android.content.Context;
import ah2.f;
import android.content.Intent;
import androidx.activity.ComponentActivity;
import java.util.Map;

public final class c extends a<String[], Map<String, Boolean>>
{
    public final Intent a(final ComponentActivity componentActivity, final Object o) {
        final String[] array = (String[])o;
        f.f((Object)componentActivity, "context");
        f.f((Object)array, "input");
        final Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", array);
        f.e((Object)putExtra, "Intent(ACTION_REQUEST_PE\u2026EXTRA_PERMISSIONS, input)");
        return putExtra;
    }
    
    public final a$a b(final ComponentActivity componentActivity, final Object o) {
        final String[] array = (String[])o;
        f.f((Object)componentActivity, "context");
        f.f((Object)array, "input");
        final int length = array.length;
        final int n = 1;
        final int n2 = 0;
        a$a a$a;
        if (length == 0) {
            a$a = new a$a((Object)kotlin.collections.c.N1());
        }
        else {
            final int length2 = array.length;
            int n3 = 0;
            int n4;
            while (true) {
                n4 = n;
                if (n3 >= length2) {
                    break;
                }
                if (n3.a.checkSelfPermission((Context)componentActivity, array[n3]) != 0) {
                    n4 = 0;
                    break;
                }
                ++n3;
            }
            if (n4 != 0) {
                int a0;
                if ((a0 = u1.A0(array.length)) < 16) {
                    a0 = 16;
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap(a0);
                for (int length3 = array.length, i = n2; i < length3; ++i) {
                    final Pair pair = new Pair((Object)array[i], (Object)Boolean.TRUE);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
                a$a = new a$a((Object)linkedHashMap);
            }
            else {
                a$a = null;
            }
        }
        return a$a;
    }
    
    public final Object c(int i, final Intent intent) {
        Map map;
        if (i != -1) {
            map = kotlin.collections.c.N1();
        }
        else if (intent == null) {
            map = kotlin.collections.c.N1();
        }
        else {
            final String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            final int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                final ArrayList list = new ArrayList<Boolean>(intArrayExtra.length);
                int length;
                for (length = intArrayExtra.length, i = 0; i < length; ++i) {
                    list.add(intArrayExtra[i] == 0);
                }
                map = kotlin.collections.c.X1((List)CollectionsKt___CollectionsKt.n2((Iterable)b.z1((Object[])stringArrayExtra), (Iterable)list));
            }
            else {
                map = kotlin.collections.c.N1();
            }
        }
        return map;
    }
}
