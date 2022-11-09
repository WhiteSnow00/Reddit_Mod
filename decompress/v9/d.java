// 
// Decompiled by Procyon v0.6.0
// 

package v9;

import ak0.m;
import java.io.IOException;
import android.text.TextUtils;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.util.regex.Matcher;
import a40.f;
import java.util.regex.Pattern;

public final class d
{
    public static final Pattern d;
    public static final Pattern e;
    public final String a;
    public final long b;
    public final boolean c;
    
    static {
        d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");
        e = Pattern.compile("GET /(.*) HTTP");
    }
    
    public d(final String s) {
        s.getClass();
        final Matcher matcher = v9.d.d.matcher(s);
        long long1;
        if (matcher.find()) {
            long1 = Long.parseLong(matcher.group(1));
        }
        else {
            long1 = -1L;
        }
        this.b = Math.max(0L, long1);
        this.c = (long1 >= 0L);
        final Matcher matcher2 = v9.d.e.matcher(s);
        if (matcher2.find()) {
            this.a = matcher2.group(1);
            return;
        }
        throw new IllegalArgumentException(f.n("Invalid request `", s, "`: url not found!"));
    }
    
    public static d a(final InputStream inputStream) throws IOException {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final String line = bufferedReader.readLine();
            if (TextUtils.isEmpty((CharSequence)line)) {
                break;
            }
            sb.append(line);
            sb.append('\n');
        }
        return new d(sb.toString());
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("GetRequest{rangeOffset=");
        k.append(this.b);
        k.append(", partial=");
        k.append(this.c);
        k.append(", uri='");
        return m.m(k, this.a, '\'', '}');
    }
}
