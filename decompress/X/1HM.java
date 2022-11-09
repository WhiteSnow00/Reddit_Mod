// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import java.util.ArrayList;
import android.view.View;
import org.json.JSONObject;
import java.util.HashMap;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;

public final class 1hm extends 1Do<1Dx>
{
    public 1Dx LIZ;
    public a LIZIZ;
    public 0Su LIZJ;
    public 0Sn LIZLLL;
    
    static {
        Covode.recordClassIndex(4539);
    }
    
    public 1hm(final a liziz) {
        this.LIZIZ = liziz;
    }
    
    private void LIZ(final 1Dk 1Dk, final boolean b) {
        final List<String> ljff = 1Dk.LJFF;
        if (b || 1Dk.LIZIZ()) {
            this.LIZJ.LIZIZ(1Dk);
        }
        if (!1Dk.LIZIZ()) {
            for (int i = 0; i < ljff.size(); ++i) {
                final String s = ljff.get(i);
                SystemClock.uptimeMillis();
                this.LIZLLL.LIZ(s, 1Dk);
                SystemClock.uptimeMillis();
            }
            return;
        }
        0Rt.onEventExpired(1Dk);
    }
    
    private void LIZ(final boolean b) {
        if (!this.LIZ.LJ) {
            return;
        }
        final List<1Dk> lizj = this.LIZJ.LIZJ();
        if (lizj != null && !lizj.isEmpty()) {
            1hq.LIZ().LIZIZ();
            int n = 0;
            for (final 1Dk 1Dk : lizj) {
                if (!b || 1Dk.LJIIL) {
                    if (n == 0 && 0Rx.LIZ.LIZ()) {
                        this.LIZ(1Dk, true);
                    }
                    else {
                        ++1Dk.LJIIIZ;
                        this.LIZJ.LIZJ(1Dk);
                        n = 1;
                    }
                }
            }
        }
    }
    
    @Override
    public final void LIZ() {
        final 1Dn lizj = 1hk.LIZLLL().LIZJ;
        if (lizj != null) {
            final String liziz = this.LIZIZ();
            if (!TextUtils.isEmpty((CharSequence)liziz)) {
                if (lizj.LIZLLL == null) {
                    lizj.LIZLLL = new HashMap<String, JSONObject>();
                }
                final JSONObject jsonObject = lizj.LIZLLL.get(liziz);
                if (jsonObject != null) {
                    this.LIZ.LIZ(jsonObject);
                    this.LIZJ.LIZ(this.LIZ.LIZIZ);
                }
            }
        }
    }
    
    @Override
    public final void LIZ(final View view, final 0Rj 0Rj) {
        if (!(0Rj instanceof 1Dk)) {
            if (0Rj != null) {
                0Rj.getClass().getName();
            }
            return;
        }
        if (!this.LIZ.LJ) {
            return;
        }
        final 1Dk 1Dk = (1Dk)0Rj;
        final List<String> ljff = 1Dk.LJFF;
        if (ljff != null) {
            final ArrayList list = new ArrayList();
            for (final String s : ljff) {
                if (!TextUtils.isEmpty((CharSequence)s)) {
                    if (s.startsWith("http://")) {
                        continue;
                    }
                    if (s.startsWith("https://")) {
                        continue;
                    }
                }
                list.add(s);
            }
            ljff.removeAll(list);
            if (!ljff.isEmpty()) {
                1Dk.LJFF = ljff;
                1hq.LIZ().LIZ("c2s_network_type_on_trigger", 0Rx.LIZ.LIZIZ(), null);
                if (!0Rx.LIZ.LIZ()) {
                    if (this.LIZ.LIZ) {
                        ++1Dk.LJIIIZ;
                        this.LIZJ.LIZ(1Dk);
                    }
                    return;
                }
                this.LIZ(1Dk, false);
            }
        }
    }
    
    @Override
    public final String LIZIZ() {
        return "c2s";
    }
    
    @Override
    public final void LIZJ() {
        final 1Dx.a a = new 1Dx.a();
        a.LIZ = this.LIZIZ.LIZ;
        a.LIZJ = this.LIZIZ.LIZIZ;
        this.LIZ = new 1Dx(a, (byte)0);
        this.LIZLLL = new 0Sn(this, this.LIZIZ.LIZJ);
        this.LIZJ = new 1Dz(this);
    }
    
    @Override
    public final void LIZLLL() {
        this.LIZ(false);
    }
    
    @Override
    public final void LJ() {
        this.LIZ(true);
    }
    
    public static final class a
    {
        public boolean LIZ;
        public 0Sk LIZIZ;
        public List<0Sm> LIZJ;
        
        static {
            Covode.recordClassIndex(4540);
        }
        
        public a() {
            this.LIZ = true;
        }
        
        public final a LIZ(final 0Sm... array) {
            if (this.LIZJ == null) {
                this.LIZJ = new ArrayList<0Sm>();
            }
            int n = 0;
            do {
                final 0Sm 0Sm = array[0];
                if (0Sm != null) {
                    this.LIZJ.add(0Sm);
                }
            } while (++n <= 0);
            return this;
        }
        
        public final 1hm LIZ() {
            return new 1hm(this, (byte)0);
        }
    }
}
