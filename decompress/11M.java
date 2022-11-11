// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Timer;
import org.json.JSONArray;
import org.json.JSONException;
import java.util.TimerTask;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import org.json.JSONObject;
import java.util.Iterator;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import android.ss.com.vboost.CapabilityType;
import java.util.HashSet;
import android.os.Vibrator;
import android.os.Build$VERSION;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 11m extends 00L implements 00T
{
    public boolean LIZIZ;
    public 002 LIZJ;
    
    static {
        Covode.recordClassIndex(44);
    }
    
    public 11m(final Context context) {
        if (00A.LIZ(context)) {
            boolean hasVibrator = false;
            Label_0027: {
                if (Build$VERSION.SDK_INT < 24) {
                    00s.LIZ(6);
                }
                else if ((00J.LIZ = (Vibrator)00J.LIZ(context, "vibrator")) == null) {
                    00s.LIZ(6);
                }
                else {
                    final boolean b = hasVibrator = 00J.LIZ.hasVibrator();
                    if (!b) {
                        00s.LIZ(6);
                        00J.LIZ = null;
                        hasVibrator = b;
                    }
                    break Label_0027;
                }
                hasVibrator = false;
            }
            this.LIZIZ = hasVibrator;
            final HashSet set = new HashSet();
            final 00C.a liz = 00C.LIZ();
            if (liz == 00C.a.QCOM || liz == 00C.a.MTK || liz == 00C.a.CHRY) {
                set.add(CapabilityType.CPU_FREQ_MIN);
                set.add(CapabilityType.GPU_FREQ_MIN);
            }
            if (00C.LIZ() == 00C.a.QCOM) {
                set.add(CapabilityType.UFS_FREQ_MIN);
            }
            if (this.LIZIZ) {
                set.add(CapabilityType.VIBRATE_ENHANCE);
            }
            set.add(CapabilityType.PRESET_SCENE);
            set.add(CapabilityType.TASK_PRIORITY);
            set.add(CapabilityType.CPU_AFFINITY);
            this.LIZ(set);
            (this.LIZJ = new 002()).LIZ(set);
            for (final CapabilityType capabilityType : set) {
                switch (00R.LIZ[capabilityType.ordinal()]) {
                    case 1:
                    case 2:
                    case 3: {
                        final 004 004 = new 004(false, 0, Integer.MAX_VALUE);
                        final ArrayList list = new ArrayList();
                        list.add(004);
                        this.LIZJ.LIZ(capabilityType, list);
                        continue;
                    }
                    case 4: {
                        this.LIZJ.LIZ(new 005(-20, 19));
                        continue;
                    }
                    case 5: {
                        this.LIZJ.LIZ(003.BIND_CLUSTER);
                    }
                    case 6:
                    case 7: {
                        continue;
                    }
                    default: {
                        00s.LIZ(6);
                        continue;
                    }
                }
            }
            final HashMap hashMap = new HashMap();
            hashMap.put(00w.LEVEL_9, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_9));
            hashMap.put(00w.LEVEL_8, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_8));
            hashMap.put(00w.LEVEL_7, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_7));
            hashMap.put(00w.LEVEL_6, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_6));
            hashMap.put(00w.LEVEL_5, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_5));
            hashMap.put(00w.LEVEL_4, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_4));
            hashMap.put(00w.LEVEL_3, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_3));
            hashMap.put(00w.LEVEL_2, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_2));
            hashMap.put(00w.LEVEL_1, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_1));
            hashMap.put(00w.LEVEL_0, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_0));
            00X.a.LIZ.LIZ(00S.PLATFORM, CapabilityType.CPU_FREQ_MIN, hashMap);
            final HashMap hashMap2 = new HashMap();
            hashMap2.put(00w.LEVEL_9, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_9));
            hashMap2.put(00w.LEVEL_8, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_8));
            hashMap2.put(00w.LEVEL_7, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_7));
            hashMap2.put(00w.LEVEL_6, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_6));
            hashMap2.put(00w.LEVEL_5, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_5));
            hashMap2.put(00w.LEVEL_4, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_4));
            hashMap2.put(00w.LEVEL_3, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_3));
            hashMap2.put(00w.LEVEL_2, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_2));
            hashMap2.put(00w.LEVEL_1, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_1));
            hashMap2.put(00w.LEVEL_0, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_0));
            00X.a.LIZ.LIZ(00S.PLATFORM, CapabilityType.GPU_FREQ_MIN, hashMap2);
            final HashMap hashMap3 = new HashMap();
            hashMap3.put(00w.LEVEL_9, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_9));
            hashMap3.put(00w.LEVEL_8, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_8));
            hashMap3.put(00w.LEVEL_7, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_7));
            hashMap3.put(00w.LEVEL_6, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_6));
            hashMap3.put(00w.LEVEL_5, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_5));
            hashMap3.put(00w.LEVEL_4, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_4));
            hashMap3.put(00w.LEVEL_3, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_3));
            hashMap3.put(00w.LEVEL_2, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_2));
            hashMap3.put(00w.LEVEL_1, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_1));
            hashMap3.put(00w.LEVEL_0, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_0));
            00X.a.LIZ.LIZ(00S.PLATFORM, CapabilityType.UFS_FREQ_MIN, hashMap3);
            final HashMap hashMap4 = new HashMap();
            hashMap4.put(00w.LEVEL_9, new 00P(-20, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_9));
            hashMap4.put(00w.LEVEL_8, new 00P(-16, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_8));
            hashMap4.put(00w.LEVEL_7, new 00P(-12, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_7));
            hashMap4.put(00w.LEVEL_6, new 00P(-8, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_6));
            hashMap4.put(00w.LEVEL_5, new 00P(-4, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_5));
            hashMap4.put(00w.LEVEL_4, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_4));
            hashMap4.put(00w.LEVEL_3, new 00P(4, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_3));
            hashMap4.put(00w.LEVEL_2, new 00P(8, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_2));
            hashMap4.put(00w.LEVEL_1, new 00P(12, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_1));
            hashMap4.put(00w.LEVEL_0, new 00P(19, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_0));
            00X.a.LIZ.LIZ(00S.PLATFORM, CapabilityType.TASK_PRIORITY, hashMap4);
            00s.LIZ(4);
        }
    }
    
    @Override
    public final Object LIZ(final 00U 00U) {
        Label_0057: {
            switch (00R.LIZ[00U.LIZ.ordinal()]) {
                default: {
                    00s.LIZ(5);
                    break;
                }
                case 1: {
                    00A.LIZ.LIZ(00U.LJI);
                    break;
                }
                case 2: {
                    00A.LIZ.LIZJ(00U.LJI);
                    break;
                }
                case 3: {
                    00A.LIZ.LIZIZ(00U.LJI);
                    break;
                }
                case 4: {
                    if (00U.LIZJ > 19 || 00U.LIZJ < -20) {
                        00s.LIZ(5);
                    }
                    00s.LIZ(3);
                    break;
                }
                case 5: {
                    if (00U.LJII == 00K.GOLD || 00U.LJII == 00K.SUPER) {
                        00s.LIZ(3);
                        break;
                    }
                    if (00U.LJII == 00K.SILVER) {
                        00s.LIZ(3);
                        break;
                    }
                    break;
                }
                case 6: {
                    final 010 lj = 00U.LJ;
                    final int liz = lj.LIZ;
                    if (liz != -1) {
                        if (liz == 0) {
                            00J.LIZ();
                            break;
                        }
                        if (liz == 1) {
                            00J.LIZ(lj.LIZIZ);
                            break;
                        }
                        if (liz == 2) {
                            00J.LIZ(lj.LIZIZ, lj.LIZJ);
                            break;
                        }
                        if (liz != 3) {
                            00s.LIZ(6);
                            break;
                        }
                        final String lizlll = lj.LIZLLL;
                        00s.LIZ(3);
                        if (00J.LIZ == null) {
                            00s.LIZ(6);
                            break;
                        }
                        try {
                            final String liz2 = 00J.LIZ(lizlll);
                            if (liz2 != null) {
                                00s.LIZ(3);
                                final JSONArray jsonArray = new JSONObject(liz2).getJSONArray("Pattern");
                                00J.LIZIZ = false;
                                for (int i = 0; i < jsonArray.length(); ++i) {
                                    if (!jsonArray.getJSONObject(i).optString("Event").equals("")) {
                                        float n = 0.0f;
                                        final long n2 = (long)(jsonArray.getJSONObject(i).getJSONObject("Event").getDouble("Time") * 1000.0);
                                        final JSONArray jsonArray2 = jsonArray.getJSONObject(i).getJSONObject("Event").getJSONArray("EventParameters");
                                        for (int j = 0; j < jsonArray2.length(); ++j) {
                                            final String string = jsonArray2.getJSONObject(j).getString("ParameterID");
                                            final int hashCode = string.hashCode();
                                            int n3;
                                            if ((hashCode == -805677252) ? string.equals("HapticIntensity") : (hashCode == 1418859594 && string.equals("HapticSharpness"))) {
                                                n3 = 0;
                                            }
                                            else {
                                                n3 = -1;
                                            }
                                            if (n3 != 0) {
                                                if (n3 == 1) {
                                                    n = (float)jsonArray2.getJSONObject(j).getDouble("ParameterValue");
                                                }
                                            }
                                            else {
                                                jsonArray2.getJSONObject(j).getDouble("ParameterValue");
                                            }
                                        }
                                        final String string2 = jsonArray.getJSONObject(i).getJSONObject("Event").getString("EventType");
                                        final int hashCode2 = string2.hashCode();
                                        int n4;
                                        if ((hashCode2 == -1421249242) ? string2.equals("HapticContinuous") : (hashCode2 == -252255853 && string2.equals("HapticTransient"))) {
                                            n4 = 0;
                                        }
                                        else {
                                            n4 = -1;
                                        }
                                        if (n4 != 0) {
                                            if (n4 == 1) {
                                                ((Timer)new PthreadTimer("VibratorManager")).schedule(new 00I(n, (float)jsonArray.getJSONObject(i).getJSONObject("Event").getDouble("EventDuration") * 1000.0f), n2);
                                            }
                                        }
                                        else {
                                            ((Timer)new PthreadTimer("VibratorManager")).schedule(new 00H(n), n2);
                                        }
                                    }
                                }
                            }
                            else {
                                00s.LIZ(6);
                            }
                        }
                        catch (final JSONException ex) {
                            0II.LIZ((Exception)ex);
                        }
                        break;
                    }
                    else {
                        if (00J.LIZ != null) {
                            00J.LIZ = null;
                            break;
                        }
                        break;
                    }
                    break;
                }
                case 7: {
                    final 00V lizlll2 = 00U.LIZLLL;
                    lizlll2.LIZ.getDesc();
                    00s.LIZ(4);
                    switch (00R.LIZIZ[lizlll2.LIZ.ordinal()]) {
                        default: {
                            00s.LIZ(5);
                            break Label_0057;
                        }
                        case 1:
                        case 2:
                        case 3:
                        case 4:
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
                        case 54:
                        case 55: {
                            if (lizlll2.LIZIZ == 00z.BEGIN) {
                                lizlll2.LIZ.getDesc();
                                00s.LIZ(3);
                                00A.LIZ.LIZ();
                                break Label_0057;
                            }
                            lizlll2.LIZ.getDesc();
                            00s.LIZ(3);
                            00A.LIZ();
                            break Label_0057;
                        }
                    }
                    break;
                }
            }
        }
        return 1;
    }
    
    @Override
    public final boolean LIZ(final CapabilityType capabilityType) {
        final 002 lizj = this.LIZJ;
        return lizj != null && lizj.LIZ().contains(capabilityType);
    }
    
    @Override
    public final Object LIZIZ(final 00U 00U) {
        switch (00R.LIZ[00U.LIZ.ordinal()]) {
            default: {
                00s.LIZ(5);
                break;
            }
            case 1:
            case 2:
            case 3: {
                00A.LIZ();
                break;
            }
            case 4: {
                00s.LIZ(3);
                break;
            }
            case 5: {
                00s.LIZ(3);
                break;
            }
            case 6: {
                00J.LIZ();
                break;
            }
            case 7: {
                00A.LIZ();
                00U.LIZLLL.LIZ.getDesc();
                00s.LIZ(4);
                break;
            }
        }
        return 1;
    }
}
