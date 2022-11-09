// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONException;
import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 1hy implements 1Ea
{
    static {
        Covode.recordClassIndex(4697);
    }
    
    private JSONObject LIZ() {
        final JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("sdk_version_name", (Object)"1.0.0-rc.11");
            jsonObject.put("sdk_version_code", 10000);
        }
        catch (final JSONException ex) {
            0II.LIZ((Exception)ex);
        }
        return jsonObject;
    }
    
    @Override
    public final void LIZ(final long n) {
        final JSONObject liz = this.LIZ();
        try {
            liz.put("param_duration", n);
        }
        catch (final JSONException ex) {
            0II.LIZ((Exception)ex);
        }
        this.LIZ("ecommerce_init", liz);
    }
    
    @Override
    public final void LIZ(final String s, final String s2, final 0U6 0u6, final String s3, final String s4, final int n, final long n2, final String s5) {
        final JSONObject liz = this.LIZ();
        try {
            liz.put("merchant_order_id", (Object)s);
            liz.put("param_payment_reference", (Object)s2);
            liz.put("order_status", (Object)0u6.getStatus());
            liz.put("error_code", (Object)s3);
            liz.put("error_message", (Object)s4);
            liz.put("try_times", n);
            liz.put("param_duration", n2);
            liz.put("param_response_str", (Object)s5);
        }
        catch (final JSONException ex) {
            0II.LIZ((Exception)ex);
        }
        this.LIZ("ecommerce_query", liz);
    }
    
    @Override
    public final void LIZ(final String s, final String s2, final String s3, final String s4, final String s5, final long n, final String s6) {
        final JSONObject liz = this.LIZ();
        try {
            liz.put("param_payment_method_id", (Object)s);
            liz.put("param_payment_reference", (Object)s2);
            liz.put("result_code", (Object)s3);
            liz.put("error_code", (Object)s4);
            liz.put("error_message", (Object)s5);
            liz.put("param_duration", n);
            liz.put("param_response_str", (Object)s6);
        }
        catch (final JSONException ex) {
            0II.LIZ((Exception)ex);
        }
        this.LIZ("ecommerce_pay", liz);
    }
    
    @Override
    public final void LIZ(final String s, final JSONObject jsonObject) {
        1EK.LIZ.LIZLLL().LJIIIZ.LIZ(s, jsonObject);
    }
}
