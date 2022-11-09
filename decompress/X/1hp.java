// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.SystemClock;
import java.util.Map;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.util.Set;
import android.os.Build$VERSION;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 1hp extends 1Dv
{
    static {
        Covode.recordClassIndex(4552);
    }
    
    public 1hp(final 1hm 1hm) {
        super(1hm);
    }
    
    private JSONObject LIZIZ(final 0Sq 0Sq) {
        final JSONObject jsonObject = new JSONObject();
        while (true) {
            if (0Sq != null) {
                try {
                    String liziz = 0Sq.LIZIZ;
                    while (true) {
                        jsonObject.putOpt("http_msg", (Object)liziz);
                        if (0Sq == null) {
                            return jsonObject;
                        }
                        final Throwable ljff = 0Sq.LJFF;
                        if (ljff != null) {
                            jsonObject.putOpt("http_err_class", (Object)ljff.getClass().getCanonicalName());
                            return jsonObject;
                        }
                        return jsonObject;
                        liziz = "RESPONSE IS NULL";
                        continue;
                    }
                }
                catch (final JSONException ex) {
                    0II.LIZ((Exception)ex);
                }
                return jsonObject;
            }
            continue;
        }
    }
    
    @Override
    public final 0Sp LIZ(final 0Sp 0Sp) {
        final String s = "";
        final 1Dk lj = 0Sp.LJ;
        String liziz;
        final String s2 = liziz = 0Sp.LIZIZ;
        String liz3 = null;
        try {
            final boolean lizlll = lj.LIZLLL;
            liziz = s2;
            if (!1hk.LIZLLL().LIZ) {
                liziz = s2;
                liziz = s2;
                final IllegalStateException ex = new IllegalStateException("SDK has not been initialized");
                liziz = s2;
                ex.getMessage();
                liziz = s2;
                throw ex;
            }
            liziz = s2;
            Map map = null;
            Label_0656: {
                Object o = null;
                Label_0574: {
                    Label_0256: {
                        if (1hk.LIZLLL().LIZIZ()) {
                            liziz = s2;
                            final 1Do 1Do = 1hk.LIZLLL().LIZLLL.LIZ.get("c2s");
                            liziz = s2;
                            if (1Do instanceof 1hm) {
                                liziz = s2;
                                final 1Dx liz = ((1hm)1Do).LIZ;
                                if (liz != null) {
                                    liziz = s2;
                                    String liz2 = 0Rv.LIZ(s2);
                                    liziz = s2;
                                    if (!TextUtils.isEmpty((CharSequence)liz2)) {
                                        liziz = s2;
                                        if (liz.LJ) {
                                            liziz = s2;
                                            if (liz.LJFF == null) {
                                                liziz = s2;
                                                liziz = s2;
                                                final ArrayList<String> ljff = new ArrayList<String>();
                                                liziz = s2;
                                                liz.LJFF = ljff;
                                            }
                                            liziz = s2;
                                            if (!liz.LJFF.contains(liz2)) {
                                                liziz = s2;
                                                final 0Sk lji = liz.LJI;
                                                liziz = s2;
                                                liziz = s2;
                                                final ArrayList list = new ArrayList();
                                                List<String> list2;
                                                if (lizlll) {
                                                    liziz = s2;
                                                    list2 = liz.LIZJ;
                                                }
                                                else {
                                                    liziz = s2;
                                                    list2 = liz.LIZLLL;
                                                }
                                                HashSet<Object> set;
                                                if (list2 != null) {
                                                    liziz = s2;
                                                    liziz = s2;
                                                    set = new HashSet<Object>(list2);
                                                }
                                                else {
                                                    liziz = s2;
                                                    set = new HashSet<Object>();
                                                }
                                                Set<Object> set2 = set;
                                                liziz = s2;
                                                if (Build$VERSION.SDK_INT >= 24) {
                                                    liziz = s2;
                                                    final Stream<Object> stream = set.stream();
                                                    liziz = s2;
                                                    liziz = s2;
                                                    final 0Ss 0Ss = new 0Ss();
                                                    liziz = s2;
                                                    set2 = stream.filter((Predicate<? super Object>)0Ss).collect((Collector<? super Object, ?, Set<Object>>)Collectors.toSet());
                                                }
                                                liziz = s2;
                                                final Iterator<Object> iterator = set2.iterator();
                                                while (true) {
                                                    liziz = s2;
                                                    if (!iterator.hasNext()) {
                                                        break;
                                                    }
                                                    liziz = s2;
                                                    final String s3 = iterator.next();
                                                    liziz = s2;
                                                    if (!s2.contains(s3)) {
                                                        continue;
                                                    }
                                                    liziz = s2;
                                                    list.add(s3);
                                                }
                                                if (lji != null) {
                                                    liziz = s2;
                                                    o = lji.LIZ(list);
                                                }
                                                else {
                                                    liziz = s2;
                                                    o = Collections.emptyMap();
                                                }
                                                liziz = s2;
                                                list.removeAll(((Map)o).keySet());
                                                break Label_0574;
                                            }
                                        }
                                    }
                                    if (liz2 == null) {
                                        liz2 = "";
                                    }
                                    liziz = s2;
                                    0II.LIZ("host is empty or c2s tracker disabled or host[%s]'s macro replacement is forbidden", new Object[] { liz2 });
                                    liziz = s2;
                                    o = Collections.emptyMap();
                                    break Label_0256;
                                }
                            }
                            liziz = s2;
                            liziz = s2;
                            final IllegalStateException ex2 = new IllegalStateException("c2s Tracker has not finished initializing yet");
                            liziz = s2;
                            ex2.getMessage();
                            liziz = s2;
                            throw ex2;
                        }
                        liziz = s2;
                        o = Collections.emptyMap();
                    }
                    map = (Map)o;
                    if (o == null) {
                        break Label_0656;
                    }
                }
                liziz = s2;
                final String value = String.valueOf(lj.LJIIIIZZ);
                liziz = s2;
                if (((Map)o).containsKey("__TS__")) {
                    liziz = s2;
                    ((Map)o).put("__TS__", value);
                }
                map = (Map)o;
                liziz = s2;
                if (((Map)o).containsKey("{TS}")) {
                    liziz = s2;
                    ((Map)o).put("{TS}", value);
                    map = (Map)o;
                }
            }
            liziz = s2;
            final Iterator iterator2 = map.keySet().iterator();
            String replace = s2;
            while (true) {
                liziz = replace;
                if (!iterator2.hasNext()) {
                    break;
                }
                liziz = replace;
                final String s4 = (String)iterator2.next();
                liziz = replace;
                final String s5 = (String)map.get(s4);
                liziz = replace;
                if (TextUtils.isEmpty((CharSequence)s5)) {
                    continue;
                }
                liziz = replace;
                replace = replace.replace(s4, s5);
            }
        }
        finally {
            final Throwable t;
            t.getMessage();
            liz3 = liziz;
        }
        final 0Rp ljii = 1hk.LIZLLL().LJII;
        final 0Sp.a liz4 = 0Sp.LIZ;
        String liz5 = s;
        if (ljii != null) {
            liz5 = ljii.LIZ();
        }
        final String lizlll2 = 0Ry.LIZLLL(0Ry.LIZJ(liz5));
        if (!TextUtils.isEmpty((CharSequence)"User-Agent") && !TextUtils.isEmpty((CharSequence)lizlll2)) {
            if (liz4.LIZJ == null) {
                liz4.LIZJ = new HashMap<String, List<String>>();
            }
            final List<String> singletonList = Collections.singletonList(lizlll2);
            if (!TextUtils.isEmpty((CharSequence)"User-Agent") && singletonList != null) {
                if (!singletonList.isEmpty()) {
                    if (liz4.LIZJ == null) {
                        liz4.LIZJ = new HashMap<String, List<String>>();
                    }
                    liz4.LIZJ.put("User-Agent", singletonList);
                }
            }
        }
        liz4.LIZ = liz3;
        return liz4.LIZ();
    }
    
    @Override
    public final 0Sq LIZ(final 0Sm.a a) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final 0Sq liz = super.LIZ(a);
        1hq.LIZ().LIZ(liz, SystemClock.uptimeMillis() - uptimeMillis);
        return liz;
    }
    
    @Override
    public final 0Sq LIZ(final 0Sq 0Sq) {
        if (0Sq != null && 0Sq.LJ != null) {
            final 0Sp lj = 0Sq.LJ;
            final 1Dk lj2 = lj.LJ;
            final int liz = 0Sq.LIZ;
            final String liziz = lj.LIZIZ;
            final long lizlll = 0Sq.LIZLLL;
            final JSONObject liziz2 = this.LIZIZ(0Sq);
            final JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("track_url_list", (Object)liziz).put("track_status", liz).put("local_time_ms", lizlll).put("is_retry", lj2.LJIIIZ).putOpt("ad_extra_data", (Object)liziz2);
            }
            catch (final JSONException ex) {
                0II.LIZ((Exception)ex);
            }
            0Rt.LIZ("track_url", lj2, jsonObject);
        }
        return 0Sq;
    }
}
