// 
// Decompiled by Procyon v0.6.0
// 

package qe2;

import org.json.JSONException;
import java.io.IOException;
import java.io.FileNotFoundException;
import p2.b;
import android.text.TextUtils;
import org.json.JSONObject;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import android.content.Context;
import io.branch.referral.Branch;

public final class f implements Runnable
{
    public final String f;
    public final Branch g;
    public final Context h;
    
    public f(final String f, final Branch g, final Context h) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final void run() {
        try {
            final StringBuilder sb = new StringBuilder();
            final BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(this.f)));
            while (true) {
                final String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
            bufferedReader.close();
            final JSONObject jsonObject = new JSONObject(sb.toString().trim());
            if (!TextUtils.isEmpty((CharSequence)jsonObject.toString())) {
                b.E(jsonObject, this.g, this.h);
                return;
            }
            throw new FileNotFoundException();
        }
        catch (final FileNotFoundException | IOException | JSONException ex) {}
    }
}
