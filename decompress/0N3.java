// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.benchmark.IBTCHConfiguration;
import org.json.JSONException;
import org.json.JSONObject;
import com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl;
import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.bytedance.covode.number.Covode;

public final class 0N3
{
    public static volatile boolean LIZ;
    
    static {
        Covode.recordClassIndex(2930);
    }
    
    public static boolean LIZ() {
        final IPluginService lizj = AabPluginServiceImpl.LIZJ();
        return lizj != null && lizj.LIZ("com.ss.android.ugc.aweme.benchmark");
    }
    
    public static boolean LIZ(final Context context) {
        return LIZ() && context != null && AabPluginServiceImpl.LIZJ().LIZIZ().LIZ(context);
    }
    
    public static final class a implements U8I
    {
        public Runnable LIZ;
        
        static {
            Covode.recordClassIndex(2931);
        }
        
        public a(final Runnable liz) {
            this.LIZ = liz;
        }
        
        public final void LIZ(final String s, final boolean b) {
            System.currentTimeMillis();
            final IPluginService lizj = AabPluginServiceImpl.LIZJ();
            if (lizj == null) {
                return;
            }
            Label_0067: {
                Context context;
                if ((context = 0NJ.LJIILJJIL.LIZ) == null) {
                    final IBTCHConfiguration ibtchConfigurationbyMonsterPlugin = BTCHConfigurationImpl.createIBTCHConfigurationbyMonsterPlugin(false);
                    if (ibtchConfigurationbyMonsterPlugin == null) {
                        break Label_0067;
                    }
                    context = ibtchConfigurationbyMonsterPlugin.getByteBenchConfig().LIZ;
                    if (context == null) {
                        break Label_0067;
                    }
                }
                0N3.LIZ = lizj.LIZIZ().LIZ(context);
            }
            final Runnable liz = this.LIZ;
            if (liz != null) {
                liz.run();
            }
            final JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("result", (Object)"succeed");
                jsonObject.put("ret", 0);
                0Mu.LIZ("bytebench_df_install_result", jsonObject);
            }
            catch (final JSONException ex) {}
        }
        
        public final void LIZ(final String s, final boolean b, final int n) {
            final JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("result", (Object)"failed");
                jsonObject.put("ret", n);
                0Mu.LIZ("bytebench_df_install_result", jsonObject);
            }
            catch (final JSONException ex) {}
        }
    }
    
    public static final class b implements UV8
    {
        public long LIZ;
        
        static {
            Covode.recordClassIndex(2932);
        }
        
        public b() {
            this.LIZ = System.currentTimeMillis();
        }
        
        public final void LIZ(final int n) {
            final JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("is_silent", false);
                jsonObject.put("status", (Object)"Permission Dialog Result");
                if (n == -1) {
                    jsonObject.put("permission_dialog_result", (Object)"OK");
                }
                else {
                    jsonObject.put("permission_dialog_result", (Object)"not OK");
                }
                0Mu.LIZ("bytebench_df_download_information", jsonObject);
            }
            catch (final JSONException ex) {}
        }
        
        public final void LIZ(final boolean b) {
            final JSONObject jsonObject = new JSONObject();
            this.LIZ = System.currentTimeMillis();
            try {
                jsonObject.put("is_silent", b);
                jsonObject.put("status", (Object)"install start");
                0Mu.LIZ("bytebench_df_download_information", jsonObject);
            }
            catch (final JSONException ex) {}
        }
        
        public final void LIZ(final boolean b, final long n, final long n2) {
            final JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("is_silent", b);
                jsonObject.put("status", (Object)"downloading");
                jsonObject.put("bytes_downloaded", n);
                jsonObject.put("totalBytesToDownload", n2);
                0Mu.LIZ("bytebench_df_download_information", jsonObject);
            }
            catch (final JSONException ex) {}
        }
        
        public final void LIZIZ(final boolean b) {
            final JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("is_silent", b);
                jsonObject.put("status", (Object)"installing");
                0Mu.LIZ("bytebench_df_download_information", jsonObject);
            }
            catch (final JSONException ex) {}
        }
        
        public final void LIZJ(final boolean b) {
            final JSONObject jsonObject = new JSONObject();
            try {
                jsonObject.put("is_silent", b);
                jsonObject.put("status", (Object)"install end");
                jsonObject.put("cost_time", System.currentTimeMillis() - this.LIZ);
                0Mu.LIZ("bytebench_df_download_information", jsonObject);
            }
            catch (final JSONException ex) {}
        }
    }
}
