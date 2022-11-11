// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Collection;
import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONArray;
import android.os.SystemClock;
import java.util.ArrayList;
import com.bytedance.covode.number.Covode;
import java.util.List;

public final class 1Dx extends 0Ro
{
    public boolean LIZ;
    public int LIZIZ;
    public List<String> LIZJ;
    public List<String> LIZLLL;
    public List<String> LJFF;
    public 0Sk LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public List<String> LJIIIZ;
    
    static {
        Covode.recordClassIndex(4557);
    }
    
    public 1Dx(final a a) {
        this.LIZ = true;
        this.LIZJ = 0Sr.LIZ(true);
        this.LIZLLL = 0Sr.LIZ(false);
        this.LJFF = new ArrayList<String>();
        this.LJII = 10000;
        this.LJIIIIZZ = true;
        this.LJIIIZ = new ArrayList<String>();
        super.LJ = a.LIZ;
        this.LIZIZ = a.LIZIZ;
        this.LJI = a.LIZJ;
        SystemClock.uptimeMillis();
    }
    
    public static void LIZ(final JSONArray jsonArray, final List<String> list) {
        if (jsonArray != null && list != null) {
            int i = 0;
            try {
                while (i < jsonArray.length()) {
                    final Object value = jsonArray.get(i);
                    if (value instanceof String) {
                        list.add((String)value);
                    }
                    ++i;
                }
            }
            catch (final JSONException ex) {
                0II.LIZ((Exception)ex);
            }
        }
    }
    
    @Override
    public final void LIZ(final JSONObject jsonObject) {
        super.LIZ(jsonObject);
        if (jsonObject == null) {
            return;
        }
        boolean ljiiiizz = false;
        try {
            this.LIZ = this.LIZ(jsonObject, "store_when_offline", true);
            this.LIZIZ = jsonObject.optInt("android_store_impl", 0);
            if (this.LIZJ == null) {
                this.LIZJ = new ArrayList<String>();
            }
            this.LIZJ.clear();
            final JSONArray optJSONArray = jsonObject.optJSONArray("macro_standard");
            if (optJSONArray != null) {
                LIZ(optJSONArray, this.LIZJ);
                0Sr.LIZ(this.LIZJ);
            }
            else {
                this.LIZJ.addAll(0Sr.LIZ(true));
            }
            if (this.LIZLLL == null) {
                this.LIZLLL = new ArrayList<String>();
            }
            this.LIZLLL.clear();
            final JSONArray optJSONArray2 = jsonObject.optJSONArray("macro_non_standard");
            if (optJSONArray2 != null) {
                LIZ(optJSONArray2, this.LIZLLL);
                0Sr.LIZ(this.LIZLLL);
            }
            else {
                this.LIZLLL.addAll(0Sr.LIZ(false));
            }
            if (this.LJFF == null) {
                this.LJFF = new ArrayList<String>();
            }
            this.LJFF.clear();
            LIZ(jsonObject.optJSONArray("macro_blocklist"), this.LJFF);
            this.LJII = jsonObject.optInt("request_timeout", 10000);
            this.LJIIIZ.clear();
            LIZ(jsonObject.optJSONArray("redirect_blocklist"), this.LJIIIZ);
        }
        finally {
            final Throwable t;
            t.getMessage();
        }
        SystemClock.uptimeMillis();
        if (jsonObject.optInt("enable_url_encode_compat", 1) == 1) {
            ljiiiizz = true;
        }
        this.LJIIIIZZ = ljiiiizz;
    }
    
    public static final class a
    {
        public boolean LIZ;
        public int LIZIZ;
        public 0Sk LIZJ;
        
        static {
            Covode.recordClassIndex(4559);
        }
        
        public a() {
            this.LIZ = true;
        }
    }
}
