// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.Intent;
import com.bytedance.android.ecommerce.ocr.view.OcrActivity;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import com.bytedance.covode.number.Covode;
import android.content.Context;

public final class 1hz implements 1Eb
{
    public Context LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public 0Tw LJFF;
    
    static {
        Covode.recordClassIndex(4707);
    }
    
    public 1hz(final Context liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final 1E7 LIZ() {
        final 1E7 1e7 = new 1E7(this.LIZJ, this.LIZLLL);
        final TimeZone timeZone = TimeZone.getTimeZone("gmt");
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        1e7.LIZIZ = simpleDateFormat.format(new Date());
        1e7.LIZ = this.LIZIZ;
        return 1e7;
    }
    
    @Override
    public final void LIZ(final int n, final int n2, final String s, final 1EA 1ea) {
        final 0Tw ljff = this.LJFF;
        if (ljff != null) {
            ljff.LIZ(n, n2, s, 1ea);
        }
        this.LJFF = null;
        this.LJ = false;
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LIZLLL = "";
    }
    
    @Override
    public final void LIZ(final String lizlll) {
        this.LIZLLL = lizlll;
    }
    
    @Override
    public final void LIZ(final String liziz, final String lizj, final String lizlll, final 0Tw ljff) {
        this.LJFF = ljff;
        if (this.LJ) {
            this.LIZ(0, 102, "The ocr service is running, please do not repeat it!", null);
            return;
        }
        if (!0UX.LIZ(this.LIZ)) {
            this.LIZ(0, 106, "Network un available!", null);
            return;
        }
        this.LJ = true;
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        try {
            final Intent intent = new Intent(this.LIZ, (Class)OcrActivity.class);
            intent.setFlags(268435456);
            final Context liz = this.LIZ;
            Q0z.LIZ(intent, (Object)liz);
            0Qu.LIZ(intent, liz);
            liz.startActivity(intent);
        }
        finally {
            final StringBuilder sb = new StringBuilder("error to start ocr activity:");
            final Throwable t;
            sb.append(t.getMessage());
            this.LIZ(0, 103, sb.toString(), null);
        }
    }
}
