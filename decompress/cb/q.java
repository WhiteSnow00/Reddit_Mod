// 
// Decompiled by Procyon v0.6.0
// 

package cb;

import pb.a$b;
import ub.i;
import ub.e;
import pb.a;
import java.util.regex.Matcher;
import ad.c0;
import java.util.regex.Pattern;

public final class q
{
    public static final Pattern c;
    public int a;
    public int b;
    
    static {
        c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    }
    
    public q() {
        this.a = -1;
        this.b = -1;
    }
    
    public final boolean a(String group) {
        final Matcher matcher = q.c.matcher(group);
        if (!matcher.find()) {
            return false;
        }
        try {
            group = matcher.group(1);
            final int a = c0.a;
            final int int1 = Integer.parseInt(group, 16);
            final int int2 = Integer.parseInt(matcher.group(2), 16);
            if (int1 > 0 || int2 > 0) {
                this.a = int1;
                this.b = int2;
                return true;
            }
            return false;
        }
        catch (final NumberFormatException ex) {
            return false;
        }
    }
    
    public final void b(final a a) {
        int n = 0;
        while (true) {
            final a$b[] f = a.f;
            if (n >= f.length) {
                return;
            }
            final a$b a$b = f[n];
            if (a$b instanceof e) {
                final e e = (e)a$b;
                if ("iTunSMPB".equals(e.h) && this.a(e.i)) {
                    return;
                }
            }
            else if (a$b instanceof i) {
                final i i = (i)a$b;
                if ("com.apple.iTunes".equals(i.g) && "iTunSMPB".equals(i.h) && this.a(i.i)) {
                    return;
                }
            }
            ++n;
        }
    }
}
