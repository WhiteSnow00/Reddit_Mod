// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ammt.mmt.impl.GraphicMMTPlugin;
import com.bytedance.ammt.mmt.impl.NativeMMTPlugin;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import android.content.BroadcastReceiver;

public final class 0Qh extends BroadcastReceiver
{
    public static String LIZ;
    public static String LIZIZ;
    
    static {
        Covode.recordClassIndex(4348);
        0Qh.LIZ = "com.bytedance.ammt.mmt.DUMP";
        0Qh.LIZIZ = "com.bytedance.ammt.mmt.START";
    }
    
    public static String LIZ(final Intent intent, final String s) {
        try {
            return intent.getStringExtra(s);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        if ("com.bytedance.ammt.mmt.DUMP".equals(intent.getAction())) {
            if (LIZ(intent, "type").equals("native")) {
                final NativeMMTPlugin lizj = NativeMMTPlugin.LIZJ();
                if (lizj != null && lizj.LIZ) {
                    0Qg.LIZ();
                    final String liziz = 0Qg.LIZIZ(context);
                    final String liz = LIZ(intent, "output");
                    if (liz != null) {
                        lizj.LIZ(liziz, liz);
                    }
                    lizj.LIZIZ();
                }
            }
            if (LIZ(intent, "type").equals("graphic")) {
                final GraphicMMTPlugin lizj2 = GraphicMMTPlugin.LIZJ();
                if (lizj2 != null && lizj2.LIZ) {
                    0Qg.LIZ();
                    final String liziz2 = 0Qg.LIZIZ(context);
                    final String liz2 = LIZ(intent, "output");
                    if (liz2 != null) {
                        lizj2.LIZ(liziz2, liz2);
                    }
                    lizj2.LIZIZ();
                }
            }
        }
    }
}
