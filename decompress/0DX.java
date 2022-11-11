// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONException;
import org.json.JSONObject;
import android.os.SystemClock;
import java.util.HashMap;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public final class 0dX
{
    public static boolean LIZ;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static ConcurrentHashMap<String, Long> LJFF;
    public static ConcurrentHashMap<String, Long> LJI;
    
    static {
        Covode.recordClassIndex(5855);
        0dX.LIZIZ = "ttlive_feed_base_performance_monitor_all";
        0dX.LIZJ = "ttlive_create_room_base_performance_monitor_all";
        0dX.LIZLLL = "ttlive_enter_room_base_performance_monitor_all";
        0dX.LJ = "ttlive_pk_watch_room_base_performance_monitor_all";
        0dX.LJFF = new ConcurrentHashMap<String, Long>(200);
        0dX.LJI = new ConcurrentHashMap<String, Long>(200);
    }
    
    public static String LIZ(final String s) {
        String s2 = 0dX.LIZIZ;
        if (TextUtils.equals((CharSequence)s, (CharSequence)a.LiveFeedInit.name()) || TextUtils.equals((CharSequence)s, (CharSequence)a.LiveFeedPreview.name()) || TextUtils.equals((CharSequence)s, (CharSequence)a.LiveFeedScroll.name())) {
            s2 = 0dX.LIZIZ;
        }
        else if (TextUtils.equals((CharSequence)s, (CharSequence)a.CreateStartLivePreview.name()) || TextUtils.equals((CharSequence)s, (CharSequence)a.CreateLive.name()) || TextUtils.equals((CharSequence)s, (CharSequence)a.CreateStartLivePreview.name()) || TextUtils.equals((CharSequence)s, (CharSequence)a.ShowBInteractionFirstWidget.name())) {
            s2 = 0dX.LIZJ;
        }
        else if (TextUtils.equals((CharSequence)s, (CharSequence)a.StartLivePlay.name()) || TextUtils.equals((CharSequence)s, (CharSequence)a.ScrollWatchLivePlay.name()) || TextUtils.equals((CharSequence)s, (CharSequence)a.ShowCInteractionFirstWidget.name()) || TextUtils.equals((CharSequence)s, (CharSequence)a.ShowBarrage.name()) || TextUtils.equals((CharSequence)s, (CharSequence)a.ShowVideoGift.name())) {
            s2 = 0dX.LIZLLL;
        }
        else if (TextUtils.equals((CharSequence)s, (CharSequence)a.LivePk.name())) {
            s2 = 0dX.LJ;
        }
        return s2;
    }
    
    public static HashMap<String, String> LIZ(final String s, final String s2) {
        final HashMap hashMap = new HashMap();
        hashMap.put(s, s2);
        return hashMap;
    }
    
    public static void LIZ(final a a) {
        if (a == null) {
            return;
        }
        if (0dX.LJFF.containsKey(a.name())) {
            0dX.LJFF.remove(a.name());
        }
        if (0dX.LJI.containsKey(a.name())) {
            0dX.LJI.remove(a.name());
        }
    }
    
    public static void LIZ(final a a, final HashMap<String, String> hashMap) {
        if (!0dX.LIZ) {
            return;
        }
        if (!0dX.LJFF.containsKey(a.name())) {
            return;
        }
        0dX.LJI.put(a.name(), SystemClock.elapsedRealtime());
        LIZ(a.name(), hashMap);
    }
    
    public static void LIZ(final String s, final long n, final String s2) {
        final JSONObject jsonObject = new JSONObject();
        LIZ(jsonObject, "biz", s);
        LIZ(jsonObject, "duration", n);
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            LIZ(jsonObject, "extra", s2);
        }
        0d8.LIZIZ(LIZ(s), 0, jsonObject);
    }
    
    public static void LIZ(final String s, final HashMap<String, String> hashMap) {
        if (0dX.LJI.containsKey(s) && 0dX.LJFF.containsKey(s)) {
            final long n = 0dX.LJI.get(s) - 0dX.LJFF.get(s);
            String liziz;
            if (hashMap != null) {
                liziz = 0b8.a.LIZIZ.LIZIZ((Object)hashMap);
            }
            else {
                liziz = "";
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append("->");
            sb.append(n);
            sb.append(":");
            sb.append(liziz);
            0ba.LIZ(3, "TimeCostUtil", sb.toString());
            0dX.LJI.remove(s);
            0dX.LJFF.remove(s);
            LIZ(s, n, liziz);
        }
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final long n) {
        try {
            jsonObject.put(s, n);
        }
        catch (final JSONException ex) {
            0ba.LIZ("TimeCostUtil", "", (Throwable)ex);
        }
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final String s2) {
        try {
            jsonObject.put(s, (Object)s2);
        }
        catch (final JSONException ex) {
            0ba.LIZ("TimeCostUtil", "", (Throwable)ex);
        }
    }
    
    public static void LIZIZ(final a a) {
        if (!0dX.LIZ) {
            return;
        }
        0dX.LJFF.put(a.name(), SystemClock.elapsedRealtime());
    }
    
    public static void LIZJ(final a a) {
        if (!0dX.LIZ) {
            return;
        }
        LIZ(a, null);
    }
    
    public enum a
    {
        CreateLive, 
        CreateStartLivePreview, 
        LiveFeedInit, 
        LiveFeedPreview, 
        LiveFeedScroll, 
        LivePk, 
        ScrollWatchLivePlay, 
        ShowBInteractionFirstWidget, 
        ShowBarrage, 
        ShowCInteractionFirstWidget, 
        ShowVideoGift, 
        StartLivePlay;
        
        static {
            Covode.recordClassIndex(5856);
        }
    }
}
