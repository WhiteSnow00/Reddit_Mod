// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import android.os.Build$VERSION;
import kotlin.jvm.internal.n;
import java.util.concurrent.ExecutorService;
import android.text.TextUtils;
import org.json.JSONObject;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import android.view.View;
import android.util.Pair;
import java.util.List;
import android.content.Context;

public final class 1hk extends 1Dl
{
    public static volatile 1hk LJIIIZ;
    public boolean LIZ;
    public Context LIZIZ;
    public 1Dn LIZJ;
    public 1Dh LIZLLL;
    public 0Rf LJ;
    public 0Re LJFF;
    public 0Rd LJI;
    public 0Rp LJII;
    public 0Rs LJIIIIZZ;
    public List<Pair<View, 0Rj>> LJIIJ;
    
    static {
        Covode.recordClassIndex(4450);
    }
    
    public 1hk() {
        this.LJIIJ = Collections.synchronizedList(new ArrayList<Pair<View, 0Rj>>());
        this.LIZLLL = new 1Dh();
        this.LJ = new 0Rf();
    }
    
    public static 1hk LIZLLL() {
        MethodCollector.i(6930);
        if (1hk.LJIIIZ == null) {
            monitorenter(1hk.class);
            try {
                if (1hk.LJIIIZ == null) {
                    1hk.LJIIIZ = new 1hk();
                }
                monitorexit(1hk.class);
            }
            finally {
                monitorexit(1hk.class);
                MethodCollector.o(6930);
            }
        }
        final 1hk ljiiiz = 1hk.LJIIIZ;
        MethodCollector.o(6930);
        return ljiiiz;
    }
    
    @Override
    public final void LIZ(final 0Rd lji) {
        this.LJI = lji;
    }
    
    @Override
    public final void LIZ(final 0Rp ljii) {
        this.LJII = ljii;
    }
    
    @Override
    public final void LIZ(final 1Dk 1Dk) {
        if (1Dk == null) {
            return;
        }
        Object liz = 1hj.LIZ();
        final String ljiij = 1Dk.LJIIJ;
        ljiij.hashCode();
        final int hashCode = ljiij.hashCode();
        int size = 9;
        final int n = 0;
        Label_0127: {
            switch (hashCode) {
                case 1928152881: {
                    if (!ljiij.equals("play_valid")) {
                        break;
                    }
                    size = 4;
                    break Label_0127;
                }
                case 986870585: {
                    if (!ljiij.equals("cpv_15s")) {
                        break;
                    }
                    size = 10;
                    break Label_0127;
                }
                case 94750088: {
                    if (!ljiij.equals("click")) {
                        break;
                    }
                    size = 2;
                    break Label_0127;
                }
                case 3529469: {
                    if (!ljiij.equals("show")) {
                        break;
                    }
                    size = 0;
                    break Label_0127;
                }
                case 3443508: {
                    if (!ljiij.equals("play")) {
                        break;
                    }
                    size = 1;
                    break Label_0127;
                }
                case -493575223: {
                    if (!ljiij.equals("play_75")) {
                        break;
                    }
                    size = 8;
                    break Label_0127;
                }
                case -493575290: {
                    if (!ljiij.equals("play_50")) {
                        break;
                    }
                    size = 7;
                    break Label_0127;
                }
                case -493575378: {
                    if (!ljiij.equals("play_25")) {
                        break;
                    }
                    size = 6;
                    break Label_0127;
                }
                case -1353638573: {
                    if (!ljiij.equals("cpv_6s")) {
                        break;
                    }
                    break Label_0127;
                }
                case -1877652737: {
                    if (!ljiij.equals("play_over")) {
                        break;
                    }
                    size = 5;
                    break Label_0127;
                }
            }
            size = -1;
        }
        final List<String> ljff = 1Dk.LJFF;
        int size2;
        if (ljff != null) {
            size2 = ljff.size();
        }
        else {
            size2 = 0;
        }
        final JSONObject jsonObject = new JSONObject();
        while (true) {
            try {
                jsonObject.putOpt("url_count", (Object)size2);
                ((1Dm)liz).LIZ("host_c2s_track_trigger", size, jsonObject, null);
                if (1Dk.LJFF != null && !1Dk.LJFF.isEmpty()) {
                    liz = new JSONObject();
                    size = n;
                    if (1Dk.LJFF != null) {
                        size = 1Dk.LJFF.size();
                    }
                    0Rt.LIZ((JSONObject)liz, "track_url_size", size);
                    0Rt.LIZ("start_track", 1Dk, (JSONObject)liz);
                    if (this.LIZ) {
                        this.LJ.LIZ(null, 1Dk);
                        return;
                    }
                    1Dk.LIZ();
                    this.LJIIJ.add((Pair<View, 0Rj>)Pair.create((Object)null, (Object)1Dk));
                }
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final void LIZ(final 1Dn lizj) {
        if (!this.LIZ) {
            return;
        }
        this.LIZJ = lizj;
        if (LIZLLL().LIZIZ()) {
            0Rg.LIZ(new 1hi());
        }
    }
    
    @Override
    public final void LIZ(final 1Do 1Do) {
        if (!this.LIZ) {
            return;
        }
        if (1Do != null && !TextUtils.isEmpty((CharSequence)1Do.LIZIZ())) {
            0Rg.LIZ(new 1hh(1Do));
        }
    }
    
    @Override
    public final void LIZ(final Context context, final 1Dn lizj) {
        if (this.LIZ) {
            return;
        }
        if (context != null && lizj != null) {
            Object liziz = context.getApplicationContext();
            if (5WL.LIZIZ) {
                if (liziz == null) {
                    liziz = 5WL.LIZ;
                }
            }
            this.LIZIZ = (Context)liziz;
            this.LJFF = new 1Di(context, "byte_ad_tracker_preferences");
            this.LIZJ = lizj;
            this.LIZ = true;
        }
    }
    
    @Override
    public final void LIZ(final ExecutorService liz) {
        if (liz != 0Rg.LIZ && 0Rg.LIZ != null) {
            0Rg.LIZ.shutdown();
        }
        0Rg.LIZ = liz;
    }
    
    @Override
    public final boolean LIZ() {
        return this.LIZ;
    }
    
    @Override
    public final boolean LIZIZ() {
        return this.LIZ && this.LIZJ.LJ;
    }
    
    @Override
    public final void LIZJ() {
        final List<Pair<View, 0Rj>> ljiij = this.LJIIJ;
        if (ljiij != null && !ljiij.isEmpty()) {
            for (final Pair pair : this.LJIIJ) {
                this.LJ.LIZ((View)pair.first, (0Rj)pair.second);
            }
            this.LJIIJ.clear();
        }
        if (0Rm.LIZ.compareAndSet(false, true)) {
            final 1hk lizlll = LIZLLL();
            n.LIZ((Object)lizlll, "");
            final 0Rp ljii = lizlll.LJII;
            final JSONObject putOpt = new JSONObject().putOpt("sdk_aid", (Object)2705).putOpt("sdk_version", (Object)"1.6.0-i18n");
            final Object o = null;
            String s;
            if (ljii != null) {
                s = "";
            }
            else {
                s = null;
            }
            final JSONObject putOpt2 = putOpt.putOpt("app_version", (Object)s);
            Object o2 = o;
            if (ljii != null) {
                o2 = "";
            }
            final JSONObject putOpt3 = putOpt2.putOpt("update_version_code", o2).putOpt("os_version", (Object)Build$VERSION.RELEASE);
            final 1hk lizlll2 = LIZLLL();
            n.LIZ((Object)lizlll2, "");
            final 0Rd lji = lizlll2.LJI;
            if (lji != null) {
                lji.LIZ("sdk_session_launch", putOpt3);
            }
        }
    }
}
