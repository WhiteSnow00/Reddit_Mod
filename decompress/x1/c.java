// 
// Decompiled by Procyon v0.6.0
// 

package x1;

import java.io.File;
import ig.w;
import h3.b;
import java.util.HashSet;
import e9.i;
import gn.a;
import android.view.KeyEvent;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import java.util.LinkedHashMap;
import ah2.f;
import com.tonyodev.fetch2core.Extras;
import ig.s;
import e9.h;

public final class c implements h, s
{
    public static Extras c(String string) {
        f.g((Object)string, "jsonString");
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final JSONObject jsonObject = new JSONObject(string);
        final Iterator keys = jsonObject.keys();
        f.b((Object)keys, "json.keys()");
        while (keys.hasNext()) {
            final String s = keys.next();
            f.b((Object)s, "it");
            string = jsonObject.getString(s);
            f.b((Object)string, "json.getString(it)");
            linkedHashMap.put(s, string);
        }
        return new Extras((Map)linkedHashMap);
    }
    
    public static String d(final Extras extras) {
        f.g((Object)extras, "extras");
        String string;
        if (extras.isEmpty()) {
            string = "{}";
        }
        else {
            final JSONObject jsonObject = new JSONObject();
            for (final Map.Entry<String, V> entry : extras.getMap().entrySet()) {
                jsonObject.put((String)entry.getKey(), (Object)entry.getValue());
            }
            string = jsonObject.toString();
            f.b((Object)string, "json.toString()");
        }
        return string;
    }
    
    public static LinkedHashMap e(String s) {
        f.g((Object)s, "jsonString");
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final JSONObject jsonObject = new JSONObject(s);
        final Iterator keys = jsonObject.keys();
        f.b((Object)keys, "json.keys()");
        while (keys.hasNext()) {
            s = (String)keys.next();
            f.b((Object)s, "it");
            final String string = jsonObject.getString(s);
            f.b((Object)string, "json.getString(it)");
            linkedHashMap.put(s, string);
        }
        return linkedHashMap;
    }
    
    public static final long f(final KeyEvent keyEvent) {
        f.f((Object)keyEvent, "$this$key");
        return a.E(keyEvent.getKeyCode());
    }
    
    public static final int h(final KeyEvent keyEvent) {
        f.f((Object)keyEvent, "$this$type");
        final int action = keyEvent.getAction();
        int n = 1;
        if (action != 0) {
            if (action != 1) {
                n = 0;
            }
        }
        else {
            n = 2;
        }
        return n;
    }
    
    public static String i(final Map map) {
        f.g((Object)map, "headerMap");
        String string;
        if (map.isEmpty()) {
            string = "{}";
        }
        else {
            final JSONObject jsonObject = new JSONObject();
            for (final Map.Entry<String, V> entry : map.entrySet()) {
                jsonObject.put((String)entry.getKey(), (Object)entry.getValue());
            }
            string = jsonObject.toString();
            f.b((Object)string, "json.toString()");
        }
        return string;
    }
    
    public final void a(final i i) {
    }
    
    public final void b(final i i) {
        i.onStart();
    }
    
    public final void g(final ClassLoader classLoader, final HashSet set) {
        b.a(classLoader, set, (w)new ah2.c());
    }
    
    public final boolean v(final ClassLoader classLoader, final File file, final File file2, final boolean b) {
        return b.c(classLoader, file, file2, b);
    }
}
