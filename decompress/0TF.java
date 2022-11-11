// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.ArrayList;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import java.util.List;

public final class 0Tf
{
    public List<Integer> LIZ;
    public JSONArray LIZIZ;
    public String LIZJ;
    public JSONArray LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    
    static {
        Covode.recordClassIndex(4628);
    }
    
    public 0Tf(final JSONObject jsonObject) {
        this.LIZIZ = jsonObject.optJSONArray("cvv_length");
        this.LIZJ = jsonObject.optString("card_brand_regex");
        this.LIZLLL = jsonObject.optJSONArray("card_brand_length");
        this.LJ = jsonObject.optString("card_brand_display_name");
        this.LJFF = jsonObject.optString("card_brand");
        this.LJI = jsonObject.optString("payment_method_id");
    }
    
    public final List<Integer> LIZ() {
        Label_0065: {
            if (this.LIZ != null) {
                break Label_0065;
            }
            this.LIZ = new ArrayList<Integer>();
            if (this.LIZIZ == null) {
                break Label_0065;
            }
            int n = 0;
        Label_0059_Outer:
            while (true) {
                if (n >= this.LIZIZ.length()) {
                    break Label_0065;
                }
                while (true) {
                    try {
                        this.LIZ.add((Integer)this.LIZIZ.get(n));
                        ++n;
                        continue Label_0059_Outer;
                        return this.LIZ;
                    }
                    finally {
                        continue;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("{mCvvLength=");
        sb.append(this.LIZIZ);
        sb.append(", mCardBrandRegex='");
        sb.append(this.LIZJ);
        sb.append('\'');
        sb.append(", mCardBrandLength=");
        sb.append(this.LIZLLL);
        sb.append(", mCardBrandDisplayName='");
        sb.append(this.LJ);
        sb.append('\'');
        sb.append(", mCardBrand='");
        sb.append(this.LJFF);
        sb.append('\'');
        sb.append(", mPaymentMethodId='");
        sb.append(this.LJI);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
