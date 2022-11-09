// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import android.text.TextUtils;
import android.os.Build;
import java.util.Collections;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import android.ss.com.vboost.VboostListener;
import java.util.List;
import java.util.Map;
import android.content.Context;

public class 00O
{
    public static 00r<Context> LIZ;
    public static boolean LIZIZ;
    public static Map<String, Boolean> LIZLLL;
    public 00T LIZJ;
    public 00T LJ;
    public 00r<List<VboostListener.a>> LJFF;
    
    static {
        Covode.recordClassIndex(36);
        00O.LIZ = new 11j();
        final Boolean value = true;
        00O.LIZIZ = true;
        final HashMap hashMap = new HashMap();
        hashMap.put(00u.a.SS.name(), value);
        hashMap.put(00u.a.CHRY.name(), value);
        hashMap.put(00u.a.OP.name(), value);
        hashMap.put(00u.a.VO.name(), value);
        hashMap.put(00u.a.XM.name(), value);
        00O.LIZLLL = (Map<String, Boolean>)Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public 00O() {
        this.LJFF = new 11k();
        if (00O.LIZIZ) {
            if (this.LJ == null) {
                final String manufacturer = Build.MANUFACTURER;
                00u.a a;
                if (!TextUtils.isEmpty((CharSequence)manufacturer) && manufacturer.contains("samsung")) {
                    a = 00u.a.SS;
                }
                else {
                    final String liz = 00u.LIZ("ro.product.brand");
                    if (!TextUtils.isEmpty((CharSequence)liz) && liz.toLowerCase().contains("oppo")) {
                        a = 00u.a.OP;
                    }
                    else {
                        final String liz2 = 00u.LIZ("ro.vivo.os.name");
                        if (!TextUtils.isEmpty((CharSequence)liz2) && liz2.toLowerCase().contains("funtouch")) {
                            a = 00u.a.VO;
                        }
                        else {
                            a = 00u.a.UNKNOWN;
                        }
                    }
                }
                00s.LIZ(3);
                if (00p.LIZ()) {
                    try {
                        final JSONObject jsonObject = new JSONObject();
                        jsonObject.put("vendor", (Object)a.name());
                        00p.LIZ("vboost_event_launch", jsonObject, "behavior");
                    }
                    catch (final JSONException ex) {
                        0II.LIZ((Exception)ex);
                    }
                }
                final int n = 00M.LIZ[a.ordinal()];
                if (n != 1) {
                    if (n != 2) {
                        if (n != 3) {
                            if (n != 4) {
                                00s.LIZ(5);
                            }
                            else if (00O.LIZLLL.containsKey(00u.a.VO.name())) {
                                if (00O.LIZLLL.get(00u.a.VO.name())) {
                                    this.LJ = new 11p(00O.LIZ.LIZIZ());
                                }
                                else {
                                    00O.LIZLLL.get(00u.a.VO.name());
                                    00s.LIZ(4);
                                }
                            }
                            else {
                                this.LJ = new 11p(00O.LIZ.LIZIZ());
                            }
                        }
                        else if (00O.LIZLLL.containsKey(00u.a.OP.name())) {
                            if (00O.LIZLLL.get(00u.a.OP.name())) {
                                this.LJ = new 11l(00O.LIZ.LIZIZ());
                            }
                            else {
                                00O.LIZLLL.get(00u.a.OP.name());
                                00s.LIZ(4);
                            }
                        }
                        else {
                            this.LJ = new 11l(00O.LIZ.LIZIZ());
                        }
                    }
                    else if (00O.LIZLLL.containsKey(00u.a.CHRY.name())) {
                        if (00O.LIZLLL.get(00u.a.CHRY.name())) {
                            00O.LIZ.LIZIZ();
                            this.LJ = new 11i();
                        }
                        else {
                            00O.LIZLLL.get(00u.a.CHRY.name());
                            00s.LIZ(4);
                        }
                    }
                    else {
                        this.LJ = new 11n(00O.LIZ.LIZIZ());
                    }
                }
                else if (00O.LIZLLL.containsKey(00u.a.SS.name())) {
                    if (00O.LIZLLL.get(00u.a.SS.name())) {
                        this.LJ = new 11n(00O.LIZ.LIZIZ());
                    }
                    else {
                        00O.LIZLLL.get(00u.a.SS.name());
                        00s.LIZ(4);
                    }
                }
                else {
                    this.LJ = new 11n(00O.LIZ.LIZIZ());
                }
            }
        }
        else {
            00s.LIZ(4);
        }
        this.LIZJ = new 11m(00O.LIZ.LIZIZ());
    }
    
    public static 00O LIZ() {
        if (00O.LIZ.LIZIZ() == null) {
            00s.LIZ(5);
            return null;
        }
        return a.LIZ;
    }
    
    private 00U LIZLLL(final 00f 00f) {
        final 00U ljiji = new 00U(00f.LIZ);
        00f.LJIJI = ljiji;
        switch (00M.LIZIZ[ljiji.LIZ.ordinal()]) {
            default: {
                return null;
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8: {
                final 00T lj = this.LJ;
                if (lj != null && lj.LIZ(ljiji.LIZ) && this.LIZJ.LIZ(ljiji.LIZ)) {
                    final 00P 00P = 00X.a.LIZ.LIZ(00S.VENDOR, ljiji.LIZ).get(00f.LIZIZ);
                    if (00P == null) {
                        00s.LIZ(5);
                        return null;
                    }
                    if (00f.LIZJ > 00P.LIZJ) {
                        final 00w liziz = 00f.LIZIZ;
                        if ((int)00f.LIZJ - 00P.LIZJ > 00P.LJ && liziz.ordinal() > 00P.LJFF) {
                            final 00P 00P2 = 00X.a.LIZ.LIZ(00S.VENDOR, ljiji.LIZ).get(00P.LIZLLL);
                            if (00P2 == null) {
                                00s.LIZ(5);
                                return null;
                            }
                            ljiji.LJI = 00f.LIZJ;
                            ljiji.LIZJ = 00P2.LIZ;
                            00T liziz2;
                            if (00P2.LIZIZ == 00S.PLATFORM) {
                                liziz2 = this.LIZJ;
                            }
                            else {
                                liziz2 = this.LJ;
                            }
                            ljiji.LIZIZ = liziz2;
                        }
                        else {
                            ljiji.LIZJ = 00P.LIZ;
                            ljiji.LJI = 00P.LIZJ;
                            00T liziz3;
                            if (00P.LIZIZ == 00S.PLATFORM) {
                                liziz3 = this.LIZJ;
                            }
                            else {
                                liziz3 = this.LJ;
                            }
                            ljiji.LIZIZ = liziz3;
                        }
                    }
                    else {
                        ljiji.LJI = 00f.LIZJ;
                        ljiji.LIZJ = 00P.LIZ;
                        00T liziz4;
                        if (00P.LIZIZ == 00S.PLATFORM) {
                            liziz4 = this.LIZJ;
                        }
                        else {
                            liziz4 = this.LJ;
                        }
                        ljiji.LIZIZ = liziz4;
                    }
                }
                else {
                    final 00T lj2 = this.LJ;
                    if (lj2 != null && lj2.LIZ(00f.LIZ)) {
                        ljiji.LIZIZ = this.LJ;
                        final 00P 00P3 = 00X.a.LIZ.LIZ(00S.VENDOR, ljiji.LIZ).get(00f.LIZIZ);
                        if (00P3 == null) {
                            00s.LIZ(5);
                            return null;
                        }
                        long lizj;
                        if (00f.LIZJ > 00P3.LIZJ) {
                            lizj = 00P3.LIZJ;
                        }
                        else {
                            lizj = 00f.LIZJ;
                        }
                        ljiji.LJI = lizj;
                        ljiji.LIZJ = 00P3.LIZ;
                    }
                    else {
                        if (!this.LIZJ.LIZ(00f.LIZ)) {
                            00s.LIZ(5);
                            return null;
                        }
                        ljiji.LIZIZ = this.LIZJ;
                        final 00P 00P4 = 00X.a.LIZ.LIZ(00S.PLATFORM, ljiji.LIZ).get(00f.LIZIZ);
                        if (00P4 == null) {
                            00s.LIZ(5);
                            return null;
                        }
                        long lizj2;
                        if (00f.LIZJ > 00P4.LIZJ) {
                            lizj2 = 00P4.LIZJ;
                        }
                        else {
                            lizj2 = 00f.LIZJ;
                        }
                        ljiji.LJI = lizj2;
                        ljiji.LIZJ = 00P4.LIZ;
                    }
                }
                return ljiji;
            }
            case 9: {
                ljiji.LJIIIIZZ = 00f.LIZLLL;
                ljiji.LJII = 00f.LJFF;
                final 00T lj3 = this.LJ;
                if (lj3 != null && lj3.LIZ(00f.LIZ)) {
                    ljiji.LIZIZ = this.LJ;
                }
                else {
                    ljiji.LIZIZ = this.LIZJ;
                }
                return ljiji;
            }
            case 10: {
                final 00P 00P5 = 00X.a.LIZ.LIZ(00S.PLATFORM, ljiji.LIZ).get(00f.LIZIZ);
                if (00P5 == null) {
                    00s.LIZ(5);
                    return null;
                }
                ljiji.LJIIIIZZ = 00f.LIZLLL;
                ljiji.LIZJ = 00P5.LIZ;
                00T liziz5;
                if (00P5.LIZIZ == 00S.PLATFORM) {
                    liziz5 = this.LIZJ;
                }
                else {
                    liziz5 = this.LJ;
                }
                ljiji.LIZIZ = liziz5;
                return ljiji;
            }
            case 11: {
                if (this.LIZJ.LIZ(ljiji.LIZ)) {
                    ljiji.LIZIZ = this.LIZJ;
                }
                else if (this.LJ.LIZ(ljiji.LIZ)) {
                    ljiji.LIZIZ = this.LJ;
                }
                ljiji.LIZLLL = new 00V(00f.LJI);
                if (00f.LJIIIZ) {
                    ljiji.LIZLLL.LIZIZ = 00z.END;
                }
                else {
                    ljiji.LIZLLL.LIZIZ = 00z.BEGIN;
                }
                return ljiji;
            }
            case 12: {
                if (this.LIZJ.LIZ(ljiji.LIZ)) {
                    ljiji.LIZIZ = this.LIZJ;
                }
                else if (this.LJ.LIZ(ljiji.LIZ)) {
                    ljiji.LIZIZ = this.LJ;
                }
                return ljiji;
            }
            case 13: {
                if (this.LIZJ.LIZ(ljiji.LIZ)) {
                    ljiji.LJ = 00f.LJII;
                    ljiji.LIZIZ = this.LIZJ;
                }
                else if (this.LJ.LIZ(ljiji.LIZ)) {
                    ljiji.LIZIZ = this.LJ;
                }
                return ljiji;
            }
            case 14: {
                if (this.LJ.LIZ(ljiji.LIZ)) {
                    ljiji.LJFF = 00f.LJIIIIZZ;
                    ljiji.LIZIZ = this.LJ;
                }
                return ljiji;
            }
        }
    }
    
    public final void LIZ(final Bundle bundle) {
        final Iterator iterator = this.LJFF.LIZIZ().iterator();
        while (iterator.hasNext()) {
            ((VboostListener.a)iterator.next()).LIZ(bundle);
        }
    }
    
    public final boolean LIZ(final 00f 00f) {
        final 00T lj = this.LJ;
        return (lj != null && lj.LIZ(00f.LIZ)) || this.LIZJ.LIZ(00f.LIZ);
    }
    
    public final Object LIZIZ(final 00f 00f) {
        final 00U lizlll = this.LIZLLL(00f);
        if (lizlll != null && lizlll.LIZIZ != null) {
            return lizlll.LIZIZ.LIZ(lizlll);
        }
        return null;
    }
    
    public final Object LIZJ(final 00f 00f) {
        00U 00U;
        if (00f.LJIIIZ) {
            00U = 00f.LJIJI;
        }
        else {
            00U = this.LIZLLL(00f);
        }
        if (00U != null && 00U.LIZIZ != null) {
            if (00U.LIZLLL != null) {
                00U.LIZLLL.LIZIZ = 00z.END;
            }
            return 00U.LIZIZ.LIZIZ(00U);
        }
        return null;
    }
    
    public static final class a
    {
        public static final 00O LIZ;
        
        static {
            Covode.recordClassIndex(40);
            LIZ = new 00O((byte)0);
        }
    }
}
