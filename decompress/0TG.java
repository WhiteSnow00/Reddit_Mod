// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

public class 0Tg
{
    public JSONObject LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    
    static {
        Covode.recordClassIndex(4634);
    }
    
    public 0Tg() {
    }
    
    public 0Tg(final String s) {
        try {
            final JSONObject jsonObject = new JSONObject(s);
            final Object value = jsonObject.get("response");
            if (value instanceof JSONObject) {
                this.LIZ = (JSONObject)value;
            }
            else if (value instanceof String) {
                this.LIZ = new JSONObject((String)value);
            }
            this.LIZLLL = this.LIZ.optString("error_code");
            this.LJ = this.LIZ.optString("error_message");
            this.LIZJ = this.LIZ.optString("result_code");
            this.LIZIZ = jsonObject.optString("sign");
        }
        finally {}
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseResponse{mResponseJsonObject=");
        sb.append(this.LIZ);
        sb.append(", mSign='");
        sb.append(this.LIZIZ);
        sb.append('\'');
        sb.append(", mResultCode='");
        sb.append(this.LIZJ);
        sb.append('\'');
        sb.append(", mErrorCode='");
        sb.append(this.LIZLLL);
        sb.append('\'');
        sb.append(", mErrorMessage='");
        sb.append(this.LJ);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
