// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.regex.Matcher;
import android.util.Base64;
import java.util.regex.Pattern;
import java.util.Scanner;
import com.bytedance.covode.number.Covode;

public final class f
{
    public String AFInAppEventParameterName;
    public String AFKeystoreWrapper;
    public String valueOf;
    public byte[] values;
    
    static {
        Covode.recordClassIndex(2693);
    }
    
    public f() {
    }
    
    public f(final String valueOf, final byte[] values, final String afInAppEventParameterName) {
        this.valueOf = valueOf;
        this.values = values;
        this.AFInAppEventParameterName = afInAppEventParameterName;
    }
    
    public f(final char[] array) {
        final Scanner scanner = new Scanner(new String(array));
        int int1 = 0;
        int int2 = 0;
        while (scanner.hasNextLine()) {
            final String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.valueOf = nextLine.substring(4).trim();
            }
            else if (nextLine.startsWith("version=")) {
                this.AFInAppEventParameterName = nextLine.substring(8).trim();
                final Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFInAppEventParameterName);
                if (!matcher.matches()) {
                    continue;
                }
                int1 = Integer.parseInt(matcher.group(1));
                int2 = Integer.parseInt(matcher.group(2));
            }
            else {
                if (!nextLine.startsWith("data=")) {
                    continue;
                }
                final String trim = nextLine.substring(5).trim();
                byte[] values;
                if (int1 <= 4 && int2 < 11) {
                    values = trim.getBytes();
                }
                else {
                    values = Base64.decode(trim, 2);
                }
                this.values = values;
            }
        }
        scanner.close();
    }
    
    public final byte[] values() {
        return this.values;
    }
}
