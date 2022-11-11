// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import android.ss.com.vboost.CapabilityType;
import java.util.HashSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 11l extends 00L implements 00T
{
    public static int LIZIZ;
    public static int LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static String LJI;
    public 002 LJII;
    
    static {
        Covode.recordClassIndex(42);
        11l.LIZIZ = 6000;
        11l.LIZJ = 2000;
        11l.LIZLLL = "";
        11l.LJ = "AdBn8kcsKX/O815o2UQl3LjVZjaRooW/Rx3sI/MYUty6Z01YE2eFbthgkWm0G8x3zCoXs5V3V3hmQA2R5JNiPn13bb+xvteEx21ECTga2lgljHb8hs9zzR8UJNL7sZXf9/Jrk8kz/60pjcf1OIcSiSra0lIq3RSzDGhjooGjzWg=";
        11l.LJFF = "0t+6utD5+YEJ+ZPthp6enTfBVB9ncSu5dJNrLbfWkUMfwXxAIC2CKC+/G/DIYShSBqKjhMPT7dNfM66LOaIPYrnyz5KLoj5mecAkbAbkEEqYZPg2B0ttcjOge/5ZnVqdEbx75d2oWXrydf2wGVRTf+V/UbAINXtmSr7GAQk4tgs=";
        11l.LJI = "zUIIaLfyg13Hy7NwZ/KvE7FtPsriXnpV1wEsFJJEjgktdSMkxCDFsWefR7Vj6ndvB3FYgmli7uMtLKGCM8JV3t564U1q+RtMYZH/uoPEQ3FPVXRZ44TliialrGFqf+Stv0RdOSGtn9z2z4Bz6AhDUNh0NNNCQzphqKjAgdtmeyE=";
    }
    
    public 11l(final Context context) {
        final String packageName = context.getPackageName();
        if (packageName.contains("zhiliaoapp.musically")) {
            11l.LIZLLL = 11l.LJ;
        }
        else if (packageName.contains("ugc.trill")) {
            11l.LIZLLL = 11l.LJFF;
        }
        else {
            11l.LIZLLL = 11l.LJI;
        }
        final boolean liziz = Iht.LIZ().LIZIZ(11l.LIZLLL);
        00s.LIZ(4);
        if (liziz) {
            final HashSet set = new HashSet();
            set.add(CapabilityType.CPU_FREQ_MIN);
            set.add(CapabilityType.PRESET_SCENE);
            set.add(CapabilityType.CPU_AFFINITY);
            this.LIZ(set);
            (this.LJII = new 002()).LIZ(set);
            for (final CapabilityType capabilityType : set) {
                final int n = 00Q.LIZ[capabilityType.ordinal()];
                if (n != 1) {
                    if (n == 2) {
                        continue;
                    }
                    if (n != 3) {
                        00s.LIZ(5);
                    }
                    else {
                        this.LJII.LIZ(003.BIND_CLUSTER);
                    }
                }
                else {
                    final 004 004 = new 004(false, Integer.MAX_VALUE, 10000);
                    final ArrayList list = new ArrayList();
                    list.add(004);
                    this.LJII.LIZ(capabilityType, list);
                }
            }
            final HashMap hashMap = new HashMap();
            hashMap.put(00w.LEVEL_9, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_9));
            hashMap.put(00w.LEVEL_8, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_8));
            hashMap.put(00w.LEVEL_7, new 00P(0, 11l.LIZJ, 00S.VENDOR, 00w.LEVEL_8));
            hashMap.put(00w.LEVEL_6, new 00P(0, 11l.LIZJ, 00S.VENDOR, 00w.LEVEL_8));
            hashMap.put(00w.LEVEL_5, new 00P(0, 11l.LIZJ, 00S.VENDOR, 00w.LEVEL_8));
            hashMap.put(00w.LEVEL_4, new 00P(0, 11l.LIZJ, 00S.VENDOR, 00w.LEVEL_4));
            hashMap.put(00w.LEVEL_3, new 00P(0, 11l.LIZJ, 00S.VENDOR, 00w.LEVEL_3));
            hashMap.put(00w.LEVEL_2, new 00P(0, 11l.LIZJ, 00S.VENDOR, 00w.LEVEL_2));
            hashMap.put(00w.LEVEL_1, new 00P(0, 11l.LIZJ, 00S.VENDOR, 00w.LEVEL_1));
            hashMap.put(00w.LEVEL_0, new 00P(0, 11l.LIZJ, 00S.VENDOR, 00w.LEVEL_0));
            00X.a.LIZ.LIZ(00S.VENDOR, CapabilityType.CPU_FREQ_MIN, hashMap);
            if (00p.LIZ()) {
                try {
                    final JSONObject jsonObject = new JSONObject();
                    jsonObject.put("vendor", (Object)"op");
                    00p.LIZ("vboost_event_active", jsonObject, "behavior");
                }
                catch (final JSONException ex) {
                    0II.LIZ((Exception)ex);
                }
            }
        }
    }
    
    @Override
    public final Object LIZ(final 00U 00U) {
        final int n = 00Q.LIZ[00U.LIZ.ordinal()];
        if (n == 1) {
            final int n2 = (int)00U.LJI;
            int n4;
            if (n2 > 11l.LIZJ) {
                final int liziz = 11l.LIZIZ;
                int n3;
                if ((n3 = n2) > liziz) {
                    n3 = liziz;
                }
                n4 = (Iht.LIZ().LIZ(n3, 5EU.LOAD_INFO) ? 1 : 0);
            }
            else {
                n4 = (Iht.LIZ().LIZIZ(n2, 5EU.ACTIVITY_SWITCH) ? 1 : 0);
            }
            00s.LIZ(4);
            return n4;
        }
        final int n5 = 0;
        int liz = 0;
        if (n == 2) {
            final 00V lizlll = 00U.LIZLLL;
            lizlll.LIZ.getDesc();
            00s.LIZ(4);
            int n6 = 0;
            switch (00Q.LIZIZ[lizlll.LIZ.ordinal()]) {
                default: {
                    n6 = n5;
                    break;
                }
                case 1:
                case 2:
                case 3: {
                    n6 = (Iht.LIZ().LIZIZ(11l.LIZJ, 5EU.ACTIVITY_SWITCH) ? 1 : 0);
                    break;
                }
                case 4: {
                    n6 = (Iht.LIZ().LIZIZ(11l.LIZJ, 5EU.OTHER_SWITCH) ? 1 : 0);
                    break;
                }
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54: {
                    n6 = (Iht.LIZ().LIZIZ(11l.LIZJ, 5EU.LOAD_INFO) ? 1 : 0);
                    break;
                }
                case 55: {
                    n6 = (Iht.LIZ().LIZ(11l.LIZIZ, 5EU.UPLOAD_INFO) ? 1 : 0);
                    break;
                }
            }
            return n6;
        }
        if (n != 3) {
            00s.LIZ(5);
            return 1;
        }
        if (00U.LJII == 00K.GOLD || 00U.LJII == 00K.SUPER) {
            final long n7 = 00U.LJIIIIZZ;
            00s.LIZ(3);
            final StringBuilder sb = new StringBuilder();
            sb.append("{\"hb_bind_tid\":\"");
            sb.append(Long.toString(n7));
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("\"}");
            final String string2 = sb2.toString();
            00s.LIZ(4);
            liz = (Iht.LIZ().LIZ(string2) ? 1 : 0);
        }
        return liz;
    }
    
    @Override
    public final boolean LIZ(final CapabilityType capabilityType) {
        final 002 ljii = this.LJII;
        return ljii != null && ljii.LIZ().contains(capabilityType);
    }
    
    @Override
    public final Object LIZIZ(final 00U 00U) {
        final int n = 00Q.LIZ[00U.LIZ.ordinal()];
        if (n == 1) {
            return Iht.LIZ().LIZ(10, -1, -1) ? 1 : 0;
        }
        if (n != 3) {
            return 1;
        }
        00s.LIZ(3);
        return Iht.LIZ().LIZ("{\"hb_unbind_tid\":\"0\"}") ? 1 : 0;
    }
}
