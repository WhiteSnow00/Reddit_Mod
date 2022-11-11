// 
// Decompiled by Procyon v0.6.0
// 

package X;

import org.json.JSONObject;
import com.bytedance.covode.number.Covode;

public final class 1jS extends 1Mk
{
    static {
        Covode.recordClassIndex(6715);
    }
    
    @Override
    public final void LIZ() {
        0d8.LIZ("ttlive_load_sticker_list_all", 0, this.LIZJ(), new JSONObject());
    }
    
    @Override
    public final void LIZ(final int n, final String s) {
        this.LIZJ();
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "error_code", n);
        0d3.LIZ(jsonObject, "error_msg", s);
        0d8.LIZIZ("ttlive_load_sticker_list_all", 1, jsonObject);
        0d8.LIZ("ttlive_load_sticker_list_error", 1, jsonObject);
        FyW.LIZ().LIZ(G0B.Room.info, "ttlive_load_sticker_list", 1, jsonObject);
    }
    
    @Override
    public final void LIZIZ() {
        0d8.LIZ("ttlive_download_sticker_all", 0, this.LIZLLL(), new JSONObject());
    }
    
    @Override
    public final void LIZIZ(final int n, final String s) {
        this.LIZLLL();
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "error_code", n);
        0d3.LIZ(jsonObject, "error_msg", s);
        0d8.LIZIZ("ttlive_download_sticker_all", 1, jsonObject);
        0d8.LIZ("ttlive_download_sticker_error", 1, jsonObject);
        FyW.LIZ().LIZ(G0B.Room.info, "ttlive_download_sticker", 1, jsonObject);
    }
}
