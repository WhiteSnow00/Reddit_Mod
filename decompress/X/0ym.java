// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import java.util.Collection;
import com.bytedance.android.livesdk.livesetting.other.GetRecentLogIdForRequest;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.retrofit2.client.Request;
import org.json.JSONException;
import java.util.List;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 0ym
{
    static {
        Covode.recordClassIndex(10438);
    }
    
    public static int LIZ(final JSONObject jsonObject, final String s) {
        if (jsonObject == null) {
            return -1;
        }
        return jsonObject.optInt(s, -1);
    }
    
    public static String LIZ(final 6yM 6yM) {
        final List liziz = 6yM.LIZ.LIZIZ("X-Tt-Logid");
        if (liziz != null && liziz.size() > 0) {
            return ((5fU)liziz.get(0)).LIZIZ;
        }
        return "";
    }
    
    public static String LIZ(final String s, final JSONObject jsonObject) {
        final JSONObject jsonObject2 = new JSONObject();
        try {
            jsonObject2.put("tag", (Object)s);
            jsonObject2.put("data", (Object)jsonObject.toString());
        }
        catch (final JSONException ex) {
            0II.LIZ((Exception)ex);
        }
        return jsonObject2.toString();
    }
    
    public static String LIZ(final JSONObject jsonObject, final String s, final String s2) {
        if (jsonObject == null) {
            return s2;
        }
        return jsonObject.optString(s, s2);
    }
    
    public static JSONObject LIZ(final String s) {
        try {
            return new JSONObject(s);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static void LIZ(final Request request, final 6yM 6yM, final int n) {
        LIZIZ(request, 6yM, n);
        final Object liziz = 6yM.LIZIZ;
        if (liziz instanceof 0z5) {
            final 0z5 0z5 = (0z5)liziz;
            if (0z5.LIZ != 0) {
                if (0z5.LIZLLL == null) {
                    0z5.LIZLLL = new RequestError();
                }
                0z5.LIZLLL.url = request.getUrl();
                0z5.LIZLLL.message = ((Room)0z5.LIZIZ).message;
                0z5.LIZLLL.prompts = ((Room)0z5.LIZIZ).prompts;
                0yl.LIZ(0z5.LIZ, 0z5.LIZLLL, 0b8.a.LIZIZ.LIZIZ(0z5.LIZJ), LIZ(6yM));
            }
            return;
        }
        if (liziz instanceof 1dl) {
            final 0z4 0z6 = (0z4)liziz;
            0z6.logId = LIZ(6yM);
            if (0z6.statusCode != 0) {
                if (0z6.error == null) {
                    0z6.error = new RequestError();
                }
                0z6.error.url = request.getUrl();
                0yl.LIZ(0z6.statusCode, 0z6.error, 0z6.extra, LIZ(6yM), 0z6.data);
            }
            return;
        }
        if (liziz instanceof 1dk) {
            final 0z3 0z7 = (0z3)liziz;
            if (0z7.LIZ != 0) {
                if (0z7.LJI == null) {
                    0z7.LJI = new RequestError();
                }
                0z7.LJI.url = request.getUrl();
                0yl.LIZ(0z7.LIZ, 0z7.LJI, 0z7.LIZJ, LIZ(6yM));
            }
            return;
        }
        if (liziz instanceof 0bt) {
            final 0bt 0bt = (0bt)liziz;
            if (!TextUtils.equals((CharSequence)0bt.LIZIZ, (CharSequence)"success") && 0bt.LIZJ != null) {
                0bt.LIZJ.LIZJ = request.getUrl();
                0yl.LIZ(0bt.LIZJ.LIZ, 0bt.LIZJ, LIZ(6yM));
            }
            return;
        }
        if (liziz instanceof 0br) {
            final 0br 0br = (0br)liziz;
            if (!TextUtils.equals((CharSequence)0br.LIZIZ, (CharSequence)"success") && 0br.LIZJ != null) {
                0br.LIZJ.LIZJ = request.getUrl();
                0yl.LIZ(0br.LIZJ.LIZ, 0br.LIZJ, LIZ(6yM));
            }
            return;
        }
        if (liziz instanceof 0z3) {
            final 0z3 0z8 = (0z3)liziz;
            0z8.LJ = request.getMetrics();
            if (6yM.LIZ != null) {
                0z8.LIZLLL = (6vz)6yM.LIZ.LJFF;
                0z8.LJFF = LIZ(6yM);
            }
            if (0z8.LIZ != 0) {
                if (0z8.LJI == null) {
                    0z8.LJI = new RequestError();
                }
                0z8.LJI.url = request.getUrl();
                0yl.LIZ(0z8.LIZ, 0z8.LJI, 0z8.LIZJ, LIZ(6yM));
                return;
            }
            if (0z8.LIZIZ != null) {
                return;
            }
            throw new 1i1();
        }
        else {
            if (!(liziz instanceof 0z4)) {
                if (liziz instanceof String) {
                    final String s = (String)liziz;
                    if (5ow.LIZ(s)) {
                        throw new 1i0();
                    }
                    final JSONObject jsonObject = new JSONObject(s);
                    if (!jsonObject.has("data")) {
                        throw new 1i1();
                    }
                    if (!LIZ(jsonObject)) {
                        final JSONObject optJSONObject = jsonObject.optJSONObject("data");
                        final 1Ev 1Ev = new 1Ev(jsonObject.optInt("status_code"));
                        1Ev.setErrorMsg(optJSONObject.optString("message", ""));
                        1Ev.setPrompt(optJSONObject.optString("prompts", ""));
                        1Ev.setExtra(jsonObject.optString("extra", ""));
                        1Ev.setAlert(optJSONObject.optString("alert", ""));
                        throw 1Ev;
                    }
                }
                return;
            }
            final 0z4 0z9 = (0z4)liziz;
            0z9.metrics = request.getMetrics();
            0z9.logId = LIZ(6yM);
            if (6yM.LIZ != null) {
                0z9.requestInfo = (6vz)6yM.LIZ.LJFF;
            }
            if (0z9.statusCode != 0) {
                if (0z9.error == null) {
                    0z9.error = new RequestError();
                }
                0z9.error.url = request.getUrl();
                0yl.LIZ(0z9.statusCode, 0z9.error, 0z9.extra, LIZ(6yM));
                return;
            }
            if (0z9.data != null) {
                return;
            }
            throw new 1i1(0z9);
        }
    }
    
    public static void LIZ(final JSONObject jsonObject, final String s, final int n) {
        try {
            jsonObject.put(s, n);
        }
        catch (final Exception ex) {}
    }
    
    public static boolean LIZ(final JSONObject jsonObject) {
        return jsonObject.has("status_code") && jsonObject.optInt("status_code") == 0;
    }
    
    public static void LIZIZ(Request request, 6yM 6yM, int n) {
        if (6yM != null && request != null) {
            Object liz = 6yM.LIZ;
            if (liz == null) {
                return;
            }
            final int liziz = ((6H3)liz).LIZIZ;
            FzF.LIZ.LIZ(request, n, liziz);
            if (liziz != 200) {
                return;
            }
            final Object liziz2 = 6yM.LIZIZ;
            final String url = request.getUrl();
            request = (Request)0cB.LIZ(2131836087);
            final boolean b = liziz2 instanceof 0z5;
            Object parse = "";
            Label_0122: {
                if (b) {
                    final 0z5 0z5 = (0z5)liziz2;
                    final int n2 = n = 0z5.LIZ;
                    if (0z5.LIZIZ instanceof Room) {
                        request = (Request)((Room)0z5.LIZIZ).message;
                        n = n2;
                    }
                }
                else if (liziz2 instanceof 1dl) {
                    n = ((0z4)liziz2).statusCode;
                }
                else if (liziz2 instanceof 1dk) {
                    n = ((0z3)liziz2).LIZ;
                }
                else {
                    if (liziz2 instanceof 0bt) {
                        final 0bs lizj = ((0bt)liziz2).LIZJ;
                        if (lizj != null) {
                            n = lizj.LIZ;
                            request = (Request)lizj.LIZIZ;
                            break Label_0122;
                        }
                    }
                    else if (liziz2 instanceof 0br) {
                        final 0bs lizj2 = ((0br)liziz2).LIZJ;
                        if (lizj2 != null) {
                            n = lizj2.LIZ;
                            request = (Request)lizj2.LIZIZ;
                            break Label_0122;
                        }
                    }
                    else {
                        if (liziz2 instanceof 0z3) {
                            n = ((0z3)liziz2).LIZ;
                            break Label_0122;
                        }
                        if (liziz2 instanceof 0z4) {
                            n = ((0z4)liziz2).statusCode;
                            break Label_0122;
                        }
                        if (liziz2 instanceof String) {
                            final String s = (String)liziz2;
                            if (TextUtils.isEmpty((CharSequence)s)) {
                                final JSONObject liz2 = LIZ(s);
                                n = LIZ(liz2, "status_code");
                                request = (Request)LIZ(liz2, "message", "");
                                break Label_0122;
                            }
                        }
                    }
                    n = 0;
                }
            }
            if (n == 0) {
                final Uri parse2 = Uri.parse(url);
                if (0yw.LIZIZ != null && 0yw.LIZIZ.contains(parse2.getPath())) {
                    final JSONObject jsonObject = new JSONObject();
                    LIZ(jsonObject, "code", liziz);
                    LIZ(jsonObject, "status_code", n);
                    LIZIZ(jsonObject, "xLogId", LIZ(6yM));
                    LIZIZ(jsonObject, "host", parse2.getHost());
                    LIZIZ(jsonObject, "path", parse2.getPath());
                    0d8.LIZ("ttlive_network_request_all", 0, jsonObject, 0);
                }
                final List list = GetRecentLogIdForRequest.INSTANCE.getValue().getList();
                if (GetRecentLogIdForRequest.INSTANCE.getValue().getEnable() && !5s7.LIZ((Collection)list) && list.contains(parse2.getPath())) {
                    0yo.LIZ.LIZ(parse2.getPath(), LIZ(6yM));
                }
                return;
            }
            while (true) {
                try {
                    final Uri parse3 = Uri.parse(url);
                    if (0yw.LIZ != null && 0yw.LIZ.LIZ() != null && 0yw.LIZ.LIZ().contains(parse3.getPath())) {
                        return;
                    }
                    final List lizlll = ((6H3)liz).LIZLLL;
                    liz = parse;
                    if (lizlll != null) {
                        liz = parse;
                        if (!lizlll.isEmpty()) {
                            final Iterator iterator = lizlll.iterator();
                            Object liziz3 = parse;
                            while (true) {
                                liz = liziz3;
                                if (!iterator.hasNext()) {
                                    break;
                                }
                                parse = iterator.next();
                                if (parse == null || !"x-tt-Logid".equalsIgnoreCase(((5fU)parse).LIZ)) {
                                    continue;
                                }
                                liziz3 = ((5fU)parse).LIZIZ;
                            }
                        }
                    }
                    final JSONObject jsonObject2 = new JSONObject();
                    LIZIZ(jsonObject2, "xLogId", (String)liz);
                    LIZ(jsonObject2, "code", liziz);
                    LIZ(jsonObject2, "status_code", n);
                    LIZIZ(jsonObject2, "url", url);
                    LIZIZ(jsonObject2, "message", (String)request);
                    LIZIZ(jsonObject2, "classes", "com.bytedance.android.livesdk.network.ResponseInterceptor");
                    0ba.LIZ(3, "ttlive_net", LIZ("ttlive_net", jsonObject2));
                    6yM = (6yM)new JSONObject();
                    LIZIZ((JSONObject)6yM, "xLogId", (String)liz);
                    LIZ((JSONObject)6yM, "code", liziz);
                    LIZ((JSONObject)6yM, "status_code", n);
                    try {
                        parse = Uri.parse(url);
                        LIZIZ((JSONObject)6yM, "host", ((Uri)parse).getHost());
                        LIZIZ((JSONObject)6yM, "path", ((Uri)parse).getPath());
                    }
                    catch (final Exception parse) {
                        0ba.LIZJ(((Throwable)parse).getMessage());
                    }
                    LIZIZ((JSONObject)6yM, "message", (String)request);
                    0d8.LIZIZ("ttlive_network_request_error", 1, (JSONObject)6yM);
                }
                catch (final Exception ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public static void LIZIZ(final JSONObject jsonObject, final String s, final String s2) {
        try {
            jsonObject.put(s, (Object)s2);
        }
        catch (final Exception ex) {}
    }
}
