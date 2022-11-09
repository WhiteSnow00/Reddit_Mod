// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.samsung.sdk.sperf.CustomParams;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import android.ss.com.vboost.CapabilityType;
import java.util.HashSet;
import com.samsung.sdk.sperf.SPerf;
import android.os.Build$VERSION;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.samsung.sdk.sperf.PerformanceManager;

public class 11n extends 00L implements 00T
{
    public static int LIZLLL;
    public PerformanceManager LIZIZ;
    public 002 LIZJ;
    
    static {
        Covode.recordClassIndex(52);
        11n.LIZLLL = 6000;
    }
    
    public 11n(final Context context) {
        if (Build$VERSION.SDK_INT >= 29 && SPerf.initialize(context) && (this.LIZIZ = PerformanceManager.getInstance()) != null) {
            final HashSet set = new HashSet();
            set.add(CapabilityType.PRESET_SCENE);
            set.add(CapabilityType.CPU_FREQ_MIN);
            set.add(CapabilityType.CPU_FREQ_MAX);
            set.add(CapabilityType.CPU_CORE_MIN);
            set.add(CapabilityType.CPU_CORE_MAX);
            set.add(CapabilityType.GPU_FREQ_MIN);
            set.add(CapabilityType.GPU_FREQ_MAX);
            set.add(CapabilityType.BUS_FREQ_MIN);
            set.add(CapabilityType.BUS_FREQ_MAX);
            set.add(CapabilityType.TASK_PRIORITY);
            set.add(CapabilityType.CPU_AFFINITY);
            set.add(CapabilityType.IDLE_STATE);
            this.LIZ(set);
            (this.LIZJ = new 002()).LIZ(set);
            for (final CapabilityType capabilityType : set) {
                switch (00Y.LIZ[capabilityType.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6: {
                        final 004 004 = new 004(true, 5, 1000);
                        final ArrayList list = new ArrayList();
                        list.add(004);
                        this.LIZJ.LIZ(capabilityType, list);
                        continue;
                    }
                    case 9: {
                        this.LIZJ.LIZ(new 005(0, 5));
                        continue;
                    }
                    case 10: {
                        this.LIZJ.LIZ(003.BIND_CLUSTER);
                    }
                    case 7:
                    case 8:
                    case 11:
                    case 12: {
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
            hashMap.put(00w.LEVEL_7, new 00P(3, 1000, 00S.VENDOR, 00w.LEVEL_8));
            hashMap.put(00w.LEVEL_6, new 00P(3, 1000, 00S.VENDOR, 00w.LEVEL_8));
            hashMap.put(00w.LEVEL_5, new 00P(2, 1000, 00S.VENDOR, 00w.LEVEL_5));
            hashMap.put(00w.LEVEL_4, new 00P(2, 1000, 00S.VENDOR, 00w.LEVEL_4));
            hashMap.put(00w.LEVEL_3, new 00P(1, 1000, 00S.VENDOR, 00w.LEVEL_3));
            hashMap.put(00w.LEVEL_2, new 00P(1, 1000, 00S.VENDOR, 00w.LEVEL_2));
            hashMap.put(00w.LEVEL_1, new 00P(0, 1000, 00S.VENDOR, 00w.LEVEL_1));
            hashMap.put(00w.LEVEL_0, new 00P(0, 1000, 00S.VENDOR, 00w.LEVEL_0));
            00X.a.LIZ.LIZ(00S.VENDOR, CapabilityType.CPU_FREQ_MIN, hashMap);
            00X.a.LIZ.LIZ(00S.VENDOR, CapabilityType.CPU_FREQ_MAX, hashMap);
            final HashMap hashMap2 = new HashMap();
            hashMap2.put(00w.LEVEL_9, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_9));
            hashMap2.put(00w.LEVEL_8, new 00P(0, Integer.MAX_VALUE, 00S.PLATFORM, 00w.LEVEL_8));
            hashMap2.put(00w.LEVEL_7, new 00P(3, 1000, 00S.VENDOR, 00w.LEVEL_8));
            hashMap2.put(00w.LEVEL_6, new 00P(3, 1000, 00S.VENDOR, 00w.LEVEL_8));
            hashMap2.put(00w.LEVEL_5, new 00P(2, 1000, 00S.VENDOR, 00w.LEVEL_5));
            hashMap2.put(00w.LEVEL_4, new 00P(2, 1000, 00S.VENDOR, 00w.LEVEL_4));
            hashMap2.put(00w.LEVEL_3, new 00P(1, 1000, 00S.VENDOR, 00w.LEVEL_3));
            hashMap2.put(00w.LEVEL_2, new 00P(1, 1000, 00S.VENDOR, 00w.LEVEL_2));
            hashMap2.put(00w.LEVEL_1, new 00P(0, 1000, 00S.VENDOR, 00w.LEVEL_1));
            hashMap2.put(00w.LEVEL_0, new 00P(0, 1000, 00S.VENDOR, 00w.LEVEL_0));
            00X.a.LIZ.LIZ(00S.VENDOR, CapabilityType.GPU_FREQ_MIN, hashMap2);
            00X.a.LIZ.LIZ(00S.VENDOR, CapabilityType.GPU_FREQ_MAX, hashMap2);
            final HashMap hashMap3 = new HashMap();
            hashMap3.put(00w.LEVEL_9, new 00P(3, 1000, 00S.VENDOR, 00w.LEVEL_9));
            hashMap3.put(00w.LEVEL_8, new 00P(3, 1000, 00S.VENDOR, 00w.LEVEL_8));
            hashMap3.put(00w.LEVEL_7, new 00P(2, 1000, 00S.VENDOR, 00w.LEVEL_7));
            hashMap3.put(00w.LEVEL_6, new 00P(2, 1000, 00S.VENDOR, 00w.LEVEL_6));
            hashMap3.put(00w.LEVEL_5, new 00P(2, 1000, 00S.VENDOR, 00w.LEVEL_5));
            hashMap3.put(00w.LEVEL_4, new 00P(1, 1000, 00S.VENDOR, 00w.LEVEL_4));
            hashMap3.put(00w.LEVEL_3, new 00P(1, 1000, 00S.VENDOR, 00w.LEVEL_3));
            hashMap3.put(00w.LEVEL_2, new 00P(1, 1000, 00S.VENDOR, 00w.LEVEL_2));
            hashMap3.put(00w.LEVEL_1, new 00P(0, 1000, 00S.VENDOR, 00w.LEVEL_1));
            hashMap3.put(00w.LEVEL_0, new 00P(0, 1000, 00S.VENDOR, 00w.LEVEL_0));
            00X.a.LIZ.LIZ(00S.VENDOR, CapabilityType.BUS_FREQ_MIN, hashMap3);
            00X.a.LIZ.LIZ(00S.VENDOR, CapabilityType.BUS_FREQ_MAX, hashMap3);
            final HashMap hashMap4 = new HashMap();
            hashMap4.put(00w.LEVEL_9, new 00P(4, 99999999, 00S.VENDOR, 00w.LEVEL_9));
            hashMap4.put(00w.LEVEL_8, new 00P(4, 99999999, 00S.VENDOR, 00w.LEVEL_8));
            hashMap4.put(00w.LEVEL_7, new 00P(3, 99999999, 00S.VENDOR, 00w.LEVEL_7));
            hashMap4.put(00w.LEVEL_6, new 00P(3, 99999999, 00S.VENDOR, 00w.LEVEL_6));
            hashMap4.put(00w.LEVEL_5, new 00P(2, 99999999, 00S.VENDOR, 00w.LEVEL_5));
            hashMap4.put(00w.LEVEL_4, new 00P(2, 99999999, 00S.VENDOR, 00w.LEVEL_4));
            hashMap4.put(00w.LEVEL_3, new 00P(1, 99999999, 00S.VENDOR, 00w.LEVEL_3));
            hashMap4.put(00w.LEVEL_2, new 00P(1, 99999999, 00S.VENDOR, 00w.LEVEL_2));
            hashMap4.put(00w.LEVEL_1, new 00P(0, 99999999, 00S.VENDOR, 00w.LEVEL_1));
            hashMap4.put(00w.LEVEL_0, new 00P(0, 99999999, 00S.VENDOR, 00w.LEVEL_0));
            00X.a.LIZ.LIZ(00S.VENDOR, CapabilityType.TASK_PRIORITY, hashMap4);
            if (00p.LIZ()) {
                try {
                    final JSONObject jsonObject = new JSONObject();
                    jsonObject.put("vendor", (Object)"ss");
                    00p.LIZ("vboost_event_active", jsonObject, "behavior");
                }
                catch (final JSONException ex) {
                    0II.LIZ((Exception)ex);
                }
            }
            00s.LIZ(4);
        }
    }
    
    private int LIZ(final int n, final int n2) {
        if (n < 0 || n > 2) {
            00s.LIZ(6);
            return -1;
        }
        final PerformanceManager liziz = this.LIZIZ;
        if (liziz == null) {
            return -1;
        }
        int n3 = 64;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    n3 = n3;
                }
                else {
                    n3 = 256;
                }
            }
            else {
                n3 = 128;
            }
        }
        return liziz.start(n3, n2);
    }
    
    @Override
    public final Object LIZ(final 00U 00U) {
        if (this.LIZIZ == null) {
            return null;
        }
        switch (00Y.LIZ[00U.LIZ.ordinal()]) {
            default: {
                00s.LIZ(5);
                return 0;
            }
            case 1: {
                final CustomParams customParams = new CustomParams();
                customParams.add(1, 00U.LIZJ, (int)00U.LJI);
                return this.LIZIZ.start(customParams);
            }
            case 2: {
                final CustomParams customParams2 = new CustomParams();
                customParams2.add(3, 00U.LIZJ, (int)00U.LJI);
                return this.LIZIZ.start(customParams2);
            }
            case 3: {
                final CustomParams customParams3 = new CustomParams();
                customParams3.add(5, 00U.LIZJ, (int)00U.LJI);
                return this.LIZIZ.start(customParams3);
            }
            case 4: {
                final CustomParams customParams4 = new CustomParams();
                customParams4.add(0, 00U.LIZJ, (int)00U.LJI);
                return this.LIZIZ.start(customParams4);
            }
            case 5: {
                final CustomParams customParams5 = new CustomParams();
                customParams5.add(2, 00U.LIZJ, (int)00U.LJI);
                return this.LIZIZ.start(customParams5);
            }
            case 6: {
                final CustomParams customParams6 = new CustomParams();
                customParams6.add(4, 00U.LIZJ, (int)00U.LJI);
                return this.LIZIZ.start(customParams6);
            }
            case 7: {
                final CustomParams customParams7 = new CustomParams();
                customParams7.add(7, 00U.LIZJ, (int)00U.LJI);
                return this.LIZIZ.start(customParams7);
            }
            case 8: {
                final CustomParams customParams8 = new CustomParams();
                customParams8.add(6, 00U.LIZJ, (int)00U.LJI);
                return this.LIZIZ.start(customParams8);
            }
            case 9: {
                if (00U.LIZJ > 5) {
                    00U.LIZJ = 5;
                }
                if (00U.LIZJ < 0) {
                    00U.LIZJ = 0;
                }
                final CustomParams customParams9 = new CustomParams();
                customParams9.add(9, 00U.LIZJ, 99999999);
                return this.LIZIZ.start(customParams9);
            }
            case 10: {
                if (00U.LJII == 00K.GOLD || 00U.LJII == 00K.SUPER) {
                    00s.LIZ(3);
                    final CustomParams customParams10 = new CustomParams();
                    customParams10.add(8, 1, 99999999);
                    return this.LIZIZ.start(customParams10);
                }
                00s.LIZ(3);
                final CustomParams customParams11 = new CustomParams();
                customParams11.add(8, 2, 99999999);
                return this.LIZIZ.start(customParams11);
            }
            case 11: {
                final 00V lizlll = 00U.LIZLLL;
                lizlll.LIZ.getDesc();
                00s.LIZ(4);
                switch (00Y.LIZIZ[lizlll.LIZ.ordinal()]) {
                    default: {
                        00s.LIZ(5);
                        break;
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
                        this.LIZ(0, 11n.LIZLLL);
                        this.LIZ(1, 11n.LIZLLL);
                        this.LIZ(2, 11n.LIZLLL);
                        break;
                    }
                }
                return 1;
            }
            case 12: {
                final CustomParams customParams12 = new CustomParams();
                customParams12.add(10, 00U.LIZJ, (int)00U.LJI);
                return this.LIZIZ.start(customParams12);
            }
        }
    }
    
    @Override
    public final boolean LIZ(final CapabilityType capabilityType) {
        final 002 lizj = this.LIZJ;
        return lizj != null && lizj.LIZ().contains(capabilityType);
    }
    
    @Override
    public final Object LIZIZ(final 00U 00U) {
        00s.LIZ(3);
        if (this.LIZIZ == null) {
            return null;
        }
        final int n = 00Y.LIZ[00U.LIZ.ordinal()];
        if (n == 10) {
            00s.LIZ(3);
            final CustomParams customParams = new CustomParams();
            customParams.add(8, 0, 99999999);
            return this.LIZIZ.start(customParams);
        }
        switch (n) {
            default: {
                return 0;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: {
                return this.LIZIZ.stop();
            }
        }
    }
}
