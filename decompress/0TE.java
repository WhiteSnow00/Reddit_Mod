// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONObject;
import java.util.ArrayList;
import android.util.Pair;
import java.util.List;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public abstract class 0Te
{
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public Map<String, String> LIZLLL;
    
    static {
        Covode.recordClassIndex(4629);
    }
    
    public final List<Pair<String, String>> LIZ() {
        final ArrayList list = new ArrayList();
        final String string = this.LIZIZ().toString();
        final int index = string.indexOf("nonce");
        String string2 = string;
        if (index > 0) {
            final String substring = string.substring(0, index);
            final StringBuilder sb = new StringBuilder();
            sb.append(substring);
            sb.append("nonce\":\"");
            final String string3 = sb.toString();
            final String substring2 = string.substring(index + 8);
            final int index2 = substring2.indexOf("\"");
            final String substring3 = substring2.substring(0, index2);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string3);
            sb2.append(substring3.replace("\\/", "/"));
            sb2.append(substring2.substring(index2));
            string2 = sb2.toString();
        }
        list.add(new Pair((Object)"biz_content", (Object)string2));
        final String liz = this.LIZ;
        final String s = "";
        String s2;
        if ((s2 = liz) == null) {
            s2 = "";
        }
        list.add(new Pair((Object)"merchant_id", (Object)s2));
        String liziz;
        if ((liziz = this.LIZIZ) == null) {
            liziz = "";
        }
        list.add(new Pair((Object)"request_time", (Object)liziz));
        String lizj = this.LIZJ;
        if (lizj == null) {
            lizj = s;
        }
        list.add(new Pair((Object)"sign", (Object)lizj));
        return list;
    }
    
    public abstract JSONObject LIZIZ();
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BaseRequest{, mMerchantId='");
        sb.append(this.LIZ);
        sb.append('\'');
        sb.append(", mRequestTime='");
        sb.append(this.LIZIZ);
        sb.append('\'');
        sb.append(", mSign='");
        sb.append(this.LIZJ);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
